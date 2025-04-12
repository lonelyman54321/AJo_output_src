/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Shorts;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Shorts$ShortArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final short[] array;
    final int end;
    final int start;

    public Shorts$ShortArrayAsList(short[] sArray) {
        int n3 = sArray.length;
        this(sArray, 0, n3);
    }

    public Shorts$ShortArrayAsList(short[] sArray, int n3, int n4) {
        this.array = sArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Short;
        if (n3 == 0) return 0 != 0;
        short[] sArray = this.array;
        object = (Short)object;
        int n4 = ((Short)object).shortValue();
        int n7 = this.start;
        int n8 = this.end;
        if ((n4 = Shorts.access$000(sArray, (short)n4, n7, n8)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Shorts$ShortArrayAsList;
        if (n3 != 0) {
            object = (Shorts$ShortArrayAsList)object;
            n3 = this.size();
            int n4 = ((Shorts$ShortArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                short[] sArray = this.array;
                int n7 = this.start + n4;
                short s7 = sArray[n7];
                short[] sArray2 = ((Shorts$ShortArrayAsList)object).array;
                int n8 = ((Shorts$ShortArrayAsList)object).start + n4;
                if (s7 == (n7 = sArray2[n8])) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Short get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        short[] sArray = this.array;
        int n7 = this.start + n3;
        return sArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            short[] sArray = this.array;
            n3 = Shorts.hashCode(sArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Short;
        if (n3 != 0) {
            short[] sArray = this.array;
            object = (Short)object;
            int n4 = ((Short)object).shortValue();
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Shorts.access$000(sArray, (short)n4, n7, n8)) >= 0) {
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
        int n3 = object instanceof Short;
        if (n3 != 0) {
            short[] sArray = this.array;
            object = (Short)object;
            int n4 = ((Short)object).shortValue();
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Shorts.access$100(sArray, (short)n4, n7, n8)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public Short set(int n3, Short s7) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        short[] sArray = this.array;
        int n7 = this.start;
        short s8 = n7 + n3;
        s8 = sArray[s8];
        n7 += n3;
        sArray[n7] = n3 = (int)((Short)Preconditions.checkNotNull(s7)).shortValue();
        return s8;
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
        short[] sArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Shorts$ShortArrayAsList shorts$ShortArrayAsList = new Shorts$ShortArrayAsList(sArray, n3, n8 += n4);
        return shorts$ShortArrayAsList;
    }

    public short[] toShortArray() {
        short[] sArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(sArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 6;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        short[] sArray = this.array;
        int n4 = this.start;
        n3 = sArray[n4];
        stringBuilder.append(n3);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            short[] sArray2 = this.array;
            n4 = sArray2[n3];
            stringBuilder.append(n4);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

