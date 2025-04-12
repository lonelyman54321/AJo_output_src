/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.transition.Transition;

/*
 * Renamed from RU
 */
public final class ru_1
extends ue3_0 {
    /*
     * Unable to fully structure code
     */
    public final long a(ViewGroup var1_1, Transition var2_2, Or3 var3_3, Or3 var4_4) {
        var5_5 = 0L;
        if (var3_3 == null && var4_4 == null) {
            return var5_5;
        }
        var7_6 = 1;
        var8_7 = 1.4E-45f;
        if (var4_4 == null) ** GOTO lbl-1000
        var9_8 = 8;
        var10_9 = 1.1E-44f;
        if (var3_3 != null) {
            var11_10 = var3_3.a;
            var12_11 = "android:visibilityPropagation:visibility";
            if ((var11_10 = (Integer)var11_10.get(var12_11)) != null) {
                var9_8 = var11_10.intValue();
            }
        }
        if (var9_8 != 0) {
            var3_3 = var4_4;
            var13_12 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var13_12 = -1;
        }
        var9_8 = 0;
        var10_9 = 0.0f;
        var14_13 = ue3_0.b(var3_3, 0);
        var15_14 = ue3_0.b(var3_3, var7_6);
        var12_11 = var2_2.getEpicenter();
        if (var12_11 != null) {
            var7_6 = var12_11.centerX();
            var9_8 = var12_11.centerY();
        } else {
            var16_15 = 2;
            var17_16 = new int[var16_15];
            var1_1.getLocationOnScreen(var17_16);
            var9_8 = var17_16[0];
            var18_17 = var1_1.getWidth() / var16_15 + var9_8;
            var10_9 = var18_17;
            var19_18 = var1_1.getTranslationX() + var10_9;
            var9_8 = Math.round(var19_18);
            var7_6 = var17_16[var7_6];
            var20_19 = var1_1.getHeight() / var16_15 + var7_6;
            var8_7 = var20_19;
            var21_20 = var1_1.getTranslationY() + var8_7;
            var7_6 = Math.round(var21_20);
            var22_21 = var9_8;
            var9_8 = var7_6;
            var7_6 = var22_21;
        }
        var23_22 = var14_13;
        var24_23 = var15_14;
        var8_7 = var7_6;
        var10_9 = var9_8;
        var8_7 -= var23_22;
        var10_9 -= var24_23;
        var8_7 *= var8_7;
        var24_23 = (float)Math.sqrt(var10_9 * var10_9 + var8_7);
        var8_7 = var1_1.getWidth();
        var25_24 = var1_1.getHeight();
        var26_25 = var25_24;
        var9_8 = 0;
        var10_9 = 0.0f;
        var8_7 -= 0.0f;
        var8_7 *= var8_7;
        var27_26 = Math.sqrt((var26_25 -= 0.0f) * var26_25 + var8_7);
        var26_25 = (float)var27_26;
        var24_23 /= var26_25;
        var29_27 = var2_2.getDuration();
        var7_6 = (int)(var29_27 == var5_5 ? 0 : (var29_27 < var5_5 ? -1 : 1));
        if (var7_6 < 0) {
            var29_27 = 300L;
        }
        var5_5 = var13_12;
        return Math.round((float)(var29_27 * var5_5) / 3.0f * var24_23);
    }
}

