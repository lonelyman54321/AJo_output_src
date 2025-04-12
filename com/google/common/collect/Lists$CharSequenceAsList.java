/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractList;

final class Lists$CharSequenceAsList
extends AbstractList {
    private final CharSequence sequence;

    public Lists$CharSequenceAsList(CharSequence charSequence) {
        this.sequence = charSequence;
    }

    public Character get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        return Character.valueOf(this.sequence.charAt(n3));
    }

    public int size() {
        return this.sequence.length();
    }
}

