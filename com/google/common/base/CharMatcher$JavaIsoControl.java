/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher$NamedFastMatcher;

final class CharMatcher$JavaIsoControl
extends CharMatcher$NamedFastMatcher {
    static final CharMatcher$JavaIsoControl INSTANCE;

    static {
        CharMatcher$JavaIsoControl charMatcher$JavaIsoControl;
        INSTANCE = charMatcher$JavaIsoControl = new CharMatcher$JavaIsoControl();
    }

    private CharMatcher$JavaIsoControl() {
        super("CharMatcher.javaIsoControl()");
    }

    public boolean matches(char n3) {
        int n4 = 31;
        n3 = n3 > n4 && (n3 < (n4 = 127) || n3 > (n4 = 159)) ? 0 : 1;
        return n3 != 0;
    }
}

