/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class SchemeNeutral
extends DynamicScheme {
    public SchemeNeutral(Hct hct, boolean bl2, double d2) {
        Variant variant = Variant.NEUTRAL;
        TonalPalette tonalPalette = TonalPalette.fromHueAndChroma(hct.getHue(), 12.0);
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(hct.getHue(), 8.0);
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(hct.getHue(), 16.0);
        double d5 = hct.getHue();
        double d7 = 2.0;
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(d5, d7);
        TonalPalette tonalPalette5 = TonalPalette.fromHueAndChroma(hct.getHue(), d7);
        super(hct, variant, bl2, d2, tonalPalette, tonalPalette2, tonalPalette3, tonalPalette4, tonalPalette5);
    }
}

