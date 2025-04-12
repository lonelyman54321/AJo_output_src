/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.ImmutableLongArray;
import java.util.Arrays;
import java.util.Collection;

public final class ImmutableLongArray$Builder {
    private long[] array;
    private int count = 0;

    public ImmutableLongArray$Builder(int n3) {
        long[] lArray = new long[n3];
        this.array = lArray;
    }

    private void ensureRoomFor(int n3) {
        int n4 = this.count + n3;
        long[] lArray = this.array;
        int n7 = lArray.length;
        if (n4 > n7) {
            n7 = lArray.length;
            n4 = ImmutableLongArray$Builder.expandedCapacity(n7, n4);
            this.array = lArray = Arrays.copyOf(lArray, n4);
        }
    }

    private static int expandedCapacity(int n3, int n4) {
        if (n4 >= 0) {
            int n7 = n3 >> 1;
            if ((n3 = n3 + n7 + 1) < n4) {
                n3 = Integer.highestOneBit(n4 += -1) << 1;
            }
            if (n3 < 0) {
                n3 = -1 >>> 1;
            }
            return n3;
        }
        AssertionError assertionError = new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        throw assertionError;
    }

    public ImmutableLongArray$Builder add(long l2) {
        int n3 = 1;
        this.ensureRoomFor(n3);
        long[] lArray = this.array;
        int n4 = this.count;
        lArray[n4] = l2;
        this.count = n4 += n3;
        return this;
    }

    public ImmutableLongArray$Builder addAll(ImmutableLongArray immutableLongArray) {
        int n3;
        int n4 = immutableLongArray.length();
        this.ensureRoomFor(n4);
        long[] lArray = ImmutableLongArray.access$000(immutableLongArray);
        int n7 = ImmutableLongArray.access$100(immutableLongArray);
        long[] lArray2 = this.array;
        int n8 = this.count;
        int n10 = immutableLongArray.length();
        System.arraycopy(lArray, n7, lArray2, n8, n10);
        n4 = this.count;
        this.count = n3 = immutableLongArray.length() + n4;
        return this;
    }

    public ImmutableLongArray$Builder addAll(Iterable object) {
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            object = (Collection)object;
            return this.addAll((Collection)object);
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Long l2 = (Long)object.next();
            long l3 = l2;
            this.add(l3);
        }
        return this;
    }

    public ImmutableLongArray$Builder addAll(Collection object) {
        int n3 = object.size();
        this.ensureRoomFor(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            long l2;
            int n4;
            Long l3 = (Long)object.next();
            long[] lArray = this.array;
            int n7 = this.count;
            this.count = n4 = n7 + 1;
            lArray[n7] = l2 = l3.longValue();
        }
        return this;
    }

    public ImmutableLongArray$Builder addAll(long[] lArray) {
        int n3 = lArray.length;
        this.ensureRoomFor(n3);
        long[] lArray2 = this.array;
        int n4 = this.count;
        int n7 = lArray.length;
        System.arraycopy(lArray, 0, lArray2, n4, n7);
        n3 = this.count;
        int n8 = lArray.length;
        this.count = n3 += n8;
        return this;
    }

    public ImmutableLongArray build() {
        ImmutableLongArray immutableLongArray;
        int n3 = this.count;
        if (n3 == 0) {
            immutableLongArray = ImmutableLongArray.access$200();
        } else {
            long[] lArray = this.array;
            int n4 = this.count;
            immutableLongArray = new ImmutableLongArray(lArray, 0, n4, null);
        }
        return immutableLongArray;
    }
}

