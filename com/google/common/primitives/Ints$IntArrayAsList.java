/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Ints$IntArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final int[] array;
    final int end;
    final int start;

    public Ints$IntArrayAsList(int[] nArray) {
        int n3 = nArray.length;
        this(nArray, 0, n3);
    }

    public Ints$IntArrayAsList(int[] nArray, int n3, int n4) {
        this.array = nArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Integer;
        if (n3 == 0) return 0 != 0;
        int[] nArray = this.array;
        object = (Integer)object;
        int n4 = (Integer)object;
        int n7 = this.start;
        int n8 = this.end;
        if ((n4 = Ints.access$000(nArray, n4, n7, n8)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Ints$IntArrayAsList;
        if (n3 != 0) {
            object = (Ints$IntArrayAsList)object;
            n3 = this.size();
            int n4 = ((Ints$IntArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                int[] nArray = this.array;
                int n7 = this.start + n4;
                int n8 = nArray[n7];
                int[] nArray2 = ((Ints$IntArrayAsList)object).array;
                int n10 = ((Ints$IntArrayAsList)object).start + n4;
                if (n8 == (n7 = nArray2[n10])) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Integer get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        int[] nArray = this.array;
        int n7 = this.start + n3;
        return nArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            int[] nArray = this.array;
            n3 = Ints.hashCode(nArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Integer;
        if (n3 != 0) {
            int[] nArray = this.array;
            object = (Integer)object;
            int n4 = (Integer)object;
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Ints.access$000(nArray, n4, n7, n8)) >= 0) {
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
        int n3 = object instanceof Integer;
        if (n3 != 0) {
            int[] nArray = this.array;
            object = (Integer)object;
            int n4 = (Integer)object;
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Ints.access$100(nArray, n4, n7, n8)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public Integer set(int n3, Integer n4) {
        int n7 = this.size();
        Preconditions.checkElementIndex(n3, n7);
        int[] nArray = this.array;
        int n8 = this.start;
        int n10 = n8 + n3;
        n10 = nArray[n10];
        n8 += n3;
        nArray[n8] = n3 = ((Integer)Preconditions.checkNotNull(n4)).intValue();
        return n10;
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
        int[] nArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Ints$IntArrayAsList ints$IntArrayAsList = new Ints$IntArrayAsList(nArray, n3, n8 += n4);
        return ints$IntArrayAsList;
    }

    public int[] toIntArray() {
        int[] nArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(nArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 5;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        int[] nArray = this.array;
        int n4 = this.start;
        n3 = nArray[n4];
        stringBuilder.append(n3);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            int[] nArray2 = this.array;
            n4 = nArray2[n3];
            stringBuilder.append(n4);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

