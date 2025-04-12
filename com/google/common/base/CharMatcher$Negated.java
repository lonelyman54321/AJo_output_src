/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import java.util.BitSet;

class CharMatcher$Negated
extends CharMatcher {
    final CharMatcher original;

    public CharMatcher$Negated(CharMatcher charMatcher) {
        this.original = charMatcher = (CharMatcher)Preconditions.checkNotNull(charMatcher);
    }

    public int countIn(CharSequence charSequence) {
        int n3 = charSequence.length();
        int n4 = this.original.countIn(charSequence);
        return n3 - n4;
    }

    public boolean matches(char c2) {
        return this.original.matches(c2) ^ true;
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        return this.original.matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return this.original.matchesAllOf(charSequence);
    }

    public CharMatcher negate() {
        return this.original;
    }

    public void setBits(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.original.setBits(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharMatcher charMatcher = this.original;
        stringBuilder.append(charMatcher);
        stringBuilder.append(".negate()");
        return stringBuilder.toString();
    }
}

