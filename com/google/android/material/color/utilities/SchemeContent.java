/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.DislikeAnalyzer;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class SchemeContent
extends DynamicScheme {
    public SchemeContent(Hct hct, boolean bl2, double d2) {
        Variant variant = Variant.CONTENT;
        double d5 = hct.getHue();
        double d7 = hct.getChroma();
        TonalPalette tonalPalette = TonalPalette.fromHueAndChroma(d5, d7);
        d5 = hct.getHue();
        d7 = hct.getChroma() - 32.0;
        double d9 = hct.getChroma() * 0.5;
        d7 = Math.max(d7, d9);
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(d5, d7);
        Object object = new TemperatureCache(hct);
        TonalPalette tonalPalette3 = TonalPalette.fromHct(DislikeAnalyzer.fixIfDisliked((Hct)((TemperatureCache)object).getAnalogousColors(3, 6).get(2)));
        d7 = hct.getHue();
        double d12 = hct.getChroma();
        double d13 = 8.0;
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(d7, d12 /= d13);
        d7 = hct.getHue();
        double d14 = hct.getChroma() / d13 + 4.0;
        TonalPalette tonalPalette5 = TonalPalette.fromHueAndChroma(d7, d14);
        object = this;
        super(hct, variant, bl2, d2, tonalPalette, tonalPalette2, tonalPalette3, tonalPalette4, tonalPalette5);
    }
}

