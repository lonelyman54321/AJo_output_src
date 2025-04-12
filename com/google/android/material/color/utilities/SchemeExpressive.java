/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class SchemeExpressive
extends DynamicScheme {
    private static final double[] HUES;
    private static final double[] SECONDARY_ROTATIONS;
    private static final double[] TERTIARY_ROTATIONS;

    static {
        double[] dArray;
        double[] dArray2;
        int n3 = 9;
        double[] dArray3 = dArray2 = new double[n3];
        double[] dArray4 = dArray2;
        dArray3[0] = 0.0;
        dArray4[1] = 21.0;
        dArray3[2] = 51.0;
        dArray4[3] = 121.0;
        dArray3[4] = 151.0;
        dArray4[5] = 191.0;
        dArray3[6] = 271.0;
        dArray4[7] = 321.0;
        dArray4[8] = 360.0;
        HUES = dArray2;
        double[] dArray5 = dArray2 = new double[n3];
        double[] dArray6 = dArray2;
        dArray5[0] = 45.0;
        dArray6[1] = 95.0;
        dArray5[2] = 45.0;
        dArray6[3] = 20.0;
        dArray5[4] = 45.0;
        dArray6[5] = 90.0;
        dArray5[6] = 45.0;
        dArray6[7] = 45.0;
        dArray6[8] = 45.0;
        SECONDARY_ROTATIONS = dArray2;
        double[] dArray7 = dArray = new double[n3];
        double[] dArray8 = dArray;
        dArray7[0] = 120.0;
        dArray8[1] = 120.0;
        dArray7[2] = 20.0;
        dArray8[3] = 45.0;
        dArray7[4] = 20.0;
        dArray8[5] = 15.0;
        dArray7[6] = 20.0;
        dArray8[7] = 120.0;
        dArray8[8] = 120.0;
        TERTIARY_ROTATIONS = dArray;
    }

    public SchemeExpressive(Hct hct, boolean bl2, double d2) {
        Variant variant = Variant.EXPRESSIVE;
        TonalPalette tonalPalette = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 240.0), 40.0);
        Object object = HUES;
        Object object2 = SECONDARY_ROTATIONS;
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, object, object2), 24.0);
        object2 = TERTIARY_ROTATIONS;
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, object, object2), 32.0);
        double d5 = hct.getHue();
        double d7 = 15.0;
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(d5 + d7), 8.0);
        TonalPalette tonalPalette5 = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + d7), 12.0);
        object = this;
        object2 = hct;
        super(hct, variant, bl2, d2, tonalPalette, tonalPalette2, tonalPalette3, tonalPalette4, tonalPalette5);
    }
}

