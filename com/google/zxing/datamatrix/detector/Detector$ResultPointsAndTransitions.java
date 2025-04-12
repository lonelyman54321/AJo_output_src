/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.detector;

import com.google.zxing.ResultPoint;
import com.google.zxing.datamatrix.detector.Detector$1;

final class Detector$ResultPointsAndTransitions {
    private final ResultPoint from;
    private final ResultPoint to;
    private final int transitions;

    private Detector$ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int n3) {
        this.from = resultPoint;
        this.to = resultPoint2;
        this.transitions = n3;
    }

    public /* synthetic */ Detector$ResultPointsAndTransitions(ResultPoint resultPoint, ResultPoint resultPoint2, int n3, Detector$1 detector$1) {
        this(resultPoint, resultPoint2, n3);
    }

    public ResultPoint getFrom() {
        return this.from;
    }

    public ResultPoint getTo() {
        return this.to;
    }

    public int getTransitions() {
        return this.transitions;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ResultPoint resultPoint = this.from;
        stringBuilder.append(resultPoint);
        stringBuilder.append("/");
        resultPoint = this.to;
        stringBuilder.append(resultPoint);
        stringBuilder.append('/');
        int n3 = this.transitions;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

