/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Longs$LongArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final long[] array;
    final int end;
    final int start;

    public Longs$LongArrayAsList(long[] lArray) {
        int n3 = lArray.length;
        this(lArray, 0, n3);
    }

    public Longs$LongArrayAsList(long[] lArray, int n3, int n4) {
        this.array = lArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Long;
        if (n3 == 0) return 0 != 0;
        long[] lArray = this.array;
        object = (Long)object;
        long l2 = (Long)object;
        int n4 = this.start;
        int n7 = this.end;
        if ((n4 = Longs.access$000(lArray, l2, n4, n7)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Longs$LongArrayAsList;
        if (n3 != 0) {
            object = (Longs$LongArrayAsList)object;
            n3 = this.size();
            int n4 = ((Longs$LongArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                long[] lArray = this.array;
                int n7 = this.start + n4;
                long l2 = lArray[n7];
                int n8 = ((Longs$LongArrayAsList)object).start + n4;
                long l3 = (lArray = ((Longs$LongArrayAsList)object).array)[n8];
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 == false) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Long get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        long[] lArray = this.array;
        int n7 = this.start + n3;
        return lArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            long[] lArray = this.array;
            long l2 = lArray[i3];
            n3 = Longs.hashCode(l2);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Long;
        if (n3 != 0) {
            long[] lArray = this.array;
            object = (Long)object;
            long l2 = (Long)object;
            int n4 = this.start;
            int n7 = this.end;
            if ((n4 = Longs.access$000(lArray, l2, n4, n7)) >= 0) {
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
        int n3 = object instanceof Long;
        if (n3 != 0) {
            long[] lArray = this.array;
            object = (Long)object;
            long l2 = (Long)object;
            int n4 = this.start;
            int n7 = this.end;
            if ((n4 = Longs.access$100(lArray, l2, n4, n7)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public Long set(int n3, Long l2) {
        long l3;
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        long[] lArray = this.array;
        int n7 = this.start;
        int n8 = n7 + n3;
        long l4 = lArray[n8];
        lArray[n7 += n3] = l3 = ((Long)Preconditions.checkNotNull(l2)).longValue();
        return l4;
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
        long[] lArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Longs$LongArrayAsList longs$LongArrayAsList = new Longs$LongArrayAsList(lArray, n3, n8 += n4);
        return longs$LongArrayAsList;
    }

    public long[] toLongArray() {
        long[] lArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(lArray, n3, n4);
    }

    public String toString() {
        int n3 = this.size() * 10;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        long[] lArray = this.array;
        int n4 = this.start;
        long l2 = lArray[n4];
        stringBuilder.append(l2);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            long[] lArray2 = this.array;
            long l3 = lArray2[n3];
            stringBuilder.append(l3);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

