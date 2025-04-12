/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

class StringsKt__StringNumberConversionsKt
extends je3_2 {
    public static final void f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "input");
        string2 = oj_0.b('\'', "Invalid number format: '", string2);
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer toIntOrNull(String object) {
        int n3;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = 10;
        CharsKt__CharJVMKt.checkRadix(n4);
        int n7 = ((String)object).length();
        Object object2 = null;
        if (n7 == 0) return object2;
        int n8 = 0;
        int n10 = ((String)object).charAt(0);
        int n14 = Intrinsics.compare(n10, 48);
        int n15 = -2147483647;
        if (n14 < 0) {
            n14 = 1;
            if (n7 == n14) return object2;
            n3 = 45;
            if (n10 == n3) {
                n15 = -1 << -1;
                n10 = 1;
            } else {
                n3 = 43;
                if (n10 != n3) return object2;
                n10 = 0;
            }
        } else {
            n10 = 0;
            n14 = 0;
        }
        n3 = -59652323;
        int n16 = -59652323;
        while (n14 < n7) {
            int n17;
            int n18 = Character.digit((int)((String)object).charAt(n14), n4);
            if (n18 < 0) return object2;
            if (n8 < n16) {
                if (n16 != n3) return object2;
                n16 = n15 / 10;
                if (n8 < n16) return object2;
            }
            if ((n8 *= 10) < (n17 = n15 + n18)) return object2;
            n8 -= n18;
            ++n14;
        }
        if (n10 != 0) {
            object = n8;
            return object;
        }
        int n19 = -n8;
        return n19;
    }
}

