/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class Z92
implements qn1_0 {
    public final pj_1 b;

    public Z92() {
        pj_1 pj_12;
        this.b = pj_12;
    }

    public final void b(MessageDigest messageDigest) {
        int n3 = 0;
        while (true) {
            Object object = this.b;
            int n4 = ((a53)object).c;
            if (n3 >= n4) break;
            object = (U92)((a53)object).h(n3);
            Object object2 = this.b.l(n3);
            U92$b u92$b = ((U92)object).b;
            Object object3 = ((U92)object).d;
            if (object3 == null) {
                object3 = ((U92)object).c;
                Charset charset = qn1_0.a;
                ((U92)object).d = object3 = (Object)object3.getBytes(charset);
            }
            object = ((U92)object).d;
            u92$b.a((byte[])object, object2, messageDigest);
            ++n3;
        }
    }

    public final Object c(U92 object) {
        pj_1 pj_12 = this.b;
        boolean bl2 = pj_12.containsKey(object);
        object = bl2 ? pj_12.get(object) : ((U92)object).a;
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Z92;
        if (bl2) {
            object = (Z92)object;
            pj_1 pj_12 = this.b;
            object = ((Z92)object).b;
            return pj_12.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Options{values=");
        pj_1 pj_12 = this.b;
        stringBuilder.append(pj_12);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

