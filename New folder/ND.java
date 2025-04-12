/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class ND
implements MD {
    public final WR1 a;

    public ND() {
        WR1 wR1;
        Object[] objectArray = new OD[16];
        this.a = wR1 = new WR1(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(aG2 var1_1, f80_0 var2_2) {
        block6: {
            block4: {
                block5: {
                    var3_3 = var2_2 instanceof ND$a;
                    if (!var3_3) ** GOTO lbl-1000
                    var4_4 = var2_2;
                    var4_4 = (ND$a)var2_2;
                    var5_5 = var4_4.g;
                    var6_6 = -1 << -1;
                    var7_7 = var5_5 & var6_6;
                    if (var7_7 != 0) {
                        var4_4.g = var5_5 -= var6_6;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 = new ND$a(this, (f80_0)var2_2);
                    }
                    var2_2 = var4_4.e;
                    var8_8 = j90_0.COROUTINE_SUSPENDED;
                    var6_6 = var4_4.g;
                    var7_7 = 1;
                    if (var6_6 == 0) break block4;
                    if (var6_6 != var7_7) break block5;
                    var9_9 = var4_4.d;
                    var6_6 = var4_4.c;
                    var10_10 = var4_4.b;
                    var11_11 = var4_4.a;
                    vl2_2.b(var2_2);
                    var2_2 = var11_11;
                    ** GOTO lbl-1000
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var2_2);
            var2_2 = this.a;
            var6_6 = var2_2.c;
            if (var6_6 > 0) {
                var10_10 = var2_2.a;
                var2_2 = var1_1;
                var9_9 = 0;
                var1_1 = null;
                while (true) lbl-1000:
                // 2 sources

                {
                    var11_11 = (OD)var10_10[var9_9];
                    var4_4.a = var2_2;
                    var4_4.b = var10_10;
                    var4_4.c = var6_6;
                    var4_4.d = var9_9;
                    var4_4.g = var7_7;
                    if ((var11_11 = ym1_1.c((fo0)var11_11, (aG2)var2_2, var4_4)) != var8_8) continue;
                    return var8_8;
                }
            }
            break block6;
lbl-1000:
            // 2 sources

            {
                ** while ((var9_9 += var7_7) < var6_6)
            }
        }
        return Unit.a;
    }
}

