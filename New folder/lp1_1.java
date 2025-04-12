/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from lP1
 */
public final class lp1_1
extends LP1$c
implements J30,
rp1_1 {
    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.b(this, rj1, qj1, n3);
    }

    /*
     * Unable to fully structure code
     */
    public final bl1_0 measure-3p2s80s(dl1_1 var1_1, xk1_0 var2_2, long var3_3) {
        var5_4 = this.m;
        if (var5_4 == 0) ** GOTO lbl-1000
        var6_5 = lj1.a;
        var5_4 = (var6_5 = (Boolean)K30.a(this, (H30)var6_5)).booleanValue();
        if (var5_4 != 0) {
            var5_4 = 1;
            var7_6 = 1.4E-45f;
        } else lbl-1000:
        // 2 sources

        {
            var5_4 = 0;
            var7_6 = 0.0f;
            var6_5 = null;
        }
        var8_7 = lj1.b;
        var2_2 = var2_2.Q(var3_3);
        if (var5_4 != 0) {
            var10_8 = var2_2.a;
            var11_9 = bs0_0.b(var8_7);
            var12_10 = var1_1.e0(var11_9);
            var10_8 = Math.max(var10_8, var12_10);
        } else {
            var10_8 = var2_2.a;
        }
        if (var5_4 != 0) {
            var12_10 = var2_2.b;
            var7_6 = bs0_0.a(var8_7);
            var5_4 = var1_1.e0(var7_6);
            var12_10 = Math.max(var12_10, var5_4);
        } else {
            var12_10 = var2_2.b;
        }
        var6_5 = new lp1$a_0(var10_8, var12_10, (Ns2)var2_2);
        return cl1_0.a(var1_1, var10_8, var12_10, (Function1)var6_5);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qp1_0.d(this, rj1, qj1, n3);
    }
}

