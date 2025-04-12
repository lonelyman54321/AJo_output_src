/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eG2
 */
public final class eg2_1
implements Y60 {
    public final String a;
    public final fk_0 b;
    public final fk_0 c;
    public final oj_1 d;
    public final boolean e;

    public eg2_1(String string2, fk_0 fk_02, Uj uj, oj_1 oj_12, boolean bl2) {
        this.a = string2;
        this.b = fk_02;
        this.c = uj;
        this.d = oj_12;
        this.e = bl2;
    }

    public final r60_0 a(yc1_1 yc1_12, QB1 object, kw_1 kw_12) {
        object = new dg2_1(yc1_12, kw_12, this);
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RectangleShape{position=");
        fk_0 fk_02 = this.b;
        stringBuilder.append(fk_02);
        stringBuilder.append(", size=");
        fk_02 = this.c;
        stringBuilder.append(fk_02);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

