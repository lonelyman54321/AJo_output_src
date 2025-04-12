/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mJ$a
 */
public final class mj$a_1 {
    /*
     * Unable to fully structure code
     */
    public static boolean a(cl2_2 var0, kj2_2 var1_1) {
        block9: {
            Intrinsics.checkNotNullParameter(var0, "response");
            var2_2 = "request";
            Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
            var3_3 = var0.d;
            var4_4 = 200;
            var5_5 = false;
            if (var3_3 == var4_4 || var3_3 == (var4_4 = 410) || var3_3 == (var4_4 = 414) || var3_3 == (var4_4 = 501) || var3_3 == (var4_4 = 203) || var3_3 == (var4_4 = 204)) break block9;
            var4_4 = 307;
            if (var3_3 == var4_4) ** GOTO lbl-1000
            var4_4 = 308;
            if (var3_3 == var4_4 || var3_3 == (var4_4 = 404) || var3_3 == (var4_4 = 405)) break block9;
            switch (var3_3) {
                default: {
                    return false;
                }
                case 302: lbl-1000:
                // 2 sources

                {
                    if ((var2_2 = cl2_2.c((cl2_2)var0, "Expires")) != null) break;
                    var2_2 = var0.a();
                    var3_3 = var2_2.c;
                    var4_4 = -1;
                    if (var3_3 != var4_4) break;
                    var2_2 = var0.a();
                    var3_3 = (int)var2_2.f;
                    if (var3_3 != 0) break;
                    var2_2 = var0.a();
                    var3_3 = (int)var2_2.e;
                    if (var3_3 != 0) break;
                    return false;
                }
                case 300: 
                case 301: 
            }
        }
        var0 = var0.a();
        var6_6 = var0.b;
        if (!var6_6) {
            var0 = var1_1.a();
            var6_6 = var0.b;
            if (!var6_6) {
                var5_5 = true;
            }
        }
        return var5_5;
    }
}

