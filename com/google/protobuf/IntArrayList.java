/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class IntArrayList
extends AbstractProtobufList
implements Internal$IntList,
RandomAccess,
PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        IntArrayList intArrayList;
        int[] nArray = new int[]{};
        EMPTY_LIST = intArrayList = new IntArrayList(nArray, 0, false);
    }

    public IntArrayList() {
        int[] nArray = new int[10];
        this(nArray, 0, true);
    }

    private IntArrayList(int[] nArray, int n3, boolean bl2) {
        super(bl2);
        this.array = nArray;
        this.size = n3;
    }

    private void addInt(int n3, int n4) {
        int n7;
        this.ensureIsMutable();
        if (n3 >= 0 && n3 <= (n7 = this.size)) {
            int[] nArray = this.array;
            int n8 = nArray.length;
            int n10 = 1;
            if (n7 < n8) {
                n8 = n3 + 1;
                System.arraycopy(nArray, n3, nArray, n8, n7 -= n3);
            } else {
                n7 = zy_2.a(n7, 3, 2, n10);
                int[] nArray2 = new int[n7];
                System.arraycopy(nArray, 0, nArray2, 0, n3);
                nArray = this.array;
                n8 = n3 + 1;
                int n14 = this.size - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n14);
                this.array = nArray2;
            }
            this.array[n3] = n4;
            this.size = n3 = this.size + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static IntArrayList emptyList() {
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

    public void add(int n3, Integer n4) {
        int n7 = n4;
        this.addInt(n3, n7);
    }

    public boolean add(Integer n3) {
        int n4 = n3;
        this.addInt(n4);
        return true;
    }

    public boolean addAll(Collection object) {
        this.ensureIsMutable();
        Internal.checkNotNull(object);
        int n3 = object instanceof IntArrayList;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (IntArrayList)object;
        n3 = ((IntArrayList)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            int[] nArray = this.array;
            n7 = nArray.length;
            if ((n4 += n3) > n7) {
                this.array = nArray = Arrays.copyOf(nArray, n4);
            }
            nArray = ((IntArrayList)object).array;
            int[] nArray2 = this.array;
            int n8 = this.size;
            int n10 = ((IntArrayList)object).size;
            System.arraycopy(nArray, 0, nArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public void addInt(int n3) {
        this.ensureIsMutable();
        int n4 = this.size;
        int[] nArray = this.array;
        int n7 = nArray.length;
        if (n4 == n7) {
            int n8 = 1;
            n7 = zy_2.a(n4, 3, 2, n8);
            int[] nArray2 = new int[n7];
            System.arraycopy(nArray, 0, nArray2, 0, n4);
            this.array = nArray2;
        }
        int[] nArray3 = this.array;
        int n10 = this.size;
        this.size = n7 = n10 + 1;
        nArray3[n10] = n3;
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
        int n3 = object instanceof IntArrayList;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (IntArrayList)object;
        n3 = this.size;
        int n4 = ((IntArrayList)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((IntArrayList)object).array;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            int[] nArray = this.array;
            n4 = nArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public Integer get(int n3) {
        return this.getInt(n3);
    }

    public int getInt(int n3) {
        this.ensureIndexInRange(n3);
        return this.array[n3];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            int[] nArray = this.array;
            n3 = nArray[i3];
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Integer;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Integer)object;
        int n7 = (Integer)object;
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray = this.array;
            int n8 = nArray[i3];
            if (n8 != n7) continue;
            return i3;
        }
        return n4;
    }

    public Internal$IntList mutableCopyWithCapacity(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            int[] nArray = Arrays.copyOf(this.array, n3);
            int n7 = this.size;
            IntArrayList intArrayList = new IntArrayList(nArray, n7, true);
            return intArrayList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Integer remove(int n3) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        int[] nArray = this.array;
        int n4 = nArray[n3];
        int n7 = this.size;
        int n8 = n7 + -1;
        if (n3 < n8) {
            n8 = n3 + 1;
            n7 = n7 - n3 + -1;
            System.arraycopy(nArray, n8, nArray, n3, n7);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return n4;
    }

    public void removeRange(int n3, int n4) {
        this.ensureIsMutable();
        if (n4 >= n3) {
            int[] nArray = this.array;
            int n7 = this.size - n4;
            System.arraycopy(nArray, n4, nArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public Integer set(int n3, Integer n4) {
        int n7 = n4;
        return this.setInt(n3, n7);
    }

    public int setInt(int n3, int n4) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        int[] nArray = this.array;
        int n7 = nArray[n3];
        nArray[n3] = n4;
        return n7;
    }

    public int size() {
        return this.size;
    }
}

