/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TonalPalette;

public final class CorePalette {
    public TonalPalette a1;
    public TonalPalette a2;
    public TonalPalette a3;
    public TonalPalette error;
    public TonalPalette n1;
    public TonalPalette n2;

    private CorePalette(int n3, boolean bl2) {
        Object object = Hct.fromInt(n3);
        double d2 = ((Hct)object).getHue();
        double d5 = ((Hct)object).getChroma();
        double d7 = 8.0;
        double d9 = 4.0;
        double d12 = 60.0;
        if (bl2) {
            this.a1 = object = TonalPalette.fromHueAndChroma(d2, d5);
            double d13 = d5 / 3.0;
            this.a2 = object = TonalPalette.fromHueAndChroma(d2, d13);
            d13 = d5 / 2.0;
            this.a3 = object = TonalPalette.fromHueAndChroma(d12 += d2, d13);
            d13 = Math.min(d5 / 12.0, d9);
            this.n1 = object = TonalPalette.fromHueAndChroma(d2, d13);
            d13 = Math.min(d5 /= 6.0, d7);
            this.n2 = object = TonalPalette.fromHueAndChroma(d2, d13);
        } else {
            double d14 = Math.max(48.0, d5);
            this.a1 = object = TonalPalette.fromHueAndChroma(d2, d14);
            this.a2 = object = TonalPalette.fromHueAndChroma(d2, 16.0);
            d14 = 24.0;
            this.a3 = object = TonalPalette.fromHueAndChroma(d12 += d2, d14);
            this.n1 = object = TonalPalette.fromHueAndChroma(d2, d9);
            this.n2 = object = TonalPalette.fromHueAndChroma(d2, d7);
        }
        this.error = object = TonalPalette.fromHueAndChroma(25.0, 84.0);
    }

    public static CorePalette contentOf(int n3) {
        CorePalette corePalette = new CorePalette(n3, true);
        return corePalette;
    }

    public static CorePalette of(int n3) {
        CorePalette corePalette = new CorePalette(n3, false);
        return corePalette;
    }
}

