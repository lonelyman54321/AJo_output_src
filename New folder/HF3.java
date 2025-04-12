/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public final class HF3 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final Xm2 a;
    public final StringBuilder b;

    public HF3() {
        Object object = new Xm2();
        this.a = object;
        this.b = object = new StringBuilder();
    }

    public static String a(Xm2 xm2, StringBuilder stringBuilder) {
        int n3 = 0;
        stringBuilder.setLength(0);
        int n4 = xm2.b;
        int n7 = xm2.c;
        while (n4 < n7 && n3 == 0) {
            byte[] byArray = xm2.a;
            int n8 = byArray[n4];
            int n10 = 65;
            if (!(n8 >= n10 && n8 <= (n10 = 90) || n8 >= (n10 = 97) && n8 <= (n10 = 122) || n8 >= (n10 = 48) && n8 <= (n10 = 57) || n8 == (n10 = 35) || n8 == (n10 = 45) || n8 == (n10 = 46) || n8 == (n10 = 95))) {
                n3 = 1;
                continue;
            }
            ++n4;
            stringBuilder.append((char)n8);
        }
        n3 = xm2.b;
        xm2.J(n4 -= n3);
        return stringBuilder.toString();
    }

    public static String b(Xm2 xm2, StringBuilder charSequence) {
        HF3.c(xm2);
        int n3 = xm2.a();
        if (n3 == 0) {
            return null;
        }
        String string2 = "";
        boolean bl2 = string2.equals(charSequence = HF3.a(xm2, (StringBuilder)charSequence));
        if (!bl2) {
            return charSequence;
        }
        charSequence = new StringBuilder(string2);
        char c2 = (char)xm2.w();
        ((StringBuilder)charSequence).append(c2);
        return ((StringBuilder)charSequence).toString();
    }

    public static void c(Xm2 xm2) {
        int n3 = 1;
        block0: while (true) {
            int n4;
            int n7 = 1;
            while ((n4 = xm2.a()) > 0 && n7 != 0) {
                byte[] byArray = xm2.a;
                n7 = xm2.b;
                int n8 = byArray[n7];
                int n10 = n8;
                int n14 = 9;
                if (n10 != n14 && n10 != (n14 = 10) && n10 != (n14 = 12) && n10 != (n14 = 13) && n10 != (n14 = 32)) {
                    n14 = n7 + 2;
                    n10 = xm2.c;
                    if (n14 <= n10) {
                        ++n7;
                        int n15 = 47;
                        if (n8 == n15 && (n7 = byArray[n7]) == (n8 = 42)) {
                            while ((n7 = n14 + 1) < n10) {
                                char c2 = (char)byArray[n14];
                                if (c2 == n8 && (c2 = (char)byArray[n7]) == n15) {
                                    n10 = n14 += 2;
                                    continue;
                                }
                                n14 = n7;
                            }
                            n7 = xm2.b;
                            xm2.J(n10 -= n7);
                            continue block0;
                        }
                    }
                    n7 = 0;
                    continue;
                }
                xm2.J(n3);
                continue block0;
            }
            break;
        }
    }
}

