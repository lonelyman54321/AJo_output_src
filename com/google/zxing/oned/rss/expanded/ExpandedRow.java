/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

final class ExpandedRow {
    private final List pairs;
    private final int rowNumber;
    private final boolean wasReversed;

    public ExpandedRow(List list, int n3, boolean bl2) {
        ArrayList arrayList;
        this.pairs = arrayList = new ArrayList(list);
        this.rowNumber = n3;
        this.wasReversed = bl2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ExpandedRow;
        if (!bl3) {
            return false;
        }
        List list = this.pairs;
        List list2 = ((ExpandedRow)(object = (ExpandedRow)object)).getPairs();
        bl3 = list.equals(list2);
        return bl3 && (bl3 = this.wasReversed) == (bl2 = ((ExpandedRow)object).wasReversed);
    }

    public List getPairs() {
        return this.pairs;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int hashCode() {
        int n3 = this.pairs.hashCode();
        int n4 = Boolean.valueOf(this.wasReversed).hashCode();
        return n3 ^ n4;
    }

    public boolean isEquivalent(List list) {
        return this.pairs.equals(list);
    }

    public boolean isReversed() {
        return this.wasReversed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        List list = this.pairs;
        stringBuilder.append(list);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

