/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oe3
 */
public final class oe3_2 {
    public static final String[] a;
    public static final byte[] b;

    static {
        char c2;
        char c3;
        char c5;
        int n3;
        int n4 = 93;
        String[] stringArray = new String[n4];
        int n7 = 0;
        String string2 = null;
        for (int i3 = 0; i3 < (n3 = 32); ++i3) {
            String string3;
            n3 = oe3_2.b(i3 >> 12);
            c5 = oe3_2.b(i3 >> 8);
            c3 = oe3_2.b(i3 >> 4);
            c2 = oe3_2.b(i3);
            String string4 = "\\u";
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append((char)n3);
            stringBuilder.append(c5);
            stringBuilder.append(c3);
            stringBuilder.append(c2);
            stringArray[i3] = string3 = stringBuilder.toString();
        }
        c5 = '\"';
        stringArray[c5] = "\\\"";
        c3 = '\\';
        stringArray[c3] = "\\\\";
        c2 = '\t';
        stringArray[c2] = "\\t";
        int n8 = 8;
        stringArray[n8] = "\\b";
        int n10 = 10;
        stringArray[n10] = "\\n";
        int n14 = 13;
        stringArray[n14] = "\\r";
        string2 = "\\f";
        int n15 = 12;
        stringArray[n15] = string2;
        a = stringArray;
        byte[] byArray = new byte[n4];
        while (n7 < n3) {
            byte by2;
            byArray[n7] = by2 = 1;
            ++n7;
        }
        byArray[c5] = c5;
        byArray[c3] = c3;
        byArray[c2] = 116;
        byArray[n8] = 98;
        byArray[n10] = 110;
        byArray[n14] = 114;
        byArray[n15] = 102;
        b = byArray;
    }

    public static final void a(String string2, StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "<this>");
        String string3 = "value";
        Intrinsics.checkNotNullParameter(string2, string3);
        char c2 = '\"';
        stringBuilder.append(c2);
        int n3 = string2.length();
        int n4 = 0;
        String string4 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string5;
            String[] stringArray;
            int n7;
            char c3 = string2.charAt(i3);
            if (c3 >= (n7 = (stringArray = a).length) || (string5 = stringArray[c3]) == null) continue;
            stringBuilder.append(string2, n4, i3);
            string4 = stringArray[c3];
            stringBuilder.append(string4);
            n4 = i3 + 1;
        }
        if (n4 != 0) {
            n3 = string2.length();
            stringBuilder.append(string2, n4, n3);
        } else {
            stringBuilder.append(string2);
        }
        stringBuilder.append(c2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final char b(int n3) {
        int n4 = 10;
        if ((n3 &= 0xF) < n4) {
            n3 += 48;
            return (char)((int)((char)n3));
        }
        n3 += 87;
        return (char)((int)((char)n3));
    }
}

