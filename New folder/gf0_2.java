/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gf0
 */
public final class gf0_2
implements i13 {
    public final Cg2 a(long l2, bp1_0 object, Vo0 vo0) {
        Intrinsics.checkNotNullParameter(object, "layoutDirection");
        Intrinsics.checkNotNullParameter(vo0, "density");
        object = ni.a();
        double d2 = (double)((float)90 - 80.0f) * Math.PI;
        double d5 = 180;
        d2 /= d5;
        d5 = C63.b(l2);
        float f5 = (float)(Math.tan(d2) * d5);
        float f6 = C63.b(l2);
        ((ki)object).a(0.0f, f6);
        ((ki)object).d(f5, 0.0f);
        f5 = C63.d(l2);
        ((ki)object).d(f5, 0.0f);
        f5 = C63.d(l2);
        f6 = C63.b(l2);
        ((ki)object).d(f5, f6);
        float f7 = C63.b(l2);
        ((ki)object).d(0.0f, f7);
        Cg2$a cg2$a = new Cg2$a((gn2)object);
        return cg2$a;
    }
}

