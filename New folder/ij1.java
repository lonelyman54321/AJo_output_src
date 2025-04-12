/*
 * Decompiled with CFR 0.152.
 */
public final class ij1 {
    public final int a;
    public final long b;

    public ij1(long l2, int n3) {
        this.b = l2;
        this.a = n3;
    }

    public static ij1 a(int n3, int n4, String string2) {
        int n7;
        int n8;
        int n10;
        if (n3 >= n4) {
            return null;
        }
        long l2 = 0L;
        for (n10 = n3; n10 < n4 && (n8 = string2.charAt(n10)) >= (n7 = 48) && n8 <= (n7 = 57); ++n10) {
            long l3 = 10;
            l2 *= l3;
            long l4 = n8 += -48;
            long l7 = (l2 += l4) - (l4 = Integer.MAX_VALUE);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) continue;
            return null;
        }
        if (n10 == n3) {
            return null;
        }
        ij1 ij12 = new ij1(l2, n10);
        return ij12;
    }
}

