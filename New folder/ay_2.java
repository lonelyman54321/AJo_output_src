/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from ay
 */
public final class ay_2
implements dj0 {
    public final Fe1 a;
    public final ba2 b;
    public final wy2_2 c;
    public final yE0 d;

    public ay_2(Fe1 fe1, ba2 ba22, az2_2 az2_22, yE0 yE02) {
        this.a = fe1;
        this.b = ba22;
        this.c = az2_22;
        this.d = yE02;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(f80_0 var1_1) {
        block10: {
            block11: {
                block14: {
                    block12: {
                        block13: {
                            var2_3 = var1_1 instanceof ay$c;
                            if (!var2_3) ** GOTO lbl-1000
                            var3_4 = var1_1;
                            var3_4 = (ay$c)var1_1;
                            var4_6 = var3_4.e;
                            var5_7 = -1 << -1;
                            var6_8 = var4_6 & var5_7;
                            if (var6_8 != 0) {
                                var3_4.e = var4_6 -= var5_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_4 = new ay$c(this, (f80_0)var1_1);
                            }
                            var1_1 = var3_4.c;
                            var7_9 = j90_0.COROUTINE_SUSPENDED;
                            var5_7 = var3_4.e;
                            var6_8 = 2;
                            var8_10 = 1;
                            if (var5_7 == 0) break block12;
                            if (var5_7 == var8_10) break block13;
                            if (var5_7 != var6_8) {
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var3_4 = (wy2_2)var3_4.a;
                            try {
                                vl2_2.b(var1_1);
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                break block10;
                            }
                        }
                        var9_11 = var3_4.b;
                        var10_12 = (ay_2)var3_4.a;
                        vl2_2.b(var1_1);
                        var1_1 = var9_11;
                        break block14;
                    }
                    vl2_2.b(var1_1);
                    var3_4.a = this;
                    var3_4.b = var1_1 = this.c;
                    var3_4.e = var8_10;
                    var9_11 = var1_1.c((ay$c)var3_4);
                    if (var9_11 == var7_9) {
                        return var7_9;
                    }
                    var10_12 = this;
                }
                try {
                    var9_11 = new zx_1(var10_12);
                    var3_4.a = var1_1;
                    var8_10 = 0;
                    var10_12 = null;
                    var3_4.b = null;
                    var3_4.e = var6_8;
                    var3_4 = mj1_2.a((Function0)var9_11, (h80_0)var3_4);
                    if (var3_4 == var7_9) {
                        return var7_9;
                    }
                    var11_13 = var3_4;
                    var3_4 = var1_1;
                    var1_1 = var11_13;
                }
                catch (Throwable var3_5) {
                    break block11;
                }
lbl-1000:
                // 2 sources

                {
                    var1_1 = (aj0)var1_1;
                    var3_4.release();
                    return var1_1;
                }
            }
            var11_14 = var3_5;
            var3_4 = var1_1;
            var1_1 = var11_14;
        }
        var3_4.release();
        throw var1_1;
    }
}

