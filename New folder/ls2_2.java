/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lS2
 */
public final class ls2_2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ea1_2 var0, f80_0 var1_1) {
        var2_2 = var1_1 instanceof ls2$a_0;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (ls2$a_0)var1_1;
        var4_4 = var3_3.c;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.c = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new h80_0((f80_0)var1_1);
        }
        var1_1 = var3_3.b;
        var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.c;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl23
        if (var5_5 == var6_6) {
            var0 = var3_3.a;
            vl2_2.b(var1_1);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl23:
            // 1 sources

            vl2_2.b(var1_1);
            var1_1 = var0.d().b();
            var3_3.a = var0;
            var3_3.c = var6_6;
            var1_1 = wf_1.k((uf_1)var1_1, (f80_0)var3_3);
            if (var1_1 == var7_7 /* !! */ ) {
                return var7_7 /* !! */ ;
            }
        }
        var1_1 = (b93_0)var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "<this>");
        var1_1 = o93_0.b((b93_0)var1_1, -1);
        var7_7 /* !! */  = var0.a;
        var8_8 = var0.c();
        var0 = var0.d();
        var3_3 = new ps2_2((da1_2)var7_7 /* !! */ , var8_8, (jb1_2)var0, (byte[])var1_1);
        return var3_3;
    }
}

