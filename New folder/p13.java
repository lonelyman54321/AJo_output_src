/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public final class p13
implements Y60 {
    public final String a;
    public final List b;
    public final boolean c;

    public p13(String string2, List list, boolean bl2) {
        this.a = string2;
        this.b = list;
        this.c = bl2;
    }

    public final r60_0 a(yc1_1 yc1_12, QB1 qB1, kw_1 kw_12) {
        f60_0 f60_02 = new f60_0(yc1_12, kw_12, this, qB1);
        return f60_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShapeGroup{name='");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append("' Shapes: ");
        string2 = Arrays.toString(this.b.toArray());
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

