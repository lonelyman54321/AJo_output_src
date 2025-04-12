/*
 * Decompiled with CFR 0.152.
 */
public final class bj1 {
    public final long a;

    public /* synthetic */ bj1(long l2) {
        this.a = l2;
    }

    public static boolean a(long l2, Object object) {
        boolean bl2 = object instanceof bj1;
        if (!bl2) {
            return false;
        }
        object = (bj1)object;
        long l3 = ((bj1)object).a;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object2 == false;
    }

    public static final boolean b(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static final int c(long l2) {
        return (int)(l2 & 0xFFFFFFFFL);
    }

    public static final int d(long l2) {
        return (int)(l2 >> 32);
    }

    public static String e(long l2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = (int)(l2 >> 32);
        stringBuilder.append(n3);
        stringBuilder.append(" x ");
        int n4 = (int)(l2 & 0xFFFFFFFFL);
        stringBuilder.append(n4);
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        return bj1.a(this.a, object);
    }

    public final int hashCode() {
        long l2 = this.a;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public final String toString() {
        return bj1.e(this.a);
    }
}

