/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/*
 * Renamed from Fx1
 */
public final class fx1_1 {
    public static final xq_2 a;
    public static final xq_2 b;
    public static final nv_2 c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = fa1_1.class;
        Object object2 = Reflection.getOrCreateKotlinClass(object);
        kn1_1 kn1_12 = null;
        try {
            object = Reflection.typeOf(object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        at3_0 at3_02 = new at3_0((yn1_2)object2, (kn1_1)object);
        a = object = new xq_2("CallLogger", at3_02);
        object = Unit.class;
        object2 = Reflection.getOrCreateKotlinClass(object);
        try {
            kn1_12 = Reflection.typeOf(object);
        }
        catch (Throwable throwable) {}
        object = new at3_0((yn1_2)object2, kn1_12);
        b = object2 = new xq_2("DisableLogging", (at3_0)object);
        object = fx1$a_0.a;
        object2 = new Object();
        c = td0_2.a("Logging", (Function0)object, (Function1)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Serializable a(mv_2 var0, uf_1 var1_1, Long var2_2, k70_0 var3_3, l41_0 var4_4, f80_0 var5_5) {
        block22: {
            block20: {
                block21: {
                    block17: {
                        block18: {
                            block19: {
                                var6_6 = var1_1;
                                var7_7 /* !! */  = var2_2;
                                var8_8 = var5_5;
                                var9_9 = 1;
                                var10_10 = var5_5 instanceof gx1_2;
                                if (!var10_10) ** GOTO lbl-1000
                                var11_11 = var5_5;
                                var11_11 = (gx1_2)var5_5;
                                var12_12 = var11_11.i;
                                var13_13 = -1 << -1;
                                var14_14 = var12_12 & var13_13;
                                if (var14_14 != 0) {
                                    var11_11.i = var12_12 -= var13_13;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var11_11 = new h80_0((f80_0)var8_8);
                                }
                                var8_8 = var11_11.h;
                                var15_15 = j90_0.COROUTINE_SUSPENDED;
                                var13_13 = var11_11.i;
                                var14_14 = 0;
                                var16_16 = 2;
                                if (var13_13 == 0) break block17;
                                if (var13_13 == var9_9) break block18;
                                if (var13_13 != var16_16) break block19;
                                var17_17 = var11_11.g;
                                var18_18 = var11_11.f;
                                var11_11 = (if_1)var11_11.a;
                                vl2_2.b(var8_8);
                                break block20;
                            }
                            var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var6_6;
                        }
                        var17_17 = var11_11.f;
                        var7_7 /* !! */  = var11_11.e;
                        var19_19 = var11_11.d;
                        var20_20 = var11_11.c;
                        var21_21 = var11_11.b;
                        var22_22 = (mv_2)var11_11.a;
                        vl2_2.b(var8_8);
                        var23_23 = var8_8;
                        var24_24 = var17_17;
                        var6_6 = var21_21;
                        var21_21 = var22_22;
                        var22_22 = var19_19;
                        var19_19 = var8_8;
                        break block21;
                    }
                    vl2_2.b(var8_8);
                    var8_8 = ja1_1.a;
                    var24_24 = var4_4.c();
                    if (var24_24 != 0) {
                        var25_25 = Boolean.TRUE;
                        var8_8 = new xs3_0(var25_25, var7_7 /* !! */ , var6_6);
                        return var8_8;
                    }
                    if (var3_3 != null) {
                        var8_8 = m70_0.a(var3_3);
                        if (var8_8 == null) {
                            var8_8 = Charsets.UTF_8;
                        }
lbl59:
                        // 4 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var8_8 = Charsets.UTF_8;
                    ** while (true)
                    var19_19 = var8_8;
                    var24_24 = 1024;
                    var20_20 = new byte[var24_24];
                    var21_21 = var0;
                    var11_11.a = var0;
                    var11_11.b = var6_6;
                    var11_11.c = var7_7 /* !! */ ;
                    var11_11.d = var8_8;
                    var11_11.e = (byte[])var20_20;
                    var11_11.f = 0;
                    var11_11.i = var9_9;
                    var8_8 = wf_1.f((uf_1)var6_6, (byte[])var20_20, 0, var24_24, (f80_0)var11_11);
                    if (var8_8 == var15_15) {
                        return var15_15;
                    }
                    var22_22 = var19_19;
                    var19_19 = var8_8;
                    var24_24 = 0;
                    var8_8 = null;
                    var23_23 = var20_20;
                    var20_20 = var7_7 /* !! */ ;
                    var7_7 /* !! */  = var23_23;
                }
                var19_19 = (Number)var19_19;
                var13_13 = var19_19.intValue();
                if (var13_13 < var9_9) {
                    var8_8 = Boolean.FALSE;
                    var25_26 = new Long(0L);
                    var7_7 /* !! */  = new xs3_0(var8_8, var25_26, var6_6);
                    return var7_7 /* !! */ ;
                }
                var26_29 = new ee_2();
                Intrinsics.checkNotNullParameter(var26_29, "<this>");
                Intrinsics.checkNotNullParameter(var7_7 /* !! */ , "buffer");
                var26_29.n((byte[])var7_7 /* !! */ , 0, var13_13);
                var22_22 = var22_22.newDecoder();
                var27_30 = "newDecoder(...)";
                Intrinsics.checkNotNullExpressionValue(var22_22, var27_30);
                var22_22 = hz0_2.c((CharsetDecoder)var22_22, var26_29, var13_13);
                var28_31 = var22_22.length();
                var29_32 = -1;
                for (var30_33 = 0; var30_33 < var28_31; var30_33 += var9_9) {
                    var22_22.charAt(var30_33);
                    var29_32 += var9_9;
                }
                var28_31 = var22_22.length();
                for (var30_33 = 0; var30_33 < var28_31; var30_33 += var9_9) {
                    var31_34 = var22_22.charAt(var30_33);
                    if (var31_34 == (var16_16 = (int)((char)-3)) && var30_33 != var29_32) {
                        var24_24 = 1;
                        break;
                    }
                    var16_16 = 2;
                }
                if (var24_24 != 0) break block22;
                var32_35 = new if_1(false);
                var20_20 = var21_21.a;
                var22_22 = null;
                var0 = var21_21;
                var1_1 = var32_35;
                var2_2 = var7_7 /* !! */ ;
                var4_4 = var6_6;
                var5_5 = null;
                var21_21 = new hx1_2(var32_35, (byte[])var7_7 /* !! */ , var13_13, (uf_1)var6_6, null);
                var17_17 = 3;
                var6_6 = Ae3.a((i90_0)var20_20, null, (Function2)var21_21, var17_17);
                var11_11.a = var32_35;
                var11_11.b = null;
                var11_11.c = null;
                var11_11.d = null;
                var11_11.e = null;
                var11_11.f = var24_24;
                var11_11.g = var13_13;
                var11_11.i = var18_18 = 2;
                var6_6 = var6_6.D((f80_0)var11_11);
                var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                if (var6_6 == var15_15) {
                    return var15_15;
                }
                var18_18 = var24_24;
                var11_11 = var32_35;
                var8_8 = var6_6;
                var17_17 = var13_13;
            }
            var33_36 = ((Number)var8_8).longValue();
            if (var18_18 == 0) {
                var9_9 = 0;
                var25_27 = null;
            }
            var7_7 /* !! */  = (boolean)var9_9;
            var35_37 = var17_17;
            var6_6 = new Long(var33_36 += var35_37);
            var8_8 = new xs3_0(var7_7 /* !! */ , var6_6, var11_11);
            return var8_8;
        }
        if (var24_24 == 0) {
            var9_9 = 0;
            var25_28 = null;
        }
        var8_8 = (boolean)var9_9;
        var7_7 /* !! */  = new xs3_0(var8_8, var20_20, var6_6);
        return var7_7 /* !! */ ;
    }

    public static final boolean b(fw1_2 fw1_22) {
        boolean bl2;
        fw1_2 fw1_23 = fw1_2.BODY;
        if (fw1_22 != fw1_23 && fw1_22 != (fw1_23 = fw1_2.ALL)) {
            bl2 = false;
            fw1_22 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean c(fw1_2 fw1_22) {
        boolean bl2;
        fw1_2 fw1_23 = fw1_2.HEADERS;
        if (fw1_22 == fw1_23) {
            bl2 = true;
        } else {
            bl2 = false;
            fw1_22 = null;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object d(tx1_2 var0, mv_2 var1_1, bg2_2 var2_2, pa1_0 var3_3, q41_0 var4_4, f80_0 var5_5) {
        block25: {
            block20: {
                block17: {
                    block24: {
                        block18: {
                            block23: {
                                block22: {
                                    block19: {
                                        block21: {
                                            block12: {
                                                block13: {
                                                    block14: {
                                                        block15: {
                                                            block16: {
                                                                var6_6 = var5_5 instanceof ix1_2;
                                                                if (var6_6) {
                                                                    var7_7 /* !! */  = var5_5;
                                                                    var7_7 /* !! */  = (ix1_2)var5_5;
                                                                    var8_8 = var7_7 /* !! */ .d;
                                                                    var9_9 = -1 << -1;
                                                                    var10_10 = var8_8 & var9_9;
                                                                    if (var10_10 != 0) {
                                                                        var7_7 /* !! */ .d = var8_8 -= var9_9;
lbl10:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                var7_7 /* !! */  = new h80_0((f80_0)var5_5);
                                                                ** while (true)
                                                                var11_11 = var7_7 /* !! */ ;
                                                                var5_5 = var7_7 /* !! */ .c;
                                                                var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                                var8_8 = var11_11.d;
                                                                var9_9 = 3;
                                                                var12_12 = null;
                                                                var10_10 = 4;
                                                                var13_13 = 2;
                                                                var14_14 = 1;
                                                                if (var8_8 == 0) break block12;
                                                                if (var8_8 == var14_14) break block13;
                                                                if (var8_8 == var13_13) break block14;
                                                                if (var8_8 == var9_9) break block15;
                                                                if (var8_8 != var10_10) break block16;
                                                                var0 = var11_11.b;
                                                                var2_2 = var11_11.a;
                                                                vl2_2.b(var5_5);
                                                                break block17;
                                                            }
                                                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            throw var0;
                                                        }
                                                        var0 = var11_11.b;
                                                        var2_2 = var11_11.a;
                                                        vl2_2.b(var5_5);
                                                        break block18;
                                                    }
                                                    vl2_2.b(var5_5);
                                                    break block19;
                                                }
                                                vl2_2.b(var5_5);
                                                break block20;
                                            }
                                            vl2_2.b(var5_5);
                                            var15_15 = var2_2 instanceof bg2$a_0;
                                            if (!var15_15) break block21;
                                            var5_5 = var2_2;
                                            var5_5 = ((bg2$a_0)var2_2).e();
                                            var8_8 = ((Object)var5_5).length;
                                            var16_16 = var8_8;
                                            var18_17 = new Long(var16_16);
                                            var19_21 = cg2_0.c((byte[])var5_5);
                                            var11_11.d = var14_14;
                                            var20_24 = var0;
                                            if ((var0 = fx1_1.e((tx1_2)var0, (mv_2)var1_1, (bg2_2)var2_2, var18_17, var4_4, var3_3, var19_21, var11_11)) == var7_7 /* !! */ ) {
                                                return var7_7 /* !! */ ;
                                            }
                                            break block20;
                                        }
                                        var15_15 = var2_2 instanceof bg2$b_0;
                                        if (var15_15) {
                                            var2_2 = (bg2$b_0)var2_2;
                                            var2_2.getClass();
                                            var11_11.d = var13_13;
                                            var10_10 = 0;
                                            var20_25 = var0;
                                            var18_18 = var3_3;
                                            var5_5 = fx1_1.d((tx1_2)var0, (mv_2)var1_1, null, var3_3, var4_4, var11_11);
                                            if (var5_5 == var7_7 /* !! */ ) {
                                                return var7_7 /* !! */ ;
                                            } else {
                                                ** GOTO lbl75
                                            }
                                        }
                                        break block22;
                                    }
                                    return var5_5;
                                }
                                var15_15 = var2_2 instanceof bg2_1.c_0;
                                if (!var15_15) break block23;
                                var1_1 = new StringBuilder("--> END ");
                                var2_2 = var3_3.a;
                                var1_1.append((String)var2_2);
                                var1_1 = var1_1.toString();
                                var0.a((String)var1_1);
                                break block20;
                            }
                            var15_15 = var2_2 instanceof bg2$d_0;
                            if (!var15_15) break block24;
                            var5_5 = var2_2;
                            var5_5 = ((bg2$d_0)var2_2).e();
                            var20_26 = var1_1.a;
                            var5_5 = rf_1.b((uf_1)var5_5, (i90_0)var20_26);
                            var12_12 = var20_26 = var5_5.a;
                            var12_12 = (uf_1)var20_26;
                            var19_22 = var5_5 = var5_5.b;
                            var19_22 = (uf_1)var5_5;
                            var18_19 = ((bg2_2)var2_2).a();
                            var11_11.a = (bg2_2)var2_2;
                            var11_11.b = var12_12;
                            var11_11.d = var9_9;
                            var20_26 = var0;
                            if ((var0 = fx1_1.e((tx1_2)var0, (mv_2)var1_1, (bg2_2)var2_2, var18_19, var4_4, var3_3, (uf_1)var19_22, var11_11)) == var7_7 /* !! */ ) {
                                return var7_7 /* !! */ ;
                            }
                            var0 = var12_12;
                        }
                        var12_12 = new ox1_2((bg2_2)var2_2, (uf_1)var0);
                        break block20;
                    }
                    var15_15 = var2_2 instanceof bg2_1.e_0;
                    if (!var15_15) break block25;
                    var8_8 = 0;
                    var5_5 = new if_1(false);
                    var20_27 = var1_1.a;
                    var18_20 /* !! */  = new jx1_2((bg2_2)var2_2, (if_1)var5_5, null);
                    Ae3.d((i90_0)var20_27, null, null, var18_20 /* !! */ , var9_9);
                    var20_27 = var1_1.a;
                    var5_5 = rf_1.b((uf_1)var5_5, (i90_0)var20_27);
                    var12_12 = var20_27 = var5_5.a;
                    var12_12 = (uf_1)var20_27;
                    var19_23 = var5_5 = var5_5.b;
                    var19_23 = (uf_1)var5_5;
                    var18_20 /* !! */  = ((bg2_2)var2_2).a();
                    var11_11.a = (bg2_2)var2_2;
                    var11_11.b = var12_12;
                    var11_11.d = var10_10;
                    var20_27 = var0;
                    var0 = fx1_1.e((tx1_2)var0, (mv_2)var1_1, (bg2_2)var2_2, (Long)var18_20 /* !! */ , var4_4, var3_3, (uf_1)var19_23, var11_11);
                    if (var0 == var7_7 /* !! */ ) {
                        return var7_7 /* !! */ ;
                    }
                    var0 = var12_12;
                }
                var12_12 = new ox1_2((bg2_2)var2_2, (uf_1)var0);
            }
            return var12_12;
        }
        var0 = new NoWhenBranchMatchedException();
        throw var0;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object e(tx1_2 var0, mv_2 var1_1, bg2_2 var2_2, Long var3_3, q41_0 var4_4, pa1_0 var5_5, uf_1 var6_6, f80_0 var7_7) {
        block14: {
            block11: {
                block12: {
                    block13: {
                        var8_8 = var7_7;
                        var9_9 = var7_7 instanceof kx1_2;
                        if (var9_9 == '\u0000') ** GOTO lbl-1000
                        var10_10 = var7_7;
                        var10_10 = (kx1_2)var7_7;
                        var11_11 = var10_10.g;
                        var12_12 = -1 << -1;
                        var13_13 = var11_11 & var12_12;
                        if (var13_13 != 0) {
                            var10_10.g = var11_11 -= var12_12;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var10_10 = new h80_0((f80_0)var8_8);
                        }
                        var8_8 = var10_10.f;
                        var14_14 = j90_0.COROUTINE_SUSPENDED;
                        var11_11 = var10_10.g;
                        var12_12 = 1;
                        var15_15 = " (";
                        var16_16 = "--> END ";
                        var17_17 = 2;
                        if (var11_11 == 0) break block11;
                        if (var11_11 == var12_12) break block12;
                        if (var11_11 != var17_17) break block13;
                        var18_18 = var10_10.e;
                        var19_19 = (Charset)var10_10.d;
                        var20_20 = (Long)var10_10.c;
                        var21_21 = (pa1_0)var10_10.b;
                        var10_10 = var10_10.a;
                        vl2_2.b(var8_8);
                        ** GOTO lbl88
                    }
                    var8_8 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var8_8;
                }
                var18_18 = (pa1_0)var10_10.d;
                var19_19 = (l41_0)var10_10.c;
                var20_20 = (bg2_2)var10_10.b;
                var21_21 = var10_10.a;
                vl2_2.b(var8_8);
                var22_22 = var18_18;
                var23_23 = var19_19;
                var24_24 = var20_20;
                var18_18 = var8_8;
                var8_8 = var21_21;
                break block14;
            }
            vl2_2.b(var8_8);
            var21_21 = var2_2.b();
            var8_8 = var0;
            var10_10.a = var0;
            var24_24 = var2_2;
            var10_10.b = var2_2;
            var23_23 = var4_4;
            var10_10.c = var4_4;
            var22_22 = var5_5;
            var10_10.d = var5_5;
            var10_10.g = var12_12;
            var18_18 = var1_1;
            var19_19 = var6_6;
            var20_20 = var3_3;
            var18_18 = fx1_1.a(var1_1, var6_6, var3_3, (k70_0)var21_21, var4_4, (f80_0)var10_10);
            if (var18_18 == var14_14) {
                return var14_14;
            }
        }
        var18_18 = (xs3_0)var18_18;
        var19_19 = (Boolean)var18_18.a;
        var12_12 = (int)var19_19.booleanValue();
        var20_20 = (Long)var18_18.b;
        var18_18 = (uf_1)var18_18.c;
        if (var12_12 == 0) {
            var19_19 = var24_24.b();
            if (var19_19 != null) {
                if ((var19_19 = m70_0.a((b41_0)var19_19)) == null) {
                    var19_19 = Charsets.UTF_8;
                }
            } else {
                var19_19 = Charsets.UTF_8;
            }
            var10_10.a = var8_8;
            var10_10.b = var22_22;
            var10_10.c = var20_20;
            var10_10.d = var19_19;
            var10_10.e = var8_8;
            var10_10.g = var17_17;
            if ((var10_10 = wf_1.k((uf_1)var18_18, (f80_0)var10_10)) == var14_14) {
                return var14_14;
            }
            var18_18 = var8_8;
            var21_21 = var22_22;
            var8_8 = var10_10;
            var10_10 = var18_18;
lbl88:
            // 2 sources

            var8_8 = be3_1.a((b93_0)var8_8, (Charset)var19_19, var17_17);
            var18_18.a((String)var8_8);
            var8_8 = new StringBuilder(var16_16);
            var18_18 = var21_21.a;
            var8_8.append((String)var18_18);
            var8_8.append(var15_15);
            var8_8.append(var20_20);
            var18_18 = "-byte body)";
            var8_8.append((String)var18_18);
            var8_8 = var8_8.toString();
            var10_10.a((String)var8_8);
        } else {
            var10_10 = ja1_1.a;
            var9_9 = var23_23.c();
            var10_10 = var9_9 != '\u0000' ? "encoded" : "binary";
            if (var20_20 != null) {
                var18_18 = new StringBuilder(var16_16);
                var19_19 = var22_22.a;
                var18_18.append((String)var19_19);
                var18_18.append(var15_15);
                var18_18.append((String)var10_10);
                var9_9 = ' ';
                var18_18.append(var9_9);
                var18_18.append(var20_20);
                var18_18.append("-byte body omitted)");
                var10_10 = var18_18.toString();
                var8_8.a((String)var10_10);
            } else {
                var18_18 = new StringBuilder(var16_16);
                var19_19 = var22_22.a;
                var20_20 = " body omitted)";
                var10_10 = ko_0.a((StringBuilder)var18_18, (String)var19_19, var15_15, (String)var10_10, (String)var20_20);
                var8_8.a((String)var10_10);
            }
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object f(tx1_2 var0, mv_2 var1_1, jb1_2 var2_2, uf_1 var3_3, f80_0 var4_4) {
        block15: {
            block12: {
                block13: {
                    block14: {
                        var5_5 = var0;
                        var6_6 = var4_4;
                        var7_7 = var4_4 instanceof Fx1$f;
                        if (!var7_7) ** GOTO lbl-1000
                        var8_8 = var4_4;
                        var8_8 = (Fx1$f)var4_4;
                        var9_9 = var8_8.g;
                        var10_10 = -1 << -1;
                        var11_11 = var9_9 & var10_10;
                        if (var11_11 != 0) {
                            var8_8.g = var9_9 -= var10_10;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var8_8 = new h80_0((f80_0)var6_6);
                        }
                        var6_6 = var8_8.f;
                        var12_12 = j90_0.COROUTINE_SUSPENDED;
                        var9_9 = var8_8.g;
                        var13_13 = "-byte body)";
                        var10_10 = 1;
                        var14_14 = 2;
                        var15_15 = "ms, ";
                        var16_16 = "<-- END HTTP (";
                        if (var9_9 == 0) break block12;
                        if (var9_9 == var10_10) break block13;
                        if (var9_9 != var14_14) break block14;
                        var17_17 = var8_8.e;
                        var5_5 = var8_8.d;
                        var19_18 = var8_8.c;
                        var20_19 = (Long)var8_8.b;
                        var8_8 = var8_8.a;
                        vl2_2.b(var6_6);
                        ** GOTO lbl103
                    }
                    var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var5_5;
                }
                var5_5 = (jb1_2)var8_8.b;
                var21_20 = var8_8.a;
                vl2_2.b(var6_6);
                var22_21 = var6_6;
                var6_6 = var5_5;
                var5_5 = var21_20;
                var21_20 = var22_21;
                break block15;
            }
            vl2_2.b(var6_6);
            var5_5.a("");
            var19_18 = oa1_0.a(var2_2);
            var20_19 = oa1_0.b(var2_2);
            var23_22 = var2_2.getHeaders();
            var8_8.a = var5_5;
            var6_6 = var2_2;
            var8_8.b = var2_2;
            var8_8.g = var10_10;
            var21_20 = var1_1;
            var24_23 = var3_3;
            var21_20 = fx1_1.a(var1_1, var3_3, (Long)var19_18, (k70_0)var20_19, var23_22, (f80_0)var8_8);
            if (var21_20 == var12_12) {
                return var12_12;
            }
        }
        var21_20 = (xs3_0)var21_20;
        var24_23 = (Boolean)var21_20.a;
        var10_10 = (int)var24_23.booleanValue();
        var20_19 = var19_18 = var21_20.b;
        var20_19 = (Long)var19_18;
        var21_20 = (uf_1)var21_20.c;
        var25_24 = var6_6.d().i;
        var19_18 = var6_6.c();
        var27_25 = var19_18.i;
        var25_24 -= var27_25;
        if (var20_19 != null && (var11_11 = (int)((cfr_temp_0 = (var27_25 = var20_19.longValue()) - (var29_26 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) {
            var6_6 = new StringBuilder(var16_16);
            var6_6.append(var25_24);
            var6_6.append(var15_15);
            var6_6.append(var20_19);
            var6_6.append(var13_13);
            var6_6 = var6_6.toString();
            var5_5.a((String)var6_6);
            return Unit.a;
        }
        if (var10_10 == 0) {
            if ((var6_6 = oa1_0.b((ma1_0)var6_6)) != null) {
                if ((var6_6 = m70_0.a((b41_0)var6_6)) == null) {
                    var6_6 = Charsets.UTF_8;
                }
lbl87:
                // 4 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var6_6 = Charsets.UTF_8;
            ** continue;
            var19_18 = var6_6;
            var8_8.a = var5_5;
            var8_8.b = var20_19;
            var8_8.c = var6_6;
            var8_8.d = var5_5;
            var8_8.e = var25_24;
            var8_8.g = var14_14;
            var6_6 = wf_1.k((uf_1)var21_20, (f80_0)var8_8);
            if (var6_6 == var12_12) {
                return var12_12;
            }
            var8_8 = var5_5;
            var17_17 = var25_24;
lbl103:
            // 2 sources

            var6_6 = be3_1.a((b93_0)var6_6, (Charset)var19_18, var14_14);
            var5_5.a((String)var6_6);
            var5_5 = new StringBuilder(var16_16);
            var5_5.append(var17_17);
            var5_5.append(var15_15);
            var5_5.append(var20_19);
            var5_5.append(var13_13);
            var5_5 = var5_5.toString();
            var8_8.a((String)var5_5);
        } else {
            var6_6 = var6_6.getHeaders();
            var8_8 = ja1_1.a;
            var31_27 = var6_6.c();
            var6_6 = var31_27 != '\u0000' ? "encoded" : "binary";
            if (var20_19 != null) {
                var8_8 = new StringBuilder(var16_16);
                var8_8.append(var25_24);
                var8_8.append(var15_15);
                var8_8.append((String)var6_6);
                var31_27 = ' ';
                var8_8.append(var31_27);
                var8_8.append(var20_19);
                var8_8.append("-byte body omitted)");
                var6_6 = var8_8.toString();
                var5_5.a((String)var6_6);
            } else {
                var8_8 = new StringBuilder(var16_16);
                var8_8.append(var25_24);
                var8_8.append(var15_15);
                var8_8.append((String)var6_6);
                var8_8.append(" body omitted)");
                var6_6 = var8_8.toString();
                var5_5.a((String)var6_6);
            }
        }
        return Unit.a;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final Object g(tx1_2 object, fw1_2 object2, List object3, db1_2 object4, f80_0 f80_02) {
        void var4_6;
        int n3;
        int n4;
        CoroutineContext coroutineContext;
        Object object5;
        Object object6;
        Object object7 = ((db1_2)object6).d;
        Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        object7 = (bg2_2)object7;
        fa1_1 fa1_12 = new fa1_1((tx1_2)object);
        object = a;
        Object object8 = ((db1_2)object6).f;
        ((e40_0)object8).d((xq_2)object, fa1_12);
        object = new StringBuilder();
        int n7 = ((fw1_2)((Object)object2)).getInfo();
        char c2 = '\n';
        if (n7 != 0) {
            object8 = new StringBuilder("REQUEST: ");
            object5 = ku3_0.a(((db1_2)object6).a);
            ((StringBuilder)object8).append(object5);
            object8 = ((StringBuilder)object8).toString();
            ((StringBuilder)object).append((String)object8);
            ((StringBuilder)object).append(c2);
            object8 = new StringBuilder("METHOD: ");
            object5 = ((db1_2)object6).b;
            ((StringBuilder)object8).append(object5);
            object8 = ((StringBuilder)object8).toString();
            ((StringBuilder)object).append((String)object8);
            ((StringBuilder)object).append(c2);
        }
        n7 = ((fw1_2)((Object)object2)).getHeaders();
        Object object9 = null;
        if (n7 != 0) {
            ((StringBuilder)object).append("COMMON HEADERS\n");
            object6 = ((db1_2)object6).c.entries();
            px1_1.b((Appendable)object, (Set)object6, (List)((Object)coroutineContext));
            ((StringBuilder)object).append("CONTENT HEADERS");
            ((StringBuilder)object).append(c2);
            object6 = coroutineContext;
            object6 = (Iterable)((Object)coroutineContext);
            object8 = object6.iterator();
            boolean bl2 = object8.hasNext();
            if (bl2) {
                ((xr2_1)object8.next()).getClass();
                object = ja1_1.a;
                throw null;
            }
            n7 = (object6 = object6.iterator()).hasNext();
            if (n7 != 0) {
                ((xr2_1)object6.next()).getClass();
                object = ja1_1.a;
                throw null;
            }
            object6 = ((bg2_2)object7).a();
            if (object6 != null) {
                long l2 = ((Number)object6).longValue();
                object6 = ja1_1.a;
                object6 = String.valueOf(l2);
                object8 = "Content-Length";
                px1_1.a((Appendable)object, (String)object8, (String)object6);
            }
            if ((object6 = ((bg2_2)object7).b()) != null) {
                object8 = ja1_1.a;
                object6 = ((b41_0)object6).toString();
                object8 = "Content-Type";
                px1_1.a((Appendable)object, (String)object8, (String)object6);
            }
            object6 = ((bg2_2)object7).c().entries();
            px1_1.b((Appendable)object, (Set)object6, (List)((Object)coroutineContext));
        }
        if ((n4 = ((String)(object = ((StringBuilder)object).toString())).length()) > 0) {
            fa1_12.c((String)object);
        }
        if ((n3 = ((String)object).length()) == 0 || (n3 = (int)(((fw1_2)((Object)object2)).getBody() ? 1 : 0)) == 0) {
            fa1_12.a();
            return object9;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object = new StringBuilder("BODY Content-Type: ");
        k70_0 k70_02 = ((bg2_2)object7).b();
        ((StringBuilder)object).append(k70_02);
        object = ((StringBuilder)object).toString();
        stringBuilder.append((String)object);
        stringBuilder.append(c2);
        object = ((bg2_2)object7).b();
        if (object == null || (object = m70_0.a((b41_0)object)) == null) {
            object = Charsets.UTF_8;
        }
        object5 = object;
        object = new if_1(false);
        e01_0 e01_02 = e01_0.a;
        coroutineContext = ir0_2.a;
        object6 = new vg1_2((Object)null);
        coroutineContext = coroutineContext.plus((CoroutineContext)object6);
        object8 = object6;
        object6 = new lx1_2((if_1)object, (Charset)object5, stringBuilder, fa1_12, null);
        n7 = 2;
        Ae3.d(e01_02, coroutineContext, null, (Function2)object6, n7);
        return l62_0.a((bg2_2)object7, (if_1)object, (f80_0)var4_6);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object h(tx1_2 var0, List var1_1, fw1_2 var2_2, mv_2 var3_3, db1_2 var4_4, f80_0 var5_5) {
        block22: {
            block32: {
                block26: {
                    block33: {
                        block27: {
                            block30: {
                                block28: {
                                    block31: {
                                        block29: {
                                            block23: {
                                                block24: {
                                                    block25: {
                                                        var6_6 = var0;
                                                        var7_7 = var2_2;
                                                        var8_8 = var4_4;
                                                        var9_9 = var5_5;
                                                        var10_10 = var5_5 instanceof mx1_2;
                                                        if (var10_10 != 0) {
                                                            var11_11 = var5_5;
                                                            var11_11 = (mx1_2)var5_5;
                                                            var12_12 = var11_11.b;
                                                            var13_13 = -1 << -1;
                                                            var14_14 = var12_12 & var13_13;
                                                            if (var14_14 != 0) {
                                                                var11_11.b = var12_12 -= var13_13;
lbl14:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        var11_11 = new h80_0((f80_0)var9_9);
                                                        ** while (true)
                                                        var15_15 = var11_11;
                                                        var9_9 = var11_11.a;
                                                        var16_16 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                        var10_10 = var11_11.b;
                                                        var14_14 = 1;
                                                        var17_17 = 2;
                                                        if (var10_10 == 0) break block23;
                                                        if (var10_10 == var14_14) break block24;
                                                        if (var10_10 != var17_17) break block25;
                                                        vl2_2.b(var9_9);
                                                        break block26;
                                                    }
                                                    var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var6_6;
                                                }
                                                vl2_2.b(var9_9);
                                                break block27;
                                            }
                                            vl2_2.b(var9_9);
                                            var9_9 = fw1_2.NONE;
                                            var10_10 = 0;
                                            var11_11 = null;
                                            if (var7_7 == var9_9) {
                                                var18_18 = true;
                                            } else {
                                                var18_18 = false;
                                                var9_9 = null;
                                            }
                                            if (var18_18) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    var13_13 = 0;
                                                    var16_16 /* !! */  = null;
                                                    break block22;
                                                    break;
                                                }
                                            }
                                            var9_9 = new eu3_0(0);
                                            var19_19 = var8_8.a;
                                            ku3_0.c((eu3_0)var9_9, (eu3_0)var19_19);
                                            var9_9 = fx1_1.k(var9_9.b());
                                            var19_19 = var8_8.d;
                                            var20_20 = new p41_0(0);
                                            var21_21 = var19_19 instanceof bg2_2;
                                            var22_22 = "Content-Length";
                                            if (var21_21 && !(var25_25 = Intrinsics.areEqual(var23_23 = var8_8.b, var24_24 = pa1_0.b)) && !(var25_25 = Intrinsics.areEqual(var23_23 = var8_8.b, var24_24 = pa1_0.d)) && !(var25_25 = var19_19 instanceof gz0_2)) {
                                                var23_23 = var19_19;
                                                var23_23 = (bg2_2)var19_19;
                                                var24_24 = var23_23.b();
                                                var11_11 = "value";
                                                var26_26 = "name";
                                                var27_27 = "<this>";
                                                if (var24_24 != null) {
                                                    var24_24 = var24_24.toString();
                                                    Intrinsics.checkNotNullParameter(var20_20, (String)var27_27);
                                                    var28_28 /* !! */  = "Content-Type";
                                                    Intrinsics.checkNotNullParameter(var28_28 /* !! */ , (String)var26_26);
                                                    Intrinsics.checkNotNullParameter(var24_24, (String)var11_11);
                                                    var29_29 = var20_20.c((String)var28_28 /* !! */ );
                                                    if (!var29_29) {
                                                        var20_20.b((String)var28_28 /* !! */ , (String)var24_24);
                                                    }
                                                }
                                                if ((var28_28 /* !! */  = var23_23.a()) != null) {
                                                    var30_30 = var28_28 /* !! */ .longValue();
                                                    var28_28 /* !! */  = ja1_1.a;
                                                    var28_28 /* !! */  = String.valueOf(var30_30);
                                                    Intrinsics.checkNotNullParameter(var20_20, (String)var27_27);
                                                    Intrinsics.checkNotNullParameter(var22_22, (String)var26_26);
                                                    Intrinsics.checkNotNullParameter(var28_28 /* !! */ , (String)var11_11);
                                                    var10_10 = (int)var20_20.c(var22_22);
                                                    if (var10_10 == 0) {
                                                        var20_20.b(var22_22, (String)var28_28 /* !! */ );
                                                    }
                                                }
                                            }
                                            var11_11 = var8_8.c;
                                            ze3_2.a((ve3_2)var20_20, (ve3_2)var11_11);
                                            var27_27 = var20_20.i();
                                            var26_26 = ja1_1.a;
                                            var26_26 = var27_27.get(var22_22);
                                            if (var26_26 != null) {
                                                var26_26 = StringsKt.l0((String)var26_26);
                                            } else {
                                                var17_17 = 0;
                                                var26_26 = null;
                                            }
                                            var28_28 /* !! */  = var8_8.b;
                                            var20_20 = pa1_0.b;
                                            var32_31 = Intrinsics.areEqual(var28_28 /* !! */ , var20_20);
                                            var33_32 = ' ';
                                            var22_22 = "--> ";
                                            if (var32_31 != '\u0000' || (var32_31 = Intrinsics.areEqual(var28_28 /* !! */  = var8_8.b, var23_23 = pa1_0.d)) != '\u0000' || ((var32_31 = fx1_1.c(var2_2)) != '\u0000' || (var32_31 = (char)fx1_1.b(var2_2)) != '\u0000') && var26_26 != null || (var32_31 = (char)fx1_1.c(var2_2)) != '\u0000' && var26_26 == null || (var32_31 = (char)var27_27.c()) != '\u0000') break block28;
                                            var28_28 /* !! */  = fw1_2.INFO;
                                            if (var7_7 == var28_28 /* !! */ ) {
                                                var32_31 = '\u0001';
                                            } else {
                                                var32_31 = '\u0000';
                                                var28_28 /* !! */  = null;
                                            }
                                            var23_23 = "-byte body)";
                                            var24_24 = " (";
                                            if (var32_31 == '\u0000' || var26_26 == null) break block29;
                                            var28_28 /* !! */  = new StringBuilder(var22_22);
                                            var22_22 = var8_8.b.a;
                                            var28_28 /* !! */ .append(var22_22);
                                            var28_28 /* !! */ .append(var33_32);
                                            var28_28 /* !! */ .append((String)var9_9);
                                            var28_28 /* !! */ .append((String)var24_24);
                                            var28_28 /* !! */ .append(var26_26);
                                            var28_28 /* !! */ .append((String)var23_23);
                                            var9_9 = var28_28 /* !! */ .toString();
                                            break block30;
                                        }
                                        var17_17 = var19_19 instanceof bg2_1.e_0;
                                        if (var17_17 != 0 || (var17_17 = var19_19 instanceof bg2$d_0) != 0) ** GOTO lbl171
                                        var26_26 = var8_8.d;
                                        var32_31 = var26_26 instanceof bg2_2;
                                        if (var32_31 == '\u0000') ** GOTO lbl169
                                        var28_28 /* !! */  = var26_26;
                                        var28_28 /* !! */  = (bg2_2)var26_26;
                                        var33_32 = var28_28 /* !! */  instanceof bg2$a_0;
                                        if (var33_32 == '\u0000') break block31;
                                        var26_26 = ((bg2$a_0)var26_26).e();
                                        var17_17 = ((Object)var26_26).length;
                                        var34_33 = var17_17;
                                        ** GOTO lbl146
                                    }
                                    var33_32 = var28_28 /* !! */  instanceof bg2$b_0;
                                    if (var33_32 != '\u0000') ** GOTO lbl166
                                    var32_31 = var28_28 /* !! */  instanceof bg2_1.c_0;
                                    if (var32_31 != '\u0000') {
                                        var34_33 = 0L;
lbl146:
                                        // 2 sources

                                        var20_20 = new StringBuilder(var22_22);
                                        var22_22 = var8_8.b.a;
                                        var20_20.append(var22_22);
                                        var36_34 = ' ';
                                        var20_20.append(var36_34);
                                        var20_20.append((String)var9_9);
                                        var20_20.append((String)var24_24);
                                        var9_9 = jl0_0.b((StringBuilder)var20_20, var34_33, (String)var23_23);
                                    } else {
                                        var7_7 = new StringBuilder("Unable to calculate the size for type ");
                                        var8_8 = Reflection.getOrCreateKotlinClass(var26_26.getClass()).getSimpleName();
                                        var7_7.append((String)var8_8);
                                        var7_7 = var7_7.toString().toString();
                                        var6_6 = new IllegalStateException((String)var7_7);
                                        throw var6_6;
lbl166:
                                        // 1 sources

                                        ((bg2$b_0)var26_26).getClass();
                                        throw null;
lbl169:
                                        // 1 sources

                                        var6_6 = new IllegalStateException("Check failed.");
                                        throw var6_6;
lbl171:
                                        // 1 sources

                                        var26_26 = new StringBuilder(var22_22);
                                        var28_28 /* !! */  = var8_8.b.a;
                                        var26_26.append((String)var28_28 /* !! */ );
                                        var32_31 = ' ';
                                        var26_26.append(var32_31);
                                        var26_26.append((String)var9_9);
                                        var26_26.append(" (unknown-byte body)");
                                        var9_9 = var26_26.toString();
                                    }
                                    break block30;
                                }
                                var26_26 = new StringBuilder(var22_22);
                                var28_28 /* !! */  = var8_8.b.a;
                                var26_26.append((String)var28_28 /* !! */ );
                                var32_31 = ' ';
                                var26_26.append(var32_31);
                                var26_26.append((String)var9_9);
                                var9_9 = var26_26.toString();
                            }
                            var6_6.a((String)var9_9);
                            var18_18 = fx1_1.c(var2_2);
                            ** while (!var18_18 && !(var18_18 = fx1_1.b((fw1_2)var2_2)))
lbl199:
                            // 1 sources

                            var9_9 = var27_27.entries().iterator();
                            while ((var17_17 = (int)var9_9.hasNext()) != 0) {
                                var26_26 = (Map.Entry)var9_9.next();
                                var28_28 /* !! */  = (String)var26_26.getKey();
                                var26_26 = (List)var26_26.getValue();
                                var20_20 = var1_1;
                                var20_20 = ((Iterable)var1_1).iterator();
                                var36_34 = var20_20.hasNext();
                                if (var36_34 == '\u0000') {
                                    var20_20 = ": ";
                                    var28_28 /* !! */  = nn_2.a((String)var28_28 /* !! */ , (String)var20_20);
                                    var37_35 = var26_26;
                                    var37_35 = (Iterable)var26_26;
                                    var38_36 = 62;
                                    var39_37 = ", ";
                                    var26_26 = CollectionsKt.R((Iterable)var37_35, var39_37, null, null, null, var38_36);
                                    var28_28 /* !! */ .append((String)var26_26);
                                    var26_26 = var28_28 /* !! */ .toString();
                                    var6_6.a((String)var26_26);
                                    continue;
                                }
                                ((xr2_1)var20_20.next()).getClass();
                                throw null;
                            }
                            var18_18 = false;
                            var9_9 = null;
                            var40_38 = fx1_1.b(var2_2);
                            var26_26 = "--> END ";
                            if (var40_38 == 0 || (var40_38 = Intrinsics.areEqual(var7_7 = var8_8.b, var28_28 /* !! */  = pa1_0.b)) != 0 || (var40_38 = Intrinsics.areEqual(var7_7 = var8_8.b, var28_28 /* !! */  = pa1_0.d)) != 0) break block32;
                            var7_7 = "";
                            var6_6.a((String)var7_7);
                            if (!var21_21) {
                                var7_7 = new StringBuilder((String)var26_26);
                                var8_8 = var8_8.b.a;
                                var7_7.append((String)var8_8);
                                var7_7 = var7_7.toString();
                                var6_6.a((String)var7_7);
lbl237:
                                // 4 sources

                                while (true) {
                                    var16_16 /* !! */  = var9_9;
                                    break block22;
                                    break;
                                }
                            }
                            var7_7 = ja1_1.a;
                            var7_7 = var11_11.e("Content-Encoding");
                            var40_38 = Intrinsics.areEqual(var7_7, var9_9 = "gzip");
                            if (var40_38 == 0) break block33;
                            var9_9 = var19_19;
                            var9_9 = (bg2_2)var19_19;
                            var11_11 = var8_8.b;
                            var15_15.b = var40_38 = 1;
                            var6_6 = var0;
                            var7_7 = var3_3;
                            var8_8 = var9_9;
                            var9_9 = var11_11;
                            var11_11 = var27_27;
                            if ((var9_9 = fx1_1.d(var0, var3_3, (bg2_2)var8_8, (pa1_0)var9_9, (q41_0)var27_27, var15_15)) == var16_16 /* !! */ ) break block22;
                        }
                        var9_9 = (bg2_2)var9_9;
                        ** GOTO lbl237
                    }
                    var9_9 = var19_19;
                    var9_9 = (bg2_2)var19_19;
                    var11_11 = var8_8.b;
                    var15_15.b = var40_38 = 2;
                    var6_6 = var0;
                    var7_7 = var3_3;
                    var8_8 = var9_9;
                    var9_9 = var11_11;
                    var11_11 = var27_27;
                    if ((var9_9 = fx1_1.d(var0, var3_3, (bg2_2)var8_8, (pa1_0)var9_9, (q41_0)var27_27, var15_15)) == var16_16 /* !! */ ) break block22;
                }
                var9_9 = (bg2_2)var9_9;
                ** GOTO lbl237
            }
            var7_7 = new StringBuilder((String)var26_26);
            var8_8 = var8_8.b.a;
            var7_7.append((String)var8_8);
            var7_7 = var7_7.toString();
            var6_6.a((String)var7_7);
            ** while (true)
        }
        return var16_16 /* !! */ ;
    }

    public static final void i(fw1_2 object, StringBuilder stringBuilder, bb1_2 object2, Throwable throwable) {
        boolean bl2 = ((fw1_2)((Object)object)).getInfo();
        if (bl2) {
            String string2 = "RESPONSE ";
            object = new StringBuilder(string2);
            object2 = object2.getUrl();
            ((StringBuilder)object).append(object2);
            object2 = " failed with exception: ";
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(throwable);
            object = ((StringBuilder)object).toString();
            stringBuilder.append((String)object);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object j(tx1_2 var0, List var1_1, fw1_2 var2_2, mv_2 var3_3, jb1_2 var4_4, f80_0 var5_5) {
        block17: {
            block21: {
                block26: {
                    block22: {
                        block25: {
                            block24: {
                                block23: {
                                    block18: {
                                        block19: {
                                            block20: {
                                                var6_6 = var0;
                                                var7_7 = var2_2;
                                                var8_8 = var3_3;
                                                var9_9 /* !! */  = var4_4;
                                                var10_10 = var5_5;
                                                var11_11 = var5_5 instanceof nx1_2;
                                                if (!var11_11) ** GOTO lbl-1000
                                                var12_12 = var5_5;
                                                var12_12 = (nx1_2)var5_5;
                                                var13_13 = var12_12.d;
                                                var14_14 = -1 << -1;
                                                var15_15 = var13_13 & var14_14;
                                                if (var15_15 != 0) {
                                                    var12_12.d = var13_13 -= var14_14;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var12_12 = new h80_0((f80_0)var10_10);
                                                }
                                                var10_10 = var12_12.c;
                                                var16_16 = j90_0.COROUTINE_SUSPENDED;
                                                var14_14 = var12_12.d;
                                                var15_15 = 2;
                                                var17_17 = 1;
                                                if (var14_14 == 0) break block18;
                                                if (var14_14 == var17_17) break block19;
                                                if (var14_14 != var15_15) break block20;
                                                var6_6 = var12_12.b;
                                                var7_7 = var12_12.a;
                                                vl2_2.b(var10_10);
                                                break block21;
                                            }
                                            var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var6_6;
                                        }
                                        var6_6 = var12_12.a;
                                        vl2_2.b(var10_10);
                                        break block22;
                                    }
                                    vl2_2.b(var10_10);
                                    var10_10 = fw1_2.NONE;
                                    if (var7_7 == var10_10) break block17;
                                    var10_10 = var4_4.getHeaders();
                                    var18_18 = ja1_1.a;
                                    var18_18 = "Content-Length";
                                    if ((var10_10 = var10_10.get((String)var18_18)) != null) {
                                        var10_10 = StringsKt.l0((String)var10_10);
                                    } else {
                                        var19_19 = 0;
                                        var10_10 = null;
                                    }
                                    var20_20 = mb1_1.b(var4_4);
                                    var21_21 = var4_4.d();
                                    var22_22 = var21_21.i;
                                    var24_23 = var4_4.c().i;
                                    var22_22 -= var24_23;
                                    var26_24 /* !! */  = var4_4.getHeaders().get("Transfer-Encoding");
                                    var27_25 = Intrinsics.areEqual(var26_24 /* !! */ , "chunked");
                                    var28_26 = "-byte body)";
                                    var29_27 = "ms, ";
                                    var30_28 = "ms, unknown-byte body)";
                                    var31_29 = " (";
                                    var18_18 = "<-- ";
                                    if (var27_25 && (var7_7 == (var26_24 /* !! */  = fw1_2.INFO) || (var27_25 = fx1_1.c(var2_2)))) {
                                        var26_24 /* !! */  = new StringBuilder((String)var18_18);
                                        var18_18 = var4_4.e();
                                        var26_24 /* !! */ .append(var18_18);
                                        var14_14 = 32;
                                        var26_24 /* !! */ .append((char)var14_14);
                                        var18_18 = fx1_1.k(var20_20.getUrl());
                                        var26_24 /* !! */ .append((String)var18_18);
                                        var26_24 /* !! */ .append((String)var31_29);
                                        var18_18 = jl0_0.b((StringBuilder)var26_24 /* !! */ , var22_22, (String)var30_28);
                                    } else {
                                        var26_24 /* !! */  = fw1_2.INFO;
                                        if (var7_7 == var26_24 /* !! */  && var10_10 != null) {
                                            var30_28 = new StringBuilder((String)var18_18);
                                            var18_18 = var4_4.e();
                                            var30_28.append(var18_18);
                                            var14_14 = 32;
                                            var30_28.append((char)var14_14);
                                            var18_18 = fx1_1.k(var20_20.getUrl());
                                            var30_28.append((String)var18_18);
                                            var30_28.append((String)var31_29);
                                            var30_28.append(var22_22);
                                            var30_28.append(var29_27);
                                            var30_28.append(var10_10);
                                            var30_28.append(var28_26);
                                            var18_18 = var30_28.toString();
                                        } else {
                                            var32_30 = fx1_1.b(var2_2);
                                            if (!(var32_30 || var7_7 == var26_24 /* !! */  && var10_10 == null || (var27_25 = fx1_1.c(var2_2)) && var10_10 != null || (var33_31 /* !! */  = Intrinsics.areEqual(var7_7 = var4_4.getHeaders().get("Content-Encoding"), var26_24 /* !! */  = "gzip")))) {
                                                var7_7 = new StringBuilder((String)var18_18);
                                                var18_18 = var4_4.e();
                                                var7_7.append(var18_18);
                                                var14_14 = 32;
                                                var7_7.append((char)var14_14);
                                                var18_18 = fx1_1.k(var20_20.getUrl());
                                                var7_7.append((String)var18_18);
                                                var7_7.append((String)var31_29);
                                                var18_18 = jl0_0.b((StringBuilder)var7_7, var22_22, (String)var30_28);
                                            } else {
                                                var7_7 = new StringBuilder((String)var18_18);
                                                var18_18 = var4_4.e();
                                                var7_7.append(var18_18);
                                                var14_14 = 32;
                                                var7_7.append((char)var14_14);
                                                var18_18 = fx1_1.k(var20_20.getUrl());
                                                var7_7.append((String)var18_18);
                                                var7_7.append((String)var31_29);
                                                var18_18 = jl0_0.b((StringBuilder)var7_7, var22_22, "ms)");
                                            }
                                        }
                                    }
                                    var6_6.a((String)var18_18);
                                    var33_31 /* !! */  = fx1_1.c(var2_2);
                                    if (!var33_31 /* !! */  && !(var33_31 /* !! */  = fx1_1.b(var2_2))) break block17;
                                    var7_7 = var4_4.getHeaders().entries().iterator();
                                    while ((var14_14 = (int)var7_7.hasNext()) != 0) {
                                        var18_18 = (Map.Entry)var7_7.next();
                                        var30_28 = (String)var18_18.getKey();
                                        var18_18 = (List)var18_18.getValue();
                                        var31_29 = var1_1;
                                        var31_29 = ((Iterable)var1_1).iterator();
                                        var34_32 = var31_29.hasNext();
                                        if (!var34_32) {
                                            var31_29 = ": ";
                                            var30_28 = nn_2.a((String)var30_28, (String)var31_29);
                                            var35_33 = var18_18;
                                            var35_33 = (Iterable)var18_18;
                                            var36_34 = 62;
                                            var37_35 = ", ";
                                            var18_18 = CollectionsKt.R((Iterable)var35_33, var37_35, null, null, null, var36_34);
                                            var30_28.append((String)var18_18);
                                            var18_18 = var30_28.toString();
                                            var6_6.a((String)var18_18);
                                            continue;
                                        }
                                        ((xr2_1)var31_29.next()).getClass();
                                        throw null;
                                    }
                                    var33_31 /* !! */  = fx1_1.b(var2_2);
                                    if (var33_31 /* !! */ ) break block23;
                                    var7_7 = "<-- END HTTP";
                                    var6_6.a((String)var7_7);
                                    break block17;
                                }
                                if (var10_10 == null) break block24;
                                var38_36 = 0L;
                                var40_37 = var10_10.longValue();
                                cfr_temp_0 = var40_37 - var38_36;
                                var33_31 /* !! */  = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                if (var33_31 /* !! */ ) break block24;
                                var8_8 = "<-- END HTTP (";
                                var7_7 = new StringBuilder((String)var8_8);
                                var7_7.append(var22_22);
                                var7_7.append(var29_27);
                                var7_7.append(var10_10);
                                var7_7.append(var28_26);
                                var7_7 = var7_7.toString();
                                var6_6.a((String)var7_7);
                                break block17;
                            }
                            if (!(var33_31 /* !! */  = Intrinsics.areEqual(var7_7 = oa1_0.b(var4_4), var10_10 = k70$d.b))) break block25;
                            var7_7 = "<-- END HTTP (streaming)";
                            var6_6.a((String)var7_7);
                            break block17;
                        }
                        var7_7 = ms0_2.a;
                        Intrinsics.checkNotNullParameter(var9_9 /* !! */ , "<this>");
                        var7_7 = var4_4.a().getAttributes();
                        var10_10 = ms0_2.b;
                        var33_31 /* !! */  = var7_7.f((xq_2)var10_10);
                        if (!var33_31 /* !! */ ) break block26;
                        var7_7 = var4_4.b();
                        var12_12.a = var9_9 /* !! */ ;
                        var12_12.d = var19_19 = 1;
                        if ((var6_6 = fx1_1.f((tx1_2)var6_6, (mv_2)var8_8, (jb1_2)var9_9 /* !! */ , (uf_1)var7_7, var12_12)) == var16_16) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var9_9 /* !! */  = var16_16;
                                break block17;
                                break;
                            }
                        }
                        var6_6 = var9_9 /* !! */ ;
                    }
lbl201:
                    // 2 sources

                    while (true) {
                        var9_9 /* !! */  = var6_6;
                        break block17;
                        break;
                    }
                }
                var7_7 = rf_1.b(var4_4.b(), (i90_0)var9_9 /* !! */ );
                var10_10 = (uf_1)var7_7.a;
                var7_7 = (uf_1)var7_7.b;
                var12_12.a = var9_9 /* !! */ ;
                var12_12.b = var10_10;
                var12_12.d = var14_14 = 2;
                ** while ((var6_6 = fx1_1.f((tx1_2)var6_6, (mv_2)var8_8, (jb1_2)var9_9 /* !! */ , (uf_1)var7_7, (f80_0)var12_12)) == var16_16)
lbl212:
                // 1 sources

                var7_7 = var9_9 /* !! */ ;
                var6_6 = var10_10;
            }
            var7_7 = var7_7.a();
            var6_6 = da3_0.c((ea1_2)var7_7, (uf_1)var6_6).d();
            ** while (true)
        }
        return var9_9 /* !! */ ;
    }

    public static final String k(fx3_0 object) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = (String)((fx3_0)object).k.getValue();
        int n3 = string2.length();
        if (n3 == 0) {
            string2 = "/";
            stringBuilder.append(string2);
        } else {
            string2 = (String)((fx3_0)object).k.getValue();
            stringBuilder.append(string2);
        }
        object = ((fx3_0)object).l;
        string2 = (String)((hh3_2)object).getValue();
        n3 = string2.length();
        if (n3 != 0) {
            string2 = "?";
            stringBuilder.append(string2);
            object = (String)((hh3_2)object).getValue();
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }
}

