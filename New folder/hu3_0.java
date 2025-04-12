/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.http.URLParserException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from hu3
 */
public final class hu3_0 {
    public static final List a = kotlin.collections.a.b("");

    public static final int a(int n3, int n4, String string2) {
        boolean bl2 = false;
        while (n3 < n4) {
            int n7;
            int n8 = string2.charAt(n3);
            if (n8 != (n7 = 58)) {
                n7 = 91;
                if (n8 != n7) {
                    n7 = 93;
                    if (n8 == n7) {
                        bl2 = false;
                    }
                } else {
                    bl2 = true;
                }
            } else if (!bl2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static final eu3_0 b(eu3_0 eu3_02, String string2) {
        Intrinsics.checkNotNullParameter(eu3_02, "<this>");
        String string3 = "urlString";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = b.k(string2);
        if (bl2) {
            return eu3_02;
        }
        try {
            hu3_0.c(eu3_02, string2);
            return eu3_02;
        }
        catch (Throwable throwable) {
            Intrinsics.checkNotNullParameter(string2, string3);
            Intrinsics.checkNotNullParameter(throwable, "cause");
            string2 = "Fail to parse url: ".concat(string2);
            URLParserException uRLParserException = new IllegalStateException(string2, throwable);
            throw uRLParserException;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void c(eu3_0 var0, String var1_1) {
        block73: {
            block76: {
                block79: {
                    block62: {
                        block77: {
                            block75: {
                                block74: {
                                    block70: {
                                        block72: {
                                            block71: {
                                                block69: {
                                                    block63: {
                                                        block64: {
                                                            block65: {
                                                                block61: {
                                                                    block60: {
                                                                        block59: {
                                                                            var2_2 = var0;
                                                                            var3_3 = var1_1;
                                                                            var4_4 = -1;
                                                                            var5_5 = 1;
                                                                            var6_6 = "<this>";
                                                                            Intrinsics.checkNotNullParameter(var0, (String)var6_6);
                                                                            var7_7 = "urlString";
                                                                            Intrinsics.checkNotNullParameter(var1_1, (String)var7_7);
                                                                            var8_8 = var1_1.length();
                                                                            var10_10 = null;
                                                                            for (var9_9 = 0; var9_9 < var8_8; var9_9 += var5_5) {
                                                                                var11_11 = CharsKt.b(var3_3.charAt(var9_9)) ^ var5_5;
                                                                                if (var11_11 == 0) {
                                                                                    continue;
                                                                                }
                                                                                break block59;
                                                                            }
                                                                            var9_9 = -1;
                                                                        }
                                                                        var8_8 = var1_1.length() + var4_4;
                                                                        if (var8_8 >= 0) {
                                                                            while (true) {
                                                                                var11_11 = var8_8 + -1;
                                                                                var12_12 = CharsKt.b(var3_3.charAt(var8_8)) ^ var5_5;
                                                                                if (var12_12 == 0) {
                                                                                    if (var11_11 < 0) break;
                                                                                    var8_8 = var11_11;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            var8_8 = -1;
                                                                        }
                                                                        var11_11 = var8_8 + 1;
                                                                        var12_12 = var3_3.charAt(var9_9);
                                                                        var13_13 = 65;
                                                                        var14_14 = 91;
                                                                        var15_15 = 123;
                                                                        var16_16 = 97;
                                                                        if (var16_16 <= var12_12 && var12_12 < var15_15 || var13_13 <= var12_12 && var12_12 < var14_14) {
                                                                            var12_12 = var9_9;
                                                                            var17_17 = -1;
                                                                        } else {
                                                                            var12_12 = var9_9;
                                                                            var17_17 = var9_9;
                                                                        }
                                                                        while (true) {
                                                                            var18_18 = 47;
                                                                            var19_19 = 35;
                                                                            var5_5 = 63;
                                                                            if (var12_12 >= var11_11) break;
                                                                            var14_14 = var3_3.charAt(var12_12);
                                                                            if (var14_14 == (var13_13 = 58)) {
                                                                                if (var17_17 == var4_4) {
                                                                                    var12_12 -= var9_9;
                                                                                    break block60;
                                                                                }
                                                                                var3_3 = hj0_0.a(var17_17, "Illegal character in scheme at position ");
                                                                                var2_2 = new IllegalArgumentException(var3_3);
                                                                                throw var2_2;
                                                                            }
                                                                            if (var14_14 == var19_19 || var14_14 == var18_18 || var14_14 == var5_5) break;
                                                                            if (!(var17_17 != var4_4 || var16_16 <= var14_14 && var14_14 < var15_15 || (var5_5 = 65) <= var14_14 && var14_14 < (var5_5 = 91) || (var5_5 = 48) <= var14_14 && var14_14 < var13_13 || var14_14 == (var5_5 = 46) || var14_14 == (var5_5 = 43) || var14_14 == (var5_5 = 45))) {
                                                                                var17_17 = var12_12;
                                                                            }
                                                                            var5_5 = 1;
                                                                            var12_12 += var5_5;
                                                                            var13_13 = 65;
                                                                            var14_14 = 91;
                                                                        }
                                                                        var12_12 = -1;
                                                                    }
                                                                    var20_20 = "substring(...)";
                                                                    if (var12_12 <= 0) break block63;
                                                                    var14_14 = var9_9 + var12_12;
                                                                    var21_21 = var3_3.substring(var9_9, var14_14);
                                                                    Intrinsics.checkNotNullExpressionValue(var21_21, var20_20);
                                                                    var22_22 = iu3_0.c;
                                                                    var22_22 = "name";
                                                                    Intrinsics.checkNotNullParameter(var21_21, (String)var22_22);
                                                                    Intrinsics.checkNotNullParameter(var21_21, (String)var6_6);
                                                                    var15_15 = var21_21.length();
                                                                    var16_16 = 0;
                                                                    var23_23 = null;
                                                                    while (true) {
                                                                        var17_17 = 128;
                                                                        if (var16_16 >= var15_15) break;
                                                                        var5_5 = 65;
                                                                        var19_19 = var21_21.charAt(var16_16);
                                                                        var5_5 = var5_5 <= var19_19 && var19_19 < (var5_5 = 91) ? (int)((char)(var19_19 + 32)) : (var19_19 >= 0 && var19_19 < var17_17 ? var19_19 : Character.toLowerCase((char)var19_19));
                                                                        if (var5_5 == var19_19) {
                                                                            ++var16_16;
                                                                            var5_5 = 63;
                                                                            var19_19 = 35;
                                                                            continue;
                                                                        }
                                                                        break block61;
                                                                        break;
                                                                    }
                                                                    var16_16 = -1;
                                                                }
                                                                if (var16_16 == var4_4) break block64;
                                                                var5_5 = var21_21.length();
                                                                var24_24 = new StringBuilder(var5_5);
                                                                var25_25 = null;
                                                                var24_24.append(var21_21, 0, var16_16);
                                                                var5_5 = StringsKt.K(var21_21);
                                                                if (var16_16 > var5_5) break block65;
                                                                while (true) {
                                                                    block68: {
                                                                        block67: {
                                                                            block66: {
                                                                                if ((var4_4 = 65) > (var15_15 = (int)var21_21.charAt(var16_16))) break block66;
                                                                                var4_4 = 91;
                                                                                if (var15_15 >= var4_4) break block67;
                                                                                var15_15 = (char)(var15_15 + 32);
                                                                                break block68;
                                                                            }
                                                                            var4_4 = 91;
                                                                        }
                                                                        if (var15_15 < 0 || var15_15 >= var17_17) {
                                                                            var15_15 = Character.toLowerCase((char)var15_15);
                                                                        }
                                                                    }
                                                                    var24_24.append((char)var15_15);
                                                                    if (var16_16 == var5_5) break;
                                                                    var15_15 = 1;
                                                                    var16_16 += var15_15;
                                                                    var4_4 = -1;
                                                                }
                                                            }
                                                            var21_21 = var24_24.toString();
                                                        }
                                                        var26_26 = (iu3_0)iu3_0.d.get(var21_21);
                                                        if (var26_26 == null) {
                                                            var5_5 = 0;
                                                            var25_25 = null;
                                                            var26_26 = new iu3_0(var21_21, 0);
                                                        }
                                                        var0.getClass();
                                                        var25_25 = "value";
                                                        Intrinsics.checkNotNullParameter(var26_26, (String)var25_25);
                                                        var2_2.d = var26_26;
                                                        var4_4 = 1;
                                                        var9_9 += (var12_12 += var4_4);
                                                        break block69;
                                                    }
                                                    var4_4 = 1;
                                                }
                                                var5_5 = 0;
                                                var25_25 = null;
                                                while ((var19_19 = var9_9 + var5_5) < var11_11 && (var12_12 = (int)var3_3.charAt(var19_19)) == var18_18) {
                                                    var5_5 += var4_4;
                                                }
                                                var26_26 = var0.c().a;
                                                var10_10 = "file";
                                                var4_4 = (int)Intrinsics.areEqual(var26_26, var10_10);
                                                var9_9 = 2;
                                                var12_12 = 4;
                                                var21_21 = "<set-?>";
                                                var22_22 = "/";
                                                if (var4_4 == 0) break block70;
                                                var26_26 = "";
                                                var27_27 = 1;
                                                if (var5_5 == var27_27) break block71;
                                                if (var5_5 == var9_9) ** GOTO lbl168
                                                var27_27 = 3;
                                                if (var5_5 == var27_27) {
                                                    Intrinsics.checkNotNullParameter(var26_26, var21_21);
                                                    var2_2.a = var26_26;
                                                    var26_26 = new StringBuilder((String)var22_22);
                                                    var3_3 = var3_3.substring(var19_19, var11_11);
                                                    Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                                    var26_26.append(var3_3);
                                                    var3_3 = var26_26.toString();
                                                    fu3_0.d((eu3_0)var2_2, var3_3);
                                                } else {
                                                    var3_3 = "Invalid file url: ".concat(var3_3);
                                                    var2_2 = new IllegalArgumentException(var3_3);
                                                    throw var2_2;
lbl168:
                                                    // 1 sources

                                                    var26_26 = null;
                                                    var4_4 = StringsKt.N(var3_3, (char)var18_18, var19_19, false, var12_12);
                                                    if (var4_4 != (var5_5 = -1) && var4_4 != var11_11) {
                                                        var25_25 = var3_3.substring(var19_19, var4_4);
                                                        Intrinsics.checkNotNullExpressionValue(var25_25, var20_20);
                                                        var2_2.d((String)var25_25);
                                                        var3_3 = var3_3.substring(var4_4, var11_11);
                                                        Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                                        fu3_0.d((eu3_0)var2_2, var3_3);
                                                    } else {
                                                        var3_3 = var3_3.substring(var19_19, var11_11);
                                                        Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                                        var2_2.d(var3_3);
                                                    }
                                                }
                                                break block72;
                                            }
                                            Intrinsics.checkNotNullParameter(var26_26, var21_21);
                                            var2_2.a = var26_26;
                                            var3_3 = var3_3.substring(var19_19, var11_11);
                                            Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                            fu3_0.d((eu3_0)var2_2, var3_3);
                                        }
                                        return;
                                    }
                                    var26_26 = var0.c().a;
                                    var4_4 = (int)Intrinsics.areEqual(var26_26, "mailto");
                                    var23_23 = "Failed requirement.";
                                    if (var4_4 != 0) {
                                        if (var5_5 == 0) {
                                            var26_26 = "@";
                                            var5_5 = 0;
                                            var25_25 = null;
                                            var4_4 = StringsKt.O(var3_3, (String)var26_26, var19_19, false, var12_12);
                                            if (var4_4 != (var27_28 = -1)) {
                                                var6_6 = var3_3.substring(var19_19, var4_4);
                                                Intrinsics.checkNotNullExpressionValue(var6_6, var20_20);
                                                var6_6 = pw_1.c((String)var6_6);
                                                if (var6_6 != null) {
                                                    var28_30 = pw_1.e((String)var6_6, false);
                                                } else {
                                                    var17_17 = 0;
                                                    var28_30 = null;
                                                }
                                                var2_2.e = var28_30;
                                                var3_3 = var3_3.substring(++var4_4, var11_11);
                                                Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                                var2_2.d(var3_3);
                                                return;
                                            }
                                            var3_3 = cP.a("Invalid mailto url: ", var3_3, ", it should contain '@'.");
                                            var2_2 = new IllegalArgumentException(var3_3);
                                            throw var2_2;
                                        }
                                        var3_3 = var23_23.toString();
                                        var2_2 = new IllegalArgumentException(var3_3);
                                        throw var2_2;
                                    }
                                    var26_26 = var0.c().a;
                                    var28_31 = "about";
                                    var4_4 = (int)Intrinsics.areEqual(var26_26, var28_31);
                                    if (var4_4 != 0) {
                                        if (var5_5 == 0) {
                                            var3_3 = var3_3.substring(var19_19, var11_11);
                                            Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                            var2_2.d(var3_3);
                                            return;
                                        }
                                        var3_3 = var23_23.toString();
                                        var2_2 = new IllegalArgumentException(var3_3);
                                        throw var2_2;
                                    }
                                    var26_26 = var0.c().a;
                                    var28_31 = "tel";
                                    var4_4 = (int)Intrinsics.areEqual(var26_26, var28_31);
                                    if (var4_4 != 0) {
                                        if (var5_5 == 0) {
                                            var3_3 = var3_3.substring(var19_19, var11_11);
                                            Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
                                            var2_2.d(var3_3);
                                            return;
                                        }
                                        var3_3 = var23_23.toString();
                                        var2_2 = new IllegalArgumentException(var3_3);
                                        throw var2_2;
                                    }
                                    if (var5_5 >= var9_9) {
                                        while (true) {
                                            var26_26 = "@/\\?#";
                                            Intrinsics.checkNotNullParameter(var26_26, (String)var6_6);
                                            var16_16 = 5;
                                            var28_31 = new char[var16_16];
                                            var29_32 = null;
                                            for (var12_12 = 0; var12_12 < var16_16; ++var12_12) {
                                                var30_33 = var26_26.charAt(var12_12);
                                                var28_31[var12_12] = var30_33;
                                            }
                                            var4_4 = StringsKt.P(var3_3, (char[])var28_31, var19_19);
                                            var29_32 = var4_4;
                                            if (var4_4 <= 0) {
                                                var12_12 = 0;
                                                var29_32 = null;
                                            }
                                            var4_4 = var29_32 != null ? var29_32.intValue() : var11_11;
                                            if (var4_4 >= var11_11 || (var12_12 = (int)var3_3.charAt(var4_4)) != (var16_16 = 64)) break;
                                            var12_12 = hu3_0.a(var19_19, var4_4, var3_3);
                                            if (var12_12 != (var16_16 = -1)) {
                                                var24_24 = var3_3.substring(var19_19, var12_12);
                                                Intrinsics.checkNotNullExpressionValue(var24_24, var20_20);
                                                var2_2.e = var24_24;
                                                var19_19 = 1;
                                                var24_24 = var3_3.substring(var12_12 += var19_19, var4_4);
                                                Intrinsics.checkNotNullExpressionValue(var24_24, var20_20);
                                                var2_2.f = var24_24;
lbl271:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var24_24 = var3_3.substring(var19_19, var4_4);
                                            Intrinsics.checkNotNullExpressionValue(var24_24, var20_20);
                                            var2_2.e = var24_24;
                                            ** continue;
                                            var19_19 = 1;
                                            var4_4 += var19_19;
                                            var19_19 = var4_4;
                                            var12_12 = 4;
                                        }
                                        var12_12 = hu3_0.a(var19_19, var4_4, var3_3);
                                        var23_23 = var12_12;
                                        if (var12_12 <= 0) {
                                            var16_16 = 0;
                                            var23_23 = null;
                                        }
                                        var12_12 = var23_23 != null ? var23_23.intValue() : var4_4;
                                        var24_24 = var3_3.substring(var19_19, var12_12);
                                        Intrinsics.checkNotNullExpressionValue(var24_24, var20_20);
                                        var2_2.d((String)var24_24);
                                        var19_19 = 1;
                                        if ((var12_12 += var19_19) < var4_4) {
                                            var24_24 = var3_3.substring(var12_12, var4_4);
                                            Intrinsics.checkNotNullExpressionValue(var24_24, var20_20);
                                            var19_19 = Integer.parseInt((String)var24_24);
                                        } else {
                                            var19_19 = 0;
                                            var24_24 = null;
                                        }
                                        var2_2.e(var19_19);
                                        var19_19 = var4_4;
                                    }
                                    var26_26 = hu3_0.a;
                                    if (var19_19 >= var11_11) {
                                        var31_34 = var3_3.charAt(var8_8);
                                        if (var31_34 != var18_18) {
                                            var26_26 = mz0_2.a;
                                        }
                                        Intrinsics.checkNotNullParameter(var26_26, var21_21);
                                        var2_2.h = var26_26;
                                        return;
                                    }
                                    if (var5_5 == 0) {
                                        var7_7 = var2_2.h;
                                        var12_12 = 1;
                                        var7_7 = CollectionsKt.H(var12_12, (List)var7_7);
                                    } else {
                                        var7_7 = mz0_2.a;
                                    }
                                    Intrinsics.checkNotNullParameter(var7_7, var21_21);
                                    var2_2.h = var7_7;
                                    var7_7 = "?#";
                                    Intrinsics.checkNotNullParameter(var7_7, (String)var6_6);
                                    var6_6 = new char[var9_9];
                                    var29_32 = null;
                                    for (var12_12 = 0; var12_12 < var9_9; var12_12 += var16_16) {
                                        var16_16 = var7_7.charAt(var12_12);
                                        var6_6[var12_12] = var16_16;
                                        var16_16 = 1;
                                    }
                                    var27_29 = StringsKt.P(var3_3, (char[])var6_6, var19_19);
                                    var7_7 = var27_29;
                                    if (var27_29 <= 0) {
                                        var8_8 = 0;
                                        var7_7 = null;
                                    }
                                    var27_29 = var7_7 != null ? var7_7.intValue() : var11_11;
                                    if (var27_29 > var19_19) {
                                        var7_7 = var3_3.substring(var19_19, var27_29);
                                        Intrinsics.checkNotNullExpressionValue(var7_7, var20_20);
                                        var24_24 = var2_2.h;
                                        var19_19 = var24_24.size();
                                        var9_9 = 1;
                                        var24_24 = var19_19 == var9_9 && (var19_19 = (var24_24 = (CharSequence)CollectionsKt.L(var2_2.h)).length()) == 0 ? mz0_2.a : var2_2.h;
                                        var9_9 = (int)Intrinsics.areEqual(var7_7, var22_22);
                                        if (var9_9 != 0) {
                                            var7_7 = var26_26;
                                            var9_9 = 1;
                                        } else {
                                            var9_9 = 1;
                                            var29_32 = new char[var9_9];
                                            var15_15 = 0;
                                            var22_22 = null;
                                            var29_32[0] = var18_18;
                                            var7_7 = StringsKt.Z((CharSequence)var7_7, (char[])var29_32);
                                        }
                                        if (var5_5 != var9_9) {
                                            var26_26 = mz0_2.a;
                                        }
                                        var26_26 = (Collection)var26_26;
                                        var7_7 = (Iterable)var7_7;
                                        var26_26 = CollectionsKt.W((Iterable)var7_7, (Collection)var26_26);
                                        var24_24 = (Collection)var24_24;
                                        var26_26 = CollectionsKt.W((Iterable)var26_26, (Collection)var24_24);
                                        Intrinsics.checkNotNullParameter(var26_26, var21_21);
                                        var2_2.h = var26_26;
                                        var19_19 = var27_29;
                                    }
                                    if (var19_19 >= var11_11 || (var4_4 = (int)var3_3.charAt(var19_19)) != (var5_5 = 63)) break block73;
                                    var4_4 = 1;
                                    if ((var19_19 += var4_4) != var11_11) break block74;
                                    var2_2.b = var4_4;
                                    var19_19 = var11_11;
                                    break block73;
                                }
                                var4_4 = 0;
                                var26_26 = null;
                                var5_5 = 35;
                                var27_29 = StringsKt.N(var3_3, (char)var5_5, var19_19, false, 4);
                                var25_25 = var27_29;
                                if (var27_29 > 0) {
                                    var28_31 = var25_25;
                                } else {
                                    var17_17 = 0;
                                    var28_31 = null;
                                }
                                var5_5 = var28_31 != null ? var28_31.intValue() : var11_11;
                                var6_6 = var3_3.substring(var19_19, var5_5);
                                Intrinsics.checkNotNullExpressionValue(var6_6, var20_20);
                                var7_7 = "query";
                                Intrinsics.checkNotNullParameter(var6_6, (String)var7_7);
                                var8_8 = StringsKt.K((CharSequence)var6_6);
                                if (var8_8 >= 0) break block75;
                                im2_2.b.getClass();
                                var26_26 = qz0_2.c;
                                break block76;
                            }
                            var7_7 = im2_2.b;
                            var7_7 = mm2_1.a();
                            var19_19 = StringsKt.K((CharSequence)var6_6);
                            var9_9 = 1000;
                            var12_12 = 0;
                            var29_32 = null;
                            if (var19_19 < 0) break block77;
                            var15_15 = 0;
                            var22_22 = null;
                            var16_16 = -1;
                            var32_35 = 0;
                            while (var4_4 != var9_9) {
                                block78: {
                                    var17_17 = var6_6.charAt(var15_15);
                                    if (var17_17 == (var18_18 = 38)) ** GOTO lbl416
                                    var18_18 = 61;
                                    if (var17_17 == var18_18) break block78;
                                    var17_17 = -1;
                                    ** GOTO lbl-1000
                                }
                                var17_17 = -1;
                                if (var16_16 == var17_17) {
                                    var18_18 = var15_15;
lbl411:
                                    // 2 sources

                                    while (true) {
                                        var16_16 = 1;
                                        break;
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var18_18 = var16_16;
                                    ** continue;
lbl416:
                                    // 1 sources

                                    var17_17 = -1;
                                    var33_36 = var16_16;
                                    var34_37 = var15_15;
                                    pc2_2.a((km2_2)var7_7, (String)var6_6, var32_35, var16_16, var15_15, false);
                                    var16_16 = 1;
                                    var18_18 = var15_15 + 1;
                                    var4_4 += var16_16;
                                    var32_35 = var18_18;
                                    var18_18 = -1;
                                }
                                if (var15_15 != var19_19) {
                                    var15_15 += var16_16;
                                    var16_16 = var18_18;
                                    continue;
                                }
                                var19_19 = var4_4;
                                var33_36 = var18_18;
                                break block62;
                            }
                            break block79;
                        }
                        var17_17 = -1;
                        var19_19 = 0;
                        var24_24 = null;
                        var32_35 = 0;
                        var33_36 = -1;
                    }
                    if (var19_19 != var9_9) {
                        var34_37 = var6_6.length();
                        pc2_2.a((km2_2)var7_7, (String)var6_6, var32_35, var33_36, var34_37, false);
                    }
                }
                var6_6 = "values";
                var7_7 = var7_7.b;
                Intrinsics.checkNotNullParameter(var7_7, (String)var6_6);
                var26_26 = new ye3_2((Map)var7_7);
            }
            var6_6 = new gu3_0((eu3_0)var2_2);
            var26_26.a((Function2)var6_6);
            var19_19 = var5_5;
        }
        if (var19_19 < var11_11 && (var4_4 = (int)var3_3.charAt(var19_19)) == (var5_5 = 35)) {
            var4_4 = 1;
            var3_3 = var3_3.substring(var19_19 += var4_4, var11_11);
            Intrinsics.checkNotNullExpressionValue(var3_3, var20_20);
            Intrinsics.checkNotNullParameter(var3_3, var21_21);
            var2_2.g = var3_3;
        }
    }
}

