/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Doubles$DoubleArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final double[] array;
    final int end;
    final int start;

    public Doubles$DoubleArrayAsList(double[] dArray) {
        int n3 = dArray.length;
        this(dArray, 0, n3);
    }

    public Doubles$DoubleArrayAsList(double[] dArray, int n3, int n4) {
        this.array = dArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Double;
        if (n3 == 0) return 0 != 0;
        double[] dArray = this.array;
        object = (Double)object;
        double d2 = (Double)object;
        int n4 = this.start;
        int n7 = this.end;
        if ((n4 = Doubles.access$000(dArray, d2, n4, n7)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Doubles$DoubleArrayAsList;
        if (n3 != 0) {
            object = (Doubles$DoubleArrayAsList)object;
            n3 = this.size();
            int n4 = ((Doubles$DoubleArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                double[] dArray = this.array;
                int n7 = this.start + n4;
                double d2 = dArray[n7];
                int n8 = ((Doubles$DoubleArrayAsList)object).start + n4;
                double d5 = (dArray = ((Doubles$DoubleArrayAsList)object).array)[n8];
                double d7 = d2 - d5;
                Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                if (object2 == false) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Double get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        double[] dArray = this.array;
        int n7 = this.start + n3;
        return dArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            double[] dArray = this.array;
            double d2 = dArray[i3];
            n3 = Doubles.hashCode(d2);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Double;
        if (n3 != 0) {
            double[] dArray = this.array;
            object = (Double)object;
            double d2 = (Double)object;
            int n4 = this.start;
            int n7 = this.end;
            if ((n4 = Doubles.access$000(dArray, d2, n4, n7)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(Object object) {
        int n3 = object instanceof Double;
        if (n3 != 0) {
            double[] dArray = this.array;
            object = (Double)object;
            double d2 = (Double)object;
            int n4 = this.start;
            int n7 = this.end;
            if ((n4 = Doubles.access$100(dArray, d2, n4, n7)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public Double set(int n3, Double d2) {
        double d5;
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        double[] dArray = this.array;
        int n7 = this.start;
        int n8 = n7 + n3;
        double d7 = dArray[n8];
        dArray[n7 += n3] = d5 = ((Double)Preconditions.checkNotNull(d2)).doubleValue();
        return d7;
    }

    public int size() {
        int n3 = this.end;
        int n4 = this.start;
        return n3 - n4;
    }

    public List subList(int n3, int n4) {
        int n7 = this.size();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        if (n3 == n4) {
            return Collections.emptyList();
        }
        double[] dArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Doubles$DoubleArrayAsList doubles$DoubleArrayAsList = new Doubles$DoubleArrayAsList(dArray, n3, n8 += n4);
        return doubles$DoubleArrayAsList;
    }

    public double[] toDoubleArray() {
        double[] dArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(dArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 12;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        double[] dArray = this.array;
        int n4 = this.start;
        double d2 = dArray[n4];
        stringBuilder.append(d2);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            double[] dArray2 = this.array;
            double d5 = dArray2[n3];
            stringBuilder.append(d5);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

