/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.text.Charsets;
import kotlin.text.b;

/*
 * Renamed from wF
 */
public final class wf_1 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(uf_1 var0, gf_2 var1_1, long var2_2, f80_0 var4_3) {
        block19: {
            block21: {
                block22: {
                    block20: {
                        block23: {
                            var5_4 = var4_3;
                            var6_9 = var4_3 instanceof wF$b;
                            if (!var6_9) ** GOTO lbl-1000
                            var7_10 = var4_3;
                            var7_10 = (wF$b)var4_3;
                            var8_11 = var7_10.f;
                            var9_12 = -1 << -1;
                            var10_13 = var8_11 & var9_12;
                            if (var10_13 != 0) {
                                var7_10.f = var8_11 -= var9_12;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var7_10 = new h80_0((f80_0)var5_4);
                            }
                            var5_4 = var7_10.e;
                            var11_14 = j90_0.COROUTINE_SUSPENDED;
                            var9_12 = var7_10.f;
                            var10_13 = 1;
                            var12_15 = 4;
                            var13_16 = 3;
                            var14_17 = 2;
                            if (var9_12 == 0) break block23;
                            if (var9_12 != var10_13) {
                                if (var9_12 != var14_17) {
                                    if (var9_12 != var13_16) {
                                        if (var9_12 != var12_15) {
                                            var5_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var5_4;
                                        }
                                        var7_10 = (Throwable)var7_10.a;
                                        vl2_2.b(var5_4);
                                        throw var7_10;
                                    }
                                    var15_18 = var7_10.d;
                                    var17_19 = var7_10.c;
                                    vl2_2.b(var5_4);
                                    return new Long(var17_19 -= var15_18);
                                }
                                var19_20 = var7_10.d;
                                var21_21 = var7_10.c;
                                var23_22 = var7_10.b;
                                var24_23 = (uf_1)var7_10.a;
                                try {
                                    vl2_2.b(var5_4);
                                }
                                catch (Throwable var5_5) {
                                    break block19;
                                }
                                while (true) {
                                    var25_24 = var24_23;
                                    var24_23 = var7_10;
                                    var7_10 = var25_24;
                                    var10_13 = 1;
                                    break block20;
                                    break;
                                }
                            }
                            var19_20 = var7_10.d;
                            var21_21 = var7_10.c;
                            var23_22 = var7_10.b;
                            var24_23 = (uf_1)var7_10.a;
                            {
                                vl2_2.b(var5_4);
                                ** GOTO lbl-1000
                            }
                        }
                        vl2_2.b(var5_4);
                        var23_22 = var1_1;
                        var19_20 = var2_2;
                        var21_21 = var2_2;
                        var24_23 = var7_10;
                        var7_10 = var0;
                    }
                    try {
                        var26_25 = var7_10.i();
                        if (var26_25 != 0 || (var26_25 = (cfr_temp_0 = var19_20 - (var27_26 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) <= 0) break block21;
                        var5_4 = var7_10.g();
                        var26_25 = (int)var5_4.g();
                        if (var26_25 == 0) break block22;
                        var24_23.a = var7_10;
                        var24_23.b = var23_22;
                        var24_23.c = var21_21;
                        var24_23.d = var19_20;
                        var24_23.f = var10_13;
                        var5_4 = var7_10.h(var10_13, (f80_0)var24_23);
                        if (var5_4 != var11_14) break block22;
                        return var11_14;
                    }
                    catch (Throwable var5_6) {
                        ** continue;
                    }
lbl79:
                    // 1 sources

                    while (true) {
                        var25_24 = var24_23;
                        var24_23 = var7_10;
                        var7_10 = var25_24;
                        break block19;
                        break;
                    }
                }
                var25_24 = var24_23;
                var24_23 = var7_10;
                var7_10 = var25_24;
lbl-1000:
                // 2 sources

                {
                    var5_4 = var24_23.g();
                    var27_26 = af_2.c((b93_0)var5_4);
                    var27_26 = Math.min(var19_20, var27_26);
                    var5_4 = var24_23.g();
                    var29_27 = var23_22.b();
                    var5_4.t(var29_27, var27_26);
                }
                {
                    var7_10.a = var24_23;
                    var7_10.b = var23_22;
                    var7_10.c = var21_21;
                    var7_10.d = var19_20 -= var27_26;
                    var7_10.f = var14_17;
                    if ((var5_4 = var23_22.d((f80_0)var7_10)) != var11_14) ** continue;
                    return var11_14;
                }
            }
            var24_23.a = null;
            var24_23.b = null;
            var24_23.c = var21_21;
            var24_23.d = var19_20;
            var24_23.f = var13_16;
            var5_4 = var23_22.d((f80_0)var24_23);
            if (var5_4 == var11_14) {
                return var11_14;
            }
            var15_18 = var19_20;
            var17_19 = var21_21;
            return new Long(var17_19 -= var15_18);
        }
        try {
            var24_23.e((Throwable)var5_7);
            kf_1.a(var23_22, (Throwable)var5_7);
            throw var5_7;
        }
        catch (Throwable var5_8) {
            var7_10.a = var5_8;
            var7_10.b = null;
            var7_10.f = var12_15;
            var7_10 = var23_22.d((f80_0)var7_10);
            if (var7_10 == var11_14) {
                return var11_14;
            }
            var7_10 = var5_8;
        }
        throw var7_10;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object b(uf_1 var0, gf_2 var1_1, f80_0 var2_2) {
        block21: {
            block22: {
                block20: {
                    block23: {
                        var3_3 = var2_2;
                        var4_8 = var2_2 instanceof wF$a;
                        if (!var4_8) ** GOTO lbl-1000
                        var5_9 = var2_2;
                        var5_9 = (wF$a)var2_2;
                        var6_10 = var5_9.e;
                        var7_11 = -1 << -1;
                        var8_12 = var6_10 & var7_11;
                        if (var8_12 != 0) {
                            var5_9.e = var6_10 -= var7_11;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_9 = new h80_0((f80_0)var3_3);
                        }
                        var3_3 = var5_9.d;
                        var9_13 = j90_0.COROUTINE_SUSPENDED;
                        var7_11 = var5_9.e;
                        var8_12 = 1;
                        var10_14 = 4;
                        var11_15 = 3;
                        var12_16 = 2;
                        if (var7_11 == 0) break block23;
                        if (var7_11 != var8_12) {
                            if (var7_11 != var12_16) {
                                if (var7_11 != var11_15) {
                                    if (var7_11 != var10_14) {
                                        var3_3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var3_3;
                                    }
                                    var5_9 = (Throwable)var5_9.a;
                                    vl2_2.b(var3_3);
                                    throw var5_9;
                                }
                                var13_17 = var5_9.c;
                                vl2_2.b(var3_3);
                                return new Long(var13_17);
                            }
                            var15_18 = var5_9.c;
                            var17_19 = var5_9.b;
                            var18_20 = (uf_1)var5_9.a;
                            try {
                                vl2_2.b(var3_3);
                            }
                            catch (Throwable var3_4) {
                                break block21;
                            }
                            while (true) {
                                var19_21 = var5_9;
                                var5_9 = var18_20;
                                var20_22 = var15_18;
                                break block20;
                                break;
                            }
                        }
                        var15_18 = var5_9.c;
                        var17_19 = var5_9.b;
                        var18_20 = (uf_1)var5_9.a;
                        {
                            vl2_2.b(var3_3);
                            ** GOTO lbl-1000
                        }
                    }
                    vl2_2.b(var3_3);
                    var15_18 = 0L;
                    var17_19 = var1_1;
                    var20_22 = var15_18;
                    var19_21 = var5_9;
                    var5_9 = var0;
                }
                try {
                    var22_23 = var5_9.i();
                    if (var22_23) break block22;
                    var3_3 = var5_9.g();
                    var23_24 = var17_19.b();
                    var24_25 = var3_3.A0(var23_24);
                    var19_21.a = var5_9;
                    var19_21.b = var17_19;
                    var19_21.c = var20_22 += var24_25;
                    var19_21.e = var8_12;
                    var3_3 = var17_19.d((f80_0)var19_21);
                    if (var3_3 == var9_13) {
                        return var9_13;
                    }
                    var18_20 = var5_9;
                    var5_9 = var19_21;
                    var15_18 = var20_22;
                }
                catch (Throwable var3_5) {
                    var18_20 = var5_9;
                    var5_9 = var19_21;
                    break block21;
                }
lbl-1000:
                // 2 sources

                {
                    var5_9.a = var18_20;
                    var5_9.b = var17_19;
                    var5_9.c = var15_18;
                    var5_9.e = var12_16;
                    if ((var3_3 = var18_20.h(var8_12, (f80_0)var5_9)) != var9_13) ** continue;
                    return var9_13;
                }
            }
            var19_21.a = null;
            var19_21.b = null;
            var19_21.c = var20_22;
            var19_21.e = var11_15;
            var3_3 = var17_19.d((f80_0)var19_21);
            if (var3_3 == var9_13) {
                return var9_13;
            }
            var13_17 = var20_22;
            return new Long(var13_17);
        }
        try {
            var18_20.e((Throwable)var3_6);
            kf_1.a(var17_19, (Throwable)var3_6);
            throw var3_6;
        }
        catch (Throwable var3_7) {
            var5_9.a = var3_7;
            var5_9.b = null;
            var5_9.e = var10_14;
            var5_9 = var17_19.d((f80_0)var5_9);
            if (var5_9 == var9_13) {
                return var9_13;
            }
            var5_9 = var3_7;
        }
        throw var5_9;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object c(uf_1 var0, long var1_1, f80_0 var3_2) {
        block7: {
            block8: {
                var4_3 = var3_2 instanceof wF$c;
                if (!var4_3) ** GOTO lbl-1000
                var5_4 = var3_2;
                var5_4 = (wF$c)var3_2;
                var6_5 = var5_4.e;
                var7_6 = -1 << -1;
                var8_7 = var6_5 & var7_6;
                if (var8_7 != 0) {
                    var5_4.e = var6_5 -= var7_6;
                } else lbl-1000:
                // 2 sources

                {
                    var5_4 = new h80_0((f80_0)var3_2);
                }
                var3_2 = var5_4.d;
                var9_8 = j90_0.COROUTINE_SUSPENDED;
                var7_6 = var5_4.e;
                var8_7 = 1;
                if (var7_6 == 0) break block7;
                if (var7_6 != var8_7) break block8;
                var10_9 = var5_4.c;
                var12_10 = var5_4.b;
                var14_11 = var5_4.a;
                vl2_2.b(var3_2);
                ** GOTO lbl41
            }
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
        }
        vl2_2.b(var3_2);
        var12_10 = var1_1;
        while ((var17_13 = (cfr_temp_0 = var1_1 - (var15_12 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) > 0 && (var17_13 = (long)var0.i()) == false) {
            block9: {
                var17_13 = wf_1.d((uf_1)var0);
                if (var17_13 != false) break block9;
                var5_4.a = var0;
                var5_4.b = var12_10;
                var5_4.c = var1_1;
                var5_4.e = var8_7;
                var3_2 = var0.h(var8_7, var5_4);
                if (var3_2 == var9_8) {
                    return var9_8;
                }
                var14_11 = var0;
                var10_9 = var1_1;
lbl41:
                // 2 sources

                var0 = var14_11;
                var1_1 = var10_9;
            }
            var15_12 = af_2.c(var0.g());
            var15_12 = Math.min(var1_1, var15_12);
            var3_2 = var0.g();
            af_2.b((b93_0)var3_2, var15_12);
            var1_1 -= var15_12;
        }
        var0 = new Long(var12_10 -= var1_1);
        return var0;
    }

    public static final int d(uf_1 uf_12) {
        Intrinsics.checkNotNullParameter(uf_12, "<this>");
        return (int)uf_12.g().e().c;
    }

    /*
     * Unable to fully structure code
     */
    public static final Comparable e(uf_1 var0, int var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof xf_2;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (xf_2)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new h80_0((f80_0)var2_2);
        }
        var2_2 = var4_4.c;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 0;
        var9_9 = 1;
        if (var6_6 == 0) ** GOTO lbl25
        if (var6_6 == var9_9) {
            var1_1 = var4_4.b;
            var0 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl25:
            // 1 sources

            vl2_2.b(var2_2);
            var10_10 = var0.i();
            if (var10_10) {
                return null;
            }
            var4_4.a = var0;
            var4_4.b = var1_1;
            var4_4.d = var9_9;
            var2_2 = var0.h(var1_1, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        var2_2 = (Boolean)var2_2;
        var10_10 = var2_2.booleanValue();
        if (!var10_10) {
            return null;
        }
        var0 = var0.g().peek();
        Intrinsics.checkNotNullParameter(var0, "<this>");
        var0 = o93_0.a((b93_0)var0, var1_1);
        Intrinsics.checkNotNullParameter(var0, "array");
        var11_11 = ef_2.c;
        Intrinsics.checkNotNullParameter(var0, "byteArray");
        var11_11 = new ef_2((byte[])var0);
        return var11_11;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object f(uf_1 var0, byte[] var1_1, int var2_2, int var3_3, f80_0 var4_4) {
        var5_5 = var4_4 instanceof wF$d;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var4_4;
        var6_6 = (wF$d)var4_4;
        var7_7 = var6_6.f;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.f = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new h80_0((f80_0)var4_4);
        }
        var4_4 = var6_6.e;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.f;
        var9_9 = 1;
        var11_11 = -1;
        if (var8_8 == 0) ** GOTO lbl27
        if (var8_8 == var9_9) {
            var3_3 = var6_6.d;
            var2_2 = var6_6.c;
            var1_1 /* !! */  = var6_6.b;
            var0 = var6_6.a;
            vl2_2.b(var4_4);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl27:
            // 1 sources

            vl2_2.b(var4_4);
            var12_12 = var0.i();
            if (var12_12) {
                var0 = new Integer(var11_11);
                return var0;
            }
            var4_4 = var0.g();
            var12_12 = var4_4.g();
            if (var12_12) {
                var6_6.a = var0;
                var6_6.b = var1_1 /* !! */ ;
                var6_6.c = var2_2;
                var6_6.d = var3_3;
                var6_6.f = var9_9;
                var4_4 = var0.h(var9_9, var6_6);
                if (var4_4 == var10_10) {
                    return var10_10;
                }
            }
        }
        var12_12 = var0.i();
        if (var12_12) {
            var0 = new Integer(var11_11);
            return var0;
        }
        var0 = var0.g();
        Intrinsics.checkNotNullParameter(var0, "<this>");
        var4_4 = "buffer";
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)var4_4);
        var13_13 = var0.X(var2_2, var1_1 /* !! */ , var3_3 += var2_2);
        if (var13_13 == var11_11) {
            var13_13 = 0;
            var0 = null;
        }
        var1_1 /* !! */  = (byte[])new Integer;
        var1_1 /* !! */ (var13_13);
        return var1_1 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object g(uf_1 var0, f80_0 var1_1) {
        var2_2 = var1_1 instanceof wF$e;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (wF$e)var1_1;
        var4_4 = var3_3.d;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.d = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new h80_0((f80_0)var1_1);
        }
        var1_1 = var3_3.c;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.d;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl26
        if (var5_5 == var6_6) {
            var0 = var3_3.b;
            var8_8 = var3_3.a;
            vl2_2.b(var1_1);
            var1_1 = var0;
            var0 = var8_8;
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl26:
            // 1 sources

            vl2_2.b(var1_1);
            var1_1 = new ee_2();
        }
        while ((var5_5 = (int)var0.i()) == 0) {
            var8_8 = var0.g();
            var1_1.J((we2_2)var8_8);
            var3_3.a = var0;
            var3_3.b = var1_1;
            var3_3.d = var6_6;
            var8_8 = var0.h(var6_6, var3_3);
            if (var8_8 != var7_7) continue;
            return var7_7;
        }
        if ((var0 = var0.f()) == null) {
            return var1_1;
        }
        throw var0;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object h(uf_1 var0, f80_0 var1_1) {
        var2_2 = var1_1 instanceof wF$f;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (wF$f)var1_1;
        var4_4 = var3_3.c;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.c = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new h80_0((f80_0)var1_1);
        }
        var1_1 = var3_3.b;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.c;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl23
        if (var5_5 == var6_6) {
            var0 = var3_3.a;
            vl2_2.b(var1_1);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl23:
            // 1 sources

            vl2_2.b(var1_1);
            var1_1 = var0.g();
            var8_8 = var1_1.g();
            if (var8_8) {
                var3_3.a = var0;
                var3_3.c = var6_6;
                var1_1 = var0.h(var6_6, var3_3);
                if (var1_1 == var7_7) {
                    return var7_7;
                }
            }
        }
        var1_1 = var0.g();
        var8_8 = var1_1.g();
        if (!var8_8) {
            return var0.g().readByte();
        }
        var0 = new EOFException("Not enough data available");
        throw var0;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object i(uf_1 var0, int var1_1, f80_0 var2_2) {
        block9: {
            block10: {
                var3_3 = var2_2 instanceof wF$g;
                if (!var3_3) ** GOTO lbl-1000
                var4_4 = var2_2;
                var4_4 = (wF$g)var2_2;
                var5_5 = var4_4.e;
                var6_6 = -1 << -1;
                var7_7 = var5_5 & var6_6;
                if (var7_7 != 0) {
                    var4_4.e = var5_5 -= var6_6;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = new h80_0((f80_0)var2_2);
                }
                var2_2 = var4_4.d;
                var8_8 = j90_0.COROUTINE_SUSPENDED;
                var6_6 = var4_4.e;
                var7_7 = 1;
                if (var6_6 == 0) break block9;
                if (var6_6 != var7_7) break block10;
                var9_9 = var4_4.c;
                var10_10 = var4_4.b;
                var11_11 = var4_4.a;
                vl2_2.b(var2_2);
                ** GOTO lbl44
            }
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
        }
        vl2_2.b(var2_2);
        var2_2 = new ee_2();
        var12_12 = var1_1;
        var10_10 = var2_2;
        while ((var6_6 = (int)((cfr_temp_0 = (var13_13 = var10_10.c) - (var15_14 = (long)var12_12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) < 0) {
            block11: {
                var11_11 = var0.g();
                var6_6 = (int)var11_11.g();
                if (var6_6 == 0) break block11;
                var4_4.a = var0;
                var4_4.b = var10_10;
                var4_4.c = var12_12;
                var4_4.e = var7_7;
                var11_11 = var0.h(var7_7, var4_4);
                if (var11_11 == var8_8) {
                    return var8_8;
                }
                var11_11 = var0;
                var9_9 = var12_12;
lbl44:
                // 2 sources

                var12_12 = var9_9;
                var0 = var11_11;
            }
            if ((var6_6 = (int)var0.i()) != 0) break;
            var11_11 = var0.g();
            var13_13 = af_2.c((b93_0)var11_11);
            var15_14 = var12_12;
            var17_15 = var10_10.c;
            cfr_temp_1 = var13_13 - (var17_15 = var15_14 - var17_15);
            var6_6 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var6_6 > 0) {
                var11_11 = var0.g();
                var13_13 = var10_10.c;
                var11_11.t((z63_0)var10_10, var15_14 -= var13_13);
                continue;
            }
            var13_13 = var0.g().A0((z63_0)var10_10);
            var11_11 = new Long(var13_13);
        }
        if ((var9_9 = (int)((cfr_temp_2 = (var19_16 = var10_10.c) - (var21_17 = (long)var12_12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0) {
            return var10_10;
        }
        var2_2 = wk0_0.a(var12_12, "Not enough data available, required ", " bytes but only ");
        var19_16 = var10_10.c;
        var10_10 = jl0_0.b((StringBuilder)var2_2, var19_16, " available");
        var0 = new EOFException((String)var10_10);
        throw var0;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object j(uf_1 var0, long var1_1, f80_0 var3_2) {
        var4_3 = var3_2 instanceof wF$i;
        if (!var4_3) ** GOTO lbl-1000
        var5_4 = var3_2;
        var5_4 = (wF$i)var3_2;
        var6_5 = var5_4.e;
        var7_6 = -1 << -1;
        var8_7 = var6_5 & var7_6;
        if (var8_7 != 0) {
            var5_4.e = var6_5 -= var7_6;
        } else lbl-1000:
        // 2 sources

        {
            var5_4 = new h80_0((f80_0)var3_2);
        }
        var3_2 = var5_4.d;
        var9_8 = j90_0.COROUTINE_SUSPENDED;
        var7_6 = var5_4.e;
        var8_7 = 1;
        if (var7_6 == 0) ** GOTO lbl28
        if (var7_6 == var8_7) {
            var10_9 = var5_4.c;
            var12_10 = var5_4.b;
            var13_11 = var5_4.a;
            vl2_2.b(var3_2);
            var3_2 = var12_10;
            var1_1 = var10_9;
            var0 = var13_11;
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl28:
            // 1 sources

            vl2_2.b(var3_2);
            var3_2 = new ee_2();
        }
        while ((var7_6 = (int)var0.i()) == 0 && (var7_6 = (int)((cfr_temp_0 = var1_1 - (var14_12 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) > 0) {
            var13_11 = var0.g();
            var16_13 = af_2.c((b93_0)var13_11);
            cfr_temp_1 = var1_1 - var16_13;
            var7_6 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var7_6 >= 0) {
                var14_12 = af_2.c(var0.g());
                var14_12 = var1_1 - var14_12;
                var18_14 = var0.g();
                var1_1 = var18_14.A0((z63_0)var3_2);
                var13_11 = new Long(var1_1);
            } else {
                var13_11 = var0.g();
                var13_11.t((z63_0)var3_2, var1_1);
            }
            var5_4.a = var0;
            var5_4.b = var3_2;
            var5_4.c = var14_12;
            var5_4.e = var8_7;
            var18_14 = var0.h(var8_7, var5_4);
            if (var18_14 == var9_8) {
                return var9_8;
            }
            var1_1 = var14_12;
        }
        return var3_2.e();
    }

    /*
     * Unable to fully structure code
     */
    public static final Object k(uf_1 var0, f80_0 var1_1) {
        var2_2 = var1_1 instanceof wF$h;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (wF$h)var1_1;
        var4_4 = var3_3.d;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.d = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new h80_0((f80_0)var1_1);
        }
        var1_1 = var3_3.c;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.d;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl26
        if (var5_5 == var6_6) {
            var0 = var3_3.b;
            var8_8 = var3_3.a;
            vl2_2.b(var1_1);
            var1_1 = var0;
            var0 = var8_8;
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl26:
            // 1 sources

            vl2_2.b(var1_1);
            var1_1 = new ee_2();
        }
        while ((var5_5 = (int)var0.i()) == 0) {
            var8_8 = var0.g();
            var1_1.J((we2_2)var8_8);
            var3_3.a = var0;
            var3_3.b = var1_1;
            var3_3.d = var6_6;
            var8_8 = var0.h(var6_6, (f80_0)var3_3);
            if (var8_8 != var7_7) continue;
            return var7_7;
        }
        var3_3 = "<this>";
        Intrinsics.checkNotNullParameter(var0, (String)var3_3);
        var0 = var0.f();
        if (var0 == null) {
            return var1_1.e();
        }
        throw var0;
    }

    /*
     * Exception decompiling
     */
    public static final Object l(uf_1 var0, as_2 var1_1, int var2_2, f80_0 var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 239->247)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object m(uf_1 var0, ef_2 var1_1, gf_2 var2_2, long var3_3, boolean var5_4, f80_0 var6_5) {
        block30: {
            block32: {
                block28: {
                    block29: {
                        block22: {
                            block23: {
                                block24: {
                                    block25: {
                                        block26: {
                                            block27: {
                                                var7_6 = var1_1;
                                                var8_7 = var6_5;
                                                var9_8 /* !! */  = 1;
                                                var10_9 = var6_5 instanceof wF$j;
                                                if (!var10_9) ** GOTO lbl-1000
                                                var11_10 = var6_5;
                                                var11_10 = (wF$j)var6_5;
                                                var12_11 = var11_10.l;
                                                var13_12 = -1 << -1;
                                                var14_13 = var12_11 & var13_12;
                                                if (var14_13 != 0) {
                                                    var11_10.l = var12_11 -= var13_12;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var11_10 = new h80_0((f80_0)var8_7);
                                                }
                                                var8_7 = var11_10.k;
                                                var15_14 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                var13_12 = var11_10.l;
                                                var16_15 = "<this>";
                                                var17_16 /* !! */  = 5;
                                                var18_17 = 4;
                                                var19_18 = 3;
                                                var20_19 = 2;
                                                if (var13_12 == 0) break block22;
                                                if (var13_12 == var9_8 /* !! */ ) break block23;
                                                if (var13_12 == var20_19) break block24;
                                                if (var13_12 == var19_18) break block25;
                                                if (var13_12 == var18_17) break block26;
                                                if (var13_12 != var17_16 /* !! */ ) break block27;
                                                var7_6 = (Ref$LongRef)var11_10.a;
                                                vl2_2.b(var8_7);
                                                break block28;
                                            }
                                            var7_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var7_6;
                                        }
                                        var7_6 = (Ref$LongRef)var11_10.b;
                                        var21_20 = (gf_2)var11_10.a;
                                        vl2_2.b(var8_7);
                                        var22_24 /* !! */  = var7_6;
                                        var23_25 = 0;
                                        var7_6 = null;
                                        break block29;
                                    }
                                    var23_25 = (int)var11_10.i;
                                    var24_26 = var11_10.h;
                                    var26_27 = var11_10.g;
                                    var27_28 = var11_10.f;
                                    var28_29 = var11_10.e;
                                    var29_30 /* !! */  = var11_10.d;
                                    var30_31 /* !! */  = (byte[])var11_10.c;
                                    var31_32 = (ef_2)var11_10.b;
                                    var32_33 = (uf_1)var11_10.a;
                                    vl2_2.b(var8_7);
                                    var33_34 = var24_26;
                                    ** GOTO lbl223
                                }
                                var23_25 = var11_10.j;
                                var13_12 = (int)var11_10.i;
                                var35_35 = var11_10.h;
                                var30_31 /* !! */  = (byte[])var11_10.g;
                                var32_33 = var11_10.f;
                                var31_32 = var11_10.e;
                                var22_24 /* !! */  = var11_10.d;
                                var37_36 = var11_10.c;
                                var27_28 = (ef_2)var11_10.b;
                                var38_37 /* !! */  = (int[])((uf_1)var11_10.a);
                                vl2_2.b(var8_7);
                                ** GOTO lbl166
                            }
                            var23_25 = var11_10.i;
                            var35_35 = var11_10.h;
                            var26_27 = var11_10.g;
                            var30_31 /* !! */  = var11_10.f;
                            var32_33 = var11_10.e;
                            var38_37 /* !! */  = var11_10.d;
                            var31_32 = var11_10.c;
                            var22_24 /* !! */  = (ef_2)var11_10.b;
                            var37_36 = (uf_1)var11_10.a;
                            vl2_2.b(var8_7);
                            var27_28 = var22_24 /* !! */ ;
                            var22_24 /* !! */  = var38_37 /* !! */ ;
                            var38_37 /* !! */  = (int[])var37_36;
                            var37_36 = var31_32;
                            var31_32 = var32_33;
                            var32_33 = var30_31 /* !! */ ;
                            var30_31 /* !! */  = (byte[])var26_27;
                            var13_12 = var23_25;
                            ** GOTO lbl147
                        }
                        vl2_2.b(var8_7);
                        var8_7 = var7_6.a;
                        var13_12 = ((Object)var8_7).length;
                        if (var13_12 <= 0) break block30;
                        var13_12 = ((Object)var8_7).length;
                        var26_27 = new int[var13_12];
                        var39_38 = ((Object)var8_7).length;
                        var17_16 /* !! */  = 0;
                        var29_30 /* !! */  = null;
                        for (var40_39 = 1; var40_39 < var39_38; var40_39 += var9_8 /* !! */ ) {
                            while (var17_16 /* !! */  > 0 && (var18_17 = (int)var7_6.a(var40_39)) != (var19_18 = (int)var7_6.a(var17_16 /* !! */ ))) {
                                var17_16 /* !! */  -= var9_8 /* !! */ ;
                                var17_16 /* !! */  = (int)var26_27[var17_16 /* !! */ ];
                            }
                            var18_17 = var7_6.a(var40_39);
                            if (var18_17 == (var19_18 = (int)var7_6.a(var17_16 /* !! */ ))) {
                                var17_16 /* !! */  += var9_8 /* !! */ ;
                            }
                            var26_27[var40_39] = var17_16 /* !! */ ;
                        }
                        var8_7 = new Ref$IntRef();
                        var40_39 = var7_6.a.length;
                        var28_29 = new byte[var40_39];
                        var29_30 /* !! */  = (int[])new Ref$LongRef;
                        var29_30 /* !! */ ();
                        var30_31 /* !! */  = (byte[])var8_7;
                        var32_33 = var11_10;
                        var38_37 /* !! */  = (int[])var26_27;
                        var31_32 = var28_29;
                        var22_24 /* !! */  = var29_30 /* !! */ ;
                        var11_10 = var2_2;
                        var35_35 = var3_3;
                        var13_12 = (int)var5_4;
                        var8_7 = var7_6;
                        var7_6 = var0;
                        while (!(var41_40 = var7_6.i())) {
                            block31: {
                                var32_33.a = var7_6;
                                var32_33.b = var8_7;
                                var32_33.c = var11_10;
                                var32_33.d = var38_37 /* !! */ ;
                                var32_33.e = var30_31 /* !! */ ;
                                var32_33.f = (byte[])var31_32;
                                var32_33.g = var22_24 /* !! */ ;
                                var32_33.h = var35_35;
                                var32_33.i = var13_12;
                                var32_33.l = var9_8 /* !! */ ;
                                var37_36 = wf_1.h((uf_1)var7_6, (f80_0)var32_33);
                                if (var37_36 == var15_14 /* !! */ ) {
                                    return var15_14 /* !! */ ;
                                }
                                var27_28 = var8_7;
                                var8_7 = var37_36;
                                var37_36 = var11_10;
                                var11_10 = var32_33;
                                var32_33 = var31_32;
                                var31_32 = var30_31 /* !! */ ;
                                var30_31 /* !! */  = (byte[])var22_24 /* !! */ ;
                                var22_24 /* !! */  = var38_37 /* !! */ ;
                                var38_37 /* !! */  = (int[])var7_6;
lbl147:
                                // 2 sources

                                var8_7 = (Number)var8_7;
                                var23_25 = var8_7.byteValue();
                                var39_38 = var31_32.element;
                                if (var39_38 > 0 && var23_25 != (var39_38 = (int)var27_28.a(var39_38))) {
                                    var11_10.a = var38_37 /* !! */ ;
                                    var11_10.b = var27_28;
                                    var11_10.c = var37_36;
                                    var11_10.d = (int[])var22_24 /* !! */ ;
                                    var11_10.e = var31_32;
                                    var11_10.f = (byte[])var32_33;
                                    var11_10.g = var30_31 /* !! */ ;
                                    var11_10.h = var35_35;
                                    var11_10.i = var13_12;
                                    var11_10.j = (byte)var23_25;
                                    var11_10.l = var39_38 = 2;
                                    var8_7 = wf_1.n((gf_2)var37_36, (byte[])var32_33, (Ref$IntRef)var31_32, (Ref$LongRef)var30_31 /* !! */ , (f80_0)var11_10);
                                    if (var8_7 == var15_14 /* !! */ ) {
                                        return var15_14 /* !! */ ;
                                    } else {
                                        ** GOTO lbl166
                                    }
                                }
                                break block31;
lbl166:
                                // 3 sources

                                var39_38 = (byte)var23_25;
                                while ((var9_8 /* !! */  = var31_32.element) > 0 && var39_38 != (var9_8 /* !! */  = (int)var27_28.a(var9_8 /* !! */ ))) {
                                    var9_8 /* !! */  = var31_32.element + -1;
                                    var31_32.element = var9_8 /* !! */  = (int)var22_24 /* !! */ [var9_8 /* !! */ ];
                                }
                            }
                            var33_34 = var35_35;
                            var28_29 = var31_32;
                            var29_30 /* !! */  = (int[])var22_24 /* !! */ ;
                            var31_32 = var27_28;
                            var27_28 = var32_33;
                            var32_33 = var38_37 /* !! */ ;
                            var20_19 = var28_29.element;
                            if (var23_25 == (var20_19 = (int)var31_32.a(var20_19))) {
                                var20_19 = var28_29.element;
                                var23_25 = (byte)var23_25;
                                var27_28[var20_19] = var23_25;
                                var42_41 = 1;
                                var28_29.element = var20_19 += var42_41;
                                var7_6 = var31_32.a;
                                var23_25 = ((Object)var7_6).length;
                                if (var20_19 == var23_25) {
                                    var43_42 = var30_31 /* !! */ .element;
                                    var21_21 = new Long(var43_42);
                                    return var21_21;
                                }
                                var38_37 /* !! */  = (int[])var22_24 /* !! */ ;
                                var22_24 /* !! */  = var30_31 /* !! */ ;
                                var7_6 = var32_33;
                                var32_33 = var11_10;
                                var30_31 /* !! */  = (byte[])var28_29;
                                var11_10 = var37_36;
                                var8_7 = var31_32;
                                var31_32 = var27_28;
                            } else {
                                var42_41 = 1;
                                var23_25 = (byte)var23_25;
                                var11_10.a = var38_37 /* !! */ ;
                                var11_10.b = var31_32;
                                var11_10.c = var37_36;
                                var11_10.d = (int[])var22_24 /* !! */ ;
                                var11_10.e = var28_29;
                                var11_10.f = (byte[])var27_28;
                                var11_10.g = var30_31 /* !! */ ;
                                var11_10.h = var35_35;
                                var11_10.i = var13_12;
                                var11_10.l = var20_19 = 3;
                                var37_36.b().p((byte)var23_25);
                                var7_6 = hf_2.a((gf_2)var37_36, (f80_0)var11_10);
                                var38_37 /* !! */  = (int[])j90_0.COROUTINE_SUSPENDED;
                                if (var7_6 != var38_37 /* !! */ ) {
                                    var7_6 = Unit.a;
                                }
                                if (var7_6 == var15_14 /* !! */ ) {
                                    return var15_14 /* !! */ ;
                                }
                                var23_25 = var13_12;
                                var26_27 = var30_31 /* !! */ ;
                                var30_31 /* !! */  = (byte[])var37_36;
lbl223:
                                // 2 sources

                                var24_26 = var26_27.element;
                                var45_43 = 1L;
                                var26_27.element = var43_42 = var24_26 + var45_43;
                                new Long(var24_26);
                                var22_24 /* !! */  = var26_27;
                                var38_37 /* !! */  = var29_30 /* !! */ ;
                                var7_6 = var32_33;
                                var8_7 = var31_32;
                                var31_32 = var27_28;
                                var13_12 = var23_25;
                                var32_33 = var11_10;
                                var11_10 = var30_31 /* !! */ ;
                                var30_31 /* !! */  = (byte[])var28_29;
                                var35_35 = var33_34;
                            }
                            var47_44 = var22_24 /* !! */ .element;
                            var9_8 /* !! */  = (int)(var47_44 == var35_35 ? 0 : (var47_44 < var35_35 ? -1 : 1));
                            if (var9_8 /* !! */  <= 0) {
                                var9_8 /* !! */  = 1;
                                continue;
                            }
                            var21_22 = D70.c(var35_35, "Limit of ", " bytes exceeded while scanning for \"");
                            Intrinsics.checkNotNullParameter(var8_7, var16_15);
                            var8_7 = var8_7.a;
                            Intrinsics.checkNotNullParameter(var8_7, var16_15);
                            var15_14 /* !! */  = Charsets.UTF_8;
                            var11_10 = new String((byte[])var8_7, (Charset)var15_14 /* !! */ );
                            var8_7 = ui0_1.a(var21_22, (String)var11_10, '\"');
                            var7_6 = new IOException((String)var8_7);
                            throw var7_6;
                        }
                        if (var13_12 == 0) break block32;
                        var32_33.a = var11_10;
                        var32_33.b = var22_24 /* !! */ ;
                        var23_25 = 0;
                        var7_6 = null;
                        var32_33.c = null;
                        var32_33.d = null;
                        var32_33.e = null;
                        var32_33.f = null;
                        var32_33.g = null;
                        var32_33.l = var39_38 = 4;
                        var8_7 = wf_1.n((gf_2)var11_10, (byte[])var31_32, (Ref$IntRef)var30_31 /* !! */ , (Ref$LongRef)var22_24 /* !! */ , (f80_0)var32_33);
                        if (var8_7 == var15_14 /* !! */ ) {
                            return var15_14 /* !! */ ;
                        }
                        var21_20 = var11_10;
                        var11_10 = var32_33;
                    }
                    var11_10.a = var22_24 /* !! */ ;
                    var11_10.b = null;
                    var11_10.l = var23_25 = 5;
                    var7_6 = var21_20.d((f80_0)var11_10);
                    if (var7_6 == var15_14 /* !! */ ) {
                        return var15_14 /* !! */ ;
                    }
                    var7_6 = var22_24 /* !! */ ;
                }
                var43_42 = var7_6.element;
                var21_20 = new Long(var43_42);
                return var21_20;
            }
            var21_23 = new StringBuilder("Expected \"");
            Intrinsics.checkNotNullParameter(var8_7, var16_15);
            var8_7 = var8_7.a;
            Intrinsics.checkNotNullParameter(var8_7, var16_15);
            var15_14 /* !! */  = Charsets.UTF_8;
            var11_10 = new String((byte[])var8_7, (Charset)var15_14 /* !! */ );
            var8_7 = b.n((String)var11_10, "\n", "\\n", false);
            var8_7 = h30_0.a(var21_23, (String)var8_7, "\" but encountered end of input");
            var7_6 = new IOException((String)var8_7);
            throw var7_6;
        }
        var8_7 = "Empty match string not permitted for readUntil".toString();
        var7_6 = new IllegalStateException((String)var8_7);
        throw var7_6;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object n(gf_2 var0, byte[] var1_1, Ref$IntRef var2_2, Ref$LongRef var3_3, f80_0 var4_4) {
        var5_5 = var4_4 instanceof wF$k;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var4_4;
        var6_6 = (wF$k)var4_4;
        var7_7 = var6_6.d;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.d = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new h80_0((f80_0)var4_4);
        }
        var4_4 = var6_6.c;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.d;
        var9_9 = 0;
        var11_11 = 1;
        if (var8_8 == 0) ** GOTO lbl25
        if (var8_8 == var11_11) {
            var3_3 = var6_6.b;
            var2_2 = var6_6.a;
            vl2_2.b(var4_4);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl25:
            // 1 sources

            vl2_2.b(var4_4);
            var12_12 = var2_2.element;
            var6_6.a = var2_2;
            var6_6.b = var3_3;
            var6_6.d = var11_11;
            var0 = kf_1.b((gf_2)var0, var1_1, 0, var12_12, var6_6);
            if (var0 == var10_10) {
                return var10_10;
            }
        }
        var13_13 = var3_3.element;
        var15_14 = var2_2.element;
        var3_3.element = var13_13 += var15_14;
        var2_2.element = 0;
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object o(uf_1 var0, ef_2 var1_1, f80_0 var2_2) {
        block10: {
            block8: {
                block9: {
                    block5: {
                        block6: {
                            block7: {
                                var3_3 = var2_2 instanceof wF$l;
                                if (!var3_3) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (wF$l)var2_2;
                                var5_5 = var4_4.d;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7 != 0) {
                                    var4_4.d = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new h80_0((f80_0)var2_2);
                                }
                                var2_2 = var4_4.c;
                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.d;
                                var7_7 = 2;
                                var9_9 = 1;
                                if (var6_6 == 0) break block5;
                                if (var6_6 == var9_9) break block6;
                                if (var6_6 != var7_7) break block7;
                                vl2_2.b(var2_2);
                                break block8;
                            }
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        var1_1 = var4_4.b;
                        var0 = var4_4.a;
                        vl2_2.b(var2_2);
                        break block9;
                    }
                    vl2_2.b(var2_2);
                    var10_10 = var1_1.a.length;
                    var4_4.a = var0;
                    var4_4.b = var1_1;
                    var4_4.d = var9_9;
                    var2_2 = wf_1.e((uf_1)var0, var10_10, var4_4);
                    if (var2_2 == var8_8) {
                        return var8_8;
                    }
                }
                var10_10 = (int)Intrinsics.areEqual(var2_2, var1_1);
                if (var10_10 != 0) {
                    var1_1 = var1_1.a;
                    var11_11 = ((Object)var1_1).length;
                    var12_12 = var11_11;
                    var6_6 = 0;
                    var4_4.a = null;
                    var4_4.b = null;
                    var4_4.d = var7_7;
                    if ((var0 = wf_1.c((uf_1)var0, var12_12, var4_4)) == var8_8) {
                        return var8_8;
                    } else {
                        ** GOTO lbl52
                    }
                }
                break block10;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /*
     * Unable to fully structure code
     */
    public static final Serializable p(uf_1 var0, f80_0 var1_1) {
        var2_2 = var1_1 instanceof zf_2;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (zf_2)var1_1;
        var4_4 = var3_3.b;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.b = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new h80_0((f80_0)var1_1);
        }
        var1_1 = var3_3.a;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.b;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl22
        if (var5_5 == var6_6) {
            vl2_2.b(var1_1);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl22:
            // 1 sources

            vl2_2.b(var1_1);
            var3_3.b = var6_6;
            var1_1 = wf_1.g((uf_1)var0, var3_3);
            if (var1_1 == var7_7) {
                return var7_7;
            }
        }
        var1_1 = (ee_2)var1_1;
        var8_8 = (int)var1_1.c;
        Intrinsics.checkNotNullParameter(var1_1, "<this>");
        return o93_0.a((b93_0)var1_1, var8_8);
    }
}

