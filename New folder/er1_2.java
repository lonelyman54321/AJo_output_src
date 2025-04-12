/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eR1
 */
public final class er1_2
extends qg3_2
implements Function2 {
    public u90_0 a;
    public if_1 b;
    public w00_0 c;
    public ka1_1 d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ uf_1 h;
    public final /* synthetic */ ef_2 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Long k;

    public er1_2(uf_1 uf_12, ef_2 ef_22, long l2, Long l3, f80_0 f80_02) {
        this.h = uf_12;
        this.i = ef_22;
        this.j = l2;
        this.k = l3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.j;
        Long l3 = this.k;
        uf_1 uf_12 = this.h;
        ef_2 ef_22 = this.i;
        er1_2 er1_22 = new er1_2(uf_12, ef_22, l2, l3, f80_02);
        er1_22.g = object;
        return er1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (er1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((er1_2)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block78: {
            block77: {
                block83: {
                    block84: {
                        block79: {
                            block70: {
                                block80: {
                                    block75: {
                                        block72: {
                                            block76: {
                                                block71: {
                                                    block73: {
                                                        block81: {
                                                            block74: {
                                                                block82: {
                                                                    var2_2 = this;
                                                                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                                    var4_13 = this.f;
                                                                    var5_14 = 3;
                                                                    var6_15 = null;
                                                                    var7_16 = 0L;
                                                                    switch (var4_13) {
                                                                        default: {
                                                                            var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            throw var3_3 /* !! */ ;
                                                                        }
                                                                        case 12: {
                                                                            var9_17 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            var10_18 = var1_1;
                                                                            break block77;
                                                                        }
                                                                        case 11: 
                                                                        case 13: {
                                                                            vl2_2.b(var1_1);
                                                                            break block78;
                                                                        }
                                                                        case 10: {
                                                                            var9_17 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            var10_18 = var1_1;
                                                                            break block79;
                                                                        }
                                                                        case 9: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.a;
                                                                            var14_21 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
lbl29:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var15_22 = var14_21;
                                                                                var14_21 = var13_20;
                                                                                var16_23 = var11_19;
                                                                                var9_17 = var15_22;
                                                                                break block70;
                                                                                break;
                                                                            }
                                                                        }
                                                                        case 8: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.a;
                                                                            var14_21 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            break block80;
                                                                        }
                                                                        case 7: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.d;
                                                                            var14_21 = this.c;
                                                                            var18_24 = this.b;
                                                                            var19_30 = this.a;
                                                                            var20_31 = (pz2_2)this.g;
                                                                            try {
                                                                                vl2_2.b(var1_1);
                                                                                var21_32 = var13_20;
                                                                                var22_33 = var14_21;
                                                                                var13_20 = var19_30;
                                                                                var14_21 = var20_31;
                                                                                break block71;
                                                                            }
                                                                            catch (Throwable var3_4) {
                                                                                var6_15 = var13_20;
                                                                                break block72;
                                                                            }
                                                                        }
                                                                        case 6: {
                                                                            var11_19 = this.e;
                                                                            var14_21 = this.c;
                                                                            var18_24 = this.b;
                                                                            var13_20 = this.a;
                                                                            var19_30 = (pz2_2)this.g;
                                                                            try {
                                                                                vl2_2.b(var1_1);
                                                                                var20_31 = var1_1;
                                                                                var23_34 = var11_19;
                                                                                var22_33 = var14_21;
                                                                                var14_21 = var19_30;
                                                                                var19_30 = var13_20;
                                                                                break block73;
                                                                            }
                                                                            catch (Throwable var3_5) {
                                                                                break block72;
                                                                            }
                                                                        }
                                                                        case 5: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.c;
                                                                            var14_21 = this.b;
                                                                            var18_24 = this.a;
                                                                            var19_30 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            var15_22 = var14_21;
                                                                            var14_21 = var13_20;
                                                                            var13_20 = var15_22;
                                                                            break block81;
                                                                        }
                                                                        case 4: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.a;
                                                                            var14_21 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            while (true) {
                                                                                var18_24 = var13_20;
                                                                                var19_30 = var14_21;
                                                                                break block74;
                                                                                break;
                                                                            }
                                                                        }
                                                                        case 3: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.a;
                                                                            var14_21 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            var18_24 = var1_1;
                                                                            ** GOTO lbl170
                                                                        }
                                                                        case 2: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.a;
                                                                            var14_21 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            break block82;
                                                                        }
                                                                        case 1: {
                                                                            var11_19 = this.e;
                                                                            var13_20 = this.a;
                                                                            var14_21 = (pz2_2)this.g;
                                                                            vl2_2.b(var1_1);
                                                                            var10_18 = var1_1;
                                                                            var9_17 = var14_21;
                                                                            var25_35 = var11_19;
                                                                            break;
                                                                        }
                                                                        case 0: {
                                                                            vl2_2.b(var1_1);
                                                                            var9_17 = (pz2_2)this.g;
                                                                            var10_18 = this.h;
                                                                            Intrinsics.checkNotNullParameter(var10_18, "<this>");
                                                                            var13_20 = new u90_0((uf_1)var10_18);
                                                                            var13_20.b();
                                                                            var25_35 = var13_20.e;
                                                                            var10_18 = hr1_2.b.a;
                                                                            var27_25 = ((Object)var10_18).length;
                                                                            var19_30 = this.i;
                                                                            var20_31 = var19_30.a;
                                                                            var28_26 = ((Object)var20_31).length;
                                                                            if (var27_25 == var28_26) {
                                                                                var10_18 = ef_2.c;
                                                                            } else {
                                                                                var19_30 = var19_30.a;
                                                                                var29_36 = new ef_2((byte[])var19_30, var27_25, var28_26);
                                                                                var10_18 = var29_36;
                                                                            }
                                                                            var19_30 = new eR1$a((ef_2)var10_18, (u90_0)var13_20, null);
                                                                            var10_18 = kf_1.e((i90_0)var9_17, null, (Function2)var19_30, var5_14);
                                                                            var2_2.g = var9_17;
                                                                            var2_2.a = var13_20;
                                                                            var2_2.e = var25_35;
                                                                            var2_2.f = var30_37 = 1;
                                                                            var10_18 = wf_1.k(var10_18.a, var2_2);
                                                                            if (var10_18 != var3_3 /* !! */ ) break;
                                                                            return var3_3 /* !! */ ;
                                                                        }
                                                                    }
                                                                    var10_18 = (b93_0)var10_18;
                                                                    var31_27 = af_2.c((b93_0)var10_18);
                                                                    var33_38 = var31_27 == var7_16 ? 0 : (var31_27 < var7_16 ? -1 : 1);
                                                                    if (var33_38 > 0) {
                                                                        var19_30 = new dR1$c((b93_0)var10_18);
                                                                        var2_2.g = var9_17;
                                                                        var2_2.a = var13_20;
                                                                        var2_2.e = var25_35;
                                                                        var2_2.f = var27_25 = 2;
                                                                        var10_18 = var9_17.o(var2_2, var19_30);
                                                                        if (var10_18 == var3_3 /* !! */ ) {
                                                                            return var3_3 /* !! */ ;
                                                                        }
                                                                    }
                                                                    var14_21 = var9_17;
                                                                    var11_19 = var25_35;
                                                                }
lbl159:
                                                                // 2 sources

                                                                while ((var34_28 /* !! */  = var13_20.i()) == 0) {
                                                                    var18_24 = hr1_2.b;
                                                                    var2_2.g = var14_21;
                                                                    var2_2.a = var13_20;
                                                                    var2_2.b = null;
                                                                    var2_2.c = null;
                                                                    var2_2.d = null;
                                                                    var2_2.e = var11_19;
                                                                    var2_2.f = var5_14;
                                                                    if ((var18_24 = wf_1.o((uf_1)var13_20, (ef_2)var18_24, var2_2)) == var3_3 /* !! */ ) {
                                                                        return var3_3 /* !! */ ;
                                                                    }
lbl170:
                                                                    // 3 sources

                                                                    var18_24 = (Boolean)var18_24;
                                                                    var34_28 /* !! */  = var18_24.booleanValue();
                                                                    if (var34_28 /* !! */  == 0) {
                                                                        var18_24 = hr1_2.a;
                                                                        var2_2.g = var14_21;
                                                                        var2_2.a = var13_20;
                                                                        var2_2.e = var11_19;
                                                                        var2_2.f = var30_37 = 4;
                                                                        if ((var18_24 = wf_1.o((uf_1)var13_20, (ef_2)var18_24, var2_2)) != var3_3 /* !! */ ) ** continue;
                                                                        return var3_3 /* !! */ ;
                                                                    }
                                                                    break block75;
                                                                }
                                                                break block75;
                                                            }
                                                            var13_20 = new if_1(false);
                                                            var14_21 = y00_0.b();
                                                            var20_31 = new dR1$b((x00_0)var14_21, (if_1)var13_20);
                                                            var2_2.g = var19_30;
                                                            var2_2.a = var18_24;
                                                            var2_2.b = var13_20;
                                                            var2_2.c = var14_21;
                                                            var2_2.e = var11_19;
                                                            var33_38 = 5;
                                                            var2_2.f = (int)var33_38;
                                                            var20_31 = var19_30.o(var2_2, var20_31);
                                                            if (var20_31 == var3_3 /* !! */ ) {
                                                                return var3_3 /* !! */ ;
                                                            }
                                                        }
                                                        var2_2.g = var19_30;
                                                        var2_2.a = var18_24;
                                                        var2_2.b = var13_20;
                                                        var2_2.c = var14_21;
                                                        var2_2.e = var11_19;
                                                        var28_26 = 6;
                                                        var2_2.f = var28_26;
                                                        var20_31 = hr1_2.b((u90_0)var18_24, var2_2);
                                                        if (var20_31 == var3_3 /* !! */ ) {
                                                            return var3_3 /* !! */ ;
                                                        }
                                                        var23_34 = var11_19;
                                                        var22_33 = var14_21;
                                                        var14_21 = var19_30;
                                                        var19_30 = var18_24;
                                                        var18_24 = var13_20;
                                                    }
                                                    var20_31 = (ka1_1)var20_31;
                                                    var4_13 = (int)var22_33.M(var20_31);
                                                    if (var4_13 == 0) break block76;
                                                    var9_17 = var2_2.i;
                                                    var16_23 = var2_2.j;
                                                    var2_2.g = var14_21;
                                                    var2_2.a = var19_30;
                                                    var2_2.b = var18_24;
                                                    var2_2.c = var22_33;
                                                    var2_2.d = var20_31;
                                                    var2_2.e = var23_34;
                                                    var5_14 = 7;
                                                    var2_2.f = var5_14;
                                                    var10_18 = var19_30;
                                                    var13_20 = var18_24;
                                                    var35_39 = var14_21;
                                                    var14_21 = var20_31;
                                                    var36_40 = var18_24;
                                                    var37_29 = var16_23;
                                                    var21_32 = var20_31;
                                                    var20_31 = this;
                                                    var9_17 = hr1_2.a((ef_2)var9_17, (u90_0)var19_30, (if_1)var18_24, (ka1_1)var14_21, var16_23, this);
                                                    if (var9_17 == var3_3 /* !! */ ) {
                                                        return var3_3 /* !! */ ;
                                                    }
                                                    var14_21 = var35_39;
                                                    var11_19 = var23_34;
                                                    var13_20 = var19_30;
                                                }
                                                try {
                                                    var18_24.j();
                                                    var5_14 = 3;
                                                    ** GOTO lbl159
                                                }
                                                catch (Throwable var3_6) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        var14_21 = var22_33;
                                                        var6_15 = var21_32;
                                                        break block72;
                                                        break;
                                                    }
                                                }
lbl269:
                                                // 2 sources

                                                while (true) {
                                                    var14_21 = var22_33;
                                                    var6_15 = var21_32;
                                                    var18_24 = var36_40;
                                                    break block72;
                                                    break;
                                                }
                                                catch (Throwable var3_8) {
                                                    var36_40 = var18_24;
                                                    var21_32 = var20_31;
                                                    ** continue;
                                                }
                                                catch (Throwable var3_9) {
                                                    var36_40 = var18_24;
                                                    var21_32 = var20_31;
                                                    ** GOTO lbl269
                                                }
                                            }
                                            var36_40 = var18_24;
                                            var21_32 = var20_31;
                                            try {
                                                var20_31.c();
                                                var9_17 = "Multipart processing has been cancelled";
                                            }
                                            catch (Throwable var3_10) {
                                                ** continue;
                                            }
                                            var3_3 /* !! */  = new CancellationException((String)var9_17);
                                            throw var3_3 /* !! */ ;
                                            catch (Throwable var3_11) {
                                                var36_40 = var18_24;
                                                var14_21 = var22_33;
                                                break block72;
                                            }
lbl297:
                                            // 1 sources

                                            while (true) {
                                                var18_24 = var13_20;
                                                break block72;
                                                break;
                                            }
                                            catch (Throwable var3_12) {
                                                ** continue;
                                            }
                                        }
                                        var4_13 = (int)var14_21.c((Throwable)var3_7);
                                        if (var4_13 != 0 && var6_15 != null) {
                                            var6_15.c();
                                        }
                                        kf_1.a((gf_2)var18_24, (Throwable)var3_7);
                                        throw var3_7;
                                    }
                                    var18_24 = hr1_2.a;
                                    var2_2.g = var14_21;
                                    var2_2.a = var13_20;
                                    var2_2.b = null;
                                    var2_2.c = null;
                                    var2_2.d = null;
                                    var2_2.e = var11_19;
                                    var2_2.f = var30_37 = 8;
                                    if ((var18_24 = wf_1.o((uf_1)var13_20, (ef_2)var18_24, var2_2)) == var3_3 /* !! */ ) {
                                        return var3_3 /* !! */ ;
                                    }
                                }
                                var18_24 = hr1_2.a;
                                var2_2.g = var14_21;
                                var2_2.a = var13_20;
                                var2_2.e = var11_19;
                                var2_2.f = var30_37 = 9;
                                ** while ((var18_24 = wf_1.o((uf_1)var13_20, (ef_2)var18_24, (f80_0)var2_2)) != var3_3 /* !! */ )
lbl326:
                                // 1 sources

                                return var3_3 /* !! */ ;
                            }
                            var18_24 = var2_2.k;
                            if (var18_24 == null) break block83;
                            var13_20.b();
                            var31_27 = var13_20.e - var11_19;
                            var16_23 = var18_24.longValue() - var31_27;
                            var37_29 = 0x7FFFFFFFL;
                            var28_26 = (int)(var16_23 == var37_29 ? 0 : (var16_23 < var37_29 ? -1 : 1));
                            if (var28_26 > 0) break block84;
                            var34_28 /* !! */  = (int)(var16_23 == var7_16 ? 0 : (var16_23 < var7_16 ? -1 : 1));
                            if (var34_28 /* !! */  > 0) {
                                var39_41 = (int)var16_23;
                                var2_2.g = var15_22;
                                var2_2.a = null;
                                var2_2.f = var27_25 = 10;
                                var10_18 = wf_1.i((uf_1)var13_20, var39_41, var2_2);
                                if (var10_18 == var3_3 /* !! */ ) {
                                    return var3_3 /* !! */ ;
                                } else {
                                    ** GOTO lbl346
                                }
                            }
                            break block78;
                        }
                        var10_18 = (b93_0)var10_18;
                        var13_20 = new dR1$a((b93_0)var10_18);
                        var2_2.g = null;
                        var2_2.f = var27_25 = 11;
                        var9_17 = var9_17.o(var2_2, var13_20);
                        if (var9_17 == var3_3 /* !! */ ) {
                            return var3_3 /* !! */ ;
                        }
                        break block78;
                    }
                    var3_3 /* !! */  = new IOException("Failed to parse multipart: prologue is too long");
                    throw var3_3 /* !! */ ;
                }
                var2_2.g = var15_22;
                var2_2.a = null;
                var2_2.f = var27_25 = 12;
                var10_18 = wf_1.k((uf_1)var13_20, var2_2);
                if (var10_18 == var3_3 /* !! */ ) {
                    return var3_3 /* !! */ ;
                }
            }
            var10_18 = (b93_0)var10_18;
            var39_42 = var10_18.g();
            if (!var39_42) {
                var13_20 = new dR1$a((b93_0)var10_18);
                var2_2.g = null;
                var2_2.f = var27_25 = 13;
                if ((var9_17 = var9_17.o(var2_2, var13_20)) == var3_3 /* !! */ ) {
                    return var3_3 /* !! */ ;
                }
            }
        }
        return Unit.a;
    }
}

