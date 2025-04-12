/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.detector;

import com.google.zxing.ResultPoint;

final class Detector$Point {
    private final int x;
    private final int y;

    public Detector$Point(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public ResultPoint toResultPoint() {
        float f5 = this.getX();
        float f6 = this.getY();
        ResultPoint resultPoint = new ResultPoint(f5, f6);
        return resultPoint;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        int n3 = this.x;
        stringBuilder.append(n3);
        stringBuilder.append(' ');
        n3 = this.y;
        return tu.a(stringBuilder, n3, '>');
    }
}

