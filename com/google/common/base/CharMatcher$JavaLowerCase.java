/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;

final class CharMatcher$JavaLowerCase
extends CharMatcher {
    static final CharMatcher$JavaLowerCase INSTANCE;

    static {
        CharMatcher$JavaLowerCase charMatcher$JavaLowerCase;
        INSTANCE = charMatcher$JavaLowerCase = new CharMatcher$JavaLowerCase();
    }

    private CharMatcher$JavaLowerCase() {
    }

    public boolean matches(char c2) {
        return Character.isLowerCase(c2);
    }

    public String toString() {
        return "CharMatcher.javaLowerCase()";
    }
}

