/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class m13
implements qA3 {
    public static final m13 a;
    public static final Gm1$a b;

    static {
        m13 m132;
        a = m132 = new Object();
        b = Gm1$a.a("c", "v", "i", "o");
    }

    public final Object a(gm1_0 object, float f5) {
        Object object2;
        int n3;
        Object object3;
        Object object4 = ((gm1_0)object).z();
        if (object4 == (object3 = Gm1$b.BEGIN_ARRAY)) {
            ((gm1_0)object).a();
        }
        ((gm1_0)object).b();
        object4 = null;
        object3 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean bl2 = false;
        while (true) {
            int n4 = ((gm1_0)object).k();
            n3 = 1;
            if (n4 == 0) break;
            object2 = b;
            n4 = ((gm1_0)object).C((Gm1$a)object2);
            if (n4 != 0) {
                if (n4 != n3) {
                    n3 = 2;
                    if (n4 != n3) {
                        n3 = 3;
                        if (n4 != n3) {
                            ((gm1_0)object).G();
                            ((gm1_0)object).H();
                            continue;
                        }
                        arrayList2 = Xm1.c((gm1_0)object, f5);
                        continue;
                    }
                    arrayList = Xm1.c((gm1_0)object, f5);
                    continue;
                }
                object4 = Xm1.c((gm1_0)object, f5);
                continue;
            }
            bl2 = ((gm1_0)object).n();
        }
        ((gm1_0)object).d();
        Gm1$b gm1$b = ((gm1_0)object).z();
        object2 = Gm1$b.END_ARRAY;
        if (gm1$b == object2) {
            ((gm1_0)object).c();
        }
        if (object4 != null && arrayList != null && arrayList2 != null) {
            int n7 = object4.isEmpty();
            if (n7 != 0) {
                gm1$b = new PointF();
                object4 = Collections.emptyList();
                object = new l13((PointF)gm1$b, false, (List)object4);
            } else {
                n7 = object4.size();
                gm1$b = (PointF)object4.get(0);
                object2 = new ArrayList(n7);
                for (int i3 = 1; i3 < n7; ++i3) {
                    PointF pointF = (PointF)object4.get(i3);
                    int n8 = i3 + -1;
                    PointF pointF2 = (PointF)object4.get(n8);
                    PointF pointF3 = (PointF)arrayList2.get(n8);
                    Object object5 = (PointF)arrayList.get(i3);
                    pointF3 = mp1_0.a(pointF2, pointF3);
                    pointF2 = mp1_0.a(pointF, object5);
                    object5 = new Oe0(pointF3, pointF2, pointF);
                    ((ArrayList)object2).add(object5);
                }
                if (bl2) {
                    PointF pointF = (PointF)object4.get(0);
                    object4 = (PointF)object4.get(n7 -= n3);
                    object = (PointF)arrayList2.get(n7);
                    object3 = (PointF)arrayList.get(0);
                    object = mp1_0.a((PointF)object4, (PointF)object);
                    object4 = mp1_0.a(pointF, (PointF)object3);
                    object3 = new Oe0((PointF)object, (PointF)object4, pointF);
                    ((ArrayList)object2).add(object3);
                }
                object = new l13((PointF)gm1$b, bl2, (List)object2);
            }
            return object;
        }
        object = new IllegalArgumentException("Shape data was missing information.");
        throw object;
    }
}

