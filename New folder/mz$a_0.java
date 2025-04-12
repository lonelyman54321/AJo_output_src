/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from mz$a
 */
public final class mz$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ mz_1 c;

    public mz$a_0(mz_1 mz_12) {
        this.c = mz_12;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block70: {
            block68: {
                block73: {
                    block72: {
                        block71: {
                            block69: {
                                var2_2 = var1_1;
                                var2_2 = (xi_0)var1_1;
                                var3_9 = this;
                                var4_10 /* !! */  = this.c;
                                var5_11 = var4_10 /* !! */ .q;
                                var6_12 = var2_2.getDensity() * var5_11;
                                var7_13 = 0;
                                var5_11 = 0.0f;
                                var8_14 = null;
                                cfr_temp_0 = var6_12 - 0.0f;
                                var9_15 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                if (var9_15 /* !! */  < 0 || (var9_15 /* !! */  = (cfr_temp_1 = (var6_12 = C63.c(var11_17 = (var10_16 = var2_2.a).l())) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) <= 0) ** GOTO lbl438
                                var6_12 = var4_10 /* !! */ .q;
                                var7_13 = xs0_0.a(var6_12, 0.0f);
                                if (var7_13 != 0) {
                                    var7_13 = 1065353216;
                                    var5_11 = 1.0f;
                                } else {
                                    var5_11 = var4_10 /* !! */ .q;
                                    var6_12 = var2_2.getDensity() * var5_11;
                                    var13_18 = Math.ceil(var6_12);
                                    var5_11 = (float)var13_18;
                                }
                                var10_16 = var2_2.a;
                                var11_17 = var10_16.l();
                                var6_12 = C63.c(var11_17);
                                var15_19 = 2;
                                var16_20 = Math.ceil(var6_12 / var15_19);
                                var6_12 = (float)var16_20;
                                var5_11 = Math.min(var5_11, var6_12);
                                var6_12 = var5_11 / var15_19;
                                var18_21 = h72.a(var6_12, var6_12);
                                var20_22 /* !! */  = var2_2.a;
                                var21_23 = var20_22 /* !! */ .l();
                                var23_24 = C63.d(var21_23) - var5_11;
                                var24_25 = var2_2.a;
                                var25_26 = var24_25.l();
                                var27_27 = C63.b(var25_26) - var5_11;
                                var28_28 = bo1_1.a(var23_24, var27_27);
                                var27_27 = var5_11 * var15_19;
                                var30_29 = var2_2.a;
                                var31_30 = var30_29.l();
                                var15_19 = C63.c(var31_30);
                                var33_31 = false;
                                var34_32 = null;
                                var35_33 = var27_27 == var15_19 ? 0 : (var27_27 > var15_19 ? 1 : -1);
                                if (var35_33 > 0) {
                                    var35_33 = (float)true;
                                    var15_19 = 1.4E-45f;
                                } else {
                                    var35_33 = (float)false;
                                    var15_19 = 0.0f;
                                    var30_29 = null;
                                }
                                var20_22 /* !! */  = var4_10 /* !! */ .s;
                                var36_34 = var2_2.a;
                                var37_35 = var36_34.l();
                                var39_36 = var2_2.a.getLayoutDirection();
                                var20_22 /* !! */  = var20_22 /* !! */ .a(var37_35, (bp1_0)var39_36, (Vo0)var2_2);
                                var40_37 = var20_22 /* !! */  instanceof Cg2$a;
                                if (var40_37 == 0) break block68;
                                var8_14 = var4_10 /* !! */ .r;
                                var20_22 /* !! */  = (Cg2$a)var20_22 /* !! */ ;
                                if (var35_33 == false) break block69;
                                var4_10 /* !! */  = new hz_1((Cg2$a)var20_22 /* !! */ , var8_14);
                                var2_2 = var2_2.e((Function1)var4_10 /* !! */ );
                                break block70;
                            }
                            var9_15 /* !! */  = (float)(var8_14 instanceof i93_0);
                            if (var9_15 /* !! */  != false) {
                                var10_16 = var8_14;
                                var37_35 = ((i93_0)var8_14).a;
                                var41_38 = Build.VERSION.SDK_INT;
                                var42_41 = 29;
                                var43_42 = 5;
                                if (var41_38 >= var42_41) {
                                    var39_36 = gy_0.a.a(var37_35, var43_42);
                                } else {
                                    var42_41 = zx_0.i(var37_35);
                                    var44_43 /* !! */  = Lf.b(var43_42);
                                    var39_36 = new PorterDuffColorFilter(var42_41, var44_43 /* !! */ );
                                }
                                var10_16 = new ay_1(var37_35, var43_42, (ColorFilter)var39_36);
                                var40_37 = 1;
                                var45_44 = 1.4E-45f;
                            } else {
                                var9_15 /* !! */  = (float)false;
                                var6_12 = 0.0f;
                                var10_16 = null;
                                var40_37 = 0;
                                var45_44 = 0.0f;
                                var36_34 = null;
                            }
                            var46_48 = var20_22 /* !! */ .a.b();
                            var47_49 = var4_10 /* !! */ .p;
                            if (var47_49 == null) {
                                var47_49 = new dz(0);
                                var4_10 /* !! */ .p = var47_49;
                            }
                            var47_49 = var4_10 /* !! */ .p;
                            Intrinsics.checkNotNull(var47_49);
                            var39_36 = var47_49.d;
                            if (var39_36 == null) {
                                var39_36 = ni.a();
                                var47_49.d = var39_36;
                            }
                            var48_52 /* !! */  = var39_36;
                            var39_36.reset();
                            var47_49 = gn2$a.CounterClockwise;
                            var39_36.m((aG2)var46_48, (gn2$a)var47_49);
                            var47_49 = var20_22 /* !! */ .a;
                            var39_36.p((gn2)var39_36, (gn2)var47_49, 0);
                            var44_43 /* !! */  = new Ref$ObjectRef();
                            var49_53 = Math.ceil(var46_48.d());
                            var51_54 = (float)var49_53;
                            var52_58 = (int)var51_54;
                            var53_61 = var46_48.c();
                            var1_1 = var20_22 /* !! */ ;
                            var54_65 = Math.ceil(var53_61);
                            var15_19 = (float)var54_65;
                            var35_33 = (int)var15_19;
                            var56_66 = dj1.a(var52_58, (int)var35_33);
                            var4_10 /* !! */  = var4_10 /* !! */ .p;
                            Intrinsics.checkNotNull(var4_10 /* !! */ );
                            var30_29 = var4_10 /* !! */ .a;
                            var20_22 /* !! */  = var4_10 /* !! */ .b;
                            if (var30_29 != null) {
                                var52_58 = var30_29.b();
                                var39_36 = new id1_0(var52_58);
                            } else {
                                var41_38 = 0;
                                var53_61 = 0.0f;
                                var39_36 = null;
                            }
                            if (var39_36 == null) {
                                var52_58 = 0;
                                var51_54 = 0.0f;
                                var47_49 = null;
                            } else {
                                var52_58 = (int)id1_0.a(var39_36.a, 0);
                            }
                            if (var52_58 != 0) break block71;
                            if (var30_29 != null) {
                                var52_58 = var30_29.b();
                                var39_36 = new id1_0(var52_58);
                            } else {
                                var41_38 = 0;
                                var53_61 = 0.0f;
                                var39_36 = null;
                            }
                            var52_58 = var39_36 instanceof id1_0;
                            if (var52_58 == 0) {
                                while (true) {
                                    var52_58 = 0;
                                    var51_54 = 0.0f;
                                    var47_49 = null;
                                    break;
                                }
                            } else {
                                if (var40_37 != (var52_58 = ((id1_0)var39_36).a)) ** continue;
                                var52_58 = 1;
                                var51_54 = 1.4E-45f;
                            }
                            if (var52_58 == 0) break block72;
                        }
                        var33_31 = true;
                    }
                    if (var30_29 != null && var20_22 /* !! */  != null && (var52_58 = (int)((cfr_temp_2 = (var51_54 = C63.d(var58_67 = (var47_49 = var2_2.a).l())) - (var53_61 = (float)(var41_38 = var30_29.getWidth()))) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) <= 0 && (var52_58 = (int)((cfr_temp_3 = (var51_54 = C63.b(var58_67 = (var47_49 = var2_2.a).l())) - (var53_61 = (float)(var41_38 = var30_29.getHeight()))) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) <= 0 && var33_31) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var15_19 = 4.5E-44f;
                    var31_30 = var56_66 >> 32;
                    var60_69 = (int)var31_30;
                    var49_53 = 2.1219957905E-314;
                    var58_67 = var56_66 & 0xFFFFFFFFL;
                    var35_33 = (int)var58_67;
                    var4_10 /* !! */ .a = var30_29 = xj2_2.b(var60_69, (int)var35_33, var40_37);
                    var4_10 /* !! */ .b = var20_22 /* !! */  = BL.a((ih_0)var30_29);
                    ** while (true)
                    var34_32 = var20_22 /* !! */ ;
                    var20_22 /* !! */  = var4_10 /* !! */ .c;
                    if (var20_22 /* !! */  == null) {
                        var4_10 /* !! */ .c = var20_22 /* !! */  = new xl_0();
                    }
                    var4_10 /* !! */  = var20_22 /* !! */ ;
                    var37_35 = dj1.b(var56_66);
                    var20_22 /* !! */  = var2_2.a.getLayoutDirection();
                    var39_36 = var4_10 /* !! */ .a;
                    var61_70 = var39_36.a;
                    var62_71 /* !! */  = var39_36.b;
                    var63_73 = var39_36.c;
                    var64_74 = var46_48;
                    var65_75 = var39_36.d;
                    var39_36.a = var2_2;
                    var39_36.b = var20_22 /* !! */ ;
                    var39_36.c = var34_32;
                    var39_36.d = var37_35;
                    var34_32.p();
                    var67_77 = OX.b;
                    var69_78 = 58;
                    Jt0.j((Kt0)var4_10 /* !! */ , var67_77, var37_35, 0.0f, null, var69_78);
                    var47_49 = var46_48;
                    var45_44 = -var46_48.a;
                    var23_24 = -var46_48.b;
                    var70_79 = var4_10 /* !! */ .b;
                    var70_79.a.g(var45_44, var23_24);
                    var46_48 = var1_1;
                    var46_48 = var1_1.a;
                    var72_82 = 30;
                    var73_83 = var23_24;
                    var20_22 /* !! */  = var71_81;
                    var74_84 = var45_44;
                    var40_37 = 0;
                    var36_34 = null;
                    var45_44 = 0.0f;
                    var52_58 = 0;
                    var47_49 = null;
                    var51_54 = 0.0f;
                    var75_85 = var39_36;
                    var41_38 = 0;
                    var39_36 = null;
                    var53_61 = 0.0f;
                    var76_86 = var34_32;
                    var33_31 = false;
                    var34_32 = null;
                    var1_1 = var70_79;
                    var77_87 = var62_71 /* !! */ ;
                    var78_88 = var63_73;
                    var79_89 = true;
                    var80_91 = 1.4E-45f;
                    var81_92 = var72_82;
                    var71_81 = new re3_1(var27_27, 0.0f, 0, 0, null, var72_82);
                    var60_69 = 52;
                    var23_24 = 7.3E-44f;
                    var82_95 = var4_10 /* !! */ ;
                    var62_71 /* !! */  = var46_48;
                    var63_73 = var8_14;
                    var83_97 = var60_69;
                    Jt0.g((Kt0)var4_10 /* !! */ , (gn2)var46_48, var8_14, 0.0f, var71_81, var60_69);
                    var21_23 = var4_10 /* !! */ .l();
                    var23_24 = C63.d(var21_23);
                    var80_91 = (float)var79_89;
                    var23_24 += var80_91;
                    var25_26 = var4_10 /* !! */ .l();
                    var27_27 = C63.d(var25_26);
                    var23_24 /= var27_27;
                    var25_26 = var4_10 /* !! */ .l();
                    var27_27 = C63.b(var25_26) + var80_91;
                    var37_35 = var4_10 /* !! */ .l();
                    var80_91 = C63.b(var37_35);
                    var27_27 /= var80_91;
                    var37_35 = var4_10 /* !! */ .X0();
                    var84_98 = var70_79.l();
                    var3_9 = var70_79.a();
                    var3_9.p();
                    var3_9 = var70_79;
                    var70_79 = var70_79.a;
                    var70_79.e(var23_24, var27_27, var37_35);
                    var83_97 = 28;
                    var62_71 /* !! */  = var48_52 /* !! */ ;
                    Jt0.g((Kt0)var4_10 /* !! */ , (gn2)var48_52 /* !! */ , var8_14, 0.0f, null, var83_97);
                    try {
                        var4_10 /* !! */  = var1_1.a();
                    }
                    catch (Throwable var2_3) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var5_11 = var73_83;
                            var86_101 = var74_84;
                            break;
                        }
                    }
                    var4_10 /* !! */ .h();
                    var1_1.b(var84_98);
                    var3_9 = var1_1.a;
                    var86_100 = var74_84;
                    var86_100 = -var74_84;
                    var5_11 = var73_83;
                    var5_11 = -var73_83;
                    var3_9.g(var86_100, var5_11);
                    var76_86.h();
                    var3_9 = var75_85;
                    var4_10 /* !! */  = var61_70;
                    var75_85.a = var61_70;
                    var4_10 /* !! */  = var77_87;
                    var75_85.b = var77_87;
                    var4_10 /* !! */  = var78_88;
                    var75_85.c = var78_88;
                    var75_85.d = var65_75;
                    var30_29.a();
                    var44_43 /* !! */ .element = var30_29;
                    var4_10 /* !! */  = var44_43 /* !! */ ;
                    var44_43 /* !! */  = var3_9;
                    var61_70 = var64_74;
                    var82_95 = var4_10 /* !! */ ;
                    var3_9 = new iz_1(var64_74, (Ref$ObjectRef)var4_10 /* !! */ , var56_66, (ay_1)var10_16);
                    var2_2 = var2_2.e((Function1)var3_9);
                    break block70;
                    catch (Throwable var2_5) {
                        var5_11 = var73_83;
                        var86_101 = var74_84;
                        try {
                            var10_16 = var3_9.a();
                        }
                        catch (Throwable var2_6) {}
                        var10_16.h();
                        var3_9.b(var84_98);
                        throw var2_5;
                    }
                    break block73;
                    catch (Throwable var2_7) {
                        var3_9 = var1_1;
                        ** continue;
                    }
                    catch (Throwable var2_8) {
                        var5_11 = var23_24;
                        var86_101 = var45_44;
                        var3_9 = var70_79;
                    }
                }
                var3_9 = var3_9.a;
                var86_101 = -var86_101;
                var5_11 = -var5_11;
                var3_9.g(var86_101, var5_11);
                throw var2_4;
            }
            var79_90 = var20_22 /* !! */  instanceof Cg2$c;
            if (var79_90) {
                var3_9 = var4_10 /* !! */ .r;
                var20_22 /* !! */  = (Cg2$c)var20_22 /* !! */ ;
                var24_25 = var20_22 /* !! */ .a;
                var87_103 = QP2.a((NP2)var24_25);
                var20_22 /* !! */  = var20_22 /* !! */ .a;
                if (var87_103) {
                    var88_104 = var20_22 /* !! */ .e;
                    var52_59 = false;
                    var51_55 = 0.0f;
                    var47_50 = null;
                    var90_106 = 30;
                    var86_102 = 4.2E-44f;
                    var40_37 = 0;
                    var45_45 = 0.0f;
                    var41_39 = false;
                    var53_62 = 0.0f;
                    var39_36 = null;
                    var62_72 = null;
                    var20_22 /* !! */  = var82_96;
                    var27_27 = var5_11;
                    var91_107 = var88_104;
                    var33_31 = false;
                    var34_32 = null;
                    var81_93 = var90_106;
                    var82_96 = new re3_1(var5_11, 0.0f, 0, 0, null, var90_106);
                    var20_22 /* !! */  = var4_10 /* !! */ ;
                    var87_103 = var35_33;
                    var27_27 = var15_19;
                    var36_34 = var3_9;
                    var58_68 = var88_104;
                    var4_10 /* !! */  = new kz_1((boolean)var35_33, (ZD)var3_9, var88_104, var6_12, var5_11, var18_21, var28_28, var82_96);
                    var2_2 = var2_2.e((Function1)var4_10 /* !! */ );
                } else {
                    var10_16 = var4_10 /* !! */ .p;
                    if (var10_16 == null) {
                        var4_10 /* !! */ .p = var10_16 = new dz(0);
                    }
                    var4_10 /* !! */  = var4_10 /* !! */ .p;
                    Intrinsics.checkNotNull(var4_10 /* !! */ );
                    var10_16 = var4_10 /* !! */ .d;
                    if (var10_16 == null) {
                        var4_10 /* !! */ .d = var10_16 = ni.a();
                    }
                    var10_16.reset();
                    fn2.a((gn2)var10_16, (NP2)var20_22 /* !! */ );
                    if (var35_33 == false) {
                        var4_10 /* !! */  = ni.a();
                        var51_56 = var20_22 /* !! */ .b() - var5_11;
                        var15_19 = var20_22 /* !! */ .a();
                        var53_63 = var15_19 - var5_11;
                        var65_76 = gz.c(var20_22 /* !! */ .e, var5_11);
                        var93_109 = gz.c(var20_22 /* !! */ .f, var5_11);
                        var25_26 = var20_22 /* !! */ .h;
                        var95_110 = gz.c(var25_26, var5_11);
                        var31_30 = var20_22 /* !! */ .g;
                        var91_108 = gz.c(var31_30, var5_11);
                        var20_22 /* !! */  = var30_29;
                        var27_27 = var5_11;
                        var45_46 = var5_11;
                        var7_13 = 0;
                        var5_11 = 0.0f;
                        var8_14 = null;
                        var88_105 = var65_76;
                        var18_21 = var93_109;
                        var28_28 = var91_108;
                        var30_29 = new NP2(var27_27, var27_27, var51_56, var53_63, var65_76, var93_109, var91_108, var95_110);
                        fn2.a((gn2)var4_10 /* !! */ , (NP2)var30_29);
                        var10_16.p((gn2)var10_16, (gn2)var4_10 /* !! */ , 0);
                    }
                    var4_10 /* !! */  = new lz_1((gn2)var10_16, (ZD)var3_9);
                    var2_2 = var2_2.e((Function1)var4_10 /* !! */ );
                }
            } else {
                var79_90 = var20_22 /* !! */  instanceof Cg2$b;
                if (var79_90) {
                    var3_9 = var4_10 /* !! */ .r;
                    if (var35_33 != false) {
                        var18_21 = 0L;
                    }
                    if (var35_33 != false) {
                        var4_10 /* !! */  = var2_2.a;
                        var28_28 = var4_10 /* !! */ .l();
                    }
                    if (var35_33 != false) {
                        var4_10 /* !! */  = rM0.a;
lbl410:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var52_60 = false;
                    var51_57 = 0.0f;
                    var47_51 = null;
                    var81_94 = 30;
                    var40_37 = 0;
                    var45_47 = 0.0f;
                    var36_34 = null;
                    var41_40 = false;
                    var53_64 = 0.0f;
                    var39_36 = null;
                    var33_31 = false;
                    var34_32 = null;
                    var20_22 /* !! */  = var4_10 /* !! */ ;
                    var27_27 = var5_11;
                    var4_10 /* !! */  = new re3_1(var5_11, 0.0f, 0, 0, null, var81_94);
                    ** continue;
                    var70_80 = var4_10 /* !! */ ;
                    var20_22 /* !! */  = var4_10 /* !! */ ;
                    var24_25 = var3_9;
                    var37_35 = var18_21;
                    var84_99 = var28_28;
                    var4_10 /* !! */  = new fz_1((ZD)var3_9, var18_21, var28_28, (Qt0)var70_80);
                    var2_2 = var2_2.e((Function1)var4_10 /* !! */ );
                } else {
                    var2_2 = new NoWhenBranchMatchedException();
                    throw var2_2;
lbl438:
                    // 1 sources

                    var3_9 = ez_1.c;
                    var2_2 = var2_2.e((Function1)var3_9);
                }
            }
        }
        return var2_2;
    }
}

