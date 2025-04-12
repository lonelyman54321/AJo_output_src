/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I92$e
 */
public final class i92$e_0
extends I92 {
    public static final i92$e_0 c;

    static {
        i92$e_0 i92$e_0;
        c = i92$e_0 = new I92(0, 4, 1);
    }

    /*
     * Unable to fully structure code
     */
    public final void a(R92$a var1_1, mp var2_2, q73 var3_4, F30$a var4_5) {
        var5_6 = 2;
        var2_2 = (vQ1)var1_1.b(var5_6);
        var6_7 = 3;
        var4_5 = (vQ1)var1_1.b(var6_7);
        var7_8 = 1;
        var8_9 = (A30)var1_1.b(var7_8);
        var9_10 = null;
        if ((var1_1 = (uq1_0)var1_1.b(0)) == null && (var1_1 = var8_9.l((vQ1)var2_2)) == null) {
            p30_0.d("Could not resolve state for movable content");
            throw null;
        }
        var5_6 = var3_4.n;
        if (var5_6 > 0) ** GOTO lbl-1000
        var5_6 = var3_4.t + var7_8;
        if ((var5_6 = var3_4.q(var5_6)) == var7_8) {
            var5_6 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var5_6 = 0;
            var2_2 = null;
        }
        p30_0.h((boolean)var5_6);
        var5_6 = var3_4.t;
        var10_11 = var3_4.i;
        var11_12 = var3_4.j;
        var3_4.a(var7_8);
        var3_4.L();
        var3_4.d();
        var1_1 = var1_1.a.i();
        var12_13 = 2;
        var13_14 = true;
        var14_15 = true;
        try {
            var9_10 = q73$a.a((q73)var1_1, var12_13, var3_4, false, var14_15, var13_14);
            var1_1.e((boolean)var7_8);
            var3_4.j();
            var3_4.i();
            var3_4.t = var5_6;
            var3_4.i = var10_11;
            var3_4.j = var11_12;
            var1_1 = var4_5.c;
        }
        catch (Throwable var2_3) {
            var1_1.e(false);
            throw var2_3;
        }
        Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
        var1_1 = (EF2)var1_1;
        CF2$a.a(var3_4, var9_10, (EF2)var1_1);
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "resolvedState" : ((bl2 = I92$t.a(n3, 1)) ? "resolvedCompositionContext" : ((bl2 = I92$t.a(n3, 2)) ? "from" : ((bl2 = I92$t.a(n3, 3)) ? "to" : super.c(n3))));
        return string2;
    }
}

