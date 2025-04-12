/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.d;
import kotlin.text.Charsets;

/*
 * Renamed from hR1
 */
public final class hr1_2 {
    public static final ef_2 a;
    public static final ef_2 b;

    static {
        Object object = Charsets.UTF_8;
        object = be3_1.b("\r\n", (Charset)object);
        Object object2 = new ef_2((byte[])object, 0);
        a = object2;
        Object object3 = object2 = (Object)new byte[2];
        object3[0] = 45;
        object3[1] = 45;
        Intrinsics.checkNotNullParameter(object2, "bytes");
        Intrinsics.checkNotNullParameter(object2, "byteArray");
        b = object = new ef_2((byte[])object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ef_2 var0, u90_0 var1_1, if_1 var2_2, ka1_1 var3_3, long var4_4, f80_0 var6_5) {
        block27: {
            block25: {
                block20: {
                    block26: {
                        block21: {
                            block22: {
                                block24: {
                                    block23: {
                                        block15: {
                                            block16: {
                                                block17: {
                                                    block18: {
                                                        block19: {
                                                            var7_6 = var1_1;
                                                            var8_7 = var2_2;
                                                            var9_8 = var4_4;
                                                            var11_9 = var6_5;
                                                            var12_10 = var6_5 instanceof fr1_2;
                                                            if (var12_10 != 0) {
                                                                var13_11 = var6_5;
                                                                var13_11 = (fr1_2)var6_5;
                                                                var14_12 = var13_11.f;
                                                                var15_13 = -1 << -1;
                                                                var16_14 = var14_12 & var15_13;
                                                                if (var16_14 != 0) {
                                                                    var13_11.f = var14_12 -= var15_13;
lbl14:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            var13_11 = new h80_0((f80_0)var11_9);
                                                            ** while (true)
                                                            var17_15 = var13_11;
                                                            var11_9 = var13_11.e;
                                                            var18_16 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                            var12_10 = var13_11.f;
                                                            var14_12 = 1;
                                                            var19_17 = 4;
                                                            var15_13 = 2;
                                                            var20_18 = 3;
                                                            if (var12_10 == 0) break block15;
                                                            if (var12_10 == var14_12) break block16;
                                                            if (var12_10 == var15_13) break block17;
                                                            if (var12_10 == var20_18) break block18;
                                                            if (var12_10 != var19_17) break block19;
                                                            var21_19 = var13_11.d;
                                                            vl2_2.b(var11_9);
                                                            break block20;
                                                        }
                                                        var7_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        throw var7_6;
                                                    }
                                                    var21_19 = var13_11.d;
                                                    var7_6 = (gf_2)var13_11.a;
                                                    vl2_2.b(var11_9);
                                                    var23_20 = false;
                                                    break block21;
                                                }
                                                var7_6 = var13_11.c;
                                                var13_11 = var13_11.b;
                                                var24_23 = (ef_2)var17_15.a;
                                                vl2_2.b(var11_9);
                                                var8_7 = var7_6;
                                                var7_6 = var13_11;
                                                break block22;
                                            }
                                            var7_6 = (gf_2)var13_11.a;
                                            vl2_2.b(var11_9);
                                            break block23;
                                        }
                                        vl2_2.b(var11_9);
                                        var13_11 = var3_3;
                                        var11_9 = var3_3.a("Content-Length");
                                        var25_24 = 0L;
                                        if (var11_9 == null) ** GOTO lbl128
                                        var13_11 = "<this>";
                                        Intrinsics.checkNotNullParameter(var11_9, (String)var13_11);
                                        var12_10 = var11_9.length();
                                        var27_25 = ": too large for Long type";
                                        var28_26 = "Invalid number ";
                                        var15_13 = 19;
                                        if (var12_10 <= var15_13) {
                                            var29_27 = 9;
                                            var31_28 = 48;
                                            if (var12_10 == var15_13) {
                                                var12_10 = var11_9.length();
                                                var33_29 = var25_24;
                                                var15_13 = 0;
                                                while (var15_13 < var12_10) {
                                                    var35_30 = var11_9.charAt(var15_13);
                                                    var36_31 = var15_13++;
                                                    var37_32 = (long)var35_30 - var31_28;
                                                    cfr_temp_0 = var37_32 - var25_24;
                                                    if ((var35_30 = (char)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) >= '\u0000' && (var35_30 = (char)(var37_32 == var29_27 ? 0 : (var37_32 < var29_27 ? -1 : 1))) <= '\u0000') {
                                                        var39_33 = var33_29 << var20_18;
                                                        var35_30 = '\u0001';
                                                        var33_29 <<= var35_30;
                                                        cfr_temp_1 = (var33_29 = (var39_33 += var33_29) + var37_32) - var25_24;
                                                        var14_12 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                                        if (var14_12 >= 0) {
                                                            var14_12 = 1;
                                                            continue;
                                                        }
                                                        var13_11 = new StringBuilder(var28_26);
                                                        var13_11.append(var11_9);
                                                        var13_11.append(var27_25);
                                                        var11_9 = var13_11.toString();
                                                        var7_6 = new NumberFormatException((String)var11_9);
                                                        throw var7_6;
                                                    }
                                                    var15_13 = var36_31;
                                                    ns_2.b((as$a_0)var11_9, var36_31);
                                                    throw null;
                                                }
                                                while (true) {
                                                    break;
                                                }
                                            } else {
                                                var33_29 = var25_24;
                                                var14_12 = 0;
                                                var43_35 = null;
                                                while (true) {
                                                    if (var14_12 >= var12_10) ** continue;
                                                    var44_36 = (long)var11_9.charAt(var14_12) - var31_28;
                                                    cfr_temp_2 = var44_36 - var25_24;
                                                    var15_13 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                                    if (var15_13 < 0 || (var15_13 = (int)(var44_36 == var29_27 ? 0 : (var44_36 < var29_27 ? -1 : 1))) > 0) break;
                                                    var39_34 = var33_29 << var20_18;
                                                    var15_13 = 1;
                                                    var33_29 = (var39_34 += (var33_29 <<= var15_13)) + var44_36;
                                                    ++var14_12;
                                                }
                                                ns_2.b((as$a_0)var11_9, var14_12);
                                                throw null;
                                            }
                                            var41_37 = var33_29;
                                            var43_35 = new Long(var33_29);
                                        } else {
                                            var13_11 = new StringBuilder(var28_26);
                                            var13_11.append(var11_9);
                                            var13_11.append(var27_25);
                                            var11_9 = var13_11.toString();
                                            var7_6 = new NumberFormatException((String)var11_9);
                                            throw var7_6;
lbl128:
                                            // 1 sources

                                            var14_12 = 0;
                                            var43_35 = null;
                                        }
                                        if (var43_35 != null) break block24;
                                        var17_15.a = var8_7;
                                        var17_15.f = var46_38 = 1;
                                        var14_12 = 1;
                                        var7_6 = var1_1;
                                        var11_9 = var0;
                                        var13_11 = var2_2;
                                        var9_8 = var4_4;
                                        var11_9 = wf_1.m(var1_1, var0, var2_2, var4_4, (boolean)var14_12, var17_15);
                                        if (var11_9 == var18_16 /* !! */ ) break block25;
                                        var7_6 = var8_7;
                                    }
                                    var11_9 = (Number)var11_9;
                                    var21_19 = var41_37 = var11_9.longValue();
                                    var23_21 = false;
                                    break block26;
                                }
                                var11_9 = new d(var25_24, var9_8);
                                var44_36 = var43_35;
                                var46_38 = (int)var11_9.d(var44_36);
                                if (var46_38 == 0) break block27;
                                var41_37 = var43_35;
                                var24_23 = var0;
                                var17_15.a = var0;
                                var17_15.b = var7_6;
                                var17_15.c = var8_7;
                                var17_15.f = var23_22 = 2;
                                var11_9 = wf_1.a((uf_1)var7_6, (gf_2)var8_7, var41_37, var17_15);
                                if (var11_9 == var18_16 /* !! */ ) break block25;
                            }
                            var11_9 = (Number)var11_9;
                            var41_37 = var11_9.longValue();
                            var17_15.a = var8_7;
                            var23_22 = 0;
                            var17_15.b = null;
                            var17_15.c = null;
                            var17_15.d = var41_37;
                            var17_15.f = var20_18;
                            var7_6 = hr1_2.d((uf_1)var7_6, var24_23, var17_15);
                            if (var7_6 == var18_16 /* !! */ ) break block25;
                            var21_19 = var41_37;
                            var11_9 = var7_6;
                            var7_6 = var8_7;
                        }
                        var11_9 = (Number)var11_9;
                        var21_19 = var37_32 = var11_9.longValue() + var21_19;
                    }
                    var17_15.a = null;
                    var17_15.d = var21_19;
                    var17_15.f = var46_38 = 4;
                    var7_6 = var7_6.d(var17_15);
                    if (var7_6 == var18_16 /* !! */ ) break block25;
                }
                var18_16 /* !! */  = new Long(var21_19);
            }
            return var18_16 /* !! */ ;
        }
        var47_39 = var43_35;
        var7_6 = jl0_0.b(D70.c(var47_39, "Multipart content length exceeds limit ", " > "), var9_8, "; limit is defined using 'formFieldLimit' argument");
        var13_11 = new IOException((String)var7_6);
        throw var13_11;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object b(u90_0 var0, f80_0 var1_2) {
        block16: {
            block17: {
                block15: {
                    var2_4 = 1;
                    var3_5 = var1_2 instanceof gr1_2;
                    if (!var3_5) ** GOTO lbl-1000
                    var4_6 = var1_2;
                    var4_6 = (gr1_2)var1_2;
                    var5_7 = var4_6.c;
                    var6_8 = -1 << -1;
                    var7_9 = var5_7 & var6_8;
                    if (var7_9 != 0) {
                        var4_6.c = var5_7 -= var6_8;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = new h80_0((f80_0)var1_2);
                    }
                    var1_2 = var4_6.b;
                    var8_10 = j90_0.COROUTINE_SUSPENDED;
                    var6_8 = var4_6.c;
                    var7_9 = 0;
                    if (var6_8 != 0) {
                        if (var6_8 != var2_4) {
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        var0 = var4_6.a;
                        try {
                            vl2_2.b(var1_2);
                            break block15;
                        }
                        catch (Throwable var1_3) {
                            break block16;
                        }
                    }
                    vl2_2.b(var1_2);
                    var1_2 = new as_2(null);
                    try {
                        var4_6.a = var1_2;
                        var4_6.c = var2_4;
                        var9_11 = sa1_0.a;
                        var9_11 = new Object();
                        var9_11.a = 0;
                        var9_11.b = 0;
                        var0 = sa1_0.d((u90_0)var0, (as_2)var1_2, (lr1_2)var9_11, (f80_0)var4_6);
                        if (var0 == var8_10) {
                            return var8_10;
                        }
                        var10_12 = var1_2;
                        var1_2 = var0;
                        var0 = var10_12;
                    }
                    catch (Throwable var0_1) {
                        break block17;
                    }
                }
                var8_10 = var1_2;
                {
                    var8_10 = (ka1_1)var1_2;
                    if (var8_10 != null) {
                        return var8_10;
                    }
                    var4_6 = "Failed to parse multipart headers: unexpected end of stream";
                    var1_2 = new EOFException((String)var4_6);
                    throw var1_2;
                }
            }
            var10_12 = var1_2;
            var1_2 = var0_1;
            var0 = var10_12;
        }
        var4_6 = var0.b;
        var8_10 = var0.a;
        if (var4_6 != null) {
            var0.c = null;
            var6_8 = var4_6.size();
            for (var11_13 = 0; var11_13 < var6_8; var11_13 += var2_4) {
                var12_14 = var4_6.get(var11_13);
                var8_10.C0(var12_14);
            }
        } else {
            var4_6 = var0.c;
            if (var4_6 != null) {
                var8_10.C0(var4_6);
            }
            var0.c = null;
        }
        var0.e = var2_4;
        var0.b = null;
        var0.d = null;
        var0.g = 0;
        var0.f = 0;
        throw var1_2;
    }

    public static final void c(Ref$IntRef serializable, byte[] byArray, byte by2) {
        int n3 = serializable.element;
        int n4 = byArray.length;
        if (n3 < n4) {
            serializable.element = n4 = n3 + 1;
            byArray[n3] = by2;
            return;
        }
        serializable = new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        throw serializable;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object d(uf_1 var0, ef_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof hr1$a_0;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (hr1$a_0)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new h80_0((f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var1_1 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var4_4.a = var1_1;
            var4_4.c = var7_7;
            var2_2 = wf_1.o((uf_1)var0, var1_1, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        var2_2 = (Boolean)var2_2;
        var9_9 = var2_2.booleanValue();
        if (var9_9 != 0) {
            var0 = var1_1.a;
            var9_9 = ((Object)var0).length;
            var10_10 = var9_9;
        } else {
            var10_10 = 0L;
        }
        var2_2 = new Long(var10_10);
        return var2_2;
    }
}

