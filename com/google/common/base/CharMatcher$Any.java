/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$NamedFastMatcher;
import com.google.common.base.Preconditions;
import java.util.Arrays;

final class CharMatcher$Any
extends CharMatcher$NamedFastMatcher {
    static final CharMatcher$Any INSTANCE;

    static {
        CharMatcher$Any charMatcher$Any;
        INSTANCE = charMatcher$Any = new CharMatcher$Any();
    }

    private CharMatcher$Any() {
        super("CharMatcher.any()");
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return (CharMatcher)Preconditions.checkNotNull(charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int n3 = charSequence.length();
        charSequence = n3 == 0 ? "" : String.valueOf(c2);
        return charSequence;
    }

    public int countIn(CharSequence charSequence) {
        return charSequence.length();
    }

    public int indexIn(CharSequence charSequence) {
        int n3 = charSequence.length();
        if (n3 == 0) {
            n3 = -1;
        } else {
            n3 = 0;
            charSequence = null;
        }
        return n3;
    }

    public int indexIn(CharSequence charSequence, int n3) {
        int n4 = charSequence.length();
        Preconditions.checkPositionIndex(n3, n4);
        if (n3 == n4) {
            n3 = -1;
        }
        return n3;
    }

    public int lastIndexIn(CharSequence charSequence) {
        return charSequence.length() + -1;
    }

    public boolean matches(char c2) {
        return true;
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return true;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        int n3 = charSequence.length();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            charSequence = null;
        }
        return n3 != 0;
    }

    public CharMatcher negate() {
        return CharMatcher.none();
    }

    public CharMatcher or(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return this;
    }

    public String removeFrom(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return "";
    }

    public String replaceFrom(CharSequence object, char c2) {
        object = new char[object.length()];
        Arrays.fill((char[])object, c2);
        String string2 = new String((char[])object);
        return string2;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int n3 = charSequence.length();
        int n4 = charSequence2.length() * n3;
        StringBuilder stringBuilder = new StringBuilder(n4);
        for (n3 = 0; n3 < (n4 = charSequence.length()); ++n3) {
            stringBuilder.append(charSequence2);
        }
        return stringBuilder.toString();
    }

    public String trimFrom(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return "";
    }
}

