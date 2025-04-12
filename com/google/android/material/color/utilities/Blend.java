/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Cam16;
import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;

public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int n3, int n4, double d2) {
        Cam16 cam16 = Cam16.fromInt(n3);
        Cam16 cam162 = Cam16.fromInt(n4);
        double d5 = cam16.getJstar();
        double d7 = cam16.getAstar();
        double d9 = cam16.getBstar();
        double d12 = cam162.getJstar();
        double d13 = cam162.getAstar();
        double d14 = cam162.getBstar();
        double d15 = (d12 - d5) * d2 + d5;
        double d16 = (d13 - d7) * d2 + d7;
        double d17 = (d14 - d9) * d2 + d9;
        return Cam16.fromUcs(d15, d16, d17).toInt();
    }

    public static int harmonize(int n3, int n4) {
        Hct hct = Hct.fromInt(n3);
        Hct hct2 = Hct.fromInt(n4);
        double d2 = hct.getHue();
        double d5 = hct2.getHue();
        d2 = Math.min(MathUtils.differenceDegrees(d2, d5) * 0.5, 15.0);
        d5 = hct.getHue();
        double d7 = hct.getHue();
        double d9 = hct2.getHue();
        d9 = MathUtils.sanitizeDegreesDouble(MathUtils.rotationDirection(d7, d9) * d2 + d5);
        double d12 = hct.getChroma();
        double d13 = hct.getTone();
        return Hct.from(d9, d12, d13).toInt();
    }

    public static int hctHue(int n3, int n4, double d2) {
        Cam16 cam16 = Cam16.fromInt(Blend.cam16Ucs(n3, n4, d2));
        Cam16 cam162 = Cam16.fromInt(n3);
        double d5 = cam16.getHue();
        double d7 = cam162.getChroma();
        double d9 = ColorUtils.lstarFromArgb(n3);
        return Hct.from(d5, d7, d9).toInt();
    }
}

