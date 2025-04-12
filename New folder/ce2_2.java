/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from CE2
 */
public class ce2_2
extends q0_0 {
    public final sk1_2 e;
    public int f;
    public final dp_1 g;

    public ce2_2(sk1_2 object, char[] cArray) {
        Intrinsics.checkNotNullParameter(object, "reader");
        Intrinsics.checkNotNullParameter(cArray, "buffer");
        this.e = object;
        this.f = 128;
        this.g = object = new dp_1(cArray);
        this.E(0);
    }

    public final String A(int n3, int n4) {
        dp_1 dp_12 = this.g;
        int n7 = dp_12.b;
        n4 = Math.min(n4, n7);
        return kotlin.text.b.g(dp_12.a, n3, n4);
    }

    public final void E(int n3) {
        int n4;
        int n7;
        dp_1 dp_12 = this.g;
        char[] cArray = dp_12.a;
        if (n3 != 0) {
            n7 = this.a;
            n4 = n7 + n3;
            rp_1.h(cArray, cArray, 0, n7, n4);
        }
        n7 = dp_12.b;
        while (n3 != n7) {
            sk1_2 sk1_22 = this.e;
            int n8 = n7 - n3;
            n4 = sk1_22.a(cArray, n3, n8);
            if (n4 == (n8 = -1)) {
                cArray = dp_12.a;
                int n10 = cArray.length;
                dp_12.b = n3 = Math.min(n10, n3);
                this.f = n8;
                break;
            }
            n3 += n4;
        }
        this.a = 0;
    }

    public final void b(int n3, int n4) {
        char[] cArray = this.g.a;
        StringBuilder stringBuilder = this.d;
        stringBuilder.append(cArray, n3, n4 -= n3);
        Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
    }

    public boolean c() {
        char c2;
        char c3;
        this.o();
        int c32 = this.a;
        while ((c3 = this.y(c3)) != (c2 = '\uffffffff')) {
            char[] cArray = this.g.a;
            c2 = cArray[c3];
            char c5 = ' ';
            if (c2 != c5 && c2 != (c5 = '\n') && c2 != (c5 = '\r') && c2 != (c5 = '\t')) {
                this.a = c3;
                return q0_0.u(c2);
            }
            ++c3;
        }
        this.a = c3;
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public final String e() {
        int n3;
        int n4;
        char[] cArray;
        int n7;
        dp_1 dp_12;
        int c5;
        int c6;
        block7: {
            c6 = 34;
            this.h((char)c6);
            c5 = this.a;
            dp_12 = this.g;
            n7 = dp_12.b;
            int n8 = c5;
            while (true) {
                void var5_10;
                cArray = dp_12.a;
                n4 = -1;
                if (var5_10 >= n7) break;
                int n10 = cArray[var5_10];
                if (n10 != c6) {
                    ++var5_10;
                    continue;
                }
                break block7;
                break;
            }
            n3 = -1;
        }
        if (n3 == n4) {
            c6 = this.y(c5);
            if (c6 == n4) {
                String string2;
                c6 = 1;
                String string3 = r0_0.d((byte)c6);
                int n14 = this.a;
                n7 = n14 + -1;
                int n15 = dp_12.b;
                if (n14 != n15 && n7 >= 0) {
                    char c2 = dp_12.a[n7];
                    string2 = String.valueOf(c2);
                } else {
                    string2 = "EOF";
                }
                string3 = uc0_0.a("Expected ", string3, ", but had '", string2, "' instead");
                q0_0.r(this, string3, n7, null, 4);
                throw null;
            }
            int n16 = this.a;
            return this.k(n16, c6, dp_12);
        }
        for (c6 = c5; c6 < n3; ++c6) {
            n7 = cArray[c6];
            int n17 = 92;
            if (n7 != n17) continue;
            int n18 = this.a;
            return this.k(n18, c6, dp_12);
        }
        this.a = c6 = n3 + 1;
        c6 = dp_12.b;
        c6 = Math.min(n3, c6);
        return kotlin.text.b.g(cArray, c5, c6);
    }

    public byte f() {
        byte by2;
        byte by4;
        this.o();
        int by42 = this.a;
        while ((by4 = this.y(by4)) != (by2 = -1)) {
            byte by5;
            by2 = by4 + 1;
            char[] cArray = this.g.a;
            if ((by4 = (byte)r0_0.a(cArray[by4])) != (by5 = 3)) {
                this.a = by2;
                return by4;
            }
            by4 = by2;
        }
        this.a = by4;
        return 10;
    }

    public void h(char c2) {
        int n3;
        this.o();
        int n4 = this.a;
        while ((n4 = this.y(n4)) != (n3 = -1)) {
            n3 = n4 + 1;
            char[] cArray = this.g.a;
            int n7 = 32;
            if ((n4 = cArray[n4]) != n7 && n4 != (n7 = 10) && n4 != (n7 = 13) && n4 != (n7 = 9)) {
                this.a = n3;
                if (n4 == c2) {
                    return;
                }
                this.D(c2);
                throw null;
            }
            n4 = n3;
        }
        this.a = n4;
        this.D(c2);
        throw null;
    }

    public final void o() {
        int n3 = this.a;
        dp_1 dp_12 = this.g;
        int n4 = dp_12.b - n3;
        if (n4 > (n3 = this.f)) {
            return;
        }
        this.E(n4);
    }

    public final CharSequence t() {
        return this.g;
    }

    public final String v(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "keyToMatch");
        return null;
    }

    public final int y(int n3) {
        dp_1 dp_12 = this.g;
        int n4 = dp_12.b;
        if (n3 < n4) {
            return n3;
        }
        this.a = n3;
        this.o();
        n3 = this.a;
        if (n3 == 0 && (n3 = dp_12.length()) != 0) {
            return 0;
        }
        return -1;
    }

    public int z() {
        int n3;
        char[] cArray;
        int n4;
        int n7 = this.a;
        while ((n7 = this.y(n7)) != (n4 = -1) && ((n4 = (cArray = this.g.a)[n7]) == (n3 = 32) || n4 == (n3 = 10) || n4 == (n3 = 13) || n4 == (n3 = 9))) {
            ++n7;
        }
        this.a = n7;
        return n7;
    }
}

