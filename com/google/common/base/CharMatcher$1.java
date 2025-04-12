/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.CharMatcher$NegatedFastMatcher;

class CharMatcher$1
extends CharMatcher$NegatedFastMatcher {
    final /* synthetic */ String val$description;

    public CharMatcher$1(CharMatcher charMatcher, CharMatcher charMatcher2, String string2) {
        this.val$description = string2;
        super(charMatcher2);
    }

    public String toString() {
        return this.val$description;
    }
}

