/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

final class Pair
extends DataCharacter {
    private int count;
    private final FinderPattern finderPattern;

    public Pair(int n3, int n4, FinderPattern finderPattern) {
        super(n3, n4);
        this.finderPattern = finderPattern;
    }

    public int getCount() {
        return this.count;
    }

    public FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    public void incrementCount() {
        int n3;
        this.count = n3 = this.count + 1;
    }
}

