/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher$NamedFastMatcher;

final class CharMatcher$Ascii
extends CharMatcher$NamedFastMatcher {
    static final CharMatcher$Ascii INSTANCE;

    static {
        CharMatcher$Ascii charMatcher$Ascii;
        INSTANCE = charMatcher$Ascii = new CharMatcher$Ascii();
    }

    public CharMatcher$Ascii() {
        super("CharMatcher.ascii()");
    }

    public boolean matches(char c2) {
        char c3 = '\u007f';
        c2 = c2 <= c3 ? (char)'\u0001' : '\u0000';
        return c2 != 0;
    }
}

