/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class B61 {
    public final zp1 a;
    public final i42_0 b;
    public final br1_0 c;

    public B61(zp1 object) {
        this.a = object;
        this.b = object = new i42_0();
        object = new eB1();
        int n3 = et2_1.g(10);
        ((br1_0)object).d(n3);
        this.c = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(long var1_1, List var3_2, boolean var4_3) {
        var5_4 = this;
        var6_5 = var1_1;
        var8_6 = this.b;
        var9_7 = this.c;
        var10_8 = 0;
        var11_9 = null;
        var9_7.e = 0;
        var12_10 /* !! */  = var9_7.a;
        var13_11 = et2_1.a;
        var14_12 = 255L;
        var16_13 = 7;
        if (var12_10 /* !! */  != var13_11) {
            rp_1.q(var12_10 /* !! */ );
            var12_10 /* !! */  = var9_7.a;
            var17_14 = var9_7.d;
            var18_15 = var17_14 >> 3;
            var17_14 = (var17_14 & var16_13) << 3;
            var19_16 = var12_10 /* !! */ [var18_15];
            var21_17 = var14_12 << var17_14;
            var14_12 = var21_17 ^ (long)-1;
            var12_10 /* !! */ [var18_15] = var23_18 = var19_16 & var14_12 | var21_17;
        }
        var12_10 /* !! */  = (long[])var9_7.c;
        var17_14 = var9_7.d;
        rp_1.n(0, var17_14, null, var12_10 /* !! */ );
        var25_19 = et2_1.c(var9_7.d);
        var17_14 = var9_7.e;
        var9_7.f = var25_19 -= var17_14;
        var25_19 = var3_2.size();
        var17_14 = 1;
        var26_20 = var8_6;
        var18_15 = 1;
        for (var27_21 = 0; var27_21 < var25_19; ++var27_21) {
            var28_22 = (LP1$c)var3_2.get(var27_21);
            if (var18_15 != 0) {
                var29_23 = var26_20.a;
                var10_8 = var29_23.c;
                if (var10_8 > 0) {
                    var29_23 = var29_23.a;
                    var30_24 = 0;
                    var31_25 = null;
                    while (true) {
                        var33_27 = var32_26 = var29_23[var30_24];
                        var33_27 = ((S32)var32_26).b;
                        var16_13 = (int)Intrinsics.areEqual(var33_27, var28_22);
                        if (var16_13 == 0) {
                            var16_13 = var30_24 + 1;
                            if (var16_13 >= var10_8) break;
                            var30_24 = var16_13;
                            var16_13 = 7;
                            continue;
                        }
                        break;
                    }
                } else {
                    var32_26 = null;
                }
                var11_9 = var32_26;
                var11_9 = (S32)var32_26;
                if (var11_9 != null) {
                    var11_9.h = var17_14;
                    var11_9.c.a(var6_5);
                    var33_27 = var9_7.b(var6_5);
                    if (var33_27 == null) {
                        var33_27 = new hr1_0(null);
                        var9_7.e(var6_5, (hr1_0)var33_27);
                    }
                    var33_27 = (hr1_0)var33_27;
                    var33_27.b(var11_9);
lbl64:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var18_15 = 0;
                var34_28 = null;
            }
            var11_9 = new S32(var28_22);
            var11_9.c.a(var6_5);
            var33_27 = var9_7.b(var6_5);
            if (var33_27 == null) {
                var33_27 = new hr1_0(null);
                var9_7.e(var6_5, (hr1_0)var33_27);
            }
            ((hr1_0)var33_27).b(var11_9);
            var33_27 = var26_20.a;
            var33_27.b(var11_9);
            ** continue;
            var26_20 = var11_9;
            var10_8 = 0;
            var11_9 = null;
            var16_13 = 7;
        }
        if (var4_3) {
            var35_29 = var9_7.b;
            var36_30 = var9_7.c;
            var9_7 = var9_7.a;
            var10_8 = ((Object)var9_7).length + -2;
            if (var10_8 >= 0) {
                var25_19 = 0;
                var12_10 /* !! */  = null;
                while (true) {
                    var14_12 = (long)var9_7[var25_19];
                    var37_31 = var14_12 ^ (long)-1;
                    var39_32 = 7;
                    var37_31 = var37_31 << var39_32 & var14_12;
                    var40_33 = -9187201950435737472L;
                    cfr_temp_0 = (var37_31 &= var40_33) - var40_33;
                    var42_34 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var42_34 != false) {
                        var16_13 = ~(var25_19 - var10_8) >>> 31;
                        var18_15 = 8;
                        var16_13 = 8 - var16_13;
                        for (var43_35 = 0; var43_35 < var16_13; ++var43_35) {
                            var21_17 = 255L;
                            var44_36 = var14_12 & var21_17;
                            var46_37 = 128L;
                            cfr_temp_1 = var44_36 - var46_37;
                            var48_38 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                            if (var48_38 < 0) {
                                var49_39 = (var25_19 << 3) + var43_35;
                                var21_17 = var35_29[var49_39];
                                var50_40 /* !! */  = (long[])var36_30[var49_39];
                                var26_20 = var50_40 /* !! */ ;
                                var26_20 = (hr1_0)var50_40 /* !! */ ;
                                var34_28 = var8_6.a;
                                var17_14 = var34_28.c;
                                if (var17_14 > 0) {
                                    var34_28 = var34_28.a;
                                    var51_41 = 0;
                                    while (true) {
                                        var5_4 = var31_25 = var34_28[var51_41];
                                        var5_4 = (S32)var31_25;
                                        var5_4.g(var21_17, (hr1_0)var26_20);
                                        var50_40 /* !! */  = var35_29;
                                        var52_42 = var51_41 + 1;
                                        if (var52_42 >= var17_14) break;
                                        var5_4 = this;
                                        var51_41 = var52_42;
                                    }
lbl130:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                            }
                            var50_40 /* !! */  = var35_29;
                            ** continue;
                            var52_42 = 8;
                            var14_12 >>= var52_42;
                            var5_4 = this;
                            var35_29 = var50_40 /* !! */ ;
                            var17_14 = 1;
                            var18_15 = 8;
                            var39_32 = 7;
                        }
                        var50_40 /* !! */  = var35_29;
                        var52_42 = 8;
                        if (var16_13 != var52_42) break;
                    } else {
                        var50_40 /* !! */  = var35_29;
                    }
                    if (var25_19 == var10_8) break;
                    ++var25_19;
                    var5_4 = this;
                    var35_29 = var50_40 /* !! */ ;
                    var17_14 = 1;
                }
            }
        }
    }

    public final boolean b(zj1 zj12, boolean n3) {
        boolean bl2;
        boolean bl3;
        S32 s32;
        int n4;
        Object[] objectArray;
        i42_0 i42_02 = this.b;
        Object[] objectArray2 = this.a;
        pb1_0 pb1_02 = zj12.a;
        boolean bl4 = i42_02.a(pb1_02, (zp1)objectArray2, zj12, n3 != 0);
        boolean bl5 = false;
        pb1_02 = null;
        if (!bl4) {
            return false;
        }
        objectArray2 = i42_02.a;
        int n7 = objectArray2.c;
        if (n7 > 0) {
            objectArray = objectArray2.a;
            n4 = 0;
            s32 = null;
            bl3 = false;
            do {
                S32 s322;
                boolean bl6;
                if (!(bl6 = (s322 = (S32)objectArray[n4]).f(zj12, n3 != 0)) && !bl3) {
                    bl3 = false;
                    continue;
                }
                bl3 = true;
            } while (++n4 < n7);
        } else {
            bl3 = false;
        }
        n3 = objectArray2.c;
        if (n3 > 0) {
            objectArray2 = objectArray2.a;
            n7 = 0;
            bl2 = false;
            objectArray = null;
            do {
                if ((n4 = (int)((s32 = (S32)objectArray2[n7]).e(zj12) ? 1 : 0)) == 0 && !bl2) {
                    bl2 = false;
                    objectArray = null;
                    continue;
                }
                bl2 = true;
            } while (++n7 < n3);
        } else {
            bl2 = false;
            objectArray = null;
        }
        i42_02.b(zj12);
        if (bl2 || bl3) {
            bl5 = true;
        }
        return bl5;
    }
}

