/*
 * Decompiled with CFR 0.152.
 */
public final class uE0$e {
    public final long a;
    public final long b;

    public uE0$e(long l2, long l3) {
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 == false) {
            this.a = l4;
            this.b = 1L;
            return;
        }
        this.a = l2;
        this.b = l3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append("/");
        l2 = this.b;
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }
}

