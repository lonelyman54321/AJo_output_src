/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CommonPattern;
import com.google.common.base.Platform;
import com.google.common.base.Predicates$ContainsPatternPredicate;

class Predicates$ContainsPatternFromStringPredicate
extends Predicates$ContainsPatternPredicate {
    private static final long serialVersionUID;

    public Predicates$ContainsPatternFromStringPredicate(String object) {
        object = Platform.compilePattern((String)object);
        super((CommonPattern)object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Predicates.containsPattern(");
        String string2 = this.pattern.pattern();
        return h30_0.a(stringBuilder, string2, ")");
    }
}

