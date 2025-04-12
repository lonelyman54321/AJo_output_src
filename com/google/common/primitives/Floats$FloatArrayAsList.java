/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Floats;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Floats$FloatArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final float[] array;
    final int end;
    final int start;

    public Floats$FloatArrayAsList(float[] fArray) {
        int n3 = fArray.length;
        this(fArray, 0, n3);
    }

    public Floats$FloatArrayAsList(float[] fArray, int n3, int n4) {
        this.array = fArray;
        this.start = n3;
        this.end = n4;
    }

    public boolean contains(Object object) {
        int n3;
        int n4;
        float f5;
        float[] fArray;
        int n7;
        int n8 = object instanceof Float;
        if (n8 != 0 && (n7 = Floats.access$000(fArray = this.array, f5 = ((Float)(object = (Float)object)).floatValue(), n4 = this.start, n3 = this.end)) != (n8 = -1)) {
            n7 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n7 = 0;
            f5 = 0.0f;
            object = null;
        }
        return n7 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Floats$FloatArrayAsList;
        if (n3 != 0) {
            object = (Floats$FloatArrayAsList)object;
            n3 = this.size();
            int n4 = ((Floats$FloatArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                float[] fArray = this.array;
                int n7 = this.start + n4;
                float f5 = fArray[n7];
                float[] fArray2 = ((Floats$FloatArrayAsList)object).array;
                int n8 = ((Floats$FloatArrayAsList)object).start + n4;
                float f6 = fArray2[n8];
                float f7 = f5 - f6;
                Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 == false) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Float get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        float[] fArray = this.array;
        int n7 = this.start + n3;
        return Float.valueOf(fArray[n7]);
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            float[] fArray = this.array;
            float f5 = fArray[i3];
            n3 = Floats.hashCode(f5);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3;
        int n4;
        float f5;
        float[] fArray;
        int n7;
        int n8 = object instanceof Float;
        if (n8 != 0 && (n7 = Floats.access$000(fArray = this.array, f5 = ((Float)(object = (Float)object)).floatValue(), n4 = this.start, n3 = this.end)) >= 0) {
            n8 = this.start;
            return n7 - n8;
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(Object object) {
        int n3;
        int n4;
        float f5;
        float[] fArray;
        int n7;
        int n8 = object instanceof Float;
        if (n8 != 0 && (n7 = Floats.access$100(fArray = this.array, f5 = ((Float)(object = (Float)object)).floatValue(), n4 = this.start, n3 = this.end)) >= 0) {
            n8 = this.start;
            return n7 - n8;
        }
        return -1;
    }

    public Float set(int n3, Float f5) {
        float f6;
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        float[] fArray = this.array;
        int n7 = this.start;
        int n8 = n7 + n3;
        float f7 = fArray[n8];
        fArray[n7 += n3] = f6 = ((Float)Preconditions.checkNotNull(f5)).floatValue();
        return Float.valueOf(f7);
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
        float[] fArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Floats$FloatArrayAsList floats$FloatArrayAsList = new Floats$FloatArrayAsList(fArray, n3, n8 += n4);
        return floats$FloatArrayAsList;
    }

    public float[] toFloatArray() {
        float[] fArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(fArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 12;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        float[] fArray = this.array;
        int n4 = this.start;
        float f5 = fArray[n4];
        stringBuilder.append(f5);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            float[] fArray2 = this.array;
            float f6 = fArray2[n3];
            stringBuilder.append(f6);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

