/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class dn2 {
    public String a;
    public HY0 b;
    public int c;
    public int d;

    public final int a() {
        HY0 hY0 = this.b;
        if (hY0 == null) {
            return this.a.length();
        }
        int n3 = this.a.length();
        int n4 = this.d;
        int n7 = this.c;
        n4 = hY0.a;
        int n8 = hY0.a();
        return n4 - n8 + (n3 -= (n4 -= n7));
    }

    public final void b(int n3, int n4, String string2) {
        if (n3 <= n4) {
            if (n3 >= 0) {
                int n7;
                Object object = this.b;
                String string3 = "null cannot be cast to non-null type java.lang.String";
                if (object == null) {
                    int n8 = string2.length() + 128;
                    n8 = Math.max(255, n8);
                    char[] cArray = new char[n8];
                    int n10 = 64;
                    int n14 = Math.min(n3, n10);
                    n10 = Math.min(this.a.length() - n4, n10);
                    String string4 = this.a;
                    int n15 = n3 - n14;
                    Intrinsics.checkNotNull(string4, string3);
                    string4.getChars(n15, n3, cArray, 0);
                    Object object2 = this.a;
                    int n16 = n8 - n10;
                    Intrinsics.checkNotNull(object2, string3);
                    ((String)object2).getChars(n4, n10 += n4, cArray, n16);
                    n3 = string2.length();
                    Intrinsics.checkNotNull(string2, string3);
                    string2.getChars(0, n3, cArray, n14);
                    n4 = string2.length() + n14;
                    object2 = new Object();
                    ((HY0)object2).a = n8;
                    ((HY0)object2).b = cArray;
                    ((HY0)object2).c = n4;
                    ((HY0)object2).d = n16;
                    this.b = object2;
                    this.c = n15;
                    this.d = n10;
                    return;
                }
                int n17 = this.c;
                int n18 = n3 - n17;
                n17 = n4 - n17;
                if (n18 >= 0) {
                    int n19 = ((HY0)object).a;
                    int n20 = ((HY0)object).a();
                    if (n17 <= (n19 -= n20)) {
                        char[] cArray;
                        char[] cArray2;
                        n3 = string2.length();
                        n4 = n17 - n18;
                        if ((n3 -= n4) > (n4 = ((HY0)object).a())) {
                            n4 = ((HY0)object).a();
                            n3 -= n4;
                            n4 = ((HY0)object).a;
                            do {
                                n19 = ((HY0)object).a;
                            } while ((n19 = (n4 *= 2) - n19) < n3);
                            cArray2 = new char[n4];
                            cArray = ((HY0)object).b;
                            n20 = ((HY0)object).c;
                            rp_1.h(cArray, cArray2, 0, 0, n20);
                            n19 = ((HY0)object).a;
                            n20 = ((HY0)object).d;
                            int n21 = n4 - (n19 -= n20);
                            char[] cArray3 = ((HY0)object).b;
                            rp_1.h(cArray3, cArray2, n21, n20, n19 += n20);
                            ((HY0)object).b = cArray2;
                            ((HY0)object).a = n4;
                            ((HY0)object).d = n21;
                        }
                        n3 = ((HY0)object).c;
                        if (n18 < n3 && n17 <= n3) {
                            n4 = n3 - n17;
                            cArray = ((HY0)object).b;
                            n20 = ((HY0)object).d - n4;
                            rp_1.h(cArray, cArray, n20, n17, n3);
                            ((HY0)object).c = n18;
                            ((HY0)object).d = n3 = ((HY0)object).d - n4;
                        } else if (n18 < n3 && n17 >= n3) {
                            ((HY0)object).d = n3 = ((HY0)object).a() + n17;
                            ((HY0)object).c = n18;
                        } else {
                            n3 = ((HY0)object).a() + n18;
                            n4 = ((HY0)object).a() + n17;
                            n17 = ((HY0)object).d;
                            n18 = n3 - n17;
                            cArray = ((HY0)object).b;
                            n20 = ((HY0)object).c;
                            rp_1.h(cArray, cArray, n20, n17, n3);
                            ((HY0)object).c = n3 = ((HY0)object).c + n18;
                            ((HY0)object).d = n4;
                        }
                        cArray2 = ((HY0)object).b;
                        n4 = ((HY0)object).c;
                        n17 = string2.length();
                        Intrinsics.checkNotNull(string2, string3);
                        string2.getChars(0, n17, cArray2, n4);
                        n3 = ((HY0)object).c;
                        ((HY0)object).c = n4 = string2.length() + n3;
                        return;
                    }
                }
                this.a = object = this.toString();
                this.b = null;
                this.c = n7 = -1;
                this.d = n7;
                this.b(n3, n4, string2);
                return;
            }
            String string5 = hj0_0.a(n3, "start must be non-negative, but was ");
            string5 = string5.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string5);
            throw illegalArgumentException;
        }
        String string6 = D70.b(n3, n4, "start index must be less than or equal to end index: ", " > ");
        string6 = string6.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string6);
        throw illegalArgumentException;
    }

    public final String toString() {
        Object object = this.b;
        if (object == null) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = this.a;
        int n3 = this.c;
        stringBuilder.append((CharSequence)object2, 0, n3);
        object2 = ((HY0)object).b;
        n3 = ((HY0)object).c;
        stringBuilder.append((char[])object2, 0, n3);
        object2 = "this.append(value, start\u2026x, endIndex - startIndex)";
        Intrinsics.checkNotNullExpressionValue(stringBuilder, (String)object2);
        char[] cArray = ((HY0)object).b;
        int n4 = ((HY0)object).d;
        int n7 = ((HY0)object).a - n4;
        stringBuilder.append(cArray, n4, n7);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, (String)object2);
        object = this.a;
        int n8 = this.d;
        n3 = ((String)object).length();
        stringBuilder.append((CharSequence)object, n8, n3);
        return stringBuilder.toString();
    }
}

