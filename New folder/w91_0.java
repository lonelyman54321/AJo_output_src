/*
 * Decompiled with CFR 0.152.
 */
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from w91
 */
public final class w91_0 {
    /*
     * Unable to fully structure code
     */
    public static final InetAddress a(int var0, int var1_1, String var2_2) {
        var3_3 = var1_1;
        var4_4 = var2_2;
        var5_5 = 16;
        var6_6 = new byte[var5_5];
        var7_7 = 0;
        var8_8 = -1;
        var9_9 = 0;
        var10_10 = -1;
        var11_11 = -1;
        var12_12 = var0;
        while (true) {
            block26: {
                block24: {
                    block25: {
                        block23: {
                            var13_13 = 0;
                            if (var12_12 >= var3_3) break block23;
                            if (var9_9 == var5_5) {
                                return null;
                            }
                            var14_14 = var12_12 + 2;
                            var15_15 = 255;
                            if (var14_14 > var3_3 || (var17_17 = b.r(var12_12, var4_4, var16_16 = "::", false)) == 0) break block24;
                            if (var10_10 != var8_8) {
                                return null;
                            }
                            var10_10 = var9_9 += 2;
                            if (var14_14 != var3_3) break block25;
                        }
lbl24:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var11_11 = var14_14;
                    break block26;
                }
                if (var9_9 == 0 || (var14_14 = (int)b.r(var12_12, var4_4, var18_18 = ":", false)) != 0) {
                    var11_11 = ++var12_12;
                } else {
                    block22: {
                        var18_18 = ".";
                        if ((var12_12 = (int)b.r(var12_12, var4_4, var18_18, false)) != 0) {
                            var14_14 = var12_12 = var9_9 + -2;
                            while (var11_11 < var3_3) {
                                if (var14_14 == var5_5) break block22;
                                if (var14_14 != var12_12) {
                                    var17_17 = var4_4.charAt(var11_11);
                                    if (var17_17 != (var19_19 = 46)) break block22;
                                    ++var11_11;
                                }
                                var19_19 = 0;
                                for (var17_17 = var11_11; var17_17 < var3_3 && (var21_21 = Intrinsics.compare(var20_20 = var4_4.charAt(var17_17), var7_7 = 48)) >= 0 && (var5_5 = Intrinsics.compare(var20_20, 57)) <= 0; ++var17_17) {
                                    if ((var19_19 != 0 || var11_11 == var17_17) && (var19_19 = var19_19 * 10 + var20_20 - var7_7) <= var15_15) {
                                        var5_5 = 16;
                                        var7_7 = 0;
                                        continue;
                                    }
                                    break block22;
                                }
                                var5_5 = var17_17 - var11_11;
                                if (var5_5 != 0) {
                                    var5_5 = var14_14 + 1;
                                    var6_6[var14_14] = var7_7 = (int)((byte)var19_19);
                                    var14_14 = var5_5;
                                    var11_11 = var17_17;
                                    var5_5 = 16;
                                    var7_7 = 0;
                                    continue;
                                }
                                break block22;
                            }
                            var3_3 = var9_9 + 2;
                            if (var14_14 == var3_3) {
                                var9_9 += 2;
                                ** continue;
                            }
                        }
                    }
                    return null;
                }
            }
            var5_5 = 0;
            for (var12_12 = var11_11; var12_12 < var3_3 && (var7_7 = ez3.r(var4_4.charAt(var12_12))) != var8_8; ++var12_12) {
                var5_5 = (var5_5 << 4) + var7_7;
            }
            var7_7 = var12_12 - var11_11;
            if (var7_7 == 0 || var7_7 > (var14_14 = 4)) break;
            var7_7 = var9_9 + 1;
            var6_6[var9_9] = var13_13 = (byte)(var5_5 >>> 8 & var15_15);
            var9_9 += 2;
            var6_6[var7_7] = var5_5 = (int)((byte)(var5_5 & 255));
            var5_5 = 16;
            var7_7 = 0;
        }
        return null;
        var3_3 = 16;
        if (var9_9 != var3_3) {
            if (var10_10 == var8_8) {
                return null;
            }
            var22_22 = var9_9 - var10_10;
            var5_5 = 16 - var22_22;
            System.arraycopy(var6_6, var10_10, var6_6, var5_5, var22_22);
            var5_5 = 16 - var9_9 + var10_10;
            var3_3 = 0;
            Arrays.fill(var6_6, var10_10, var5_5, (byte)0);
        }
        return InetAddress.getByAddress(var6_6);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String b(String object) {
        void var5_8;
        block27: {
            String string2;
            int n3;
            int n4;
            int n7;
            block26: {
                n7 = 1;
                Intrinsics.checkNotNullParameter(object, "<this>");
                Object object2 = ":";
                int n8 = 0;
                n4 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
                Object var5_5 = null;
                n3 = -1;
                if (n4 != 0) {
                    object2 = "[";
                    n4 = b.s((String)object, (String)object2, false);
                    if (n4 != 0 && (n4 = (int)(b.h((String)object, (String)(object2 = "]"), false) ? 1 : 0)) != 0) {
                        n4 = ((String)object).length() - n7;
                        object2 = w91_0.a(n7, n4, (String)object);
                    } else {
                        n4 = ((String)object).length();
                        object2 = w91_0.a(0, n4, (String)object);
                    }
                    if (object2 == null) {
                        return null;
                    }
                    byte[] byArray = ((InetAddress)object2).getAddress();
                    int n10 = byArray.length;
                    int n14 = 4;
                    int n15 = 16;
                    if (n10 == n15) {
                        Intrinsics.checkNotNullExpressionValue(byArray, "address");
                        int n16 = 0;
                        object = null;
                        n4 = 0;
                        object2 = null;
                        while (n16 < (n10 = byArray.length)) {
                            int n17;
                            for (n10 = n16; n10 < n15 && (n17 = byArray[n10]) == 0; n10 += 2) {
                                n17 = n10 + 1;
                                if ((n17 = byArray[n17]) != 0) break;
                            }
                            if ((n17 = n10 - n16) > n4 && n17 >= n14) {
                                n3 = n16;
                                n4 = n17;
                            }
                            n16 = n10 + 2;
                        }
                        object = new ce_2();
                        while (n8 < (n10 = byArray.length)) {
                            n10 = 58;
                            if (n8 == n3) {
                                ((ce_2)object).U(n10);
                                if ((n8 += n4) != n15) continue;
                                ((ce_2)object).U(n10);
                                continue;
                            }
                            if (n8 > 0) {
                                ((ce_2)object).U(n10);
                            }
                            n10 = byArray[n8];
                            n10 = (n10 & 0xFF) << 8;
                            n14 = n8 + 1;
                            n14 = byArray[n14] & 0xFF;
                            long l2 = n10 |= n14;
                            ((ce_2)object).l0(l2);
                            n8 += 2;
                        }
                        return ((ce_2)object).I();
                    }
                    n7 = byArray.length;
                    if (n7 == n14) {
                        return ((InetAddress)object2).getHostAddress();
                    }
                    object = oj_0.b('\'', "Invalid IPv6 address: '", (String)object);
                    AssertionError assertionError = new AssertionError(object);
                    throw assertionError;
                }
                object = IDN.toASCII((String)object);
                object2 = "toASCII(host)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object2 = Locale.US;
                string2 = "US";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                object = ((String)object).toLowerCase((Locale)object2);
                object2 = "this as java.lang.String).toLowerCase(locale)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                n4 = ((String)object).length();
                if (n4 != 0) break block26;
                return null;
            }
            try {
                n4 = ((String)object).length();
                string2 = null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return var5_8;
            }
            for (int i3 = 0; i3 < n4; i3 += n7) {
                int n18 = ((String)object).charAt(i3);
                int n19 = 31;
                n19 = Intrinsics.compare(n18, n19);
                if (n19 <= 0) break block27;
                n19 = 127;
                n19 = Intrinsics.compare(n18, n19);
                if (n19 >= 0) break block27;
                String string3 = " #%/:?@[\\]";
                int n20 = 6;
                n18 = StringsKt.N(string3, (char)n18, 0, false, n20);
                if (n18 != n3) return var5_8;
                continue;
            }
            Object object3 = object;
        }
        return var5_8;
    }
}

