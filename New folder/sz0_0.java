/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.util.Map;

/*
 * Renamed from Sz0
 */
public final class sz0_0
implements qn1_0 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final qn1_0 g;
    public final Map h;
    public final Z92 i;
    public int j;

    public sz0_0(Object object, qn1_0 qn1_02, int n3, int n4, pj_1 pj_12, Class clazz, Class clazz2, Z92 z92) {
        String string2 = "Argument must not be null";
        dV0.c(object, string2);
        this.b = object;
        dV0.c(qn1_02, "Signature must not be null");
        this.g = qn1_02;
        this.c = n3;
        this.d = n4;
        dV0.c(pj_12, string2);
        this.h = pj_12;
        dV0.c(clazz, "Resource class must not be null");
        this.e = clazz;
        dV0.c(clazz2, "Transcode class must not be null");
        this.f = clazz2;
        dV0.c(z92, string2);
        this.i = z92;
    }

    public final void b(MessageDigest object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof sz0_0;
        boolean bl2 = false;
        if (n3 != 0) {
            boolean bl3;
            int n4;
            object = (sz0_0)object;
            Object object2 = this.b;
            Object object3 = ((sz0_0)object).b;
            n3 = object2.equals(object3);
            if (n3 != 0 && (n3 = (object3 = this.g).equals(object2 = ((sz0_0)object).g)) != 0 && (n3 = this.d) == (n4 = ((sz0_0)object).d) && (n3 = this.c) == (n4 = ((sz0_0)object).c) && (n3 = (int)((object3 = this.h).equals(object2 = ((sz0_0)object).h) ? 1 : 0)) != 0 && (n3 = (int)((object3 = this.e).equals(object2 = ((sz0_0)object).e) ? 1 : 0)) != 0 && (n3 = (int)((object3 = this.f).equals(object2 = ((sz0_0)object).f) ? 1 : 0)) != 0 && (bl3 = ((Z92)(object3 = this.i)).equals(object = ((sz0_0)object).i))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.j;
        if (n3 == 0) {
            this.j = n3 = this.b.hashCode();
            int n4 = (this.g.hashCode() + (n3 *= 31)) * 31;
            n3 = this.c;
            n4 = (n4 + n3) * 31;
            n3 = this.d;
            this.j = n4 += n3;
            this.j = n3 = this.h.hashCode() + (n4 *= 31);
            this.j = n4 = this.e.hashCode() + (n3 *= 31);
            Class clazz = this.f;
            this.j = n3 = clazz.hashCode() + (n4 *= 31);
            pj_1 pj_12 = this.i.b;
            this.j = n4 = pj_12.hashCode() + (n3 *= 31);
        }
        return this.j;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EngineKey{model=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", width=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", height=");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", resourceClass=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", transcodeClass=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", signature=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", hashCode=");
        n3 = this.j;
        stringBuilder.append(n3);
        stringBuilder.append(", transformations=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", options=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

