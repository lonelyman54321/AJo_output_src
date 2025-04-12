/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hS
 */
public final class hs_2 {
    public static final char[] a;
    public static final byte[] b;

    static {
        int n3;
        int n4;
        a = new char[117];
        b = new byte[126];
        int n7 = 0;
        for (n4 = 0; n4 < (n3 = 32); ++n4) {
        }
        n4 = 8;
        hs_2.a(n4, 'b');
        int n8 = 9;
        hs_2.a(n8, 't');
        int n10 = 10;
        hs_2.a(n10, 'n');
        hs_2.a(12, 'f');
        int n14 = 13;
        hs_2.a(n14, 'r');
        char c2 = '/';
        hs_2.a(c2, c2);
        c2 = '\"';
        hs_2.a(c2, c2);
        char c3 = '\\';
        hs_2.a(c3, c3);
        while (true) {
            byte[] byArray = b;
            int n15 = 33;
            if (n7 >= n15) break;
            byArray[n7] = n15 = 127;
            ++n7;
        }
        byArray[n8] = n7 = 3;
        byArray[n10] = n7;
        byArray[n14] = n7;
        byArray[n3] = n7;
        byArray[44] = 4;
        byArray[58] = 5;
        byArray[123] = 6;
        byArray[125] = 7;
        byArray[91] = n4;
        byArray[93] = n8;
        byArray[c2] = 1;
        byArray[c3] = 2;
    }

    public static void a(int n3, char c2) {
        char c3 = 'u';
        if (c2 != c3) {
            char[] cArray = a;
            cArray[c2] = n3 = (int)((char)n3);
        }
    }
}

