/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class rS0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final Lj e;
    public kj1 f;
    public kj1 g;

    public rS0(float f5, float f6, float f7, float f8) {
        Lj lj;
        this.a = f5;
        this.b = f6;
        this.c = f7;
        this.d = f8;
        xs0_0 xs0_02 = new xs0_0(f5);
        Ws3 ws3 = ya3_0.c;
        this.e = lj = new Lj((Object)xs0_02, ws3, null, 12);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(kj1 var1_1, f80_0 var2_2) {
        block19: {
            block18: {
                block20: {
                    var3_6 = this.e;
                    var4_7 = var2_2 instanceof rS0$a;
                    if (!var4_7) ** GOTO lbl-1000
                    var5_8 = var2_2;
                    var5_8 = (rS0$a)var2_2;
                    var6_9 = var5_8.e;
                    var7_10 = -1 << -1;
                    var8_11 = -0.0f;
                    var9_12 = var6_9 & var7_10;
                    if (var9_12 != 0) {
                        var5_8.e = var6_9 -= var7_10;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_8 = new rS0$a(this, (f80_0)var2_2);
                    }
                    var2_2 = var5_8.c;
                    var10_13 = j90_0.COROUTINE_SUSPENDED;
                    var7_10 = var5_8.e;
                    var9_12 = 1;
                    if (var7_10 != 0) {
                        if (var7_10 == var9_12) {
                            var1_1 = var5_8.b;
                            var3_6 = var5_8.a;
                            try {
                                vl2_2.b(var2_2);
                                break block18;
                            }
                            catch (Throwable var2_3) {
                                break block19;
                            }
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var2_2);
                    var11_14 = var1_1 instanceof Ey2$b;
                    var12_15 = var11_14 != false ? this.b : ((var11_14 = var1_1 instanceof x91) != false ? this.c : ((var11_14 = var1_1 instanceof rt0_0) != false ? this.d : this.a));
                    this.g = (kj1)var1_1;
                    try {
                        var13_16 = var3_6.e;
                    }
                    catch (Throwable var2_4) {
                        var3_6 = this;
                        break block19;
                    }
                    var13_16 = var13_16.getValue();
                    var13_16 = (xs0_0)var13_16;
                    var8_11 = var13_16.a;
                    var7_10 = (int)xs0_0.a(var8_11, var12_15);
                    if (var7_10 != 0) break block20;
                    var13_16 = this.f;
                    var5_8.a = this;
                    var5_8.b = (kj1)var1_1;
                    var5_8.e = var9_12;
                    var2_2 = ry0_0.a((Lj)var3_6, var12_15, (kj1)var13_16, (kj1)var1_1, var5_8);
                    if (var2_2 == var10_13) {
                        return var10_13;
                    }
                }
                var3_6 = this;
            }
            var3_6.f = (kj1)var1_1;
            return Unit.a;
        }
        var3_6.f = (kj1)var1_1;
        throw var2_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(f80_0 var1_1) {
        block19: {
            block18: {
                block17: {
                    var2_5 = var1_1 instanceof rS0$b;
                    if (!var2_5) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    var3_6 = (rS0$b)var1_1;
                    var4_7 = var3_6.d;
                    var5_8 = -1 << -1;
                    var6_9 = var4_7 & var5_8;
                    if (var6_9 != 0) {
                        var3_6.d = var4_7 -= var5_8;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_6 = new rS0$b(this, (f80_0)var1_1);
                    }
                    var1_1 = var3_6.b;
                    var7_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var5_8 = var3_6.d;
                    var6_9 = 1;
                    if (var5_8 != 0) {
                        if (var5_8 == var6_9) {
                            var3_6 = var3_6.a;
                            try {
                                vl2_2.b(var1_1);
                                break block17;
                            }
                            catch (Throwable var1_2) {
                                break block18;
                            }
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    vl2_2.b(var1_1);
                    var1_1 = this.g;
                    var5_8 = var1_1 instanceof Ey2$b;
                    var8_11 = var5_8 != 0 ? this.b : ((var5_8 = var1_1 instanceof x91) != 0 ? this.c : ((var9_12 = var1_1 instanceof rt0_0) != false ? this.d : this.a));
                    var10_13 = this.e;
                    var11_14 = (xs0_0)var10_13.e.getValue();
                    var12_15 = var11_14.a;
                    var13_16 = xs0_0.a(var12_15, var8_11);
                    if (var13_16) break block19;
                    var11_14 = new xs0_0(var8_11);
                    var3_6.a = this;
                    var3_6.d = var6_9;
                    try {
                        var1_1 = var10_13.e((f80_0)var3_6, var11_14);
                        if (var1_1 == var7_10 /* !! */ ) {
                            return var7_10 /* !! */ ;
                        }
                        var3_6 = this;
                    }
                    catch (Throwable var1_3) {
                        var3_6 = this;
                    }
                }
                var3_6.f = var1_1 = var3_6.g;
                break block19;
            }
            var7_10 /* !! */  = var3_6.g;
            var3_6.f = var7_10 /* !! */ ;
            throw var1_4;
        }
        return Unit.a;
    }
}

