/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from N1
 */
public final class n1_0
extends J1 {
    public static n1_0 c;

    public final int[] a(int n3) {
        char c2;
        String string2;
        char c3;
        String string3 = this.c();
        int n4 = string3.length();
        int n7 = 0;
        if (n4 <= 0) {
            return null;
        }
        if (n3 >= n4) {
            return null;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        while (n3 < n4 && (c3 = (string2 = this.c()).charAt(n3)) == (c2 = '\n') && (c3 = (char)(this.f(n3) ? 1 : 0)) == '\u0000') {
            ++n3;
        }
        if (n3 >= n4) {
            return null;
        }
        for (n7 = n3 + 1; n7 < n4 && (c3 = (char)(this.e(n7) ? 1 : 0)) == '\u0000'; ++n7) {
        }
        return this.b(n3, n7);
    }

    public final int[] d(int n3) {
        String string2 = this.c();
        int n4 = string2.length();
        boolean bl2 = false;
        if (n4 <= 0) {
            return null;
        }
        if (n3 <= 0) {
            return null;
        }
        if (n3 > n4) {
            n3 = n4;
        }
        while (n3 > 0) {
            string2 = this.c();
            int n7 = n3 + -1;
            n4 = string2.charAt(n7);
            if (n4 != (n7 = 10) || (n4 = (int)(this.e(n3) ? 1 : 0)) != 0) break;
            n3 += -1;
        }
        if (n3 <= 0) {
            return null;
        }
        for (n4 = n3 + -1; n4 > 0 && !(bl2 = this.f(n4)); n4 += -1) {
        }
        return this.b(n4, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e(int n3) {
        if (n3 <= 0) return 0 != 0;
        String string2 = this.c();
        int n4 = n3 + -1;
        int n7 = string2.charAt(n4);
        if (n7 == (n4 = 10)) return 0 != 0;
        string2 = this.c();
        n7 = string2.length();
        if (n3 == n7) return 1 != 0;
        string2 = this.c();
        n3 = string2.charAt(n3);
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }

    public final boolean f(int n3) {
        int n4;
        block3: {
            String string2;
            block2: {
                int n7;
                string2 = this.c();
                n4 = string2.charAt(n3);
                if (n4 == (n7 = 10)) break block2;
                n4 = 1;
                if (n3 == 0) break block3;
                String string3 = this.c();
                n3 -= n4;
                if ((n3 = (int)string3.charAt(n3)) == n7) break block3;
            }
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }
}

