/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$FastMatcher;
import com.google.common.base.Preconditions;
import java.util.BitSet;

final class CharMatcher$InRange
extends CharMatcher$FastMatcher {
    private final char endInclusive;
    private final char startInclusive;

    public CharMatcher$InRange(char c2, char c3) {
        boolean bl2 = c3 >= c2;
        Preconditions.checkArgument(bl2);
        this.startInclusive = c2;
        this.endInclusive = c3;
    }

    public boolean matches(char c2) {
        char c3 = this.startInclusive;
        c2 = c3 <= c2 && c2 <= (c3 = this.endInclusive) ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public void setBits(BitSet bitSet) {
        char c2 = this.startInclusive;
        int n3 = this.endInclusive + '\u0001';
        bitSet.set((int)c2, n3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.inRange('");
        String string2 = CharMatcher.access$100(this.startInclusive);
        stringBuilder.append(string2);
        stringBuilder.append("', '");
        string2 = CharMatcher.access$100(this.endInclusive);
        stringBuilder.append(string2);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

