/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;

public class b
extends StringsKt__StringNumberConversionsKt {
    public static String g(char[] cArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(cArray, "<this>");
        Object object = x0_0.a;
        int n7 = cArray.length;
        object.getClass();
        X0$a.a(n3, n4, n7);
        object = new String(cArray, n3, n4 -= n3);
        return object;
    }

    public static boolean h(String string2, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "suffix";
        Intrinsics.checkNotNullParameter(string3, string4);
        if (!bl2) {
            return string2.endsWith(string3);
        }
        int n3 = string2.length();
        int n4 = string3.length();
        int n7 = n3 - n4;
        int n8 = string3.length();
        return b.l(n7, 0, n8, string2, string3, true);
    }

    public static boolean i(String string2, String string3, boolean bl2) {
        if (string2 == null) {
            boolean bl3;
            if (string3 == null) {
                bl3 = true;
            } else {
                bl3 = false;
                string2 = null;
            }
            return bl3;
        }
        boolean bl4 = !bl2 ? string2.equals(string3) : string2.equalsIgnoreCase(string3);
        return bl4;
    }

    public static /* synthetic */ boolean j(String string2, String string3) {
        return b.i(string2, string3, false);
    }

    public static boolean k(CharSequence charSequence) {
        int n3;
        block3: {
            Object object;
            int n4;
            mi1_2 mi1_22;
            block4: {
                mi1_22 = "<this>";
                Intrinsics.checkNotNullParameter(charSequence, (String)((Object)mi1_22));
                n4 = charSequence.length();
                n3 = 1;
                if (n4 == 0) break block3;
                Intrinsics.checkNotNullParameter(charSequence, (String)((Object)mi1_22));
                n4 = charSequence.length() - n3;
                mi1_22 = new c(0, n4, n3);
                n4 = mi1_22 instanceof Collection;
                if (n4 == 0) break block4;
                object = mi1_22;
                object = (Collection)((Object)mi1_22);
                n4 = (int)(object.isEmpty() ? 1 : 0);
                if (n4 != 0) break block3;
            }
            mi1_22 = ((Iterable)((Object)mi1_22)).iterator();
            while ((n4 = (int)(mi1_22.hasNext() ? 1 : 0)) != 0) {
                object = mi1_22;
                object = mi1_22;
                n4 = ((mi1_2)object).nextInt();
                if ((n4 = (int)(CharsKt.b(charSequence.charAt(n4)) ? 1 : 0)) != 0) continue;
                n3 = 0;
                break;
            }
        }
        return n3 != 0;
    }

    public static boolean l(int n3, int n4, int n7, String string2, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "other";
        Intrinsics.checkNotNullParameter(string3, string4);
        if (!bl2) {
            n3 = (int)(string2.regionMatches(n3, string3, n4, n7) ? 1 : 0);
        } else {
            string4 = string2;
            n3 = (int)(string2.regionMatches(bl2, n3, string3, n4, n7) ? 1 : 0);
        }
        return n3 != 0;
    }

    public static String m(String charSequence, int n3) {
        CharSequence charSequence2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, (String)charSequence2);
        if (n3 >= 0) {
            charSequence2 = "";
            if (n3 != 0) {
                int n4 = 1;
                if (n3 != n4) {
                    int n7 = ((String)charSequence).length();
                    if (n7 != 0) {
                        if (n7 != n4) {
                            n7 = ((String)charSequence).length() * n3;
                            charSequence2 = new StringBuilder(n7);
                            IntRange intRange = new c(n4, n3, n4);
                            ui1_2 ui1_22 = intRange.d();
                            while ((n4 = (int)(ui1_22.c ? 1 : 0)) != 0) {
                                ui1_22.nextInt();
                                ((StringBuilder)charSequence2).append(charSequence);
                            }
                            charSequence2 = ((StringBuilder)charSequence2).toString();
                            Intrinsics.checkNotNull(charSequence2);
                        } else {
                            charSequence2 = null;
                            char c2 = ((String)charSequence).charAt(0);
                            char[] cArray = new char[n3];
                            for (int i3 = 0; i3 < n3; ++i3) {
                                cArray[i3] = c2;
                            }
                            charSequence2 = new String(cArray);
                        }
                    }
                } else {
                    charSequence2 = charSequence.toString();
                }
            }
            return charSequence2;
        }
        charSequence = new StringBuilder("Count 'n' must be non-negative, but was ");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append('.');
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public static String n(String object, String string2, String string3, boolean bl2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "oldValue");
        Intrinsics.checkNotNullParameter(string3, "newValue");
        int n4 = 0;
        int n7 = StringsKt.L(0, (CharSequence)object, string2, bl2);
        if (n7 < 0) {
            return object;
        }
        int n8 = string2.length();
        if (n8 >= (n3 = 1)) {
            n3 = n8;
        }
        int n10 = ((String)object).length() - n8;
        int n14 = string3.length() + n10;
        if (n14 >= 0) {
            StringBuilder stringBuilder = new StringBuilder(n14);
            do {
                stringBuilder.append((CharSequence)object, n4, n7);
                stringBuilder.append(string3);
                n4 = n7 + n8;
            } while (n7 < (n14 = ((String)object).length()) && (n7 = StringsKt.L(n7 + n3, (CharSequence)object, string2, bl2)) > 0);
            int n15 = ((String)object).length();
            stringBuilder.append((CharSequence)object, n4, n15);
            object = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
            return object;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public static String o(String string2, char c2, char c3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        string2 = string2.replace(c2, c3);
        Intrinsics.checkNotNullExpressionValue(string2, "replace(...)");
        return string2;
    }

    public static /* synthetic */ String p(String string2, String string3, String string4) {
        return b.n(string2, string3, string4, false);
    }

    public static List q(CharSequence objectArray, Pattern pattern) {
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "regex");
        StringsKt__StringsKt.y(0);
        objectArray = pattern.split((CharSequence)objectArray, -1);
        Intrinsics.checkNotNullExpressionValue(objectArray, "split(...)");
        return rp_1.e(objectArray);
    }

    public static boolean r(int n3, String string2, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "prefix";
        Intrinsics.checkNotNullParameter(string3, string4);
        if (!bl2) {
            return string2.startsWith(string3, n3);
        }
        int n4 = string3.length();
        return b.l(n3, 0, n4, string2, string3, bl2);
    }

    public static boolean s(String string2, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "prefix";
        Intrinsics.checkNotNullParameter(string3, string4);
        if (!bl2) {
            return string2.startsWith(string3);
        }
        int n3 = string3.length();
        return b.l(0, 0, n3, string2, string3, bl2);
    }

    public static /* synthetic */ boolean t(String string2, String string3) {
        return b.s(string2, string3, false);
    }
}

