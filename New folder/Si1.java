/*
 * Decompiled with CFR 0.152.
 */
public final class Si1 {
    public final long a;

    public /* synthetic */ Si1(long l2) {
        this.a = l2;
    }

    public static long a(int n3, int n4, int n7, long l2) {
        long l3;
        int n8 = n7 & 1;
        int n10 = 32;
        if (n8 != 0) {
            l3 = l2 >> n10;
            n3 = (int)l3;
        }
        l3 = 0xFFFFFFFFL;
        if ((n7 &= 2) != 0) {
            long l4 = l2 & l3;
            n4 = (int)l4;
        }
        long l7 = (long)n3 << n10;
        return (long)n4 & l3 | l7;
    }

    public static final boolean b(long l2, long l3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = l4 == false;
        return bl2;
    }

    public static final long c(long l2, long l3) {
        int n3 = 32;
        int n4 = (int)(l2 >> n3);
        int n7 = (int)(l3 >> n3);
        long l4 = 0xFFFFFFFFL;
        int n8 = (int)(l2 & l4);
        int n10 = (int)(l3 & l4);
        l3 = (long)(n4 -= n7) << n3;
        return (long)(n8 -= n10) & l4 | l3;
    }

    public static final long d(long l2, long l3) {
        int n3 = 32;
        int n4 = (int)(l2 >> n3);
        int n7 = (int)(l3 >> n3);
        long l4 = 0xFFFFFFFFL;
        int n8 = (int)(l2 & l4);
        int n10 = (int)(l3 & l4);
        l3 = (long)(n4 += n7) << n3;
        return (long)(n8 += n10) & l4 | l3;
    }

    public static String e(long l2) {
        StringBuilder stringBuilder = new StringBuilder("(");
        int n3 = (int)(l2 >> 32);
        stringBuilder.append(n3);
        stringBuilder.append(", ");
        int n4 = (int)(l2 & 0xFFFFFFFFL);
        return tu.a(stringBuilder, n4, ')');
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Si1;
        boolean bl3 = false;
        if (bl2) {
            object = (Si1)object;
            long l2 = this.a;
            long l3 = ((Si1)object).a;
            long l4 = l2 - l3;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        return Si1.e(this.a);
    }
}

