/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Xk2
 */
public final class xk2_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Cl2 c;
    public final /* synthetic */ bp1_0 d;
    public final /* synthetic */ float e;

    public xk2_1(hm0_0 hm0_02, bp1_0 bp1_02, float f5) {
        this.c = hm0_02;
        this.d = bp1_02;
        this.e = f5;
        super(3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        float f5;
        float f6;
        boolean bl2;
        object = (Number)object;
        float f7 = ((Number)object).floatValue();
        object2 = (Number)object2;
        float f8 = ((Number)object2).floatValue();
        object3 = (Number)object3;
        float f11 = ((Number)object3).floatValue();
        Cl2 cl2 = this.c;
        pg2_0 pg2_02 = cl2.l().a();
        pg2_0 pg2_03 = pg2_0.Vertical;
        int n3 = 0;
        float f12 = 0.0f;
        int n4 = 1;
        float f14 = Float.MIN_VALUE;
        if (pg2_02 == pg2_03) {
            Cl2 cl22 = cl2;
            hm0_0 hm0_02 = (hm0_0)cl2;
            bl2 = Bl2.b(hm0_02);
        } else {
            bp1_0 bp1_02 = this.d;
            bp1_0 bp1_03 = bp1_0.Ltr;
            if (bp1_02 == bp1_03) {
                Cl2 cl23 = cl2;
                hm0_0 hm0_03 = (hm0_0)cl2;
                bl2 = Bl2.b(hm0_03);
            } else {
                Cl2 cl24 = cl2;
                hm0_0 hm0_04 = (hm0_0)cl2;
                bl2 = Bl2.b(hm0_04);
                if (!bl2) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    Object var8_16 = null;
                }
            }
        }
        kl2_1 kl2_12 = cl2.l();
        int n7 = kl2_12.getPageSize();
        if (n7 == 0) {
            f6 = 0.0f;
            Object var17_29 = null;
        } else {
            Cl2 cl25 = cl2;
            cl25 = (hm0_0)cl2;
            f6 = Bl2.a((hm0_0)cl25);
            f5 = n7;
            f6 /= f5;
        }
        n7 = (int)f6;
        f5 = n7;
        f5 = f6 - f5;
        Vo0 vo0 = cl2.p;
        float f15 = Math.abs(f7);
        float f16 = r83_0.a;
        float f17 = vo0.J0(f16);
        int n8 = 2;
        f16 = 2.8E-45f;
        float f18 = f15 == f17 ? 0 : (f15 < f17 ? -1 : 1);
        if (f18 >= 0) {
            float f19 = f7 - 0.0f;
            Object object4 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
            if (object4 > 0) {
                n3 = 1;
                f12 = Float.MIN_VALUE;
            } else {
                n3 = 2;
                f12 = 2.8E-45f;
            }
        }
        if (n3 == 0) {
            f7 = Math.abs(f5);
            float f20 = f7 - (f5 = this.e);
            Object object5 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
            if (object5 > 0) {
                if (!bl2) return Float.valueOf(f8);
            } else {
                float f22;
                float f23;
                f7 = Math.abs(f6);
                Vo0 vo02 = cl2.p;
                f12 = El2.a;
                f5 = vo02.J0(f12);
                n3 = cl2.n();
                f12 = n3;
                n4 = 0x40000000;
                f14 = 2.0f;
                f5 = Math.min(f5, f12 /= f14);
                int n10 = cl2.n();
                float f24 = n10;
                float f25 = f7 - (f24 = Math.abs(f5 /= f24));
                Object object6 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                if (object6 >= 0 ? bl2 : (f23 = (f22 = (f7 = Math.abs(f8)) - (f24 = Math.abs(f11))) == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1)) < 0) {
                    return Float.valueOf(f8);
                }
            }
        } else if (n3 != n4) {
            if (n3 == n8) return Float.valueOf(f8);
            f8 = 0.0f;
            return Float.valueOf(f8);
        }
        f8 = f11;
        return Float.valueOf(f8);
    }
}

