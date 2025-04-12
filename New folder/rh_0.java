/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from rh
 */
public final class rh_0
implements al1_1 {
    public static final rh_0 a;

    static {
        rh_0 rh_02;
        a = rh_02 = new Object();
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List object, long l2) {
        int n3;
        int n4;
        Object object2;
        int n7;
        int n8 = object.size();
        ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n8);
        n8 = object.size();
        Object var7_6 = null;
        Ns2 ns2 = null;
        for (n7 = 0; n7 < n8; ++n7) {
            object2 = ((xk1_0)object.get(n7)).Q(l2);
            arrayList.add((Ns2)object2);
        }
        int n10 = arrayList.isEmpty();
        n8 = 1;
        n7 = 0;
        ns2 = null;
        if (n10 != 0) {
            n10 = 0;
            object = null;
        } else {
            object2 = object = arrayList.get(0);
            object2 = (Ns2)object;
            n4 = ((Ns2)object2).a;
            int n14 = xx_2.h(arrayList);
            if (n8 <= n14) {
                n3 = 1;
                while (true) {
                    Object e2;
                    Object object3 = e2 = arrayList.get(n3);
                    object3 = (Ns2)e2;
                    int n15 = ((Ns2)object3).a;
                    if (n4 < n15) {
                        object = e2;
                        n4 = n15;
                    }
                    if (n3 == n14) break;
                    ++n3;
                }
            }
        }
        object = (Ns2)object;
        n10 = object != null ? ((Ns2)object).a : c60.k(l2);
        n4 = (int)(arrayList.isEmpty() ? 1 : 0);
        if (n4 == 0) {
            var7_6 = arrayList.get(0);
            ns2 = var7_6;
            ns2 = var7_6;
            n7 = ns2.b;
            n4 = xx_2.h(arrayList);
            if (n8 <= n4) {
                while (true) {
                    Object e5;
                    Object object4 = e5 = arrayList.get(n8);
                    object4 = (Ns2)e5;
                    n3 = ((Ns2)object4).b;
                    if (n7 < n3) {
                        var7_6 = e5;
                        n7 = n3;
                    }
                    if (n8 == n4) break;
                    ++n8;
                }
            }
            ns2 = var7_6;
        }
        ns2 = ns2;
        int n16 = ns2 != null ? ns2.b : c60.j(l2);
        rh$a rh$a = new rh$a(arrayList);
        return cl1_0.a(dl1_12, n10, n16, rh$a);
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }
}

