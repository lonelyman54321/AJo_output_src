/*
 * Decompiled with CFR 0.152.
 */
public final class Uc
implements Lw2 {
    public final Nc a;
    public final long b;

    public Uc(Nc nc, long l2) {
        this.a = nc;
        this.b = l2;
    }

    public final long a(Vi1 vi1, long l2, bp1_0 bp1_02, long l3) {
        int n3 = vi1.c;
        int n4 = vi1.a;
        int n7 = vi1.d;
        int n8 = vi1.b;
        long l4 = dj1.a(n3 -= n4, n7 -= n8);
        Nc nc = this.a;
        long l7 = nc.a(0L, l4, bp1_02);
        Object object = this.a;
        long l8 = l3;
        l3 = object.a(0L, l3, bp1_02);
        n3 = 32;
        long l12 = l3 >> n3;
        int n10 = (int)l12;
        int n14 = -n10;
        long l14 = 0xFFFFFFFFL;
        int n15 = (int)(l3 & l14);
        int n16 = -n15;
        l8 = (long)n14 << n3;
        l3 = (long)n16 & l14 | l8;
        l8 = this.b;
        long l15 = l8 >> n3;
        n3 = (int)l15;
        object = bp1_0.Ltr;
        int n17 = bp1_02 == object ? 1 : -1;
        n3 *= n17;
        n17 = (int)(l8 & l14);
        l12 = Ti1.a(n3, n17);
        return Si1.d(Si1.d(Si1.d(Ti1.a(n4, n8), l7), l3), l12);
    }
}

