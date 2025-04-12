/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;

final class CharMatcher$JavaUpperCase
extends CharMatcher {
    static final CharMatcher$JavaUpperCase INSTANCE;

    static {
        CharMatcher$JavaUpperCase charMatcher$JavaUpperCase;
        INSTANCE = charMatcher$JavaUpperCase = new CharMatcher$JavaUpperCase();
    }

    private CharMatcher$JavaUpperCase() {
    }

    public boolean matches(char c2) {
        return Character.isUpperCase(c2);
    }

    public String toString() {
        return "CharMatcher.javaUpperCase()";
    }
}

