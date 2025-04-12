/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class DynamicScheme {
    public final double contrastLevel;
    public final TonalPalette errorPalette;
    public final boolean isDark;
    public final TonalPalette neutralPalette;
    public final TonalPalette neutralVariantPalette;
    public final TonalPalette primaryPalette;
    public final TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final Hct sourceColorHct;
    public final TonalPalette tertiaryPalette;
    public final Variant variant;

    public DynamicScheme(Hct object, Variant variant, boolean bl2, double d2, TonalPalette tonalPalette, TonalPalette tonalPalette2, TonalPalette tonalPalette3, TonalPalette tonalPalette4, TonalPalette tonalPalette5) {
        int n3;
        this.sourceColorArgb = n3 = ((Hct)object).toInt();
        this.sourceColorHct = object;
        this.variant = variant;
        this.isDark = bl2;
        this.contrastLevel = d2;
        this.primaryPalette = tonalPalette;
        this.secondaryPalette = tonalPalette2;
        this.tertiaryPalette = tonalPalette3;
        this.neutralPalette = tonalPalette4;
        this.neutralVariantPalette = tonalPalette5;
        this.errorPalette = object = TonalPalette.fromHueAndChroma(25.0, 84.0);
    }

    public static double getRotatedHue(Hct hct, double[] dArray, double[] dArray2) {
        double d2 = hct.getHue();
        int n3 = dArray2.length;
        int n4 = 1;
        int n7 = 0;
        if (n3 == n4) {
            double d5 = dArray2[0];
            return MathUtils.sanitizeDegreesDouble(d2 + d5);
        }
        n3 = dArray.length;
        while (n7 <= (n4 = n3 + -2)) {
            double d7;
            double d9 = dArray[n7];
            n4 = n7 + 1;
            double d12 = dArray[n4];
            Object object = d9 == d2 ? 0 : (d9 < d2 ? -1 : 1);
            if (object < 0 && (d7 = d2 == d12 ? 0 : (d2 < d12 ? -1 : 1)) < 0) {
                double d13 = dArray2[n7];
                return MathUtils.sanitizeDegreesDouble(d2 + d13);
            }
            n7 = n4;
        }
        return d2;
    }
}

