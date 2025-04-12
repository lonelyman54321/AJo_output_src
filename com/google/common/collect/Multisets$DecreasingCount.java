/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Multiset$Entry;
import java.util.Comparator;

final class Multisets$DecreasingCount
implements Comparator {
    static final Multisets$DecreasingCount INSTANCE;

    static {
        Multisets$DecreasingCount multisets$DecreasingCount;
        INSTANCE = multisets$DecreasingCount = new Multisets$DecreasingCount();
    }

    private Multisets$DecreasingCount() {
    }

    public int compare(Multiset$Entry multiset$Entry, Multiset$Entry multiset$Entry2) {
        int n3 = multiset$Entry2.getCount();
        int n4 = multiset$Entry.getCount();
        return n3 - n4;
    }
}

