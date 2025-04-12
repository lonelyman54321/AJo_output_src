/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$DoubleList;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class DoubleArrayList
extends AbstractProtobufList
implements Internal$DoubleList,
RandomAccess,
PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        DoubleArrayList doubleArrayList;
        double[] dArray = new double[]{};
        EMPTY_LIST = doubleArrayList = new DoubleArrayList(dArray, 0, false);
    }

    public DoubleArrayList() {
        double[] dArray = new double[10];
        this(dArray, 0, true);
    }

    private DoubleArrayList(double[] dArray, int n3, boolean bl2) {
        super(bl2);
        this.array = dArray;
        this.size = n3;
    }

    private void addDouble(int n3, double d2) {
        int n4;
        this.ensureIsMutable();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            double[] dArray = this.array;
            int n7 = dArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(dArray, n3, dArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                double[] dArray2 = new double[n4];
                System.arraycopy(dArray, 0, dArray2, 0, n3);
                dArray = this.array;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(dArray, n3, dArray2, n7, n10);
                this.array = dArray2;
            }
            this.array[n3] = d2;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.size)) {
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private String makeOutOfBoundsExceptionMessage(int n3) {
        StringBuilder stringBuilder = wk0_0.a(n3, "Index:", ", Size:");
        int n4 = this.size;
        stringBuilder.append(n4);
        return stringBuilder.toString();
    }

    public void add(int n3, Double d2) {
        double d5 = d2;
        this.addDouble(n3, d5);
    }

    public boolean add(Double d2) {
        double d5 = d2;
        this.addDouble(d5);
        return true;
    }

    public boolean addAll(Collection object) {
        this.ensureIsMutable();
        Internal.checkNotNull(object);
        int n3 = object instanceof DoubleArrayList;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (DoubleArrayList)object;
        n3 = ((DoubleArrayList)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            double[] dArray = this.array;
            n7 = dArray.length;
            if ((n4 += n3) > n7) {
                this.array = dArray = Arrays.copyOf(dArray, n4);
            }
            dArray = ((DoubleArrayList)object).array;
            double[] dArray2 = this.array;
            int n8 = this.size;
            int n10 = ((DoubleArrayList)object).size;
            System.arraycopy(dArray, 0, dArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public void addDouble(double d2) {
        this.ensureIsMutable();
        int n3 = this.size;
        double[] dArray = this.array;
        int n4 = dArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            double[] dArray2 = new double[n4];
            System.arraycopy(dArray, 0, dArray2, 0, n3);
            this.array = dArray2;
        }
        double[] dArray3 = this.array;
        int n8 = this.size;
        this.size = n4 = n8 + 1;
        dArray3[n8] = d2;
    }

    public boolean contains(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        if (n4 != (n3 = -1)) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof DoubleArrayList;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (DoubleArrayList)object;
        n3 = this.size;
        int n4 = ((DoubleArrayList)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((DoubleArrayList)object).array;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            Object object2;
            long l2;
            double[] dArray = this.array;
            double d2 = dArray[n3];
            long l3 = Double.doubleToLongBits(d2);
            long l4 = l3 - (l2 = Double.doubleToLongBits((double)(object2 = object[n3])));
            n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n4 == 0) continue;
            return false;
        }
        return bl2;
    }

    public Double get(int n3) {
        return this.getDouble(n3);
    }

    public double getDouble(int n3) {
        this.ensureIndexInRange(n3);
        return this.array[n3];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            double[] dArray = this.array;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n4 *= 31;
            n3 = Internal.hashLong(l2);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Double;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Double)object;
        double d2 = (Double)object;
        int n7 = this.size();
        for (n3 = 0; n3 < n7; ++n3) {
            double[] dArray = this.array;
            double d5 = dArray[n3];
            double d7 = d5 - d2;
            Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object2 != false) continue;
            return n3;
        }
        return n4;
    }

    public Internal$DoubleList mutableCopyWithCapacity(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            double[] dArray = Arrays.copyOf(this.array, n3);
            int n7 = this.size;
            DoubleArrayList doubleArrayList = new DoubleArrayList(dArray, n7, true);
            return doubleArrayList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Double remove(int n3) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        double[] dArray = this.array;
        double d2 = dArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(dArray, n7, dArray, n3, n4);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return d2;
    }

    public void removeRange(int n3, int n4) {
        this.ensureIsMutable();
        if (n4 >= n3) {
            double[] dArray = this.array;
            int n7 = this.size - n4;
            System.arraycopy(dArray, n4, dArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public Double set(int n3, Double d2) {
        double d5 = d2;
        return this.setDouble(n3, d5);
    }

    public double setDouble(int n3, double d2) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        double[] dArray = this.array;
        double d5 = dArray[n3];
        dArray[n3] = d2;
        return d5;
    }

    public int size() {
        return this.size;
    }
}

