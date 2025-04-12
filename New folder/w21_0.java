/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from w21
 */
public final class w21_0
implements Lw2 {
    public final Nc a;
    public final k72 b;
    public long c;

    public w21_0(Nc nc, k72 k722) {
        this.a = nc;
        this.b = k722;
        this.c = 0L;
    }

    public final long a(Vi1 vi1, long l2, bp1_0 bp1_02, long l3) {
        k72 k722 = this.b;
        l2 = k722.a();
        boolean bl2 = h72.c(l2);
        if (!bl2) {
            l2 = this.c;
        }
        this.c = l2;
        long l4 = this.a.a(l3, 0L, bp1_02);
        int n3 = vi1.a;
        int n4 = vi1.b;
        long l7 = Ti1.a(n3, n4);
        long l8 = Ti1.b(l2);
        return Si1.d(Si1.d(l7, l8), l4);
    }
}

