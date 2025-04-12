/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Hct;

public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public static Hct fixIfDisliked(Hct hct) {
        boolean bl2 = DislikeAnalyzer.isDisliked(hct);
        if (bl2) {
            double d2 = hct.getHue();
            double d5 = hct.getChroma();
            double d7 = 70.0;
            hct = Hct.from(d2, d5, d7);
        }
        return hct;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isDisliked(Hct var0) {
        var1_1 = Math.round(var0.getHue());
        var3_2 = var1_1;
        var5_3 = 4636033603912859648L;
        var7_4 = 90.0;
        var9_5 = false;
        var10_6 /* !! */  = (double)(var3_2 == var7_4 ? 0 : (var3_2 > var7_4 ? 1 : -1));
        if (var10_6 /* !! */  < 0) ** GOTO lbl-1000
        var1_1 = Math.round(var0.getHue());
        var3_2 = var1_1;
        var5_3 = 4637511347540590592L;
        var7_4 = 111.0;
        cfr_temp_0 = var3_2 - var7_4;
        var10_6 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1));
        if (var10_6 /* !! */  <= 0) {
            var11_7 = true;
        } else lbl-1000:
        // 2 sources

        {
            var11_7 = false;
        }
        var12_8 = Math.round(var0.getChroma());
        var14_9 = var12_8;
        var16_10 = 16.0;
        var18_11 = var14_9 == var16_10 ? 0 : (var14_9 > var16_10 ? 1 : -1);
        var19_12 = var18_11 > 0;
        var5_3 = Math.round(var0.getTone());
        var7_4 = var5_3;
        var16_10 = 65.0;
        var20_13 = var7_4 == var16_10 ? 0 : (var7_4 < var16_10 ? -1 : 1);
        if (var20_13 < 0) {
            var20_13 = (double)true;
        } else {
            var20_13 = (double)false;
            var0 = null;
        }
        if (var11_7 && var19_12 && var20_13 != false) {
            var9_5 = true;
        }
        return var9_5;
    }
}

