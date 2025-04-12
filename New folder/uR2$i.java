/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public class uR2$i {
    public final String a;
    public int b = 0;
    public final int c;
    public final X52 d;

    public uR2$i(String string2) {
        int n3;
        X52 x52;
        this.c = 0;
        this.d = x52;
        this.a = string2 = string2.trim();
        this.c = n3 = string2.length();
    }

    public static boolean g(int n3) {
        int n4 = 32;
        n3 = n3 != n4 && n3 != (n4 = 10) && n3 != (n4 = 13) && n3 != (n4 = 9) ? 0 : 1;
        return n3 != 0;
    }

    public final int a() {
        int n3 = this.b;
        int n4 = -1;
        int n7 = this.c;
        if (n3 == n7) {
            return n4;
        }
        this.b = ++n3;
        if (n3 < n7) {
            return this.a.charAt(n3);
        }
        return n4;
    }

    public final Boolean b(Object object) {
        int n3 = 0;
        Boolean bl2 = null;
        if (object == null) {
            return null;
        }
        this.p();
        int n4 = this.b;
        int n7 = this.c;
        if (n4 != n7) {
            String string2 = this.a;
            n4 = string2.charAt(n4);
            n7 = 48;
            int n8 = 49;
            if (n4 == n7 || n4 == n8) {
                n3 = this.b;
                n7 = 1;
                this.b = n3 += n7;
                if (n4 != n8) {
                    n7 = 0;
                    string2 = null;
                }
                bl2 = n7 != 0;
            }
        }
        return bl2;
    }

    public final float c(float f5) {
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            return 0.0f / 0.0f;
        }
        this.p();
        return this.i();
    }

    public final boolean d(char c2) {
        String string2;
        int n3 = this.b;
        int n4 = this.c;
        int n7 = 1;
        c2 = n3 < n4 && (n3 = (int)(string2 = this.a).charAt(n3)) == c2 ? (char)'\u0001' : '\u0000';
        if (c2 != '\u0000') {
            this.b = n3 = this.b + n7;
        }
        return c2 != 0;
    }

    public final boolean e(String string2) {
        int n3;
        String string3;
        String string4;
        boolean bl2;
        int n4 = this.b;
        int n7 = string2.length();
        int n8 = this.c - n7;
        if (n4 <= n8 && (bl2 = (string4 = (string3 = this.a).substring(n4, n3 = n4 + n7)).equals(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        if (bl2) {
            this.b = n4 = this.b + n7;
        }
        return bl2;
    }

    public final boolean f() {
        int n3 = this.b;
        int n4 = this.c;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Integer h() {
        int n3 = this.b;
        int n4 = this.c;
        if (n3 == n4) {
            return null;
        }
        this.b = n4 = n3 + 1;
        return this.a.charAt(n3);
    }

    public final float i() {
        int n3 = this.b;
        int n4 = this.c;
        X52 x52 = this.d;
        String string2 = this.a;
        float f5 = x52.a(n3, n4, string2);
        if ((n4 = (int)(Float.isNaN(f5) ? 1 : 0)) == 0) {
            this.b = n4 = x52.a;
        }
        return f5;
    }

    public final rR2$p j() {
        float f5 = this.i();
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            return null;
        }
        Object object = this.n();
        if (object == null) {
            rR2$d0 rR2$d0 = rR2$d0.px;
            object = new rR2$p(f5, rR2$d0);
            return object;
        }
        rR2$p rR2$p = new rR2$p(f5, (rR2$d0)((Object)object));
        return rR2$p;
    }

    public final String k() {
        int n3;
        int n4;
        int n7 = this.f();
        int n8 = 0;
        if (n7 != 0) {
            return null;
        }
        String string2 = this.a;
        n7 = this.b;
        int n10 = string2.charAt(n7);
        if (n10 != (n4 = 39) && n10 != (n4 = 34)) {
            return null;
        }
        n4 = this.a();
        while (n4 != (n3 = -1) && n4 != n10) {
            n4 = this.a();
        }
        if (n4 == n3) {
            this.b = n7;
            return null;
        }
        n8 = this.b;
        this.b = n10 = n8 + 1;
        return string2.substring(++n7, n8);
    }

    public final String l() {
        return this.m(false, ' ');
    }

    /*
     * WARNING - void declaration
     */
    public final String m(boolean bl2, char c2) {
        void var2_3;
        int n3;
        int n4 = this.f();
        int n7 = 0;
        if (n4 != 0) {
            return null;
        }
        n4 = this.b;
        String string2 = this.a;
        n4 = string2.charAt(n4);
        if (!bl2 && (n3 = uR2$i.g(n4)) != 0 || n4 == var2_3) {
            return null;
        }
        n4 = this.b;
        n7 = this.a();
        while (n7 != (n3 = -1) && n7 != var2_3 && (bl2 || (n7 = (int)(uR2$i.g(n7) ? 1 : 0)) == 0)) {
            n7 = this.a();
        }
        int n8 = this.b;
        return string2.substring(n4, n8);
    }

    public final rR2$d0 n() {
        Object object;
        int n3;
        int n4 = this.f();
        if (n4 != 0) {
            return null;
        }
        n4 = this.b;
        Object object2 = this.a;
        if ((n4 = (int)((String)object2).charAt(n4)) == (n3 = 37)) {
            this.b = n4 = this.b + 1;
            return rR2$d0.percent;
        }
        n4 = this.b;
        n3 = this.c + -2;
        if (n4 > n3) {
            return null;
        }
        n3 = n4 + 2;
        try {
            object = ((String)object2).substring(n4, n3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
        object2 = Locale.US;
        object = object.toLowerCase((Locale)object2);
        object = rR2$d0.valueOf(object);
        int n7 = this.b + 2;
        this.b = n7;
        return object;
    }

    public final float o() {
        this.p();
        int n3 = this.b;
        int n4 = this.c;
        X52 x52 = this.d;
        String string2 = this.a;
        float f5 = x52.a(n3, n4, string2);
        n4 = (int)(Float.isNaN(f5) ? 1 : 0);
        if (n4 == 0) {
            this.b = n4 = x52.a;
        }
        return f5;
    }

    public final boolean p() {
        this.q();
        int n3 = this.b;
        int n4 = this.c;
        if (n3 == n4) {
            return false;
        }
        String string2 = this.a;
        if ((n3 = (int)string2.charAt(n3)) != (n4 = 44)) {
            return false;
        }
        n3 = this.b;
        n4 = 1;
        this.b = n3 += n4;
        this.q();
        return n4 != 0;
    }

    public final void q() {
        String string2;
        int n3;
        int n4;
        while ((n4 = this.b) < (n3 = this.c) && (n4 = (int)(uR2$i.g((string2 = this.a).charAt(n4)) ? 1 : 0)) != 0) {
            this.b = n4 = this.b + 1;
        }
    }
}

