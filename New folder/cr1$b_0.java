/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cR1$b
 */
public final class cr1$b_0 {
    public static void a(String string2, StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "<this>");
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        char c2 = '\"';
        stringBuilder.append(c2);
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string4;
            int n4;
            int n7 = string2.charAt(i3);
            if (n7 == (n4 = 10)) {
                string4 = "%0A";
                stringBuilder.append(string4);
                continue;
            }
            n4 = 13;
            if (n7 == n4) {
                string4 = "%0D";
                stringBuilder.append(string4);
                continue;
            }
            if (n7 == c2) {
                string4 = "%22";
                stringBuilder.append(string4);
                continue;
            }
            stringBuilder.append((char)n7);
        }
        stringBuilder.append(c2);
    }
}

