/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$FastMatcher;
import java.util.BitSet;

final class CharMatcher$Is
extends CharMatcher$FastMatcher {
    private final char match;

    public CharMatcher$Is(char c2) {
        this.match = c2;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        char c2 = this.match;
        boolean bl2 = charMatcher.matches(c2);
        charMatcher = bl2 ? this : CharMatcher.none();
        return charMatcher;
    }

    public boolean matches(char c2) {
        char c3 = this.match;
        c2 = c2 == c3 ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public CharMatcher negate() {
        return CharMatcher.isNot(this.match);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        char c2 = this.match;
        if ((c2 = (char)(charMatcher.matches(c2) ? 1 : 0)) == '\u0000') {
            charMatcher = super.or(charMatcher);
        }
        return charMatcher;
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        charSequence = charSequence.toString();
        char c3 = this.match;
        return ((String)charSequence).replace(c3, c2);
    }

    public void setBits(BitSet bitSet) {
        char c2 = this.match;
        bitSet.set(c2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.is('");
        String string2 = CharMatcher.access$100(this.match);
        stringBuilder.append(string2);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

