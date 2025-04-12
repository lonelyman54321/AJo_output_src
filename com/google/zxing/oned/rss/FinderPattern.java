/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

public final class FinderPattern {
    private final ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int n3, int[] object, int n4, int n7, int n8) {
        this.value = n3;
        this.startEnd = object;
        float f5 = n4;
        float f6 = n8;
        ResultPoint resultPoint = new ResultPoint(f5, f6);
        object = new ResultPoint;
        float f7 = n7;
        super(f7, f6);
        ResultPoint[] resultPointArray = new ResultPoint[]{resultPoint, object};
        this.resultPoints = resultPointArray;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof FinderPattern;
        if (n3 == 0) {
            return false;
        }
        object = (FinderPattern)object;
        n3 = this.value;
        int n4 = ((FinderPattern)object).value;
        return n3 == n4;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public int[] getStartEnd() {
        return this.startEnd;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }
}

