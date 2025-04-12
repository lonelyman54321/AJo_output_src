/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;

final class CharMatcher$JavaDigit
extends CharMatcher {
    static final CharMatcher$JavaDigit INSTANCE;

    static {
        CharMatcher$JavaDigit charMatcher$JavaDigit;
        INSTANCE = charMatcher$JavaDigit = new CharMatcher$JavaDigit();
    }

    private CharMatcher$JavaDigit() {
    }

    public boolean matches(char c2) {
        return Character.isDigit(c2);
    }

    public String toString() {
        return "CharMatcher.javaDigit()";
    }
}

