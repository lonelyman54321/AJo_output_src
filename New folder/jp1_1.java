/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from jP1
 */
public final class jp1_1 {
    public static jp1_1 h;
    public final bp1_0 a;
    public final xm3 b;
    public final Vo0 c;
    public final RU0$a d;
    public final xm3 e;
    public float f;
    public float g;

    public jp1_1(bp1_0 object, xm3 xm32, Wo0 wo0, RU0$a rU0$a) {
        float f5;
        this.a = object;
        this.b = xm32;
        this.c = wo0;
        this.d = rU0$a;
        object = ym3.a(xm32, object);
        this.e = object;
        this.f = f5 = 0.0f / 0.0f;
        this.g = f5;
    }

    public final long a(int n3, long l2) {
        int n4;
        jp1_1 jp1_12 = this;
        int n7 = n3;
        float f5 = this.g;
        float f6 = this.f;
        int n8 = Float.isNaN(f5);
        int n10 = 0;
        if (n8 != 0 || (n8 = Float.isNaN(f6)) != 0) {
            String string2 = kP1.a;
            n4 = 15;
            long l3 = f60.b(0, 0, n4);
            xm3 xm32 = jp1_12.e;
            Vo0 vo0 = jp1_12.c;
            RU0$a rU0$a = jp1_12.d;
            gi_0 gi_02 = wm2_0.a(string2, xm32, l3, vo0, rU0$a, null, 1, 96);
            f6 = gi_02.getHeight();
            string2 = kP1.b;
            l3 = f60.b(0, 0, n4);
            int n14 = 2;
            xm32 = jp1_12.e;
            vo0 = jp1_12.c;
            rU0$a = jp1_12.d;
            int n15 = 96;
            gi_0 gi_03 = wm2_0.a(string2, xm32, l3, vo0, rU0$a, null, n14, n15);
            f5 = gi_03.getHeight() - f6;
            jp1_12.g = f6;
            jp1_12.f = f5;
            float f7 = f6;
            f6 = f5;
            f5 = f7;
        }
        if (n7 != (n8 = 1)) {
            float f8 = n7 - n8;
            if ((n7 = Math.round(f6 = f6 * f8 + f5)) >= 0) {
                n10 = n7;
            }
            n7 = c60.h(l2);
            if (n10 > n7) {
                n10 = n7;
            }
        } else {
            n10 = c60.j(l2);
        }
        n7 = c60.h(l2);
        n4 = c60.k(l2);
        int n16 = c60.i(l2);
        return f60.a(n4, n16, n10, n7);
    }
}

