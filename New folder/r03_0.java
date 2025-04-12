/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/*
 * Renamed from r03
 */
public abstract class r03_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static sb1_2 b(dm2_1 var0, Class var1_1, Method var2_2) {
        block99: {
            block155: {
                block156: {
                    block157: {
                        var3_3 = var0;
                        var4_8 = var2_2;
                        var5_9 = -1;
                        var6_10 = 0;
                        var7_11 = null;
                        var8_12 = 1;
                        var10_14 = var1_1;
                        var9_13 = new aK2$a((dm2_1)var0, (Class)var1_1, (Method)var2_2);
                        var10_14 = var9_13.d;
                        var11_15 = ((Annotation[])var10_14).length;
                        var12_16 = 0;
                        var13_17 = null;
                        while (true) {
                            block86: {
                                block97: {
                                    block98: {
                                        block96: {
                                            block95: {
                                                block94: {
                                                    block93: {
                                                        block92: {
                                                            block91: {
                                                                var14_18 = var9_13.c;
                                                                var15_19 = "HEAD";
                                                                if (var12_16 >= var11_15) break;
                                                                var16_20 = var10_14[var12_16];
                                                                var17_21 = var16_20 instanceof ph0_1;
                                                                if (var17_21 != 0) {
                                                                    var16_20 = (ph0_1)var16_20;
                                                                    var14_18 = var16_20.value();
                                                                    var15_19 = "DELETE";
                                                                    var9_13.b((String)var15_19, (String)var14_18, false);
lbl24:
                                                                    // 8 sources

                                                                    while (true) {
                                                                        var18_22 = var11_15;
                                                                        break block86;
                                                                        break;
                                                                    }
                                                                }
                                                                var17_21 = var16_20 instanceof ay0_2;
                                                                if (var17_21 == 0) break block91;
                                                                var16_20 = (ay0_2)var16_20;
                                                                var14_18 = var16_20.value();
                                                                var15_19 = "GET";
                                                                var9_13.b((String)var15_19, (String)var14_18, false);
                                                                ** GOTO lbl24
                                                            }
                                                            var17_21 = var16_20 instanceof h21_0;
                                                            if (var17_21 == 0) break block92;
                                                            var16_20 = (h21_0)var16_20;
                                                            var14_18 = var16_20.value();
                                                            var9_13.b((String)var15_19, (String)var14_18, false);
                                                            ** GOTO lbl24
                                                        }
                                                        var19_23 = var16_20 instanceof rh2_2;
                                                        if (!var19_23) break block93;
                                                        var16_20 = (rh2_2)var16_20;
                                                        var14_18 = var16_20.value();
                                                        var15_19 = "PATCH";
                                                        var9_13.b((String)var15_19, (String)var14_18, (boolean)var8_12);
                                                        ** GOTO lbl24
                                                    }
                                                    var19_23 = var16_20 instanceof zj2_2;
                                                    if (!var19_23) break block94;
                                                    var16_20 = (zj2_2)var16_20;
                                                    var14_18 = var16_20.value();
                                                    var15_19 = "POST";
                                                    var9_13.b((String)var15_19, (String)var14_18, (boolean)var8_12);
                                                    ** GOTO lbl24
                                                }
                                                var19_23 = var16_20 instanceof bk2_2;
                                                if (!var19_23) break block95;
                                                var16_20 = (bk2_2)var16_20;
                                                var14_18 = var16_20.value();
                                                var15_19 = "PUT";
                                                var9_13.b((String)var15_19, (String)var14_18, (boolean)var8_12);
                                                ** GOTO lbl24
                                            }
                                            var19_23 = var16_20 instanceof d62_0;
                                            if (!var19_23) break block96;
                                            var16_20 = (d62_0)var16_20;
                                            var14_18 = var16_20.value();
                                            var15_19 = "OPTIONS";
                                            var9_13.b((String)var15_19, (String)var14_18, false);
                                            ** GOTO lbl24
                                        }
                                        var19_23 = var16_20 instanceof i21_0;
                                        if (var19_23) {
                                            var16_20 = (i21_0)var16_20;
                                            var14_18 = var16_20.method();
                                            var15_19 = var16_20.path();
                                            var20_24 = var16_20.hasBody();
                                            var9_13.b((String)var14_18, (String)var15_19, var20_24);
                                            ** continue;
                                        }
                                        var19_23 = var16_20 instanceof n41_0;
                                        if (!var19_23) break block97;
                                        var15_19 = (var16_20 = (n41_0)var16_20).value();
                                        var17_21 = ((String[])var15_19).length;
                                        if (var17_21 == 0) break block98;
                                        var21_25 = var16_20.allowUnsafeNonAsciiValues();
                                        var22_26 = new m41$a_0();
                                        var23_27 = ((String[])var15_19).length;
                                        var25_29 = null;
                                        for (var24_28 = 0; var24_28 < var23_27; var24_28 += var8_12) {
                                            var26_30 = var15_19[var24_28];
                                            var6_10 = var26_30.indexOf(58);
                                            if (var6_10 != var5_9 && var6_10 != 0 && var6_10 != (var5_9 = (var18_22 = var26_30.length()) + -1)) {
                                                var18_22 = var11_15;
                                                var5_9 = 0;
                                                var27_31 = var26_30.substring(0, var6_10);
                                                var28_32 = var26_30.substring(var6_10 += var8_12).trim();
                                                var7_11 = "Content-Type";
                                                var6_10 = (int)var7_11.equalsIgnoreCase((String)var27_31);
                                                if (var6_10 != 0) {
                                                    try {
                                                        var7_11 = jn1_0.d;
                                                    }
                                                    catch (IllegalArgumentException var3_4) {
                                                        var25_29 = new Object[var8_12];
                                                        var25_29[0] = var28_32;
                                                        throw cz3_0.j((Method)var14_18, var3_4, "Malformed content type: %s", (Object[])var25_29);
                                                    }
                                                    var7_11 = JN1$a.a((String)var28_32);
                                                    var9_13.u = var7_11;
                                                } else if (var21_25) {
                                                    var22_26.d((String)var27_31, (String)var28_32);
                                                } else {
                                                    var22_26.a((String)var27_31, (String)var28_32);
                                                }
                                                var11_15 = var18_22;
                                                var5_9 = -1;
                                                var6_10 = 0;
                                                var7_11 = null;
                                                continue;
                                            }
                                            var3_3 = new Object[var8_12];
                                            var3_3[0] = var26_30;
                                            throw cz3_0.j((Method)var14_18, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", (Object[])var3_3);
                                        }
                                        var18_22 = var11_15;
                                        var24_28 = 0;
                                        var25_29 = null;
                                        var28_32 = var22_26.e();
                                        var9_13.t = var28_32;
                                        break block86;
                                    }
                                    var3_3 = new Object[]{};
                                    throw cz3_0.j((Method)var14_18, null, "@Headers annotation is empty.", (Object[])var3_3);
                                }
                                var18_22 = var11_15;
                                var24_28 = var16_20 instanceof br1_2;
                                var28_32 = "Only one encoding annotation is allowed.";
                                if (var24_28 == 0) ** GOTO lbl145
                                var24_28 = (int)var9_13.q;
                                if (var24_28 == 0) {
                                    var9_13.r = var8_12;
                                } else {
                                    var3_3 = new Object[]{};
                                    throw cz3_0.j((Method)var14_18, null, (String)var28_32, (Object[])var3_3);
lbl145:
                                    // 1 sources

                                    var24_28 = 0;
                                    var25_29 = null;
                                    var6_10 = 0;
                                    var7_11 = null;
                                    var11_15 = var16_20 instanceof ev0_2;
                                    if (var11_15 != 0) {
                                        var11_15 = (int)var9_13.r;
                                        if (var11_15 == 0) {
                                            var9_13.q = var8_12;
                                        } else {
                                            var3_3 = new Object[]{};
                                            throw cz3_0.j((Method)var14_18, null, (String)var28_32, (Object[])var3_3);
                                        }
                                    }
                                }
                            }
                            var12_16 += var8_12;
                            var11_15 = var18_22;
                            var5_9 = -1;
                            var6_10 = 0;
                            var7_11 = null;
                        }
                        var25_29 = var9_13.o;
                        if (var25_29 == null) break block99;
                        var24_28 = (int)var9_13.p;
                        if (var24_28 == 0) {
                            var24_28 = var9_13.r;
                            if (var24_28 == 0) {
                                var24_28 = var9_13.q;
                                if (var24_28 != 0) {
                                    var3_3 = new Object[]{};
                                    throw cz3_0.j((Method)var14_18, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", (Object[])var3_3);
                                }
                            } else {
                                var3_3 = new Object[]{};
                                throw cz3_0.j((Method)var14_18, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", (Object[])var3_3);
                            }
                        }
                        var25_29 = var9_13.e;
                        var5_9 = ((Annotation[][])var25_29).length;
                        var7_11 = new fm2_2[var5_9];
                        var9_13.w = var7_11;
                        var6_10 = var5_9 + -1;
                        var27_31 = null;
                        for (var11_15 = 0; var11_15 < var5_9; var11_15 += var24_28) {
                            block90: {
                                block154: {
                                    block100: {
                                        block87: {
                                            var13_17 = var9_13.w;
                                            var26_30 = var9_13.f[var11_15];
                                            var16_20 = var25_29[var11_15];
                                            if (var11_15 == var6_10) {
                                                var17_21 = 1;
                                                var29_33 = 1.4E-45f;
                                            } else {
                                                var17_21 = 0;
                                                var29_33 = 0.0f;
                                                var22_26 = null;
                                            }
                                            if (var16_20 == null) break block100;
                                            var23_27 = ((Object)var16_20).length;
                                            var8_12 = 0;
                                            var30_34 = null;
                                            var18_22 = 0;
                                            var31_35 = null;
                                            while (true) {
                                                block88: {
                                                    block139: {
                                                        block140: {
                                                            block153: {
                                                                block151: {
                                                                    block152: {
                                                                        block148: {
                                                                            block149: {
                                                                                block150: {
                                                                                    block141: {
                                                                                        block147: {
                                                                                            block145: {
                                                                                                block146: {
                                                                                                    block142: {
                                                                                                        block143: {
                                                                                                            block144: {
                                                                                                                block135: {
                                                                                                                    block136: {
                                                                                                                        block137: {
                                                                                                                            block138: {
                                                                                                                                block130: {
                                                                                                                                    block132: {
                                                                                                                                        block133: {
                                                                                                                                            block134: {
                                                                                                                                                block131: {
                                                                                                                                                    block126: {
                                                                                                                                                        block129: {
                                                                                                                                                            block127: {
                                                                                                                                                                block128: {
                                                                                                                                                                    block122: {
                                                                                                                                                                        block123: {
                                                                                                                                                                            block124: {
                                                                                                                                                                                block125: {
                                                                                                                                                                                    block119: {
                                                                                                                                                                                        block120: {
                                                                                                                                                                                            block121: {
                                                                                                                                                                                                block117: {
                                                                                                                                                                                                    block118: {
                                                                                                                                                                                                        block109: {
                                                                                                                                                                                                            block110: {
                                                                                                                                                                                                                block111: {
                                                                                                                                                                                                                    block112: {
                                                                                                                                                                                                                        block113: {
                                                                                                                                                                                                                            block114: {
                                                                                                                                                                                                                                block115: {
                                                                                                                                                                                                                                    block116: {
                                                                                                                                                                                                                                        block101: {
                                                                                                                                                                                                                                            block102: {
                                                                                                                                                                                                                                                block103: {
                                                                                                                                                                                                                                                    block104: {
                                                                                                                                                                                                                                                        block105: {
                                                                                                                                                                                                                                                            block106: {
                                                                                                                                                                                                                                                                block107: {
                                                                                                                                                                                                                                                                    block108: {
                                                                                                                                                                                                                                                                        var32_36 = var25_29;
                                                                                                                                                                                                                                                                        if (var8_12 >= var23_27) break block87;
                                                                                                                                                                                                                                                                        var25_29 = var16_20[var8_12];
                                                                                                                                                                                                                                                                        var33_37 = var5_9;
                                                                                                                                                                                                                                                                        var5_9 = var25_29 instanceof gx3_0;
                                                                                                                                                                                                                                                                        var34_38 = var6_10;
                                                                                                                                                                                                                                                                        var7_11 = "@Path parameters may not be used with @Url.";
                                                                                                                                                                                                                                                                        var35_39 = var23_27;
                                                                                                                                                                                                                                                                        var36_40 = String.class;
                                                                                                                                                                                                                                                                        if (var5_9 == 0) break block101;
                                                                                                                                                                                                                                                                        var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                                                                                                                                        var24_28 = (int)var9_13.n;
                                                                                                                                                                                                                                                                        if (var24_28 != 0) break block102;
                                                                                                                                                                                                                                                                        var24_28 = (int)var9_13.j;
                                                                                                                                                                                                                                                                        if (var24_28 != 0) break block103;
                                                                                                                                                                                                                                                                        var24_28 = (int)var9_13.k;
                                                                                                                                                                                                                                                                        if (var24_28 != 0) break block104;
                                                                                                                                                                                                                                                                        var24_28 = (int)var9_13.l;
                                                                                                                                                                                                                                                                        if (var24_28 != 0) break block105;
                                                                                                                                                                                                                                                                        var24_28 = (int)var9_13.m;
                                                                                                                                                                                                                                                                        if (var24_28 != 0) break block106;
                                                                                                                                                                                                                                                                        var25_29 = var9_13.s;
                                                                                                                                                                                                                                                                        if (var25_29 != null) break block107;
                                                                                                                                                                                                                                                                        var24_28 = 1;
                                                                                                                                                                                                                                                                        var9_13.n = var24_28;
                                                                                                                                                                                                                                                                        var25_29 = ob1_1.class;
                                                                                                                                                                                                                                                                        if (var26_30 == var25_29 || var26_30 == var36_40 || var26_30 == (var25_29 = URI.class)) break block108;
                                                                                                                                                                                                                                                                        var24_28 = var26_30 instanceof Class;
                                                                                                                                                                                                                                                                        if (var24_28 == 0) ** GOTO lbl-1000
                                                                                                                                                                                                                                                                        var25_29 = var26_30;
                                                                                                                                                                                                                                                                        var28_32 = "android.net.Uri";
                                                                                                                                                                                                                                                                        var25_29 = ((Class)var26_30).getName();
                                                                                                                                                                                                                                                                        var24_28 = (int)var28_32.equals(var25_29);
                                                                                                                                                                                                                                                                        if (var24_28 != 0) {
                                                                                                                                                                                                                                                                        } else lbl-1000:
                                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                                        {
                                                                                                                                                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", (Object[])var4_8);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    var24_28 = 0;
                                                                                                                                                                                                                                                                    var25_29 = null;
                                                                                                                                                                                                                                                                    var3_3 = var28_32 = new Fm2$n((Method)var14_18, var11_15);
                                                                                                                                                                                                                                                                    var37_41 = var8_12;
                                                                                                                                                                                                                                                                    var38_42 /* !! */  = var13_17;
                                                                                                                                                                                                                                                                    var39_43 = var15_19;
lbl245:
                                                                                                                                                                                                                                                                    // 3 sources

                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        var40_44 = var17_21;
                                                                                                                                                                                                                                                                        var41_45 = var29_33;
lbl248:
                                                                                                                                                                                                                                                                        // 9 sources

                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                            var42_46 = -1;
                                                                                                                                                                                                                                                                            break block88;
                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var3_3 = var9_13.o;
                                                                                                                                                                                                                                                                var4_8 = new Object[]{var3_3};
                                                                                                                                                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, "@Url cannot be used with @%s URL", (Object[])var4_8);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, "A @Url parameter must not come after a @QueryMap.", (Object[])var4_8);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var4_8 = new Object[]{};
                                                                                                                                                                                                                                                        throw cz3_0.k((Method)var14_18, var11_15, "A @Url parameter must not come after a @QueryName.", (Object[])var4_8);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    var4_8 = new Object[]{};
                                                                                                                                                                                                                                                    throw cz3_0.k((Method)var14_18, var11_15, "A @Url parameter must not come after a @Query.", (Object[])var4_8);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                var3_3 = new Object[]{};
                                                                                                                                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var7_11, (Object[])var3_3);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, "Multiple @Url method annotations found.", (Object[])var4_8);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        var5_9 = var25_29 instanceof in2_2;
                                                                                                                                                                                                                                        var39_43 = var15_19;
                                                                                                                                                                                                                                        var15_19 = var9_13.a;
                                                                                                                                                                                                                                        if (var5_9 == 0) break block109;
                                                                                                                                                                                                                                        var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                                                                                                        var5_9 = (int)var9_13.k;
                                                                                                                                                                                                                                        if (var5_9 != 0) break block110;
                                                                                                                                                                                                                                        var5_9 = (int)var9_13.l;
                                                                                                                                                                                                                                        if (var5_9 != 0) break block111;
                                                                                                                                                                                                                                        var5_9 = (int)var9_13.m;
                                                                                                                                                                                                                                        if (var5_9 != 0) break block112;
                                                                                                                                                                                                                                        var5_9 = (int)var9_13.n;
                                                                                                                                                                                                                                        if (var5_9 != 0) break block113;
                                                                                                                                                                                                                                        var28_32 = var9_13.s;
                                                                                                                                                                                                                                        if (var28_32 == null) break block114;
                                                                                                                                                                                                                                        var5_9 = 1;
                                                                                                                                                                                                                                        var9_13.j = var5_9;
                                                                                                                                                                                                                                        var28_32 = (var25_29 = (in2_2)var25_29).value();
                                                                                                                                                                                                                                        var7_11 = aK2$a.z.matcher((CharSequence)var28_32);
                                                                                                                                                                                                                                        var6_10 = (int)var7_11.matches();
                                                                                                                                                                                                                                        if (var6_10 == 0) break block115;
                                                                                                                                                                                                                                        var7_11 = var9_13.v;
                                                                                                                                                                                                                                        var6_10 = (int)var7_11.contains(var28_32);
                                                                                                                                                                                                                                        if (var6_10 == 0) break block116;
                                                                                                                                                                                                                                        var15_19.f((Type)var26_30, (Annotation[])var16_20);
                                                                                                                                                                                                                                        var24_28 = var25_29.encoded();
                                                                                                                                                                                                                                        var3_3 = var7_11 = new Fm2$i((Method)var14_18, var11_15, (String)var28_32, (boolean)var24_28);
                                                                                                                                                                                                                                        var37_41 = var8_12;
                                                                                                                                                                                                                                        var38_42 /* !! */  = var13_17;
                                                                                                                                                                                                                                        ** GOTO lbl245
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var3_3 = var9_13.s;
                                                                                                                                                                                                                                    var4_8 = new Object[]{var3_3, var28_32};
                                                                                                                                                                                                                                    throw cz3_0.k((Method)var14_18, var11_15, "URL \"%s\" does not contain \"{%s}\".", (Object[])var4_8);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                var3_3 = aK2$a.y.pattern();
                                                                                                                                                                                                                                var4_8 = new Object[]{var3_3, var28_32};
                                                                                                                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, "@Path parameter name must match %s. Found: %s", (Object[])var4_8);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var3_3 = var9_13.o;
                                                                                                                                                                                                                            var4_8 = new Object[]{var3_3};
                                                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, "@Path can only be used with relative url on @%s", (Object[])var4_8);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        var3_3 = new Object[]{};
                                                                                                                                                                                                                        throw cz3_0.k((Method)var14_18, var11_15, (String)var7_11, (Object[])var3_3);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var4_8 = new Object[]{};
                                                                                                                                                                                                                    throw cz3_0.k((Method)var14_18, var11_15, "A @Path parameter must not come after a @QueryMap.", (Object[])var4_8);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var4_8 = new Object[]{};
                                                                                                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, "A @Path parameter must not come after a @QueryName.", (Object[])var4_8);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, "A @Path parameter must not come after a @Query.", (Object[])var4_8);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var6_10 = 2;
                                                                                                                                                                                                        var5_9 = var25_29 instanceof oc2_2;
                                                                                                                                                                                                        var7_11 = "<String>)";
                                                                                                                                                                                                        var3_3 = " must include generic type (e.g., ";
                                                                                                                                                                                                        var4_8 = Iterable.class;
                                                                                                                                                                                                        if (var5_9 == 0) break block117;
                                                                                                                                                                                                        var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                                                                        var25_29 = (oc2_2)var25_29;
                                                                                                                                                                                                        var28_32 = var25_29.value();
                                                                                                                                                                                                        var24_28 = (int)var25_29.encoded();
                                                                                                                                                                                                        var36_40 = cz3_0.e((Type)var26_30);
                                                                                                                                                                                                        var38_42 /* !! */  = var13_17;
                                                                                                                                                                                                        var12_16 = 1;
                                                                                                                                                                                                        var9_13.k = var12_16;
                                                                                                                                                                                                        var42_46 = (int)var4_8.isAssignableFrom((Class<?>)var36_40);
                                                                                                                                                                                                        if (var42_46 != 0) {
                                                                                                                                                                                                            var42_46 = var26_30 instanceof ParameterizedType;
                                                                                                                                                                                                            if (var42_46 != 0) {
                                                                                                                                                                                                                var3_3 = var26_30;
                                                                                                                                                                                                                var3_3 = (ParameterizedType)var26_30;
                                                                                                                                                                                                                var42_46 = 0;
                                                                                                                                                                                                                var3_3 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                                                                                                var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                                                                                var3_3 = new Fm2$j((String)var28_32, (boolean)var24_28);
                                                                                                                                                                                                                var4_8 = new dm2_2((fm2_2)var3_3);
lbl351:
                                                                                                                                                                                                                // 4 sources

                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                    var3_3 = var4_8;
lbl353:
                                                                                                                                                                                                                    // 3 sources

                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        var37_41 = var8_12;
                                                                                                                                                                                                                        ** continue;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            var4_8 = new StringBuilder();
                                                                                                                                                                                                            var25_29 = var36_40.getSimpleName();
                                                                                                                                                                                                            var4_8.append((String)var25_29);
                                                                                                                                                                                                            var4_8.append((String)var3_3);
                                                                                                                                                                                                            var3_3 = var36_40.getSimpleName();
                                                                                                                                                                                                            var4_8.append((String)var3_3);
                                                                                                                                                                                                            var4_8.append((String)var7_11);
                                                                                                                                                                                                            var3_3 = var4_8.toString();
                                                                                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        var43_47 = var36_40.isArray();
                                                                                                                                                                                                        if (!var43_47) break block118;
                                                                                                                                                                                                        var3_3 = aK2$a.a(var36_40.getComponentType());
                                                                                                                                                                                                        var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                                                                        var3_3 = new Fm2$j((String)var28_32, (boolean)var24_28);
                                                                                                                                                                                                        var4_8 = new em2_2((fm2_2)var3_3);
                                                                                                                                                                                                        ** GOTO lbl351
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var15_19.f((Type)var26_30, (Annotation[])var16_20);
                                                                                                                                                                                                    var3_3 = new Fm2$j((String)var28_32, (boolean)var24_28);
                                                                                                                                                                                                    ** GOTO lbl353
                                                                                                                                                                                                }
                                                                                                                                                                                                var38_42 /* !! */  = var13_17;
                                                                                                                                                                                                var5_9 = var25_29 instanceof rc2_2;
                                                                                                                                                                                                if (var5_9 == 0) break block119;
                                                                                                                                                                                                var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                                                                var25_29 = (rc2_2)var25_29;
                                                                                                                                                                                                var24_28 = (int)var25_29.encoded();
                                                                                                                                                                                                var28_32 = cz3_0.e((Type)var26_30);
                                                                                                                                                                                                var12_16 = 1;
                                                                                                                                                                                                var9_13.l = var12_16;
                                                                                                                                                                                                var42_46 = (int)var4_8.isAssignableFrom((Class<?>)var28_32);
                                                                                                                                                                                                if (var42_46 == 0) break block120;
                                                                                                                                                                                                var42_46 = var26_30 instanceof ParameterizedType;
                                                                                                                                                                                                if (var42_46 == 0) break block121;
                                                                                                                                                                                                var3_3 = var26_30;
                                                                                                                                                                                                var3_3 = (ParameterizedType)var26_30;
                                                                                                                                                                                                var42_46 = 0;
                                                                                                                                                                                                var3_3 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                                                                                var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                                                                var3_3 = new Fm2$l((boolean)var24_28);
                                                                                                                                                                                                var4_8 = new dm2_2((fm2_2)var3_3);
                                                                                                                                                                                                ** GOTO lbl351
                                                                                                                                                                                            }
                                                                                                                                                                                            var4_8 = new StringBuilder();
                                                                                                                                                                                            var25_29 = var28_32.getSimpleName();
                                                                                                                                                                                            var4_8.append((String)var25_29);
                                                                                                                                                                                            var4_8.append((String)var3_3);
                                                                                                                                                                                            var3_3 = var28_32.getSimpleName();
                                                                                                                                                                                            var4_8.append((String)var3_3);
                                                                                                                                                                                            var4_8.append((String)var7_11);
                                                                                                                                                                                            var3_3 = var4_8.toString();
                                                                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                                                                                        }
                                                                                                                                                                                        var43_47 = var28_32.isArray();
                                                                                                                                                                                        if (var43_47) {
                                                                                                                                                                                            var3_3 = aK2$a.a(var28_32.getComponentType());
                                                                                                                                                                                            var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                                                            var3_3 = new Fm2$l((boolean)var24_28);
                                                                                                                                                                                            var4_8 = new em2_2((fm2_2)var3_3);
                                                                                                                                                                                            ** continue;
                                                                                                                                                                                        }
                                                                                                                                                                                        var15_19.f((Type)var26_30, (Annotation[])var16_20);
                                                                                                                                                                                        var3_3 = new Fm2$l((boolean)var24_28);
                                                                                                                                                                                        ** continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    var5_9 = var25_29 instanceof qc2_2;
                                                                                                                                                                                    var13_17 = "Map must include generic types (e.g., Map<String, String>)";
                                                                                                                                                                                    var40_44 = var17_21;
                                                                                                                                                                                    var41_45 = var29_33;
                                                                                                                                                                                    var22_26 = Map.class;
                                                                                                                                                                                    if (var5_9 == 0) break block122;
                                                                                                                                                                                    var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                                                    var3_3 = cz3_0.e((Type)var26_30);
                                                                                                                                                                                    var42_46 = 1;
                                                                                                                                                                                    var9_13.m = var42_46;
                                                                                                                                                                                    var5_9 = (int)var22_26.isAssignableFrom((Class<?>)var3_3);
                                                                                                                                                                                    if (var5_9 == 0) break block123;
                                                                                                                                                                                    var5_9 = (var3_3 = cz3_0.f((Type)var26_30, (Class)var3_3)) instanceof ParameterizedType;
                                                                                                                                                                                    if (var5_9 == 0) break block124;
                                                                                                                                                                                    var3_3 = (ParameterizedType)var3_3;
                                                                                                                                                                                    var5_9 = 0;
                                                                                                                                                                                    var28_32 = null;
                                                                                                                                                                                    var7_11 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                                                                    if (var36_40 != var7_11) break block125;
                                                                                                                                                                                    var3_3 = cz3_0.d(var42_46, (ParameterizedType)var3_3);
                                                                                                                                                                                    var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                                                    var25_29 = (qc2_2)var25_29;
                                                                                                                                                                                    var42_46 = var25_29.encoded();
                                                                                                                                                                                    var3_3 = new Fm2$k((Method)var14_18, var11_15, (boolean)var42_46);
lbl454:
                                                                                                                                                                                    // 7 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        var37_41 = var8_12;
                                                                                                                                                                                        ** GOTO lbl248
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var3_3 = new StringBuilder("@QueryMap keys must be of type String: ");
                                                                                                                                                                                var3_3.append(var7_11);
                                                                                                                                                                                var3_3 = var3_3.toString();
                                                                                                                                                                                var4_8 = new Object[]{};
                                                                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                                                                            }
                                                                                                                                                                            var3_3 = new Object[]{};
                                                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var13_17, (Object[])var3_3);
                                                                                                                                                                        }
                                                                                                                                                                        var4_8 = new Object[]{};
                                                                                                                                                                        throw cz3_0.k((Method)var14_18, var11_15, "@QueryMap parameter type must be Map.", (Object[])var4_8);
                                                                                                                                                                    }
                                                                                                                                                                    var5_9 = var25_29 instanceof v31_0;
                                                                                                                                                                    if (var5_9 == 0) break block126;
                                                                                                                                                                    var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                                    var25_29 = (v31_0)var25_29;
                                                                                                                                                                    var28_32 = var25_29.value();
                                                                                                                                                                    var13_17 = cz3_0.e((Type)var26_30);
                                                                                                                                                                    var42_46 = (int)var4_8.isAssignableFrom((Class<?>)var13_17);
                                                                                                                                                                    if (var42_46 == 0) break block127;
                                                                                                                                                                    var42_46 = var26_30 instanceof ParameterizedType;
                                                                                                                                                                    if (var42_46 == 0) break block128;
                                                                                                                                                                    var3_3 = var26_30;
                                                                                                                                                                    var3_3 = (ParameterizedType)var26_30;
                                                                                                                                                                    var3_3 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                                                    var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                                    var42_46 = var25_29.allowUnsafeNonAsciiValues();
                                                                                                                                                                    var3_3 = new Fm2$d((String)var28_32, (boolean)var42_46);
                                                                                                                                                                    var4_8 = new dm2_2((fm2_2)var3_3);
lbl488:
                                                                                                                                                                    // 4 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        var3_3 = var4_8;
                                                                                                                                                                        ** GOTO lbl454
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var4_8 = new StringBuilder();
                                                                                                                                                                var25_29 = var13_17.getSimpleName();
                                                                                                                                                                var4_8.append((String)var25_29);
                                                                                                                                                                var4_8.append((String)var3_3);
                                                                                                                                                                var3_3 = var13_17.getSimpleName();
                                                                                                                                                                var4_8.append((String)var3_3);
                                                                                                                                                                var4_8.append((String)var7_11);
                                                                                                                                                                var3_3 = var4_8.toString();
                                                                                                                                                                var4_8 = new Object[]{};
                                                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                                                            }
                                                                                                                                                            var43_47 = var13_17.isArray();
                                                                                                                                                            if (!var43_47) break block129;
                                                                                                                                                            var3_3 = aK2$a.a(var13_17.getComponentType());
                                                                                                                                                            var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                            var42_46 = (int)var25_29.allowUnsafeNonAsciiValues();
                                                                                                                                                            var3_3 = new Fm2$d((String)var28_32, (boolean)var42_46);
                                                                                                                                                            var4_8 = new em2_2((fm2_2)var3_3);
                                                                                                                                                            ** GOTO lbl488
                                                                                                                                                        }
                                                                                                                                                        var15_19.f((Type)var26_30, (Annotation[])var16_20);
                                                                                                                                                        var42_46 = (int)var25_29.allowUnsafeNonAsciiValues();
                                                                                                                                                        var3_3 = new Fm2$d((String)var28_32, (boolean)var42_46);
                                                                                                                                                        ** GOTO lbl454
                                                                                                                                                    }
                                                                                                                                                    var5_9 = var25_29 instanceof y31_0;
                                                                                                                                                    if (var5_9 == 0) break block130;
                                                                                                                                                    var3_3 = m41_0.class;
                                                                                                                                                    if (var26_30 != var3_3) break block131;
                                                                                                                                                    var3_3 = new Fm2$f((Method)var14_18, var11_15);
                                                                                                                                                    ** GOTO lbl454
                                                                                                                                                }
                                                                                                                                                var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                                var3_3 = cz3_0.e((Type)var26_30);
                                                                                                                                                var42_46 = (int)var22_26.isAssignableFrom((Class<?>)var3_3);
                                                                                                                                                if (var42_46 == 0) break block132;
                                                                                                                                                var42_46 = (var3_3 = cz3_0.f((Type)var26_30, (Class)var3_3)) instanceof ParameterizedType;
                                                                                                                                                if (var42_46 == 0) break block133;
                                                                                                                                                var3_3 = (ParameterizedType)var3_3;
                                                                                                                                                var42_46 = 0;
                                                                                                                                                var4_8 = null;
                                                                                                                                                var28_32 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                                if (var36_40 != var28_32) break block134;
                                                                                                                                                var3_3 = cz3_0.d(1, (ParameterizedType)var3_3);
                                                                                                                                                var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                                var25_29 = (y31_0)var25_29;
                                                                                                                                                var42_46 = (int)var25_29.allowUnsafeNonAsciiValues();
                                                                                                                                                var3_3 = new Fm2$e((Method)var14_18, var11_15, (boolean)var42_46);
                                                                                                                                                ** GOTO lbl454
                                                                                                                                            }
                                                                                                                                            var3_3 = new StringBuilder("@HeaderMap keys must be of type String: ");
                                                                                                                                            var3_3.append(var28_32);
                                                                                                                                            var3_3 = var3_3.toString();
                                                                                                                                            var4_8 = new Object[]{};
                                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                                        }
                                                                                                                                        var3_3 = new Object[]{};
                                                                                                                                        throw cz3_0.k((Method)var14_18, var11_15, (String)var13_17, (Object[])var3_3);
                                                                                                                                    }
                                                                                                                                    var4_8 = new Object[]{};
                                                                                                                                    throw cz3_0.k((Method)var14_18, var11_15, "@HeaderMap parameter type must be Map or Headers.", (Object[])var4_8);
                                                                                                                                }
                                                                                                                                var5_9 = var25_29 instanceof fl0_2;
                                                                                                                                if (var5_9 == 0) break block135;
                                                                                                                                var9_13.c(var11_15, (Type)var26_30);
                                                                                                                                var5_9 = (int)var9_13.q;
                                                                                                                                if (var5_9 == 0) break block136;
                                                                                                                                var25_29 = (fl0_2)var25_29;
                                                                                                                                var28_32 = var25_29.value();
                                                                                                                                var24_28 = var25_29.encoded();
                                                                                                                                var12_16 = 1;
                                                                                                                                var9_13.g = var12_16;
                                                                                                                                var13_17 = cz3_0.e((Type)var26_30);
                                                                                                                                var42_46 = (int)var4_8.isAssignableFrom((Class<?>)var13_17);
                                                                                                                                if (var42_46 == 0) break block137;
                                                                                                                                var42_46 = var26_30 instanceof ParameterizedType;
                                                                                                                                if (var42_46 == 0) break block138;
                                                                                                                                var3_3 = var26_30;
                                                                                                                                var3_3 = (ParameterizedType)var26_30;
                                                                                                                                var42_46 = 0;
                                                                                                                                var3_3 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                var3_3 = new Fm2$b((String)var28_32, (boolean)var24_28);
                                                                                                                                var4_8 = new dm2_2((fm2_2)var3_3);
                                                                                                                                ** GOTO lbl488
                                                                                                                            }
                                                                                                                            var4_8 = new StringBuilder();
                                                                                                                            var25_29 = var13_17.getSimpleName();
                                                                                                                            var4_8.append((String)var25_29);
                                                                                                                            var4_8.append((String)var3_3);
                                                                                                                            var3_3 = var13_17.getSimpleName();
                                                                                                                            var4_8.append((String)var3_3);
                                                                                                                            var4_8.append((String)var7_11);
                                                                                                                            var3_3 = var4_8.toString();
                                                                                                                            var4_8 = new Object[]{};
                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                        }
                                                                                                                        var43_47 = var13_17.isArray();
                                                                                                                        if (var43_47) {
                                                                                                                            var3_3 = aK2$a.a(var13_17.getComponentType());
                                                                                                                            var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                            var3_3 = new Fm2$b((String)var28_32, (boolean)var24_28);
                                                                                                                            var4_8 = new em2_2((fm2_2)var3_3);
                                                                                                                            ** continue;
                                                                                                                        }
                                                                                                                        var15_19.f((Type)var26_30, (Annotation[])var16_20);
                                                                                                                        var3_3 = new Fm2$b((String)var28_32, (boolean)var24_28);
                                                                                                                        ** GOTO lbl454
                                                                                                                    }
                                                                                                                    var4_8 = new Object[]{};
                                                                                                                    throw cz3_0.k((Method)var14_18, var11_15, "@Field parameters can only be used with form encoding.", (Object[])var4_8);
                                                                                                                }
                                                                                                                var5_9 = var25_29 instanceof gl0_2;
                                                                                                                if (var5_9 != 0) {
                                                                                                                    var9_13.c(var11_15, (Type)var26_30);
                                                                                                                    var43_47 = var9_13.q;
                                                                                                                    if (var43_47) {
                                                                                                                        var3_3 = cz3_0.e((Type)var26_30);
                                                                                                                        var42_46 = (int)var22_26.isAssignableFrom((Class<?>)var3_3);
                                                                                                                        if (var42_46 != 0) {
                                                                                                                            var42_46 = (var3_3 = cz3_0.f((Type)var26_30, (Class)var3_3)) instanceof ParameterizedType;
                                                                                                                            if (var42_46 != 0) {
                                                                                                                                var3_3 = (ParameterizedType)var3_3;
                                                                                                                                var42_46 = 0;
                                                                                                                                var4_8 = null;
                                                                                                                                var28_32 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                                                                                if (var36_40 == var28_32) {
                                                                                                                                    var42_46 = 1;
                                                                                                                                    var3_3 = cz3_0.d(var42_46, (ParameterizedType)var3_3);
                                                                                                                                    var15_19.f((Type)var3_3, (Annotation[])var16_20);
                                                                                                                                    var9_13.g = var42_46;
                                                                                                                                    var25_29 = (gl0_2)var25_29;
                                                                                                                                    var42_46 = (int)var25_29.encoded();
                                                                                                                                    var3_3 = new Fm2$c((Method)var14_18, var11_15, (boolean)var42_46);
                                                                                                                                    ** continue;
                                                                                                                                }
                                                                                                                                var3_3 = new StringBuilder("@FieldMap keys must be of type String: ");
                                                                                                                                var3_3.append(var28_32);
                                                                                                                                var3_3 = var3_3.toString();
                                                                                                                                var4_8 = new Object[]{};
                                                                                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                                            }
                                                                                                                            var3_3 = new Object[]{};
                                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var13_17, (Object[])var3_3);
                                                                                                                        }
                                                                                                                        var4_8 = new Object[]{};
                                                                                                                        throw cz3_0.k((Method)var14_18, var11_15, "@FieldMap parameter type must be Map.", (Object[])var4_8);
                                                                                                                    }
                                                                                                                    var4_8 = new Object[]{};
                                                                                                                    throw cz3_0.k((Method)var14_18, var11_15, "@FieldMap parameters can only be used with form encoding.", (Object[])var4_8);
                                                                                                                }
                                                                                                                var5_9 = var25_29 instanceof bn2_2;
                                                                                                                var37_41 = var8_12;
                                                                                                                var30_34 = cr1$c_0.class;
                                                                                                                if (var5_9 == 0) break block139;
                                                                                                                var9_13.c(var11_15, (Type)var26_30);
                                                                                                                var5_9 = (int)var9_13.r;
                                                                                                                if (var5_9 == 0) break block140;
                                                                                                                var25_29 = (bn2_2)var25_29;
                                                                                                                var5_9 = 1;
                                                                                                                var9_13.h = var5_9;
                                                                                                                var28_32 = var25_29.value();
                                                                                                                var13_17 = cz3_0.e((Type)var26_30);
                                                                                                                var17_21 = (int)var28_32.isEmpty();
                                                                                                                if (var17_21 == 0) break block141;
                                                                                                                var42_46 = var4_8.isAssignableFrom((Class<?>)var13_17);
                                                                                                                var25_29 = Fm2$m.a;
                                                                                                                var28_32 = "@Part annotation must supply a name or use MultipartBody.Part parameter type.";
                                                                                                                if (var42_46 == 0) break block142;
                                                                                                                var42_46 = var26_30 instanceof ParameterizedType;
                                                                                                                if (var42_46 == 0) break block143;
                                                                                                                var3_3 = var26_30;
                                                                                                                var3_3 = (ParameterizedType)var26_30;
                                                                                                                var42_46 = 0;
                                                                                                                var4_8 = null;
                                                                                                                var43_47 = var30_34.isAssignableFrom((Class<?>)(var3_3 = cz3_0.e(cz3_0.d(0, (ParameterizedType)var3_3))));
                                                                                                                if (!var43_47) break block144;
                                                                                                                var3_3 = new dm2_2((fm2_2)var25_29);
                                                                                                                ** GOTO lbl248
                                                                                                            }
                                                                                                            var3_3 = new Object[]{};
                                                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var28_32, (Object[])var3_3);
                                                                                                        }
                                                                                                        var4_8 = new StringBuilder();
                                                                                                        var25_29 = var13_17.getSimpleName();
                                                                                                        var4_8.append((String)var25_29);
                                                                                                        var4_8.append((String)var3_3);
                                                                                                        var3_3 = var13_17.getSimpleName();
                                                                                                        var4_8.append((String)var3_3);
                                                                                                        var4_8.append((String)var7_11);
                                                                                                        var3_3 = var4_8.toString();
                                                                                                        var4_8 = new Object[]{};
                                                                                                        throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                                                    }
                                                                                                    var43_47 = var13_17.isArray();
                                                                                                    if (!var43_47) break block145;
                                                                                                    var3_3 = var13_17.getComponentType();
                                                                                                    var43_47 = var30_34.isAssignableFrom((Class<?>)var3_3);
                                                                                                    if (!var43_47) break block146;
                                                                                                    var3_3 = new em2_2((fm2_2)var25_29);
                                                                                                    ** GOTO lbl248
                                                                                                }
                                                                                                var3_3 = new Object[]{};
                                                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var28_32, (Object[])var3_3);
                                                                                            }
                                                                                            var42_46 = 0;
                                                                                            var4_8 = null;
                                                                                            var43_47 = var30_34.isAssignableFrom((Class<?>)var13_17);
                                                                                            if (!var43_47) break block147;
lbl709:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var3_3 = var25_29;
                                                                                                ** GOTO lbl248
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var3_3 = new Object[]{};
                                                                                        throw cz3_0.k((Method)var14_18, var11_15, (String)var28_32, (Object[])var3_3);
                                                                                    }
                                                                                    var28_32 = cP.a("form-data; name=\"", (String)var28_32, "\"");
                                                                                    var25_29 = var25_29.encoding();
                                                                                    var22_26 = "Content-Disposition";
                                                                                    var36_40 = "Content-Transfer-Encoding";
                                                                                    var25_29 = m41$b.c(new String[]{var22_26, var28_32, var36_40, var25_29});
                                                                                    var42_46 = var4_8.isAssignableFrom((Class<?>)var13_17);
                                                                                    var28_32 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.";
                                                                                    if (var42_46 == 0) break block148;
                                                                                    var42_46 = var26_30 instanceof ParameterizedType;
                                                                                    if (var42_46 == 0) break block149;
                                                                                    var3_3 = var26_30;
                                                                                    var3_3 = (ParameterizedType)var26_30;
                                                                                    var4_8 = cz3_0.e((Type)(var3_3 = cz3_0.d(0, (ParameterizedType)var3_3)));
                                                                                    var42_46 = var30_34.isAssignableFrom((Class<?>)var4_8);
                                                                                    if (var42_46 != 0) break block150;
                                                                                    var3_3 = var15_19.d((Type)var3_3, (Annotation[])var16_20, (Annotation[])var10_14);
                                                                                    var4_8 = new Fm2$g((Method)var14_18, var11_15, (m41_0)var25_29, (x80_0)var3_3);
                                                                                    var3_3 = new dm2_2((fm2_2)var4_8);
                                                                                    ** GOTO lbl248
                                                                                }
                                                                                var3_3 = new Object[]{};
                                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var28_32, (Object[])var3_3);
                                                                            }
                                                                            var4_8 = new StringBuilder();
                                                                            var25_29 = var13_17.getSimpleName();
                                                                            var4_8.append((String)var25_29);
                                                                            var4_8.append((String)var3_3);
                                                                            var3_3 = var13_17.getSimpleName();
                                                                            var4_8.append((String)var3_3);
                                                                            var4_8.append((String)var7_11);
                                                                            var3_3 = var4_8.toString();
                                                                            var4_8 = new Object[]{};
                                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                        }
                                                                        var43_47 = var13_17.isArray();
                                                                        if (!var43_47) break block151;
                                                                        var3_3 = aK2$a.a(var13_17.getComponentType());
                                                                        var42_46 = var30_34.isAssignableFrom((Class<?>)var3_3);
                                                                        if (var42_46 != 0) break block152;
                                                                        var3_3 = var15_19.d((Type)var3_3, (Annotation[])var16_20, (Annotation[])var10_14);
                                                                        var4_8 = new Fm2$g((Method)var14_18, var11_15, (m41_0)var25_29, (x80_0)var3_3);
                                                                        var3_3 = new em2_2((fm2_2)var4_8);
                                                                        ** GOTO lbl248
                                                                    }
                                                                    var3_3 = new Object[]{};
                                                                    throw cz3_0.k((Method)var14_18, var11_15, (String)var28_32, (Object[])var3_3);
                                                                }
                                                                var42_46 = 0;
                                                                var4_8 = null;
                                                                var43_47 = var30_34.isAssignableFrom((Class<?>)var13_17);
                                                                if (var43_47) break block153;
                                                                var3_3 = var15_19.d((Type)var26_30, (Annotation[])var16_20, (Annotation[])var10_14);
                                                                var3_3 = var28_32 = new Fm2$g((Method)var14_18, var11_15, (m41_0)var25_29, (x80_0)var3_3);
                                                                ** GOTO lbl248
                                                            }
                                                            var3_3 = new Object[]{};
                                                            throw cz3_0.k((Method)var14_18, var11_15, (String)var28_32, (Object[])var3_3);
                                                        }
                                                        var4_8 = new Object[]{};
                                                        throw cz3_0.k((Method)var14_18, var11_15, "@Part parameters can only be used with multipart encoding.", (Object[])var4_8);
                                                    }
                                                    var43_47 = var25_29 instanceof cn2_2;
                                                    if (var43_47) {
                                                        var9_13.c(var11_15, (Type)var26_30);
                                                        var43_47 = var9_13.r;
                                                        if (var43_47) {
                                                            var9_13.h = var42_46 = 1;
                                                            var3_3 = cz3_0.e((Type)var26_30);
                                                            var5_9 = (int)var22_26.isAssignableFrom((Class<?>)var3_3);
                                                            if (var5_9 != 0) {
                                                                var5_9 = (var3_3 = cz3_0.f((Type)var26_30, (Class)var3_3)) instanceof ParameterizedType;
                                                                if (var5_9 != 0) {
                                                                    var3_3 = (ParameterizedType)var3_3;
                                                                    var5_9 = 0;
                                                                    var28_32 = null;
                                                                    var7_11 = cz3_0.d(0, (ParameterizedType)var3_3);
                                                                    if (var36_40 == var7_11) {
                                                                        var4_8 = cz3_0.e((Type)(var3_3 = cz3_0.d(var42_46, (ParameterizedType)var3_3)));
                                                                        if ((var42_46 = var30_34.isAssignableFrom((Class<?>)var4_8)) == 0) {
                                                                            var3_3 = var15_19.d((Type)var3_3, (Annotation[])var16_20, (Annotation[])var10_14);
                                                                            var25_29 = (cn2_2)var25_29;
                                                                            var25_29 = var25_29.encoding();
                                                                            var3_3 = var4_8 = new Fm2$h((Method)var14_18, var11_15, (x80_0)var3_3, (String)var25_29);
                                                                            ** continue;
                                                                        }
                                                                        var4_8 = new Object[]{};
                                                                        throw cz3_0.k((Method)var14_18, var11_15, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", (Object[])var4_8);
                                                                    }
                                                                    var3_3 = new StringBuilder("@PartMap keys must be of type String: ");
                                                                    var3_3.append(var7_11);
                                                                    var3_3 = var3_3.toString();
                                                                    var4_8 = new Object[]{};
                                                                    throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                                }
                                                                var3_3 = new Object[]{};
                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var13_17, (Object[])var3_3);
                                                            }
                                                            var4_8 = new Object[]{};
                                                            throw cz3_0.k((Method)var14_18, var11_15, "@PartMap parameter type must be Map.", (Object[])var4_8);
                                                        }
                                                        var4_8 = new Object[]{};
                                                        throw cz3_0.k((Method)var14_18, var11_15, "@PartMap parameters can only be used with multipart encoding.", (Object[])var4_8);
                                                    }
                                                    var43_47 = var25_29 instanceof sy_2;
                                                    if (var43_47) {
                                                        var9_13.c(var11_15, (Type)var26_30);
                                                        var43_47 = var9_13.q;
                                                        if (!var43_47 && !(var43_47 = var9_13.r)) {
                                                            var43_47 = var9_13.i;
                                                            if (!var43_47) {
                                                                try {
                                                                    var3_3 = var15_19.d((Type)var26_30, (Annotation[])var16_20, (Annotation[])var10_14);
                                                                    var42_46 = 1;
                                                                }
                                                                catch (RuntimeException var3_5) {
                                                                    var25_29 = var3_5;
                                                                    var4_8 = new Object[]{var26_30};
                                                                    throw cz3_0.l((Method)var14_18, var3_5, var11_15, "Unable to create @Body converter for %s", (Object[])var4_8);
                                                                }
                                                                var9_13.i = var42_46;
                                                                var25_29 = new Fm2$a((Method)var14_18, var11_15, (x80_0)var3_3);
                                                                ** continue;
                                                            }
                                                            var4_8 = new Object[]{};
                                                            throw cz3_0.k((Method)var14_18, var11_15, "Multiple @Body method annotations found.", (Object[])var4_8);
                                                        }
                                                        var4_8 = new Object[]{};
                                                        throw cz3_0.k((Method)var14_18, var11_15, "@Body parameters cannot be used with form or multi-part encoding.", (Object[])var4_8);
                                                    }
                                                    var43_47 = var25_29 instanceof ui3_2;
                                                    if (var43_47) {
                                                        var9_13.c(var11_15, (Type)var26_30);
                                                        var3_3 = cz3_0.e((Type)var26_30);
                                                        var42_46 = 1;
                                                        for (var24_28 = var11_15 + -1; var24_28 >= 0; var24_28 += var42_46) {
                                                            var4_8 = var9_13.w[var24_28];
                                                            var5_9 = var4_8 instanceof Fm2$o;
                                                            if (var5_9 != 0 && (var42_46 = (int)(var4_8 = ((Fm2$o)var4_8).a).equals(var3_3)) != 0) {
                                                                var4_8 = new StringBuilder("@Tag type ");
                                                                var3_3 = var3_3.getName();
                                                                var4_8.append((String)var3_3);
                                                                var4_8.append(" is duplicate of ");
                                                                var3_3 = at2_2.b.a((Method)var14_18, var24_28);
                                                                var4_8.append((String)var3_3);
                                                                var4_8.append(" and would always overwrite its value.");
                                                                var3_3 = var4_8.toString();
                                                                var4_8 = new Object[]{};
                                                                throw cz3_0.k((Method)var14_18, var11_15, (String)var3_3, (Object[])var4_8);
                                                            }
                                                            var42_46 = -1;
                                                        }
                                                        var42_46 = -1;
                                                        var3_3 = var25_29 = new Fm2$o((Class)var3_3);
                                                    } else {
                                                        var42_46 = -1;
                                                        var43_47 = false;
                                                        var3_3 = null;
                                                    }
                                                }
                                                if (var3_3 == null) lbl-1000:
                                                // 2 sources

                                                {
                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                if (var31_35 != null) break;
                                                var31_35 = var3_3;
                                                ** continue;
                                                var24_28 = 1;
                                                var8_12 = var37_41 + 1;
                                                var3_3 = var0;
                                                var4_8 = var2_2;
                                                var25_29 = var32_36;
                                                var5_9 = var33_37;
                                                var6_10 = var34_38;
                                                var23_27 = var35_39;
                                                var15_19 = var39_43;
                                                var13_17 = var38_42 /* !! */ ;
                                                var17_21 = var40_44;
                                                var29_33 = var41_45;
                                            }
                                            var4_8 = new Object[]{};
                                            throw cz3_0.k((Method)var14_18, var11_15, "Multiple Retrofit annotations found, only one allowed.", (Object[])var4_8);
                                        }
                                        var33_37 = var5_9;
                                        var34_38 = var6_10;
                                        var38_42 /* !! */  = var13_17;
                                        var39_43 = var15_19;
                                        var40_44 = var17_21;
                                        var41_45 = var29_33;
                                        var42_46 = -1;
                                        break block154;
                                    }
                                    var32_36 = var25_29;
                                    var33_37 = var5_9;
                                    var34_38 = var6_10;
                                    var38_42 /* !! */  = var13_17;
                                    var39_43 = var15_19;
                                    var40_44 = var17_21;
                                    var41_45 = var29_33;
                                    var42_46 = -1;
                                    var18_22 = 0;
                                    var31_35 = null;
                                }
                                if (var31_35 == null) {
                                    block89: {
                                        if (var40_44 != 0) {
                                            try {
                                                var3_3 = cz3_0.e((Type)var26_30);
                                                var25_29 = f80_0.class;
                                                if (var3_3 != var25_29) break block89;
                                                var24_28 = 1;
                                            }
                                            catch (NoClassDefFoundError v0) {}
                                            var9_13.x = var24_28;
                                            var18_22 = 0;
                                            var31_35 = null;
                                            break block90;
                                        }
                                    }
                                    var4_8 = new Object[]{};
                                    throw cz3_0.k((Method)var14_18, var11_15, "No Retrofit annotation found.", (Object[])var4_8);
                                }
                            }
                            var38_42 /* !! */ [var11_15] = var31_35;
                            var24_28 = 1;
                            var3_3 = var0;
                            var4_8 = var2_2;
                            var25_29 = var32_36;
                            var5_9 = var33_37;
                            var6_10 = var34_38;
                            var15_19 = var39_43;
                            var8_12 = 1;
                        }
                        var39_43 = var15_19;
                        var24_28 = 1;
                        var3_3 = var9_13.s;
                        if (var3_3 == null && !(var43_47 = var9_13.n)) {
                            var3_3 = var9_13.o;
                            var4_8 = new Object[var24_28];
                            var4_8[0] = var3_3;
                            throw cz3_0.j((Method)var14_18, null, "Missing either @%s URL or @Url parameter.", (Object[])var4_8);
                        }
                        var43_47 = var9_13.q;
                        if (!var43_47 && (var42_46 = var9_13.r) == 0 && (var42_46 = var9_13.p) == 0 && (var42_46 = var9_13.i) != 0) {
                            var3_3 = new Object[]{};
                            throw cz3_0.j((Method)var14_18, null, "Non-body HTTP method cannot contain @Body.", (Object[])var3_3);
                        }
                        if (var43_47 && !(var43_47 = var9_13.g)) {
                            var3_3 = new Object[]{};
                            throw cz3_0.j((Method)var14_18, null, "Form-encoded method must contain at least one @Field.", (Object[])var3_3);
                        }
                        var43_47 = var9_13.r;
                        if (var43_47 && !(var43_47 = var9_13.h)) {
                            var3_3 = new Object[]{};
                            throw cz3_0.j((Method)var14_18, null, "Multipart method must contain at least one @Part.", (Object[])var3_3);
                        }
                        var25_29 = new ak2_2((aK2$a)var9_13);
                        var3_3 = var2_2.getGenericReturnType();
                        var42_46 = cz3_0.g((Type)var3_3);
                        if (var42_46 != 0) break block155;
                        var4_8 = Void.TYPE;
                        if (var3_3 == var4_8) break block156;
                        var3_3 = var2_2.getAnnotations();
                        var42_46 = (int)var25_29.l;
                        var28_32 = dl2_2.class;
                        if (var42_46 == 0) ** GOTO lbl1013
                        var7_11 = var2_2.getGenericParameterTypes();
                        var8_12 = ((Object[])var7_11).length - 1;
                        var7_11 = ((ParameterizedType)var7_11[var8_12]).getActualTypeArguments();
                        var8_12 = 0;
                        var30_34 = null;
                        var44_48 = (var7_11 = var7_11[0]) instanceof WildcardType;
                        if (var44_48) {
                            var7_11 = ((WildcardType)var7_11).getLowerBounds()[0];
                        }
                        var9_13 = cz3_0.e((Type)var7_11);
                        var10_14 = jj_2.class;
                        if (var9_13 != var28_32 || !(var44_48 = var7_11 instanceof ParameterizedType)) break block157;
                        var7_11 = (ParameterizedType)var7_11;
                        var7_11 = cz3_0.d(0, (ParameterizedType)var7_11);
                        var44_48 = false;
                        var9_13 = null;
                        var45_49 = 1;
                        ** GOTO lbl991
                    }
                    var9_13 = cz3_0.e((Type)var7_11);
                    if (var9_13 != var10_14) {
                        var44_48 = cz3_0.i((Type)var7_11);
                        var45_49 = 0;
lbl991:
                        // 2 sources

                        var12_16 = 1;
                        var14_18 = new Type[var12_16];
                        var14_18[0] = var7_11;
                        var27_31 = new Cz3$b(null, (Type)var10_14, var14_18);
                        var7_11 = b73_0.class;
                        var6_10 = (int)cz3_0.h((Annotation[])var3_3, (Class)var7_11);
                        if (var6_10 == 0) {
                            var6_10 = ((Object)var3_3).length + var12_16;
                            var7_11 = new Annotation[var6_10];
                            var7_11[0] = var10_14 = c73_0.a;
                            var46_50 = ((Object)var3_3).length;
                            System.arraycopy(var3_3, 0, var7_11, var12_16, var46_50);
                            var3_3 = var7_11;
                        }
                        var10_14 = var0;
                        var7_11 = var2_2;
                        var8_12 = var45_49;
                    } else {
                        var7_11 = (ParameterizedType)var7_11;
                        var3_3 = cz3_0.d(0, (ParameterizedType)var7_11);
                        var4_8 = new Object[]{var3_3};
                        var7_11 = var2_2;
                        throw cz3_0.j((Method)var2_2, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", (Object[])var4_8);
lbl1013:
                        // 1 sources

                        var7_11 = var2_2;
                        var27_31 = var2_2.getGenericReturnType();
                        var8_12 = 0;
                        var30_34 = null;
                        var44_48 = false;
                        var9_13 = null;
                        var10_14 = var0;
                    }
                    try {
                        var3_3 = var10_14.a((Type)var27_31, (Annotation[])var3_3);
                    }
                    catch (RuntimeException var3_7) {
                        var25_29 = var3_7;
                        var28_32 = new Object[]{var27_31};
                        throw cz3_0.j((Method)var7_11, var3_7, "Unable to create call adapter for %s", (Object[])var28_32);
                    }
                    var27_31 = var3_3.a();
                    var13_17 = cl2_2.class;
                    if (var27_31 != var13_17) {
                        if (var27_31 != var28_32) {
                            var28_32 = var25_29.d;
                            var13_17 = var39_43;
                            var5_9 = (int)var28_32.equals(var39_43);
                            if (var5_9 != 0 && (var5_9 = (int)(var28_32 = Void.class).equals(var27_31)) == 0 && (var5_9 = (int)cz3_0.i((Type)var27_31)) == 0) {
                                var3_3 = new Object[]{};
                                throw cz3_0.j((Method)var7_11, null, "HEAD method must use Void or Unit as response type.", (Object[])var3_3);
                            }
                            var28_32 = var2_2.getAnnotations();
                            try {
                                var7_11 = var10_14.e((Type)var27_31, (Annotation[])var28_32);
                            }
                            catch (RuntimeException var3_6) {
                                var4_8 = var3_6;
                                var25_29 = new Object[]{var27_31};
                                throw cz3_0.j((Method)var7_11, var3_6, "Unable to create converter for %s", (Object[])var25_29);
                            }
                            var28_32 = var10_14.b;
                            if (var42_46 == 0) {
                                var4_8 = new sb1$a((ak2_2)var25_29, (IJ$a)var28_32, (x80_0)var7_11, (kj_2)var3_3);
                            } else if (var8_12 != 0) {
                                var4_8 = new sb1$c((ak2_2)var25_29, (IJ$a)var28_32, (x80_0)var7_11, (kj_2)var3_3);
                            } else {
                                var4_8 = var10_14;
                                var30_34 = var3_3;
                                var10_14 = new sb1$b((ak2_2)var25_29, (IJ$a)var28_32, (x80_0)var7_11, (kj_2)var3_3, var44_48);
                            }
                            return var4_8;
                        }
                        var3_3 = new Object[]{};
                        throw cz3_0.j((Method)var7_11, null, "Response must include generic type (e.g., Response<String>)", (Object[])var3_3);
                    }
                    var3_3 = new StringBuilder("'");
                    var4_8 = cz3_0.e((Type)var27_31).getName();
                    var3_3.append((String)var4_8);
                    var3_3.append("' is not a valid response body type. Did you mean ResponseBody?");
                    var3_3 = var3_3.toString();
                    var4_8 = new Object[]{};
                    throw cz3_0.j((Method)var7_11, null, (String)var3_3, (Object[])var4_8);
                }
                var7_11 = var2_2;
                var3_3 = new Object[]{};
                throw cz3_0.j((Method)var2_2, null, "Service methods cannot return void.", (Object[])var3_3);
            }
            var7_11 = var2_2;
            var28_32 = new Object[]{var3_3};
            throw cz3_0.j((Method)var2_2, null, "Method return type must not include a type variable or wildcard: %s", (Object[])var28_32);
        }
        var3_3 = new Object[]{};
        throw cz3_0.j((Method)var14_18, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", (Object[])var3_3);
    }

    public abstract Object a(Object var1, Object[] var2);
}

