/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Yl3$d
extends Lambda
implements Function1 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Sl$b d;
    public final /* synthetic */ Ju1 e;

    public Yl3$d(Yl3 yl3, Sl$b sl$b, Ju1 ju1) {
        this.c = yl3;
        this.d = sl$b;
        this.e = ju1;
        super(1);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var1_1 = (Gj3)var1_1;
        var2_2 = this.d;
        var3_3 = ((Gu1)var2_2.a).a();
        var4_4 = null;
        if (var3_3 != null) {
            var3_3 = var3_3.a;
        } else {
            var5_5 = 0;
            var3_3 = null;
        }
        var6_6 = this.e;
        var7_7 = var6_6.d;
        var8_8 = var7_7.o();
        var9_9 = var6_6.a;
        if ((var8_8 &= var9_9) != 0) {
            var8_8 = 1;
        } else {
            var8_8 = 0;
            var7_7 = null;
        }
        var10_10 = var2_2.a;
        if (var8_8 == 0) ** GOTO lbl-1000
        var7_7 = var10_10;
        var7_7 = ((Gu1)var10_10).a();
        if (var7_7 != null) {
            var7_7 = var7_7.b;
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = 0;
            var7_7 = null;
        }
        var11_11 = this.c;
        var11_11.getClass();
        if (var3_3 != null && (var3_3 = var3_3.c((S93)var7_7)) != null) {
            var7_7 = var3_3;
        }
        var3_3 = var6_6.d;
        var12_12 = var3_3.o();
        var13_13 = var6_6.b;
        if ((var12_12 &= var13_13) == 0) ** GOTO lbl-1000
        var11_11 = var10_10;
        var11_11 = ((Gu1)var10_10).a();
        if (var11_11 != null) {
            var11_11 = var11_11.c;
        } else lbl-1000:
        // 2 sources

        {
            var12_12 = 0;
            var11_11 = null;
        }
        if (var7_7 != null && (var7_7 = var7_7.c((S93)var11_11)) != null) {
            var11_11 = var7_7;
        }
        var5_5 = var3_3.o();
        var14_14 = var6_6.c;
        if ((var5_5 &= var14_14) != 0 && (var3_3 = (var10_10 = (Gu1)var10_10).a()) != null) {
            var4_4 = var3_3.d;
        }
        if (var11_11 != null && (var3_3 = var11_11.c((S93)var4_4)) != null) {
            var4_4 = var3_3;
        }
        if (var4_4 != null) {
            var1_1 = var1_1.a;
            var5_5 = var2_2.c;
            var15_15 = var2_2.b;
            var1_1.a((S93)var4_4, var15_15, var5_5);
        }
        return Unit.a;
    }
}

