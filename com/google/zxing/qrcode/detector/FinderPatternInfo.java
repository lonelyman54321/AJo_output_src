/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;

public final class FinderPatternInfo {
    private final FinderPattern bottomLeft;
    private final FinderPattern topLeft;
    private final FinderPattern topRight;

    public FinderPatternInfo(FinderPattern[] object) {
        FinderPattern finderPattern;
        this.bottomLeft = finderPattern = object[0];
        this.topLeft = finderPattern = object[1];
        this.topRight = object = object[2];
    }

    public FinderPattern getBottomLeft() {
        return this.bottomLeft;
    }

    public FinderPattern getTopLeft() {
        return this.topLeft;
    }

    public FinderPattern getTopRight() {
        return this.topRight;
    }
}

