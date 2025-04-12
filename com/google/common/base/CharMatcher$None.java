/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$NamedFastMatcher;
import com.google.common.base.Preconditions;

final class CharMatcher$None
extends CharMatcher$NamedFastMatcher {
    static final CharMatcher$None INSTANCE;

    static {
        CharMatcher$None charMatcher$None;
        INSTANCE = charMatcher$None = new CharMatcher$None();
    }

    private CharMatcher$None() {
        super("CharMatcher.none()");
    }

    public CharMatcher and(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return this;
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return 0;
    }

    public int indexIn(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return -1;
    }

    public int indexIn(CharSequence charSequence, int n3) {
        int n4 = charSequence.length();
        Preconditions.checkPositionIndex(n3, n4);
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return -1;
    }

    public boolean matches(char c2) {
        return false;
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        int n3 = charSequence.length();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            charSequence = null;
        }
        return n3 != 0;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return true;
    }

    public CharMatcher negate() {
        return CharMatcher.any();
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return (CharMatcher)Preconditions.checkNotNull(charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        return charSequence.toString();
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence2);
        return charSequence.toString();
    }

    public String trimFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        return charSequence.toString();
    }
}

