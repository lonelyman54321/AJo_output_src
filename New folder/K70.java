/*
 * Decompiled with CFR 0.152.
 */
public final class K70
implements Lw2 {
    public final long a;

    public K70(long l2) {
        this.a = l2;
    }

    public final long a(Vi1 vi1, long l2, bp1_0 bp1_02, long l3) {
        int n3;
        int n4 = vi1.a;
        long l4 = this.a;
        int n7 = 32;
        int n8 = (int)(l4 >> n7);
        n4 += n8;
        long l7 = l3 >> n7;
        n8 = (int)l7;
        long l8 = l2 >> n7;
        int n10 = (int)l8;
        bp1_0 bp1_03 = bp1_0.Ltr;
        boolean bl2 = true;
        if (bp1_02 == bp1_03) {
            n3 = 1;
        } else {
            n3 = 0;
            bp1_02 = null;
        }
        n3 = L70.a(n4, n8, n10, n3 != 0);
        l8 = 0xFFFFFFFFL;
        int n14 = (int)(l4 & l8);
        int n15 = vi1.b + n14;
        int n16 = (int)(l3 & l8);
        int n17 = (int)(l2 & l8);
        n15 = L70.a(n15, n16, n17, bl2);
        return Ti1.a(n3, n15);
    }
}

