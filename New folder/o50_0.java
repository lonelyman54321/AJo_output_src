/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from o50
 */
public final class o50_0
extends n50_0
implements px2_1 {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public o50_0(long l2, long l3, int n3, int n4, boolean bl2) {
        super(l2, l3, n3, n4, bl2);
        this.h = l3;
        this.i = n3;
        this.j = n4;
        this.k = bl2;
        l3 = -1;
        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n3 == 0) {
            l2 = l3;
        }
        this.l = l2;
    }

    public final long f() {
        return this.l;
    }

    public final long h(long l2) {
        long l3 = this.b;
        l2 -= l3;
        l2 = Math.max(0L, l2) * 8000000L;
        l3 = this.e;
        return l2 / l3;
    }

    public final int j() {
        return this.i;
    }
}

