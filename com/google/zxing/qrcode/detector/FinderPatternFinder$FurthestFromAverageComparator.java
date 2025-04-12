/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder$1;
import java.io.Serializable;
import java.util.Comparator;

final class FinderPatternFinder$FurthestFromAverageComparator
implements Serializable,
Comparator {
    private final float average;

    private FinderPatternFinder$FurthestFromAverageComparator(float f5) {
        this.average = f5;
    }

    public /* synthetic */ FinderPatternFinder$FurthestFromAverageComparator(float f5, FinderPatternFinder$1 finderPatternFinder$1) {
        this(f5);
    }

    public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        float f5 = finderPattern2.getEstimatedModuleSize();
        float f6 = this.average;
        f5 = Math.abs(f5 - f6);
        float f7 = finderPattern.getEstimatedModuleSize();
        f6 = this.average;
        f7 = Math.abs(f7 - f6);
        return Float.compare(f5, f7);
    }
}

