/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;

final class CharMatcher$JavaLetter
extends CharMatcher {
    static final CharMatcher$JavaLetter INSTANCE;

    static {
        CharMatcher$JavaLetter charMatcher$JavaLetter;
        INSTANCE = charMatcher$JavaLetter = new CharMatcher$JavaLetter();
    }

    private CharMatcher$JavaLetter() {
    }

    public boolean matches(char c2) {
        return Character.isLetter(c2);
    }

    public String toString() {
        return "CharMatcher.javaLetter()";
    }
}

