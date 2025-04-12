/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$color;

public final class Ko3 {
    /*
     * Unable to fully structure code
     */
    public static final void a(String var0, b30_0 var1_1, int var2_2) {
        var3_3 = var0;
        var4_4 = var2_2;
        var5_5 = var1_1;
        var6_6 = var1_1.g(427626338);
        var7_7 = var2_2 & 14;
        var8_8 = 2;
        var9_9 = 2.8E-45f;
        if (var7_7 == 0) {
            var7_7 = (int)var6_6.J(var0);
            var7_7 = var7_7 != 0 ? 4 : 2;
            var7_7 |= var4_4;
        } else {
            var7_7 = var2_2;
        }
        if ((var7_7 &= 11) == var8_8 && (var7_7 = (int)var6_6.h()) != 0) {
            var6_6.D();
            while (true) {
                var10_10 = var6_6;
                break;
            }
        } else {
            if (var3_3 == null) ** continue;
            var11_11 = j.c(j.m(LP1$a.b), 1.0f);
            var8_8 = R$color.accent_color_23;
            var12_12 = oy_0.a(var6_6, var8_8);
            var14_13 = fg2_1.a;
            var11_11 = a.b((LP1)var11_11, var12_12, var14_13);
            var8_8 = 16;
            var9_9 = var8_8;
            var5_5 = h.e((LP1)var11_11, var9_9);
            var7_7 = 12;
            var15_14 = Em3.f(var7_7);
            var17_15 = xx_1.e;
            var19_16 = tv0_0.m;
            var20_17 = y20_0.a;
            var21_18 = 1772928;
            var22_19 = 0L;
            var24_20 = 0L;
            var26_21 = 130960;
            var11_11 = var0;
            var10_10 = var6_6;
            var27_22 = var19_16;
            var3_3 = var20_17;
            var19_16 = var6_6;
            Ll3.b(var0, (LP1)var5_5, var17_15, var15_14, null, var27_22, var20_17, var22_19, null, null, var24_20, 0, false, 0, 0, null, null, var6_6, var21_18, 0, var26_21);
        }
        var11_11 = var10_10.X();
        if (var11_11 != null) {
            var11_11.d = var5_5 = new Jo3(var0, var2_2);
        }
    }
}

