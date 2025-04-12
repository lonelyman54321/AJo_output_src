/*
 * Decompiled with CFR 0.152.
 */
public final class P70$a$b
extends P70$a {
    public final long a;

    public P70$a$b(long l2) {
        this.a = l2;
        boolean bl2 = h72.c(l2);
        if (bl2) {
            return;
        }
        String string2 = "ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        boolean bl2 = object instanceof P70$a$b;
        if (!bl2) {
            return false;
        }
        long l2 = ((P70$a$b)object).a;
        return e72.b(this.a, l2);
    }

    public final int hashCode() {
        return e72.f(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Open(offset=");
        String string2 = e72.k(this.a);
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

