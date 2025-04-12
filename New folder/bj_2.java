/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from bJ
 */
public final class bj_2
implements nj1_2 {
    public final ri_2 a;

    public bj_2(ri_2 ri_22) {
        this.a = ri_22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cl2_2 intercept(nj1$a var1_1) {
        block107: {
            block106: {
                block88: {
                    block89: {
                        block105: {
                            block83: {
                                block84: {
                                    block90: {
                                        block103: {
                                            block104: {
                                                block79: {
                                                    var2_2 = this;
                                                    var3_3 = var1_1;
                                                    Intrinsics.checkNotNullParameter(var1_1, "chain");
                                                    var4_5 = var1_1;
                                                    var4_5 = (te2_2)var1_1;
                                                    var5_6 = var4_5.a;
                                                    var6_7 = this.a;
                                                    var7_8 = 0;
                                                    var8_9 = null;
                                                    if (var6_7 == null) break block90;
                                                    var9_10 = var4_5.e;
                                                    var10_11 = "request";
                                                    Intrinsics.checkNotNullParameter(var9_10, (String)var10_11);
                                                    var11_12 = RI$c.a(var9_10.a);
                                                    try {
                                                        var6_7 = var6_7.a;
                                                        var6_7 = var6_7.d((String)var11_12);
                                                        if (var6_7 != null) break block79;
                                                    }
                                                    catch (IOException v2) {
                                                    }
lbl19:
                                                    // 5 sources

                                                    while (true) {
                                                        var12_24 = 0;
                                                        var3_3 = null;
lbl22:
                                                        // 3 sources

                                                        while (true) {
                                                            var20_20 = var3_3;
lbl24:
                                                            // 2 sources

                                                            while (true) {
                                                                block86: {
                                                                    block87: {
                                                                        block85: {
                                                                            block81: {
                                                                                block97: {
                                                                                    block102: {
                                                                                        block101: {
                                                                                            block82: {
                                                                                                block100: {
                                                                                                    block99: {
                                                                                                        block98: {
                                                                                                            block96: {
                                                                                                                block95: {
                                                                                                                    block91: {
                                                                                                                        var22_22 = System.currentTimeMillis();
                                                                                                                        var3_3 = var4_5.e;
                                                                                                                        var18_18 = "request";
                                                                                                                        Intrinsics.checkNotNullParameter(var3_3, (String)var18_18);
                                                                                                                        if (var20_20 == null) break block91;
                                                                                                                        var25_25 = var20_20.k;
                                                                                                                        var27_26 = var20_20.l;
                                                                                                                        var16_16 = var20_20.f;
                                                                                                                        var29_27 = var16_16.size();
                                                                                                                        var9_10 = null;
                                                                                                                        var31_29 = -1;
                                                                                                                        var32_30 = null;
                                                                                                                        var33_31 = null;
                                                                                                                        var34_32 = null;
                                                                                                                        var35_33 = null;
                                                                                                                        var36_34 = null;
                                                                                                                        var37_35 = null;
                                                                                                                        for (var30_28 = 0; var30_28 < var29_27; var30_28 += var41_38) {
                                                                                                                            block80: {
                                                                                                                                block94: {
                                                                                                                                    block93: {
                                                                                                                                        block92: {
                                                                                                                                            var18_18 = var16_16.c(var30_28);
                                                                                                                                            var38_36 = var31_29;
                                                                                                                                            var10_11 = var16_16.g(var30_28);
                                                                                                                                            var39_37 = var25_25;
                                                                                                                                            var11_12 = "Date";
                                                                                                                                            var41_38 = 1;
                                                                                                                                            var42_39 = b.i((String)var18_18, (String)var11_12, (boolean)var41_38);
                                                                                                                                            if (var42_39 != 0) {
                                                                                                                                                var32_30 = var18_18 = mi0_2.a((String)var10_11);
                                                                                                                                                var37_35 = var10_11;
lbl53:
                                                                                                                                                // 5 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var31_29 = var38_36;
                                                                                                                                                    break block80;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var11_12 = "Expires";
                                                                                                                                            var42_39 = b.i((String)var18_18, (String)var11_12, (boolean)var41_38);
                                                                                                                                            if (var42_39 == 0) break block92;
                                                                                                                                            var34_32 = var18_18 = mi0_2.a((String)var10_11);
                                                                                                                                            ** GOTO lbl53
                                                                                                                                        }
                                                                                                                                        var11_12 = "Last-Modified";
                                                                                                                                        var42_39 = b.i((String)var18_18, (String)var11_12, (boolean)var41_38);
                                                                                                                                        if (var42_39 == 0) break block93;
                                                                                                                                        var33_31 = var18_18 = mi0_2.a((String)var10_11);
                                                                                                                                        var36_34 = var10_11;
                                                                                                                                        ** GOTO lbl53
                                                                                                                                    }
                                                                                                                                    var11_12 = "ETag";
                                                                                                                                    var42_39 = b.i((String)var18_18, (String)var11_12, (boolean)var41_38);
                                                                                                                                    if (var42_39 == 0) break block94;
                                                                                                                                    var35_33 = var10_11;
                                                                                                                                    ** GOTO lbl53
                                                                                                                                }
                                                                                                                                var11_12 = "Age";
                                                                                                                                var21_21 = b.i((String)var18_18, (String)var11_12, (boolean)var41_38);
                                                                                                                                if (var21_21 != 0) ** break;
                                                                                                                                ** continue;
                                                                                                                                var21_21 = -1;
                                                                                                                                var31_29 = ez3.y(var21_21, (String)var10_11);
                                                                                                                            }
                                                                                                                            var25_25 = var39_37;
                                                                                                                        }
                                                                                                                        var38_36 = var31_29;
                                                                                                                        var39_37 = var25_25;
                                                                                                                        break block95;
                                                                                                                    }
                                                                                                                    var31_29 = -1;
                                                                                                                    var25_25 = 0L;
                                                                                                                    var27_26 = 0L;
                                                                                                                    var32_30 = null;
                                                                                                                    var33_31 = null;
                                                                                                                    var34_32 = null;
                                                                                                                    var35_33 = null;
                                                                                                                    var36_34 = null;
                                                                                                                    var37_35 = null;
                                                                                                                }
                                                                                                                if (var20_20 == null) {
                                                                                                                    var30_28 = 0;
                                                                                                                    var9_10 = null;
                                                                                                                    var18_18 = new mj_1(null, (kj2_2)var3_3);
lbl102:
                                                                                                                    // 3 sources

                                                                                                                    while (true) {
                                                                                                                        var2_2 = var3_3;
                                                                                                                        var43_40 = var4_5;
                                                                                                                        var44_41 = var5_6;
                                                                                                                        var12_24 = 0;
                                                                                                                        var3_3 = null;
                                                                                                                        break block81;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                var30_28 = 0;
                                                                                                                var9_10 = null;
                                                                                                                var18_18 = var3_3.a;
                                                                                                                var21_21 = var18_18.j;
                                                                                                                if (var21_21 == 0 || (var18_18 = var20_20.e) != null) break block96;
                                                                                                                var18_18 = new mj_1(null, (kj2_2)var3_3);
                                                                                                                ** GOTO lbl102
                                                                                                            }
                                                                                                            var21_21 = mj$a_1.a((cl2_2)var20_20, (kj2_2)var3_3);
                                                                                                            if (var21_21 == 0) {
                                                                                                                var18_18 = new mj_1(null, (kj2_2)var3_3);
                                                                                                                ** continue;
                                                                                                            }
                                                                                                            var18_18 = var3_3.a();
                                                                                                            var30_28 = (int)var18_18.a;
                                                                                                            if (var30_28 != 0 || (var16_16 = var3_3.b((String)(var9_10 = "If-Modified-Since"))) != null || (var17_17 = var3_3.b((String)(var16_16 = "If-None-Match"))) != null) break block97;
                                                                                                            var17_17 = var20_20.a();
                                                                                                            if (var32_30 != null) {
                                                                                                                var45_42 = var32_30.getTime();
                                                                                                                var43_40 = var4_5;
                                                                                                                var44_41 = var5_6;
                                                                                                                var47_43 = var27_26 - var45_42;
                                                                                                                var49_44 = var3_3;
                                                                                                                var50_45 = 0L;
                                                                                                                var47_43 = Math.max(var50_45, var47_43);
                                                                                                                var12_24 = -1;
                                                                                                            } else {
                                                                                                                var49_44 = var3_3;
                                                                                                                var43_40 = var4_5;
                                                                                                                var44_41 = var5_6;
                                                                                                                var12_24 = -1;
                                                                                                                var47_43 = 0L;
                                                                                                            }
                                                                                                            if (var31_29 != var12_24) {
                                                                                                                var3_3 = TimeUnit.SECONDS;
                                                                                                                var2_2 = var9_10;
                                                                                                                var52_46 = var31_29;
                                                                                                                var52_46 = var3_3.toMillis(var52_46);
                                                                                                                var47_43 = Math.max(var47_43, var52_46);
                                                                                                            } else {
                                                                                                                var2_2 = var9_10;
                                                                                                            }
                                                                                                            var52_46 = var27_26 - var25_25;
                                                                                                            var47_43 = var47_43 + var52_46 + (var22_22 -= var27_26);
                                                                                                            Intrinsics.checkNotNull(var20_20);
                                                                                                            var3_3 = var20_20.a();
                                                                                                            var12_24 = var3_3.c;
                                                                                                            var24_23 = -1;
                                                                                                            if (var12_24 != var24_23) {
                                                                                                                var6_7 = TimeUnit.SECONDS;
                                                                                                                var52_46 = var12_24;
                                                                                                                var22_22 = var6_7.toMillis(var52_46);
lbl158:
                                                                                                                // 3 sources

                                                                                                                while (true) {
                                                                                                                    var52_46 = var22_22;
                                                                                                                    var22_22 = 0L;
                                                                                                                    break block82;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            if (var34_32 == null) break block98;
                                                                                                            if (var32_30 != null) {
                                                                                                                var27_26 = var32_30.getTime();
                                                                                                            }
                                                                                                            if ((var12_24 = (int)((cfr_temp_0 = (var22_22 = var34_32.getTime() - var27_26) - (var52_46 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) > 0) ** GOTO lbl158
                                                                                                            var22_22 = 0L;
                                                                                                            ** continue;
                                                                                                        }
                                                                                                        if (var33_31 == null || (var3_3 = var20_20.a.a.h()) != null) break block99;
                                                                                                        if (var32_30 != null) {
                                                                                                            var25_25 = var32_30.getTime();
                                                                                                        }
                                                                                                        Intrinsics.checkNotNull(var33_31);
                                                                                                        var22_22 = var33_31.getTime();
                                                                                                        var25_25 -= var22_22;
                                                                                                        var22_22 = 0L;
                                                                                                        var12_24 = (int)(var25_25 == var22_22 ? 0 : (var25_25 < var22_22 ? -1 : 1));
                                                                                                        if (var12_24 <= 0) break block100;
                                                                                                        var12_24 = 10;
                                                                                                        var52_46 = var12_24;
                                                                                                        var52_46 = var25_25 / var52_46;
                                                                                                        break block82;
                                                                                                    }
                                                                                                    var22_22 = 0L;
                                                                                                }
                                                                                                var52_46 = var22_22;
                                                                                            }
                                                                                            var12_24 = var18_18.c;
                                                                                            var42_39 = -1;
                                                                                            if (var12_24 != var42_39) {
                                                                                                var13_13 = TimeUnit.SECONDS;
                                                                                                var27_26 = var12_24;
                                                                                                var54_47 = var13_13.toMillis(var27_26);
                                                                                                var52_46 = Math.min(var52_46, var54_47);
                                                                                            }
                                                                                            if ((var12_24 = var18_18.i) != var42_39) {
                                                                                                var13_13 = TimeUnit.SECONDS;
                                                                                                var27_26 = var12_24;
                                                                                                var54_47 = var13_13.toMillis(var27_26);
                                                                                            } else {
                                                                                                var54_47 = var22_22;
                                                                                            }
                                                                                            var12_24 = (int)var17_17.g;
                                                                                            if (var12_24 == 0 && (var12_24 = var18_18.h) != var42_39) {
                                                                                                var18_18 = TimeUnit.SECONDS;
                                                                                                var22_22 = var12_24;
                                                                                                var22_22 = var18_18.toMillis(var22_22);
                                                                                            }
                                                                                            if ((var12_24 = (int)var17_17.a) != 0 || (var12_24 = (int)((cfr_temp_1 = (var54_47 += var47_43) - (var22_22 += var52_46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) >= 0) break block101;
                                                                                            var3_3 = var20_20.h();
                                                                                            var2_2 = "Warning";
                                                                                            var21_21 = (int)(var54_47 == var52_46 ? 0 : (var54_47 < var52_46 ? -1 : 1));
                                                                                            if (var21_21 >= 0) {
                                                                                                var18_18 = "110 HttpURLConnection \"Response is stale\"";
                                                                                                Intrinsics.checkNotNullParameter(var2_2, "name");
                                                                                                Intrinsics.checkNotNullParameter(var18_18, "value");
                                                                                                var6_7 = var3_3.f;
                                                                                                var6_7.a((String)var2_2, (String)var18_18);
                                                                                            }
                                                                                            if ((var21_21 = (int)((cfr_temp_2 = var47_43 - (var22_22 = 86400000L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) > 0) {
                                                                                                Intrinsics.checkNotNull(var20_20);
                                                                                                var18_18 = var20_20.a();
                                                                                                var21_21 = var18_18.c;
                                                                                                var56_48 = -1;
                                                                                                if (var21_21 == var56_48 && var34_32 == null) {
                                                                                                    var18_18 = "113 HttpURLConnection \"Heuristic expiration\"";
                                                                                                    Intrinsics.checkNotNullParameter(var2_2, "name");
                                                                                                    Intrinsics.checkNotNullParameter(var18_18, "value");
                                                                                                    var4_5 = var3_3.f;
                                                                                                    var4_5.a((String)var2_2, (String)var18_18);
                                                                                                }
                                                                                            }
                                                                                            var3_3 = var3_3.a();
                                                                                            var57_49 = false;
                                                                                            var18_18 = new mj_1((cl2_2)var3_3, null);
                                                                                            var12_24 = 0;
                                                                                            var3_3 = null;
                                                                                            var2_2 = var49_44;
                                                                                            break block81;
                                                                                        }
                                                                                        if (var35_33 != null) {
                                                                                            var9_10 = var16_16;
                                                                                            var3_3 = var35_33;
lbl237:
                                                                                            // 3 sources

                                                                                            while (true) {
                                                                                                var2_2 = var49_44;
                                                                                                var18_18 = var49_44.c.e();
                                                                                                Intrinsics.checkNotNull(var3_3);
                                                                                                var18_18.c((String)var9_10, (String)var3_3);
                                                                                                var3_3 = var49_44.c();
                                                                                                var18_18 = var18_18.e();
                                                                                                var4_5 = "headers";
                                                                                                Intrinsics.checkNotNullParameter(var18_18, (String)var4_5);
                                                                                                var3_3.c = var18_18 = var18_18.e();
                                                                                                var3_3 = var3_3.b();
                                                                                                var18_18 = new mj_1((cl2_2)var20_20, (kj2_2)var3_3);
                                                                                                var12_24 = 0;
                                                                                                var3_3 = null;
                                                                                                break block81;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (var33_31 == null) break block102;
                                                                                        var9_10 = var2_2;
                                                                                        var3_3 = var36_34;
                                                                                        ** GOTO lbl237
                                                                                    }
                                                                                    if (var32_30 != null) {
                                                                                        var9_10 = var2_2;
                                                                                        var3_3 = var37_35;
                                                                                        ** continue;
                                                                                    }
                                                                                    var2_2 = var49_44;
                                                                                    var12_24 = 0;
                                                                                    var3_3 = null;
                                                                                    var18_18 = new mj_1(null, (kj2_2)var49_44);
                                                                                    break block81;
                                                                                }
                                                                                var2_2 = var3_3;
                                                                                var43_40 = var4_5;
                                                                                var44_41 = var5_6;
                                                                                var12_24 = 0;
                                                                                var3_3 = null;
                                                                                var18_18 = new mj_1(null, (kj2_2)var2_2);
                                                                            }
                                                                            var4_5 = var18_18.a;
                                                                            if (var4_5 != null) {
                                                                                var2_2 = var2_2.a();
                                                                                var57_49 = var2_2.j;
                                                                                if (var57_49) {
                                                                                    var18_18 = new mj_1(null, null);
                                                                                }
                                                                            }
                                                                            var2_2 = var18_18.a;
                                                                            var4_5 = var18_18.b;
                                                                            var5_6 = this;
                                                                            var6_7 = this.a;
                                                                            if (var6_7 != null) {
                                                                                synchronized (var6_7) {
                                                                                    var8_9 = "cacheStrategy";
                                                                                    Intrinsics.checkNotNullParameter(var18_18, (String)var8_9);
                                                                                }
                                                                            }
                                                                            var18_18 = var44_41;
                                                                            var24_23 = var44_41 instanceof RealCall;
                                                                            if (var24_23 != 0) {
                                                                                var6_7 = var44_41;
                                                                            } else {
                                                                                var24_23 = 0;
                                                                                var6_7 = null;
                                                                            }
                                                                            if (var6_7 == null || (var6_7 = ((RealCall)var6_7).e) == null) {
                                                                                var6_7 = ib0_2.a;
                                                                            }
                                                                            if (var20_20 != null && var4_5 == null && (var8_9 = var20_20.g) != null) {
                                                                                ez3.c((Closeable)var8_9);
                                                                            }
                                                                            var52_46 = -1;
                                                                            if (var2_2 == null && var4_5 == null) {
                                                                                var3_3 = new cl2$a_0();
                                                                                var2_2 = var43_40;
                                                                                var2_2 = var43_40.e;
                                                                                Intrinsics.checkNotNullParameter(var2_2, "request");
                                                                                var3_3.a = var2_2;
                                                                                var2_2 = ib2_2.HTTP_1_1;
                                                                                var3_3.d((ib2_2)var2_2);
                                                                                var3_3.c = 504;
                                                                                var2_2 = "Unsatisfiable Request (only-if-cached)";
                                                                                Intrinsics.checkNotNullParameter(var2_2, "message");
                                                                                var3_3.d = var2_2;
                                                                                var2_2 = ez3.c;
                                                                                var3_3.g = var2_2;
                                                                                var3_3.k = var52_46;
                                                                                var3_3.l = var58_50 = System.currentTimeMillis();
                                                                                var3_3 = var3_3.a();
                                                                                var6_7.getClass();
                                                                                Intrinsics.checkNotNullParameter(var18_18, "call");
                                                                                Intrinsics.checkNotNullParameter(var3_3, "response");
                                                                                return var3_3;
                                                                            }
                                                                            if (var2_2 == null) {
                                                                                Intrinsics.checkNotNull(var4_5);
                                                                                var3_3 = var4_5.h();
                                                                                var2_2 = bj$a_0.a((cl2_2)var4_5);
                                                                                cl2$a_0.b((cl2_2)var2_2, "cacheResponse");
                                                                                var3_3.i = var2_2;
                                                                                var3_3 = var3_3.a();
                                                                                var6_7.getClass();
                                                                                Intrinsics.checkNotNullParameter(var18_18, "call");
                                                                                Intrinsics.checkNotNullParameter(var3_3, "response");
                                                                                return var3_3;
                                                                            }
                                                                            if (var4_5 != null) {
                                                                                var6_7.getClass();
                                                                                Intrinsics.checkNotNullParameter(var18_18, "call");
                                                                                var8_9 = "cachedResponse";
                                                                                Intrinsics.checkNotNullParameter(var4_5, (String)var8_9);
                                                                            } else {
                                                                                var8_9 = var5_6.a;
                                                                                if (var8_9 != null) {
                                                                                    var6_7.getClass();
                                                                                    var8_9 = "call";
                                                                                    Intrinsics.checkNotNullParameter(var18_18, (String)var8_9);
                                                                                }
                                                                            }
                                                                            var8_9 = var1_1;
                                                                            var8_9 = (te2_2)var1_1;
                                                                            var8_9 = var8_9.a((kj2_2)var2_2);
                                                                            if (var4_5 == null) break block83;
                                                                            var19_19 = var8_9.d;
                                                                            var42_39 = 304;
                                                                            if (var19_19 != var42_39) break block84;
                                                                            var2_2 = var4_5.h();
                                                                            var20_20 = var4_5.f;
                                                                            var9_10 = var8_9.f;
                                                                            var10_11 = new m41$a_0();
                                                                            var42_39 = var20_20.size();
                                                                            var13_13 = null;
                                                                            block31: for (var41_38 = 0; var41_38 < var42_39; var41_38 += var61_52) {
                                                                                var14_14 = var20_20.c(var41_38);
                                                                                var15_15 = var20_20.g(var41_38);
                                                                                var16_16 = "Warning";
                                                                                var60_51 = var16_16.equalsIgnoreCase((String)var14_14);
                                                                                if (var60_51) {
                                                                                    var16_16 = "1";
                                                                                    var29_27 = 0;
                                                                                    var17_17 = null;
                                                                                    var60_51 = b.s((String)var15_15, (String)var16_16, false);
                                                                                    if (var60_51) lbl-1000:
                                                                                    // 3 sources

                                                                                    {
                                                                                        while (true) {
                                                                                            var61_52 = 1;
                                                                                            continue block31;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var29_27 = 0;
                                                                                    var17_17 = null;
                                                                                }
                                                                                if (!(var60_51 = (var16_16 = "Content-Length").equalsIgnoreCase((String)var14_14)) && !(var60_51 = (var16_16 = "Content-Encoding").equalsIgnoreCase((String)var14_14)) && !(var60_51 = (var16_16 = "Content-Type").equalsIgnoreCase((String)var14_14)) && (var60_51 = bj$a_0.b((String)var14_14)) && (var16_16 = var9_10.a((String)var14_14)) != null) ** GOTO lbl-1000
                                                                                var10_11.c((String)var14_14, (String)var15_15);
                                                                                ** continue;
                                                                            }
                                                                            var17_17 = null;
                                                                            var19_19 = var9_10.size();
                                                                            for (var29_27 = 0; var29_27 < var19_19; var29_27 += var42_39) {
                                                                                var13_13 = "Content-Length";
                                                                                var11_12 = var9_10.c(var29_27);
                                                                                var41_38 = (int)var13_13.equalsIgnoreCase((String)var11_12);
                                                                                if (var41_38 == 0 && (var41_38 = (int)(var13_13 = "Content-Encoding").equalsIgnoreCase((String)var11_12)) == 0 && (var41_38 = (int)(var13_13 = "Content-Type").equalsIgnoreCase((String)var11_12)) == 0 && (var41_38 = (int)bj$a_0.b((String)var11_12)) != 0) {
                                                                                    var13_13 = var9_10.g(var29_27);
                                                                                    var10_11.c((String)var11_12, (String)var13_13);
                                                                                }
                                                                                var42_39 = 1;
                                                                            }
                                                                            var20_20 = var10_11.e();
                                                                            var2_2.c((m41_0)var20_20);
                                                                            var2_2.k = var62_53 = var8_9.k;
                                                                            var2_2.l = var62_53 = var8_9.l;
                                                                            var20_20 = bj$a_0.a((cl2_2)var4_5);
                                                                            cl2$a_0.b((cl2_2)var20_20, "cacheResponse");
                                                                            var2_2.i = var20_20;
                                                                            var20_20 = bj$a_0.a((cl2_2)var8_9);
                                                                            var9_10 = "networkResponse";
                                                                            cl2$a_0.b((cl2_2)var20_20, (String)var9_10);
                                                                            var2_2.h = var20_20;
                                                                            var2_2 = var2_2.a();
                                                                            var8_9 = var8_9.g;
                                                                            Intrinsics.checkNotNull(var8_9);
                                                                            var8_9.close();
                                                                            var8_9 = var5_6.a;
                                                                            Intrinsics.checkNotNull(var8_9);
                                                                            var8_9.b();
                                                                            var5_6.a.getClass();
                                                                            Intrinsics.checkNotNullParameter(var4_5, "cached");
                                                                            Intrinsics.checkNotNullParameter(var2_2, "network");
                                                                            var8_9 = new RI$d((cl2_2)var2_2);
                                                                            var4_5 = var4_5.g;
                                                                            var20_20 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody";
                                                                            Intrinsics.checkNotNull(var4_5, (String)var20_20);
                                                                            var4_5 = ((RI$a)var4_5).b;
                                                                            try {
                                                                                var20_20 = var4_5.a;
                                                                                var52_46 = var4_5.b;
                                                                                var4_5 = var4_5.d;
                                                                                var20_20 = var4_5.c(var52_46, (String)var20_20);
                                                                                if (var20_20 != null) break block85;
                                                                                break block86;
                                                                            }
                                                                            catch (IOException v0) {
                                                                                var19_19 = 0;
                                                                                var20_20 = null;
                                                                                break block87;
                                                                            }
                                                                        }
                                                                        try {
                                                                            var8_9.c((rq0$a_0)var20_20);
                                                                            var20_20.b();
                                                                            break block86;
                                                                        }
                                                                        catch (IOException v1) {}
                                                                    }
                                                                    if (var20_20 != null) {
                                                                        var20_20.a();
                                                                    }
                                                                }
lbl441:
                                                                // 2 sources

                                                                while (true) {
                                                                    var6_7.getClass();
                                                                    Intrinsics.checkNotNullParameter(var18_18, "call");
                                                                    Intrinsics.checkNotNullParameter(var2_2, "response");
                                                                    return var2_2;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                try {
                                                    var13_13 = var6_7.c;
                                                    var13_13 = var13_13.get(0);
                                                    var13_13 = (a93_0)var13_13;
                                                    var11_12 = new RI$d((a93_0)var13_13);
                                                    var13_13 = var11_12.b;
                                                    var14_14 = var11_12.c;
                                                    var15_15 = var11_12.a;
                                                }
                                                catch (IOException v3) {
                                                    ez3.c((Closeable)var6_7);
                                                    ** GOTO lbl19
                                                }
                                                Intrinsics.checkNotNullParameter(var6_7, "snapshot");
                                                var16_16 = var11_12.g;
                                                var17_17 = var16_16.a("Content-Type");
                                                var8_9 = var16_16.a("Content-Length");
                                                var18_18 = new KJ2$a();
                                                Intrinsics.checkNotNullParameter(var15_15, "url");
                                                var18_18.a = var15_15;
                                                var19_19 = 0;
                                                var18_18.e((String)var14_14, null);
                                                Intrinsics.checkNotNullParameter(var13_13, "headers");
                                                var18_18.c = var20_20 = var13_13.e();
                                                var18_18 = var18_18.b();
                                                var20_20 = new cl2$a_0();
                                                Intrinsics.checkNotNullParameter(var18_18, (String)var10_11);
                                                var20_20.a = var18_18;
                                                var18_18 = var11_12.d;
                                                var20_20.d((ib2_2)var18_18);
                                                var20_20.c = var21_21 = var11_12.e;
                                                var18_18 = var11_12.f;
                                                Intrinsics.checkNotNullParameter(var18_18, "message");
                                                var20_20.d = var18_18;
                                                var20_20.c((m41_0)var16_16);
                                                var20_20.g = var3_3 = new RI$a((Rq0$c)var6_7, (String)var17_17, (String)var8_9);
                                                var20_20.e = var3_3 = var11_12.h;
                                                var20_20.k = var22_22 = var11_12.i;
                                                var20_20.l = var22_22 = var11_12.j;
                                                var3_3 = var20_20.a();
                                                Intrinsics.checkNotNullParameter(var9_10, (String)var10_11);
                                                Intrinsics.checkNotNullParameter(var3_3, "response");
                                                var18_18 = var9_10.a;
                                                var21_21 = (int)Intrinsics.areEqual(var15_15, var18_18);
                                                if (var21_21 == 0 || (var21_21 = (int)Intrinsics.areEqual(var14_14, var18_18 = var9_10.b)) == 0) break block103;
                                                Intrinsics.checkNotNullParameter(var3_3, "cachedResponse");
                                                Intrinsics.checkNotNullParameter(var13_13, "cachedRequest");
                                                Intrinsics.checkNotNullParameter(var9_10, "newRequest");
                                                var18_18 = RI$c.c(var3_3.f);
                                                var24_23 = var18_18 instanceof Collection;
                                                if (var24_23 == 0) break block104;
                                                var6_7 = var18_18;
                                                var6_7 = (Collection)var18_18;
                                                var24_23 = (int)var6_7.isEmpty();
                                                if (var24_23 != 0) ** GOTO lbl22
                                            }
                                            var18_18 = ((Iterable)var18_18).iterator();
                                            do {
                                                if ((var24_23 = (int)var18_18.hasNext()) != 0) ** break;
                                                ** continue;
                                                var6_7 = (String)var18_18.next();
                                                var8_9 = var13_13.h((String)var6_7);
                                                Intrinsics.checkNotNullParameter(var6_7, "name");
                                                var20_20 = var9_10.c;
                                                var6_7 = var20_20.h((String)var6_7);
                                                var24_23 = (int)Intrinsics.areEqual(var8_9, var6_7);
                                            } while ((var24_23 ^= (var7_8 = 1)) == 0);
                                        }
                                        if ((var3_3 = var3_3.g) == null) ** GOTO lbl19
                                        ez3.c((Closeable)var3_3);
                                        ** while (true)
                                    }
                                    var19_19 = 0;
                                    var20_20 = null;
                                    ** while (true)
                                    catch (IOException v4) {
                                        ** continue;
                                    }
                                }
                                var42_39 = 1;
                                var29_27 = 0;
                                var17_17 = null;
                                var20_20 = var4_5.g;
                                if (var20_20 != null) {
                                    ez3.c((Closeable)var20_20);
                                }
                                break block105;
                            }
                            var42_39 = 1;
                            var29_27 = 0;
                            var17_17 = null;
                        }
                        Intrinsics.checkNotNull(var8_9);
                        var20_20 = var8_9.h();
                        var13_13 = bj$a_0.a((cl2_2)var4_5);
                        var14_14 = "cacheResponse";
                        cl2$a_0.b((cl2_2)var13_13, (String)var14_14);
                        var20_20.i = var13_13;
                        var8_9 = bj$a_0.a((cl2_2)var8_9);
                        var13_13 = "networkResponse";
                        cl2$a_0.b((cl2_2)var8_9, (String)var13_13);
                        var20_20.h = var8_9;
                        var8_9 = var20_20.a();
                        var20_20 = var5_6.a;
                        if (var20_20 == null) return var8_9;
                        var19_19 = (int)ia1_1.a((cl2_2)var8_9);
                        if (var19_19 == 0 || (var19_19 = (int)mj$a_1.a((cl2_2)var8_9, (kj2_2)var2_2)) == 0) break block106;
                        var2_2 = var5_6.a;
                        var2_2.getClass();
                        Intrinsics.checkNotNullParameter(var8_9, "response");
                        var20_20 = var8_9.a.b;
                        Intrinsics.checkNotNullParameter(var20_20, "method");
                        var13_13 = "POST";
                        var41_38 = (int)Intrinsics.areEqual(var20_20, var13_13);
                        if (var41_38 != 0 || (var41_38 = (int)Intrinsics.areEqual(var20_20, var13_13 = "PATCH")) != 0 || (var41_38 = (int)Intrinsics.areEqual(var20_20, var13_13 = "PUT")) != 0 || (var41_38 = (int)Intrinsics.areEqual(var20_20, var13_13 = "DELETE")) != 0 || (var41_38 = (int)Intrinsics.areEqual(var20_20, var13_13 = "MOVE")) != 0) {
                            var29_27 = 1;
                        }
                        var11_12 = var8_9.a;
                        if (var29_27 != 0) {
                            try {
                                var2_2.a((kj2_2)var11_12);
                            }
                            catch (IOException v5) {}
lbl570:
                            // 7 sources

                            while (true) {
                                var19_19 = 0;
                                var20_20 = null;
                                break block88;
                                break;
                            }
                        }
                        var13_13 = "GET";
                        var19_19 = (int)Intrinsics.areEqual(var20_20, var13_13);
                        if (var19_19 == 0) ** GOTO lbl570
                        Intrinsics.checkNotNullParameter(var8_9, "<this>");
                        var20_20 = RI$c.c(var8_9.f);
                        var13_13 = "*";
                        var19_19 = (int)var20_20.contains(var13_13);
                        if (var19_19 != 0) ** GOTO lbl570
                        var20_20 = new RI$d((cl2_2)var8_9);
                        try {
                            var13_13 = var2_2.a;
                            var11_12 = var11_12.a;
                            var11_12 = RI$c.a((ob1_1)var11_12);
                            var14_14 = rq0_2.t;
                            var9_10 = var13_13.c(var52_46, (String)var11_12);
                            if (var9_10 == null) ** GOTO lbl570
                        }
                        catch (IOException v6) {
                            ** continue;
                        }
                        try {
                            var20_20.c((rq0$a_0)var9_10);
                            var20_20 = new RI$b((ri_2)var2_2, (rq0$a_0)var9_10);
                            break block88;
                        }
                        catch (IOException v7) {
                            var20_20 = var9_10;
                            break block89;
                        }
lbl599:
                        // 1 sources

                        while (true) {
                            var19_19 = 0;
                            var20_20 = null;
                            break;
                        }
                    }
                    if (var20_20 == null) ** GOTO lbl570
                    {
                        var20_20.a();
                        ** continue;
                    }
                }
                if (var20_20 != null) {
                    var3_3 = var20_20.c;
                    var2_2 = var8_9.g;
                    Intrinsics.checkNotNull(var2_2);
                    var2_2 = var2_2.h();
                    var3_3 = o72_0.a((y63_0)var3_3);
                    var9_10 = new cj_2((se_1)var2_2, (RI$b)var20_20, (he2_2)var3_3);
                    var3_3 = cl2_2.c((cl2_2)var8_9, "Content-Type");
                    var64_54 = var8_9.g.c();
                    var2_2 = var8_9.h();
                    var20_20 = o72_0.b((a93_0)var9_10);
                    var2_2.g = var8_9 = new ve2_2((String)var3_3, var64_54, (ie2_2)var20_20);
                    var8_9 = var2_2.a();
                }
                if (var4_5 == null) return var8_9;
                var6_7.getClass();
                var3_3 = "call";
                Intrinsics.checkNotNullParameter(var18_18, (String)var3_3);
                return var8_9;
            }
            var3_3 = var2_2.b;
            Intrinsics.checkNotNullParameter(var3_3, "method");
            var18_18 = "POST";
            var21_21 = (int)Intrinsics.areEqual(var3_3, var18_18);
            if (var21_21 == 0 && (var21_21 = (int)Intrinsics.areEqual(var3_3, var18_18 = "PATCH")) == 0 && (var21_21 = (int)Intrinsics.areEqual(var3_3, var18_18 = "PUT")) == 0 && (var21_21 = (int)Intrinsics.areEqual(var3_3, var18_18 = "DELETE")) == 0) {
                var18_18 = "MOVE";
                var12_24 = (int)Intrinsics.areEqual(var3_3, var18_18);
                if (var12_24 == 0) return var8_9;
            }
            try {}
            catch (IOException v8) {
                return var8_9;
            }
            break block107;
            catch (Throwable var3_4) {
                if (var20_20 == null) throw var3_4;
                var2_2 = var20_20.g;
                if (var2_2 == null) throw var3_4;
                ez3.c((Closeable)var2_2);
                throw var3_4;
            }
        }
        var3_3 = var5_6.a;
        var3_3.a((kj2_2)var2_2);
        return var8_9;
    }
}

