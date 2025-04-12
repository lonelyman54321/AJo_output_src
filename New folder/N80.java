/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class N80
implements al1_1 {
    public final /* synthetic */ Vt1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ql3_0 c;
    public final /* synthetic */ i72 d;
    public final /* synthetic */ Vo0 e;
    public final /* synthetic */ int f;

    public N80(Vt1 vt1, Function1 function1, ql3_0 ql3_02, i72 i722, Vo0 vo0, int n3) {
        this.a = vt1;
        this.b = function1;
        this.c = ql3_02;
        this.d = i722;
        this.e = vo0;
        this.f = n3;
    }

    public final int a(Rj1 object, List object2, int n3) {
        object2 = this.a;
        Mj3 mj3 = ((Vt1)object2).a;
        object = object.getLayoutDirection();
        mj3.a((bp1_0)((Object)object));
        object = ((Vt1)object2).a.j;
        if (object != null) {
            return Nj3.a(((sq1_0)object).b());
        }
        object = new IllegalStateException("layoutIntrinsics must be called first");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final bl1_0 c(dl1_1 var1_1, List var2_2, long var3_3) {
        block20: {
            block21: {
                block18: {
                    block19: {
                        block17: {
                            var5_4 = this;
                            var6_5 = var3_3;
                            var8_6 = this.a;
                            var9_7 = v83$a.a();
                            if (var9_7 != null) {
                                var10_8 = var9_7.f();
                            } else {
                                var11_9 = 0;
                                var10_8 = null;
                                var12_10 = 0.0f;
                            }
                            var13_11 = v83$a.b((v83_0)var9_7);
                            try {
                                var14_12 /* !! */  = var8_6.d();
                            }
                            catch (Throwable var30_29) {
                                var32_33 = var5_4;
                                var5_4 = var30_29;
                                v83$a.e((v83_0)var9_7, (v83_0)var13_11, (Function1)var10_8);
                                throw var30_29;
                            }
                            v83$a.e((v83_0)var9_7, (v83_0)var13_11, (Function1)var10_8);
                            if (var14_12 /* !! */  != null) {
                                var15_13 = var9_7 = var14_12 /* !! */ .a;
                            } else {
                                var16_14 = 0;
                                var15_13 = null;
                            }
                            var9_7 = var8_6.a;
                            var17_15 = var1_1.getLayoutDirection();
                            var11_9 = var9_7.f;
                            var18_16 = var9_7.e;
                            var19_17 = var9_7.c;
                            if (var15_13 == null) break block17;
                            var20_18 = var15_13.b;
                            var21_19 = var20_18.a;
                            var22_20 = var21_19.a();
                            if (var22_20 != 0) break block17;
                            var21_19 = var15_13.a;
                            var23_21 /* !! */  = var21_19.a;
                            var24_22 = var9_7.a;
                            var25_23 = Intrinsics.areEqual(var23_21 /* !! */ , var24_22);
                            if (var25_23 == 0 || (var25_23 = (var23_21 /* !! */  = var21_19.b).c((xm3)(var24_22 = var9_7.b))) == 0 || (var25_23 = Intrinsics.areEqual(var23_21 /* !! */  = var21_19.c, var24_22 = var9_7.i)) == 0 || (var25_23 = var21_19.d) != var19_17 || (var25_23 = (int)var21_19.e) != var18_16 || (var25_23 = (int)km3.b(var21_19.f, var11_9)) == 0 || (var25_23 = (int)Intrinsics.areEqual(var23_21 /* !! */  = var21_19.g, var24_22 = var9_7.g)) == 0 || (var23_21 /* !! */  = var21_19.h) != var17_15 || (var25_23 = (int)Intrinsics.areEqual(var23_21 /* !! */  = var21_19.i, var24_22 = var9_7.h)) == 0 || (var25_23 = c60.k(var3_3)) != (var28_25 = c60.k(var26_24 = var21_19.j)) || (var18_16 != 0 || (var28_25 = (int)km3.b(var11_9, var25_23 = 2)) != 0) && ((var25_23 = c60.i(var3_3)) != (var28_25 = c60.i(var26_24)) || (var25_23 = c60.h(var3_3)) != (var29_26 = c60.h(var26_24)))) break block17;
                            var31_30 = var21_19.f;
                            var5_4 = var21_19.g;
                            var10_8 = var21_19.a;
                            var13_11 = var9_7.b;
                            var32_32 = var21_19.c;
                            var25_23 = var21_19.d;
                            var28_25 = (int)var21_19.e;
                            var9_7 = var21_19.h;
                            var21_19 = var21_19.i;
                            var33_34 /* !! */  = var9_7;
                            var9_7 = var30_27;
                            var22_20 = var25_23;
                            var23_21 /* !! */  = var20_18;
                            var34_35 = var28_25;
                            var24_22 = var15_13;
                            var15_13 = var5_4;
                            var5_4 = var14_12 /* !! */ ;
                            var14_12 /* !! */  = var33_34 /* !! */ ;
                            var35_36 = var8_6;
                            var8_6 = var21_19;
                            var33_34 /* !! */  = var5_4;
                            var5_4 = var20_18;
                            var36_37 = var24_22;
                            var37_38 = var3_3;
                            var30_27 = new Sl3((Sl)var10_8, (xm3)var13_11, (List)var32_32, var25_23, (boolean)var28_25, var31_30, (Vo0)var15_13, (bp1_0)var14_12 /* !! */ , (RU0$a)var21_19, var3_3);
                            var39_40 = var20_18.d;
                            var40_41 = Nj3.a(var39_40);
                            var12_10 = var20_18.e;
                            var11_9 = Nj3.a(var12_10);
                            var41_42 = dj1.a(var40_41, var11_9);
                            var41_42 = f60.e(var6_5, var41_42);
                            var13_11 = new Tl3((Sl3)var30_27, (RQ1)var20_18, var41_42);
                            break block18;
                        }
                        var36_37 = var15_13;
                        var33_34 /* !! */  = var14_12 /* !! */ ;
                        var35_36 = var8_6;
                        var9_7.a(var17_15);
                        var29_26 = c60.k(var3_3);
                        var43_44 = -1 >>> 1;
                        var44_45 = 0.0f / 0.0f;
                        var22_20 = (var18_16 != 0 || (var34_35 = km3.b(var11_9, var22_20 = 2)) != 0) && (var22_20 = (int)c60.e(var3_3)) != 0 ? c60.i(var3_3) : -1 >>> 1;
                        var45_46 = var18_16 == 0 && (var34_35 = km3.b(var11_9, var18_16 = 2)) != 0 ? 1 : var19_17;
                        var13_11 = "layoutIntrinsics must be called first";
                        if (var29_26 == var22_20) break block19;
                        var32_32 = var9_7.j;
                        if (var32_32 == null) break block20;
                        var46_47 = var32_32.b();
                        var19_17 = Nj3.a(var46_47);
                        var22_20 = kotlin.ranges.f.g(var19_17, var29_26, var22_20);
                    }
                    if ((var32_32 = var9_7.j) == null) break block21;
                    var18_16 = c60.h(var3_3);
                    var34_35 = 262142;
                    var16_14 = 0;
                    var15_13 = null;
                    var47_48 = Math.min(0, var34_35);
                    var22_20 = var22_20 == var43_44 ? -1 >>> 1 : Math.min(var22_20, var34_35);
                    var34_35 = var22_20 == var43_44 ? var47_48 : var22_20;
                    var34_35 = f60.c(var34_35);
                    if (var18_16 == var43_44) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var43_44 = Math.min(var34_35, var18_16);
                    ** while (true)
                    var18_16 = 0;
                    var13_11 = null;
                    var34_35 = Math.min(var34_35, 0);
                    var48_49 = f60.a(var47_48, var22_20, var34_35, var43_44);
                    var50_50 = km3.b(var11_9, 2);
                    var30_27 = new RQ1((sq1_0)var32_32, var48_49, var45_46, var50_50);
                    var44_45 = var30_27.d;
                    var43_44 = Nj3.a(var44_45);
                    var12_10 = var30_27.e;
                    var11_9 = Nj3.a(var12_10);
                    var51_51 = dj1.a(var43_44, var11_9);
                    var37_39 = f60.e(var6_5, var51_51);
                    var16_14 = var9_7.f;
                    var14_12 /* !! */  = var9_7.g;
                    var10_8 = var9_7.a;
                    var13_11 = var9_7.b;
                    var32_32 = var9_7.i;
                    var22_20 = var9_7.c;
                    var34_35 = (int)var9_7.e;
                    var53_52 = var9_7.h;
                    var9_7 = var8_6;
                    var31_31 = var16_14;
                    var15_13 = var14_12 /* !! */ ;
                    var14_12 /* !! */  = var17_15;
                    var8_6 = var53_52;
                    var54_53 = var37_39;
                    var37_39 = var3_3;
                    var9_7((Sl)var10_8, (xm3)var13_11, (List)var32_32, var22_20, (boolean)var34_35, var16_14, (Vo0)var15_13, var17_15, var53_52, var3_3);
                    var41_43 = var54_53;
                    var13_11 = var5_4 = new Tl3((Sl3)var9_7, (RQ1)var30_27, var54_53);
                }
                var56_54 = var13_11.c;
                var30_27 = (int)(var56_54 >> 32);
                var58_55 = 0xFFFFFFFFL;
                var5_4 = (int)(var56_54 &= var58_55);
                var29_26 = var30_27.intValue();
                var43_44 = var5_4.intValue();
                var9_7 = var36_37;
                var40_41 = (int)Intrinsics.areEqual(var36_37, var13_11);
                if (var40_41 == 0) {
                    if (var33_34 /* !! */  != null) {
                        var10_8 = var33_34 /* !! */ ;
                        var10_8 = var33_34 /* !! */ .c;
                    } else {
                        var11_9 = 0;
                        var10_8 = null;
                        var12_10 = 0.0f;
                    }
                    var9_7 = new Ul3((zp1)var10_8, (Tl3)var13_11);
                    var10_8 = var35_36;
                    var35_36.i.setValue(var9_7);
                    var40_41 = 0;
                    var39_40 = 0.0f;
                    var35_36.p = false;
                    var32_32 = this;
                    this.b.invoke(var13_11);
                    var9_7 = this.c;
                    var21_19 = this.d;
                    o90.g((Vt1)var35_36, (ql3_0)var9_7, (i72)var21_19);
                } else {
                    var32_32 = this;
                    var10_8 = var35_36;
                }
                var40_41 = var32_32.f;
                var22_20 = 1;
                if (var40_41 == var22_20) {
                    var9_7 = var13_11.b;
                    var34_35 = 0;
                    var20_18 = null;
                    var39_40 = var9_7.b(0);
                    var25_23 = Nj3.a(var39_40);
                } else {
                    var25_23 = 0;
                    var23_21 /* !! */  = null;
                }
                var39_40 = var32_32.e.D0(var25_23);
                var20_18 = new xs0_0(var39_40);
                var10_8.g.setValue(var20_18);
                var9_7 = Pc.a;
                var10_8 = Math.round(var13_11.d);
                var20_18 = new Pair(var9_7, var10_8);
                var9_7 = Pc.b;
                var10_8 = Math.round(var13_11.e);
                var13_11 = new Pair(var9_7, var10_8);
                var9_7 = new Pair[2];
                var9_7[0] = var20_18;
                var9_7[var22_20] = var13_11;
                var9_7 = fh1_2.i((Pair[])var9_7);
                var10_8 = N80$a.c;
                var13_11 = var1_1;
                return var1_1.V0(var29_26, var43_44, (Map)var9_7, (Function1)var10_8);
            }
            var32_32 = this;
            var30_27 = new IllegalStateException((String)var13_11);
            throw var30_27;
        }
        var32_32 = this;
        var30_28 = new IllegalStateException((String)var13_11);
        throw var30_28;
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }
}

