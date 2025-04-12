/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;

final class CharMatcher$JavaLetterOrDigit
extends CharMatcher {
    static final CharMatcher$JavaLetterOrDigit INSTANCE;

    static {
        CharMatcher$JavaLetterOrDigit charMatcher$JavaLetterOrDigit;
        INSTANCE = charMatcher$JavaLetterOrDigit = new CharMatcher$JavaLetterOrDigit();
    }

    private CharMatcher$JavaLetterOrDigit() {
    }

    public boolean matches(char c2) {
        return Character.isLetterOrDigit(c2);
    }

    public String toString() {
        return "CharMatcher.javaLetterOrDigit()";
    }
}

