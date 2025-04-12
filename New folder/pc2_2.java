/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/*
 * Renamed from pC2
 */
public final class pc2_2 {
    public static final void a(km2_2 km2_22, String string2, int n3, int n4, int n7, boolean bl2) {
        int n8 = 0;
        int n10 = 12;
        int n14 = -1;
        String string3 = "substring(...)";
        if (n4 == n14) {
            n4 = pc2_2.b(n3 = pc2_2.c(n3, n7, string2), n7, string2);
            if (n4 > n3) {
                if (bl2) {
                    string2 = pw_1.d(string2, n3, n4, false, n10);
                } else {
                    string2 = string2.substring(n3, n4);
                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                }
                mz0_2 string4 = mz0_2.a;
                km2_22.a(string2, string4);
            }
            return;
        }
        n14 = pc2_2.b(n3 = pc2_2.c(n3, n4, string2), n4, string2);
        if (n14 > n3) {
            String string4;
            if (bl2) {
                string4 = pw_1.d(string2, n3, n14, false, n10);
            } else {
                string4 = string2.substring(n3, n14);
                Intrinsics.checkNotNullExpressionValue(string4, string3);
            }
            n8 = 1;
            n4 = pc2_2.c(n4 + n8, n7, string2);
            n7 = pc2_2.b(n4, n7, string2);
            if (bl2) {
                int n15 = 8;
                string2 = pw_1.d(string2, n4, n7, n8 != 0, n15);
            } else {
                string2 = string2.substring(n4, n7);
                Intrinsics.checkNotNullExpressionValue(string2, string3);
            }
            km2_22.b(string4, string2);
        }
    }

    public static final int b(int n3, int n4, CharSequence charSequence) {
        while (n4 > n3) {
            int n7 = n4 + -1;
            if ((n7 = (int)(CharsKt.b(charSequence.charAt(n7)) ? 1 : 0)) == 0) break;
            n4 += -1;
        }
        return n4;
    }

    public static final int c(int n3, int n4, CharSequence charSequence) {
        boolean bl2;
        while (n3 < n4 && (bl2 = CharsKt.b(charSequence.charAt(n3)))) {
            ++n3;
        }
        return n3;
    }
}

