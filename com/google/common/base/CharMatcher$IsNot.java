/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$FastMatcher;
import java.util.BitSet;

final class CharMatcher$IsNot
extends CharMatcher$FastMatcher {
    private final char match;

    public CharMatcher$IsNot(char c2) {
        this.match = c2;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        char c2 = this.match;
        if ((c2 = (char)(charMatcher.matches(c2) ? 1 : 0)) != '\u0000') {
            charMatcher = super.and(charMatcher);
        }
        return charMatcher;
    }

    public boolean matches(char c2) {
        char c3 = this.match;
        c2 = c2 != c3 ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public CharMatcher negate() {
        return CharMatcher.is(this.match);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        char c2 = this.match;
        boolean bl2 = charMatcher.matches(c2);
        charMatcher = bl2 ? CharMatcher.any() : this;
        return charMatcher;
    }

    public void setBits(BitSet bitSet) {
        char c2 = this.match;
        bitSet.set(0, c2);
        int n3 = this.match + '\u0001';
        bitSet.set(n3, 65536);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.isNot('");
        String string2 = CharMatcher.access$100(this.match);
        stringBuilder.append(string2);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

