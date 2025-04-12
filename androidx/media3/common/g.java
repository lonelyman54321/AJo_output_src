/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package androidx.media3.common;

import android.util.Pair;
import androidx.media3.common.g$a;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;

public abstract class g {
    public static final g$a a;

    static {
        g$a g$a;
        a = g$a = new g();
        gz3.D(0);
        gz3.D(1);
        gz3.D(2);
    }

    /*
     * WARNING - void declaration
     */
    public int a(boolean bl2) {
        void var1_5;
        boolean bl3 = this.q();
        if (bl3) {
            int n3 = -1;
        } else {
            boolean bl4 = false;
        }
        return (int)var1_5;
    }

    public abstract int b(Object var1);

    /*
     * WARNING - void declaration
     */
    public int c(boolean bl2) {
        void var1_5;
        boolean bl3 = this.q();
        if (bl3) {
            int n3 = -1;
        } else {
            int n4 = this.p() + -1;
        }
        return (int)var1_5;
    }

    public final int d(int n3, g$b g$b, g$c g$c, int n4, boolean bl2) {
        g$b = this.g(n3, g$b, false);
        int n7 = g$b.c;
        long l2 = 0L;
        g$c g$c2 = this.n(n7, g$c, l2);
        int n8 = g$c2.o;
        if (n8 == n3) {
            n3 = this.e(n7, n4, bl2);
            if (n3 == (n7 = -1)) {
                return n7;
            }
            return this.n((int)n3, (g$c)g$c, (long)l2).n;
        }
        return n3 + 1;
    }

    public int e(int n3, int n4, boolean bl2) {
        int n7 = 1;
        if (n4 != 0) {
            if (n4 != n7) {
                int n8 = 2;
                if (n4 == n8) {
                    n4 = this.c(bl2);
                    n3 = n3 == n4 ? this.a(bl2) : (n3 += n7);
                    return n3;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
            return n3;
        }
        n4 = this.c(bl2);
        n3 = n3 == n4 ? -1 : (n3 += n7);
        return n3;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof g;
        if (n4 == 0) {
            return false;
        }
        n4 = ((g)(object = (g)object)).p();
        if (n4 == (n3 = this.p()) && (n4 = ((g)object).i()) == (n3 = this.i())) {
            int n7;
            int n8;
            g$c g$c = new g$c();
            g$b g$b = new g$b();
            Object object2 = new g$c();
            g$b g$b2 = new g$b();
            g$b g$b3 = null;
            for (int i3 = 0; i3 < (n8 = this.p()); ++i3) {
                g$c g$c2;
                long l2 = 0L;
                g$c g$c3 = this.n(i3, g$c, l2);
                n8 = (int)(g$c3.equals(g$c2 = ((g)object).n(i3, (g$c)object2, l2)) ? 1 : 0);
                if (n8 != 0) continue;
                return false;
            }
            g$c = null;
            for (n4 = 0; n4 < (n7 = this.i()); ++n4) {
                object2 = this.g(n4, g$b, bl2);
                n7 = (int)(((g$b)object2).equals(g$b3 = ((g)object).g(n4, g$b2, bl2)) ? 1 : 0);
                if (n7 != 0) continue;
                return false;
            }
            n4 = this.a(bl2);
            if (n4 != (n3 = ((g)object).a(bl2))) {
                return false;
            }
            n3 = this.c(bl2);
            if (n3 != (n7 = ((g)object).c(bl2))) {
                return false;
            }
            while (n4 != n3) {
                n7 = this.e(n4, 0, bl2);
                if (n7 != (n4 = ((g)object).e(n4, 0, bl2))) {
                    return false;
                }
                n4 = n7;
            }
            return bl2;
        }
        return false;
    }

    public final g$b f(int n3, g$b g$b) {
        return this.g(n3, g$b, false);
    }

    public abstract g$b g(int var1, g$b var2, boolean var3);

    public g$b h(Object object, g$b g$b) {
        int n3 = this.b(object);
        return this.g(n3, g$b, true);
    }

    public final int hashCode() {
        int n3;
        int n4;
        g$c g$c = new g$c();
        g$b g$b = new g$b();
        int n7 = this.p() + 217;
        g$b g$b2 = null;
        for (n4 = 0; n4 < (n3 = this.p()); ++n4) {
            n7 *= 31;
            long l2 = 0L;
            g$c g$c2 = this.n(n4, g$c, l2);
            n3 = g$c2.hashCode();
            n7 += n3;
        }
        int n8 = this.i() + (n7 *= 31);
        n7 = 0;
        while (true) {
            n4 = this.i();
            n3 = 1;
            if (n7 >= n4) break;
            n8 *= 31;
            g$b2 = this.g(n7, g$b, n3 != 0);
            n4 = g$b2.hashCode();
            n8 += n4;
            ++n7;
        }
        int n10 = this.a(n3 != 0);
        while (n10 != (n7 = -1)) {
            n8 = n8 * 31 + n10;
            n10 = this.e(n10, 0, n3 != 0);
        }
        return n8;
    }

    public abstract int i();

    public final Pair j(g$c g$c, g$b g$b, int n3, long l2) {
        g$c = this.k(g$c, g$b, n3, l2, 0L);
        g$c.getClass();
        return g$c;
    }

    public final Pair k(g$c object, g$b object2, int n3, long l2, long l3) {
        long l4;
        long l7;
        long l8;
        int n4;
        long l12;
        int n7 = this.p();
        ct3.d(n3, n7);
        this.n(n3, (g$c)object, l3);
        l3 = -9223372036854775807L;
        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n3 == 0 && (n3 = (int)((l12 = (l2 = ((g$c)object).l) - l3) == 0L ? 0 : (l12 < 0L ? -1 : 1))) == 0) {
            return null;
        }
        n3 = ((g$c)object).n;
        n7 = 0;
        this.g(n3, (g$b)object2, false);
        while (n3 < (n4 = ((g$c)object).o) && (l8 = (l7 = (l4 = ((g$b)object2).e) - l2) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            n4 = n3 + 1;
            g$b g$b = this.g(n4, (g$b)object2, false);
            long l14 = g$b.e;
            long l15 = l14 - l2;
            Object object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object3 > 0) break;
            n3 = n4;
        }
        this.g(n3, (g$b)object2, true);
        long l16 = ((g$b)object2).e;
        l2 -= l16;
        l16 = ((g$b)object2).d;
        long l17 = l16 == l3 ? 0 : (l16 < l3 ? -1 : 1);
        if (l17 != false) {
            l3 = 1L;
            l2 = Math.min(l2, l16 -= l3);
        }
        long l18 = Math.max(0L, l2);
        object = ((g$b)object2).b;
        object.getClass();
        object2 = l18;
        return Pair.create((Object)object, (Object)object2);
    }

    public int l(int n3, int n4, boolean bl2) {
        int n7 = 1;
        if (n4 != 0) {
            if (n4 != n7) {
                int n8 = 2;
                if (n4 == n8) {
                    n4 = this.a(bl2);
                    n3 = n3 == n4 ? this.c(bl2) : (n3 -= n7);
                    return n3;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
            return n3;
        }
        n4 = this.a(bl2);
        n3 = n3 == n4 ? -1 : (n3 -= n7);
        return n3;
    }

    public abstract Object m(int var1);

    public abstract g$c n(int var1, g$c var2, long var3);

    public final void o(int n3, g$c g$c) {
        this.n(n3, g$c, 0L);
    }

    public abstract int p();

    public final boolean q() {
        int n3 = this.p();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }
}

