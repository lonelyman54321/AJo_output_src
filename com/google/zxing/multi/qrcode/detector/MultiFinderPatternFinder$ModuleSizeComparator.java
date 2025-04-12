/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder$1;
import com.google.zxing.qrcode.detector.FinderPattern;
import java.io.Serializable;
import java.util.Comparator;

final class MultiFinderPatternFinder$ModuleSizeComparator
implements Serializable,
Comparator {
    private MultiFinderPatternFinder$ModuleSizeComparator() {
    }

    public /* synthetic */ MultiFinderPatternFinder$ModuleSizeComparator(MultiFinderPatternFinder$1 multiFinderPatternFinder$1) {
        this();
    }

    public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
        double d2;
        float f5 = finderPattern2.getEstimatedModuleSize();
        float f6 = finderPattern.getEstimatedModuleSize();
        double d5 = f5 -= f6;
        double d7 = d5 - (d2 = 0.0);
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            return -1;
        }
        object = d5 == d2 ? 0 : (d5 > d2 ? 1 : -1);
        if (object > 0) {
            return 1;
        }
        return 0;
    }
}

