/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from UP2
 */
public final class up2_0
implements t13,
iw$a {
    public final yc1_1 a;
    public final iw_0 b;
    public l13 c;

    public up2_0(yc1_1 object, kw_1 kw_12, TP2 tP2) {
        this.a = object;
        tP2.getClass();
        object = tP2.a.a();
        this.b = object;
        kw_12.g((iw_0)object);
        ((iw_0)object).a(this);
    }

    public static int c(int n3, int n4) {
        int n7 = n3 / n4;
        int n8 = n3 ^ n4;
        if (n8 < 0 && (n8 = n7 * n4) != n3) {
            n7 += -1;
        }
        return n3 - (n7 *= n4);
    }

    public final void a() {
        this.a.invalidateSelf();
    }

    public final void b(List list, List list2) {
    }

    public final void d(iw$a iw$a) {
        this.b.a(iw$a);
    }

    public final l13 e(l13 l132) {
        l13 l133;
        float f5;
        int n3;
        Object object;
        int n4;
        Object object2;
        Oe0 oe0;
        int n7;
        int n8;
        Oe0 oe02;
        int n10;
        up2_0 up2_02 = this;
        Object object3 = l132;
        Object object4 = l132.a;
        int n14 = ((ArrayList)object4).size();
        if (n14 <= (n10 = 2)) {
            return l132;
        }
        Float f6 = (Float)this.b.f();
        float f7 = f6.floatValue();
        n10 = 0;
        l13 l134 = null;
        float f8 = f7 - 0.0f;
        Object object5 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object5 == false) {
            return l132;
        }
        Object object6 = l132.a;
        int n15 = l132.c;
        int n16 = ((ArrayList)object6).size();
        int n17 = 1;
        float f11 = Float.MIN_VALUE;
        n16 -= n17;
        int n18 = 0;
        float f12 = 0.0f;
        PointF pointF = null;
        int n19 = 0;
        PointF pointF2 = null;
        while (n16 >= 0) {
            oe02 = (Oe0)object6.get(n16);
            n8 = n16 + -1;
            n7 = object6.size();
            n8 = up2_0.c(n8, n7);
            oe0 = (Oe0)object6.get(n8);
            object2 = n16 == 0 && n15 == 0 ? ((l13)object3).b : oe0.c;
            oe0 = n16 == 0 && n15 == 0 ? object2 : oe0.b;
            oe02 = oe02.a;
            n4 = ((l13)object3).c;
            if (n4 == 0 && (n16 == 0 || n16 == (n4 = object6.size() - n17))) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            n8 = (int)(oe0.equals(object2) ? 1 : 0);
            n19 = n8 != 0 && (n3 = (int)(oe02.equals(object2) ? 1 : 0)) != 0 && n4 == 0 ? (n19 += 2) : ++n19;
            n16 += -1;
        }
        object6 = up2_02.c;
        if (object6 == null || (object5 = (Object)((ArrayList)(object6 = ((l13)object6).a)).size()) != n19) {
            object6 = new ArrayList(n19);
            f5 = 0.0f;
            l133 = null;
            for (n16 = 0; n16 < n19; ++n16) {
                oe02 = new Oe0();
                ((ArrayList)object6).add(oe02);
            }
            pointF2 = new PointF(0.0f, 0.0f);
            up2_02.c = l133 = new l13(pointF2, false, (List)object6);
        }
        l134 = up2_02.c;
        l134.c = n15;
        object6 = ((l13)object3).b;
        float f14 = ((PointF)object6).x;
        float f15 = ((PointF)object6).y;
        l134.a(f14, f15);
        object6 = l134.a;
        n15 = ((l13)object3).c;
        n16 = 0;
        f5 = 0.0f;
        l133 = null;
        n19 = 0;
        pointF2 = null;
        while (n16 < (n3 = object4.size())) {
            PointF pointF3;
            int n20;
            int n21;
            float f16;
            int n22;
            Object object7;
            PointF pointF4;
            oe02 = (Oe0)object4.get(n16);
            n8 = n16 + -1;
            n7 = object4.size();
            n8 = up2_0.c(n8, n7);
            oe0 = (Oe0)object4.get(n8);
            n7 = n16 + -2;
            n4 = object4.size();
            n7 = up2_0.c(n7, n4);
            object2 = (Oe0)object4.get(n7);
            object = n16 == 0 && n15 == 0 ? ((l13)object3).b : oe0.c;
            Object object8 = n16 == 0 && n15 == 0 ? object : oe0.b;
            pointF = oe02.a;
            object2 = ((Oe0)object2).c;
            n17 = (int)(((l13)object3).c ? 1 : 0);
            if (n17 == 0 && (n16 == 0 || n16 == (n17 = object4.size() + -1))) {
                n17 = 1;
                f11 = Float.MIN_VALUE;
            } else {
                n17 = 0;
                f11 = 0.0f;
                pointF4 = null;
            }
            boolean bl2 = object8.equals(object);
            if (bl2 && (n18 = pointF.equals(object)) != 0 && n17 == 0) {
                f11 = ((PointF)object).x;
                f12 = ((PointF)object2).x;
                f12 = f11 - f12;
                float f17 = ((PointF)object).y;
                float f18 = ((PointF)object2).y;
                f18 = f17 - f18;
                oe02 = oe02.c;
                float f19 = ((PointF)oe02).x - f11;
                f11 = ((PointF)oe02).y - f17;
                object7 = object4;
                double d2 = f12;
                n18 = n15;
                n22 = n16;
                double d5 = f18;
                d2 = Math.hypot(d2, d5);
                f16 = (float)d2;
                d5 = f19;
                n21 = n15;
                double d7 = f11;
                d5 = Math.hypot(d5, d7);
                float f20 = (float)d5;
                f16 = f7 / f16;
                n15 = 0x3F000000;
                f14 = 0.5f;
                f16 = Math.min(f16, f14);
                f20 = Math.min(f7 / f20, f14);
                f14 = ((PointF)object).x;
                f5 = xu0_1.a(((PointF)object2).x, f14, f16, f14);
                f11 = ((PointF)object).y;
                f16 = xu0_1.a(((PointF)object2).y, f11, f16, f11);
                f12 = xu0_1.a(((PointF)oe02).x, f14, f20, f14);
                f20 = xu0_1.a(((PointF)oe02).y, f11, f20, f11);
                float f22 = f5 - f14;
                f17 = 0.5519f;
                f22 *= f17;
                f22 = f5 - f22;
                float f23 = (f16 - f11) * f17;
                f23 = f16 - f23;
                f14 = (f12 - f14) * f17;
                f14 = f12 - f14;
                f11 = (f20 - f11) * f17;
                f11 = f20 - f11;
                n8 = n19 + -1;
                n4 = ((ArrayList)object6).size();
                n8 = up2_0.c(n8, n4);
                oe0 = (Oe0)object6.get(n8);
                object = (Oe0)object6.get(n19);
                object8 = oe0.b;
                object8.set(f5, f16);
                oe0 = oe0.c;
                oe0.set(f5, f16);
                if (n16 == 0) {
                    l134.a(f5, f16);
                }
                ((Oe0)object).a.set(f22, f23);
                n20 = n19 + 1;
                object3 = (Oe0)object6.get(n20);
                l133 = ((Oe0)object).b;
                l133.set(f14, f11);
                pointF3 = ((Oe0)object).c;
                pointF3.set(f12, f20);
                object3 = ((Oe0)object3).a;
                object3.set(f12, f20);
                n19 += 2;
            } else {
                object7 = object4;
                n21 = n15;
                n22 = n16;
                n20 = n19 + -1;
                int n24 = ((ArrayList)object6).size();
                n20 = up2_0.c(n20, n24);
                object3 = (Oe0)object6.get(n20);
                object4 = (Oe0)object6.get(n19);
                pointF3 = oe0.b;
                f5 = pointF3.x;
                f14 = pointF3.y;
                pointF4 = ((Oe0)object3).b;
                pointF4.set(f5, f14);
                pointF3 = oe0.c;
                f5 = pointF3.x;
                f14 = pointF3.y;
                ((Oe0)object3).c.set(f5, f14);
                object3 = oe02.a;
                f14 = ((PointF)object3).x;
                f16 = ((PointF)object3).y;
                object4 = ((Oe0)object4).a;
                object4.set(f14, f16);
                ++n19;
            }
            n16 = n22 + 1;
            object3 = l132;
            n15 = n21;
            object4 = object7;
            n17 = 1;
            f11 = Float.MIN_VALUE;
            n18 = 0;
            f12 = 0.0f;
            pointF = null;
            up2_02 = this;
        }
        return l134;
    }
}

