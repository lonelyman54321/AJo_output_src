/*
 * Decompiled with CFR 0.152.
 */
import kotlin.text.b;

public final class lJ$a {
    public static m41_0 a(m41_0 m41_02, m41_0 m41_03) {
        String string2;
        String string3;
        String string4;
        m41$a_0 m41$a_0 = new m41$a_0();
        int n3 = m41_02.size();
        int n4 = 0;
        int n7 = 0;
        String string5 = null;
        while (true) {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            string4 = "Content-Type";
            string3 = "Content-Encoding";
            string2 = "Content-Length";
            if (n7 >= n3) break;
            String string6 = m41_02.c(n7);
            String string7 = m41_02.g(n7);
            String string8 = "Warning";
            boolean bl5 = string8.equalsIgnoreCase(string6);
            if (!(bl5 && (bl5 = b.s(string7, string8 = "1", false)) || !(bl4 = string2.equalsIgnoreCase(string6)) && !(bl3 = string3.equalsIgnoreCase(string6)) && !(bl2 = string4.equalsIgnoreCase(string6)) && (bl2 = lJ$a.b(string6)) && (string4 = m41_03.a(string6)) != null)) {
                m41$a_0.d(string6, string7);
            }
            ++n7;
        }
        int n8 = m41_03.size();
        while (n4 < n8) {
            String string9 = m41_03.c(n4);
            n7 = (int)(string2.equalsIgnoreCase(string9) ? 1 : 0);
            if (n7 == 0 && (n7 = (int)(string3.equalsIgnoreCase(string9) ? 1 : 0)) == 0 && (n7 = (int)(string4.equalsIgnoreCase(string9) ? 1 : 0)) == 0 && (n7 = (int)(lJ$a.b(string9) ? 1 : 0)) != 0) {
                string5 = m41_03.g(n4);
                m41$a_0.d(string9, string5);
            }
            ++n4;
        }
        return m41$a_0.e();
    }

    public static boolean b(String string2) {
        boolean bl2;
        String string3 = "Connection";
        boolean bl3 = string3.equalsIgnoreCase(string2);
        if (!(bl3 || (bl3 = (string3 = "Keep-Alive").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Proxy-Authenticate").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Proxy-Authorization").equalsIgnoreCase(string2)) || (bl3 = (string3 = "TE").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Trailers").equalsIgnoreCase(string2)) || (bl3 = (string3 = "Transfer-Encoding").equalsIgnoreCase(string2)) || (bl2 = (string3 = "Upgrade").equalsIgnoreCase(string2)))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }
}

