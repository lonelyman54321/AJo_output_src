/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$LongList;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class LongArrayList
extends AbstractProtobufList
implements Internal$LongList,
RandomAccess,
PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        LongArrayList longArrayList;
        long[] lArray = new long[]{};
        EMPTY_LIST = longArrayList = new LongArrayList(lArray, 0, false);
    }

    public LongArrayList() {
        long[] lArray = new long[10];
        this(lArray, 0, true);
    }

    private LongArrayList(long[] lArray, int n3, boolean bl2) {
        super(bl2);
        this.array = lArray;
        this.size = n3;
    }

    private void addLong(int n3, long l2) {
        int n4;
        this.ensureIsMutable();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            long[] lArray = this.array;
            int n7 = lArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(lArray, n3, lArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                long[] lArray2 = new long[n4];
                System.arraycopy(lArray, 0, lArray2, 0, n3);
                lArray = this.array;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(lArray, n3, lArray2, n7, n10);
                this.array = lArray2;
            }
            this.array[n3] = l2;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static LongArrayList emptyList() {
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

    public void add(int n3, Long l2) {
        long l3 = l2;
        this.addLong(n3, l3);
    }

    public boolean add(Long l2) {
        long l3 = l2;
        this.addLong(l3);
        return true;
    }

    public boolean addAll(Collection object) {
        this.ensureIsMutable();
        Internal.checkNotNull(object);
        int n3 = object instanceof LongArrayList;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (LongArrayList)object;
        n3 = ((LongArrayList)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            long[] lArray = this.array;
            n7 = lArray.length;
            if ((n4 += n3) > n7) {
                this.array = lArray = Arrays.copyOf(lArray, n4);
            }
            lArray = ((LongArrayList)object).array;
            long[] lArray2 = this.array;
            int n8 = this.size;
            int n10 = ((LongArrayList)object).size;
            System.arraycopy(lArray, 0, lArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public void addLong(long l2) {
        this.ensureIsMutable();
        int n3 = this.size;
        long[] lArray = this.array;
        int n4 = lArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            long[] lArray2 = new long[n4];
            System.arraycopy(lArray, 0, lArray2, 0, n3);
            this.array = lArray2;
        }
        long[] lArray3 = this.array;
        int n8 = this.size;
        this.size = n4 = n8 + 1;
        lArray3[n8] = l2;
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
        int n3 = object instanceof LongArrayList;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (LongArrayList)object;
        n3 = this.size;
        int n4 = ((LongArrayList)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((LongArrayList)object).array;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            long[] lArray = this.array;
            long l2 = lArray[n3];
            Object object2 = object[n3];
            long l3 = l2 - object2;
            n4 = (int)(l3 == 0L ? 0 : (l3 < 0L ? -1 : 1));
            if (n4 == 0) continue;
            return false;
        }
        return bl2;
    }

    public Long get(int n3) {
        return this.getLong(n3);
    }

    public long getLong(int n3) {
        this.ensureIndexInRange(n3);
        return this.array[n3];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            long[] lArray = this.array;
            long l2 = lArray[i3];
            n3 = Internal.hashLong(l2);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Long;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Long)object;
        long l2 = (Long)object;
        int n7 = this.size();
        for (n3 = 0; n3 < n7; ++n3) {
            long[] lArray = this.array;
            long l3 = lArray[n3];
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) continue;
            return n3;
        }
        return n4;
    }

    public Internal$LongList mutableCopyWithCapacity(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            long[] lArray = Arrays.copyOf(this.array, n3);
            int n7 = this.size;
            LongArrayList longArrayList = new LongArrayList(lArray, n7, true);
            return longArrayList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Long remove(int n3) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        long[] lArray = this.array;
        long l2 = lArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(lArray, n7, lArray, n3, n4);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return l2;
    }

    public void removeRange(int n3, int n4) {
        this.ensureIsMutable();
        if (n4 >= n3) {
            long[] lArray = this.array;
            int n7 = this.size - n4;
            System.arraycopy(lArray, n4, lArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public Long set(int n3, Long l2) {
        long l3 = l2;
        return this.setLong(n3, l3);
    }

    public long setLong(int n3, long l2) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        long[] lArray = this.array;
        long l3 = lArray[n3];
        lArray[n3] = l2;
        return l3;
    }

    public int size() {
        return this.size;
    }
}

