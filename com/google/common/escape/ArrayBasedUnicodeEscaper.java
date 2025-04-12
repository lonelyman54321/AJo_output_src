/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Preconditions;
import com.google.common.escape.ArrayBasedEscaperMap;
import com.google.common.escape.UnicodeEscaper;
import java.util.Map;

public abstract class ArrayBasedUnicodeEscaper
extends UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    public ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap object, int n3, int n4, String string2) {
        int n7;
        Preconditions.checkNotNull(object);
        object = ((ArrayBasedEscaperMap)object).getReplacementArray();
        this.replacements = (char[][])object;
        this.replacementsLength = n7 = ((Object)object).length;
        if (n4 < n3) {
            n4 = -1;
            n3 = -1 >>> 1;
        }
        this.safeMin = n3;
        this.safeMax = n4;
        n7 = 55296;
        if (n3 >= n7) {
            this.safeMinChar = (char)-1;
            n7 = 0;
            object = null;
            this.safeMaxChar = '\u0000';
        } else {
            n7 = (char)n3;
            this.safeMinChar = (char)n7;
            n7 = (char)Math.min(n4, 55295);
            this.safeMaxChar = (char)n7;
        }
    }

    public ArrayBasedUnicodeEscaper(Map object, int n3, int n4, String string2) {
        object = ArrayBasedEscaperMap.create((Map)object);
        this((ArrayBasedEscaperMap)object, n3, n4, string2);
    }

    public final String escape(String string2) {
        int n3;
        Preconditions.checkNotNull(string2);
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            char[] cArray;
            int n4;
            n3 = string2.charAt(i3);
            if ((n3 >= (n4 = this.replacementsLength) || (cArray = this.replacements[n3]) == null) && n3 <= (n4 = (int)this.safeMaxChar) && n3 >= (n4 = (int)this.safeMinChar)) {
                continue;
            }
            string2 = this.escapeSlow(string2, i3);
            break;
        }
        return string2;
    }

    public final char[] escape(int n3) {
        char[] cArray;
        int n4 = this.replacementsLength;
        if (n3 < n4 && (cArray = this.replacements[n3]) != null) {
            return cArray;
        }
        n4 = this.safeMin;
        if (n3 >= n4 && n3 <= (n4 = this.safeMax)) {
            return null;
        }
        return this.escapeUnsafe(n3);
    }

    public abstract char[] escapeUnsafe(int var1);

    public final int nextEscapeIndex(CharSequence charSequence, int n3, int n4) {
        char[] cArray;
        int n7;
        char c2;
        while (n3 < n4 && ((c2 = charSequence.charAt(n3)) >= (n7 = this.replacementsLength) || (cArray = this.replacements[c2]) == null) && c2 <= (n7 = (int)this.safeMaxChar) && c2 >= (n7 = (int)this.safeMinChar)) {
            ++n3;
        }
        return n3;
    }
}

