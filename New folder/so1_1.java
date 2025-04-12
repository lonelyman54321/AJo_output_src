/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from So1
 */
public final class so1_1
implements fs0_2 {
    public int a;
    public final /* synthetic */ gf_2 b;
    public final /* synthetic */ pl1_2 c;
    public final /* synthetic */ ro1_2 d;
    public final /* synthetic */ KSerializer e;
    public final /* synthetic */ Charset f;

    public so1_1(gf_2 gf_22, pl1_2 pl1_22, ro1_2 ro1_22, KSerializer kSerializer, Charset charset) {
        this.b = gf_22;
        this.c = pl1_22;
        this.d = ro1_22;
        this.e = kSerializer;
        this.f = charset;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block15: {
            block13: {
                block14: {
                    block9: {
                        block10: {
                            block11: {
                                block12: {
                                    var3_3 = 1;
                                    var4_4 = var2_2 instanceof So1$a;
                                    if (!var4_4) ** GOTO lbl-1000
                                    var5_5 = var2_2;
                                    var5_5 = (So1$a)var2_2;
                                    var6_6 = var5_5.b;
                                    var7_7 = -1 << -1;
                                    var8_8 = var6_6 & var7_7;
                                    if (var8_8 != 0) {
                                        var5_5.b = var6_6 -= var7_7;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var5_5 = new So1$a(this, (f80_0)var2_2);
                                    }
                                    var2_2 = var5_5.a;
                                    var9_9 = j90_0.COROUTINE_SUSPENDED;
                                    var7_7 = var5_5.b;
                                    var8_8 = 0;
                                    var10_10 = 3;
                                    var11_11 = 2;
                                    if (var7_7 == 0) break block9;
                                    if (var7_7 == var3_3) break block10;
                                    if (var7_7 == var11_11) break block11;
                                    if (var7_7 != var10_10) break block12;
                                    vl2_2.b(var2_2);
                                    break block13;
                                }
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var1_1 = var5_5.d;
                            vl2_2.b(var2_2);
                            break block14;
                        }
                        var1_1 = var5_5.e;
                        var12_12 = var5_5.d;
                        vl2_2.b(var2_2);
                        ** GOTO lbl53
                    }
                    vl2_2.b(var2_2);
                    var13_13 = this.a;
                    this.a = var7_7 = var13_13 + 1;
                    if (var13_13 < 0) break block15;
                    if (var13_13 > 0) {
                        var2_2 = this.c.c;
                        var5_5.d = this;
                        var5_5.e = var1_1;
                        var5_5.b = var3_3;
                        var12_12 = kf_1.a;
                        var14_14 = this.b;
                        var3_3 = ((Object)var2_2).length;
                        if ((var2_2 = kf_1.b((gf_2)var14_14, (byte[])var2_2, 0, var3_3, var5_5)) == var9_9) {
                            return var9_9;
                        }
                        var12_12 = this;
lbl53:
                        // 2 sources

                        var2_2 = var1_1;
                        var1_1 = var12_12;
                    } else {
                        var2_2 = var1_1;
                        var1_1 = this;
                    }
                    var12_12 = var1_1.d.a;
                    var14_14 = var1_1.e;
                    var2_2 = var12_12.b((b03_0)var14_14, var2_2);
                    var12_12 = var1_1.f;
                    var2_2 = be3_1.b((String)var2_2, (Charset)var12_12);
                    var5_5.d = var1_1;
                    var5_5.e = null;
                    var5_5.b = var11_11;
                    var12_12 = kf_1.a;
                    var3_3 = ((Object)var2_2).length;
                    var14_14 = var1_1.b;
                    var2_2 = kf_1.b((gf_2)var14_14, (byte[])var2_2, 0, var3_3, var5_5);
                    if (var2_2 == var9_9) {
                        return var9_9;
                    }
                }
                var1_1 = var1_1.b;
                var5_5.d = null;
                var5_5.b = var10_10;
                var1_1 = var1_1.d(var5_5);
                if (var1_1 == var9_9) {
                    return var9_9;
                }
            }
            return Unit.a;
        }
        var1_1 = new ArithmeticException("Index overflow has happened");
        throw var1_1;
    }
}

