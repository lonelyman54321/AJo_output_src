/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import java.util.Arrays;
import java.util.RandomAccess;

final class ProtobufArrayList
extends AbstractProtobufList
implements RandomAccess {
    private static final ProtobufArrayList EMPTY_LIST;
    private Object[] array;
    private int size;

    static {
        ProtobufArrayList protobufArrayList;
        Object[] objectArray = new Object[]{};
        EMPTY_LIST = protobufArrayList = new ProtobufArrayList(objectArray, 0, false);
    }

    public ProtobufArrayList() {
        Object[] objectArray = new Object[10];
        this(objectArray, 0, true);
    }

    private ProtobufArrayList(Object[] objectArray, int n3, boolean bl2) {
        super(bl2);
        this.array = objectArray;
        this.size = n3;
    }

    private static Object[] createArray(int n3) {
        return new Object[n3];
    }

    public static ProtobufArrayList emptyList() {
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

    public void add(int n3, Object object) {
        int n4;
        this.ensureIsMutable();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            Object[] objectArray = this.array;
            int n7 = objectArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(objectArray, n3, objectArray, n7, n4 -= n3);
            } else {
                int n10 = 3;
                n4 = zy_2.a(n4, n10, 2, n8);
                Object[] objectArray2 = ProtobufArrayList.createArray(n4);
                System.arraycopy(this.array, 0, objectArray2, 0, n3);
                objectArray = this.array;
                n7 = n3 + 1;
                int n14 = this.size - n3;
                System.arraycopy(objectArray, n3, objectArray2, n7, n14);
                this.array = objectArray2;
            }
            this.array[n3] = object;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public boolean add(Object object) {
        int n3;
        Object[] objectArray;
        this.ensureIsMutable();
        int n4 = this.size;
        Object[] objectArray2 = this.array;
        int n7 = objectArray2.length;
        int n8 = 1;
        if (n4 == n7) {
            n4 = n4 * 3 / 2 + n8;
            this.array = objectArray = Arrays.copyOf(objectArray2, n4);
        }
        objectArray = this.array;
        int n10 = this.size;
        this.size = n7 = n10 + 1;
        objectArray[n10] = object;
        this.modCount = n3 = this.modCount + n8;
        return n8 != 0;
    }

    public Object get(int n3) {
        this.ensureIndexInRange(n3);
        return this.array[n3];
    }

    public ProtobufArrayList mutableCopyWithCapacity(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            Object[] objectArray = Arrays.copyOf(this.array, n3);
            int n7 = this.size;
            ProtobufArrayList protobufArrayList = new ProtobufArrayList(objectArray, n7, true);
            return protobufArrayList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Object remove(int n3) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        Object[] objectArray = this.array;
        Object object = objectArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(objectArray, n7, objectArray, n3, n4);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return object;
    }

    public Object set(int n3, Object object) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        Object[] objectArray = this.array;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        this.modCount = n3 = this.modCount + 1;
        return object2;
    }

    public int size() {
        return this.size;
    }
}

