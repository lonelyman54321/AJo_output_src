/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from je3
 */
public class je3_1
extends q0_0 {
    public final String e;

    public je3_1(String string2) {
        Intrinsics.checkNotNullParameter(string2, "source");
        this.e = string2;
    }

    public boolean c() {
        String string2;
        int n3;
        int n4 = this.a;
        int n7 = -1;
        if (n4 == n7) {
            return false;
        }
        while (n4 < (n3 = (string2 = this.e).length())) {
            n7 = string2.charAt(n4);
            if (n7 != (n3 = 32) && n7 != (n3 = 10) && n7 != (n3 = 13) && n7 != (n3 = 9)) {
                this.a = n4;
                return q0_0.u((char)n7);
            }
            ++n4;
        }
        this.a = n4;
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public final String e() {
        int n3;
        void var6_13;
        char c2 = '\"';
        this.h(c2);
        int n4 = this.a;
        String string2 = null;
        String string3 = this.e;
        int n7 = 4;
        int n8 = StringsKt.N(string3, c2, n4, false, n7);
        int n10 = -1;
        if (n8 == n10) {
            this.l();
            byte by2 = 1;
            String string4 = r0_0.d(by2);
            n4 = this.a;
            int n14 = string3.length();
            if (n4 != n14 && n4 >= 0) {
                char c3 = string3.charAt(n4);
                string2 = String.valueOf(c3);
            } else {
                string2 = "EOF";
            }
            string4 = uc0_0.a("Expected ", string4, ", but had '", string2, "' instead");
            q0_0.r(this, string4, n4, null, n7);
            throw null;
        }
        int n15 = n4;
        while (var6_13 < n8) {
            int n16;
            n7 = string3.charAt((int)var6_13);
            if (n7 == (n16 = 92)) {
                int n17 = this.a;
                return this.k(n17, (int)var6_13, string3);
            }
            ++var6_13;
        }
        this.a = n3 = n8 + 1;
        String string5 = string3.substring(n4, n8);
        Intrinsics.checkNotNullExpressionValue(string5, "substring(...)");
        return string5;
    }

    public byte f() {
        int n3;
        String string2;
        int n4;
        int c3 = this.a;
        while (true) {
            char c2;
            char c5;
            char c6 = '\uffffffff';
            n4 = 10;
            string2 = this.e;
            if (c5 == c6 || c5 >= (c6 = string2.length())) break;
            c6 = c5 + true;
            if ((c5 = string2.charAt(c5)) != (c2 = ' ') && c5 != n4 && c5 != (n4 = 13) && c5 != (n4 = 9)) {
                this.a = c6;
                return r0_0.a(c5);
            }
            c5 = c6;
        }
        this.a = n3 = string2.length();
        return (byte)n4;
    }

    public void h(char c2) {
        int n3 = this.a;
        int n4 = -1;
        if (n3 != n4) {
            String string2;
            int n7;
            while (n3 < (n7 = (string2 = this.e).length())) {
                int n8;
                n7 = n3 + 1;
                if ((n3 = (int)string2.charAt(n3)) != (n8 = 32) && n3 != (n8 = 10) && n3 != (n8 = 13) && n3 != (n8 = 9)) {
                    this.a = n7;
                    if (n3 == c2) {
                        return;
                    }
                    this.D(c2);
                    throw null;
                }
                n3 = n7;
            }
            this.a = n4;
            this.D(c2);
            throw null;
        }
        this.D(c2);
        throw null;
    }

    public final CharSequence t() {
        return this.e;
    }

    public final String v(String string2, boolean bl2) {
        int n3;
        block9: {
            byte by2;
            byte by4;
            block8: {
                block7: {
                    String string3 = "keyToMatch";
                    Intrinsics.checkNotNullParameter(string2, string3);
                    n3 = this.a;
                    by4 = this.f();
                    byte by5 = 6;
                    if (by4 == by5) break block7;
                    this.a = n3;
                    this.c = null;
                    return null;
                }
                String string4 = this.x(bl2);
                by2 = Intrinsics.areEqual(string4, string2);
                if (by2 != 0) break block8;
                this.a = n3;
                this.c = null;
                return null;
            }
            this.c = null;
            by2 = this.f();
            by4 = 5;
            if (by2 == by4) break block9;
            this.a = n3;
            this.c = null;
            return null;
        }
        try {
            string2 = this.x(bl2);
            return string2;
        }
        finally {
            this.a = n3;
            this.c = null;
        }
    }

    public final int y(int n3) {
        String string2 = this.e;
        int n4 = string2.length();
        if (n3 >= n4) {
            n3 = -1;
        }
        return n3;
    }

    public int z() {
        String string2;
        int n3;
        int n4 = this.a;
        int n7 = -1;
        if (n4 == n7) {
            return n4;
        }
        while (n4 < (n3 = (string2 = this.e).length()) && ((n7 = (int)string2.charAt(n4)) == (n3 = 32) || n7 == (n3 = 10) || n7 == (n3 = 13) || n7 == (n3 = 9))) {
            ++n4;
        }
        this.a = n4;
        return n4;
    }
}

