/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.s;

public abstract class H0
extends g {
    public static final /* synthetic */ int e;
    public final int b;
    public final s c;
    public final boolean d;

    /*
     * WARNING - void declaration
     */
    public H0(boolean bl2, s s7) {
        int n3;
        void var2_3;
        this.d = bl2;
        this.c = var2_3;
        this.b = n3 = var2_3.getLength();
    }

    public final int a(boolean bl2) {
        Object object;
        int n3 = this.b;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        n3 = (int)(this.d ? 1 : 0);
        int n7 = 0;
        if (n3 != 0) {
            bl2 = false;
        }
        if (bl2) {
            object = this.c;
            n7 = object.f();
        }
        while ((n3 = (int)(((g)(object = this.z(n7))).q() ? 1 : 0)) != 0) {
            if ((n7 = this.x(n7, bl2)) != n4) continue;
            return n4;
        }
        n3 = this.w(n7);
        return this.z(n7).a(bl2) + n3;
    }

    public final int b(Object object) {
        int n3 = object instanceof Pair;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Pair)object;
        Object object2 = ((Pair)object).first;
        object = ((Pair)object).second;
        n3 = this.r(object2);
        if (n3 == n4) {
            return n4;
        }
        g g3 = this.z(n3);
        int n7 = g3.b(object);
        if (n7 != n4) {
            n3 = this.v(n3);
            n4 = n3 + n7;
        }
        return n4;
    }

    public final int c(boolean bl2) {
        g g3;
        int n3 = -1;
        int n4 = this.b;
        if (n4 == 0) {
            return n3;
        }
        boolean bl3 = this.d;
        if (bl3) {
            bl2 = false;
        }
        if (bl2) {
            s s7 = this.c;
            n4 = s7.d();
        } else {
            n4 += -1;
        }
        while (bl3 = (g3 = this.z(n4)).q()) {
            if ((n4 = this.y(n4, bl2)) != n3) continue;
            return n3;
        }
        n3 = this.w(n4);
        return this.z(n4).c(bl2) + n3;
    }

    public final int e(int n3, int n4, boolean n7) {
        g g3;
        int n8 = this.d;
        int n10 = 0;
        int n14 = 2;
        if (n8 != 0) {
            n7 = 1;
            if (n4 == n7) {
                n4 = 2;
            }
            n7 = 0;
        }
        n8 = this.t(n3);
        int n15 = this.w(n8);
        g g5 = this.z(n8);
        n3 -= n15;
        if (n4 != n14) {
            n10 = n4;
        }
        n3 = g5.e(n3, n10, n7 != 0);
        n10 = -1;
        if (n3 != n10) {
            return n15 + n3;
        }
        n3 = this.x(n8, n7 != 0);
        while (n3 != n10 && (n8 = (int)((g3 = this.z(n3)).q() ? 1 : 0)) != 0) {
            n3 = this.x(n3, n7 != 0);
        }
        if (n3 != n10) {
            n4 = this.w(n3);
            return this.z(n3).a(n7 != 0) + n4;
        }
        if (n4 == n14) {
            return this.a(n7 != 0);
        }
        return n10;
    }

    public final g$b g(int n3, g$b g$b, boolean bl2) {
        int n4 = this.s(n3);
        int n7 = this.w(n4);
        int n8 = this.v(n4);
        g g3 = this.z(n4);
        g3.g(n3 -= n8, g$b, bl2);
        g$b.c = n3 = g$b.c + n7;
        if (bl2) {
            Object object = this.u(n4);
            Object object2 = g$b.b;
            object2.getClass();
            g$b.b = object = Pair.create((Object)object, (Object)object2);
        }
        return g$b;
    }

    public final g$b h(Object object, g$b g$b) {
        int n3;
        Object object2 = object;
        object2 = (Pair)object;
        Object object3 = ((Pair)object2).first;
        object2 = ((Pair)object2).second;
        int n4 = this.r(object3);
        int n7 = this.w(n4);
        this.z(n4).h(object2, g$b);
        g$b.c = n3 = g$b.c + n7;
        g$b.b = object;
        return g$b;
    }

    public final int l(int n3, int n4, boolean n7) {
        g g3;
        int n8 = this.d;
        int n10 = 0;
        int n14 = 2;
        if (n8 != 0) {
            n7 = 1;
            if (n4 == n7) {
                n4 = 2;
            }
            n7 = 0;
        }
        n8 = this.t(n3);
        int n15 = this.w(n8);
        g g5 = this.z(n8);
        n3 -= n15;
        if (n4 != n14) {
            n10 = n4;
        }
        n3 = g5.l(n3, n10, n7 != 0);
        n10 = -1;
        if (n3 != n10) {
            return n15 + n3;
        }
        n3 = this.y(n8, n7 != 0);
        while (n3 != n10 && (n8 = (int)((g3 = this.z(n3)).q() ? 1 : 0)) != 0) {
            n3 = this.y(n3, n7 != 0);
        }
        if (n3 != n10) {
            n4 = this.w(n3);
            return this.z(n3).c(n7 != 0) + n4;
        }
        if (n4 == n14) {
            return this.c(n7 != 0);
        }
        return n10;
    }

    public final Object m(int n3) {
        int n4 = this.s(n3);
        int n7 = this.v(n4);
        g g3 = this.z(n4);
        Object object = g3.m(n3 -= n7);
        return Pair.create((Object)this.u(n4), (Object)object);
    }

    public final g$c n(int n3, g$c g$c, long l2) {
        int n4 = this.t(n3);
        int n7 = this.w(n4);
        int n8 = this.v(n4);
        g g3 = this.z(n4);
        g3.n(n3 -= n7, g$c, l2);
        Object object = this.u(n4);
        Object object2 = g$c.q;
        Object object3 = g$c.a;
        boolean bl2 = object2.equals(object3);
        if (!bl2) {
            object2 = g$c.a;
            object = Pair.create((Object)object, (Object)object2);
        }
        g$c.a = object;
        g$c.n = n3 = g$c.n + n8;
        g$c.o = n3 = g$c.o + n8;
        return g$c;
    }

    public abstract int r(Object var1);

    public abstract int s(int var1);

    public abstract int t(int var1);

    public abstract Object u(int var1);

    public abstract int v(int var1);

    public abstract int w(int var1);

    public final int x(int n3, boolean n4) {
        if (n4 != 0) {
            s s7 = this.c;
            n3 = s7.c(n3);
        } else {
            n4 = this.b + -1;
            n3 = n3 < n4 ? ++n3 : -1;
        }
        return n3;
    }

    public final int y(int n3, boolean bl2) {
        if (bl2) {
            s s7 = this.c;
            n3 = s7.b(n3);
        } else {
            n3 = n3 > 0 ? (n3 += -1) : -1;
        }
        return n3;
    }

    public abstract g z(int var1);
}

