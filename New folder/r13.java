/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 */
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class r13
extends iw_0 {
    public final l13 i;
    public final Path j;
    public Path k;
    public Path l;
    public List m;

    public r13(List object) {
        super((List)object);
        this.i = object = new l13();
        object = new Path();
        this.j = object;
    }

    public final Object g(Bo1 bo1, float f5) {
        float f6;
        Object object;
        int n3;
        Oe0 oe0;
        Object object2;
        float f7;
        r13 r132 = this;
        Object object3 = bo1;
        float f8 = f5;
        Object object4 = (l13)bo1.b;
        l13 l132 = (l13)bo1.c;
        Object object5 = l132 == null ? object4 : l132;
        Object object6 = r132.i;
        Object object7 = ((l13)object6).b;
        if (object7 == null) {
            object7 = new PointF();
            ((l13)object6).b = object7;
        }
        boolean bl2 = ((l13)object4).c;
        int n4 = 1;
        float f11 = Float.MIN_VALUE;
        if (!bl2 && !(bl2 = ((l13)object5).c)) {
            bl2 = false;
            f7 = 0.0f;
            object7 = null;
        } else {
            bl2 = true;
            f7 = Float.MIN_VALUE;
        }
        ((l13)object6).c = bl2;
        object7 = ((l13)object4).a;
        int n7 = ((ArrayList)object7).size();
        Object object8 = ((l13)object5).a;
        int n8 = ((ArrayList)object8).size();
        ArrayList arrayList = ((l13)object5).a;
        if (n7 != n8) {
            object2 = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            n8 = ((ArrayList)object7).size();
            ((StringBuilder)object2).append(n8);
            object8 = "\tShape 2: ";
            ((StringBuilder)object2).append((String)object8);
            n8 = arrayList.size();
            ((StringBuilder)object2).append(n8);
            object2 = ((StringBuilder)object2).toString();
            rx1.b((String)object2);
        }
        n7 = ((ArrayList)object7).size();
        n8 = arrayList.size();
        n7 = Math.min(n7, n8);
        object8 = ((l13)object6).a;
        int n10 = ((ArrayList)object8).size();
        if (n10 < n7) {
            for (n10 = ((ArrayList)object8).size(); n10 < n7; ++n10) {
                oe0 = new Oe0();
                ((ArrayList)object8).add(oe0);
            }
        } else {
            n10 = ((ArrayList)object8).size();
            if (n10 > n7) {
                for (n10 = ((ArrayList)object8).size() - n4; n10 >= n7; n10 += -1) {
                    int n14 = ((ArrayList)object8).size() - n4;
                    ((ArrayList)object8).remove(n14);
                }
            }
        }
        object2 = ((l13)object4).b;
        object5 = ((l13)object5).b;
        float f12 = ((PointF)object2).x;
        float f14 = ((PointF)object5).x;
        f12 = mp1_0.f(f12, f14, f8);
        float f15 = ((PointF)object2).y;
        float f16 = ((PointF)object5).y;
        f16 = mp1_0.f(f15, f16, f8);
        ((l13)object6).a(f12, f16);
        for (n3 = ((ArrayList)object8).size() - n4; n3 >= 0; n3 += -1) {
            object2 = (Oe0)((ArrayList)object7).get(n3);
            Oe0 oe02 = (Oe0)arrayList.get(n3);
            oe0 = ((Oe0)object2).a;
            PointF pointF = oe02.a;
            Oe0 oe03 = (Oe0)((ArrayList)object8).get(n3);
            f11 = ((PointF)oe0).x;
            object = object6;
            f6 = pointF.x;
            f6 = mp1_0.f(f11, f6, f8);
            f11 = ((PointF)oe0).y;
            f14 = pointF.y;
            f11 = mp1_0.f(f11, f14, f8);
            oe0 = oe03.a;
            oe0.set(f6, f11);
            object6 = (Oe0)((ArrayList)object8).get(n3);
            PointF pointF2 = ((Oe0)object2).b;
            f14 = pointF2.x;
            pointF = oe02.b;
            float f17 = pointF.x;
            f14 = mp1_0.f(f14, f17, f8);
            f11 = pointF2.y;
            float f18 = pointF.y;
            f11 = mp1_0.f(f11, f18, f8);
            ((Oe0)object6).b.set(f14, f11);
            object6 = (Oe0)((ArrayList)object8).get(n3);
            pointF2 = ((Oe0)object2).c;
            f15 = pointF2.x;
            oe02 = oe02.c;
            f14 = ((PointF)oe02).x;
            f15 = mp1_0.f(f15, f14, f8);
            f11 = pointF2.y;
            f12 = ((PointF)oe02).y;
            f11 = mp1_0.f(f11, f12, f8);
            ((Oe0)object6).c.set(f15, f11);
            object6 = object;
            n4 = 1;
            f11 = Float.MIN_VALUE;
        }
        object = object6;
        object5 = r132.m;
        if (object5 != null) {
            n3 = object5.size();
            int n15 = 1;
            f6 = Float.MIN_VALUE;
            n3 -= n15;
            while (n3 >= 0) {
                object7 = (t13)r132.m.get(n3);
                object6 = object7.e((l13)object6);
                n3 += -1;
            }
        }
        object5 = r132.j;
        mp1_0.e((l13)object6, (Path)object5);
        object6 = r132.e;
        if (object6 != null) {
            object5 = r132.k;
            if (object5 == null) {
                object5 = new Path();
                r132.k = object5;
                object5 = new Path();
                r132.l = object5;
            }
            object5 = r132.k;
            mp1_0.e((l13)object4, (Path)object5);
            if (l132 != null) {
                object4 = r132.l;
                mp1_0.e(l132, (Path)object4);
            }
            object4 = r132.e;
            object5 = ((Bo1)object3).h;
            f16 = ((Float)object5).floatValue();
            object6 = r132.k;
            if (l132 == null) {
                object7 = object6;
            } else {
                l132 = r132.l;
                object7 = l132;
            }
            f11 = this.e();
            f15 = r132.d;
            float f19 = ((Bo1)object3).g;
            object3 = object4;
            float f20 = f19;
            f19 = f16;
            object5 = object6;
            object6 = object7;
            f8 = f5;
            f7 = f11;
            f11 = f15;
            object5 = object3 = ((LC1)object4).b(f20, f16, object5, object7, f5, f7, f15);
            object5 = (Path)object3;
        }
        return object5;
    }

    public final boolean l() {
        boolean bl2;
        List list = this.m;
        if (list != null && !(bl2 = list.isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            list = null;
        }
        return bl2;
    }
}

