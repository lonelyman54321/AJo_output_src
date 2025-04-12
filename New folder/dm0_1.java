/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dm0
 */
public final class dm0_1
implements xk1_0 {
    public final Qj1 a;
    public final Sj1 b;
    public final Vj1 c;

    public dm0_1(Qj1 qj1, Sj1 sj1, Vj1 vj1) {
        this.a = qj1;
        this.b = sj1;
        this.c = vj1;
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
        Vj1 vj1 = Vj1.Width;
        int n4 = Short.MAX_VALUE;
        Sj1 sj1 = this.b;
        Qj1 qj1 = this.a;
        if (enum_ == vj1) {
            int n7;
            enum_ = Sj1.Max;
            if (sj1 == enum_) {
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
            to0_0 to0_02 = new to0_0(n7, n4);
            return to0_02;
        }
        enum_ = Sj1.Max;
        if (sj1 == enum_) {
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
        to0_0 to0_03 = new to0_0(n4, n3);
        return to0_03;
    }

    public final int v(int n3) {
        return this.a.v(n3);
    }
}

