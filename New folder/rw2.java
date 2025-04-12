/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.PointF
 */
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class rw2
implements ln2,
iw$a,
mo1_0 {
    public final Path a;
    public final Path b;
    public final PathMeasure c;
    public final float[] d;
    public final String e;
    public final yc1_1 f;
    public final sw2$a g;
    public final boolean h;
    public final boolean i;
    public final es0_0 j;
    public final iw_0 k;
    public final es0_0 l;
    public final es0_0 m;
    public final es0_0 n;
    public final es0_0 o;
    public final es0_0 p;
    public final S30 q;
    public boolean r;

    public rw2(yc1_1 object, kw_1 kw_12, sw2 object2) {
        es0_0 es0_02;
        es0_0 es0_03;
        es0_0 es0_04;
        iw_0 iw_02;
        boolean bl2;
        Object object3 = new Path();
        this.a = object3;
        object3 = new Path();
        this.b = object3;
        this.c = object3;
        object3 = new float[2];
        this.d = (float[])object3;
        super();
        this.q = object3;
        this.f = object;
        object = ((sw2)object2).a;
        this.e = object;
        object = ((sw2)object2).b;
        this.g = object;
        this.h = bl2 = ((sw2)object2).j;
        this.i = bl2 = ((sw2)object2).k;
        object3 = ((sw2)object2).c.d();
        this.j = object3;
        this.k = iw_02 = ((sw2)object2).d.a();
        this.l = es0_04 = ((sw2)object2).e.d();
        this.n = es0_03 = ((sw2)object2).g.d();
        this.p = es0_02 = ((sw2)object2).i.d();
        sw2$a sw2$a = sw2$a.STAR;
        if (object == sw2$a) {
            es0_0 es0_05;
            this.m = es0_05 = ((sw2)object2).f.d();
            this.o = object2 = ((sw2)object2).h.d();
        } else {
            object2 = null;
            this.m = null;
            this.o = null;
        }
        kw_12.g((iw_0)object3);
        kw_12.g(iw_02);
        kw_12.g(es0_04);
        kw_12.g(es0_03);
        kw_12.g(es0_02);
        if (object == sw2$a) {
            object2 = this.m;
            kw_12.g((iw_0)object2);
            object2 = this.o;
            kw_12.g((iw_0)object2);
        }
        ((iw_0)object3).a(this);
        iw_02.a(this);
        es0_04.a(this);
        es0_03.a(this);
        es0_02.a(this);
        if (object == sw2$a) {
            this.m.a(this);
            object = this.o;
            ((iw_0)object).a(this);
        }
    }

    public final void a() {
        this.r = false;
        this.f.invalidateSelf();
    }

    public final void b(List list, List list2) {
        int n3 = 0;
        while (true) {
            Object object = list;
            object = (ArrayList)list;
            int n4 = ((ArrayList)object).size();
            if (n3 >= n4) break;
            n4 = (object = (r60_0)((ArrayList)object).get(n3)) instanceof vs3_0;
            if (n4 != 0) {
                object = (vs3_0)object;
                Object object2 = ((vs3_0)object).c;
                y13$a y13$a = y13$a.SIMULTANEOUSLY;
                if (object2 == y13$a) {
                    object2 = this.q.a;
                    ((ArrayList)object2).add(object);
                    ((vs3_0)object).c(this);
                }
            }
            ++n3;
        }
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        mp1_0.g(ko12, n3, arrayList, ko13, this);
    }

    public final String getName() {
        return this.e;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Path getPath() {
        block26: {
            block25: {
                var1_1 = this;
                var2_2 = this.r;
                var3_3 = this.a;
                if (var2_2 != 0) {
                    return var3_3;
                }
                var3_3.reset();
                var2_2 = this.h;
                var4_4 = 1;
                var5_5 = 1.4E-45f;
                if (var2_2 != 0) {
                    this.r = var4_4;
                    return var3_3;
                }
                var6_6 = rw2$a.a;
                var7_7 = this.g.ordinal();
                var2_2 = var6_6[var7_7];
                var8_8 = this.k;
                var9_9 = this.n;
                var10_10 = 1120403456;
                var11_11 = 100.0f;
                var12_12 = this.p;
                var13_13 = 6.283185307179586;
                var15_14 = 90.0;
                var17_15 = 0.0;
                var19_16 = this.l;
                var20_17 = this.j;
                if (var2_2 == var4_4) break block25;
                var4_4 = 2;
                var5_5 = 2.8E-45f;
                if (var2_2 != var4_4) break block26;
                var6_6 = (Float)var20_17.f();
                var21_18 = var6_6.floatValue();
                var22_20 = Math.floor(var21_18);
                var2_2 = (int)var22_20;
                if (var19_16 != null) {
                    var19_16 = (Float)var19_16.f();
                    var24_21 = var19_16.floatValue();
                    var17_15 = var25_23 = (double)var24_21;
                }
                var25_23 = Math.toRadians(var17_15 -= var15_14);
                var22_20 = var2_2;
                var21_18 = (float)(var13_13 /= var22_20);
                var12_12 = (Float)var12_12.f();
                var27_25 = var12_12.floatValue();
                var5_5 = var27_25 / var11_11;
                var9_9 = (Float)var9_9.f();
                var28_27 = var9_9.floatValue();
                var29_29 = var28_27;
                var31_31 = Math.cos(var25_23) * var29_29;
                var33_33 = (float)var31_31;
                var11_11 = (float)(Math.sin(var25_23) * var29_29);
                var3_3.moveTo(var33_33, var11_11);
                var34_35 = var21_18;
                var22_20 = Math.ceil(var22_20);
                var15_14 = var25_23 += var34_35;
                var2_2 = 0;
                var21_18 = 0.0f;
                var6_6 = null;
                while ((var36_36 = (cfr_temp_0 = (var25_23 = (double)var2_2) - var22_20) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1)) < 0) {
                    block27: {
                        var17_15 = Math.cos(var15_14);
                        var37_37 = var8_8;
                        var38_39 = var34_35;
                        var40_41 = var17_15 * var29_29;
                        var42_42 = (float)var40_41;
                        var34_35 = Math.sin(var15_14) * var29_29;
                        var43_43 = (float)var34_35;
                        cfr_temp_1 = var5_5 - 0.0f;
                        var44_45 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                        if (var44_45 /* !! */  == false) break block27;
                        var17_15 = var29_29;
                        var29_29 = var11_11;
                        var44_45 /* !! */  = var2_2;
                        var45_47 = var33_33;
                        var45_47 = (float)(Math.atan2(var29_29, var45_47) - 1.5707963267948966);
                        var29_29 = Math.cos(var45_47);
                        var27_25 = (float)var29_29;
                        var45_47 = Math.sin(var45_47);
                        var47_48 = (float)var45_47;
                        var48_50 = var33_33;
                        var49_52 = var43_43;
                        var51_54 = var43_43;
                        var52_56 = var2_2;
                        var34_35 = var42_42;
                        var49_52 = (float)(Math.atan2(var49_52, var34_35) - 1.5707963267948966);
                        var34_35 = Math.cos(var49_52);
                        var43_43 = (float)var34_35;
                        var49_52 = Math.sin(var49_52);
                        var21_18 = (float)var49_52;
                        var33_33 = var28_27 * var5_5;
                        var44_45 /* !! */  = 1048576000;
                        var53_57 = 0.25f;
                        var27_25 *= (var33_33 *= var53_57);
                        var47_48 *= var33_33;
                        var43_43 *= var33_33;
                        var33_33 *= var21_18;
                        var54_59 = 1.0;
                        var56_61 = var22_20 - var54_59;
                        cfr_temp_2 = var25_23 - var56_61;
                        var2_2 = (int)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                        if (var2_2 == 0) {
                            var6_6 = this;
                            var19_16 = this.b;
                            var19_16.reset();
                            var19_16.moveTo(var48_50, var11_11);
                            var27_25 = var48_50 - var27_25;
                            var47_48 = var11_11 - var47_48;
                            var48_50 = var42_42 + var43_43;
                            var58_62 = var51_54 + var33_33;
                            var59_64 = var27_25;
                            var60_66 = var47_48;
                            var61_68 = var48_50;
                            var62_70 = var58_62;
                            var63_72 = var42_42;
                            var64_74 = var51_54;
                            var19_16.cubicTo(var27_25, var47_48, var48_50, var58_62, var42_42, var51_54);
                            var9_9 = this.c;
                            var43_43 = 0.0f;
                            var9_9.setPath((Path)var19_16, false);
                            var11_11 = var9_9.getLength() * 0.9999f;
                            var19_16 = null;
                            var65_76 = this.d;
                            var9_9.getPosTan(var11_11, var65_76, null);
                            var24_21 = var65_76[0];
                            var7_7 = 1;
                            var33_33 = 1.4E-45f;
                            var53_57 = var65_76[var7_7];
                            var9_9 = var3_3;
                            var11_11 = var27_25;
                            var27_25 = var47_48;
                            var66_78 = var28_27;
                            var28_27 = var58_62;
                            var67_80 = false;
                            var58_62 = var53_57;
                            var3_3.cubicTo(var59_64, var47_48, var48_50, var62_70, var24_21, var53_57);
                        } else {
                            var67_80 = false;
                            var6_6 = this;
                            var66_78 = var28_27;
                            var27_25 = var48_50 - var27_25;
                            var47_48 = var11_11 - var47_48;
                            var48_50 = var42_42 + var43_43;
                            var28_27 = var51_54 + var33_33;
                            var9_9 = var3_3;
                            var11_11 = var27_25;
                            var27_25 = var47_48;
                            var24_21 = var42_42;
                            var58_62 = var51_54;
                            var3_3.cubicTo(var11_11, var47_48, var48_50, var28_27, var42_42, var51_54);
                        }
                        var47_48 = var51_54;
                        ** GOTO lbl166
                    }
                    var52_56 = var2_2;
                    var17_15 = var29_29;
                    var66_78 = var28_27;
                    var51_54 = var43_43;
                    var31_31 = 1.0;
                    var67_80 = false;
                    var6_6 = var1_1;
                    var29_29 = var22_20 - var31_31;
                    cfr_temp_3 = var25_23 - var29_29;
                    var68_82 /* !! */  = (double)(cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1));
                    if (var68_82 /* !! */  == false) {
                        var47_48 = var43_43;
                    } else {
                        var47_48 = var43_43;
                        var3_3.lineTo(var42_42, var43_43);
lbl166:
                        // 2 sources

                        var15_14 += var38_39;
                    }
                    var7_7 = var52_56 + 1;
                    var11_11 = var47_48;
                    var1_1 = var6_6;
                    var2_2 = var7_7;
                    var33_33 = var42_42;
                    var29_29 = var17_15;
                    var28_27 = var66_78;
                    var8_8 = var37_37;
                    var34_35 = var38_39;
                }
                var6_6 = var1_1;
                var37_37 = var8_8;
                var1_1 = (PointF)var8_8.f();
                var33_33 = var1_1.x;
                var47_48 = var1_1.y;
                var3_3.offset(var33_33, var47_48);
                var3_3.close();
                break block26;
            }
            var6_6 = this;
            var37_38 = var8_8;
            var67_81 = false;
            var1_1 = (Float)var20_17.f();
            var47_49 = var1_1.floatValue();
            if (var19_16 != null) {
                var19_16 = (Float)var19_16.f();
                var24_22 = var19_16.floatValue();
                var17_15 = var25_24 = (double)var24_22;
            }
            var25_24 = Math.toRadians(var17_15 -= var15_14);
            var69_83 = var47_49;
            var48_51 = (float)(var13_13 /= var69_83);
            var71_84 = var6_6.i;
            if (var71_84 != 0) {
                var71_84 = -1082130432;
                var28_28 = -1.0f;
                var48_51 *= var28_28;
            }
            var43_44 = var48_51;
            var44_46 = 0x40000000;
            var53_58 = 2.0f;
            var72_85 = var48_51 / var53_58;
            if ((var74_87 = (cfr_temp_4 = (var47_49 -= (var48_51 = (float)(var73_86 = (int)var47_49))) - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1)) != false) {
                var73_86 = 1065353216;
                var48_51 = (1.0f - var47_49) * var72_85;
                var13_13 = var48_51;
                var25_24 += var13_13;
            }
            var28_28 = ((Float)var9_9.f()).floatValue();
            var48_51 = ((Float)var6_6.m.f()).floatValue();
            var9_9 = var6_6.o;
            if (var9_9 != null) {
                var9_9 = (Float)var9_9.f();
                var75_88 = var33_34 = var9_9.floatValue() / var11_11;
            } else {
                var75_88 = 0.0f;
            }
            if (var12_12 != null) {
                var9_9 = (Float)var12_12.f();
                var76_89 = var33_34 = var9_9.floatValue() / var11_11;
            } else {
                var76_89 = 0.0f;
            }
            if (var74_87 != false) {
                var33_34 = xu0_1.a(var28_28, var48_51, var47_49, var48_51);
                var77_90 = var33_34;
                var17_15 = Math.cos(var25_24);
                var79_91 = var72_85;
                var80_92 = var17_15 * var77_90;
                var53_58 = (float)var80_92;
                var17_15 = Math.sin(var25_24);
                var11_11 = (float)(var77_90 *= var17_15);
                var3_3.moveTo(var53_58, var11_11);
                var27_26 = var43_44 * var47_49 / 2.0f;
                var72_85 = var33_34;
                var31_32 = var27_26;
                var25_24 += var31_32;
                var33_34 = var53_58;
                var53_58 = var72_85;
                var72_85 = var79_91;
            } else {
                var79_91 = var72_85;
                var31_32 = var28_28;
                var80_92 = Math.cos(var25_24) * var31_32;
                var53_58 = (float)var80_92;
                var17_15 = Math.sin(var25_24);
                var11_11 = (float)(var31_32 * var17_15);
                var3_3.moveTo(var53_58, var11_11);
                var27_26 = var11_11;
                var31_32 = var72_85;
                var25_24 += var31_32;
                var33_34 = var53_58;
                var44_46 = 0;
                var53_58 = 0.0f;
                var65_77 = null;
            }
            var69_83 = Math.ceil(var69_83);
            var17_15 = 2.0;
            var69_83 *= var17_15;
            var38_40 = var25_24;
            var82_93 = false;
            var58_63 = 0.0f;
            var20_17 = null;
            var24_22 = var48_51;
            while ((var83_94 = (cfr_temp_5 = (var29_30 = (double)var82_93) - var69_83) == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1)) < 0) {
                block29: {
                    block28: {
                        var59_65 = var67_81 != false ? var28_28 : var24_22;
                        cfr_temp_6 = var53_58 - 0.0f;
                        var84_95 /* !! */  = (float)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                        if (var84_95 /* !! */  != false && (var87_97 = (cfr_temp_7 = var29_30 - (var85_96 = var69_83 - var17_15)) == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1)) == false) {
                            var61_69 = var43_44 * var47_49;
                            var66_79 = 2.0f;
                            var88_98 = var61_69 / var66_79;
                            var61_69 = var43_44;
                            var43_44 = var88_98;
                        } else {
                            var66_79 = 2.0f;
                            var61_69 = var43_44;
                            var43_44 = var72_85;
                        }
                        if (var84_95 /* !! */  != false && (var84_95 /* !! */  = (float)((cfr_temp_8 = var29_30 - (var89_99 = var69_83 - (var54_60 = 1.0))) == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1))) == false) {
                            var60_67 = var28_28;
                            var59_65 = var24_22;
                            var28_28 = var53_58;
                        } else {
                            var60_67 = var28_28;
                            var28_28 = var59_65;
                            var59_65 = var24_22;
                        }
                        var91_100 = var28_28;
                        var89_99 = Math.cos(var38_40);
                        var51_55 = var53_58;
                        var64_75 = var72_85;
                        var80_92 = var89_99 * var91_100;
                        var53_58 = (float)var80_92;
                        var89_99 = Math.sin(var38_40);
                        var72_85 = (float)(var91_100 *= var89_99);
                        cfr_temp_9 = var75_88 - 0.0f;
                        var71_84 = (int)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1));
                        if (var71_84 != 0 || (var71_84 = (int)((cfr_temp_10 = var76_89 - 0.0f) == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1))) != 0) break block28;
                        var3_3.lineTo(var53_58, var72_85);
                        var21_19 = var59_65;
                        var59_65 = var60_67;
                        var54_60 = 1.0;
                        var93_101 = 1.5707963267948966;
                        var84_95 /* !! */  = (float)var82_93;
                        break block29;
                    }
                    var91_100 = var11_11;
                    var62_71 = var11_11;
                    var95_102 = var29_30;
                    var77_90 = var33_34;
                    var77_90 = Math.atan2(var91_100, var77_90);
                    var93_101 = 1.5707963267948966;
                    var77_90 = (float)(var77_90 - var93_101);
                    var13_13 = Math.cos(var77_90);
                    var48_51 = (float)var13_13;
                    var77_90 = Math.sin(var77_90);
                    var11_11 = (float)var77_90;
                    var91_100 = var72_85;
                    var27_26 = var33_34;
                    var49_53 = var53_58;
                    var49_53 = (float)(Math.atan2(var91_100, var49_53) - var93_101);
                    var91_100 = Math.cos(var49_53);
                    var28_28 = (float)var91_100;
                    var49_53 = Math.sin(var49_53);
                    var21_19 = (float)var49_53;
                    var33_34 = var67_81 != false ? var75_88 : var76_89;
                    var24_22 = var67_81 != false ? var76_89 : var75_88;
                    var63_73 = var67_81 != false ? var59_65 : var60_67;
                    var97_103 = var67_81 != false ? var60_67 : var59_65;
                    var63_73 *= var33_34;
                    var7_7 = 1056236141;
                    var33_34 = 0.47829f;
                    var48_51 *= (var63_73 *= var33_34);
                    var63_73 *= var11_11;
                    var97_103 = var97_103 * var24_22 * var33_34;
                    var28_28 *= var97_103;
                    var97_103 *= var21_19;
                    if (var74_87 == false) ** GOTO lbl341
                    if (!var82_93) {
                        var48_51 *= var47_49;
                        var63_73 *= var47_49;
lbl341:
                        // 2 sources

                        var54_60 = 1.0;
                    } else {
                        var54_60 = 1.0;
                        var49_53 = var69_83 - var54_60;
                        cfr_temp_11 = var95_102 - var49_53;
                        var10_10 = (int)(cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 > 0.0 ? 1 : -1));
                        if (var10_10 == 0) {
                            var28_28 *= var47_49;
                            var97_103 *= var47_49;
                        }
                    }
                    var11_11 = var27_26 - var48_51;
                    var27_26 = var62_71 - var63_73;
                    var48_51 = var53_58 + var28_28;
                    var28_28 = var72_85 + var97_103;
                    var9_9 = var3_3;
                    var21_19 = var59_65;
                    var59_65 = var60_67;
                    var24_22 = var53_58;
                    var84_95 /* !! */  = (float)var82_93;
                    var58_63 = var72_85;
                    var3_3.cubicTo(var11_11, var27_26, var48_51, var28_28, var53_58, var72_85);
                }
                var31_32 = var43_44;
                var38_40 += var31_32;
                var67_81 ^= true;
                var82_93 = var84_95 /* !! */  + true;
                var24_22 = var21_19;
                var33_34 = var53_58;
                var11_11 = var72_85;
                var28_28 = var59_65;
                var43_44 = var61_69;
                var72_85 = var64_75;
                var53_58 = var51_55;
                var6_6 = this;
            }
            var1_1 = (PointF)var37_38.f();
            var21_19 = var1_1.x;
            var47_49 = var1_1.y;
            var3_3.offset(var21_19, var47_49);
            var3_3.close();
        }
        var3_3.close();
        var1_1 = this;
        this.q.a(var3_3);
        this.r = true;
        return var3_3;
    }

    public final void h(LC1 lC1, Object object) {
        Object object2 = GC1.r;
        if (object == object2) {
            object = this.j;
            ((iw_0)object).k(lC1);
        } else {
            object2 = GC1.s;
            if (object == object2) {
                object = this.l;
                ((iw_0)object).k(lC1);
            } else {
                object2 = GC1.i;
                if (object == object2) {
                    object = this.k;
                    ((iw_0)object).k(lC1);
                } else {
                    object2 = GC1.t;
                    if (object == object2 && (object2 = this.m) != null) {
                        ((iw_0)object2).k(lC1);
                    } else {
                        object2 = GC1.u;
                        if (object == object2) {
                            object = this.n;
                            ((iw_0)object).k(lC1);
                        } else {
                            object2 = GC1.v;
                            if (object == object2 && (object2 = this.o) != null) {
                                ((iw_0)object2).k(lC1);
                            } else {
                                object2 = GC1.w;
                                if (object == object2) {
                                    object = this.p;
                                    ((iw_0)object).k(lC1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

