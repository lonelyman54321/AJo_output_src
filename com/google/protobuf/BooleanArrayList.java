/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$BooleanList;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class BooleanArrayList
extends AbstractProtobufList
implements Internal$BooleanList,
RandomAccess,
PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        BooleanArrayList booleanArrayList;
        boolean[] blArray = new boolean[]{};
        EMPTY_LIST = booleanArrayList = new BooleanArrayList(blArray, 0, false);
    }

    public BooleanArrayList() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0, true);
    }

    private BooleanArrayList(boolean[] blArray, int n3, boolean bl2) {
        super(bl2);
        this.array = blArray;
        this.size = n3;
    }

    private void addBoolean(int n3, boolean bl2) {
        int n4;
        this.ensureIsMutable();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            boolean[] blArray = this.array;
            int n7 = blArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(blArray, n3, blArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                boolean[] blArray2 = new boolean[n4];
                System.arraycopy(blArray, 0, blArray2, 0, n3);
                blArray = this.array;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(blArray, n3, blArray2, n7, n10);
                this.array = blArray2;
            }
            this.array[n3] = bl2;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static BooleanArrayList emptyList() {
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

    public void add(int n3, Boolean bl2) {
        boolean bl3 = bl2;
        this.addBoolean(n3, bl3);
    }

    public boolean add(Boolean bl2) {
        boolean bl3 = bl2;
        this.addBoolean(bl3);
        return true;
    }

    public boolean addAll(Collection object) {
        this.ensureIsMutable();
        Internal.checkNotNull(object);
        int n3 = object instanceof BooleanArrayList;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (BooleanArrayList)object;
        n3 = ((BooleanArrayList)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            boolean[] blArray = this.array;
            n7 = blArray.length;
            if ((n4 += n3) > n7) {
                this.array = blArray = Arrays.copyOf(blArray, n4);
            }
            blArray = ((BooleanArrayList)object).array;
            boolean[] blArray2 = this.array;
            int n8 = this.size;
            int n10 = ((BooleanArrayList)object).size;
            System.arraycopy(blArray, 0, blArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public void addBoolean(boolean bl2) {
        this.ensureIsMutable();
        int n3 = this.size;
        boolean[] blArray = this.array;
        int n4 = blArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            boolean[] blArray2 = new boolean[n4];
            System.arraycopy(blArray, 0, blArray2, 0, n3);
            this.array = blArray2;
        }
        boolean[] blArray3 = this.array;
        int n8 = this.size;
        this.size = n4 = n8 + 1;
        blArray3[n8] = bl2;
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
        int n3 = object instanceof BooleanArrayList;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (BooleanArrayList)object;
        n3 = this.size;
        int n4 = ((BooleanArrayList)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((BooleanArrayList)object).array;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            boolean[] blArray = this.array;
            n4 = blArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public Boolean get(int n3) {
        return this.getBoolean(n3);
    }

    public boolean getBoolean(int n3) {
        this.ensureIndexInRange(n3);
        return this.array[n3];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.array;
            n3 = Internal.hashBoolean(blArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Boolean;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean[] blArray = this.array;
            boolean bl3 = blArray[i3];
            if (bl3 != bl2) continue;
            return i3;
        }
        return n4;
    }

    public Internal$BooleanList mutableCopyWithCapacity(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            boolean[] blArray = Arrays.copyOf(this.array, n3);
            int n7 = this.size;
            BooleanArrayList booleanArrayList = new BooleanArrayList(blArray, n7, true);
            return booleanArrayList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Boolean remove(int n3) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        boolean[] blArray = this.array;
        boolean bl2 = blArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(blArray, n7, blArray, n3, n4);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return bl2;
    }

    public void removeRange(int n3, int n4) {
        this.ensureIsMutable();
        if (n4 >= n3) {
            boolean[] blArray = this.array;
            int n7 = this.size - n4;
            System.arraycopy(blArray, n4, blArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public Boolean set(int n3, Boolean bl2) {
        boolean bl3 = bl2;
        return this.setBoolean(n3, bl3);
    }

    public boolean setBoolean(int n3, boolean bl2) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        boolean[] blArray = this.array;
        boolean bl3 = blArray[n3];
        blArray[n3] = bl2;
        return bl3;
    }

    public int size() {
        return this.size;
    }
}

