/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

public final class rX {
    public static final boolean a(ArrayList object) {
        block12: {
            long l2;
            int n3;
            int n4;
            block11: {
                long l3;
                e72 e722;
                int n7;
                List list;
                block10: {
                    int n8 = object.size();
                    int n10 = 2;
                    n4 = 1;
                    if (n8 < n10) {
                        return n4;
                    }
                    n8 = ((ArrayList)object).size();
                    n10 = 0;
                    if (n8 && (n8 = ((ArrayList)object).size()) != n4) {
                        list = new ArrayList();
                        Object object2 = ((ArrayList)object).get(0);
                        n7 = xx_2.h(object);
                        int n14 = 0;
                        e722 = null;
                        while (n14 < n7) {
                            Object e2 = ((ArrayList)object).get(++n14);
                            Object object3 = e2;
                            object3 = (GY2)e2;
                            object2 = (GY2)object2;
                            aG2 aG22 = ((GY2)object2).e();
                            long l4 = aG22.b();
                            float f5 = e72.d(l4);
                            aG2 aG23 = ((GY2)object3).e();
                            float f6 = e72.d(aG23.b());
                            f5 = Math.abs(f5 - f6);
                            float f7 = e72.e(((GY2)object2).e().b());
                            object3 = ((GY2)object3).e();
                            long l7 = ((aG2)object3).b();
                            float f8 = e72.e(l7);
                            f7 = Math.abs(f7 - f8);
                            l3 = h72.a(f5, f7);
                            object2 = new Object(l3);
                            ((ArrayList)list).add(object2);
                            object2 = e2;
                        }
                    } else {
                        list = mz0_2.a;
                    }
                    object = list;
                    object = list;
                    n3 = object.size();
                    if (n3 != n4) break block10;
                    object = (e72)CollectionsKt.L(list);
                    l2 = ((e72)object).a;
                    break block11;
                }
                n3 = (int)(list.isEmpty() ? 1 : 0);
                if (n3 != 0) break block12;
                object = CollectionsKt.L(list);
                int n15 = xx_2.h(list);
                if (n4 <= n15) {
                    n7 = 1;
                    while (true) {
                        e722 = (e72)list.get(n7);
                        long l8 = e722.a;
                        l3 = ((e72)object).a;
                        l8 = e72.i(l3, l8);
                        object = new e72(l8);
                        if (n7 == n15) break;
                        ++n7;
                    }
                }
                object = (e72)object;
                l2 = ((e72)object).a;
            }
            float f11 = e72.d(l2);
            float f12 = e72.e(l2);
            n3 = (int)(f12 == f11 ? 0 : (f12 < f11 ? -1 : 1));
            if (n3 >= 0) {
                n4 = 0;
            }
            return n4;
        }
        object = new UnsupportedOperationException("Empty collection can't be reduced.");
        throw object;
    }
}

