/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Mk3$b
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Pk3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wr1_1 e;

    public Mk3$b(Pk3 pk3, boolean bl2, wr1_1 wr1_12) {
        this.c = pk3;
        this.d = bl2;
        this.e = wr1_12;
        super(3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2, Object var3_3) {
        var4_4 = this;
        var5_5 = var1_1;
        var5_5 = (LP1)var1_1;
        var5_5 = var2_2;
        var5_5 = (b30_0)var2_2;
        var6_6 = var3_3;
        ((Number)var3_3).intValue();
        var7_7 = 805428266;
        var8_8 = 4.72428E-10f;
        var5_5.K(var7_7);
        var6_6 = O30.l;
        var6_6 = var5_5.j((H30)var6_6);
        var9_9 /* !! */  = bp1_0.Rtl;
        if (var6_6 == var9_9 /* !! */ ) {
            var7_7 = 1;
            var8_8 = 1.4E-45f;
        } else {
            var7_7 = 0;
            var8_8 = 0.0f;
            var6_6 = null;
        }
        var9_9 /* !! */  = var4_4.c;
        var10_10 /* !! */  = (pg2_0)var9_9 /* !! */ .e.getValue();
        var11_11 /* !! */  = pg2_0.Vertical;
        var12_12 = var10_10 /* !! */  == var11_11 /* !! */  || var7_7 == 0;
        var7_7 = (int)var5_5.J((Object)var9_9 /* !! */ );
        var10_10 /* !! */  = var5_5.v();
        var11_11 /* !! */  = b30$a.a;
        if (var7_7 != 0 || var10_10 /* !! */  == var11_11 /* !! */ ) {
            var10_10 /* !! */  = new Nk3((Pk3)var9_9 /* !! */ );
            var5_5.o((Object)var10_10 /* !! */ );
        }
        var6_6 = J83.j((Function1)var10_10 /* !! */ , (b30_0)var5_5);
        var10_10 /* !! */  = var5_5.v();
        if (var10_10 /* !! */  == var11_11 /* !! */ ) {
            var10_10 /* !! */  = new eu2_1((tr1_0)var6_6);
            var6_6 = new xm0_0((Function1)var10_10 /* !! */ );
            var5_5.o(var6_6);
            var10_10 /* !! */  = var6_6;
        }
        var10_10 /* !! */  = (dU2)var10_10 /* !! */ ;
        var7_7 = (int)var5_5.J((Object)var10_10 /* !! */ );
        var13_13 = var5_5.J((Object)var9_9 /* !! */ );
        var14_14 = var5_5.v();
        if ((var7_7 |= var13_13) != 0 || var14_14 == var11_11 /* !! */ ) {
            var14_14 = new Ok3((dU2)var10_10 /* !! */ , (Pk3)var9_9 /* !! */ );
            var5_5.o(var14_14);
        }
        var15_15 = var14_14;
        var15_15 = (Ok3)var14_14;
        var14_14 = LP1$a.b;
        var16_16 /* !! */  = var6_6 = var9_9 /* !! */ .e.getValue();
        var16_16 /* !! */  = (pg2_0)var6_6;
        var7_7 = (int)var4_4.d;
        if (var7_7 == 0) ** GOTO lbl-1000
        var6_6 = var9_9 /* !! */ .b;
        var8_8 = var6_6.c();
        var9_9 /* !! */  = null;
        cfr_temp_0 = var8_8 - 0.0f;
        var7_7 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
        if (var7_7 != 0) {
            var17_17 = true;
        } else lbl-1000:
        // 2 sources

        {
            var17_17 = false;
        }
        var18_18 = var4_4.e;
        var6_6 = i.b((LP1)var14_14, (dU2)var15_15, (pg2_0)var16_16 /* !! */ , null, var17_17, var12_12, null, var18_18, null);
        var5_5.E();
        return var6_6;
    }
}

