/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bl;
import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cf;
import com.google.android.play.core.assetpacks.co;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.do;
import com.google.android.play.core.assetpacks.dp;
import com.google.android.play.core.assetpacks.dq;
import com.google.android.play.core.assetpacks.dr;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.dv;
import com.google.android.play.core.assetpacks.ei;
import com.google.android.play.core.assetpacks.el;
import com.google.android.play.core.assetpacks.ev;
import com.google.android.play.core.assetpacks.ey;
import com.google.android.play.core.assetpacks.fd;
import com.google.android.play.core.assetpacks.fg;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.IOException;
import java.util.ArrayList;

final class dw {
    private static final o a;
    private final dt b;
    private final bm c;
    private final cf d;

    static {
        o o3;
        a = o3 = new o("ExtractorTaskFinder");
    }

    public dw(dt dt2, bm bm3, cf cf2) {
        this.b = dt2;
        this.c = bm3;
        this.d = cf2;
    }

    private final boolean b(dq dq2, dr dr2) {
        fd fd2;
        Object object = dq2.c;
        String string2 = ((dp)object).a;
        long l2 = ((dp)object).b;
        int n3 = dq2.b;
        String string3 = dr2.a;
        bm bm3 = this.c;
        object = fd2;
        fd2 = new fd(bm3, string2, n3, l2, string3);
        return fd2.m();
    }

    private static boolean c(dr dr2) {
        int n3;
        int n4 = dr2.f;
        int n7 = 1;
        if (n4 != n7 && n4 != (n3 = 2)) {
            return false;
        }
        return n7 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dv a() {
        block25: {
            block26: {
                block30: {
                    block29: {
                        block28: {
                            block27: {
                                var1_1 = this;
                                var2_2 = 3;
                                var3_3 = 2;
                                var4_4 = 1;
                                var5_5 = 0;
                                var6_6 = null;
                                try {
                                    var7_7 = this.b;
                                    var7_7.j();
                                    var8_11 = new ArrayList();
                                    var7_7 = this.b;
                                    var7_7 = var7_7.i();
                                    var7_7 = var7_7.values();
                                    var7_7 = var7_7.iterator();
                                    while ((var9_12 = var7_7.hasNext()) != 0) {
                                        var10_13 = var7_7.next();
                                        var10_13 = (dq)var10_13;
                                        var11_14 = var10_13.c;
                                        var12_15 = var11_14.d;
                                        if ((var12_15 = (int)bl.b(var12_15)) == 0) continue;
                                        var8_11.add(var10_13);
                                    }
                                }
                                catch (Throwable var7_8) {
                                    break block25;
                                }
                                var13_16 = var8_11.isEmpty();
                                if (var13_16 != 0) {
                                    while (true) {
                                        var9_12 = 0;
                                        var10_13 = null;
                                        break block26;
                                        break;
                                    }
                                }
                                var7_7 = var1_1.c;
                                var7_7 = var7_7.t();
                                var11_14 = var8_11.iterator();
                                while ((var14_17 = var11_14.hasNext()) != 0) {
                                    var15_18 = var11_14.next();
                                    var15_18 = (dq)var15_18;
                                    var16_19 /* !! */  = var15_18.c;
                                    var16_19 /* !! */  = var16_19 /* !! */ .a;
                                    var16_19 /* !! */  = var7_7.get(var16_19 /* !! */ );
                                    if ((var16_19 /* !! */  = (Long)var16_19 /* !! */ ) == null) continue;
                                    var17_20 = var15_18.c;
                                    var18_21 = var17_20.b;
                                    var20_22 = var16_19 /* !! */ .longValue();
                                    cfr_temp_0 = var18_21 - var20_22;
                                    var22_23 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var22_23 /* !! */  != false) continue;
                                    var7_7 = dw.a;
                                    var11_14 = "Found promote pack task for session %s with pack %s.";
                                    var22_23 /* !! */  = var15_18.a;
                                    var16_19 /* !! */  = (int)var22_23 /* !! */ ;
                                    var17_20 = var15_18.c;
                                    var17_20 = var17_20.a;
                                    var23_24 /* !! */  = new Object[var3_3];
                                    var23_24 /* !! */ [0] = var16_19 /* !! */ ;
                                    var23_24 /* !! */ [var4_4] = var17_20;
                                    var7_7.a((String)var11_14, var23_24 /* !! */ );
                                    var24_25 = var15_18.a;
                                    var11_14 = var15_18.c;
                                    var11_14 = var11_14.a;
                                    var16_19 /* !! */  = var1_1.c;
                                    var25_26 = var16_19 /* !! */ .a((String)var11_14);
                                    var22_23 /* !! */  = var15_18.b;
                                    var15_18 = var15_18.c;
                                    var18_21 = var15_18.b;
                                    var26_27 = var7_7;
                                    var7_7 = new ey(var24_25, (String)var11_14, var25_26, (int)var22_23 /* !! */ , var18_21);
                                    break block27;
                                }
                                var13_16 = 0;
                                var7_7 = null;
                            }
                            if (var7_7 != null) ** GOTO lbl-1000
                            var7_7 = var8_11.iterator();
                            while ((var12_15 = (int)var7_7.hasNext()) != 0) {
                                var11_14 = var7_7.next();
                                var11_14 = (dq)var11_14;
                                try {
                                    var15_18 = var1_1.c;
                                    var16_19 /* !! */  = var11_14.c;
                                    var17_20 = var16_19 /* !! */ .a;
                                    var27_28 = var11_14.b;
                                    var20_22 = var16_19 /* !! */ .b;
                                    var14_17 = var15_18.b((String)var17_20, var27_28, var20_22);
                                    var16_19 /* !! */  = var11_14.c;
                                    var16_19 /* !! */  = var16_19 /* !! */ .f;
                                    var22_23 /* !! */  = var16_19 /* !! */ .size();
                                    if (var14_17 != var22_23 /* !! */ ) continue;
                                    var7_7 = dw.a;
                                    var15_18 = "Found final move task for session %s with pack %s.";
                                }
                                catch (IOException var7_9) {
                                    var2_2 = var11_14.a;
                                    var29_31 = var11_14.c;
                                    var29_31 = var29_31.a;
                                    var30_33 = new StringBuilder();
                                    var6_6 = "Failed to check number of completed merges for session ";
                                    var30_33.append((String)var6_6);
                                    var30_33.append(var2_2);
                                    var31_35 = ", pack ";
                                    var30_33.append(var31_35);
                                    var30_33.append((String)var29_31);
                                    var31_35 = var30_33.toString();
                                    var3_3 = var11_14.a;
                                    var28_29 = new cz(var31_35, var7_9, var3_3);
                                    throw var28_29;
                                }
                                var22_23 /* !! */  = var11_14.a;
                                var16_19 /* !! */  = (int)var22_23 /* !! */ ;
                                var17_20 = var11_14.c;
                                var17_20 = var17_20.a;
                                var23_24 /* !! */  = new Object[var3_3];
                                var23_24 /* !! */ [0] = var16_19 /* !! */ ;
                                var23_24 /* !! */ [var4_4] = var17_20;
                                var7_7.a((String)var15_18, var23_24 /* !! */ );
                                var24_25 = var11_14.a;
                                var15_18 = var11_14.c;
                                var16_19 /* !! */  = var15_18.a;
                                var12_15 = var11_14.b;
                                var18_21 = var15_18.b;
                                var15_18 = var15_18.c;
                                var26_27 = var7_7;
                                var25_26 = var12_15;
                                var7_7 = new el(var24_25, (String)var16_19 /* !! */ , var12_15, var18_21, (String)var15_18);
                                break block28;
                            }
                            var13_16 = 0;
                            var7_7 = null;
                        }
                        if (var7_7 != null) ** GOTO lbl-1000
                        var7_7 = var8_11.iterator();
                        while ((var12_15 = (int)var7_7.hasNext()) != 0) {
                            var11_14 = var7_7.next();
                            var11_14 = (dq)var11_14;
                            var15_18 = var11_14.c;
                            var22_23 /* !! */  = var15_18.d;
                            if ((var22_23 /* !! */  = (long)bl.b((int)var22_23 /* !! */ )) == false) continue;
                            var15_18 = var15_18.f;
                            var15_18 = var15_18.iterator();
                            while ((var22_23 /* !! */  = (long)var15_18.hasNext()) != false) {
                                var16_19 /* !! */  = var15_18.next();
                                var16_19 /* !! */  = (dr)var16_19 /* !! */ ;
                                var17_20 = var1_1.c;
                                var23_24 /* !! */  = var11_14.c;
                                var26_27 = var23_24 /* !! */ .a;
                                var24_25 = var11_14.b;
                                var32_37 = var23_24 /* !! */ .b;
                                var34_38 = var16_19 /* !! */ .a;
                                var23_24 /* !! */  = var26_27;
                                var35_39 = var24_25;
                                var29_32 /* !! */  = var17_20.q((String)var26_27, var24_25, var32_37, var34_38);
                                var3_3 = (int)var29_32 /* !! */ .exists();
                                if (var3_3 != 0) {
                                    var7_7 = dw.a;
                                    var29_32 /* !! */  = "Found merge task for session %s with pack %s and slice %s.";
                                    var4_4 = var11_14.a;
                                    var30_34 = var4_4;
                                    var15_18 = var11_14.c;
                                    var15_18 = var15_18.a;
                                    var17_20 = var16_19 /* !! */ .a;
                                    var23_24 /* !! */  = new Object[var2_2];
                                    var23_24 /* !! */ [0] = var30_34;
                                    var4_4 = 1;
                                    var23_24 /* !! */ [var4_4] = var15_18;
                                    var4_4 = 2;
                                    var23_24 /* !! */ [var4_4] = var17_20;
                                    var7_7.a((String)var29_32 /* !! */ , var23_24 /* !! */ );
                                    var3_3 = var11_14.a;
                                    var30_34 = var11_14.c;
                                    var15_18 = var30_34.a;
                                    var12_15 = var11_14.b;
                                    var18_21 = var30_34.b;
                                    var30_34 = var16_19 /* !! */ .a;
                                    var7_7 = new ei(var3_3, (String)var15_18, var12_15, var18_21, (String)var30_34);
                                    break block29;
                                }
                                var3_3 = 2;
                                var4_4 = 1;
                            }
                        }
                        var13_16 = 0;
                        var7_7 = null;
                    }
                    if (var7_7 != null) ** GOTO lbl-1000
                    var7_7 = var8_11.iterator();
                    while ((var3_3 = (int)var7_7.hasNext()) != 0) {
                        var29_32 /* !! */  = var7_7.next();
                        var29_32 /* !! */  = (dq)var29_32 /* !! */ ;
                        var30_34 = var29_32 /* !! */ .c;
                        var12_15 = var30_34.d;
                        if ((var12_15 = (int)bl.b(var12_15)) == 0) continue;
                        var30_34 = var30_34.f;
                        var30_34 = var30_34.iterator();
                        while ((var12_15 = (int)var30_34.hasNext()) != 0) {
                            var11_14 = var30_34.next();
                            var14_17 = (int)var1_1.b((dq)var29_32 /* !! */ , (dr)(var11_14 = (dr)var11_14));
                            if (var14_17 == 0) continue;
                            var16_19 /* !! */  = var1_1.c;
                            var15_18 = var29_32 /* !! */ .c;
                            var17_20 = var15_18.a;
                            var27_28 = var29_32 /* !! */ .b;
                            var20_22 = var15_18.b;
                            var15_18 = var11_14.a;
                            var14_17 = (int)(var15_18 = var16_19 /* !! */ .p((String)var17_20, var27_28, var20_22, (String)var15_18)).exists();
                            if (var14_17 == 0) continue;
                            var7_7 = dw.a;
                            var30_34 = "Found verify task for session %s with pack %s and slice %s.";
                            var14_17 = var29_32 /* !! */ .a;
                            var15_18 = var14_17;
                            var16_19 /* !! */  = var29_32 /* !! */ .c;
                            var16_19 /* !! */  = var16_19 /* !! */ .a;
                            var17_20 = var11_14.a;
                            var23_24 /* !! */  = new Object[var2_2];
                            var23_24 /* !! */ [0] = var15_18;
                            var14_17 = 1;
                            var23_24 /* !! */ [var14_17] = var16_19 /* !! */ ;
                            var14_17 = 2;
                            var23_24 /* !! */ [var14_17] = var17_20;
                            var7_7.a((String)var30_34, var23_24 /* !! */ );
                            var4_4 = var29_32 /* !! */ .a;
                            var15_18 = var29_32 /* !! */ .c;
                            var16_19 /* !! */  = var15_18.a;
                            var3_3 = var29_32 /* !! */ .b;
                            var18_21 = var15_18.b;
                            var15_18 = var11_14.a;
                            var26_27 = var11_14.b;
                            var36_40 = var11_14.c;
                            var7_7 = new fg(var4_4, (String)var16_19 /* !! */ , var3_3, var18_21, (String)var15_18, (String)var26_27, var36_40);
                            break block30;
                        }
                    }
                    var13_16 = 0;
                    var7_7 = null;
                }
                if (var7_7 == null) {
                    block31: {
                        var29_32 /* !! */  = var8_11.iterator();
                        while ((var13_16 = var29_32 /* !! */ .hasNext()) != 0) {
                            var30_34 = var7_7 = var29_32 /* !! */ .next();
                            var30_34 = (dq)var7_7;
                            var7_7 = var30_34.c;
                            var9_12 = var7_7.d;
                            if ((var9_12 = (int)bl.b(var9_12)) == 0) continue;
                            var7_7 = var7_7.f;
                            var10_13 = var7_7.iterator();
                            while ((var13_16 = var10_13.hasNext()) != 0) {
                                var11_14 = var7_7 = var10_13.next();
                                var11_14 = (dr)var7_7;
                                var13_16 = dw.c((dr)var11_14);
                                if (var13_16 != 0) continue;
                                var15_18 = var1_1.c;
                                var16_19 /* !! */  = var30_34.c;
                                var17_20 = var16_19 /* !! */ .a;
                                var27_28 = var30_34.b;
                                var38_41 = var16_19 /* !! */ .b;
                                var16_19 /* !! */  = var11_14.a;
                                var7_7 = new fd((bm)var15_18, (String)var17_20, var27_28, var38_41, (String)var16_19 /* !! */ );
                                try {
                                    var13_16 = var7_7.a();
                                }
                                catch (IOException var7_10) {
                                    var28_30 = var7_10;
                                    var7_7 = dw.a;
                                    var31_36 = "Slice checkpoint corrupt, restarting extraction. %s";
                                    var14_17 = 1;
                                    var16_19 /* !! */  = new Object[var14_17];
                                    var16_19 /* !! */ [0] = var28_30;
                                    var7_7.b((String)var31_36, var16_19 /* !! */ );
                                    var13_16 = 0;
                                    var7_7 = null;
                                }
                                var40_42 = -1;
                                if (var13_16 != var40_42) {
                                    var28_30 = var11_14.d;
                                    var28_30 = var28_30.get(var13_16);
                                    var28_30 = (do)var28_30;
                                    var40_42 = (int)var28_30.a;
                                    if (var40_42 != 0) {
                                        var28_30 = dw.a;
                                        var31_36 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.";
                                        var3_3 = var11_14.e;
                                        var29_32 /* !! */  = var3_3;
                                        var9_12 = var30_34.a;
                                        var10_13 = var9_12;
                                        var15_18 = var30_34.c;
                                        var15_18 = var15_18.a;
                                        var16_19 /* !! */  = var11_14.a;
                                        var17_20 = var13_16;
                                        var27_28 = 5;
                                        var23_24 /* !! */  = new Object[var27_28];
                                        var23_24 /* !! */ [0] = var29_32 /* !! */ ;
                                        var3_3 = 1;
                                        var23_24 /* !! */ [var3_3] = var10_13;
                                        var3_3 = 2;
                                        var23_24 /* !! */ [var3_3] = var15_18;
                                        var3_3 = 3;
                                        var23_24 /* !! */ [var3_3] = var16_19 /* !! */ ;
                                        var3_3 = 4;
                                        var23_24 /* !! */ [var3_3] = var17_20;
                                        var28_30.a((String)var31_36, var23_24 /* !! */ );
                                        var28_30 = var1_1.d;
                                        var2_2 = var30_34.a;
                                        var29_32 /* !! */  = var30_34.c;
                                        var29_32 /* !! */  = var29_32 /* !! */ .a;
                                        var10_13 = var11_14.a;
                                        var41_43 = var28_30.a(var2_2, (String)var29_32 /* !! */ , (String)var10_13, var13_16);
                                        var2_2 = var30_34.a;
                                        var29_32 /* !! */  = var30_34.c;
                                        var10_13 = var29_32 /* !! */ .a;
                                        var14_17 = var30_34.b;
                                        var42_44 = var29_32 /* !! */ .b;
                                        var29_32 /* !! */  = var29_32 /* !! */ .c;
                                        var23_24 /* !! */  = var11_14.a;
                                        var35_39 = var11_14.e;
                                        var11_14 = var11_14.d;
                                        var44_45 = var11_14.size();
                                        var30_34 = var30_34.c;
                                        var45_46 = var8_11;
                                        var46_47 = var30_34.e;
                                        var4_4 = var30_34.d;
                                        var28_30 = new co(var2_2, (String)var10_13, var14_17, var42_44, (String)var29_32 /* !! */ , (String)var23_24 /* !! */ , var35_39, var13_16, var44_45, var46_47, var4_4, var41_43);
                                        break block31;
                                    }
                                }
                                var2_2 = 3;
                            }
                        }
                        var45_46 = var8_11;
                        var40_42 = 0;
                        var28_30 = null;
                    }
                    if (var28_30 == null) {
                        block32: {
                            var7_7 = var45_46.iterator();
                            while ((var40_42 = var7_7.hasNext()) != 0) {
                                var28_30 = var7_7.next();
                                var28_30 = (dq)var28_30;
                                var31_36 = var28_30.c;
                                var3_3 = var31_36.d;
                                if ((var3_3 = (int)bl.b(var3_3)) == 0) continue;
                                var31_36 = var31_36.f;
                                var31_36 = var31_36.iterator();
                                while ((var3_3 = (int)var31_36.hasNext()) != 0) {
                                    var29_32 /* !! */  = var31_36.next();
                                    var4_4 = (int)dw.c(var29_32 /* !! */  = (dr)var29_32 /* !! */ );
                                    if (var4_4 == 0) continue;
                                    var30_34 = var29_32 /* !! */ .d;
                                    var5_5 = 0;
                                    var6_6 = null;
                                    var30_34 = var30_34.get(0);
                                    var30_34 = (do)var30_34;
                                    var4_4 = (int)var30_34.a;
                                    if (var4_4 == 0 || (var4_4 = (int)var1_1.b((dq)var28_30, (dr)var29_32 /* !! */ )) != 0) continue;
                                    var7_7 = dw.a;
                                    var31_36 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s.";
                                    var4_4 = var29_32 /* !! */ .f;
                                    var30_34 = var4_4;
                                    var5_5 = var28_30.a;
                                    var6_6 = var5_5;
                                    var8_11 = var28_30.c;
                                    var8_11 = var8_11.a;
                                    var10_13 = var29_32 /* !! */ .a;
                                    var14_17 = 4;
                                    var15_18 = new Object[var14_17];
                                    var12_15 = 0;
                                    var11_14 = null;
                                    var15_18[0] = var30_34;
                                    var4_4 = 1;
                                    var15_18[var4_4] = var6_6;
                                    var5_5 = 2;
                                    var15_18[var5_5] = var8_11;
                                    var48_48 = 3;
                                    var15_18[var48_48] = var10_13;
                                    var7_7.a((String)var31_36, (Object[])var15_18);
                                    var7_7 = var1_1.d;
                                    var2_2 = var28_30.a;
                                    var30_34 = var28_30.c;
                                    var30_34 = var30_34.a;
                                    var6_6 = var29_32 /* !! */ .a;
                                    var9_12 = 0;
                                    var10_13 = null;
                                    var49_49 = var7_7.a(var2_2, (String)var30_34, (String)var6_6, 0);
                                    var2_2 = var28_30.a;
                                    var30_34 = var28_30.c;
                                    var30_34 = var30_34.a;
                                    var6_6 = var1_1.c;
                                    var50_50 = var6_6.a((String)var30_34);
                                    var6_6 = var1_1.c;
                                    var8_11 = var28_30.c;
                                    var8_11 = var8_11.a;
                                    var51_51 = var6_6.c((String)var8_11);
                                    var5_5 = var28_30.b;
                                    var28_30 = var28_30.c;
                                    var53_52 = var28_30.b;
                                    var40_42 = var29_32 /* !! */ .f;
                                    var11_14 = var29_32 /* !! */ .a;
                                    var55_53 = var29_32 /* !! */ .c;
                                    var25_26 = var2_2;
                                    var7_7 = new ev(var2_2, (String)var30_34, var50_50, var51_51, var5_5, var53_52, var40_42, (String)var11_14, var55_53, var49_49);
                                    break block32;
                                }
                            }
                            var13_16 = 0;
                            var7_7 = null;
                        }
                        if (var7_7 == null) ** continue;
                        var1_1.b.l();
                        return var7_7;
                    }
                    var10_13 = var28_30;
                } else lbl-1000:
                // 4 sources

                {
                    var10_13 = var7_7;
                }
            }
            var1_1.b.l();
            return var10_13;
        }
        var1_1.b.l();
        throw var7_8;
    }
}

