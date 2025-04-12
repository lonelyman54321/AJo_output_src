/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Booleans$BooleanArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final boolean[] array;
    final int end;
    final int start;

    public Booleans$BooleanArrayAsList(boolean[] blArray) {
        int n3 = blArray.length;
        this(blArray, 0, n3);
    }

    public Booleans$BooleanArrayAsList(boolean[] blArray, int n3, int n4) {
        this.array = blArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Boolean;
        if (n3 == 0) return 0 != 0;
        boolean[] blArray = this.array;
        object = (Boolean)object;
        int n4 = ((Boolean)object).booleanValue();
        int n7 = this.start;
        int n8 = this.end;
        if ((n4 = Booleans.access$000(blArray, n4 != 0, n7, n8)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Booleans$BooleanArrayAsList;
        if (n3 != 0) {
            object = (Booleans$BooleanArrayAsList)object;
            n3 = this.size();
            int n4 = ((Booleans$BooleanArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                boolean[] blArray = this.array;
                int n7 = this.start + n4;
                int n8 = blArray[n7];
                boolean[] blArray2 = ((Booleans$BooleanArrayAsList)object).array;
                int n10 = ((Booleans$BooleanArrayAsList)object).start + n4;
                if (n8 == (n7 = blArray2[n10])) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Boolean get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        boolean[] blArray = this.array;
        int n7 = this.start + n3;
        return blArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.array;
            n3 = Booleans.hashCode(blArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3;
        int n4;
        boolean n42;
        boolean[] blArray;
        int n7;
        int n32 = object instanceof Boolean;
        if (n32 != 0 && (n7 = Booleans.access$000(blArray = this.array, n42 = ((Boolean)(object = (Boolean)object)).booleanValue(), n4 = this.start, n3 = this.end)) >= 0) {
            n32 = this.start;
            return n7 - n32;
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(Object object) {
        int n3;
        int n4;
        boolean n42;
        boolean[] blArray;
        int n7;
        int n32 = object instanceof Boolean;
        if (n32 != 0 && (n7 = Booleans.access$100(blArray = this.array, n42 = ((Boolean)(object = (Boolean)object)).booleanValue(), n4 = this.start, n3 = this.end)) >= 0) {
            n32 = this.start;
            return n7 - n32;
        }
        return -1;
    }

    public Boolean set(int n3, Boolean bl2) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        boolean[] blArray = this.array;
        int n7 = this.start;
        int bl3 = n7 + n3;
        boolean bl4 = blArray[bl3];
        n7 += n3;
        blArray[n7] = n3 = (int)(((Boolean)Preconditions.checkNotNull(bl2)).booleanValue() ? 1 : 0);
        return bl4;
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
        boolean[] blArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Booleans$BooleanArrayAsList booleans$BooleanArrayAsList = new Booleans$BooleanArrayAsList(blArray, n3, n8 += n4);
        return booleans$BooleanArrayAsList;
    }

    public boolean[] toBooleanArray() {
        boolean[] blArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(blArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 7;
        StringBuilder stringBuilder = new StringBuilder(n3);
        Object object = this.array;
        int n4 = this.start;
        n3 = object[n4];
        object = n3 != 0 ? (Object)"[true" : (Object)"[false";
        stringBuilder.append((String)object);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            Object object2 = this.array;
            n4 = object2[n3];
            object2 = n4 != 0 ? (Object)", true" : (Object)", false";
            stringBuilder.append((String)object2);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

