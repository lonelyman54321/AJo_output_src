/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Hct;
import java.util.HashMap;
import java.util.Map;

public final class TonalPalette {
    Map cache;
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d2, double d5, Hct hct) {
        HashMap hashMap;
        this.cache = hashMap = new HashMap();
        this.hue = d2;
        this.chroma = d5;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d2, double d5) {
        double d7 = 50.0;
        double d9 = d2;
        double d12 = d5;
        double d13 = d7;
        Hct hct = Hct.from(d2, d5, d7);
        double d14 = Math.abs(hct.getChroma() - d5);
        double d15 = 1.0;
        Hct hct2 = hct;
        double d16 = d14;
        double d17 = d15;
        while (true) {
            long l2;
            long l3 = 0x4049000000000000L;
            d9 = 50.0;
            double d18 = d17 - d9;
            Object object = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
            if (object >= 0) break;
            l3 = Math.round(d5);
            long l4 = l3 - (l2 = Math.round(d12 = hct2.getChroma()));
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                return hct2;
            }
            d13 = d7 + d17;
            d9 = d2;
            d12 = d5;
            hct = Hct.from(d2, d5, d13);
            d14 = Math.abs(hct.getChroma() - d5);
            double d19 = d14 - d16;
            Object object3 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
            if (object3 < 0) {
                hct2 = hct;
                d16 = d14;
            }
            d13 = d7 - d17;
            d9 = d2;
            d12 = d5;
            hct = Hct.from(d2, d5, d13);
            d14 = Math.abs(hct.getChroma() - d5);
            double d20 = d14 - d16;
            object3 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
            if (object3 < 0) {
                hct2 = hct;
                d16 = d14;
            }
            d17 += d15;
        }
        return hct2;
    }

    public static TonalPalette fromHct(Hct hct) {
        double d2 = hct.getHue();
        double d5 = hct.getChroma();
        TonalPalette tonalPalette = new TonalPalette(d2, d5, hct);
        return tonalPalette;
    }

    public static TonalPalette fromHueAndChroma(double d2, double d5) {
        Hct hct = TonalPalette.createKeyColor(d2, d5);
        TonalPalette tonalPalette = new TonalPalette(d2, d5, hct);
        return tonalPalette;
    }

    public static TonalPalette fromInt(int n3) {
        return TonalPalette.fromHct(Hct.fromInt(n3));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d2) {
        double d5 = this.hue;
        double d7 = this.chroma;
        return Hct.from(d5, d7, d2);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int n3) {
        Object object = this.cache;
        Object object2 = n3;
        if ((object = (Integer)object.get(object2)) == null) {
            double d2 = this.hue;
            double d5 = this.chroma;
            double d7 = n3;
            int n4 = Hct.from(d2, d5, d7).toInt();
            object = n4;
            object2 = this.cache;
            Integer n7 = n3;
            object2.put(n7, object);
        }
        return (Integer)object;
    }
}

