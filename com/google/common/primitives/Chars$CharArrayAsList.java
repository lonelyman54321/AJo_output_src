/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Chars;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class Chars$CharArrayAsList
extends AbstractList
implements RandomAccess,
Serializable {
    private static final long serialVersionUID;
    final char[] array;
    final int end;
    final int start;

    public Chars$CharArrayAsList(char[] cArray) {
        int n3 = cArray.length;
        this(cArray, 0, n3);
    }

    public Chars$CharArrayAsList(char[] cArray, int n3, int n4) {
        this.array = cArray;
        this.start = n3;
        this.end = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean contains(Object object) {
        int n3 = object instanceof Character;
        if (n3 == 0) return 0 != 0;
        char[] cArray = this.array;
        object = (Character)object;
        int n4 = ((Character)object).charValue();
        int n7 = this.start;
        int n8 = this.end;
        if ((n4 = Chars.access$000(cArray, (char)n4, n7, n8)) == (n3 = -1)) return 0 != 0;
        return 1 != 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof Chars$CharArrayAsList;
        if (n3 != 0) {
            object = (Chars$CharArrayAsList)object;
            n3 = this.size();
            int n4 = ((Chars$CharArrayAsList)object).size();
            if (n4 != n3) {
                return false;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                char[] cArray = this.array;
                int n7 = this.start + n4;
                char c2 = cArray[n7];
                char[] cArray2 = ((Chars$CharArrayAsList)object).array;
                int n8 = ((Chars$CharArrayAsList)object).start + n4;
                if (c2 == (n7 = cArray2[n8])) continue;
                return false;
            }
            return bl2;
        }
        return super.equals(object);
    }

    public Character get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        char[] cArray = this.array;
        int n7 = this.start + n3;
        return Character.valueOf(cArray[n7]);
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            char[] cArray = this.array;
            n3 = Chars.hashCode(cArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(Object object) {
        int n3 = object instanceof Character;
        if (n3 != 0) {
            char[] cArray = this.array;
            object = (Character)object;
            int n4 = ((Character)object).charValue();
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Chars.access$000(cArray, (char)n4, n7, n8)) >= 0) {
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
        int n3 = object instanceof Character;
        if (n3 != 0) {
            char[] cArray = this.array;
            object = (Character)object;
            int n4 = ((Character)object).charValue();
            int n7 = this.start;
            int n8 = this.end;
            if ((n4 = Chars.access$100(cArray, (char)n4, n7, n8)) >= 0) {
                n3 = this.start;
                return n4 - n3;
            }
        }
        return -1;
    }

    public Character set(int n3, Character c2) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        char[] cArray = this.array;
        int n7 = this.start;
        char c3 = n7 + n3;
        c3 = cArray[c3];
        n7 += n3;
        cArray[n7] = n3 = (int)((Character)Preconditions.checkNotNull(c2)).charValue();
        return Character.valueOf(c3);
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
        char[] cArray = this.array;
        int n8 = this.start;
        n3 += n8;
        Chars$CharArrayAsList chars$CharArrayAsList = new Chars$CharArrayAsList(cArray, n3, n8 += n4);
        return chars$CharArrayAsList;
    }

    public char[] toCharArray() {
        char[] cArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(cArray, n3, n4);
    }

    public String toString() {
        char c2;
        int n3 = this.size() * 3;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        char[] cArray = this.array;
        int c22 = this.start;
        n3 = cArray[c22];
        stringBuilder.append((char)n3);
        n3 = this.start;
        while (++n3 < (c2 = this.end)) {
            stringBuilder.append(", ");
            char[] cArray2 = this.array;
            c2 = cArray2[n3];
            stringBuilder.append(c2);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

