/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class SchemeVibrant
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
        dArray4[1] = 41.0;
        dArray3[2] = 61.0;
        dArray4[3] = 101.0;
        dArray3[4] = 131.0;
        dArray4[5] = 181.0;
        dArray3[6] = 251.0;
        dArray4[7] = 301.0;
        dArray4[8] = 360.0;
        HUES = dArray2;
        double[] dArray5 = dArray2 = new double[n3];
        double[] dArray6 = dArray2;
        dArray5[0] = 18.0;
        dArray6[1] = 15.0;
        dArray5[2] = 10.0;
        dArray6[3] = 12.0;
        dArray5[4] = 15.0;
        dArray6[5] = 18.0;
        dArray5[6] = 15.0;
        dArray6[7] = 12.0;
        dArray6[8] = 12.0;
        SECONDARY_ROTATIONS = dArray2;
        double[] dArray7 = dArray = new double[n3];
        double[] dArray8 = dArray;
        dArray7[0] = 35.0;
        dArray8[1] = 30.0;
        dArray7[2] = 20.0;
        dArray8[3] = 25.0;
        dArray7[4] = 30.0;
        dArray8[5] = 35.0;
        dArray7[6] = 30.0;
        dArray8[7] = 25.0;
        dArray8[8] = 25.0;
        TERTIARY_ROTATIONS = dArray;
    }

    public SchemeVibrant(Hct hct, boolean bl2, double d2) {
        Variant variant = Variant.VIBRANT;
        TonalPalette tonalPalette = TonalPalette.fromHueAndChroma(hct.getHue(), 200.0);
        Object object = HUES;
        Object object2 = SECONDARY_ROTATIONS;
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, object, object2), 24.0);
        object2 = TERTIARY_ROTATIONS;
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, object, object2), 32.0);
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(hct.getHue(), 10.0);
        TonalPalette tonalPalette5 = TonalPalette.fromHueAndChroma(hct.getHue(), 12.0);
        object = this;
        object2 = hct;
        super(hct, variant, bl2, d2, tonalPalette, tonalPalette2, tonalPalette3, tonalPalette4, tonalPalette5);
    }
}

