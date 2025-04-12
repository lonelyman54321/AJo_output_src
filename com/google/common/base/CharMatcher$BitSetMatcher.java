/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher$1;
import com.google.common.base.CharMatcher$NamedFastMatcher;
import java.util.BitSet;

final class CharMatcher$BitSetMatcher
extends CharMatcher$NamedFastMatcher {
    private final BitSet table;

    private CharMatcher$BitSetMatcher(BitSet bitSet, String string2) {
        super(string2);
        int n3 = bitSet.length() + 64;
        int n4 = bitSet.size();
        if (n3 < n4) {
            bitSet = (BitSet)bitSet.clone();
        }
        this.table = bitSet;
    }

    public /* synthetic */ CharMatcher$BitSetMatcher(BitSet bitSet, String string2, CharMatcher$1 charMatcher$1) {
        this(bitSet, string2);
    }

    public boolean matches(char c2) {
        return this.table.get(c2);
    }

    public void setBits(BitSet bitSet) {
        BitSet bitSet2 = this.table;
        bitSet.or(bitSet2);
    }
}

