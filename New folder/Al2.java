/*
 * Decompiled with CFR 0.152.
 */
import kotlin.ranges.f;

public final class Al2
implements s83_0 {
    public final /* synthetic */ Cl2 a;
    public final /* synthetic */ gx0_2 b;
    public final /* synthetic */ zl2 c;

    public Al2(hm0_0 hm0_02, xk2_1 xk2_12, zl2 zl22) {
        this.a = hm0_02;
        this.b = xk2_12;
        this.c = zl22;
    }

    public final float a(float f5) {
        float f6;
        Object object;
        float f7;
        Al2 al2 = this;
        Object object2 = this.a;
        Object object3 = ((Cl2)object2).l().m();
        Object object4 = ((Cl2)object2).l().h();
        int n3 = object4.size();
        boolean bl2 = false;
        Float f8 = null;
        float f11 = 1.0f / 0.0f;
        float f12 = -1.0f / 0.0f;
        int n4 = 0;
        gx0_2 gx0_22 = null;
        float f14 = -1.0f / 0.0f;
        float f15 = 1.0f / 0.0f;
        while (true) {
            float f16;
            int n7 = 0;
            f7 = 0.0f;
            if (n4 >= n3) break;
            Mk2 mk2 = (Mk2)object4.get(n4);
            kl2_1 kl2_12 = ((Cl2)object2).l();
            kl2_12.a();
            kl2_12.b();
            ((Cl2)object2).l().e();
            ((Cl2)object2).l().c();
            kl2_12 = ((Cl2)object2).l();
            kl2_12.getPageSize();
            int n8 = mk2.getOffset();
            ((Cl2)object2).m();
            object3.getClass();
            float f17 = 0.0f;
            float f18 = (float)n8 - f17;
            float f19 = f18 - 0.0f;
            float f20 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
            if (f20 <= 0 && (f20 = f18 == f14 ? 0 : (f18 > f14 ? 1 : -1)) > 0) {
                f14 = f18;
            }
            if ((n7 = (f16 = f18 - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1)) >= 0 && (n7 = (int)(f18 == f15 ? 0 : (f18 < f15 ? -1 : 1))) < 0) {
                f15 = f18;
            }
            ++n4;
        }
        Object object5 = f14 == f12 ? 0 : (f14 < f12 ? -1 : 1);
        if (object5 == false) {
            f14 = f15;
        }
        if ((object5 = f15 == f11 ? 0 : (f15 < f11 ? -1 : 1)) == false) {
            f15 = f14;
        }
        object3 = object2;
        object3 = (hm0_0)object2;
        float f22 = Bl2.a((hm0_0)object3);
        n3 = 1;
        float f23 = f22 - 0.0f;
        Object object6 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
        if (object6 == false) {
            bl2 = true;
        }
        object6 = bl2 ^ true;
        n3 = (int)(((Cl2)object2).d() ? 1 : 0);
        if (n3 == 0) {
            if (object6 != false && (n3 = (int)(Bl2.b((hm0_0)object3) ? 1 : 0)) != 0) {
                f14 = 0.0f;
            }
            f15 = 0.0f;
        }
        if (!(object = ((Cl2)object2).c())) {
            if (object6 != false && !(object = Bl2.b((hm0_0)object3))) {
                f14 = 0.0f;
                f15 = 0.0f;
            } else {
                f14 = 0.0f;
            }
        }
        object2 = Float.valueOf(f14);
        object3 = Float.valueOf(f15);
        float f24 = ((Number)object2).floatValue();
        float f25 = ((Number)object3).floatValue();
        object4 = Float.valueOf(f5);
        gx0_22 = al2.b;
        Float f26 = Float.valueOf(f24);
        f22 = ((Number)(object4 = (Number)gx0_22.invoke(object4, f26, f8 = Float.valueOf(f25)))).floatValue();
        float f27 = f22 - f24;
        n3 = (int)(f27 == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1));
        if (n3 == 0 || (n3 = (int)(f22 == f25 ? 0 : (f22 < f25 ? -1 : 1))) == 0 || (n3 = (int)((f6 = f22 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) == 0) {
            object = f22 == f11 ? 0 : (f22 < f11 ? -1 : 1);
            if (object && (object = f22 == f12 ? 0 : (f22 < f12 ? -1 : 1))) {
                f7 = f22;
            }
            return f7;
        }
        object4 = new StringBuilder("Final Snapping Offset Should Be one of ");
        ((StringBuilder)object4).append(f24);
        ((StringBuilder)object4).append(", ");
        ((StringBuilder)object4).append(f25);
        ((StringBuilder)object4).append(" or 0.0");
        object2 = ((StringBuilder)object4).toString();
        object2 = object2.toString();
        object3 = new IllegalStateException((String)object2);
        throw object3;
    }

    public final float b(float f5, float f6) {
        Cl2 cl2 = this.a;
        int n3 = cl2.n();
        vl2 vl22 = (vl2)cl2.o.getValue();
        int n4 = vl22.c + n3;
        n3 = 0;
        if (n4 == 0) {
            return 0.0f;
        }
        float f7 = f5 - 0.0f;
        n3 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
        n3 = n3 < 0 ? cl2.d + 1 : cl2.d;
        float f8 = n4;
        int n7 = (int)(f6 /= f8) + n3;
        int n8 = cl2.m();
        int n10 = 0;
        n7 = f.g(n7, 0, n8);
        cl2.n();
        n8 = ((vl2)cl2.o.getValue()).c;
        zl2 zl22 = this.c;
        n7 = zl22.a(n3, n7);
        int n14 = cl2.m();
        n7 = Math.abs((f.g(n7, 0, n14) - n3) * n4) - n4;
        if (n7 >= 0) {
            n10 = n7;
        }
        if (n10 == 0) {
            f5 = n10;
        } else {
            f6 = n10;
            f5 = Math.signum(f5) * f6;
        }
        return f5;
    }
}

