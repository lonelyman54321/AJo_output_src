/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ki3$a$a {
    public static boolean a(String string2, String string3) {
        block7: {
            String string4 = "current";
            Intrinsics.checkNotNullParameter(string2, string4);
            int n3 = Intrinsics.areEqual(string2, string3);
            int n4 = 1;
            if (n3 != 0) {
                return n4 != 0;
            }
            n3 = string2.length();
            if (n3 != 0) {
                int n7;
                string4 = null;
                int n8 = 0;
                int n10 = 0;
                for (n3 = 0; n3 < (n7 = string2.length()); ++n3) {
                    n7 = string2.charAt(n3);
                    int n14 = n10 + 1;
                    int n15 = 40;
                    if (n10 == 0 && n7 != n15) break block7;
                    if (n7 == n15) {
                        ++n8;
                    } else {
                        n15 = 41;
                        if (n7 == n15 && (n8 += -1) == 0 && n10 != (n7 = string2.length() - n4)) break block7;
                    }
                    n10 = n14;
                }
                if (n8 == 0) {
                    n3 = string2.length() - n4;
                    string2 = string2.substring(n4, n3);
                    Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    return Intrinsics.areEqual(((Object)StringsKt.m0(string2)).toString(), string3);
                }
            }
        }
        return false;
    }
}

