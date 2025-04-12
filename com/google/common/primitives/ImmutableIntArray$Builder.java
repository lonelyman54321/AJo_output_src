/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.ImmutableIntArray;
import java.util.Arrays;
import java.util.Collection;

public final class ImmutableIntArray$Builder {
    private int[] array;
    private int count = 0;

    public ImmutableIntArray$Builder(int n3) {
        int[] nArray = new int[n3];
        this.array = nArray;
    }

    private void ensureRoomFor(int n3) {
        int n4 = this.count + n3;
        int[] nArray = this.array;
        int n7 = nArray.length;
        if (n4 > n7) {
            n7 = nArray.length;
            n4 = ImmutableIntArray$Builder.expandedCapacity(n7, n4);
            this.array = nArray = Arrays.copyOf(nArray, n4);
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

    public ImmutableIntArray$Builder add(int n3) {
        int n4 = 1;
        this.ensureRoomFor(n4);
        int[] nArray = this.array;
        int n7 = this.count;
        nArray[n7] = n3;
        this.count = n7 += n4;
        return this;
    }

    public ImmutableIntArray$Builder addAll(ImmutableIntArray immutableIntArray) {
        int n3;
        int n4 = immutableIntArray.length();
        this.ensureRoomFor(n4);
        int[] nArray = ImmutableIntArray.access$000(immutableIntArray);
        int n7 = ImmutableIntArray.access$100(immutableIntArray);
        int[] nArray2 = this.array;
        int n8 = this.count;
        int n10 = immutableIntArray.length();
        System.arraycopy(nArray, n7, nArray2, n8, n10);
        n4 = this.count;
        this.count = n3 = immutableIntArray.length() + n4;
        return this;
    }

    public ImmutableIntArray$Builder addAll(Iterable object) {
        int n3 = object instanceof Collection;
        if (n3 != 0) {
            object = (Collection)object;
            return this.addAll((Collection)object);
        }
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            Integer n4 = (Integer)object.next();
            n3 = n4;
            this.add(n3);
        }
        return this;
    }

    public ImmutableIntArray$Builder addAll(Collection object) {
        int n3 = object.size();
        this.ensureRoomFor(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            int n4;
            Integer n7 = (Integer)object.next();
            int[] nArray = this.array;
            int n8 = this.count;
            this.count = n4 = n8 + 1;
            nArray[n8] = n3 = n7.intValue();
        }
        return this;
    }

    public ImmutableIntArray$Builder addAll(int[] nArray) {
        int n3 = nArray.length;
        this.ensureRoomFor(n3);
        int[] nArray2 = this.array;
        int n4 = this.count;
        int n7 = nArray.length;
        System.arraycopy(nArray, 0, nArray2, n4, n7);
        n3 = this.count;
        int n8 = nArray.length;
        this.count = n3 += n8;
        return this;
    }

    public ImmutableIntArray build() {
        ImmutableIntArray immutableIntArray;
        int n3 = this.count;
        if (n3 == 0) {
            immutableIntArray = ImmutableIntArray.access$200();
        } else {
            int[] nArray = this.array;
            int n4 = this.count;
            immutableIntArray = new ImmutableIntArray(nArray, 0, n4, null);
        }
        return immutableIntArray;
    }
}

