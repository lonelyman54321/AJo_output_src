/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MathUtils;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.Variant;

public class SchemeTonalSpot
extends DynamicScheme {
    public SchemeTonalSpot(Hct hct, boolean bl2, double d2) {
        Variant variant = Variant.TONAL_SPOT;
        TonalPalette tonalPalette = TonalPalette.fromHueAndChroma(hct.getHue(), 36.0);
        TonalPalette tonalPalette2 = TonalPalette.fromHueAndChroma(hct.getHue(), 16.0);
        TonalPalette tonalPalette3 = TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0), 24.0);
        TonalPalette tonalPalette4 = TonalPalette.fromHueAndChroma(hct.getHue(), 6.0);
        TonalPalette tonalPalette5 = TonalPalette.fromHueAndChroma(hct.getHue(), 8.0);
        super(hct, variant, bl2, d2, tonalPalette, tonalPalette2, tonalPalette3, tonalPalette4, tonalPalette5);
    }
}

