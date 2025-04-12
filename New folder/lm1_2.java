/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lm1
 */
public final class lm1_2
implements wj1_2 {
    public char[] a;
    public int b;

    public final void a(char c2) {
        int n3;
        int n4 = this.b;
        this.d(n4, 1);
        char[] cArray = this.a;
        int n7 = this.b;
        this.b = n3 = n7 + 1;
        cArray[n7] = c2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(String object) {
        int n3;
        byte[] byArray;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(object, "text");
        int n8 = ((String)object).length();
        int n10 = 2;
        int n14 = this.b;
        this.d(n14, n8 += n10);
        char[] cArray = this.a;
        n14 = this.b;
        int n15 = n14 + 1;
        cArray[n14] = n7 = 34;
        n14 = ((String)object).length();
        ((String)object).getChars(0, n14, cArray, n15);
        n14 += n15;
        int n16 = n15;
        while (true) {
            if (n16 >= n14) {
                int n17 = n14 + 1;
                cArray[n14] = n7;
                this.b = n17;
                return;
            }
            n4 = cArray[n16];
            byArray = oe3_2.b;
            n3 = byArray.length;
            if (n4 < n3 && (n4 = byArray[n4]) != 0) break;
            ++n16;
        }
        n8 = n16 - n15;
        n14 = ((String)object).length();
        while (true) {
            block6: {
                int n18;
                block9: {
                    Object object2;
                    block7: {
                        block8: {
                            n15 = 1;
                            if (n8 >= n14) {
                                this.d(n16, n15);
                                object = this.a;
                                n8 = n16 + 1;
                                object[n16] = n7;
                                this.b = n8;
                                return;
                            }
                            this.d(n16, n10);
                            n4 = ((String)object).charAt(n8);
                            byArray = oe3_2.b;
                            n3 = byArray.length;
                            if (n4 >= n3) break block7;
                            n18 = byArray[n4];
                            if (n18 != 0) break block8;
                            object2 = this.a;
                            n18 = n16 + 1;
                            n4 = (char)n4;
                            object2[n16] = n4;
                            break block9;
                        }
                        if (n18 == n15) {
                            object2 = oe3_2.a[n4];
                            Intrinsics.checkNotNull(object2);
                            n4 = ((String)object2).length();
                            this.d(n16, n4);
                            char[] cArray2 = this.a;
                            n18 = ((String)object2).length();
                            ((String)object2).getChars(0, n18, cArray2, n16);
                            this.b = n15 = ((String)object2).length() + n16;
                            n16 = n15;
                            break block6;
                        } else {
                            object2 = this.a;
                            object2[n16] = 92;
                            n4 = n16 + 1;
                            n18 = (char)n18;
                            object2[n4] = n18;
                            this.b = n16 += 2;
                        }
                        break block6;
                    }
                    object2 = this.a;
                    n18 = n16 + 1;
                    object2[n16] = n4 = (char)n4;
                }
                n16 = n18;
            }
            ++n8;
        }
    }

    public final void c(String string2) {
        int n3;
        String string3 = "text";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n4 = string2.length();
        if (n4 == 0) {
            return;
        }
        int n7 = this.b;
        this.d(n7, n4);
        char[] cArray = this.a;
        int n8 = this.b;
        int n10 = string2.length();
        string2.getChars(0, n10, cArray, n8);
        this.b = n3 = this.b + n4;
    }

    public final void d(int n3, int n4) {
        char[] cArray = this.a;
        int n7 = cArray.length;
        if (n7 <= (n4 += n3)) {
            if (n4 < (n3 *= 2)) {
                n4 = n3;
            }
            char[] cArray2 = Arrays.copyOf(cArray, n4);
            String string2 = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(cArray2, string2);
            this.a = cArray2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        cs_2 cs_22 = cs_2.c;
        Object object = this.a;
        cs_22.getClass();
        Intrinsics.checkNotNullParameter(object, "array");
        Object object2 = "array";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        synchronized (cs_22) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n3 = cs_22.b;
                        int n4 = ((char[])object).length + n3;
                        int n7 = lp_2.a;
                        if (n4 >= n7) break block3;
                        n4 = ((char[])object).length;
                        cs_22.b = n3 += n4;
                        object2 = cs_22.a;
                        ((fp_2)object2).addLast(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    public final String toString() {
        char[] cArray = this.a;
        int n3 = this.b;
        String string2 = new String(cArray, 0, n3);
        return string2;
    }

    public final void writeLong(long l2) {
        String string2 = String.valueOf(l2);
        this.c(string2);
    }
}

