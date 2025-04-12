/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt;
import kotlin.text.a;
import kotlin.text.b;
import kotlin.text.d;

class StringsKt__StringsKt
extends b {
    public static final String A(CharSequence charSequence, IntRange intRange) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(intRange, "range");
        int n3 = intRange.a;
        int n4 = intRange.b + 1;
        return ((Object)charSequence.subSequence(n3, n4)).toString();
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] stringArray, boolean bl2, int n3, int n4, Object object) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            bl2 = false;
        }
        if ((n4 &= 4) != 0) {
            n3 = 0;
        }
        return StringsKt.Y(charSequence, stringArray, bl2, n3);
    }

    public static final int u(CharSequence charSequence, CharSequence charSequence2, int n3, int n4, boolean bl2, boolean n7) {
        c c2;
        CharSequence charSequence3;
        int n8 = -1;
        int n10 = 0;
        if (n7 == 0) {
            if (n3 < 0) {
                n3 = 0;
                charSequence3 = null;
            }
            if (n4 > (n10 = charSequence.length())) {
                n4 = n10;
            }
            n10 = 1;
            c2 = new c(n3, n4, n10);
        } else {
            n7 = StringsKt.K(charSequence);
            if (n3 > n7) {
                n3 = n7;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            c.d.getClass();
            c2 = new c(n3, n4, n8);
        }
        n3 = charSequence instanceof String;
        n4 = c2.c;
        n10 = c2.b;
        n7 = c2.a;
        if (n3 != 0 && (n3 = charSequence2 instanceof String) != 0) {
            if (n4 > 0 && n7 <= n10 || n4 < 0 && n10 <= n7) {
                while (true) {
                    CharSequence charSequence4 = charSequence2;
                    charSequence4 = (String)charSequence2;
                    CharSequence charSequence5 = charSequence;
                    charSequence5 = (String)charSequence;
                    charSequence3 = charSequence2;
                    charSequence3 = (String)charSequence2;
                    int n14 = ((String)charSequence3).length();
                    n3 = (int)(b.l(0, n7, n14, (String)charSequence4, (String)charSequence5, bl2) ? 1 : 0);
                    if (n3 != 0) {
                        return n7;
                    }
                    if (n7 != n10) {
                        n7 += n4;
                        continue;
                    }
                    break;
                }
            }
        } else if (n4 > 0 && n7 <= n10 || n4 < 0 && n10 <= n7) {
            while (true) {
                int n15;
                if ((n3 = (int)(StringsKt__StringsKt.x(charSequence2, 0, charSequence, n7, n15 = charSequence2.length(), bl2) ? 1 : 0)) != 0) {
                    return n7;
                }
                if (n7 == n10) break;
                n7 += n4;
            }
        }
        return n8;
    }

    public static final int v(CharSequence charSequence, char[] cArray, int n3, boolean bl2) {
        ui1_2 ui1_22;
        char c2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String string2 = "chars";
        Intrinsics.checkNotNullParameter(cArray, string2);
        char c3 = '\u0001';
        if (!bl2 && (c2 = cArray.length) == c3 && (c2 = charSequence instanceof String) != '\u0000') {
            char c5 = tp_2.I(cArray);
            return ((String)charSequence).indexOf(c5, n3);
        }
        if (n3 < 0) {
            n3 = 0;
            ui1_22 = null;
        }
        int n4 = StringsKt.K(charSequence);
        IntRange intRange = new c(n3, n4, c3);
        ui1_22 = intRange.d();
        while ((c3 = (char)(ui1_22.c ? 1 : 0)) != '\u0000') {
            c3 = ui1_22.nextInt();
            c2 = charSequence.charAt(c3);
            n4 = cArray.length;
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl3 = a.a(cArray[i3], c2, bl2);
                if (!bl3) continue;
                return c3;
            }
        }
        return -1;
    }

    public static no0_2 w(CharSequence charSequence, String[] object, boolean bl2, int n3) {
        StringsKt__StringsKt.y(n3);
        object = rp_1.e(object);
        d d2 = new d((List)object, bl2);
        no0_2 no0_22 = new no0_2(charSequence, 0, n3, d2);
        return no0_22;
    }

    public static final boolean x(CharSequence charSequence, int n3, CharSequence charSequence2, int n4, int n7, boolean bl2) {
        int n8;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence2, "other");
        if (n4 >= 0 && n3 >= 0 && n3 <= (n8 = charSequence.length() - n7) && n4 <= (n8 = charSequence2.length() - n7)) {
            for (n8 = 0; n8 < n7; ++n8) {
                char c2 = n3 + n8;
                c2 = charSequence.charAt(c2);
                char c3 = n4 + n8;
                if ((c2 = (char)(a.a(c2, c3 = (char)charSequence2.charAt(c3), bl2) ? 1 : 0)) != '\u0000') continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void y(int n3) {
        if (n3 >= 0) {
            return;
        }
        String string2 = hj0_0.a(n3, "Limit must be non-negative, but was ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final List z(int n3, CharSequence charSequence, String string2, boolean bl2) {
        int n4;
        StringsKt__StringsKt.y(n3);
        int n7 = 0;
        String string3 = null;
        int n8 = StringsKt.L(0, charSequence, string2, bl2);
        int n10 = -1;
        if (n8 != n10 && n3 != (n4 = 1)) {
            boolean bl3 = n3 > 0;
            int n14 = 10;
            if (bl3 && n3 <= n14) {
                n14 = n3;
            }
            ArrayList<String> arrayList = new ArrayList<String>(n14);
            do {
                string3 = ((Object)charSequence.subSequence(n7, n8)).toString();
                arrayList.add(string3);
                n7 = string2.length() + n8;
            } while ((!bl3 || (n8 = arrayList.size()) != (n14 = n3 + -1)) && (n8 = StringsKt.L(n7, charSequence, string2, bl2)) != n10);
            n3 = charSequence.length();
            String string4 = ((Object)charSequence.subSequence(n7, n3)).toString();
            arrayList.add(string4);
            return arrayList;
        }
        return kotlin.collections.a.b(((Object)charSequence).toString());
    }
}

