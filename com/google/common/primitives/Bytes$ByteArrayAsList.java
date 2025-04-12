/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Bytes;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Bytes$ByteArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final byte[] array;
    final int end;
    final int start;

    public Bytes$ByteArrayAsList(byte[] byArray) {
        int n3 = byArray.length;
        this(byArray, 0, n3);
    }

    public Bytes$ByteArrayAsList(byte[] byArray, int n3, int n4) {
        this.array = byArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Byte;
        if (n3 == 0) return 0 != 0;
        byte[] byArray = this.array;
        object = (Byte)object;
        int n4 = ((Byte)object).byteValue();
        int n7 = this.start;
        int n8 = this.end;
        if ((n4 = Bytes.access$000(byArray, (byte)n4, n7, n8)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Bytes$ByteArrayAsList;
        if (n3 != 0) {
            object = (Bytes$ByteArrayAsList)object;
            n3 = this.size();
            int n4 = ((Bytes$ByteArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                byte[] byArray = this.array;
                int n7 = this.start + n4;
                byte by2 = byArray[n7];
                byte[] byArray2 = ((Bytes$ByteArrayAsList)object).array;
                int n8 = ((Bytes$ByteArrayAsList)object).start + n4;
                if (by2 == (n7 = byArray2[n8])) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Byte get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        byte[] byArray = this.array;
        int n7 = this.start + n3;
        return byArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            byte[] byArray = this.array;
            n3 = Bytes.hashCode(byArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Byte;
        if (n3 != 0) {
            byte[] byArray = this.array;
            object = (Byte)object;
            int n4 = ((Byte)object).byteValue();
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Bytes.access$000(byArray, (byte)n4, n7, n8)) >= 0) {
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
        int n3 = object instanceof Byte;
        if (n3 != 0) {
            byte[] byArray = this.array;
            object = (Byte)object;
            int n4 = ((Byte)object).byteValue();
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Bytes.access$100(byArray, (byte)n4, n7, n8)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public Byte set(int n3, Byte by2) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        byte[] byArray = this.array;
        int n7 = this.start;
        byte by4 = n7 + n3;
        by4 = byArray[by4];
        n7 += n3;
        byArray[n7] = n3 = (int)((Byte)Preconditions.checkNotNull(by2)).byteValue();
        return by4;
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
        byte[] byArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Bytes$ByteArrayAsList bytes$ByteArrayAsList = new Bytes$ByteArrayAsList(byArray, n3, n8 += n4);
        return bytes$ByteArrayAsList;
    }

    public byte[] toByteArray() {
        byte[] byArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(byArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 5;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        byte[] byArray = this.array;
        int n4 = this.start;
        n3 = byArray[n4];
        stringBuilder.append(n3);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            byte[] byArray2 = this.array;
            n4 = byArray2[n3];
            stringBuilder.append(n4);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

