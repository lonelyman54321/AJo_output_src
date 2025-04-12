/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.NullnessCasts;
import com.google.common.collect.Ordering;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class TopKSelector {
    private final Object[] buffer;
    private int bufferSize;
    private final Comparator comparator;
    private final int k;
    private Object threshold;

    private TopKSelector(Comparator objectArray, int n3) {
        objectArray = (Comparator)Preconditions.checkNotNull(objectArray, "comparator");
        this.comparator = objectArray;
        this.k = n3;
        boolean bl2 = true;
        int n4 = n3 >= 0 ? 1 : 0;
        String string2 = "k (%s) must be >= 0";
        Preconditions.checkArgument(n4 != 0, string2, n3);
        n4 = -1 >>> 2;
        if (n3 > n4) {
            bl2 = false;
            objectArray = null;
        }
        Preconditions.checkArgument(bl2, "k (%s) must be <= Integer.MAX_VALUE / 2", n3);
        objectArray = new Object[IntMath.checkedMultiply(n3, 2)];
        this.buffer = objectArray;
        this.bufferSize = 0;
        this.threshold = null;
    }

    public static TopKSelector greatest(int n3) {
        Ordering ordering = Ordering.natural();
        return TopKSelector.greatest(n3, ordering);
    }

    public static TopKSelector greatest(int n3, Comparator comparator) {
        comparator = Ordering.from(comparator).reverse();
        TopKSelector topKSelector = new TopKSelector(comparator, n3);
        return topKSelector;
    }

    public static TopKSelector least(int n3) {
        Ordering ordering = Ordering.natural();
        return TopKSelector.least(n3, ordering);
    }

    public static TopKSelector least(int n3, Comparator comparator) {
        TopKSelector topKSelector = new TopKSelector(comparator, n3);
        return topKSelector;
    }

    private int partition(int n3, int n4, int n7) {
        Object object;
        Object object2 = NullnessCasts.uncheckedCastNullableTToT(this.buffer[n7]);
        Object object3 = this.buffer;
        object3[n7] = object = object3[n4];
        n7 = n3;
        while (n3 < n4) {
            object3 = this.comparator;
            object = NullnessCasts.uncheckedCastNullableTToT(this.buffer[n3]);
            int n8 = object3.compare(object, object2);
            if (n8 < 0) {
                this.swap(n7, n3);
                ++n7;
            }
            ++n3;
        }
        Object[] objectArray = this.buffer;
        objectArray[n4] = object3 = objectArray[n7];
        objectArray[n7] = object2;
        return n7;
    }

    private void swap(int n3, int n4) {
        Object object;
        Object[] objectArray = this.buffer;
        Object object2 = objectArray[n3];
        objectArray[n3] = object = objectArray[n4];
        objectArray[n4] = object2;
    }

    private void trim() {
        Object object;
        int n3 = this.k * 2 + -1;
        Object object2 = RoundingMode.CEILING;
        int n4 = IntMath.log2(n3, (RoundingMode)((Object)object2)) * 3;
        int n7 = 0;
        Object object3 = null;
        int n8 = 0;
        Comparator comparator = null;
        int n10 = 0;
        while (n7 < n3) {
            int n14;
            int n15 = n7 + n3 + 1 >>> 1;
            if ((n15 = this.partition(n7, n3, n15)) > (n14 = this.k)) {
                n3 = n15 += -1;
            } else {
                if (n15 >= n14) break;
                ++n7;
                n7 = Math.max(n15, n7);
                n10 = n15;
            }
            if (++n8 < n4) continue;
            object2 = this.buffer;
            comparator = this.comparator;
            Arrays.sort(object2, n7, ++n3, comparator);
            break;
        }
        this.bufferSize = n3 = this.k;
        this.threshold = object = NullnessCasts.uncheckedCastNullableTToT(this.buffer[n10]);
        while (++n10 < (n3 = this.k)) {
            object = this.comparator;
            object2 = NullnessCasts.uncheckedCastNullableTToT(this.buffer[n10]);
            n3 = object.compare(object2, object3 = NullnessCasts.uncheckedCastNullableTToT(this.threshold));
            if (n3 <= 0) continue;
            this.threshold = object = this.buffer[n10];
        }
    }

    public void offer(Object object) {
        int n3 = this.k;
        if (n3 == 0) {
            return;
        }
        int n4 = this.bufferSize;
        if (n4 == 0) {
            int n7;
            Object[] objectArray = this.buffer;
            n4 = 0;
            Object var5_7 = null;
            objectArray[0] = object;
            this.threshold = object;
            this.bufferSize = n7 = 1;
        } else if (n4 < n3) {
            int n8;
            Object object2 = this.buffer;
            this.bufferSize = n8 = n4 + 1;
            object2[n4] = object;
            object2 = this.comparator;
            Object object3 = NullnessCasts.uncheckedCastNullableTToT(this.threshold);
            n3 = object2.compare(object, object3);
            if (n3 > 0) {
                this.threshold = object;
            }
        } else {
            Object[] objectArray = this.comparator;
            Object object4 = NullnessCasts.uncheckedCastNullableTToT(this.threshold);
            n3 = objectArray.compare(object, object4);
            if (n3 < 0) {
                int n10;
                objectArray = this.buffer;
                n4 = this.bufferSize;
                this.bufferSize = n10 = n4 + 1;
                objectArray[n4] = object;
                int n14 = this.k * 2;
                if (n10 == n14) {
                    this.trim();
                }
            }
        }
    }

    public void offerAll(Iterable object) {
        object = object.iterator();
        this.offerAll((Iterator)object);
    }

    public void offerAll(Iterator iterator) {
        boolean bl2;
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            this.offer(e2);
        }
    }

    public List topK() {
        Object[] objectArray = this.buffer;
        int n3 = this.bufferSize;
        Object[] objectArray2 = this.comparator;
        int n4 = 0;
        Arrays.sort(objectArray, 0, n3, objectArray2);
        n3 = this.bufferSize;
        int n7 = this.k;
        if (n3 > n7) {
            Object object = this.buffer;
            n4 = ((Object[])object).length;
            Arrays.fill(object, n7, n4, null);
            this.bufferSize = n3 = this.k;
            objectArray2 = this.buffer;
            this.threshold = object = objectArray2[n3 += -1];
        }
        n3 = this.bufferSize;
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objectArray, n3)));
    }
}

