/*
 * Decompiled with CFR 0.152.
 */
public final class I70 {
    public static final gh3_2 a;

    static {
        gh3_2 gh3_22;
        a = gh3_22 = new gh3_2("RESUME_TOKEN");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ru_0 var0, f80_0 var1_1) {
        block4: {
            block5: {
                block6: {
                    var2_2 = var1_1 instanceof F70;
                    if (!var2_2) ** GOTO lbl-1000
                    var3_3 = var1_1;
                    var3_3 = (F70)var1_1;
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
                    if (var5_5 == 0) break block5;
                    if (var5_5 != var6_6) break block6;
                    var0 = var3_3.a;
                    vl2_2.b(var1_1);
                    ** GOTO lbl31
                }
                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var0;
            }
            vl2_2.b(var1_1);
            block0: while (true) {
                var3_3.a = var0;
                var3_3.c = var6_6;
                var1_1 = Nv2.Main;
                if ((var1_1 = var0.x0((Nv2)var1_1, var3_3)) == var7_7 /* !! */ ) break block4;
lbl31:
                // 2 sources

                var1_1 = (mv2_0)var1_1;
                var5_5 = var1_1.c & 66;
                if (var5_5 == 0) continue;
                var1_1 = var1_1.a;
                var5_5 = var1_1.size();
                for (var8_8 = 0; var8_8 < var5_5; ++var8_8) {
                    var9_9 = (aw2_0)var1_1.get(var8_8);
                    var10_10 = var9_9.b();
                    if (!var10_10 && !(var10_10 = var9_9.h) && (var11_11 = var9_9.d)) continue;
                    continue block0;
                }
                break;
            }
            var7_7 /* !! */  = var1_1.get(0);
        }
        return var7_7 /* !! */ ;
    }
}

