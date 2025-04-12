/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Map;

public class Fp3 {
    public static final Fp3 C;
    public final ImmutableMap A;
    public final ImmutableSet B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final ImmutableList l;
    public final int m;
    public final ImmutableList n;
    public final int o;
    public final int p;
    public final int q;
    public final ImmutableList r;
    public final Fp3$a s;
    public final ImmutableList t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        Fp3 fp3;
        Fp3$b fp3$b = new Fp3$b();
        C = fp3 = new Fp3(fp3$b);
        f4.b(1, 2, 3, 4, 5);
        f4.b(6, 7, 8, 9, 10);
        f4.b(11, 12, 13, 14, 15);
        f4.b(16, 17, 18, 19, 20);
        f4.b(21, 22, 23, 24, 25);
        f4.b(26, 27, 28, 29, 30);
        gz3.D(31);
    }

    public Fp3(Fp3$b object) {
        int n3;
        this.a = n3 = ((Fp3$b)object).a;
        this.b = n3 = ((Fp3$b)object).b;
        this.c = n3 = ((Fp3$b)object).c;
        this.d = n3 = ((Fp3$b)object).d;
        this.e = n3 = ((Fp3$b)object).e;
        this.f = n3 = ((Fp3$b)object).f;
        this.g = n3 = ((Fp3$b)object).g;
        this.h = n3 = ((Fp3$b)object).h;
        this.i = n3 = ((Fp3$b)object).i;
        this.j = n3 = ((Fp3$b)object).j;
        n3 = ((Fp3$b)object).k ? 1 : 0;
        this.k = n3;
        Object object2 = ((Fp3$b)object).l;
        this.l = object2;
        this.m = n3 = ((Fp3$b)object).m;
        object2 = ((Fp3$b)object).n;
        this.n = object2;
        this.o = n3 = ((Fp3$b)object).o;
        this.p = n3 = ((Fp3$b)object).p;
        this.q = n3 = ((Fp3$b)object).q;
        object2 = ((Fp3$b)object).r;
        this.r = object2;
        this.s = object2 = ((Fp3$b)object).s;
        this.t = object2 = ((Fp3$b)object).t;
        this.u = n3 = ((Fp3$b)object).u;
        this.v = n3 = ((Fp3$b)object).v;
        n3 = ((Fp3$b)object).w ? 1 : 0;
        this.w = n3;
        n3 = ((Fp3$b)object).x ? 1 : 0;
        this.x = n3;
        n3 = ((Fp3$b)object).y ? 1 : 0;
        this.y = n3;
        n3 = ((Fp3$b)object).z ? 1 : 0;
        this.z = n3;
        this.A = object2 = ImmutableMap.copyOf((Map)((Fp3$b)object).A);
        this.B = object = ImmutableSet.copyOf((Collection)((Fp3$b)object).B);
    }

    public Fp3$b a() {
        Fp3$b fp3$b = new Object();
        fp3$b.c(this);
        return fp3$b;
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (Fp3)object;
            int n3 = this.a;
            int n4 = ((Fp3)object).a;
            if (n3 != n4 || (n3 = this.b) != (n4 = ((Fp3)object).b) || (n3 = this.c) != (n4 = ((Fp3)object).c) || (n3 = this.d) != (n4 = ((Fp3)object).d) || (n3 = this.e) != (n4 = ((Fp3)object).e) || (n3 = this.f) != (n4 = ((Fp3)object).f) || (n3 = this.g) != (n4 = ((Fp3)object).g) || (n3 = this.h) != (n4 = ((Fp3)object).h) || (n3 = (int)(this.k ? 1 : 0)) != (n4 = (int)(((Fp3)object).k ? 1 : 0)) || (n3 = this.i) != (n4 = ((Fp3)object).i) || (n3 = this.j) != (n4 = ((Fp3)object).j) || (n3 = (int)(((ImmutableList)(object3 = this.l)).equals(object2 = ((Fp3)object).l) ? 1 : 0)) == 0 || (n3 = this.m) != (n4 = ((Fp3)object).m) || (n3 = (int)(((ImmutableList)(object3 = this.n)).equals(object2 = ((Fp3)object).n) ? 1 : 0)) == 0 || (n3 = this.o) != (n4 = ((Fp3)object).o) || (n3 = this.p) != (n4 = ((Fp3)object).p) || (n3 = this.q) != (n4 = ((Fp3)object).q) || (n3 = (int)(((ImmutableList)(object3 = this.r)).equals(object2 = ((Fp3)object).r) ? 1 : 0)) == 0 || (n3 = (int)(((Fp3$a)(object3 = this.s)).equals(object2 = ((Fp3)object).s) ? 1 : 0)) == 0 || (n3 = (int)(((ImmutableList)(object3 = this.t)).equals(object2 = ((Fp3)object).t) ? 1 : 0)) == 0 || (n3 = this.u) != (n4 = ((Fp3)object).u) || (n3 = this.v) != (n4 = ((Fp3)object).v) || (n3 = (int)(this.w ? 1 : 0)) != (n4 = (int)(((Fp3)object).w ? 1 : 0)) || (n3 = (int)(this.x ? 1 : 0)) != (n4 = (int)(((Fp3)object).x ? 1 : 0)) || (n3 = (int)(this.y ? 1 : 0)) != (n4 = (int)(((Fp3)object).y ? 1 : 0)) || (n3 = (int)(this.z ? 1 : 0)) != (n4 = (int)(((Fp3)object).z ? 1 : 0)) || (n3 = (int)(((ImmutableMap)(object3 = this.A)).equals(object2 = ((Fp3)object).A) ? 1 : 0)) == 0 || !(bl3 = ((ImmutableSet)(object3 = this.B)).equals(object = ((Fp3)object).B))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n3 = (this.a + 31) * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        n3 = (n3 + n4) * 31;
        n4 = this.e;
        n3 = (n3 + n4) * 31;
        n4 = this.f;
        n3 = (n3 + n4) * 31;
        n4 = this.g;
        n3 = (n3 + n4) * 31;
        n4 = this.h;
        n3 = (n3 + n4) * 31;
        n4 = this.k ? 1 : 0;
        n3 = (n3 + n4) * 31;
        n4 = this.i;
        n3 = (n3 + n4) * 31;
        n4 = this.j;
        n3 = (n3 + n4) * 31;
        n4 = (this.l.hashCode() + n3) * 31;
        n3 = this.m;
        n4 = (n4 + n3) * 31;
        n3 = (this.n.hashCode() + n4) * 31;
        n4 = this.o;
        n3 = (n3 + n4) * 31;
        n4 = this.p;
        n3 = (n3 + n4) * 31;
        n4 = this.q;
        n3 = (n3 + n4) * 31;
        n4 = (this.r.hashCode() + n3) * 31;
        this.s.getClass();
        n4 = (n4 + 29791) * 31;
        n3 = (this.t.hashCode() + n4) * 31;
        n4 = this.u;
        n3 = (n3 + n4) * 31;
        n4 = this.v;
        n3 = (n3 + n4) * 31;
        n4 = this.w ? 1 : 0;
        n3 = (n3 + n4) * 31;
        n4 = this.x ? 1 : 0;
        n3 = (n3 + n4) * 31;
        n4 = this.y ? 1 : 0;
        n3 = (n3 + n4) * 31;
        n4 = this.z ? 1 : 0;
        n3 = (n3 + n4) * 31;
        n4 = (this.A.hashCode() + n3) * 31;
        return this.B.hashCode() + n4;
    }
}

