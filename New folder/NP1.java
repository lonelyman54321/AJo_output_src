/*
 * Decompiled with CFR 0.152.
 */
public final class NP1 {
    public final LP1 a;
    public final zp1 b;
    public final Object c;

    public NP1(LP1 lP1, zp1 zp12, Qg2 qg2) {
        this.a = lP1;
        this.b = zp12;
        this.c = qg2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ModifierInfo(");
        Object object = this.a;
        stringBuilder.append(object);
        object = ", ";
        stringBuilder.append((String)object);
        zp1 zp12 = this.b;
        stringBuilder.append(zp12);
        stringBuilder.append((String)object);
        object = this.c;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

