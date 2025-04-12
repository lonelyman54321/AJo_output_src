/*
 * Decompiled with CFR 0.152.
 */
public final class CH$p {
    public CH$s a;
    public rR2.E b;
    public CH$u c;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = String.valueOf(this.a);
        stringBuilder.append((String)object);
        stringBuilder.append(" {...} (src=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

