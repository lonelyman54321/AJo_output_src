/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$FastMatcher;
import java.util.BitSet;

final class CharMatcher$IsEither
extends CharMatcher$FastMatcher {
    private final char match1;
    private final char match2;

    public CharMatcher$IsEither(char c2, char c3) {
        this.match1 = c2;
        this.match2 = c3;
    }

    public boolean matches(char c2) {
        char c3 = this.match1;
        c2 = c2 != c3 && c2 != (c3 = this.match2) ? (char)'\u0000' : '\u0001';
        return c2 != 0;
    }

    public void setBits(BitSet bitSet) {
        char c2 = this.match1;
        bitSet.set(c2);
        c2 = this.match2;
        bitSet.set(c2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
        String string2 = CharMatcher.access$100(this.match1);
        stringBuilder.append(string2);
        string2 = CharMatcher.access$100(this.match2);
        stringBuilder.append(string2);
        stringBuilder.append("\")");
        return stringBuilder.toString();
    }
}

