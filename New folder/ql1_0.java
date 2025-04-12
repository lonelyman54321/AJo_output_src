/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qL1
 */
public final class ql1_0
implements xk1_0 {
    public final Qj1 a;
    public final sl1_0 b;
    public final tL1 c;

    public ql1_0(Qj1 qj1, sl1_0 sl1_02, tL1 tL12) {
        this.a = qj1;
        this.b = sl1_02;
        this.c = tL12;
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
        tL1 tL12 = tL1.Width;
        int n4 = Short.MAX_VALUE;
        sl1_0 sl1_02 = this.b;
        Qj1 qj1 = this.a;
        if (enum_ == tL12) {
            int n7;
            enum_ = sl1_0.Max;
            if (sl1_02 == enum_) {
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
            rl1_0 rl1_02 = new rl1_0(n7, n4);
            return rl1_02;
        }
        enum_ = sl1_0.Max;
        if (sl1_02 == enum_) {
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
        rl1_0 rl1_03 = new rl1_0(n4, n3);
        return rl1_03;
    }

    public final int v(int n3) {
        return this.a.v(n3);
    }
}

