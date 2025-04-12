/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher$NamedFastMatcher;
import java.util.BitSet;

final class CharMatcher$Whitespace
extends CharMatcher$NamedFastMatcher {
    static final CharMatcher$Whitespace INSTANCE;
    static final int MULTIPLIER = 1682554634;
    static final int SHIFT = 0;
    static final String TABLE = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000";

    static {
        CharMatcher$Whitespace charMatcher$Whitespace;
        SHIFT = Integer.numberOfLeadingZeros(31);
        INSTANCE = charMatcher$Whitespace = new CharMatcher$Whitespace();
    }

    public CharMatcher$Whitespace() {
        super("CharMatcher.whitespace()");
    }

    public boolean matches(char c2) {
        int n3 = 1682554634 * c2;
        int n4 = SHIFT;
        n3 >>>= n4;
        String string2 = TABLE;
        c2 = (n3 = (int)string2.charAt(n3)) == c2 ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public void setBits(BitSet bitSet) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 32); ++i3) {
            String string2 = TABLE;
            n3 = string2.charAt(i3);
            bitSet.set(n3);
        }
    }
}

