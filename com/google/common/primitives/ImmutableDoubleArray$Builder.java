/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.ImmutableDoubleArray;
import java.util.Arrays;
import java.util.Collection;

public final class ImmutableDoubleArray$Builder {
    private double[] array;
    private int count = 0;

    public ImmutableDoubleArray$Builder(int n3) {
        double[] dArray = new double[n3];
        this.array = dArray;
    }

    private void ensureRoomFor(int n3) {
        int n4 = this.count + n3;
        double[] dArray = this.array;
        int n7 = dArray.length;
        if (n4 > n7) {
            n7 = dArray.length;
            n4 = ImmutableDoubleArray$Builder.expandedCapacity(n7, n4);
            this.array = dArray = Arrays.copyOf(dArray, n4);
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

    public ImmutableDoubleArray$Builder add(double d2) {
        int n3 = 1;
        this.ensureRoomFor(n3);
        double[] dArray = this.array;
        int n4 = this.count;
        dArray[n4] = d2;
        this.count = n4 += n3;
        return this;
    }

    public ImmutableDoubleArray$Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
        int n3;
        int n4 = immutableDoubleArray.length();
        this.ensureRoomFor(n4);
        double[] dArray = ImmutableDoubleArray.access$000(immutableDoubleArray);
        int n7 = ImmutableDoubleArray.access$100(immutableDoubleArray);
        double[] dArray2 = this.array;
        int n8 = this.count;
        int n10 = immutableDoubleArray.length();
        System.arraycopy(dArray, n7, dArray2, n8, n10);
        n4 = this.count;
        this.count = n3 = immutableDoubleArray.length() + n4;
        return this;
    }

    public ImmutableDoubleArray$Builder addAll(Iterable object) {
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            object = (Collection)object;
            return this.addAll((Collection)object);
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Double d2 = (Double)object.next();
            double d5 = d2;
            this.add(d5);
        }
        return this;
    }

    public ImmutableDoubleArray$Builder addAll(Collection object) {
        int n3 = object.size();
        this.ensureRoomFor(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            double d2;
            int n4;
            Double d5 = (Double)object.next();
            double[] dArray = this.array;
            int n7 = this.count;
            this.count = n4 = n7 + 1;
            dArray[n7] = d2 = d5.doubleValue();
        }
        return this;
    }

    public ImmutableDoubleArray$Builder addAll(double[] dArray) {
        int n3 = dArray.length;
        this.ensureRoomFor(n3);
        double[] dArray2 = this.array;
        int n4 = this.count;
        int n7 = dArray.length;
        System.arraycopy(dArray, 0, dArray2, n4, n7);
        n3 = this.count;
        int n8 = dArray.length;
        this.count = n3 += n8;
        return this;
    }

    public ImmutableDoubleArray build() {
        ImmutableDoubleArray immutableDoubleArray;
        int n3 = this.count;
        if (n3 == 0) {
            immutableDoubleArray = ImmutableDoubleArray.access$200();
        } else {
            double[] dArray = this.array;
            int n4 = this.count;
            immutableDoubleArray = new ImmutableDoubleArray(dArray, 0, n4, null);
        }
        return immutableDoubleArray;
    }
}

