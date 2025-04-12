/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.transition.Transition;

public final class r43
extends ue3_0 {
    public int b;

    /*
     * Unable to fully structure code
     */
    public final long a(ViewGroup var1_1, Transition var2_2, Or3 var3_3, Or3 var4_4) {
        block21: {
            var5_5 = this;
            var6_6 = var3_3;
            var7_7 = 0L;
            if (var3_3 == null && var4_4 == null) {
                return var7_7;
            }
            var9_8 = var2_2.getEpicenter();
            var10_9 = 1;
            if (var4_4 == null) ** GOTO lbl-1000
            var11_10 = 8;
            if (var6_6 != null) {
                var12_11 = var6_6.a;
                var13_12 = "android:visibilityPropagation:visibility";
                if ((var12_11 = (Integer)var12_11.get(var13_12)) != null) {
                    var11_10 = var12_11.intValue();
                }
            }
            if (var11_10 != 0) {
                var6_6 = var4_4;
                var11_10 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var11_10 = -1;
            }
            var14_13 = 0;
            var12_11 = null;
            var15_14 = ue3_0.b(var6_6, 0);
            var16_15 = ue3_0.b(var6_6, var10_9);
            var17_16 = 2;
            var18_17 = new int[var17_16];
            var1_1.getLocationOnScreen(var18_17);
            var19_18 = var18_17[0];
            var20_19 = var1_1.getTranslationX();
            var21_20 = Math.round(var20_19) + var19_18;
            var22_21 = var18_17[var10_9];
            var23_22 = var1_1.getTranslationY();
            var19_18 = Math.round(var23_22) + var22_21;
            var22_21 = var1_1.getWidth() + var21_20;
            var24_23 = var1_1.getHeight() + var19_18;
            if (var9_8 != null) {
                var17_16 = var9_8.centerX();
                var25_24 = var9_8.centerY();
            } else {
                var25_24 = (var21_20 + var22_21) / var17_16;
                var26_25 = var19_18 + var24_23;
                var27_26 = var26_25 / 2;
                var17_16 = var25_24;
                var25_24 = var27_26;
            }
            var26_25 = var5_5.b;
            var14_13 = 0x800005;
            var28_27 = 3;
            var29_28 = 0x800003;
            var30_29 = 1.1754948E-38f;
            if (var26_25 == var29_28) {
                var26_25 = var1_1.getLayoutDirection();
                if (var26_25 == var10_9) {
                    while (true) {
                        var26_25 = 5;
                        break block21;
                        break;
                    }
                }
lbl55:
                // 3 sources

                while (true) {
                    var26_25 = 3;
                    break block21;
                    break;
                }
            }
            if (var26_25 == var14_13) {
                if ((var26_25 = var1_1.getLayoutDirection()) != var10_9) ** continue;
                ** continue;
            }
        }
        if (var26_25 != var28_27) {
            var10_9 = 5;
            if (var26_25 != var10_9) {
                var25_24 = 48;
                if (var26_25 != var25_24) {
                    var25_24 = 80;
                    if (var26_25 != var25_24) {
                        var16_15 = 0;
                        var31_30 = 0.0f;
                        var6_6 = null;
                    } else {
                        var16_15 -= var19_18;
                        var25_24 = Math.abs(var17_16 -= var15_14);
                        var16_15 += var25_24;
                    }
                } else {
                    var24_23 -= var16_15;
                    var16_15 = Math.abs(var17_16 -= var15_14) + var24_23;
                }
            } else {
                var25_24 -= var16_15;
                var16_15 = Math.abs(var25_24) + (var15_14 -= var21_20);
            }
        } else {
            var25_24 -= var16_15;
            var16_15 = Math.abs(var25_24) + (var22_21 -= var15_14);
        }
        var31_30 = var16_15;
        var25_24 = var5_5.b;
        var29_28 = var25_24 != var28_27 && var25_24 != (var28_27 = 5) && var25_24 != var29_28 && var25_24 != var14_13 ? var1_1.getHeight() : var1_1.getWidth();
        var30_29 = var29_28;
        var31_30 /= var30_29;
        var7_7 = var2_2.getDuration();
        var32_31 = 0L;
        var14_13 = (int)(var7_7 == var32_31 ? 0 : (var7_7 < var32_31 ? -1 : 1));
        if (var14_13 < 0) {
            var7_7 = 300L;
        }
        var32_31 = var11_10;
        return Math.round((float)(var7_7 * var32_31) / 3.0f * var31_30);
    }
}

