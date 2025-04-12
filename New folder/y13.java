/*
 * Decompiled with CFR 0.152.
 */
public final class y13
implements Y60 {
    public final y13$a a;
    public final oj_1 b;
    public final oj_1 c;
    public final oj_1 d;
    public final boolean e;

    public y13(String string2, y13$a y13$a, oj_1 oj_12, oj_1 oj_13, oj_1 oj_14, boolean bl2) {
        this.a = y13$a;
        this.b = oj_12;
        this.c = oj_13;
        this.d = oj_14;
        this.e = bl2;
    }

    public final r60_0 a(yc1_1 object, QB1 qB1, kw_1 kw_12) {
        object = new vs3_0(kw_12, this);
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Trim Path: {start: ");
        oj_1 oj_12 = this.b;
        stringBuilder.append(oj_12);
        stringBuilder.append(", end: ");
        oj_12 = this.c;
        stringBuilder.append(oj_12);
        stringBuilder.append(", offset: ");
        oj_12 = this.d;
        stringBuilder.append(oj_12);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

