/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from QA3
 */
public final class qa3_0
implements JA3 {
    public final ma3_0 a;
    public final xJ2 b;
    public final long c;
    public final long d;

    public qa3_0(ma3_0 ma3_02, xJ2 xJ22, long l2) {
        this.a = ma3_02;
        this.b = xJ22;
        int n3 = ma3_02.c();
        long l3 = ma3_02.a() + n3;
        long l4 = 1000000L;
        this.c = l3 *= l4;
        this.d = l2 *= l4;
    }

    public final boolean b() {
        return true;
    }

    public final Ol d(Ol ol, Ol ol2, Ol ol4) {
        return this.e(Long.MAX_VALUE, ol, ol2, ol4);
    }

    public final Ol e(long l2, Ol ol, Ol ol2, Ol ol4) {
        long l3 = this.h(l2);
        Ol ol5 = this.i(l2, ol, ol4, ol2);
        return this.a.e(l3, ol, ol2, ol5);
    }

    public final Ol f(long l2, Ol ol, Ol ol2, Ol ol4) {
        long l3 = this.h(l2);
        Ol ol5 = this.i(l2, ol, ol4, ol2);
        return this.a.f(l3, ol, ol2, ol5);
    }

    public final long g(Ol ol, Ol ol2, Ol ol4) {
        return Long.MAX_VALUE;
    }

    public final long h(long l2) {
        long l3 = this.d;
        long l4 = l2 + l3;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object <= 0) {
            return l7;
        }
        l2 += l3;
        l3 = this.c;
        l4 = l2 / l3;
        xJ2 xJ22 = this.b;
        xJ2 xJ23 = xJ2.Restart;
        if (xJ22 != xJ23) {
            object = 2;
            long l12 = object;
            long l14 = (l12 = l4 % l12) - l7;
            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object2 != false) {
                return (l4 + 1L) * l3 - l2;
            }
        }
        Long.signum(l4);
        return l2 - (l4 *= l3);
    }

    public final Ol i(long l2, Ol ol, Ol ol2, Ol ol4) {
        Ol ol5;
        long l3 = this.d;
        long l4 = l2 + l3;
        long l7 = this.c;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object > 0) {
            ma3_0 ma3_02 = this.a;
            long l12 = l7 - l3;
            ol5 = ma3_02.e(l12, ol, ol4, ol2);
        } else {
            ol5 = ol2;
        }
        return ol5;
    }
}

