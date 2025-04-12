/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

/*
 * Renamed from c40
 */
public final class c40_0 {
    public static final gh3_2 a;

    static {
        gh3_2 gh3_22;
        a = gh3_22 = new gh3_2("CLOSED");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(wx2_2 var0, long var1_1, Function2 var3_2) {
        block0: while (true) {
            if ((var6_4 = (cfr_temp_0 = (var4_3 = var0.c) - var1_1) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) >= 0 && !(var7_5 = var0.d())) {
                return var0;
            }
            var8_6 /* !! */  = d40_0.a.get(var0);
            if (var8_6 /* !! */  == (var9_7 = c40_0.a)) {
                return var9_7;
            }
            if ((var8_6 /* !! */  = (wx2_2)((d40_0)var8_6 /* !! */ )) != null) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var0 = var8_6 /* !! */ ;
                    continue block0;
                    break;
                }
            }
            var4_3 = var0.c;
            var10_8 = 1L;
            var8_6 /* !! */  = var4_3 += var10_8;
            var8_6 /* !! */  = (wx2_2)var3_2.invoke(var8_6 /* !! */ , var0);
            do {
                if ((var6_4 = (long)(var9_7 = d40_0.a).compareAndSet(var0, null, var8_6 /* !! */ )) == false) continue;
                var12_9 = var0.d();
                if (!var12_9) ** GOTO lbl-1000
                var0.e();
                ** continue;
            } while ((var9_7 = var9_7.get(var0)) == null);
        }
    }
}

