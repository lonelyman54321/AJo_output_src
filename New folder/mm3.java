/*
 * Decompiled with CFR 0.152.
 */
public final class mm3 {
    public static final long b = nm3.a(0, 0);
    public static final /* synthetic */ int c;
    public final long a;

    public /* synthetic */ mm3(long l2) {
        this.a = l2;
    }

    public static final boolean a(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final boolean b(long l2) {
        int n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        boolean bl2 = n4 == n7;
        return bl2;
    }

    public static final int c(long l2) {
        int n3 = mm3.d(l2);
        int n4 = mm3.e(l2);
        return n3 - n4;
    }

    public static final int d(long l2) {
        int n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        if (n4 <= n7) {
            n4 = n7;
        }
        return n4;
    }

    public static final int e(long l2) {
        int n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        if (n4 > n7) {
            n4 = n7;
        }
        return n4;
    }

    public static final boolean f(long l2) {
        int n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        long l4 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l4);
        boolean bl2 = n4 > n7;
        return bl2;
    }

    public static String g(long l2) {
        StringBuilder stringBuilder = new StringBuilder("TextRange(");
        int n3 = (int)(l2 >> 32);
        stringBuilder.append(n3);
        stringBuilder.append(", ");
        int n4 = (int)(l2 & 0xFFFFFFFFL);
        return tu.a(stringBuilder, n4, ')');
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof mm3;
        boolean bl3 = false;
        if (bl2) {
            object = (mm3)object;
            long l2 = this.a;
            long l3 = ((mm3)object).a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
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
        return mm3.g(this.a);
    }
}

