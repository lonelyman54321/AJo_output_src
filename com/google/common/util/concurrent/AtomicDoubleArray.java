/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import com.google.common.primitives.ImmutableLongArray$Builder;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicDoubleArray
implements Serializable {
    private static final long serialVersionUID;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(int n3) {
        AtomicLongArray atomicLongArray;
        this.longs = atomicLongArray = new AtomicLongArray(n3);
    }

    public AtomicDoubleArray(double[] object) {
        int n3 = ((double[])object).length;
        long[] lArray = new long[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            long l2;
            double d2 = object[i3];
            lArray[i3] = l2 = Double.doubleToRawLongBits(d2);
        }
        object = new AtomicLongArray;
        super(lArray);
        this.longs = object;
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        int n3 = ((ObjectInputStream)object).readInt();
        ImmutableLongArray$Builder immutableLongArray$Builder = ImmutableLongArray.builder();
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2 = ((ObjectInputStream)object).readDouble();
            long l2 = Double.doubleToRawLongBits(d2);
            immutableLongArray$Builder.add(l2);
        }
        long[] lArray = immutableLongArray$Builder.build().toArray();
        this.longs = object = new AtomicLongArray(lArray);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        int n3 = this.length();
        objectOutputStream.writeInt(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            double d2 = this.get(i3);
            objectOutputStream.writeDouble(d2);
        }
    }

    public double addAndGet(int n3, double d2) {
        double d5;
        double d7;
        long l2;
        AtomicLongArray atomicLongArray;
        long l3;
        AtomicLongArray atomicLongArray2;
        boolean bl2;
        while (!(bl2 = (atomicLongArray2 = this.longs).compareAndSet(n3, l3 = (atomicLongArray = this.longs).get(n3), l2 = Double.doubleToRawLongBits(d7 = (d5 = Double.longBitsToDouble(l3)) + d2)))) {
        }
        return d7;
    }

    public final boolean compareAndSet(int n3, double d2, double d5) {
        AtomicLongArray atomicLongArray = this.longs;
        long l2 = Double.doubleToRawLongBits(d2);
        long l3 = Double.doubleToRawLongBits(d5);
        return atomicLongArray.compareAndSet(n3, l2, l3);
    }

    public final double get(int n3) {
        return Double.longBitsToDouble(this.longs.get(n3));
    }

    public final double getAndAdd(int n3, double d2) {
        double d5;
        double d7;
        long l2;
        AtomicLongArray atomicLongArray;
        long l3;
        AtomicLongArray atomicLongArray2;
        boolean bl2;
        while (!(bl2 = (atomicLongArray2 = this.longs).compareAndSet(n3, l3 = (atomicLongArray = this.longs).get(n3), l2 = Double.doubleToRawLongBits(d7 = (d5 = Double.longBitsToDouble(l3)) + d2)))) {
        }
        return d5;
    }

    public final double getAndSet(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        return Double.longBitsToDouble(this.longs.getAndSet(n3, l2));
    }

    public final void lazySet(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.longs.lazySet(n3, l2);
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.longs.set(n3, l2);
    }

    public String toString() {
        int n3;
        int n4 = this.length();
        int n7 = n4 + -1;
        if (n7 == (n3 = -1)) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(n4 *= 19);
        stringBuilder.append('[');
        n4 = 0;
        while (true) {
            Object object = this.longs;
            long l2 = ((AtomicLongArray)object).get(n4);
            double d2 = Double.longBitsToDouble(l2);
            stringBuilder.append(d2);
            if (n4 == n7) {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
            object = ", ";
            stringBuilder.append((String)object);
            ++n4;
        }
    }

    public final boolean weakCompareAndSet(int n3, double d2, double d5) {
        AtomicLongArray atomicLongArray = this.longs;
        long l2 = Double.doubleToRawLongBits(d2);
        long l3 = Double.doubleToRawLongBits(d5);
        return atomicLongArray.weakCompareAndSet(n3, l2, l3);
    }
}

