/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.foundation.lazy.layout.d$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class LazyLayoutItemAnimator {
    public final nr1_1 a;
    public d b;
    public int c;
    public final pr1_1 d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public it0_0 j;
    public final LP1 k;

    public LazyLayoutItemAnimator() {
        Object object = et2_1.d();
        this.a = object;
        this.d = object = gt2_1.a();
        object = new ArrayList();
        this.e = object;
        object = new ArrayList();
        this.f = object;
        object = new ArrayList();
        this.g = object;
        object = new ArrayList();
        this.h = object;
        object = new ArrayList();
        this.i = object;
        this.k = object = new LazyLayoutItemAnimator$DisplayingDisappearingItemsElement(this);
    }

    public static void c(gs1_0 gs1_02, int n3, LazyLayoutItemAnimator$b lazyLayoutItemAnimator$b) {
        long l2;
        int n4 = 0;
        long l3 = gs1_02.l(0);
        int n7 = gs1_02.f();
        if (n7 != 0) {
            n7 = 1;
            l2 = Si1.a(0, n3, n7, l3);
        } else {
            n7 = 2;
            l2 = Si1.a(n3, 0, n7, l3);
        }
        Gr1[] gr1Array = lazyLayoutItemAnimator$b.a;
        int n8 = gr1Array.length;
        int n10 = 0;
        while (n4 < n8) {
            Gr1 gr1 = gr1Array[n4];
            int n14 = n10 + 1;
            if (gr1 != null) {
                long l4 = Si1.c(gs1_02.l(n10), l3);
                gr1.l = l4 = Si1.d(l2, l4);
            }
            ++n4;
            n10 = n14;
        }
    }

    public static int h(int[] nArray, gs1_0 gs1_02) {
        int n3;
        int n4 = gs1_02.d() + n3;
        int n7 = 0;
        for (n3 = gs1_02.m(); n3 < n4; ++n3) {
            int n8;
            int n10 = nArray[n3];
            nArray[n3] = n8 = gs1_02.i() + n10;
            n7 = Math.max(n7, n8);
        }
        return n7;
    }

    public final Gr1 a(int n3, Object gr1Array) {
        Gr1 gr1;
        nr1_1 nr1_12 = this.a;
        if ((gr1Array = (LazyLayoutItemAnimator$b)nr1_12.b(gr1Array)) != null && (gr1Array = gr1Array.a) != null) {
            gr1 = gr1Array[n3];
        } else {
            n3 = 0;
            gr1 = null;
        }
        return gr1;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int n3 = arrayList.size();
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            Gr1 gr1 = (Gr1)arrayList.get(i3);
            W01 w01 = gr1.n;
            if (w01 == null) continue;
            int n4 = 32;
            int n7 = (int)(l2 >> n4);
            int n8 = (int)(gr1.l >> n4);
            n4 = (int)(w01.t >> n4);
            n8 += n4;
            n4 = Math.max(n7, n8);
            long l3 = 0xFFFFFFFFL;
            int n10 = (int)(l2 & l3);
            long l4 = gr1.l & l3;
            int n14 = (int)l4;
            long l7 = w01.t & l3;
            int n15 = (int)l7;
            n14 += n15;
            n14 = Math.max(n10, n14);
            l2 = dj1.a(n4, n14);
        }
        return l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d(int var1_1, int var2_2, int var3_3, ArrayList var4_4, d var5_5, hs1_0 var6_6, boolean var7_7, boolean var8_8, int var9_9, boolean var10_10, int var11_11, int var12_12, c80 var13_13, T01 var14_14) {
        block99: {
            block103: {
                block95: {
                    block94: {
                        var15_15 = this;
                        var16_16 = var1_1;
                        var17_17 = var2_2;
                        var18_18 = var3_3;
                        var19_19 = var4_4;
                        var20_20 = var5_5;
                        var21_21 = var9_9;
                        var22_22 = this.b;
                        this.b = var5_5;
                        var23_23 = var4_4.size();
                        var24_24 = 0;
                        var25_25 = null;
                        while (true) {
                            var26_26 = var15_15.a;
                            if (var24_24 >= var23_23) break;
                            var27_27 = (gs1_0)var19_19.get(var24_24);
                            var28_28 = var27_27.c();
                            var30_30 /* !! */  = null;
                            for (var29_29 = 0; var29_29 < var28_28; var29_29 += var32_32) {
                                var31_31 = var27_27.j(var29_29);
                                var32_32 = var31_31 instanceof ar1_1;
                                if (var32_32 != 0) {
                                    var33_33 /* !! */  = var31_31;
                                    var33_33 /* !! */  = (ar1_1)var31_31;
                                } else {
                                    var32_32 = 0;
                                    var34_34 = 0.0f;
                                    var33_33 /* !! */  = null;
                                }
                                if (var33_33 /* !! */  == null) {
                                    var32_32 = 1;
                                    var34_34 = 1.4E-45f;
                                    continue;
                                }
                                break block94;
                            }
                            var32_32 = 1;
                            var34_34 = 1.4E-45f;
                            var24_24 += var32_32;
                        }
                        var29_29 = var26_26.e;
                        if (var29_29 == 0) {
                            this.f();
                            return;
                        }
                    }
                    var29_29 = var15_15.c;
                    var33_33 /* !! */  = (gs1_0)CollectionsKt.firstOrNull(var4_4);
                    if (var33_33 /* !! */  != null) {
                        var32_32 = var33_33 /* !! */ .getIndex();
                    } else {
                        var32_32 = 0;
                        var34_34 = 0.0f;
                        var33_33 /* !! */  = null;
                    }
                    var15_15.c = var32_32;
                    if (var7_7) {
                        var32_32 = 0;
                        var34_34 = 0.0f;
                        var33_33 /* !! */  = null;
                        var35_35 = Ti1.a(0, var16_16);
                    } else {
                        var32_32 = 0;
                        var34_34 = 0.0f;
                        var33_33 /* !! */  = null;
                        var35_35 = Ti1.a(var16_16, 0);
                    }
                    if (!var8_8 && var10_10) {
                        var32_32 = 0;
                        var34_34 = 0.0f;
                        var33_33 /* !! */  = null;
                    } else {
                        var32_32 = 1;
                        var34_34 = 1.4E-45f;
                    }
                    var37_36 = var26_26.b;
                    var25_25 = var26_26.a;
                    var28_28 = ((long[])var25_25).length + -2;
                    var38_37 = 128L;
                    var40_38 = 255L;
                    var27_27 = var15_15.d;
                    var42_39 = -9187201950435737472L;
                    if (var28_28 >= 0) {
                        var17_17 = 0;
                        var44_40 /* !! */  = null;
                        while (true) {
                            var45_41 = var25_25[var17_17];
                            var47_42 = var35_35;
                            var35_35 = (var45_41 ^ (long)-1) << 7 & var45_41 & var42_39;
                            cfr_temp_0 = var35_35 - var42_39;
                            var49_43 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var49_43 /* !! */  != false) {
                                var23_23 = ~(var17_17 - var28_28) >>> 31;
                                var23_23 = 8 - var23_23;
                                var31_31 = null;
                                for (var50_44 = 0; var50_44 < var23_23; ++var50_44) {
                                    var51_45 = var45_41 & var40_38;
                                    cfr_temp_1 = var51_45 - var38_37;
                                    var53_46 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var53_46 < 0) {
                                        var49_43 /* !! */  = (var17_17 << 3) + var50_44;
                                        var54_47 = var25_25;
                                        var25_25 = var37_36[var49_43 /* !! */ ];
                                        var27_27.d(var25_25);
lbl99:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var54_47 = var25_25;
                                    ** continue;
                                    var24_24 = 8;
                                    var45_41 >>= var24_24;
                                    var25_25 = var54_47;
                                }
                                var54_47 = var25_25;
                                var24_24 = 8;
                                if (var23_23 != var24_24) break block95;
                            } else {
                                var54_47 = var25_25;
                            }
                            if (var17_17 != var28_28) {
                                ++var17_17;
                                var35_35 = var47_42;
                                var25_25 = var54_47;
                                continue;
                            }
                            break block95;
                            break;
                        }
                    }
                    var47_42 = var35_35;
                }
                var16_16 = var4_4.size();
                var17_17 = 0;
                var44_40 /* !! */  = null;
                while (true) {
                    block96: {
                        var20_20 = var15_15.i;
                        var55_48 = var15_15.f;
                        var56_49 = var15_15.e;
                        var51_45 = 0xFFFFFFFFL;
                        if (var17_17 >= var16_16) break;
                        var57_50 = (gs1_0)var19_19.get(var17_17);
                        var31_31 = var57_50.getKey();
                        var27_27.j(var31_31);
                        var50_44 = var57_50.c();
                        var25_25 = null;
                        for (var24_24 = 0; var24_24 < var50_44; ++var24_24) {
                            block100: {
                                block101: {
                                    block102: {
                                        var58_51 = var16_16;
                                        var37_36 = var57_50.j(var24_24);
                                        var53_46 = var50_44;
                                        var50_44 = var37_36 instanceof ar1_1;
                                        if (var50_44 != 0) {
                                            var37_36 = (ar1_1)var37_36;
                                        } else {
                                            var16_16 = 0;
                                            var37_36 = null;
                                        }
                                        if (var37_36 == null) break block100;
                                        var37_36 = var57_50.getKey();
                                        var37_36 = (LazyLayoutItemAnimator$b)var26_26.b(var37_36);
                                        if (var22_22 != null) {
                                            var31_31 = var57_50.getKey();
                                            var50_44 = var22_22.b(var31_31);
lbl151:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var50_44 = -1;
                                        ** continue;
                                        var24_24 = -1;
                                        if (var50_44 == var24_24 && var22_22 != null) {
                                            var24_24 = 1;
                                        } else {
                                            var24_24 = 0;
                                            var25_25 = null;
                                        }
                                        if (var37_36 != null) break block101;
                                        var59_52 = var37_36 = new LazyLayoutItemAnimator$b(var15_15);
                                        var60_53 /* !! */  = (long[])var57_50;
                                        var61_54 = var13_13;
                                        var62_55 /* !! */  = (int[])var14_14;
                                        var63_56 = var12_12;
                                        LazyLayoutItemAnimator$b.b((LazyLayoutItemAnimator$b)var37_36, (gs1_0)var57_50, var13_13, var14_14, var11_11, var12_12);
                                        var20_20 = var57_50.getKey();
                                        var26_26.i(var20_20, var37_36);
                                        var64_57 = var57_50.getIndex();
                                        if (var64_57 == var50_44 || var50_44 == (var64_57 = -1)) break block102;
                                        if (var50_44 < var29_29) {
                                            var56_49.add(var57_50);
lbl175:
                                            // 4 sources

                                            while (true) {
                                                var65_58 = var29_29;
                                                var61_54 = var22_22;
                                                var66_59 = var47_42;
                                                var29_29 = 1;
                                                break block96;
                                                break;
                                            }
                                        }
                                        var55_48.add(var57_50);
                                        ** GOTO lbl175
                                    }
                                    var20_20 = null;
                                    var35_35 = var57_50.l(0);
                                    var64_57 = (int)var57_50.f();
                                    if (var64_57 != 0) {
                                        var45_41 = var35_35 & var51_45;
lbl190:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var64_57 = 32;
                                    var45_41 = var35_35 >> var64_57;
                                    ** continue;
                                    var21_21 = (int)var45_41;
                                    LazyLayoutItemAnimator.c((gs1_0)var57_50, var21_21, (LazyLayoutItemAnimator$b)var37_36);
                                    if (var24_24 == 0) ** GOTO lbl175
                                    var37_36 = var37_36.a;
                                    var64_57 = ((Object[])var37_36).length;
                                    var21_21 = 0;
                                    var55_48 = null;
                                    while (true) {
                                        if (var21_21 < var64_57) ** break;
                                        ** continue;
                                        var56_49 = var37_36[var21_21];
                                        if (var56_49 != null) {
                                            var56_49.a();
                                            var56_49 = Unit.a;
                                        }
                                        var23_23 = 1;
                                        var21_21 += var23_23;
                                    }
                                }
                                if (var32_32 != 0) {
                                    var59_52 = var37_36;
                                    var60_53 /* !! */  = (long[])var57_50;
                                    var61_54 = var13_13;
                                    var62_55 /* !! */  = (int[])var14_14;
                                    var63_56 = var12_12;
                                    LazyLayoutItemAnimator$b.b((LazyLayoutItemAnimator$b)var37_36, (gs1_0)var57_50, var13_13, var14_14, var11_11, var12_12);
                                    var55_48 = var37_36.a;
                                    var23_23 = ((Object[])var55_48).length;
                                    var31_31 = null;
                                    for (var50_44 = 0; var50_44 < var23_23; var50_44 += var18_18) {
                                        var65_58 = var29_29;
                                        var30_30 /* !! */  = (long[])var55_48[var50_44];
                                        if (var30_30 /* !! */  != null) {
                                            var66_59 = var30_30 /* !! */ .l;
                                            var61_54 = var22_22;
                                            var49_43 /* !! */  = var23_23;
                                            var68_60 = Gr1.s;
                                            var18_18 = (int)Si1.b(var66_59, var68_60);
                                            if (var18_18 == 0) {
                                                var66_59 = var30_30 /* !! */ .l;
                                                var68_60 = var47_42;
                                                var30_30 /* !! */ .l = var66_59 = Si1.d(var66_59, var47_42);
lbl236:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
lbl238:
                                            // 3 sources

                                            while (true) {
                                                var68_60 = var47_42;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var61_54 = var22_22;
                                        var49_43 /* !! */  = var23_23;
                                        ** continue;
                                        var18_18 = 1;
                                        var18_18 = var3_3;
                                        var19_19 = var4_4;
                                        var47_42 = var68_60;
                                        var23_23 = (int)var49_43 /* !! */ ;
                                        var29_29 = var65_58;
                                        var22_22 = var61_54;
                                    }
                                    var65_58 = var29_29;
                                    var61_54 = var22_22;
                                    var68_60 = var47_42;
                                    if (var24_24 != 0) {
                                        var37_36 = var37_36.a;
                                        var18_18 = ((Object[])var37_36).length;
                                        var19_19 = null;
                                        for (var70_61 = 0; var70_61 < var18_18; var70_61 += var29_29) {
                                            var55_48 = var37_36[var70_61];
                                            if (var55_48 != null) {
                                                var29_29 = (int)var55_48.b();
                                                if (var29_29 != 0) {
                                                    var20_20.remove(var55_48);
                                                    var30_30 /* !! */  = (long[])var15_15.j;
                                                    if (var30_30 /* !! */  != null) {
                                                        jt0_0.a((it0_0)var30_30 /* !! */ );
                                                        var30_30 /* !! */  = (long[])Unit.a;
                                                    }
                                                }
                                                var55_48.a();
                                            }
                                            var29_29 = 1;
                                        }
                                    }
                                    var29_29 = 1;
                                    var16_16 = 0;
                                    var37_36 = null;
                                    var15_15.g((gs1_0)var57_50, false);
                                    var66_59 = var68_60;
                                } else {
                                    var65_58 = var29_29;
                                    var61_54 = var22_22;
                                    var29_29 = 1;
                                    var66_59 = var47_42;
                                }
                                break block96;
                            }
                            var65_58 = var29_29;
                            var61_54 = var22_22;
                            var66_59 = var47_42;
                            var50_44 = var53_46;
                            var16_16 = var58_51;
                            var18_18 = var3_3;
                            var19_19 = var4_4;
                        }
                        var58_51 = var16_16;
                        var65_58 = var29_29;
                        var61_54 = var22_22;
                        var66_59 = var47_42;
                        var29_29 = 1;
                        var37_36 = var57_50.getKey();
                        var15_15.e(var37_36);
                    }
                    var17_17 += var29_29;
                    var47_42 = var66_59;
                    var29_29 = var65_58;
                    var22_22 = var61_54;
                    var16_16 = var58_51;
                    var18_18 = var3_3;
                    var19_19 = var4_4;
                }
                var16_16 = var9_9;
                var61_54 = var22_22;
                var29_29 = 1;
                var44_40 /* !! */  = new int[var9_9];
                var71_62 = null;
                for (var18_18 = 0; var18_18 < var16_16; var18_18 += var29_29) {
                    var70_61 = 0;
                    var19_19 = null;
                    var44_40 /* !! */ [var18_18] = 0;
                }
                if (var32_32 != 0 && var61_54 != null) {
                    var18_18 = var56_49.isEmpty() ^ var29_29;
                    if (var18_18 != 0) {
                        var18_18 = var56_49.size();
                        if (var18_18 > var29_29) {
                            var19_19 = var61_54;
                            var71_62 = new Nr1((d)var61_54);
                            bx_2.q((List)var56_49, (Comparator)var71_62);
                        } else {
                            var19_19 = var61_54;
                        }
                        var18_18 = var56_49.size();
                        var30_30 /* !! */  = null;
                        for (var29_29 = 0; var29_29 < var18_18; var29_29 += var72_63) {
                            var22_22 = (gs1_0)var56_49.get(var29_29);
                            var50_44 = LazyLayoutItemAnimator.h(var44_40 /* !! */ , (gs1_0)var22_22);
                            var50_44 = var11_11 - var50_44;
                            var25_25 = var22_22.getKey();
                            var25_25 = var26_26.b(var25_25);
                            Intrinsics.checkNotNull(var25_25);
                            var25_25 = (LazyLayoutItemAnimator$b)var25_25;
                            LazyLayoutItemAnimator.c((gs1_0)var22_22, var50_44, (LazyLayoutItemAnimator$b)var25_25);
                            var50_44 = 0;
                            var31_31 = null;
                            var15_15.g((gs1_0)var22_22, false);
                            var72_63 = 1;
                        }
                        var72_63 = 1;
                        var50_44 = 0;
                        var31_31 = null;
                        rp_1.p(var44_40 /* !! */ , 0);
                    } else {
                        var19_19 = var61_54;
                        var72_63 = 1;
                    }
                    var18_18 = var55_48.isEmpty() ^ var72_63;
                    if (var18_18 != 0) {
                        var18_18 = var55_48.size();
                        if (var18_18 > var72_63) {
                            var71_62 = new Lr1((d)var19_19);
                            bx_2.q((List)var55_48, (Comparator)var71_62);
                        }
                        var18_18 = var55_48.size();
                        var30_30 /* !! */  = null;
                        for (var29_29 = 0; var29_29 < var18_18; var29_29 += var72_63) {
                            var22_22 = (gs1_0)var55_48.get(var29_29);
                            var50_44 = LazyLayoutItemAnimator.h(var44_40 /* !! */ , (gs1_0)var22_22) + var12_12;
                            var24_24 = var22_22.i();
                            var25_25 = var22_22.getKey();
                            var25_25 = var26_26.b(var25_25);
                            Intrinsics.checkNotNull(var25_25);
                            var25_25 = (LazyLayoutItemAnimator$b)var25_25;
                            LazyLayoutItemAnimator.c((gs1_0)var22_22, var50_44 -= var24_24, (LazyLayoutItemAnimator$b)var25_25);
                            var50_44 = 0;
                            var31_31 = null;
                            var15_15.g((gs1_0)var22_22, false);
                            var72_63 = 1;
                        }
                        var50_44 = 0;
                        var31_31 = null;
                        rp_1.p(var44_40 /* !! */ , 0);
                    }
                } else {
                    var19_19 = var61_54;
                }
                var71_62 = var27_27.b;
                var30_30 /* !! */  = var27_27.a;
                var72_63 = var30_30 /* !! */ .length + -2;
                var31_31 = var15_15.h;
                var25_25 = var15_15.g;
                if (var72_63 < 0) break block103;
                var73_64 = var56_49;
                var74_65 = var31_31;
                var28_28 = 0;
                var57_50 = null;
                while (true) {
                    block110: {
                        block104: {
                            var35_35 = var30_30 /* !! */ [var28_28];
                            var59_52 = var55_48;
                            var60_53 /* !! */  = var30_30 /* !! */ ;
                            var75_66 = var35_35 ^ (long)-1;
                            var77_67 = 7;
                            cfr_temp_2 = (var75_66 = var75_66 << var77_67 & var35_35 & var42_39) - var42_39;
                            var78_68 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                            if (var78_68 /* !! */  == false) break block104;
                            var21_21 = ~(var28_28 - var72_63) >>> 31;
                            var21_21 = 8 - var21_21;
                            var30_30 /* !! */  = null;
                            for (var29_29 = 0; var29_29 < var21_21; var29_29 += var18_18) {
                                block107: {
                                    block105: {
                                        var79_69 = var35_35 & var40_38;
                                        cfr_temp_3 = var79_69 - var38_37;
                                        var63_56 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                        if (var63_56 >= 0) ** GOTO lbl587
                                        var78_68 /* !! */  = (var28_28 << 3) + var29_29;
                                        var81_70 = var27_27;
                                        var27_27 = var71_62[var78_68 /* !! */ ];
                                        var62_55 /* !! */  = (int[])var26_26.b(var27_27);
                                        Intrinsics.checkNotNull(var62_55 /* !! */ );
                                        var82_71 /* !! */  = var71_62;
                                        var71_62 = var62_55 /* !! */ ;
                                        var71_62 = (LazyLayoutItemAnimator$b)var62_55 /* !! */ ;
                                        var62_55 /* !! */  = var44_40 /* !! */ ;
                                        var1_1 = var32_32;
                                        var83_72 = var34_34;
                                        var33_33 /* !! */  = var5_5;
                                        var17_17 = var5_5.b(var27_27);
                                        var84_73 = var26_26;
                                        var85_74 = var71_62.e;
                                        var71_62.e = var85_74 = Math.min(var16_16, var85_74);
                                        var85_74 = var16_16 - var85_74;
                                        var16_16 = var71_62.d;
                                        var71_62.d = var16_16 = Math.min(var85_74, var16_16);
                                        var16_16 = -1;
                                        if (var17_17 != var16_16) break block105;
                                        var44_40 /* !! */  = (int[])var71_62.a;
                                        var85_74 = var44_40 /* !! */ .length;
                                        var37_36 = null;
                                        var58_51 = 0;
                                        var86_75 = 0;
                                        for (var16_16 = 0; var16_16 < var85_74; var16_16 += var17_17) {
                                            block97: {
                                                block98: {
                                                    block106: {
                                                        var87_76 = var85_74;
                                                        var26_26 = var44_40 /* !! */ [var16_16];
                                                        var88_77 = var86_75 + 1;
                                                        if (var26_26 == null) break block106;
                                                        var89_78 = var26_26.b();
                                                        if (var89_78 != 0) {
                                                            var90_79 /* !! */  = var44_40 /* !! */ ;
                                                            var91_80 = var72_63;
                                                            var92_81 = var28_28;
                                                            var17_17 = 1;
                                                            var32_32 = 0;
                                                            var34_34 = 0.0f;
                                                            var33_33 /* !! */  = null;
                                                            var28_28 = 3;
lbl447:
                                                            // 2 sources

                                                            while (true) {
                                                                var58_51 = 1;
                                                                break block97;
                                                                break;
                                                            }
                                                        }
                                                        var90_79 /* !! */  = var44_40 /* !! */ ;
                                                        var44_40 /* !! */  = (int[])((Boolean)var26_26.k.getValue());
                                                        var17_17 = (int)var44_40 /* !! */ .booleanValue();
                                                        if (var17_17 != 0) {
                                                            var26_26.c();
                                                            var71_62.a[var86_75] = null;
                                                            var20_20.remove(var26_26);
                                                            var44_40 /* !! */  = (int[])var15_15.j;
                                                            if (var44_40 /* !! */  != null) {
                                                                jt0_0.a((it0_0)var44_40 /* !! */ );
                                                                var44_40 /* !! */  = (int[])Unit.a;
                                                            }
lbl462:
                                                            // 4 sources

                                                            while (true) {
                                                                var91_80 = var72_63;
                                                                var92_81 = var28_28;
                                                                var32_32 = 0;
                                                                var34_34 = 0.0f;
                                                                var33_33 /* !! */  = null;
                                                                var28_28 = 3;
                                                                break block98;
                                                                break;
                                                            }
                                                        }
                                                        var44_40 /* !! */  = (int[])var26_26.n;
                                                        if (var44_40 /* !! */  == null) ** GOTO lbl-1000
                                                        var33_33 /* !! */  = var26_26.f;
                                                        var93_82 = var26_26.b();
                                                        if (var93_82 == 0 && var33_33 /* !! */  != null) {
                                                            var32_32 = 1;
                                                            var34_34 = 1.4E-45f;
                                                            var26_26.e((boolean)var32_32);
                                                            var91_80 = var72_63;
                                                            var72_63 = 0;
                                                            var22_22 = null;
                                                            var33_33 /* !! */  = new hr1_1((Gr1)var26_26, (W01)var44_40 /* !! */ , null);
                                                            var44_40 /* !! */  = (int[])var26_26.a;
                                                            var92_81 = var28_28;
                                                            var28_28 = 3;
                                                            Ae3.d((i90_0)var44_40 /* !! */ , null, null, (Function2)var33_33 /* !! */ , var28_28);
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var91_80 = var72_63;
                                                            var92_81 = var28_28;
                                                            var28_28 = 3;
                                                        }
                                                        var17_17 = (int)var26_26.b();
                                                        if (var17_17 != 0) {
                                                            var20_20.add(var26_26);
                                                            var44_40 /* !! */  = (int[])var15_15.j;
                                                            if (var44_40 /* !! */  != null) {
                                                                jt0_0.a((it0_0)var44_40 /* !! */ );
                                                                var44_40 /* !! */  = (int[])Unit.a;
                                                            }
                                                            var17_17 = 1;
                                                            var32_32 = 0;
                                                            var34_34 = 0.0f;
                                                            var33_33 /* !! */  = null;
                                                            ** continue;
                                                        }
                                                        var26_26.c();
                                                        var44_40 /* !! */  = (int[])var71_62.a;
                                                        var32_32 = 0;
                                                        var34_34 = 0.0f;
                                                        var33_33 /* !! */  = null;
                                                        var44_40 /* !! */ [var86_75] = (int)null;
                                                        break block98;
                                                    }
                                                    var90_79 /* !! */  = var44_40 /* !! */ ;
                                                    ** continue;
                                                }
                                                var17_17 = 1;
                                            }
                                            var33_33 /* !! */  = var5_5;
                                            var85_74 = var87_76;
                                            var86_75 = var88_77;
                                            var44_40 /* !! */  = var90_79 /* !! */ ;
                                            var72_63 = var91_80;
                                            var28_28 = var92_81;
                                        }
                                        var91_80 = var72_63;
                                        var92_81 = var28_28;
                                        var32_32 = 0;
                                        var34_34 = 0.0f;
                                        var33_33 /* !! */  = null;
                                        var28_28 = 3;
                                        if (var58_51 == 0) {
                                            var15_15.e(var27_27);
                                        }
                                        var94_83 = var20_20;
                                        break block107;
                                    }
                                    var91_80 = var72_63;
                                    var92_81 = var28_28;
                                    var32_32 = 0;
                                    var34_34 = 0.0f;
                                    var28_28 = 3;
                                    var37_36 = var71_62.b;
                                    Intrinsics.checkNotNull(var37_36);
                                    var95_84 = var37_36.a;
                                    var16_16 = var71_62.d;
                                    var85_74 = var71_62.e;
                                    var86_75 = var17_17;
                                    var87_76 = var16_16;
                                    var88_77 = var85_74;
                                    var37_36 = var6_6.a(var17_17, var16_16, var85_74, var95_84);
                                    var37_36.k();
                                    var33_33 /* !! */  = var71_62.a;
                                    var72_63 = var33_33 /* !! */ .length;
                                    var26_26 = null;
                                    for (var85_74 = 0; var85_74 < var72_63; var85_74 += var64_57) {
                                        block109: {
                                            block108: {
                                                var57_50 = var33_33 /* !! */ [var85_74];
                                                if (var57_50 == null) break block108;
                                                var57_50 = (Boolean)var57_50.h.getValue();
                                                var28_28 = (int)var57_50.booleanValue();
                                                var94_83 = var20_20;
                                                var64_57 = 1;
                                                if (var28_28 != var64_57) break block109;
                                                ** GOTO lbl-1000
                                            }
                                            var94_83 = var20_20;
                                            var64_57 = 1;
                                        }
                                        var20_20 = var94_83;
                                        var28_28 = 3;
                                    }
                                    var94_83 = var20_20;
                                    if (var19_19 != null && var17_17 == (var64_57 = var19_19.b(var27_27))) {
                                        var15_15.e(var27_27);
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var64_57 = var71_62.c;
                                        var89_78 = var11_11;
                                        var93_82 = var12_12;
                                        var71_62.a((gs1_0)var37_36, var13_13, var14_14, var11_11, var12_12, var64_57);
                                        var18_18 = var15_15.c;
                                        if (var17_17 < var18_18) {
                                            var25_25.add(var37_36);
                                        } else {
                                            var44_40 /* !! */  = (int[])var74_65;
                                            var74_65.add(var37_36);
lbl585:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl587:
                                            // 1 sources

                                            var62_55 /* !! */  = var44_40 /* !! */ ;
                                            var82_71 /* !! */  = var71_62;
                                            var94_83 = var20_20;
                                            var1_1 = var32_32;
                                            var83_72 = var34_34;
                                            var91_80 = var72_63;
                                            var84_73 = var26_26;
                                            var92_81 = var28_28;
                                            var81_70 = var27_27;
                                        }
                                    }
                                }
                                var44_40 /* !! */  = (int[])var74_65;
                                ** continue;
                                var16_16 = 8;
                                var35_35 >>= var16_16;
                                var18_18 = 1;
                                var32_32 = var1_1;
                                var34_34 = var83_72;
                                var16_16 = var9_9;
                                var74_65 = var44_40 /* !! */ ;
                                var44_40 /* !! */  = var62_55 /* !! */ ;
                                var27_27 = var81_70;
                                var71_62 = var82_71 /* !! */ ;
                                var26_26 = var84_73;
                                var72_63 = var91_80;
                                var28_28 = var92_81;
                                var20_20 = var94_83;
                            }
                            var62_55 /* !! */  = var44_40 /* !! */ ;
                            var82_71 /* !! */  = var71_62;
                            var94_83 = var20_20;
                            var1_1 = var32_32;
                            var83_72 = var34_34;
                            var91_80 = var72_63;
                            var84_73 = var26_26;
                            var92_81 = var28_28;
                            var81_70 = var27_27;
                            var44_40 /* !! */  = var74_65;
                            var16_16 = 8;
                            var18_18 = 1;
                            if (var21_21 != var16_16) break block99;
                            var64_57 = var28_28;
                            break block110;
                        }
                        var62_55 /* !! */  = var44_40 /* !! */ ;
                        var82_71 /* !! */  = var71_62;
                        var94_83 = var20_20;
                        var1_1 = var32_32;
                        var83_72 = var34_34;
                        var84_73 = var26_26;
                        var81_70 = var27_27;
                        var44_40 /* !! */  = var74_65;
                        var16_16 = 8;
                        var18_18 = 1;
                        var64_57 = var28_28;
                    }
                    if (var64_57 != var72_63) {
                        var28_28 = var64_57 + 1;
                        var32_32 = var1_1;
                        var34_34 = var83_72;
                        var16_16 = var9_9;
                        var74_65 = var44_40 /* !! */ ;
                        var55_48 = var59_52;
                        var30_30 /* !! */  = var60_53 /* !! */ ;
                        var44_40 /* !! */  = var62_55 /* !! */ ;
                        var27_27 = var81_70;
                        var71_62 = var82_71 /* !! */ ;
                        var26_26 = var84_73;
                        var20_20 = var94_83;
                        continue;
                    }
                    break block99;
                    break;
                }
            }
            var62_55 /* !! */  = var44_40 /* !! */ ;
            var59_52 = var55_48;
            var1_1 = var32_32;
            var83_72 = var34_34;
            var73_64 = var56_49;
            var44_40 /* !! */  = (int[])var31_31;
            var84_73 = var26_26;
            var81_70 = var27_27;
            var18_18 = 1;
        }
        if ((var16_16 = var25_25.isEmpty() ^ var18_18) != 0) {
            var16_16 = var25_25.size();
            if (var16_16 > var18_18) {
                var71_62 = var5_5;
                var37_36 = new or1_0(var5_5);
                bx_2.q((List)var25_25, (Comparator)var37_36);
            } else {
                var71_62 = var5_5;
            }
            var16_16 = var25_25.size();
            var19_19 = null;
            for (var70_61 = 0; var70_61 < var16_16; var70_61 += var21_21) {
                var20_20 = (gs1_0)var25_25.get(var70_61);
                var55_48 = var20_20.getKey();
                var30_30 /* !! */  = (long[])var84_73;
                var55_48 = var84_73.b(var55_48);
                Intrinsics.checkNotNull(var55_48);
                var55_48 = (LazyLayoutItemAnimator$b)var55_48;
                var33_33 /* !! */  = (Gr1[])var62_55 /* !! */ ;
                var72_63 = LazyLayoutItemAnimator.h(var62_55 /* !! */ , (gs1_0)var20_20);
                if (var8_8) {
                    var56_49 = (gs1_0)CollectionsKt.L(var4_4);
                    var50_44 = 0;
                    var31_31 = null;
                    var97_85 = var56_49.l(0);
                    var23_23 = (int)var56_49.f();
                    if (var23_23 != 0) {
                        var35_35 = var97_85 & var51_45;
                        var50_44 = (int)var35_35;
                    } else {
                        var23_23 = 32;
                        var50_44 = (int)(var97_85 >>= var23_23);
                    }
                } else {
                    var50_44 = var55_48.f;
                }
                var50_44 -= var72_63;
                var21_21 = var55_48.c;
                var72_63 = var2_2;
                var23_23 = var3_3;
                var20_20.h(var50_44, var21_21, var2_2, var3_3);
                var21_21 = 1;
                if (var1_1 != 0) {
                    var15_15.g((gs1_0)var20_20, (boolean)var21_21);
                }
                var84_73 = var30_30 /* !! */ ;
                var62_55 /* !! */  = (int[])var33_33 /* !! */ ;
            }
            var72_63 = var2_2;
            var23_23 = var3_3;
            var33_33 /* !! */  = (Gr1[])var62_55 /* !! */ ;
            var30_30 /* !! */  = (long[])var84_73;
            var70_61 = 0;
            var19_19 = null;
            var21_21 = 1;
            rp_1.p(var62_55 /* !! */ , 0);
        } else {
            var72_63 = var2_2;
            var23_23 = var3_3;
            var71_62 = var5_5;
            var33_33 /* !! */  = (Gr1[])var62_55 /* !! */ ;
            var30_30 /* !! */  = (long[])var84_73;
            var21_21 = 1;
        }
        var16_16 = var44_40 /* !! */ .isEmpty() ^ var21_21;
        if (var16_16 != 0) {
            var16_16 = var44_40 /* !! */ .size();
            if (var16_16 > var21_21) {
                var37_36 = new mr1_0((d)var71_62);
                bx_2.q((List)var44_40 /* !! */ , (Comparator)var37_36);
            }
            var16_16 = var44_40 /* !! */ .size();
            var71_62 = null;
            for (var18_18 = 0; var18_18 < var16_16; var18_18 += var64_57) {
                var19_19 = (gs1_0)var44_40 /* !! */ .get(var18_18);
                var20_20 = var19_19.getKey();
                var20_20 = var30_30 /* !! */ .b(var20_20);
                Intrinsics.checkNotNull(var20_20);
                var20_20 = (LazyLayoutItemAnimator$b)var20_20;
                var21_21 = LazyLayoutItemAnimator.h((int[])var33_33 /* !! */ , (gs1_0)var19_19);
                if (var8_8) {
                    var31_31 = (gs1_0)CollectionsKt.S(var4_4);
                    var85_74 = 0;
                    var26_26 = null;
                    var99_86 = var31_31.l(0);
                    var50_44 = (int)var31_31.f();
                    if (var50_44 != 0) {
                        var97_85 = var99_86 & var51_45;
                        var28_28 = (int)var97_85;
                        var50_44 = 32;
                    } else {
                        var50_44 = 32;
                        var97_85 = var99_86 >> var50_44;
                        var28_28 = (int)var97_85;
                    }
                } else {
                    var50_44 = 32;
                    var85_74 = var20_20.g;
                    var28_28 = var19_19.i();
                    var28_28 = var85_74 - var28_28;
                }
                var64_57 = var20_20.c;
                var19_19.h(var28_28 += var21_21, var64_57, var72_63, var23_23);
                var64_57 = 1;
                if (var1_1 == 0) continue;
                var15_15.g((gs1_0)var19_19, (boolean)var64_57);
            }
        }
        Intrinsics.checkNotNullParameter(var25_25, "<this>");
        Collections.reverse(var25_25);
        var37_36 = Unit.a;
        var37_36 = var4_4;
        var4_4.addAll(0, var25_25);
        var4_4.addAll(var44_40 /* !! */ );
        var73_64.clear();
        var59_52.clear();
        var25_25.clear();
        var44_40 /* !! */ .clear();
        var81_70.e();
    }

    public final void e(Object gr1Array) {
        nr1_1 nr1_12 = this.a;
        if ((gr1Array = (LazyLayoutItemAnimator$b)nr1_12.g(gr1Array)) != null && (gr1Array = gr1Array.a) != null) {
            for (Gr1 gr1 : gr1Array) {
                if (gr1 == null) continue;
                gr1.c();
            }
        }
    }

    public final void f() {
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this;
        Object object = this.a;
        int n3 = ((dt2_0)object).e;
        if (n3 != 0) {
            Object[] objectArray = ((dt2_0)object).c;
            long[] lArray = ((dt2_0)object).a;
            int n4 = lArray.length + -2;
            if (n4 >= 0) {
                int n7 = 0;
                while (true) {
                    long l2 = lArray[n7];
                    long l3 = l2 ^ (long)-1;
                    int n8 = 7;
                    l3 = l3 << n8 & l2;
                    long l4 = -9187201950435737472L;
                    long l7 = (l3 &= l4) - l4;
                    Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object2 != false) {
                        int n10 = ~(n7 - n4) >>> 31;
                        int n14 = 8;
                        n10 = 8 - n10;
                        for (n8 = 0; n8 < n10; ++n8) {
                            long l8 = 0xFFL & l2;
                            long l12 = 128L;
                            long l14 = l8 - l12;
                            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object3 < 0) {
                                int n15 = (n7 << 3) + n8;
                                for (Gr1 gr1 : ((LazyLayoutItemAnimator$b)objectArray[n15]).a) {
                                    if (gr1 == null) continue;
                                    gr1.c();
                                }
                            }
                            l2 >>= n14;
                        }
                        if (n10 != n14) break;
                    }
                    if (n7 == n4) break;
                    ++n7;
                }
            }
            ((nr1_1)object).c();
        }
        lazyLayoutItemAnimator.b = object = d$a.a;
        lazyLayoutItemAnimator.c = -1;
    }

    public final void g(gs1_0 gs1_02, boolean bl2) {
        Gr1[] gr1Array = gs1_02.getKey();
        nr1_1 nr1_12 = this.a;
        gr1Array = nr1_12.b(gr1Array);
        Intrinsics.checkNotNull(gr1Array);
        gr1Array = ((LazyLayoutItemAnimator$b)gr1Array).a;
        int n3 = gr1Array.length;
        boolean bl3 = false;
        Object object = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Gr1 gr1 = gr1Array[i3];
            boolean bl4 = bl3 + 1;
            if (gr1 != null) {
                long l2 = gs1_02.l((int)(bl3 ? 1 : 0));
                long l3 = gr1.l;
                long l4 = Gr1.s;
                bl3 = Si1.b(l3, l4);
                if (!bl3 && !(bl3 = (boolean)Si1.b(l3, l2))) {
                    l3 = Si1.c(l2, l3);
                    object = gr1.e;
                    if (object != null) {
                        l4 = ((Si1)gr1.q.getValue()).a;
                        l3 = Si1.c(l4, l3);
                        gr1.g(l3);
                        bl3 = true;
                        gr1.f(bl3);
                        gr1.g = bl2;
                        object = new ir1_2(gr1, l3, null);
                        i90_0 i90_02 = gr1.a;
                        int n4 = 3;
                        Ae3.d(i90_02, null, null, (Function2)object, n4);
                    }
                }
                gr1.l = l2;
            }
            bl3 = bl4;
        }
    }
}

