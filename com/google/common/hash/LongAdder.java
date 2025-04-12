/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.LongAddable;
import com.google.common.hash.Striped64;
import com.google.common.hash.Striped64$Cell;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class LongAdder
extends Striped64
implements Serializable,
LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) {
        long l2;
        objectInputStream.defaultReadObject();
        this.busy = 0;
        this.cells = null;
        this.base = l2 = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        long l2 = this.sum();
        objectOutputStream.writeLong(l2);
    }

    public void add(long l2) {
        block2: {
            int n3;
            int[] nArray;
            block3: {
                long l3;
                long l4;
                int n4;
                long l7;
                long l8;
                boolean bl2;
                Object object = this.cells;
                if (object == null && (bl2 = this.casBase(l8 = this.base, l7 = l8 + l2))) break block2;
                nArray = (int[])Striped64.threadHashCode.get();
                n3 = 1;
                if (nArray == null || object == null || (n4 = ((Striped64$Cell[])object).length) < n3) break block3;
                n4 -= n3;
                int n7 = nArray[0];
                if ((object = object[n4 &= n7]) != null && (n3 = (int)(((Striped64$Cell)object).cas(l4 = ((Striped64$Cell)object).value, l3 = l4 + l2) ? 1 : 0)) != 0) break block2;
            }
            this.retryUpdate(l2, nArray, n3 != 0);
        }
    }

    public void decrement() {
        this.add(-1);
    }

    public double doubleValue() {
        return this.sum();
    }

    public float floatValue() {
        return this.sum();
    }

    public final long fn(long l2, long l3) {
        return l2 + l3;
    }

    public void increment() {
        this.add(1L);
    }

    public int intValue() {
        return (int)this.sum();
    }

    public long longValue() {
        return this.sum();
    }

    public void reset() {
        this.internalReset(0L);
    }

    public long sum() {
        long l2 = this.base;
        Striped64$Cell[] striped64$CellArray = this.cells;
        if (striped64$CellArray != null) {
            for (Striped64$Cell striped64$Cell : striped64$CellArray) {
                if (striped64$Cell == null) continue;
                long l3 = striped64$Cell.value;
                l2 += l3;
            }
        }
        return l2;
    }

    public long sumThenReset() {
        long l2;
        long l3 = this.base;
        Striped64$Cell[] striped64$CellArray = this.cells;
        this.base = l2 = 0L;
        if (striped64$CellArray != null) {
            for (Striped64$Cell striped64$Cell : striped64$CellArray) {
                if (striped64$Cell == null) continue;
                long l4 = striped64$Cell.value;
                l3 += l4;
                striped64$Cell.value = l2;
            }
        }
        return l3;
    }

    public String toString() {
        return Long.toString(this.sum());
    }
}

