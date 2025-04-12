/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 */
import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

public final class pV0 {
    /*
     * Unable to fully structure code
     */
    public static final Object a(int var0, Object var1_1, LU0 var2_2, tv0_0 var3_3, int var4_4) {
        var5_5 = var1_1 instanceof Typeface;
        if (var5_5 == 0) {
            return var1_1;
        }
        var5_5 = 1;
        var6_6 = oV0.a(var0, var5_5);
        var7_7 = 2;
        if (var6_6 == 0 && (var6_6 = oV0.a(var0, var7_7)) == 0 || (var6_6 = Intrinsics.areEqual(var8_8 = var2_2.getWeight(), var3_3)) != 0 || (var9_9 = var3_3.a(var8_8 = tv0_0.g)) < 0) ** GOTO lbl-1000
        var10_10 = var2_2.getWeight();
        var9_9 = var10_10.a;
        var6_6 = var8_8.a;
        if ((var6_6 = Intrinsics.compare(var9_9, var6_6)) < 0) {
            var6_6 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = 0;
            var8_8 = null;
        }
        var9_9 = oV0.a(var0, var5_5);
        var11_11 = 3;
        if (var9_9 == 0 && (var0 = (int)oV0.a(var0, var11_11)) == 0) ** GOTO lbl-1000
        var0 = var2_2.b();
        if ((var0 = (int)nV0.a(var4_4, var0)) == 0) {
            var0 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var0 = 0;
            var12_12 = null;
        }
        if (var0 == 0 && var6_6 == 0) {
            return var1_1;
        }
        var9_9 = Build.VERSION.SDK_INT;
        var13_13 = 28;
        if (var9_9 < var13_13) {
            if (var0 != 0 && (var0 = (int)nV0.a(var4_4, var5_5)) != 0) {
                var0 = 1;
            } else {
                var0 = 0;
                var12_12 = null;
            }
            if (var0 != 0 && var6_6 != 0) {
                var5_5 = 3;
            } else if (var6_6 == 0) {
                var5_5 = var0 != 0 ? 2 : 0;
            }
            var1_1 = (Typeface)var1_1;
            var12_12 = Typeface.create((Typeface)var1_1, (int)var5_5);
        } else {
            if (var6_6 != 0) {
                var14_14 = var3_3.a;
            } else {
                var3_3 = var2_2.getWeight();
                var14_14 = var3_3.a;
            }
            var0 = var0 != 0 ? (int)nV0.a(var4_4, var5_5) : (int)nV0.a(var2_2.b(), var5_5);
            var2_2 = tt3.a;
            var1_1 = (Typeface)var1_1;
            var12_12 = var2_2.a((Typeface)var1_1, var14_14, (boolean)var0);
        }
        return var12_12;
    }
}

