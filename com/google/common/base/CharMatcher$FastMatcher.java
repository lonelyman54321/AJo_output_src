/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$NegatedFastMatcher;

abstract class CharMatcher$FastMatcher
extends CharMatcher {
    public CharMatcher negate() {
        CharMatcher$NegatedFastMatcher charMatcher$NegatedFastMatcher = new CharMatcher$NegatedFastMatcher(this);
        return charMatcher$NegatedFastMatcher;
    }

    public final CharMatcher precomputed() {
        return this;
    }
}

