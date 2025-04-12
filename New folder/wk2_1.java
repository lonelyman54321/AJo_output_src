/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

/*
 * Renamed from Wk2
 */
public final class wk2_1
implements UD {
    public final Cl2 b;
    public final UD c;
    public final Gl d;

    public wk2_1(hm0_0 object, UD uD) {
        this.b = object;
        this.c = uD;
        this.d = object = uD.b();
    }

    public final float a(float f5, float f6, float f7) {
        f5 = this.c.a(f5, f6, f7);
        Cl2 cl2 = this.b;
        boolean bl2 = false;
        float f8 = 0.0f;
        Boolean bl3 = null;
        float f11 = f5 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object == false) {
            int n3 = cl2.e;
            if (n3 != 0) {
                f5 = n3;
                f8 = -1.0f;
                f5 *= f8;
                bl3 = (Boolean)cl2.E.getValue();
                bl2 = bl3;
                if (bl2) {
                    int n4 = cl2.o();
                    f6 = n4;
                    f5 += f6;
                }
                f6 = -f7;
                f8 = f.f(f5, f6, f7);
            }
        } else {
            float f12;
            int n7 = cl2.e;
            f7 = n7;
            int n8 = -1;
            float f14 = n8;
            f7 *= f14;
            while ((n8 = (int)((f12 = f5 - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) > 0 && (n8 = (int)(f7 == f5 ? 0 : (f7 < f5 ? -1 : 1))) < 0) {
                n8 = cl2.o();
                f14 = n8;
                f7 += f14;
            }
            f8 = f7;
            while (object < 0 && (n7 = (int)(f8 == f5 ? 0 : (f8 > f5 ? 1 : -1))) > 0) {
                n7 = cl2.o();
                f7 = n7;
                f8 -= f7;
            }
        }
        return f8;
    }

    public final Gl b() {
        return this.d;
    }
}

