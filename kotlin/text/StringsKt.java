/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.CharsKt;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.a;
import kotlin.text.b;
import kotlin.text.c;
import kotlin.text.e;

public final class StringsKt
extends le3_2 {
    private StringsKt() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean F(CharSequence charSequence, CharSequence charSequence2, boolean bl2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String string2 = "other";
        Intrinsics.checkNotNullParameter(charSequence2, string2);
        int n3 = charSequence2 instanceof String;
        boolean bl3 = false;
        if (n3 != 0) {
            n3 = 2;
            int n4 = StringsKt.O(charSequence, (String)(charSequence2 = (String)charSequence2), 0, bl2, n3);
            if (n4 < 0) return bl3;
            return true;
        }
        int n7 = charSequence.length();
        int n8 = StringsKt__StringsKt.u(charSequence, charSequence2, 0, n7, bl2, false);
        if (n8 < 0) return bl3;
        return true;
    }

    public static boolean G(CharSequence charSequence, char c2) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        int n3 = 2;
        boolean bl2 = false;
        int n4 = StringsKt.N(charSequence, c2, 0, false, n3);
        if (n4 >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static /* synthetic */ boolean H(CharSequence charSequence, CharSequence charSequence2) {
        return StringsKt.F(charSequence, charSequence2, false);
    }

    public static boolean I(CharSequence charSequence, char c2) {
        boolean bl2;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        int n3 = charSequence.length();
        boolean bl3 = false;
        if (n3 > 0 && (bl2 = a.a(charSequence.charAt(n3 = StringsKt.K(charSequence)), c2, false))) {
            bl3 = true;
        }
        return bl3;
    }

    public static boolean J(CharSequence charSequence, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String string3 = "suffix";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = charSequence instanceof String;
        if (n3 != 0) {
            charSequence = (String)charSequence;
            n3 = 0;
            string3 = null;
            bl2 = b.h((String)charSequence, string2, false);
        } else {
            n3 = charSequence.length();
            int n4 = string2.length();
            int n7 = n3 - n4;
            int n8 = string2.length();
            bl2 = StringsKt__StringsKt.x(charSequence, n7, string2, 0, n8, false);
        }
        return bl2;
    }

    public static int K(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() + -1;
    }

    public static int L(int n3, CharSequence charSequence, String string2, boolean bl2) {
        boolean bl3;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        CharSequence charSequence2 = "string";
        Intrinsics.checkNotNullParameter(string2, charSequence2);
        if (!bl2 && (bl3 = charSequence instanceof String)) {
            charSequence = (String)charSequence;
            n3 = ((String)charSequence).indexOf(string2, n3);
        } else {
            int n4 = charSequence.length();
            charSequence2 = charSequence;
            n3 = StringsKt__StringsKt.u(charSequence, string2, n3, n4, bl2, false);
        }
        return n3;
    }

    public static int M(CharSequence charSequence, char c2, int n3, boolean bl2) {
        int n4;
        int n7;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, (String)object);
        if (!bl2 && (n7 = charSequence instanceof String) != 0) {
            charSequence = (String)charSequence;
            n4 = ((String)charSequence).indexOf(c2, n3);
        } else {
            n7 = 1;
            object = new char[n7];
            object[0] = c2;
            n4 = StringsKt__StringsKt.v(charSequence, (char[])object, n3, bl2);
        }
        return n4;
    }

    public static /* synthetic */ int N(CharSequence charSequence, char c2, int n3, boolean bl2, int n4) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            n3 = 0;
        }
        if ((n4 &= 4) != 0) {
            bl2 = false;
        }
        return StringsKt.M(charSequence, c2, n3, bl2);
    }

    public static /* synthetic */ int O(CharSequence charSequence, String string2, int n3, boolean bl2, int n4) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            n3 = 0;
        }
        if ((n4 &= 4) != 0) {
            bl2 = false;
        }
        return StringsKt.L(n3, charSequence, string2, bl2);
    }

    public static /* synthetic */ int P(CharSequence charSequence, char[] cArray, int n3) {
        return StringsKt__StringsKt.v(charSequence, cArray, n3, false);
    }

    public static int Q(CharSequence charSequence, char c2, int n3, int n4) {
        int n7 = -1;
        if ((n4 &= 2) != 0) {
            n3 = StringsKt.K(charSequence);
        }
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        int n8 = charSequence instanceof String;
        if (n8 == 0) {
            n8 = 1;
            char[] cArray = new char[n8];
            cArray[0] = c2;
            Intrinsics.checkNotNullParameter(charSequence, string2);
            String string3 = "chars";
            Intrinsics.checkNotNullParameter(cArray, string3);
            c2 = charSequence instanceof String;
            if (c2 != '\u0000') {
                c2 = tp_2.I(cArray);
                charSequence = (String)charSequence;
                n7 = ((String)charSequence).lastIndexOf(c2, n3);
            } else {
                c2 = (char)StringsKt.K(charSequence);
                if (n3 > c2) {
                    n3 = c2;
                }
                while (n7 < n3) {
                    c2 = charSequence.charAt(n3);
                    n4 = cArray[0];
                    if ((c2 = (char)(a.a((char)n4, c2, false) ? 1 : 0)) != '\u0000') {
                        n7 = n3;
                        break;
                    }
                    n3 += n7;
                }
            }
        } else {
            charSequence = (String)charSequence;
            n7 = ((String)charSequence).lastIndexOf(c2, n3);
        }
        return n7;
    }

    public static int R(CharSequence charSequence, String string2, int n3, int n4) {
        int n7;
        if ((n4 &= 2) != 0) {
            n3 = StringsKt.K(charSequence);
        }
        int n8 = n3;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String string3 = "string";
        Intrinsics.checkNotNullParameter(string2, string3);
        n3 = charSequence instanceof String;
        if (n3 == 0) {
            boolean bl2 = true;
            n7 = StringsKt__StringsKt.u(charSequence, string2, n8, 0, false, bl2);
        } else {
            charSequence = (String)charSequence;
            n7 = ((String)charSequence).lastIndexOf(string2, n8);
        }
        return n7;
    }

    public static List S(CharSequence charSequence) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, (String)object);
        Intrinsics.checkNotNullParameter(charSequence, (String)object);
        Object object2 = new String[]{"\r\n", "\n", "\r"};
        Intrinsics.checkNotNullParameter(charSequence, (String)object);
        Intrinsics.checkNotNullParameter(object2, "delimiters");
        object = StringsKt__StringsKt.w(charSequence, object2, false, 0);
        object2 = new e(charSequence);
        return kz2_1.l(kz2_1.i((Sequence)object, (Function1)object2));
    }

    public static String T(int n3, String object) {
        CharSequence charSequence = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        if (n3 >= 0) {
            Object object2;
            int n4 = ((String)object).length();
            if (n3 <= n4) {
                n3 = 0;
                n4 = ((String)object).length();
                object2 = ((String)object).subSequence(0, n4);
            } else {
                char c2;
                charSequence = new StringBuilder(n3);
                int n7 = ((String)object).length();
                n3 -= n7;
                n7 = 1;
                IntRange intRange = new kotlin.ranges.c(n7, n3, n7);
                object2 = intRange.d();
                while ((c2 = ((ui1_2)object2).c) != '\u0000') {
                    ((ui1_2)object2).nextInt();
                    c2 = '0';
                    ((StringBuilder)charSequence).append(c2);
                }
                ((StringBuilder)charSequence).append((CharSequence)object);
                object2 = charSequence;
            }
            return object2.toString();
        }
        String string2 = Gj0.b(n3, "Desired length ", " is less than zero.");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static String U(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "prefix");
        boolean bl2 = StringsKt.c0(string2, string3, false);
        if (bl2) {
            int n3 = string3.length();
            string2 = string2.substring(n3);
            string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        }
        return string2;
    }

    public static String V(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "suffix";
        Intrinsics.checkNotNullParameter(string3, string4);
        int n3 = StringsKt.J(string2, string3);
        if (n3 != 0) {
            n3 = string2.length();
            int n4 = string3.length();
            n3 -= n4;
            n4 = 0;
            string2 = string2.substring(0, n3);
            string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        }
        return string2;
    }

    public static String W(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string3 = ".";
        Intrinsics.checkNotNullParameter(string3, "delimiter");
        String string4 = "";
        Intrinsics.checkNotNullParameter(string4, "replacement");
        String string5 = "missingDelimiterValue";
        Intrinsics.checkNotNullParameter(string2, string5);
        int n3 = StringsKt.O(string2, string3, 0, false, 6);
        int n4 = -1;
        if (n3 != n4) {
            n4 = 1 + n3;
            n3 = string2.length();
            string2 = ((Object)StringsKt.X(string2, n4, n3, string4)).toString();
        }
        return string2;
    }

    public static StringBuilder X(CharSequence object, int n3, int n4, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        CharSequence charSequence2 = "replacement";
        Intrinsics.checkNotNullParameter(charSequence, (String)charSequence2);
        if (n4 >= n3) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((CharSequence)object, 0, n3);
            String string2 = "append(...)";
            Intrinsics.checkNotNullExpressionValue(charSequence2, string2);
            ((StringBuilder)charSequence2).append(charSequence);
            int n7 = object.length();
            ((StringBuilder)charSequence2).append((CharSequence)object, n4, n7);
            Intrinsics.checkNotNullExpressionValue(charSequence2, string2);
            return charSequence2;
        }
        String string3 = z41.a("End index (", ") is less than start index (", ").", n4, n3);
        object = new IndexOutOfBoundsException(string3);
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List Y(CharSequence list, String[] object, boolean bl2, int n3) {
        boolean bl3;
        void var3_5;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        Object object2 = "delimiters";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = ((Object)object).length;
        int n7 = 1;
        if (n4 == n7) {
            n4 = 0;
            object2 = object[0];
            n7 = ((String)object2).length();
            if (n7 != 0) return StringsKt__StringsKt.z((int)var3_5, list, (String)object2, bl2);
        }
        object = StringsKt__StringsKt.w(list, (String[])object, bl2, (int)var3_5);
        Intrinsics.checkNotNullParameter(object, string2);
        Object object3 = new gz2_2((no0_2)object);
        int n8 = 10;
        int n10 = yx_2.o((Iterable)object3, n8);
        ArrayList<Object> arrayList = new ArrayList<Object>(n10);
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            object3 = (IntRange)object.next();
            object3 = StringsKt__StringsKt.A(list, (IntRange)object3);
            arrayList.add(object3);
        }
        return arrayList;
    }

    public static List Z(CharSequence arrayList, char[] object) {
        ArrayList<Object> arrayList2 = "<this>";
        Intrinsics.checkNotNullParameter(arrayList, (String)((Object)arrayList2));
        Object object2 = "delimiters";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((char[])object).length;
        int n4 = 1;
        if (n3 == n4) {
            char c2 = object[0];
            object = String.valueOf(c2);
            arrayList = StringsKt__StringsKt.z(0, (CharSequence)((Object)arrayList), (String)object, false);
        } else {
            StringsKt__StringsKt.y(0);
            c c3 = new c((char[])object, false);
            object2 = new no0_2((CharSequence)((Object)arrayList), 0, 0, c3);
            Intrinsics.checkNotNullParameter(object2, (String)((Object)arrayList2));
            object = new gz2_2;
            ((gz2_2)object)((no0_2)object2);
            n4 = 10;
            int n7 = yx_2.o((Iterable)object, n4);
            arrayList2 = new ArrayList<Object>(n7);
            object = object2.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (IntRange)object.next();
                object2 = StringsKt__StringsKt.A(arrayList, (IntRange)object2);
                arrayList2.add(object2);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List a0(CharSequence charSequence, String[] stringArray, boolean bl2, int n3, int n4) {
        return StringsKt__StringsKt.split$default(charSequence, stringArray, bl2, n3, n4, null);
    }

    public static boolean b0(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string3 = "boundary=";
        Intrinsics.checkNotNullParameter(string3, "prefix");
        int n4 = string3.length();
        return StringsKt__StringsKt.x(string2, n3, string3, 0, n4, true);
    }

    public static boolean c0(CharSequence charSequence, String string2, boolean bl2) {
        boolean bl3;
        boolean bl4;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        CharSequence charSequence2 = "prefix";
        Intrinsics.checkNotNullParameter(string2, charSequence2);
        if (!bl2 && (bl4 = charSequence instanceof String)) {
            charSequence = (String)charSequence;
            bl2 = false;
            bl3 = b.s((String)charSequence, string2, false);
        } else {
            int n3 = string2.length();
            charSequence2 = charSequence;
            bl3 = StringsKt__StringsKt.x(charSequence, 0, string2, 0, n3, bl2);
        }
        return bl3;
    }

    public static boolean d0(CharSequence charSequence, char c2) {
        boolean bl2;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        int n3 = charSequence.length();
        boolean bl3 = false;
        if (n3 > 0 && (bl2 = a.a(charSequence.charAt(0), c2, false))) {
            bl3 = true;
        }
        return bl3;
    }

    public static String e0(char c2, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "missingDelimiterValue";
        Intrinsics.checkNotNullParameter(string3, string4);
        c2 = (char)StringsKt.N(string2, c2, 0, false, 6);
        char c3 = '\uffffffff';
        if (c2 != c3) {
            c2 = (char)(c2 + '\u0001');
            int n3 = string2.length();
            string3 = string2.substring(c2, n3);
            String string5 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string3, string5);
        }
        return string3;
    }

    public static String f0(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "delimiter");
        String string4 = "missingDelimiterValue";
        Intrinsics.checkNotNullParameter(string2, string4);
        int n3 = StringsKt.O(string2, string3, 0, false, 6);
        int n4 = -1;
        if (n3 != n4) {
            int n7 = string3.length() + n3;
            n3 = string2.length();
            string2 = string2.substring(n7, n3);
            string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        }
        return string2;
    }

    public static String g0(char c2, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "missingDelimiterValue");
        int n3 = 6;
        c2 = (char)StringsKt.Q(string2, c2, 0, n3);
        char c3 = '\uffffffff';
        if (c2 != c3) {
            c2 = (char)(c2 + '\u0001');
            int n4 = string2.length();
            string3 = string2.substring(c2, n4);
            String string4 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string3, string4);
        }
        return string3;
    }

    public static String h0(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "delimiter");
        Intrinsics.checkNotNullParameter(string4, "missingDelimiterValue");
        int n3 = StringsKt.R(string2, string3, 0, 6);
        int n4 = -1;
        if (n3 != n4) {
            int n7 = string3.length() + n3;
            int n8 = string2.length();
            string4 = string2.substring(n7, n8);
            string2 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string4, string2);
        }
        return string4;
    }

    public static String i0(String string2, char c2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string3 = "missingDelimiterValue";
        Intrinsics.checkNotNullParameter(string2, string3);
        c2 = (char)StringsKt.N(string2, c2, 0, false, 6);
        char c3 = '\uffffffff';
        if (c2 != c3) {
            string2 = string2.substring(0, c2);
            String string4 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string4);
        }
        return string2;
    }

    public static String j0(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "delimiter");
        String string4 = "missingDelimiterValue";
        Intrinsics.checkNotNullParameter(string2, string4);
        int n3 = StringsKt.O(string2, string3, 0, false, 6);
        int n4 = -1;
        if (n3 != n4) {
            string2 = string2.substring(0, n3);
            string3 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        }
        return string2;
    }

    public static String k0(String string2, char c2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string3 = "missingDelimiterValue";
        Intrinsics.checkNotNullParameter(string2, string3);
        c2 = (char)StringsKt.Q(string2, c2, 0, 6);
        char c3 = '\uffffffff';
        if (c2 != c3) {
            string2 = string2.substring(0, c2);
            String string4 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string4);
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Long l0(String var0) {
        block9: {
            block12: {
                block10: {
                    block11: {
                        var1_1 = var0;
                        var2_2 = "<this>";
                        Intrinsics.checkNotNullParameter(var0, var2_2);
                        Intrinsics.checkNotNullParameter(var0, var2_2);
                        var3_3 = 10;
                        CharsKt__CharJVMKt.checkRadix(var3_3);
                        var4_4 = var0.length();
                        var5_5 = null;
                        if (var4_4 == 0) break block9;
                        var6_6 = 0;
                        var7_7 = var0.charAt(0);
                        var8_8 = Intrinsics.compare(var7_7, 48);
                        var9_9 = -9223372036854775807L;
                        if (var8_8 >= 0) break block10;
                        var8_8 = 1;
                        if (var4_4 == var8_8) break block9;
                        var11_10 = 45;
                        if (var7_7 != var11_10) break block11;
                        var9_9 = -9223372036854775808L;
                        var6_6 = 1;
                        break block12;
                    }
                    var11_10 = 43;
                    if (var7_7 != var11_10) break block9;
                    var6_6 = 1;
                }
                var8_8 = 0;
            }
            var12_11 = -256204778801521550L;
            var14_12 = 0L;
            var16_13 = var12_11;
            while (var6_6 < var4_4) {
                var7_7 = Character.digit((int)var1_1.charAt(var6_6), var3_3);
                if (var7_7 < 0) break block9;
                var18_14 /* !! */  = (long)(var14_12 == var16_13 ? 0 : (var14_12 < var16_13 ? -1 : 1));
                if (var18_14 /* !! */  < 0) {
                    var18_14 /* !! */  = (long)(var16_13 == var12_11 ? 0 : (var16_13 < var12_11 ? -1 : 1));
                    if (var18_14 /* !! */  != false) break block9;
                    var16_13 = var3_3;
                    cfr_temp_0 = var14_12 - (var16_13 = var9_9 / var16_13);
                    var18_14 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var18_14 /* !! */  < 0) break block9;
                }
                var12_11 = var3_3;
                var19_15 = var9_9 + (var12_11 = (long)var7_7);
                cfr_temp_1 = (var14_12 *= var12_11) - var19_15;
                if ((var7_7 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) >= 0) {
                    var14_12 -= var12_11;
                    ++var6_6;
                    var12_11 = -256204778801521550L;
                    continue;
                }
                break block9;
            }
            if (var8_8 != 0) {
                var1_1 = var14_12;
lbl55:
                // 2 sources

                while (true) {
                    var5_5 = var1_1;
                    break;
                }
            } else {
                var21_16 = -var14_12;
                var1_1 = var21_16;
                ** continue;
            }
        }
        return var5_5;
    }

    public static CharSequence m0(CharSequence charSequence) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        int n3 = charSequence.length();
        int n4 = 1;
        n3 -= n4;
        int n7 = 0;
        boolean bl2 = false;
        while (n7 <= n3) {
            int n8 = !bl2 ? n7 : n3;
            n8 = (int)(CharsKt.b(charSequence.charAt(n8)) ? 1 : 0);
            if (!bl2) {
                if (n8 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n8 == 0) break;
            n3 += -1;
        }
        return charSequence.subSequence(n7, n3 += n4);
    }
}

