/*
 * Decompiled with CFR 0.152.
 */
public final class u13
implements Y60 {
    public final String a;
    public final int b;
    public final wj_0 c;
    public final boolean d;

    public u13(String string2, int n3, wj_0 wj_02, boolean bl2) {
        this.a = string2;
        this.b = n3;
        this.c = wj_02;
        this.d = bl2;
    }

    public final r60_0 a(yc1_1 yc1_12, QB1 object, kw_1 kw_12) {
        object = new k13(yc1_12, kw_12, this);
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShapePath{name=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", index=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, '}');
    }
}

