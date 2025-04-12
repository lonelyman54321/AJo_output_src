/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder$1;
import java.io.Serializable;
import java.util.Comparator;

final class FinderPatternFinder$CenterComparator
implements Serializable,
Comparator {
    private final float average;

    private FinderPatternFinder$CenterComparator(float f5) {
        this.average = f5;
    }

    public /* synthetic */ FinderPatternFinder$CenterComparator(float f5, FinderPatternFinder$1 finderPatternFinder$1) {
        this(f5);
    }

    public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        int n3 = finderPattern2.getCount();
        int n4 = finderPattern.getCount();
        if ((n3 = Integer.compare(n3, n4)) == 0) {
            float f5 = finderPattern.getEstimatedModuleSize();
            float f6 = this.average;
            f5 = Math.abs(f5 - f6);
            float f7 = finderPattern2.getEstimatedModuleSize();
            f6 = this.average;
            f7 = Math.abs(f7 - f6);
            return Float.compare(f5, f7);
        }
        return n3;
    }
}

