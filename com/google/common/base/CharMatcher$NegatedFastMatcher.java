/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$Negated;

class CharMatcher$NegatedFastMatcher
extends CharMatcher$Negated {
    public CharMatcher$NegatedFastMatcher(CharMatcher charMatcher) {
        super(charMatcher);
    }

    public final CharMatcher precomputed() {
        return this;
    }
}

