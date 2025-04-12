/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Yj3
extends Lambda
implements gx0_2 {
    public final /* synthetic */ ZD c;
    public final /* synthetic */ Vt1 d;
    public final /* synthetic */ ql3_0 e;
    public final /* synthetic */ i72 f;

    public Yj3(ZD zD, Vt1 vt1, ql3_0 ql3_02, i72 i722) {
        this.c = zD;
        this.d = vt1;
        this.e = ql3_02;
        this.f = i722;
        super(3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        var1_1 = (LP1)var1_1;
        var2_2 = (b30_0)var2_2;
        ((Number)var3_3).intValue();
        var4_4 = -84507373;
        var2_2.K(var4_4);
        var3_3 = var2_2.v();
        var5_5 = b30$a.a;
        if (var3_3 == var5_5) {
            var3_3 = new wf0_0();
            var2_2.o(var3_3);
        }
        var6_6 = var3_3;
        var6_6 = (wf0_0)var3_3;
        var3_3 = this.c;
        var7_7 /* !! */  = var3_3 instanceof i93_0;
        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        var8_8 = var3_3;
        var8_8 = (i93_0)var3_3;
        var9_9 = var8_8.a;
        var11_10 = 16;
        cfr_temp_0 = var9_9 - var11_10;
        var7_7 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
        if (var7_7 /* !! */  == 0) {
            var7_7 /* !! */  = 0;
            var8_8 = null;
        } else lbl-1000:
        // 2 sources

        {
            var7_7 /* !! */  = 1;
        }
        var13_11 = O30.r;
        var13_11 = (cg3_0)var2_2.j((H30)var13_11);
        var14_12 = var13_11.a();
        if (var14_12 == 0 || (var15_13 = (var13_11 = this.d).b()) == 0) ** GOTO lbl-1000
        var16_14 = this.e;
        var11_10 = var16_14.b;
        var17_15 = (int)mm3.b(var11_10);
        if (var17_15 != 0 && var7_7 /* !! */  != 0) {
            var7_7 /* !! */  = 808320157;
            var2_2.K(var7_7 /* !! */ );
            var11_10 = var16_14.b;
            var8_8 = new mm3(var11_10);
            var17_15 = var2_2.x(var6_6);
            var18_16 = var2_2.v();
            if (var17_15 != 0 || var18_16 == var5_5) {
                var17_15 = 0;
                var19_17 = null;
                var18_16 = new Wj3((wf0_0)var6_6, null);
                var2_2.o(var18_16);
            }
            var18_16 = (Function2)var18_16;
            ly0_0.e(var16_14.a, var8_8, (Function2)var18_16, (b30_0)var2_2);
            var7_7 /* !! */  = (int)var2_2.x(var6_6);
            var19_17 = this.f;
            var17_15 = var2_2.x(var19_17);
            var7_7 /* !! */  |= var17_15;
            var15_13 = var2_2.J(var16_14);
            var7_7 /* !! */  |= var15_13;
            var14_12 = var2_2.x(var13_11);
            var4_4 = var2_2.J(var3_3) | (var7_7 /* !! */  |= var14_12);
            var8_8 = var2_2.v();
            if (var4_4 != 0 || var8_8 == var5_5) {
                var13_11 = this.f;
                var16_14 = this.e;
                var19_17 = this.d;
                var18_16 = this.c;
                var8_8 = var3_3;
                var3_3 = new Xj3((wf0_0)var6_6, (i72)var13_11, var16_14, (Vt1)var19_17, (ZD)var18_16);
                var2_2.o(var3_3);
            }
            var8_8 = (Function1)var8_8;
            var1_1 = a.c((LP1)var1_1, (Function1)var8_8);
            var2_2.E();
        } else lbl-1000:
        // 2 sources

        {
            var20_18 = 809534830;
            var2_2.K(var20_18);
            var2_2.E();
            var1_1 = LP1$a.b;
        }
        var2_2.E();
        return var1_1;
    }
}

