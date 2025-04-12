/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;

/*
 * Renamed from Xr0
 */
public final class xr0_0
implements qA3 {
    public static final xr0_0 a;
    public static final Gm1$a b;

    static {
        xr0_0 xr0_02;
        a = xr0_02 = new Object();
        b = Gm1$a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");
    }

    public final Object a(gm1_0 gm1_02, float f5) {
        Object object;
        int n3;
        Object object2 = Wr0$a.CENTER;
        gm1_02.b();
        String string2 = null;
        String string3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f11 = 0.0f;
        int n4 = 0;
        int n7 = 0;
        int n8 = 0;
        boolean bl2 = true;
        block15: while ((n3 = gm1_02.k()) != 0) {
            object = b;
            n3 = gm1_02.C((Gm1$a)object);
            switch (n3) {
                default: {
                    gm1_02.G();
                    gm1_02.H();
                    continue block15;
                }
                case 12: {
                    gm1_02.a();
                    double d2 = gm1_02.p();
                    float f12 = (float)d2 * f5;
                    double d5 = gm1_02.p();
                    float f14 = (float)d5 * f5;
                    pointF2 = new PointF(f12, f14);
                    gm1_02.c();
                    continue block15;
                }
                case 11: {
                    gm1_02.a();
                    double d2 = gm1_02.p();
                    float f12 = (float)d2 * f5;
                    double d5 = gm1_02.p();
                    float f14 = (float)d5 * f5;
                    pointF = new PointF(f12, f14);
                    gm1_02.c();
                    continue block15;
                }
                case 10: {
                    bl2 = gm1_02.n();
                    continue block15;
                }
                case 9: {
                    double d2 = gm1_02.p();
                    f11 = (float)d2;
                    continue block15;
                }
                case 8: {
                    n8 = Xm1.a(gm1_02);
                    continue block15;
                }
                case 7: {
                    n7 = Xm1.a(gm1_02);
                    continue block15;
                }
                case 6: {
                    double d2 = gm1_02.p();
                    f8 = (float)d2;
                    continue block15;
                }
                case 5: {
                    double d2 = gm1_02.p();
                    f7 = (float)d2;
                    continue block15;
                }
                case 4: {
                    n4 = gm1_02.u();
                    continue block15;
                }
                case 3: {
                    int n10 = gm1_02.u();
                    object = Wr0$a.CENTER;
                    int n14 = ((Enum)object).ordinal();
                    if (n10 <= n14 && n10 >= 0) {
                        object = Wr0$a.values();
                        object2 = object[n10];
                        continue block15;
                    }
                    object2 = object;
                    continue block15;
                }
                case 2: {
                    double d2 = gm1_02.p();
                    f6 = (float)d2;
                    continue block15;
                }
                case 1: {
                    string3 = gm1_02.w();
                    continue block15;
                }
                case 0: 
            }
            string2 = gm1_02.w();
        }
        gm1_02.d();
        object = new Object();
        ((wr0_0)object).a = string2;
        ((wr0_0)object).b = string3;
        ((wr0_0)object).c = f6;
        ((wr0_0)object).d = object2;
        ((wr0_0)object).e = n4;
        ((wr0_0)object).f = f7;
        ((wr0_0)object).g = f8;
        ((wr0_0)object).h = n7;
        ((wr0_0)object).i = n8;
        ((wr0_0)object).j = f11;
        ((wr0_0)object).k = bl2;
        ((wr0_0)object).l = pointF;
        ((wr0_0)object).m = pointF2;
        return object;
    }
}

