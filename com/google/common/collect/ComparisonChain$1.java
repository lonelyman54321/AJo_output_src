/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ComparisonChain;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

class ComparisonChain$1
extends ComparisonChain {
    public ComparisonChain$1() {
        super(null);
    }

    public ComparisonChain classify(int n3) {
        ComparisonChain comparisonChain = n3 < 0 ? ComparisonChain.access$100() : (n3 > 0 ? ComparisonChain.access$200() : ComparisonChain.access$300());
        return comparisonChain;
    }

    public ComparisonChain compare(double d2, double d5) {
        int n3 = Double.compare(d2, d5);
        return this.classify(n3);
    }

    public ComparisonChain compare(float f5, float f6) {
        int n3 = Float.compare(f5, f6);
        return this.classify(n3);
    }

    public ComparisonChain compare(int n3, int n4) {
        n3 = Ints.compare(n3, n4);
        return this.classify(n3);
    }

    public ComparisonChain compare(long l2, long l3) {
        int n3 = Longs.compare(l2, l3);
        return this.classify(n3);
    }

    public ComparisonChain compare(Comparable comparable, Comparable comparable2) {
        int n3 = comparable.compareTo(comparable2);
        return this.classify(n3);
    }

    public ComparisonChain compare(Object object, Object object2, Comparator comparator) {
        int n3 = comparator.compare(object, object2);
        return this.classify(n3);
    }

    /*
     * WARNING - void declaration
     */
    public ComparisonChain compareFalseFirst(boolean bl2, boolean bl3) {
        void var2_3;
        int n3 = Booleans.compare(bl2, (boolean)var2_3);
        return this.classify(n3);
    }

    /*
     * WARNING - void declaration
     */
    public ComparisonChain compareTrueFirst(boolean bl2, boolean bl3) {
        void var2_3;
        int n3 = Booleans.compare((boolean)var2_3, bl2);
        return this.classify(n3);
    }

    public int result() {
        return 0;
    }
}

