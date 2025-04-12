/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.detector;

import com.google.zxing.datamatrix.detector.Detector$1;
import com.google.zxing.datamatrix.detector.Detector$ResultPointsAndTransitions;
import java.io.Serializable;
import java.util.Comparator;

final class Detector$ResultPointsAndTransitionsComparator
implements Serializable,
Comparator {
    private Detector$ResultPointsAndTransitionsComparator() {
    }

    public /* synthetic */ Detector$ResultPointsAndTransitionsComparator(Detector$1 detector$1) {
        this();
    }

    public int compare(Detector$ResultPointsAndTransitions detector$ResultPointsAndTransitions, Detector$ResultPointsAndTransitions detector$ResultPointsAndTransitions2) {
        int n3 = detector$ResultPointsAndTransitions.getTransitions();
        int n4 = detector$ResultPointsAndTransitions2.getTransitions();
        return n3 - n4;
    }
}

