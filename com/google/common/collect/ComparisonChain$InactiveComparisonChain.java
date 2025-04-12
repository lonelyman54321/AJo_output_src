/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

final class ComparisonChain$InactiveComparisonChain
extends ComparisonChain {
    final int result;

    public ComparisonChain$InactiveComparisonChain(int n3) {
        super(null);
        this.result = n3;
    }

    public ComparisonChain compare(double d2, double d5) {
        return this;
    }

    public ComparisonChain compare(float f5, float f6) {
        return this;
    }

    public ComparisonChain compare(int n3, int n4) {
        return this;
    }

    public ComparisonChain compare(long l2, long l3) {
        return this;
    }

    public ComparisonChain compare(Comparable comparable, Comparable comparable2) {
        return this;
    }

    public ComparisonChain compare(Object object, Object object2, Comparator comparator) {
        return this;
    }

    public ComparisonChain compareFalseFirst(boolean bl2, boolean bl3) {
        return this;
    }

    public ComparisonChain compareTrueFirst(boolean bl2, boolean bl3) {
        return this;
    }

    public int result() {
        return this.result;
    }
}

