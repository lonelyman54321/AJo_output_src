/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

public final class Ob1$b {
    /*
     * Enabled aggressive block sorting
     */
    public static String a(String string2, int n3, int n4, String string3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, Charset charset, int n7) {
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        Charset charset2;
        ce_2 ce_22;
        String string4 = string2;
        String string5 = string3;
        int n17 = n7;
        int n18 = n7 & 1;
        boolean bl6 = false;
        if (n18 != 0) {
            n18 = 0;
            ce_22 = null;
        } else {
            n18 = n3;
        }
        int n19 = n17 & 2;
        n19 = n19 != 0 ? string2.length() : n4;
        int n20 = n17 & 8;
        n20 = n20 != 0 ? 0 : (int)(bl2 ? 1 : 0);
        int n21 = n17 & 0x10;
        n21 = n21 != 0 ? 0 : (int)(bl3 ? 1 : 0);
        int n22 = n17 & 0x20;
        n22 = n22 != 0 ? 0 : (int)(bl4 ? 1 : 0);
        int n24 = n17 & 0x40;
        if (n24 == 0) {
            bl6 = bl5;
        }
        n24 = 128;
        if ((n17 &= n24) != 0) {
            n17 = 0;
            charset2 = null;
        } else {
            charset2 = charset;
        }
        Intrinsics.checkNotNullParameter(string4, "<this>");
        String string6 = "encodeSet";
        Intrinsics.checkNotNullParameter(string5, string6);
        int n25 = n18;
        while (true) {
            if (n25 >= n19) {
                string4 = string4.substring(n18, n19);
                string5 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                Intrinsics.checkNotNullExpressionValue(string4, string5);
                return string4;
            }
            n16 = string4.codePointAt(n25);
            n15 = 32;
            n14 = 43;
            n10 = 37;
            n8 = 127;
            if (n16 < n15 || n16 == n8 || n16 >= n24 && !bl6) break;
            n24 = (char)n16;
            if ((n24 = (int)(StringsKt.G(string5, (char)n24) ? 1 : 0)) != 0 || n16 == n10 && (n20 == 0 || n21 != 0 && (n24 = (int)(Ob1$b.b(n25, n19, string4) ? 1 : 0)) == 0) || n16 == n14 && n22 != 0) break;
            n24 = Character.charCount(n16);
            n25 += n24;
            n24 = 128;
        }
        ce_2 ce_23 = new ce_2();
        ce_23.G0(n18, n25, string4);
        n18 = 0;
        ce_22 = null;
        while (true) {
            block15: {
                Charset charset3;
                block17: {
                    block16: {
                        block14: {
                            block13: {
                                if (n25 >= n19) {
                                    return ce_23.I();
                                }
                                n16 = string4.codePointAt(n25);
                                if (n20 != 0 && (n16 == (n10 = 9) || n16 == (n10 = 10) || n16 == (n10 = 12) || n16 == (n10 = 13))) break block13;
                                if (n16 != n14 || n22 == 0) break block14;
                                String string7 = n20 != 0 ? "+" : "%2B";
                                ce_23.I0(string7);
                            }
                            n10 = 128;
                            break block15;
                        }
                        if (n16 < n15 || n16 == n8) break block16;
                        n10 = 128;
                        if (n16 >= n10 && !bl6) break block17;
                        n8 = (char)n16;
                        if ((n8 = (int)(StringsKt.G(string5, (char)n8) ? 1 : 0)) != 0 || n16 == (n8 = 37) && (n20 == 0 || n21 != 0 && (n8 = (int)(Ob1$b.b(n25, n19, string4) ? 1 : 0)) == 0)) break block17;
                        ce_23.J0(n16);
                        break block15;
                    }
                    n10 = 128;
                }
                if (ce_22 == null) {
                    ce_22 = new ce_2();
                }
                if (charset2 != null && (n8 = (int)(Intrinsics.areEqual(charset2, charset3 = StandardCharsets.UTF_8) ? 1 : 0)) == 0) {
                    n8 = Character.charCount(n16) + n25;
                    ce_22.F0(string4, n25, n8, charset2);
                } else {
                    ce_22.J0(n16);
                }
                while ((n8 = (int)(ce_22.g() ? 1 : 0)) == 0) {
                    n8 = ce_22.readByte();
                    n15 = n8 & 0xFF;
                    ce_23.U(37);
                    char[] cArray = ob1_1.k;
                    n15 = n15 >> 4 & 0xF;
                    n15 = cArray[n15];
                    ce_23.U(n15);
                    n8 &= 0xF;
                    n8 = cArray[n8];
                    ce_23.U(n8);
                    n15 = 32;
                    n14 = 43;
                }
            }
            n14 = 37;
            n8 = Character.charCount(n16);
            n25 += n8;
            n8 = 127;
            n15 = 32;
            n14 = 43;
            n10 = 37;
        }
    }

    public static boolean b(int n3, int n4, String string2) {
        block3: {
            block2: {
                int n7;
                int n8 = n3 + 2;
                if (n8 >= n4 || (n4 = (int)string2.charAt(n3)) != (n7 = 37)) break block2;
                n4 = 1;
                n3 += n4;
                if ((n3 = ez3.r(string2.charAt(n3))) != (n7 = -1) && (n3 = ez3.r(string2.charAt(n8))) != n7) break block3;
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    public static String c(String string2, int n3, int n4, boolean bl2, int n7) {
        block10: {
            String string3;
            int n8 = n7 & 1;
            int n10 = 0;
            if (n8 != 0) {
                n3 = 0;
                string3 = null;
            }
            if ((n8 = n7 & 2) != 0) {
                n4 = string2.length();
            }
            if ((n7 &= 4) != 0) {
                bl2 = false;
            }
            String string4 = "<this>";
            Intrinsics.checkNotNullParameter(string2, string4);
            for (n7 = n3; n7 < n4; ++n7) {
                n8 = string2.charAt(n7);
                n10 = 43;
                int n14 = 37;
                if (!(n8 == n14 || n8 == n10 && bl2)) {
                    continue;
                }
                ce_2 ce_22 = new ce_2();
                ce_22.G0(n3, n7, string2);
                while (n7 < n4) {
                    int n15;
                    n3 = string2.codePointAt(n7);
                    if (n3 == n14 && (n15 = n7 + 2) < n4) {
                        int n16 = n7 + 1;
                        n16 = ez3.r(string2.charAt(n16));
                        int n17 = ez3.r(string2.charAt(n15));
                        int n18 = -1;
                        if (n16 != n18 && n17 != n18) {
                            n7 = (n16 << 4) + n17;
                            ce_22.U(n7);
                            n3 = Character.charCount(n3);
                            n7 = n3 + n15;
                            continue;
                        }
                    } else if (n3 == n10 && bl2) {
                        n3 = 32;
                        ce_22.U(n3);
                        ++n7;
                        continue;
                    }
                    ce_22.J0(n3);
                    n3 = Character.charCount(n3);
                    n7 += n3;
                }
                string2 = ce_22.I();
                break block10;
            }
            string2 = string2.substring(n3, n4);
            string3 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        }
        return string2;
    }

    public static ArrayList d(String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        ArrayList<String> arrayList = new ArrayList<String>();
        int n4 = 0;
        String string3 = null;
        while (n4 <= (n3 = string2.length())) {
            int n7;
            int n8 = 4;
            n3 = StringsKt.N(string2, '&', n4, false, n8);
            if (n3 == (n7 = -1)) {
                n3 = string2.length();
            }
            char c2 = '=';
            n8 = StringsKt.N(string2, c2, n4, false, n8);
            String string4 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            if (n8 != n7 && n8 <= n3) {
                string3 = string2.substring(n4, n8);
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                arrayList.add(string3);
                string3 = string2.substring(++n8, n3);
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                arrayList.add(string3);
            } else {
                string3 = string2.substring(n4, n3);
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                arrayList.add(string3);
                n4 = 0;
                string3 = null;
                arrayList.add(null);
            }
            n4 = n3 + 1;
        }
        return arrayList;
    }

    public static void e(List list, StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "out");
        int n3 = list.size();
        c c2 = f.m(0, n3);
        c2 = f.l(2, c2);
        int n4 = c2.a;
        int n7 = c2.b;
        n3 = c2.c;
        if (n3 > 0 && n4 <= n7 || n3 < 0 && n7 <= n4) {
            while (true) {
                String string2 = (String)list.get(n4);
                int n8 = n4 + 1;
                String string3 = (String)list.get(n8);
                if (n4 > 0) {
                    char c3 = '&';
                    stringBuilder.append(c3);
                }
                stringBuilder.append(string2);
                if (string3 != null) {
                    char c5 = '=';
                    stringBuilder.append(c5);
                    stringBuilder.append(string3);
                }
                if (n4 == n7) break;
                n4 += n3;
            }
        }
    }
}

