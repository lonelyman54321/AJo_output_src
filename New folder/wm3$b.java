/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class wm3$b
extends Lambda
implements Function1 {
    public final /* synthetic */ wm3 c;

    public wm3$b(wm3 wm32) {
        this.c = wm32;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block6: {
            var2_2 = var1_1;
            var2_2 = (List)var1_1;
            var3_3 = this.c;
            var4_4 = var3_3.s1();
            var5_5 /* !! */  = var3_3.o;
            var3_3 = var3_3.u;
            var6_6 = var3_3 != null ? var3_3.a() : OX.l;
            var8_7 = 0L;
            var10_8 = 0xFFFFFE;
            var11_9 = 0L;
            var13_10 = 0;
            var14_11 = null;
            var15_12 = null;
            var16_13 = 0L;
            var18_14 = false;
            var19_15 = 0;
            var3_3 = xm3.e(var5_5 /* !! */ , var6_6, var11_9, null, null, null, var16_13, null, 0, var8_7, var10_8);
            var5_5 /* !! */  = var4_4.o;
            var20_16 = 0;
            var21_17 = null;
            if (var5_5 /* !! */  == null) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var14_11 = null;
                    break block6;
                    break;
                }
            }
            var22_18 = var4_4.i;
            if (var22_18 == null) ** GOTO lbl-1000
            var24_20 = var4_4.a;
            var13_10 = 6;
            var23_19 = new Sl(var13_10, (String)var24_20, null);
            var24_20 = var4_4.j;
            if (var24_20 != null && (var24_20 = var4_4.n) != null) ** break;
            ** while (true)
            var25_21 = var4_4.p;
            var27_22 = c60.b(var25_21, 0, 0, 0, 0, 10);
            var29_23 = mz0_2.a;
            var30_24 = var4_4.f;
            var18_14 = var4_4.e;
            var19_15 = var4_4.d;
            var21_17 = var4_4.c;
            var15_12 = new Sl3(var23_19, (xm3)var3_3, var29_23, var30_24, var18_14, var19_15, var22_18, (bp1_0)var5_5 /* !! */ , (RU0$a)var21_17, var27_22);
            var31_25 = new sq1_0(var23_19, (xm3)var3_3, var29_23, var22_18, (RU0$a)var21_17);
            var32_26 = var4_4.f;
            var20_16 = var4_4.d;
            var33_27 = 2;
            var34_28 = km3.b(var20_16, var33_27);
            var5_5 /* !! */  = new RQ1(var31_25, var27_22, var32_26, var34_28);
            var35_29 = var4_4.l;
            var14_11 = new Tl3(var15_12, (RQ1)var5_5 /* !! */ , var35_29);
        }
        if (var14_11 != null) {
            var2_2.add(var14_11);
            var21_17 = var14_11;
        } else {
            var20_16 = 0;
            var21_17 = null;
        }
        if (var21_17 != null) {
            var37_30 = true;
        } else {
            var37_30 = false;
            var2_2 = null;
        }
        return var37_30;
    }
}

