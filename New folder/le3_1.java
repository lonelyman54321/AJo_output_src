/*
 * Decompiled with CFR 0.152.
 */
import kotlin.text.StringsKt;

/*
 * Renamed from le3
 */
public final class le3_1
extends je3_1 {
    public final boolean c() {
        String string2;
        int n3;
        int n4 = this.z();
        if (n4 < (n3 = (string2 = this.e).length()) && n4 != (n3 = -1)) {
            return q0_0.u(string2.charAt(n4));
        }
        return false;
    }

    public final byte f() {
        String string2;
        int n3;
        int n4 = this.z();
        if (n4 < (n3 = (string2 = this.e).length()) && n4 != (n3 = -1)) {
            this.a = n3 = n4 + 1;
            return r0_0.a(string2.charAt(n4));
        }
        return 10;
    }

    public final void h(char c2) {
        int n3 = this.z();
        String string2 = this.e;
        int n4 = string2.length();
        int n7 = -1;
        if (n3 < n4 && n3 != n7) {
            char c3 = string2.charAt(n3);
            this.a = ++n3;
            if (c3 == c2) {
                return;
            }
            this.D(c2);
            throw null;
        }
        this.a = n7;
        this.D(c2);
        throw null;
    }

    public final byte w() {
        String string2;
        int n3;
        int n4 = this.z();
        if (n4 < (n3 = (string2 = this.e).length()) && n4 != (n3 = -1)) {
            this.a = n4;
            return r0_0.a(string2.charAt(n4));
        }
        return 10;
    }

    public final int z() {
        String string2;
        char c2;
        int n3 = this.a;
        int n4 = -1;
        if (n3 == n4) {
            return n3;
        }
        while (n3 < (c2 = (string2 = this.e).length())) {
            char c3;
            char c5;
            c2 = string2.charAt(n3);
            if (c2 != (c5 = ' ') && c2 != (c5 = '\n') && c2 != (c3 = '\r') && c2 != (c3 = '\t')) {
                int n7;
                c3 = '/';
                if (c2 != c3 || (c2 = n3 + 1) >= (n7 = string2.length())) break;
                c2 = string2.charAt(c2);
                n7 = 42;
                int n8 = 4;
                if (c2 != n7) {
                    if (c2 != c3) break;
                    n3 += 2;
                    if ((n3 = StringsKt.N(string2, c5, n3, false, n8)) == n4) {
                        n3 = string2.length();
                        continue;
                    }
                } else {
                    n3 += 2;
                    String string3 = "*/";
                    if ((n3 = StringsKt.O(string2, string3, n3, false, n8)) != n4) {
                        n3 += 2;
                        continue;
                    }
                    this.a = n3 = string2.length();
                    q0_0.r(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                    throw null;
                }
            }
            ++n3;
        }
        this.a = n3;
        return n3;
    }
}

