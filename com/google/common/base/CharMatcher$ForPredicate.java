/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

final class CharMatcher$ForPredicate
extends CharMatcher {
    private final Predicate predicate;

    public CharMatcher$ForPredicate(Predicate predicate) {
        this.predicate = predicate = (Predicate)Preconditions.checkNotNull(predicate);
    }

    public boolean apply(Character object) {
        Predicate predicate = this.predicate;
        object = Preconditions.checkNotNull(object);
        return predicate.apply(object);
    }

    public boolean matches(char c2) {
        Predicate predicate = this.predicate;
        Character c3 = Character.valueOf(c2);
        return predicate.apply(c3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.forPredicate(");
        Predicate predicate = this.predicate;
        stringBuilder.append(predicate);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

