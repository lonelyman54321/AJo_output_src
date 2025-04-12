/*
 * Decompiled with CFR 0.152.
 */
public final class CO0$a
implements q72 {
    public EO0 a;
    public EO0$a b;
    public long c;
    public long d;

    public final long a(il0_0 il0_02) {
        long l2 = this.d;
        long l3 = 0L;
        long l4 = -1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object >= 0) {
            l2 = -(l2 + (long)2);
            this.d = l4;
            return l2;
        }
        return l4;
    }

    public final dx2_1 b() {
        DO0 dO0;
        boolean bl2;
        long l2 = this.c;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            bl2 = true;
        } else {
            bl2 = false;
            dO0 = null;
        }
        ct3.f(bl2);
        EO0 eO0 = this.a;
        l3 = this.c;
        dO0 = new DO0(eO0, l3);
        return dO0;
    }

    public final void c(long l2) {
        long[] lArray = this.b.a;
        int n3 = gz3.d(lArray, l2, true);
        this.d = l2 = lArray[n3];
    }
}

