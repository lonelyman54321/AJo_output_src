/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/*
 * Renamed from Ia1
 */
public final class ia1_1 {
    static {
        ff$a_0.c("\"\\");
        ff$a_0.c("\t ,=");
    }

    public static final boolean a(cl2_2 object) {
        boolean bl2;
        long l2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = ((cl2_2)object).a.b;
        int n3 = Intrinsics.areEqual(string2, "HEAD");
        if (n3 != 0) {
            return false;
        }
        n3 = 100;
        boolean bl3 = true;
        int n4 = ((cl2_2)object).d;
        if ((n4 < n3 || n4 >= (n3 = 200)) && n4 != (n3 = 204) && n4 != (n3 = 304)) {
            return bl3;
        }
        long l3 = ez3.k((cl2_2)object);
        long l4 = l3 - (l2 = (long)-1);
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 == 0 && !(bl2 = (string2 = "chunked").equalsIgnoreCase((String)(object = cl2_2.c((cl2_2)object, "Transfer-Encoding"))))) {
            return false;
        }
        return bl3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(z80_0 var0, ob1_1 var1_1, m41_0 var2_2) {
        var3_3 = var0;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_7 = 1;
        var7_8 = "<this>";
        Intrinsics.checkNotNullParameter(var0, var7_8);
        var8_9 = "url";
        Intrinsics.checkNotNullParameter(var1_1, var8_9);
        var9_10 = "headers";
        Intrinsics.checkNotNullParameter(var2_2, (String)var9_10);
        var10_11 = z80_0.a;
        if (var0 == var10_11) {
            return;
        }
        var10_11 = y80_0.j;
        Intrinsics.checkNotNullParameter(var1_1, var8_9);
        Intrinsics.checkNotNullParameter(var2_2, (String)var9_10);
        var9_10 = var2_2.h("Set-Cookie");
        var11_12 = var9_10.size();
        var12_13 = 0;
        var14_15 = null;
        block7: for (var13_14 = false; var13_14 < var11_12; var13_14 += var50_42) {
            block43: {
                block47: {
                    var15_16 = var5_5 = var9_10.get((int)var13_14);
                    var15_16 = (String)var5_5;
                    Intrinsics.checkNotNullParameter(var4_4, var8_9);
                    var5_5 = "setCookie";
                    Intrinsics.checkNotNullParameter(var15_16, (String)var5_5);
                    var16_17 = System.currentTimeMillis();
                    Intrinsics.checkNotNullParameter(var4_4, var8_9);
                    Intrinsics.checkNotNullParameter(var15_16, (String)var5_5);
                    var18_18 = ez3.g((String)var15_16, ';', 0, 0, 6);
                    var19_19 = 61;
                    var20_20 = ez3.g((String)var15_16, (char)var19_19, 0, var18_18, 2);
                    if (var20_20 == var18_18) {
                        while (true) {
                            var21_21 = var8_9;
                            var22_22 = var9_10;
                            var23_23 = var11_12;
                            while (true) {
                                var18_18 = 0;
                                var5_5 = null;
                                var6_7 = 0;
                                var24_24 = null;
                                break block43;
                                break;
                            }
                            break;
                        }
                    }
                    if ((var26_26 = (var25_25 = ez3.z(0, var20_20, (String)var15_16)).length()) == 0 || (var12_13 = ez3.m(var25_25)) != (var19_19 = -1) || (var12_13 = ez3.m(var27_27 = ez3.z(var20_20 += var6_7, var18_18, (String)var15_16))) != var19_19) ** continue;
                    var18_18 += var6_7;
                    var12_13 = var15_16.length();
                    var28_28 = -1;
                    var30_29 = 253402300799999L;
                    var32_30 = 1.251973714024093E-309;
                    var34_31 = var28_28;
                    var36_32 = var30_29;
                    var20_20 = 0;
                    var38_33 = null;
                    var19_19 = 0;
                    var39_34 = null;
                    var40_35 = false;
                    var41_36 = false;
                    var42_37 = false;
                    var43_38 = true;
                    while (true) {
                        block44: {
                            block46: {
                                block45: {
                                    var44_39 = 0x7FFFFFFFFFFFFFFFL;
                                    var46_40 = -9223372036854775808L;
                                    var48_41 = -0.0;
                                    if (var18_18 >= var12_13) break;
                                    var21_21 = var8_9;
                                    var50_42 = ez3.f((String)var15_16, ';', var18_18, var12_13);
                                    var22_22 = var9_10;
                                    var6_7 = 61;
                                    var51_43 = ez3.f((String)var15_16, (char)var6_7, var18_18, var50_42);
                                    var5_5 = ez3.z(var18_18, var51_43, (String)var15_16);
                                    if (var51_43 < var50_42) {
                                        var6_7 = 1;
                                        var9_10 = ez3.z(var51_43 += var6_7, var50_42, (String)var15_16);
                                    } else {
                                        var6_7 = 1;
                                        var9_10 = "";
                                    }
                                    var23_23 = var11_12;
                                    var10_11 = "expires";
                                    var11_12 = b.i((String)var5_5, (String)var10_11, (boolean)var6_7);
                                    if (!var11_12) ** GOTO lbl92
                                    var18_18 = var9_10.length();
                                    var36_32 = y80$a.b(var18_18, (String)var9_10);
                                    {
                                        catch (IllegalArgumentException v0) {
                                            var11_12 = true;
                                            break block44;
                                        }
lbl88:
                                        // 3 sources

                                        while (true) {
                                            var11_12 = true;
                                            var42_37 = true;
                                            break block44;
                                            break;
                                        }
lbl92:
                                        // 1 sources

                                        var10_11 = "max-age";
                                        var11_12 = b.i((String)var5_5, (String)var10_11, (boolean)var6_7);
                                        if (!var11_12) break block45;
                                        try {
                                            var52_44 = Long.parseLong((String)var9_10);
                                            var34_31 = 0L;
                                        }
                                        catch (NumberFormatException var5_6) {}
                                        var18_18 = (int)(var52_44 == var34_31 ? 0 : (var52_44 < var34_31 ? -1 : 1));
                                        if (var18_18 > 0) {
                                            var46_40 = var52_44;
                                        }
                                        var34_31 = var46_40;
                                        ** GOTO lbl88
                                        var24_24 = var5_6;
                                        {
                                            var10_11 = "-?\\d+";
                                            var5_5 = new Regex((String)var10_11);
                                            var18_18 = (int)var5_5.c((CharSequence)var9_10);
                                            if (var18_18 == 0) {
                                                throw var24_24;
                                            }
                                            var5_5 = "-";
                                            var6_7 = 0;
                                            var24_24 = null;
                                            var18_18 = (int)b.s((String)var9_10, (String)var5_5, false);
                                            if (var18_18 != 0) {
                                                var44_39 = var46_40;
                                            }
                                            var34_31 = var44_39;
                                            ** continue;
                                        }
                                    }
                                }
                                var24_24 = "domain";
                                var11_12 = true;
                                var6_7 = (int)b.i((String)var5_5, (String)var24_24, var11_12);
                                if (var6_7 == 0) break block46;
                                var5_5 = ".";
                                var6_7 = 0;
                                var24_24 = null;
                                {
                                    var54_45 = (int)b.h((String)var9_10, (String)var5_5, false);
                                    var6_7 = var54_45 ^ 1;
                                    if (var6_7 == 0) ** GOTO lbl137
                                }
                                {
                                    var5_5 = StringsKt.U((String)var9_10, (String)var5_5);
                                    if ((var5_5 = w91_0.b((String)var5_5)) == null) {
                                        var5_5 = new IllegalArgumentException();
                                        throw var5_5;
                                    }
                                    var38_33 = var5_5;
                                    var11_12 = true;
                                    var43_38 = false;
                                    break block44;
lbl137:
                                    // 1 sources

                                    var24_24 = "Failed requirement.";
                                    var24_24 = var24_24.toString();
                                    var5_5 = new IllegalArgumentException((String)var24_24);
                                    throw var5_5;
                                }
                            }
                            var24_24 = "path";
                            var11_12 = true;
                            var6_7 = (int)b.i((String)var5_5, (String)var24_24, var11_12);
                            if (var6_7 != 0) {
                                var39_34 = var9_10;
                            } else {
                                var24_24 = "secure";
                                var6_7 = (int)b.i((String)var5_5, (String)var24_24, var11_12);
                                if (var6_7 != 0) {
                                    var40_35 = true;
                                } else {
                                    var24_24 = "httponly";
                                    var18_18 = (int)b.i((String)var5_5, (String)var24_24, var11_12);
                                    if (var18_18 != 0) {
                                        var41_36 = true;
                                    }
                                }
                            }
                        }
                        var18_18 = var50_42 + 1;
                        var8_9 = var21_21;
                        var9_10 = var22_22;
                        var11_12 = var23_23;
                        var6_7 = 1;
                    }
                    var21_21 = var8_9;
                    var22_22 = var9_10;
                    var23_23 = var11_12;
                    var18_18 = (int)(var34_31 == var46_40 ? 0 : (var34_31 < var46_40 ? -1 : 1));
                    if (var18_18 == 0) {
                        var28_28 = var46_40;
                    } else {
                        var18_18 = (int)(var34_31 == var28_28 ? 0 : (var34_31 < var28_28 ? -1 : 1));
                        if (var18_18 != 0) {
                            var55_46 = 9223372036854775L;
                            cfr_temp_0 = var34_31 - var55_46;
                            var18_18 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var18_18 <= 0) {
                                var18_18 = 1000;
                                var55_46 = var18_18;
                                var44_39 = var34_31 * var55_46;
                            }
                            var28_28 = (var18_18 = (int)((cfr_temp_1 = (var44_39 = var16_17 + var44_39) - var16_17) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) >= 0 && (var18_18 = (int)(var44_39 == var30_29 ? 0 : (var44_39 < var30_29 ? -1 : 1))) <= 0 ? var44_39 : var30_29;
                        } else {
                            var28_28 = var36_32;
                        }
                    }
                    var5_5 = var4_4.d;
                    if (var38_33 != null) break block47;
                    var38_33 = var5_5;
                    ** GOTO lbl-1000
                }
                var6_7 = (int)Intrinsics.areEqual(var5_5, var38_33);
                if (var6_7 != 0) ** GOTO lbl-1000
                var6_7 = 0;
                var24_24 = null;
                var50_42 = (int)b.h((String)var5_5, (String)var38_33, false);
                if (var50_42 != 0) {
                    var6_7 = var5_5.length();
                    var50_42 = var38_33.length();
                    var6_7 = var6_7 - var50_42 - 1;
                    if ((var6_7 = (int)var5_5.charAt(var6_7)) == (var50_42 = 46)) {
                        Intrinsics.checkNotNullParameter(var5_5, var7_8);
                        var24_24 = ez3.f;
                        var6_7 = (int)var24_24.c((CharSequence)var5_5);
                        ** if (var6_7 != 0) goto lbl-1000
                    }
                }
                ** GOTO lbl-1000
lbl-1000:
                // 3 sources

                {
                    var18_18 = var5_5.length();
                    var6_7 = var38_33.length();
                    if (var18_18 != var6_7 && (var5_5 = PublicSuffixDatabase.g.a((String)var38_33)) == null) ** continue;
                    var5_5 = "/";
                    var6_7 = 0;
                    var24_24 = null;
                    if (var39_34 != null && (var50_42 = (int)b.s(var39_34, (String)var5_5, false)) != 0) {
                        var57_47 = var39_34;
                    } else {
                        var8_9 = var1_1.b();
                        var51_43 = StringsKt.Q(var8_9, '/', 0, (int)(var11_12 = 6 != 0));
                        if (var51_43 != 0) {
                            var5_5 = var8_9.substring(0, var51_43);
                            var8_9 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                            Intrinsics.checkNotNullExpressionValue(var5_5, var8_9);
                        }
                        var57_47 = var5_5;
                    }
                    var5_5 = new y80_0(var25_25, var27_27, var28_28, (String)var38_33, (String)var57_47, var40_35, var41_36, var42_37, var43_38);
                    ** GOTO lbl225
                }
lbl-1000:
                // 2 sources

                {
                    var6_7 = 0;
                    var24_24 = null;
                    var18_18 = 0;
                    var5_5 = null;
                }
            }
            if (var5_5 == null) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var50_42 = 1;
                    var8_9 = var21_21;
                    var9_10 = var22_22;
                    var11_12 = var23_23;
                    var6_7 = 1;
                    var12_13 = 0;
                    continue block7;
                    break;
                }
            }
            if (var14_15 == null) {
                var14_15 = new ArrayList<Object>();
            }
            var14_15.add(var5_5);
            ** continue;
        }
        if (var14_15 != null) {
            var5_5 = Collections.unmodifiableList(var14_15);
            var24_24 = "{\n        Collections.un\u2026ableList(cookies)\n      }";
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var24_24);
        } else {
            var5_5 = mz0_2.a;
        }
        var6_7 = var5_5.isEmpty();
        if (var6_7 != 0) {
            return;
        }
        var3_3.b(var4_4, (List)var5_5);
    }
}

