/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class SchemeFruitSalad
extends DynamicScheme {
    public SchemeFruitSalad(Hct hct, boolean bl2, double d2) {
        Variant variant = Variant.FRUIT_SALAD;
        double d5 = hct.getHue();
        double d7 = 50.0;
        TonalPalette tonalPalette = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(d5 - d7), 48.0);
        d5 = MathUtils.sanitizeDegreesDouble(hct.getHue() - d7);
        d7 = 36.0;
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(d5, d7);
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(hct.getHue(), d7);
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(hct.getHue(), 10.0);
        TonalPalette tonalPalette5 = TonalPalette.fromHueAndChroma(hct.getHue(), 16.0);
        super(hct, variant, bl2, d2, tonalPalette, tonalPalette2, tonalPalette3, tonalPalette4, tonalPalette5);
    }
}

