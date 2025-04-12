/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path$FillType
 */
import android.graphics.Path;

public final class n13
implements Y60 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final nj_1 d;
    public final qj_0 e;
    public final boolean f;

    public n13(String string2, boolean bl2, Path.FillType fillType, nj_1 nj_12, qj_0 qj_02, boolean bl3) {
        this.c = string2;
        this.a = bl2;
        this.b = fillType;
        this.d = nj_12;
        this.e = qj_02;
        this.f = bl3;
    }

    public final r60_0 a(yc1_1 yc1_12, QB1 object, kw_1 kw_12) {
        object = new sm0_1(yc1_12, kw_12, this);
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShapeFill{color=, fillEnabled=");
        boolean bl2 = this.a;
        return AR.a(stringBuilder, bl2, '}');
    }
}

