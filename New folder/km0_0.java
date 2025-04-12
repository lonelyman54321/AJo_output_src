/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from km0
 */
public final class km0_0
implements Gv1 {
    public final long a;
    public final long b;
    public final float c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public long m;
    public long n;
    public long o;

    public km0_0(long l2, long l3, float f5) {
        this.a = l2;
        this.b = l3;
        this.c = f5;
        this.d = l2 = -9223372036854775807L;
        this.e = l2;
        this.g = l2;
        this.h = l2;
        this.k = 0.97f;
        this.j = 1.03f;
        this.l = 1.0f;
        this.m = l2;
        this.f = l2;
        this.i = l2;
        this.n = l2;
        this.o = l2;
    }

    public final void a() {
        long l2;
        Object object;
        long l3;
        long l4 = this.d;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 != false) {
            l3 = this.e;
            long l12 = l3 - l7;
            object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object == false) {
                long l14;
                l3 = this.g;
                long l15 = l3 - l7;
                object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object != false && (object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) < 0) {
                    l4 = l3;
                }
                if ((object = (l14 = (l3 = this.h) - l7) == 0L ? 0 : (l14 < 0L ? -1 : 1)) == false || (object = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) <= 0) {
                    l3 = l4;
                }
            }
        } else {
            l3 = l7;
        }
        if ((object = (l2 = (l4 = this.f) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return;
        }
        this.f = l3;
        this.i = l3;
        this.n = l7;
        this.o = l7;
        this.m = l7;
    }
}

