/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Score$ScoredHCT;
import java.util.Comparator;

class Score$ScoredComparator
implements Comparator {
    public int compare(Score$ScoredHCT score$ScoredHCT, Score$ScoredHCT score$ScoredHCT2) {
        double d2 = score$ScoredHCT2.score;
        double d5 = score$ScoredHCT.score;
        return Double.compare(d2, d5);
    }
}

