/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class bq1 {
    public final xp1_0 a;
    public boolean b;
    public Xp1$d c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public final bq1$b r;
    public bq1$a_0 s;
    public long t;
    public final bq1$c u;

    public bq1(xp1_0 object) {
        long l2;
        this.a = object;
        object = Xp1$d.Idle;
        this.c = object;
        super(this);
        this.r = object;
        this.t = l2 = f60.b(0, 0, 15);
        super(this);
        this.u = object;
    }

    public final w32_0 a() {
        return this.a.y.c;
    }

    public final void b(int n3) {
        Object object;
        int n4 = this.n;
        this.n = n3;
        int n7 = 0;
        int n8 = 1;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        if (n3 == 0) {
            n7 = 1;
        }
        if (n4 != n7) {
            object = this.a.A();
            if (object != null) {
                object = ((xp1_0)object).z;
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null) {
                if (n3 == 0) {
                    n3 = ((bq1)object).n + -1;
                    ((bq1)object).b(n3);
                } else {
                    n3 = ((bq1)object).n + n8;
                    ((bq1)object).b(n3);
                }
            }
        }
    }

    public final void c(int n3) {
        Object object;
        int n4 = this.q;
        this.q = n3;
        int n7 = 0;
        int n8 = 1;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        if (n3 == 0) {
            n7 = 1;
        }
        if (n4 != n7) {
            object = this.a.A();
            if (object != null) {
                object = ((xp1_0)object).z;
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null) {
                if (n3 == 0) {
                    n3 = ((bq1)object).q + -1;
                    ((bq1)object).c(n3);
                } else {
                    n3 = ((bq1)object).q + n8;
                    ((bq1)object).c(n3);
                }
            }
        }
    }

    public final void d(boolean bl2) {
        boolean bl3 = this.m;
        if (bl3 != bl2) {
            boolean bl4;
            this.m = bl2;
            if (bl2 && !(bl3 = this.l)) {
                int n3 = this.n + 1;
                this.b(n3);
            } else if (!bl2 && !(bl4 = this.l)) {
                int n4 = this.n + -1;
                this.b(n4);
            }
        }
    }

    public final void e(boolean bl2) {
        boolean bl3 = this.l;
        if (bl3 != bl2) {
            boolean bl4;
            this.l = bl2;
            if (bl2 && !(bl3 = this.m)) {
                int n3 = this.n + 1;
                this.b(n3);
            } else if (!bl2 && !(bl4 = this.m)) {
                int n4 = this.n + -1;
                this.b(n4);
            }
        }
    }

    public final void f(boolean bl2) {
        boolean bl3 = this.p;
        if (bl3 != bl2) {
            boolean bl4;
            this.p = bl2;
            if (bl2 && !(bl3 = this.o)) {
                int n3 = this.q + 1;
                this.c(n3);
            } else if (!bl2 && !(bl4 = this.o)) {
                int n4 = this.q + -1;
                this.c(n4);
            }
        }
    }

    public final void g(boolean bl2) {
        boolean bl3 = this.o;
        if (bl3 != bl2) {
            boolean bl4;
            this.o = bl2;
            if (bl2 && !(bl3 = this.p)) {
                int n3 = this.q + 1;
                this.c(n3);
            } else if (!bl2 && !(bl4 = this.p)) {
                int n4 = this.q + -1;
                this.c(n4);
            }
        }
    }

    public final void h() {
        block10: {
            boolean bl2;
            bq1 bq12;
            xp1_0 xp1_02;
            int n3;
            Object object;
            Object object2;
            block11: {
                object2 = this.r;
                object = ((bq1$b)object2).r;
                n3 = 7;
                xp1_02 = this.a;
                bq12 = ((bq1$b)object2).H;
                if ((object != null || (object = bq12.a().B()) != null) && (bl2 = ((bq1$b)object2).q)) {
                    ((bq1$b)object2).q = false;
                    ((bq1$b)object2).r = object = bq12.a().B();
                    object2 = xp1_02.A();
                    if (object2 != null) {
                        xp1_0.Z((xp1_0)object2, false, n3);
                    }
                }
                if ((object2 = this.s) == null) break block10;
                object = ((bq1$a_0)object2).w;
                bq12 = ((bq1$a_0)object2).y;
                if (object != null) break block11;
                object = bq12.a().h1();
                Intrinsics.checkNotNull(object);
                object = ((xb1_0)object).m.B();
                if (object == null) break block10;
            }
            if (bl2 = ((bq1$a_0)object2).v) {
                ((bq1$a_0)object2).v = false;
                object = bq12.a().h1();
                Intrinsics.checkNotNull(object);
                ((bq1$a_0)object2).w = object = ((xb1_0)object).m.B();
                boolean bl3 = iq1_1.b(xp1_02);
                if (bl3) {
                    object2 = xp1_02.A();
                    if (object2 != null) {
                        xp1_0.Z((xp1_0)object2, false, n3);
                    }
                } else {
                    object2 = xp1_02.A();
                    if (object2 != null) {
                        xp1_0.X((xp1_0)object2, false, n3);
                    }
                }
            }
        }
    }
}

