/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicDouble
extends Number
implements Serializable {
    private static final long serialVersionUID;
    private transient AtomicLong value;

    public AtomicDouble() {
        this(0.0);
    }

    public AtomicDouble(double d2) {
        AtomicLong atomicLong;
        long l2 = Double.doubleToRawLongBits(d2);
        this.value = atomicLong = new AtomicLong(l2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        AtomicLong atomicLong;
        objectInputStream.defaultReadObject();
        this.value = atomicLong = new AtomicLong();
        double d2 = objectInputStream.readDouble();
        this.set(d2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        double d2 = this.get();
        objectOutputStream.writeDouble(d2);
    }

    public final double addAndGet(double d2) {
        double d5;
        long l2;
        AtomicLong atomicLong;
        long l3;
        AtomicLong atomicLong2;
        boolean bl2;
        while (!(bl2 = (atomicLong2 = this.value).compareAndSet(l3 = (atomicLong = this.value).get(), l2 = Double.doubleToRawLongBits(d5 = Double.longBitsToDouble(l3) + d2)))) {
        }
        return d5;
    }

    public final boolean compareAndSet(double d2, double d5) {
        AtomicLong atomicLong = this.value;
        long l2 = Double.doubleToRawLongBits(d2);
        long l3 = Double.doubleToRawLongBits(d5);
        return atomicLong.compareAndSet(l2, l3);
    }

    public double doubleValue() {
        return this.get();
    }

    public float floatValue() {
        return (float)this.get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    public final double getAndAdd(double d2) {
        double d5;
        double d7;
        long l2;
        AtomicLong atomicLong;
        long l3;
        AtomicLong atomicLong2;
        boolean bl2;
        while (!(bl2 = (atomicLong2 = this.value).compareAndSet(l3 = (atomicLong = this.value).get(), l2 = Double.doubleToRawLongBits(d7 = (d5 = Double.longBitsToDouble(l3)) + d2)))) {
        }
        return d5;
    }

    public final double getAndSet(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        return Double.longBitsToDouble(this.value.getAndSet(l2));
    }

    public int intValue() {
        return (int)this.get();
    }

    public final void lazySet(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.value.lazySet(l2);
    }

    public long longValue() {
        return (long)this.get();
    }

    public final void set(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.value.set(l2);
    }

    public String toString() {
        return Double.toString(this.get());
    }

    public final boolean weakCompareAndSet(double d2, double d5) {
        AtomicLong atomicLong = this.value;
        long l2 = Double.doubleToRawLongBits(d2);
        long l3 = Double.doubleToRawLongBits(d5);
        return atomicLong.weakCompareAndSet(l2, l3);
    }
}

