/*
 * Decompiled with CFR 0.152.
 */
public final class J92$a$a
extends J92$a {
    public final Throwable a;

    public J92$a$a(Throwable throwable) {
        this.a = throwable;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FAILURE (");
        String string2 = this.a.getMessage();
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

