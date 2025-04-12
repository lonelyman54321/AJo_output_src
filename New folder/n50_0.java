/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from n50
 */
public class n50_0
implements dx2_1 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public n50_0(long l2, long l3, int n3, int n4, boolean bl2) {
        this.a = l2;
        this.b = l3;
        int n7 = -1;
        if (n4 == n7) {
            n4 = 1;
        }
        this.c = n4;
        this.e = n3;
        this.g = bl2;
        long l4 = -1;
        long l7 = l2 - l4;
        n7 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
        if (n7 == 0) {
            this.d = l4;
            this.f = l2 = -9223372036854775807L;
        } else {
            this.d = l2 -= l3;
            l2 = Math.max(0L, l2) * 8000000L;
            l3 = n3;
            this.f = l2 /= l3;
        }
    }

    public final dX2$a d(long l2) {
        long l3;
        long l4;
        long l7;
        int n3;
        n50_0 n50_02 = this;
        long l8 = -1;
        long l12 = this.b;
        long l14 = 0L;
        long l15 = this.d;
        long l16 = l15 - l8;
        Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object == false && (n3 = this.g) == 0) {
            fx2_0 fx2_02 = new fx2_0(l14, l12);
            dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
            return dX2$a;
        }
        n3 = n50_02.e;
        long l17 = (long)n3 * l2;
        long l18 = 8000000L;
        l17 /= l18;
        int n4 = n50_02.c;
        long l19 = n4;
        l17 = l17 / l19 * l19;
        if (object != false) {
            l17 = Math.min(l17, l15 -= l19);
        }
        l15 = Math.max(l17, l14) + l12;
        l17 = l15 - l12;
        l17 = Math.max(l14, l17) * l18;
        l18 = n3;
        fx2_0 fx2_03 = new fx2_0(l17 /= l18, l15);
        if (object != false && (object = l17 == l2 ? 0 : (l17 < l2 ? -1 : 1)) < 0 && (l7 = (l4 = (l15 += l19) - (l3 = n50_02.a)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
            l12 = l15 - l12;
            l12 = Math.max(l14, l12) * 8000000L;
            l14 = n3;
            fx2_0 fx2_04 = new fx2_0(l12 /= l14, l15);
            dX2$a dX2$a = new dX2$a(fx2_03, fx2_04);
            return dX2$a;
        }
        dX2$a dX2$a = new dX2$a(fx2_03, fx2_03);
        return dX2$a;
    }

    public final boolean g() {
        boolean bl2;
        long l2 = this.d;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        bl2 = object != false || (bl2 = this.g);
        return bl2;
    }

    public final long getDurationUs() {
        return this.f;
    }
}

