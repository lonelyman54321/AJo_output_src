/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import java.util.BitSet;

final class CharMatcher$And
extends CharMatcher {
    final CharMatcher first;
    final CharMatcher second;

    public CharMatcher$And(CharMatcher charMatcher, CharMatcher charMatcher2) {
        this.first = charMatcher = (CharMatcher)Preconditions.checkNotNull(charMatcher);
        this.second = charMatcher = (CharMatcher)Preconditions.checkNotNull(charMatcher2);
    }

    public boolean matches(char c2) {
        CharMatcher charMatcher = this.first;
        boolean bl2 = charMatcher.matches(c2);
        c2 = bl2 && (c2 = (char)((charMatcher = this.second).matches(c2) ? 1 : 0)) != '\u0000' ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public void setBits(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.first.setBits(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.second.setBits(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.and(");
        CharMatcher charMatcher = this.first;
        stringBuilder.append(charMatcher);
        stringBuilder.append(", ");
        charMatcher = this.second;
        stringBuilder.append(charMatcher);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

