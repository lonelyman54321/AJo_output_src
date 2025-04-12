/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;

/*
 * Renamed from eY
 */
public final class ey_1
implements qA3 {
    public static final ey_1 a;

    static {
        ey_1 ey_12;
        a = ey_12 = new Object();
    }

    public final Object a(gm1_0 gm1_02, float f5) {
        double d2;
        int n3;
        Gm1$b gm1$b;
        Gm1$b gm1$b2 = gm1_02.z();
        if (gm1$b2 == (gm1$b = Gm1$b.BEGIN_ARRAY)) {
            n3 = 1;
        } else {
            n3 = 0;
            gm1$b2 = null;
        }
        if (n3 != 0) {
            gm1_02.a();
        }
        double d5 = gm1_02.p();
        double d7 = gm1_02.p();
        double d9 = gm1_02.p();
        Gm1$b gm1$b3 = gm1_02.z();
        Gm1$b gm1$b4 = Gm1$b.NUMBER;
        double d12 = 1.0;
        double d13 = gm1$b3 == gm1$b4 ? gm1_02.p() : d12;
        if (n3 != 0) {
            gm1_02.c();
        }
        if ((d2 = d5 == d12 ? 0 : (d5 < d12 ? -1 : 1)) <= 0 && (d2 = d7 == d12 ? 0 : (d7 < d12 ? -1 : 1)) <= 0 && (d2 = d9 == d12 ? 0 : (d9 < d12 ? -1 : 1)) <= 0) {
            double d14 = 255.0;
            d5 *= d14;
            d7 *= d14;
            d9 *= d14;
            Object object = d13 == d12 ? 0 : (d13 < d12 ? -1 : 1);
            if (object <= 0) {
                d13 *= d14;
            }
        }
        d2 = (int)d13;
        n3 = (int)d5;
        int n4 = (int)d7;
        int n7 = (int)d9;
        return Color.argb((int)d2, (int)n3, (int)n4, (int)n7);
    }
}

