/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.Internal;
import com.google.protobuf.Internal$FloatList;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class FloatArrayList
extends AbstractProtobufList
implements Internal$FloatList,
RandomAccess,
PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        FloatArrayList floatArrayList;
        float[] fArray = new float[]{};
        EMPTY_LIST = floatArrayList = new FloatArrayList(fArray, 0, false);
    }

    public FloatArrayList() {
        float[] fArray = new float[10];
        this(fArray, 0, true);
    }

    private FloatArrayList(float[] fArray, int n3, boolean bl2) {
        super(bl2);
        this.array = fArray;
        this.size = n3;
    }

    private void addFloat(int n3, float f5) {
        int n4;
        this.ensureIsMutable();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            float[] fArray = this.array;
            int n7 = fArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(fArray, n3, fArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                float[] fArray2 = new float[n4];
                System.arraycopy(fArray, 0, fArray2, 0, n3);
                fArray = this.array;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(fArray, n3, fArray2, n7, n10);
                this.array = fArray2;
            }
            this.array[n3] = f5;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.makeOutOfBoundsExceptionMessage(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static FloatArrayList emptyList() {
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

    public void add(int n3, Float f5) {
        float f6 = f5.floatValue();
        this.addFloat(n3, f6);
    }

    public boolean add(Float f5) {
        float f6 = f5.floatValue();
        this.addFloat(f6);
        return true;
    }

    public boolean addAll(Collection object) {
        this.ensureIsMutable();
        Internal.checkNotNull(object);
        int n3 = object instanceof FloatArrayList;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (FloatArrayList)object;
        n3 = ((FloatArrayList)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            float[] fArray = this.array;
            n7 = fArray.length;
            if ((n4 += n3) > n7) {
                this.array = fArray = Arrays.copyOf(fArray, n4);
            }
            fArray = ((FloatArrayList)object).array;
            float[] fArray2 = this.array;
            int n8 = this.size;
            int n10 = ((FloatArrayList)object).size;
            System.arraycopy(fArray, 0, fArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public void addFloat(float f5) {
        this.ensureIsMutable();
        int n3 = this.size;
        float[] fArray = this.array;
        int n4 = fArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            float[] fArray2 = new float[n4];
            System.arraycopy(fArray, 0, fArray2, 0, n3);
            this.array = fArray2;
        }
        float[] fArray3 = this.array;
        int n8 = this.size;
        this.size = n4 = n8 + 1;
        fArray3[n8] = f5;
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
        int n3 = object instanceof FloatArrayList;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (FloatArrayList)object;
        n3 = this.size;
        int n4 = ((FloatArrayList)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((FloatArrayList)object).array;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            Object object2;
            int n7;
            float[] fArray = this.array;
            float f5 = fArray[n3];
            n4 = Float.floatToIntBits(f5);
            if (n4 == (n7 = Float.floatToIntBits((float)(object2 = object[n3])))) continue;
            return false;
        }
        return bl2;
    }

    public Float get(int n3) {
        return Float.valueOf(this.getFloat(n3));
    }

    public float getFloat(int n3) {
        this.ensureIndexInRange(n3);
        return this.array[n3];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            float[] fArray = this.array;
            float f5 = fArray[i3];
            n3 = Float.floatToIntBits(f5);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Float;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            float[] fArray = this.array;
            float f6 = fArray[i3];
            float f7 = f6 - f5;
            Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 != false) continue;
            return i3;
        }
        return n4;
    }

    public Internal$FloatList mutableCopyWithCapacity(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            float[] fArray = Arrays.copyOf(this.array, n3);
            int n7 = this.size;
            FloatArrayList floatArrayList = new FloatArrayList(fArray, n7, true);
            return floatArrayList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Float remove(int n3) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        float[] fArray = this.array;
        float f5 = fArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(fArray, n7, fArray, n3, n4);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return Float.valueOf(f5);
    }

    public void removeRange(int n3, int n4) {
        this.ensureIsMutable();
        if (n4 >= n3) {
            float[] fArray = this.array;
            int n7 = this.size - n4;
            System.arraycopy(fArray, n4, fArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public Float set(int n3, Float f5) {
        float f6 = f5.floatValue();
        return Float.valueOf(this.setFloat(n3, f6));
    }

    public float setFloat(int n3, float f5) {
        this.ensureIsMutable();
        this.ensureIndexInRange(n3);
        float[] fArray = this.array;
        float f6 = fArray[n3];
        fArray[n3] = f5;
        return f6;
    }

    public int size() {
        return this.size;
    }
}

