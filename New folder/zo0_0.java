/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from zO0
 */
public final class zo0_0
implements eI0 {
    public final byte[] a;
    public final Xm2 b;
    public final boolean c;
    public final AO0$a d;
    public gi0_0 e;
    public wp3 f;
    public int g;
    public Metadata h;
    public EO0 i;
    public int j;
    public int k;
    public yo0_0 l;
    public int m;
    public long n;

    public zo0_0() {
        Object object = new byte[42];
        this.a = object;
        object = new Xm2;
        byte[] byArray = new byte[32768];
        super(byArray, 0);
        this.b = object;
        this.c = false;
        object = new AO0$a;
        super();
        this.d = object;
        this.g = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(fi0_0 var1_1, Pw2 var2_2) {
        block46: {
            block47: {
                block48: {
                    block49: {
                        block50: {
                            block51: {
                                block53: {
                                    block44: {
                                        block58: {
                                            block56: {
                                                block57: {
                                                    block54: {
                                                        block55: {
                                                            block43: {
                                                                block42: {
                                                                    block52: {
                                                                        var3_3 = this;
                                                                        var4_4 = 2;
                                                                        var5_5 = 1;
                                                                        var6_6 = this.g;
                                                                        var7_7 = 0;
                                                                        var8_8 = null;
                                                                        var9_9 = 0;
                                                                        var10_10 = null;
                                                                        if (var6_6 == 0) break block46;
                                                                        var11_11 = this.a;
                                                                        if (var6_6 == var5_5) break block47;
                                                                        var12_12 = 4;
                                                                        var13_14 = 3;
                                                                        if (var6_6 == var4_4) break block48;
                                                                        var14_15 = 7;
                                                                        var15_16 = 6;
                                                                        if (var6_6 == var13_14) break block49;
                                                                        var16_17 = 0L;
                                                                        var18_19 = -1;
                                                                        var20_20 = 5;
                                                                        if (var6_6 == var12_12) break block50;
                                                                        if (var6_6 != var20_20) break block51;
                                                                        this.f.getClass();
                                                                        this.i.getClass();
                                                                        var21_21 = this.l;
                                                                        if (var21_21 == null || (var11_11 = (Object)var21_21.c) == null) break block52;
                                                                        var22_26 = var1_1;
                                                                        var22_26 = (il0_0)var1_1;
                                                                        var23_34 = var2_2;
                                                                        var9_9 = var21_21.a((il0_0)var22_26, var2_2);
                                                                        break block53;
                                                                    }
                                                                    var24_40 = var3_3.n;
                                                                    var6_6 = -1;
                                                                    var13_14 = (int)(var24_40 == var18_19 ? 0 : (var24_40 < var18_19 ? -1 : 1));
                                                                    if (var13_14 != 0) break block54;
                                                                    var11_11 = var3_3.i;
                                                                    var26_41 = var1_1;
                                                                    ((il0_0)var1_1).f = 0;
                                                                    var26_41 = var1_1;
                                                                    var26_41 = (il0_0)var1_1;
                                                                    var26_41.l(var5_5, false);
                                                                    var27_44 = new byte[var5_5];
                                                                    var26_41.b(var27_44, 0, var5_5, false);
                                                                    var13_14 = var27_44[0] & var5_5;
                                                                    if (var13_14 == var5_5) {
                                                                        var13_14 = 1;
                                                                    } else {
                                                                        var13_14 = 0;
                                                                        var27_44 = null;
                                                                    }
                                                                    var26_41.l(var4_4, false);
                                                                    if (var13_14 == 0) {
                                                                        var14_15 = 6;
                                                                    }
                                                                    var22_27 = new Xm2(var14_15);
                                                                    var28_48 = var22_27.a;
                                                                    var30_52 = null;
                                                                    for (var29_50 = 0; var29_50 < var14_15; var29_50 += var31_55) {
                                                                        var31_55 = var14_15 - var29_50;
                                                                        if ((var31_55 = var26_41.n(var29_50, var28_48, var31_55)) == var6_6) break;
                                                                    }
                                                                    var22_27.H(var29_50);
                                                                    var26_41.f = 0;
                                                                    try {
                                                                        var32_58 = var22_27.D();
                                                                        if (var13_14 == 0) break block42;
                                                                    }
                                                                    catch (NumberFormatException v0) {
                                                                        var5_5 = 0;
                                                                        var23_35 = null;
                                                                    }
lbl71:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var16_17 = var32_58;
                                                                        break block43;
                                                                        break;
                                                                    }
                                                                }
                                                                var4_4 = var11_11.b;
                                                                var24_40 = var4_4;
                                                                var32_58 *= var24_40;
                                                                ** while (true)
                                                            }
                                                            if (var5_5 == 0) break block55;
                                                            var3_3.n = var16_17;
                                                            break block53;
                                                        }
                                                        throw ParserException.a(null, null);
                                                    }
                                                    var22_28 = var3_3.b;
                                                    var7_7 = var22_28.c;
                                                    var24_40 = 1000000L;
                                                    var13_14 = 32768;
                                                    if (var7_7 >= var13_14) break block56;
                                                    var34_59 = var22_28.a;
                                                    var13_14 -= var7_7;
                                                    var28_49 = var1_1;
                                                    var28_49 = (il0_0)var1_1;
                                                    if ((var13_14 = var28_49.read(var34_59, var7_7, var13_14)) == var6_6) {
                                                        var14_15 = 1;
                                                    } else {
                                                        var14_15 = 0;
                                                        var34_59 = null;
                                                    }
                                                    if (var14_15 != 0) break block57;
                                                    var22_28.H(var7_7 += var13_14);
                                                    break block58;
                                                }
                                                var7_7 = var22_28.a();
                                                if (var7_7 != 0) break block58;
                                                var35_62 = var3_3.n * var24_40;
                                                var8_8 = var3_3.i;
                                                var9_9 = gz3.a;
                                                var7_7 = var8_8.e;
                                                var37_64 = var7_7;
                                                var39_66 = var35_62 / var37_64;
                                                var11_11 = var3_3.f;
                                                var15_16 = var3_3.m;
                                                var41_68 = false;
                                                var42_71 = null;
                                                var14_15 = 1;
                                                var43_74 = false;
                                                var44_77 = null;
                                                var11_11.a(var39_66, var14_15, var15_16, 0, null);
                                                var9_9 = -1;
                                                break block53;
                                            }
                                            var14_15 = 0;
                                            var34_59 = null;
                                        }
                                        var6_6 = var22_28.b;
                                        var7_7 = var3_3.m;
                                        var13_14 = var3_3.j;
                                        if (var7_7 < var13_14) {
                                            var13_14 -= var7_7;
                                            var7_7 = var22_28.a();
                                            var7_7 = Math.min(var13_14, var7_7);
                                            var22_28.J(var7_7);
                                        }
                                        var8_8 = var3_3.i;
                                        var8_8.getClass();
                                        var7_7 = var22_28.b;
                                        while (true) {
                                            var13_14 = var22_28.c;
                                            var15_16 = 16;
                                            var44_78 = var3_3.d;
                                            if (var7_7 > (var13_14 -= var15_16)) break;
                                            var22_28.I(var7_7);
                                            var27_45 = var3_3.i;
                                            var41_69 = var3_3.k;
                                            var13_14 = (int)AO0.a(var22_28, var27_45, var41_69, var44_78);
                                            if (var13_14 != 0) {
                                                var22_28.I(var7_7);
                                                var45_80 = var44_78.a;
                                                break block44;
                                            }
                                            var7_7 += var5_5;
                                        }
                                        if (var14_15 != 0) {
                                            while (true) {
                                                var13_14 = var22_28.c;
                                                var14_15 = var3_3.j;
                                                if (var7_7 > (var14_15 = var13_14 - var14_15)) break;
                                                var22_28.I(var7_7);
                                                var27_45 = var3_3.i;
                                                var14_15 = var3_3.k;
                                                try {
                                                    var13_14 = (int)AO0.a(var22_28, var27_45, var14_15, var44_78);
                                                }
                                                catch (IndexOutOfBoundsException v1) {
                                                    var13_14 = 0;
                                                    var27_45 = null;
                                                }
                                                var14_15 = var22_28.b;
                                                var41_69 = var22_28.c;
                                                if (var14_15 > var41_69) {
                                                    var13_14 = 0;
                                                    var27_45 = null;
                                                }
                                                if (var13_14 != 0) {
                                                    var22_28.I(var7_7);
                                                    var45_80 = var44_78.a;
                                                    break block44;
                                                }
                                                var7_7 += var5_5;
                                            }
                                            var22_28.I(var13_14);
                                        } else {
                                            var22_28.I(var7_7);
                                        }
                                        var45_80 = var18_19;
                                    }
                                    var5_5 = var22_28.b - var6_6;
                                    var22_28.I(var6_6);
                                    var21_21 = var3_3.f;
                                    var21_21.f(var5_5, var22_28);
                                    var6_6 = var3_3.m;
                                    var3_3.m = var5_5 += var6_6;
                                    var6_6 = (int)(var45_80 == var18_19 ? 0 : (var45_80 < var18_19 ? -1 : 1));
                                    if (var6_6 != 0) {
                                        var47_82 = var3_3.n * var24_40;
                                        var11_11 = var3_3.i;
                                        var12_12 = gz3.a;
                                        var20_20 = var11_11.e;
                                        var24_40 = var20_20;
                                        var49_83 = var47_82 / var24_40;
                                        var51_84 = var3_3.f;
                                        var52_86 = 1;
                                        var51_84.a(var49_83, var52_86, var5_5, 0, null);
                                        var3_3.m = 0;
                                        var3_3.n = var45_80;
                                    }
                                    if ((var5_5 = var22_28.a()) < var15_16) {
                                        var5_5 = var22_28.a();
                                        var21_21 = var22_28.a;
                                        var7_7 = var22_28.b;
                                        System.arraycopy(var21_21, var7_7, var21_21, 0, var5_5);
                                        var22_28.I(0);
                                        var22_28.H(var5_5);
                                    }
                                }
                                return var9_9;
                            }
                            var22_29 = new IllegalStateException();
                            throw var22_29;
                        }
                        var23_36 = var1_1;
                        ((il0_0)var1_1).f = 0;
                        var23_36 = new Xm2(var4_4);
                        var21_22 = var23_36.a;
                        var26_42 = var1_1;
                        var26_42 = (il0_0)var1_1;
                        var26_42.b(var21_22, 0, var4_4, false);
                        var5_5 = var23_36.C();
                        var4_4 = var5_5 >> 2;
                        var6_6 = 16382;
                        if (var4_4 == var6_6) {
                            var26_42.f = 0;
                            this.k = var5_5;
                            var22_30 = this.e;
                            var5_5 = gz3.a;
                            var53_88 = var26_42.d;
                            this.i.getClass();
                            var8_8 = this.i;
                            var27_46 = var8_8.k;
                            if (var27_46 != null) {
                                var26_42 = new DO0((EO0)var8_8, var53_88);
                            } else {
                                var39_67 = var26_42.c;
                                cfr_temp_0 = var39_67 - var18_19;
                                var14_15 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var14_15 != 0 && (var14_15 = (int)((cfr_temp_1 = (var18_19 = var8_8.j) - var16_17) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) > 0) {
                                    var43_75 = this.k;
                                    var42_72 = new xo0_0(var8_8);
                                    var30_53 = new yO0$a((EO0)var8_8, var43_75);
                                    var55_89 = var8_8.b();
                                    var43_75 = var8_8.c;
                                    var31_56 = var8_8.d;
                                    if (var31_56 > 0) {
                                        var57_90 = var31_56;
                                        var59_92 = var43_75;
                                        var57_90 = (var57_90 + var59_92) / (long)2;
                                        var59_92 = 1L;
                                        var61_96 = var57_90 += var59_92;
                                    } else {
                                        var20_20 = var8_8.a;
                                        var9_9 = var8_8.b;
                                        var59_93 = var20_20 == var9_9 && var20_20 > 0 ? (long)var20_20 : 4096L;
                                        var57_91 = var8_8.g;
                                        var59_93 *= var57_91;
                                        var31_56 = var8_8.h;
                                        var57_91 = var31_56;
                                        var59_93 = var59_93 * var57_91 / (long)8;
                                        var57_91 = 64;
                                        var61_96 = var59_93 += var57_91;
                                    }
                                    var63_97 = Math.max(var15_16, var43_75);
                                    var37_65 = var8_8.j;
                                    var51_85 = var34_60;
                                    var3_3.l = var34_60 = new Kx(var42_72, var30_53, var55_89, var37_65, var53_88, var39_67, var61_96, var63_97);
                                    var26_42 = var34_60.a;
                                } else {
                                    var53_88 = var8_8.b();
                                    var26_42 = new dX2$b(var53_88);
                                }
                            }
                            var22_30.h((dx2_1)var26_42);
                            var3_3.g = 5;
                            return 0;
                        }
                        var26_42.f = 0;
                        throw ParserException.a("First frame does not start with sync code.", null);
                    }
                    var4_4 = 0;
                    var22_31 = null;
                    var23_37 = this.i;
                    var64_98 = 0;
                    while (var64_98 == 0) {
                        block59: {
                            block45: {
                                block61: {
                                    block60: {
                                        var21_23 = var1_1;
                                        ((il0_0)var1_1).f = 0;
                                        var8_8 = new byte[var12_12];
                                        var21_23 = new Vm2((byte[])var8_8, var12_12);
                                        var10_10 = var1_1;
                                        var10_10 = (il0_0)var1_1;
                                        var10_10.b((byte[])var8_8, 0, var12_12, false);
                                        var7_7 = var21_23.f();
                                        var43_76 = var21_23.g(var14_15);
                                        var41_70 = 24;
                                        var6_6 = var21_23.g(var41_70) + var12_12;
                                        if (var43_76 == 0) {
                                            var5_5 = 38;
                                            var21_23 = new byte[var5_5];
                                            var10_10.e((byte[])var21_23, 0, var5_5, false);
                                            var22_31 = new EO0((byte[])var21_23, var12_12);
lbl308:
                                            // 4 sources

                                            while (true) {
                                                var23_37 = var22_31;
                                                break block45;
                                                break;
                                            }
                                        }
                                        if (var23_37 == null) break block59;
                                        if (var43_76 != var13_14) break block60;
                                        var22_31 = new Xm2(var6_6);
                                        var44_79 /* !! */  = var22_31.a;
                                        var41_70 = 0;
                                        var42_73 = null;
                                        var10_10.e(var44_79 /* !! */ , 0, var6_6, false);
                                        var65_99 = BO0.a((Xm2)var22_31);
                                        var16_18 = var23_37.j;
                                        var21_23 = var23_37.l;
                                        var31_57 = var23_37.a;
                                        var66_100 = var23_37.b;
                                        var9_9 = var23_37.c;
                                        var29_51 = var23_37.d;
                                        var14_15 = var23_37.e;
                                        var13_14 = var23_37.g;
                                        var5_5 = var23_37.h;
                                        var30_54 = var22_31;
                                        var52_87 = var14_15;
                                        var22_31 = new EO0(var31_57, var66_100, var9_9, var29_51, var14_15, var13_14, var5_5, var16_18, var65_99, (Metadata)var21_23);
                                        ** GOTO lbl308
                                    }
                                    var22_31 = var23_37.l;
                                    if (var43_76 != var12_12) break block61;
                                    var27_47 = new Xm2(var6_6);
                                    var34_61 = var27_47.a;
                                    var43_76 = 0;
                                    var44_79 /* !! */  = null;
                                    var10_10.e(var34_61, 0, var6_6, false);
                                    var27_47.J(var12_12);
                                    var21_23 = KE3.b(Arrays.asList(KE3.c((Xm2)var27_47, (boolean)false, (boolean)false).a));
                                    if (var22_31 == null) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var21_23 = var22_31.b((Metadata)var21_23);
                                    ** continue;
                                    var67_101 = var21_23;
                                    var45_81 = var23_37.j;
                                    var21_23 = var23_37.k;
                                    var41_70 = var23_37.a;
                                    var29_51 = var23_37.b;
                                    var31_57 = var23_37.c;
                                    var66_100 = var23_37.d;
                                    var9_9 = var23_37.e;
                                    var43_76 = var23_37.g;
                                    var5_5 = var23_37.h;
                                    var44_79 /* !! */  = (byte[])var22_31;
                                    var52_87 = var5_5;
                                    var22_31 = new EO0(var41_70, var29_51, var31_57, var66_100, var9_9, var43_76, var5_5, var45_81, (EO0$a)var21_23, (Metadata)var67_101);
                                    ** GOTO lbl308
                                }
                                if (var43_76 == var15_16) {
                                    var27_47 = new Xm2(var6_6);
                                    var34_61 = var27_47.a;
                                    var43_76 = 0;
                                    var44_79 /* !! */  = null;
                                    var10_10.e(var34_61, 0, var6_6, false);
                                    var27_47.J(var12_12);
                                    var21_23 = ImmutableList.of(PictureFrame.a(var27_47));
                                    var10_10 = new Metadata((List)var21_23);
                                    if (var22_31 == null) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var10_10 = var22_31.b((Metadata)var10_10);
                                    ** continue;
                                    var67_101 = var10_10;
                                    var45_81 = var23_37.j;
                                    var21_23 = var23_37.k;
                                    var41_70 = var23_37.a;
                                    var29_51 = var23_37.b;
                                    var31_57 = var23_37.c;
                                    var66_100 = var23_37.d;
                                    var9_9 = var23_37.e;
                                    var43_76 = var23_37.g;
                                    var5_5 = var23_37.h;
                                    var44_79 /* !! */  = (byte[])var22_31;
                                    var52_87 = var5_5;
                                    var22_31 = new EO0(var41_70, var29_51, var31_57, var66_100, var9_9, var43_76, var5_5, var45_81, (EO0$a)var21_23, (Metadata)var10_10);
                                    ** continue;
                                }
                                var10_10.j(var6_6);
                            }
                            var4_4 = gz3.a;
                            var3_3.i = var23_37;
                            var64_98 = var7_7;
                            var4_4 = 0;
                            var22_31 = null;
                            var13_14 = 3;
                            var14_15 = 7;
                            continue;
                        }
                        var22_31 = new IllegalArgumentException();
                        throw var22_31;
                    }
                    var3_3.i.getClass();
                    var3_3.j = var4_4 = Math.max(var3_3.i.c, var15_16);
                    var22_31 = var3_3.f;
                    var5_5 = gz3.a;
                    var23_37 = var3_3.i;
                    var21_23 = var3_3.h;
                    var23_37 = var23_37.c((byte[])var11_11, (Metadata)var21_23);
                    var22_31.d((d)var23_37);
                    var3_3.g = var12_12;
                    return 0;
                }
                var6_6 = 0;
                var21_24 = null;
                var22_32 = new Xm2(var12_12);
                var23_38 = var22_32.a;
                var10_10 = var1_1;
                var10_10 = (il0_0)var1_1;
                var10_10.e(var23_38, 0, var12_12, false);
                var35_63 = var22_32.y();
                var59_94 = 1716281667L;
                var12_12 = (int)(var35_63 == var59_94 ? 0 : (var35_63 < var59_94 ? -1 : 1));
                if (var12_12 == 0) {
                    this.g = 3;
                    return 0;
                }
                throw ParserException.a("Failed to read FLAC stream marker.", null);
            }
            var5_5 = ((byte[])var11_11).length;
            var8_8 = var1_1;
            ((il0_0)var1_1).b((byte[])var11_11, 0, var5_5, false);
            var23_39 = var1_1;
            ((il0_0)var1_1).f = 0;
            this.g = var4_4;
            return 0;
        }
        var6_6 = 0;
        var4_4 = this.c ^ var5_5;
        var10_10 = var1_1;
        var10_10 = (il0_0)var1_1;
        var10_10.f = 0;
        var21_25 = var1_1;
        var21_25 = (il0_0)var1_1;
        var59_95 = var21_25.h();
        if (var4_4 != 0) {
            var4_4 = 0;
            var22_33 = null;
        } else {
            var22_33 = uc1_1.b;
        }
        var26_43 = new vc1_0();
        var22_33 = var26_43.a((il0_0)var21_25, (Uc1$a)var22_33);
        if (var22_33 != null && (var12_13 = (var26_43 = var22_33.a).length) != 0) {
            var8_8 = var22_33;
        }
        var4_4 = (int)(var21_25.h() - var59_95);
        var21_25.j(var4_4);
        var3_3.h = var8_8;
        var3_3.g = var5_5;
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        fi0_02 = (il0_0)fi0_02;
        Metadata$Entry[] metadata$EntryArray = uc1_1.b;
        vc1_0 vc1_02 = new vc1_0();
        if ((metadata$EntryArray = vc1_02.a((il0_0)fi0_02, (Uc1$a)metadata$EntryArray)) != null) {
            metadata$EntryArray = metadata$EntryArray.a;
            int cfr_ignored_0 = metadata$EntryArray.length;
        }
        int n3 = 4;
        metadata$EntryArray = new Xm2(n3);
        byte[] byArray = metadata$EntryArray.a;
        boolean bl2 = false;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        long l2 = metadata$EntryArray.y();
        long l3 = 1716281667L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            this.g = 0;
        } else {
            yo0_0 yo0_02 = this.l;
            if (yo0_02 != null) {
                yo0_02.c(l3);
            }
        }
        long l8 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l8 != false) {
            l4 = -1;
        }
        this.n = l4;
        this.m = 0;
        this.b.F(0);
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        wp3 wp32;
        this.e = gi0_02;
        this.f = wp32 = gi0_02.n(0, 1);
        gi0_02.j();
    }

    public final void release() {
    }
}

