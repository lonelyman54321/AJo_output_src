/*
 * Decompiled with CFR 0.152.
 */
public abstract class Kx {
    public final Kx$a a;
    public final Kx$f b;
    public Kx$c c;
    public final int d;

    public Kx(Kx$d kx$d, Kx$f kx$f, long l2, long l3, long l4, long l7, long l8, int n3) {
        Kx$a kx$a;
        this.b = kx$f;
        this.d = n3;
        this.a = kx$a = new Kx$a(kx$d, l2, l3, l4, l7, l8);
    }

    public static int b(il0_0 il0_02, long l2, Pw2 pw2) {
        long l3 = il0_02.d;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 == false) {
            return 0;
        }
        pw2.a = l2;
        return 1;
    }

    public final int a(il0_0 il0_02, Pw2 pw2) {
        long l2;
        Pw2 pw22;
        Object object;
        block6: {
            Kx$f kx$f;
            Kx$f kx$f2;
            Kx kx = this;
            object = il0_02;
            pw22 = pw2;
            while (true) {
                long l3;
                long l4;
                Kx$c kx$c = kx.c;
                ct3.h(kx$c);
                long l7 = kx$c.f;
                long l8 = kx$c.g;
                l2 = kx$c.h;
                int n3 = kx.d;
                long l12 = n3;
                kx$f2 = kx.b;
                long l14 = (l8 -= l7) - l12;
                long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (l15 <= 0) {
                    kx.c = null;
                    kx$f2.b();
                    return Kx.b((il0_0)object, l7, pw22);
                }
                l7 = ((il0_0)object).d;
                l8 = 0L;
                long l16 = (l7 = l2 - l7) - l8;
                n3 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (n3 < 0 || (l15 = (l4 = l7 - (l12 = 262144L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) break block6;
                int n4 = (int)l7;
                ((il0_0)object).j(n4);
                int n7 = 0;
                ((il0_0)object).f = 0;
                l7 = kx$c.b;
                Kx$e kx$e = kx$f2.a((il0_0)object, l7);
                n4 = -3;
                l15 = kx$e.a;
                if (l15 == n4) break;
                n4 = -2;
                l2 = kx$e.b;
                kx$f = kx$f2;
                long l17 = kx$e.c;
                if (l15 != n4) {
                    n7 = -1;
                    if (l15 != n7) {
                        if (l15 == false) {
                            long l18 = ((il0_0)object).d;
                            long l19 = (l18 = l17 - l18) - l8;
                            n4 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                            if (n4 >= 0 && (n4 = (int)(l18 == l12 ? 0 : (l18 < l12 ? -1 : 1))) <= 0) {
                                n7 = (int)l18;
                                ((il0_0)object).j(n7);
                            }
                            kx.c = null;
                            kx$f.b();
                            return Kx.b((il0_0)object, l17, pw22);
                        }
                        object = new IllegalStateException("Invalid case");
                        throw object;
                    }
                    kx$c.e = l2;
                    kx$c.g = l17;
                    l7 = kx$c.d;
                    l8 = kx$c.f;
                    l12 = kx$c.c;
                    l3 = kx$c.b;
                    kx$c.h = l7 = Kx$c.a(l3, l7, l2, l8, l17, l12);
                    continue;
                }
                kx$c.d = l2;
                kx$c.f = l17;
                l7 = kx$c.e;
                l8 = kx$c.g;
                l12 = kx$c.c;
                l3 = kx$c.b;
                kx$c.h = l7 = Kx$c.a(l3, l2, l7, l17, l8, l12);
            }
            kx$f = kx$f2;
            kx.c = null;
            kx$f2.b();
            return Kx.b((il0_0)object, l2, pw22);
        }
        return Kx.b((il0_0)object, l2, pw22);
    }

    public final void c(long l2) {
        Kx$c kx$c;
        long l3;
        long l4;
        long l7;
        Kx kx = this;
        long l8 = l2;
        Object object = this.c;
        if (object != null && (l7 = (l4 = (l3 = ((Kx$c)object).a) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            return;
        }
        object = kx.a;
        l3 = ((Kx$a)object).a.a(l8);
        long l12 = ((Kx$a)object).f;
        long l14 = ((Kx$a)object).g;
        long l15 = ((Kx$a)object).d;
        long l16 = ((Kx$a)object).e;
        object = kx$c;
        l8 = l2;
        kx.c = kx$c = new Kx$c(l2, l3, l15, l16, l12, l14);
    }
}

