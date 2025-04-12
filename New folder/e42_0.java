/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from e42
 */
public final class e42_0
implements xk1_0 {
    public final Qj1 a;
    public final g42 b;
    public final h42_0 c;

    public e42_0(Qj1 qj1, g42 g422, h42_0 h42_02) {
        this.a = qj1;
        this.b = g422;
        this.c = h42_02;
    }

    public final Object B() {
        return this.a.B();
    }

    public final int I(int n3) {
        return this.a.I(n3);
    }

    public final int N(int n3) {
        return this.a.N(n3);
    }

    public final int P(int n3) {
        return this.a.P(n3);
    }

    public final Ns2 Q(long l2) {
        int n3;
        Enum enum_ = this.c;
        h42_0 h42_02 = h42_0.Width;
        int n4 = Short.MAX_VALUE;
        g42 g422 = this.b;
        Qj1 qj1 = this.a;
        if (enum_ == h42_02) {
            int n7;
            enum_ = g42.Max;
            if (g422 == enum_) {
                n7 = c60.h(l2);
                n7 = qj1.P(n7);
            } else {
                n7 = c60.h(l2);
                n7 = qj1.N(n7);
            }
            boolean bl2 = c60.d(l2);
            if (bl2) {
                n4 = c60.h(l2);
            }
            f42_0 f42_02 = new f42_0(n7, n4);
            return f42_02;
        }
        enum_ = g42.Max;
        if (g422 == enum_) {
            n3 = c60.i(l2);
            n3 = qj1.v(n3);
        } else {
            n3 = c60.i(l2);
            n3 = qj1.I(n3);
        }
        boolean bl3 = c60.e(l2);
        if (bl3) {
            n4 = c60.i(l2);
        }
        f42_0 f42_03 = new f42_0(n4, n3);
        return f42_03;
    }

    public final int v(int n3) {
        return this.a.v(n3);
    }
}

