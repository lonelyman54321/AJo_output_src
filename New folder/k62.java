/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class k62
implements qn1_0 {
    public final Object b;

    public k62(Object object) {
        dV0.c(object, "Argument must not be null");
        this.b = object;
    }

    public final void b(MessageDigest messageDigest) {
        Object object = this.b.toString();
        Charset charset = qn1_0.a;
        object = ((String)object).getBytes(charset);
        messageDigest.update((byte[])object);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof k62;
        if (bl2) {
            object = (k62)object;
            Object object2 = this.b;
            object = ((k62)object).b;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ObjectKey{object=");
        Object object = this.b;
        return gl1_0.a(stringBuilder, object, '}');
    }
}

