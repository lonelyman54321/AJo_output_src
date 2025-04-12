/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Preconditions;
import com.google.common.escape.ArrayBasedEscaperMap;
import com.google.common.escape.CharEscaper;
import java.util.Map;

public abstract class ArrayBasedCharEscaper
extends CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    public ArrayBasedCharEscaper(ArrayBasedEscaperMap object, char c2, char c3) {
        int n3;
        Preconditions.checkNotNull(object);
        object = ((ArrayBasedEscaperMap)object).getReplacementArray();
        this.replacements = (char[][])object;
        this.replacementsLength = n3 = ((Object)object).length;
        if (c3 < c2) {
            c3 = '\u0000';
            c2 = (char)-1;
        }
        this.safeMin = c2;
        this.safeMax = c3;
    }

    public ArrayBasedCharEscaper(Map object, char c2, char c3) {
        object = ArrayBasedEscaperMap.create((Map)object);
        this((ArrayBasedEscaperMap)object, c2, c3);
    }

    public final String escape(String string2) {
        int n3;
        Preconditions.checkNotNull(string2);
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            char[] cArray;
            int n4;
            n3 = string2.charAt(i3);
            if ((n3 >= (n4 = this.replacementsLength) || (cArray = this.replacements[n3]) == null) && n3 <= (n4 = (int)this.safeMax) && n3 >= (n4 = (int)this.safeMin)) {
                continue;
            }
            string2 = this.escapeSlow(string2, i3);
            break;
        }
        return string2;
    }

    public final char[] escape(char c2) {
        char[] cArray;
        int n3 = this.replacementsLength;
        if (c2 < n3 && (cArray = this.replacements[c2]) != null) {
            return cArray;
        }
        n3 = this.safeMin;
        if (c2 >= n3 && c2 <= (n3 = (int)this.safeMax)) {
            return null;
        }
        return this.escapeUnsafe(c2);
    }

    public abstract char[] escapeUnsafe(char var1);
}

