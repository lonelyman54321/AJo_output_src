/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$u
extends rR2$O {
    public final String a;
    public final rR2$O b;

    public rR2$u(String string2, rR2$O rR2$O) {
        this.a = string2;
        this.b = rR2$O;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(" ");
        object = this.b;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

