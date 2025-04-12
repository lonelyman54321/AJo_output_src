/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from c
 */
public final class c_0 {
    public static final byte[] a;

    static {
        String string2 = "0123456789abcdef";
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Object object = Charsets.UTF_8;
        object = string2.getBytes((Charset)object);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).getBytes(charset)");
        a = (byte[])object;
    }

    public static final String a(ce_2 ce_22, long l2) {
        Object object;
        int n3;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(ce_22, (String)object2);
        long l3 = 0L;
        long l4 = 1L;
        long l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l7 > 0 && (l7 = (long)ce_22.n(l3 = l2 - l4)) == (n3 = 13)) {
            object = Charsets.UTF_8;
            object = ce_22.H(l3, (Charset)object);
            l3 = 2;
            ce_22.skip(l3);
        } else {
            ce_22.getClass();
            object2 = Charsets.UTF_8;
            object = ce_22.H(l2, (Charset)object2);
            ce_22.skip(l4);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final int b(ce_2 var0, aa2_2 var1_1, boolean var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        Intrinsics.checkNotNullParameter(var0, "<this>");
        var5_5 = "options";
        Intrinsics.checkNotNullParameter(var1_1, var5_5);
        var3_3 = var0.a;
        var6_6 = -2;
        var7_7 = -1;
        if (var3_3 == null) {
            if (!var2_2) {
                var6_6 = -1;
            }
            return var6_6;
        }
        var8_8 /* !! */  = var3_3.b;
        var9_9 = var3_3.c;
        var4_4 = var1_1.c;
        var10_10 /* !! */  = var3_3.a;
        var11_11 = var3_3;
        var12_12 /* !! */  = 0;
        var13_13 /* !! */  = null;
        var14_14 = -1;
        block0: while (true) {
            block19: {
                var15_15 /* !! */  = var12_12 /* !! */  + 1;
                var16_16 /* !! */  = var4_4[var12_12 /* !! */ ];
                var12_12 /* !! */  += 2;
                if ((var15_15 /* !! */  = (int)var4_4[var15_15 /* !! */ ]) != var7_7) {
                    var14_14 = var15_15 /* !! */ ;
                }
                if (var11_11 == null) ** GOTO lbl-1000
                var15_15 /* !! */  = 0;
                if (var16_16 /* !! */  >= 0) break block19;
                var17_17 /* !! */  = (int)((var16_16 /* !! */  *= -1) + var12_12 /* !! */ );
                while (true) {
                    block22: {
                        block21: {
                            block20: {
                                var16_16 /* !! */  = (reference)(var8_8 /* !! */  + 1);
                                var8_8 /* !! */  = var10_10 /* !! */ [var8_8 /* !! */ ] & 255;
                                var18_18 = var12_12 /* !! */  + 1;
                                if (var8_8 /* !! */  != (var12_12 /* !! */  = (int)var4_4[var12_12 /* !! */ ])) {
                                    return var14_14;
                                }
                                var8_8 /* !! */  = var18_18 == var17_17 /* !! */  ? 1 : 0;
                                if (var16_16 /* !! */  != var9_9) break block20;
                                Intrinsics.checkNotNull(var11_11);
                                var19_19 = var11_11.f;
                                Intrinsics.checkNotNull(var19_19);
                                var20_20 /* !! */  = var19_19.b;
                                var12_12 /* !! */  = var19_19.c;
                                var11_11 = var19_19.a;
                                if (var19_19 == var3_3) {
                                    ** if (var8_8 /* !! */  == 0) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        var9_9 = var12_12 /* !! */ ;
                                        var12_12 /* !! */  = 0;
                                        var13_13 /* !! */  = null;
                                        ** GOTO lbl63
                                    }
                                }
                                ** GOTO lbl55
lbl-1000:
                                // 2 sources

                                {
                                    if (var2_2) {
                                        return var6_6;
                                    }
                                    return var14_14;
lbl55:
                                    // 1 sources

                                    var21_21 /* !! */  = var12_12 /* !! */ ;
                                    var13_13 /* !! */  = (byte[])var19_19;
                                    var9_9 = var12_12 /* !! */ ;
                                }
                                break block21;
                            }
                            var13_13 /* !! */  = (byte[])var11_11;
                            var11_11 = var10_10 /* !! */ ;
                            var20_20 /* !! */  = (int)var16_16 /* !! */ ;
                        }
                        if (var8_8 /* !! */  == 0) break block22;
                        var8_8 /* !! */  = (int)var4_4[var18_18];
                        var21_21 /* !! */  = var20_20 /* !! */ ;
                        var20_20 /* !! */  = var9_9;
                        var9_9 = var21_21 /* !! */ ;
                        var22_22 = var11_11;
                        var11_11 = var13_13 /* !! */ ;
                        var13_13 /* !! */  = (byte[])var22_22;
                        ** GOTO lbl101
                    }
                    var8_8 /* !! */  = var20_20 /* !! */ ;
                    var10_10 /* !! */  = (byte[])var11_11;
                    var11_11 = var13_13 /* !! */ ;
                    var12_12 /* !! */  = var18_18;
                }
            }
            var17_17 /* !! */  = var8_8 /* !! */  + 1;
            var8_8 /* !! */  = var10_10 /* !! */ [var8_8 /* !! */ ] & 255;
            var18_18 = var12_12 /* !! */  + var16_16 /* !! */ ;
            while (true) {
                block23: {
                    if (var12_12 /* !! */  == var18_18) {
                        return var14_14;
                    }
                    var23_23 = var4_4[var12_12 /* !! */ ];
                    if (var8_8 /* !! */  != var23_23) break block23;
                    var8_8 /* !! */  = (int)var4_4[var12_12 /* !! */  += var16_16 /* !! */ ];
                    if (var17_17 /* !! */  == var9_9) {
                        var11_11 = var11_11.f;
                        Intrinsics.checkNotNull(var11_11);
                        var9_9 = var11_11.b;
                        var20_20 /* !! */  = var11_11.c;
                        var13_13 /* !! */  = var11_11.a;
                        if (var11_11 == var3_3) {
                            var11_11 = null;
                        }
                    } else {
                        var13_13 /* !! */  = var10_10 /* !! */ ;
                        var20_20 /* !! */  = var9_9;
                        var9_9 = var17_17 /* !! */ ;
                    }
lbl101:
                    // 3 sources

                    if (var8_8 /* !! */  >= 0) {
                        return var8_8 /* !! */ ;
                    }
                    var12_12 /* !! */  = -var8_8 /* !! */ ;
                    var8_8 /* !! */  = var9_9;
                    var9_9 = var20_20 /* !! */ ;
                    var10_10 /* !! */  = var13_13 /* !! */ ;
                    continue block0;
                }
                ++var12_12 /* !! */ ;
            }
            break;
        }
    }
}

