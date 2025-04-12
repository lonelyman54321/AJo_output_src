/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;

final class CharMatcher$BreakingWhitespace
extends CharMatcher {
    static final CharMatcher INSTANCE;

    static {
        CharMatcher$BreakingWhitespace charMatcher$BreakingWhitespace = new CharMatcher$BreakingWhitespace();
        INSTANCE = charMatcher$BreakingWhitespace;
    }

    private CharMatcher$BreakingWhitespace() {
    }

    public boolean matches(char n3) {
        int n4 = 32;
        boolean bl2 = true;
        if (n3 != n4 && n3 != (n4 = 133) && n3 != (n4 = 5760)) {
            n4 = 8199;
            if (n3 != n4) {
                n4 = 8287;
                if (n3 != n4 && n3 != (n4 = 12288) && n3 != (n4 = 8232) && n3 != (n4 = 8233)) {
                    switch (n3) {
                        default: {
                            n4 = 8192;
                            if (n3 < n4 || n3 > (n4 = 8202)) {
                                bl2 = false;
                            }
                            return bl2;
                        }
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: {
                            return bl2;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return bl2;
    }

    public String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}

