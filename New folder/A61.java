/*
 * Decompiled with CFR 0.152.
 */
public final class A61 {
    public final long a;
    public final long b;
    public final long c;

    public A61(long l2, long l3, long l4) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HistoricalChange(uptimeMillis=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", position=");
        String string2 = e72.k(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

