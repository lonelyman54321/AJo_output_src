/*
 * Decompiled with CFR 0.152.
 */
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class zc3$a {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zc3_1 a(String string2) {
        void var1_8;
        int n3;
        String string3;
        int n4;
        int n7;
        Object object;
        int n8;
        block12: {
            int n10;
            block13: {
                Intrinsics.checkNotNullParameter(string2, "statusLine");
                String string4 = "HTTP/1.";
                n8 = 0;
                object = null;
                n10 = b.s(string2, string4, false);
                n7 = 4;
                n4 = 32;
                string3 = "Unexpected status line: ";
                if (n10 == 0) break block13;
                n10 = string2.length();
                if (n10 >= (n8 = 9) && (n10 = (int)string2.charAt(8)) == n4) {
                    n10 = string2.charAt(7) + -48;
                    if (n10 != 0) {
                        n3 = 1;
                        if (n10 != n3) {
                            string2 = string3.concat(string2);
                            ProtocolException protocolException = new ProtocolException(string2);
                            throw protocolException;
                        }
                        ib2_2 ib2_22 = ib2_2.HTTP_1_1;
                        break block12;
                    } else {
                        ib2_2 ib2_23 = ib2_2.HTTP_1_0;
                    }
                    break block12;
                } else {
                    string2 = string3.concat(string2);
                    ProtocolException protocolException = new ProtocolException(string2);
                    throw protocolException;
                }
            }
            String string5 = "ICY ";
            n10 = (int)(b.s(string2, string5, false) ? 1 : 0);
            if (n10 == 0) {
                string2 = string3.concat(string2);
                ProtocolException protocolException = new ProtocolException(string2);
                throw protocolException;
            }
            ib2_2 ib2_24 = ib2_2.HTTP_1_0;
            n8 = 4;
        }
        n3 = string2.length();
        int n14 = n8 + 3;
        if (n3 < n14) {
            string2 = string3.concat(string2);
            ProtocolException protocolException = new ProtocolException(string2);
            throw protocolException;
        }
        try {
            String string6 = string2.substring(n8, n14);
            String string7 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            Intrinsics.checkNotNullExpressionValue(string6, string7);
            n3 = Integer.parseInt(string6);
        }
        catch (NumberFormatException numberFormatException) {
            string2 = string3.concat(string2);
            ProtocolException protocolException = new ProtocolException(string2);
            throw protocolException;
        }
        int n15 = string2.length();
        if (n15 > n14) {
            if ((n14 = (int)string2.charAt(n14)) != n4) {
                string2 = string3.concat(string2);
                ProtocolException protocolException = new ProtocolException(string2);
                throw protocolException;
            }
            string2 = string2.substring(n8 += n7);
            object = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            return new zc3_1((ib2_2)var1_8, n3, string2);
        } else {
            string2 = "";
        }
        return new zc3_1((ib2_2)var1_8, n3, string2);
    }
}

