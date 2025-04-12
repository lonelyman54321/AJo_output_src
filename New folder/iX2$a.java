/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

public final class iX2$a
extends qg3_2
implements Function2 {
    public ks1_1 a;
    public gx2_0 b;
    public int c;
    public final /* synthetic */ gx2_0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ gr3 f;
    public final /* synthetic */ un0_0 g;

    public iX2$a(f80_0 f80_02, un0_0 un0_02, gx2_0 gx2_02, gr3 gr32, Object object) {
        this.d = gx2_02;
        this.e = object;
        this.f = gr32;
        this.g = un0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gr3 gr32 = this.f;
        un0_0 un0_02 = this.g;
        gx2_0 gx2_02 = this.d;
        Object object2 = this.e;
        object = new iX2$a(f80_02, un0_02, gx2_02, gr32, object2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (iX2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((iX2$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block39: {
            block34: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block28: {
                                    block29: {
                                        block30: {
                                            block31: {
                                                block32: {
                                                    block33: {
                                                        var2_2 = this;
                                                        var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                        var4_5 = this.c;
                                                        var5_6 = -9223372036854775808L;
                                                        var7_7 = 5;
                                                        var8_8 = 7.0E-45f;
                                                        var9_9 = 4;
                                                        var10_10 = 5.6E-45f;
                                                        var11_11 = 3;
                                                        var12_12 = 4.2E-45f;
                                                        var13_13 = 2;
                                                        var14_14 = 1;
                                                        var15_15 = 0L;
                                                        var17_16 = this.e;
                                                        var18_17 = this.d;
                                                        if (var4_5 == 0) break block28;
                                                        if (var4_5 == var14_14) break block29;
                                                        if (var4_5 == var13_13) break block30;
                                                        if (var4_5 == var11_11) break block31;
                                                        if (var4_5 == var9_9) break block32;
                                                        if (var4_5 != var7_7) break block33;
                                                        vl2_2.b(var1_1);
                                                        break block34;
                                                    }
                                                    var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var3_3 /* !! */ ;
                                                }
                                                vl2_2.b(var1_1);
                                                var19_18 = var17_16;
                                                break block35;
                                            }
                                            vl2_2.b(var1_1);
                                            break block36;
                                        }
                                        vl2_2.b(var1_1);
                                        break block37;
                                    }
                                    var20_19 = this.b;
                                    var21_20 = this.a;
                                    vl2_2.b(var1_1);
                                    break block38;
                                }
                                vl2_2.b(var1_1);
                                var20_19 = var18_17.b.getValue();
                                var22_21 = Intrinsics.areEqual(var17_16, var20_19);
                                if (!var22_21) {
                                    gx2_0.f(var18_17);
                                    var18_17.o(0.0f);
                                    var23_22 = this.f;
                                    var23_22.r(var17_16);
                                    var23_22.p(var15_15);
                                    var18_17.c(var20_19);
                                    var20_19 = var18_17.b;
                                    var20_19.setValue(var17_16);
                                }
                                var2_2.a = var20_19 = var18_17.j;
                                var2_2.b = var18_17;
                                var2_2.c = var14_14;
                                var23_22 = var20_19.d(var2_2, null);
                                if (var23_22 == var3_3 /* !! */ ) {
                                    return var3_3 /* !! */ ;
                                }
                                var21_20 = var20_19;
                                var20_19 = var18_17;
                            }
                            try {
                                var20_19 = var20_19.d;
                                var21_20.b(null);
                            }
                            catch (Throwable var3_4) {
                                var20_19 = var3_4;
                                var21_20.b(null);
                                throw var3_4;
                            }
                            var4_5 = (int)Intrinsics.areEqual(var17_16, var20_19);
                            if (var4_5 == 0) {
                                var2_2.a = null;
                                var2_2.b = null;
                                var2_2.c = var13_13;
                                var24_23 = var18_17.l;
                                cfr_temp_0 = var24_23 - var5_6;
                                var4_5 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var4_5 == 0) {
                                    var20_19 = aQ1.a(this.getContext());
                                    var23_22 = var18_17.o;
                                    if ((var20_19 = var20_19.R((Function1)var23_22, var2_2)) != var3_3 /* !! */ ) {
                                        var20_19 = Unit.a;
                                    }
                                } else {
                                    var20_19 = var18_17.k(var2_2);
                                    if (var20_19 != var3_3 /* !! */ ) {
                                        var20_19 = Unit.a;
                                    }
                                }
                                if (var20_19 == var3_3 /* !! */ ) {
                                    return var3_3 /* !! */ ;
                                } else {
                                    ** GOTO lbl91
                                }
                            }
                            break block36;
                        }
                        var2_2.c = var11_11;
                        var20_19 = gx2_0.j(var18_17, var2_2);
                        if (var20_19 == var3_3 /* !! */ ) {
                            return var3_3 /* !! */ ;
                        }
                    }
                    var20_19 = var18_17.c.getValue();
                    var4_5 = (int)Intrinsics.areEqual(var20_19, var17_16);
                    if (var4_5 != 0) break block39;
                    var20_19 = var18_17.h;
                    var8_8 = var20_19.c();
                    var11_11 = 1065353216;
                    var12_12 = 1.0f;
                    cfr_temp_1 = var8_8 - var12_12;
                    var7_7 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                    if (var7_7 >= 0) ** GOTO lbl-1000
                    var23_22 = var18_17.n;
                    var26_24 = var2_2.g;
                    if (var26_24 != null) {
                        var21_20 = FloatCompanionObject.INSTANCE;
                        var21_20 = ya3_0.a;
                        var26_24 = var26_24.a();
                    } else {
                        var13_13 = 0;
                        var26_24 = null;
                    }
                    if (var23_22 != null && (var14_14 = (int)Intrinsics.areEqual(var26_24, var21_20 = var23_22.b)) != 0) lbl-1000:
                    // 2 sources

                    {
                        var19_18 = var17_16;
                    } else {
                        var27_25 = var23_22 != null ? (var21_20 = var23_22.b) : null;
                        if (var27_25 != null) {
                            var5_6 = var23_22.a;
                            var28_26 = gx2_0.s;
                            var29_27 = var23_22.f;
                            if (var29_27 == null) {
                                var29_27 = gx2_0.r;
                            }
                            var30_28 = var29_27;
                            var29_27 = var23_22.e;
                            var31_29 = (kl_1)var27_25.e(var5_6, var29_27, var28_26, var30_28);
                        } else if (var23_22 != null && (var14_14 = (int)((cfr_temp_2 = (var32_30 = var23_22.a) - var15_15) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) != 0) {
                            var32_30 = var23_22.g;
                            cfr_temp_3 = var32_30 - var5_6;
                            var14_14 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                            if (var14_14 == 0) {
                                var32_30 = var18_17.f;
                            }
                            var34_31 = var32_30;
                            var35_32 = 1.0E9f;
                            cfr_temp_4 = (var34_31 /= var35_32) - 0.0f;
                            var36_33 /* !! */  = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1));
                            if (var36_33 /* !! */  <= 0) {
                                var31_29 = gx2_0.r;
                            } else {
                                var9_9 = 1065353216;
                                var10_10 = 1.0f;
                                var12_12 = var10_10 / var34_31;
                                var31_29 = var37_34 = new kl_1(var12_12);
                            }
                        } else {
                            var31_29 = gx2_0.r;
                        }
                        if (var23_22 == null) {
                            var23_22 = new gX2$a();
                        }
                        var23_22.b = var26_24;
                        var36_33 /* !! */  = 0;
                        var35_32 = 0.0f;
                        var37_34 = null;
                        var23_22.c = false;
                        var23_22.d = var10_10 = var20_19.c();
                        var10_10 = var20_19.c();
                        var29_27 = var23_22.e;
                        var29_27.e(var10_10, 0);
                        var19_18 = var17_16;
                        var23_22.g = var38_35 = var18_17.f;
                        var23_22.a = var15_15;
                        var23_22.f = var31_29;
                        if (var26_24 != null) {
                            var20_19 = gx2_0.s;
                            var40_36 = var26_24.g(var29_27, (Ol)var20_19, var31_29);
                        } else {
                            var42_37 = var38_35;
                            var44_38 = var20_19.c();
                            var45_39 = var44_38;
                            var47_40 = (1.0 - var45_39) * var42_37;
                            var40_36 = ok1_1.c(var47_40);
                        }
                        var23_22.h = var40_36;
                        var18_17.n = var23_22;
                    }
                    var2_2.a = null;
                    var2_2.b = null;
                    var4_5 = 4;
                    var44_38 = 5.6E-45f;
                    var2_2.c = var4_5;
                    var20_19 = gx2_0.h(var18_17, var2_2);
                    if (var20_19 == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                }
                var18_17.c(var19_18);
                var4_5 = 5;
                var44_38 = 7.0E-45f;
                var2_2.c = var4_5;
                var20_19 = gx2_0.i(var18_17, var2_2);
                if (var20_19 == var3_3 /* !! */ ) {
                    return var3_3 /* !! */ ;
                }
            }
            var3_3 /* !! */  = gx2_0.r;
            var3_3 /* !! */  = null;
            var18_17.o(0.0f);
        }
        return Unit.a;
    }
}

