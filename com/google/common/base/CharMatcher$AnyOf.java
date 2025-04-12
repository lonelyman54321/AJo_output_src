/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import java.util.Arrays;
import java.util.BitSet;

final class CharMatcher$AnyOf
extends CharMatcher {
    private final char[] chars;

    public CharMatcher$AnyOf(CharSequence object) {
        object = object.toString().toCharArray();
        this.chars = (char[])object;
        Arrays.sort((char[])object);
    }

    public boolean matches(char c2) {
        char[] cArray = this.chars;
        c2 = (c2 = (char)Arrays.binarySearch(cArray, c2)) >= '\u0000' ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }

    public void setBits(BitSet bitSet) {
        for (char c2 : this.chars) {
            bitSet.set(c2);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c2 : this.chars) {
            String string2 = CharMatcher.access$100(c2);
            stringBuilder.append(string2);
        }
        stringBuilder.append("\")");
        return stringBuilder.toString();
    }
}

