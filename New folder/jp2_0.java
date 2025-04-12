/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from JP2
 */
public final class jp2_0
extends Xp1$e {
    public static final jp2_0 b;

    static {
        jp2_0 jp2_02;
        b = jp2_02 = new Xp1$e("Undefined intrinsics block and it is required");
    }

    public final bl1_0 c(dl1_1 object, List object2, long l2) {
        int n3 = object2.isEmpty();
        if (n3 != 0) {
            int n4 = c60.k(l2);
            int n7 = c60.j(l2);
            JP2$a jP2$a = JP2$a.c;
            object = cl1_0.a((dl1_1)object, n4, n7, jP2$a);
        } else {
            n3 = object2.size();
            int n8 = 1;
            int n10 = 0;
            if (n3 == n8) {
                object2 = ((xk1_0)object2.get(0)).Q(l2);
                n3 = f60.h(((Ns2)object2).a, l2);
                n8 = ((Ns2)object2).b;
                int n14 = f60.g(n8, l2);
                JP2$b jP2$b = new JP2$b((Ns2)object2);
                object = cl1_0.a((dl1_1)object, n3, n14, jP2$b);
            } else {
                Ns2 ns2;
                int n15;
                n8 = object2.size();
                ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n8);
                n8 = object2.size();
                for (n15 = 0; n15 < n8; ++n15) {
                    ns2 = ((xk1_0)object2.get(n15)).Q(l2);
                    arrayList.add(ns2);
                }
                int n16 = arrayList.size();
                n8 = 0;
                n15 = 0;
                while (n10 < n16) {
                    ns2 = (Ns2)arrayList.get(n10);
                    int n17 = ns2.a;
                    n8 = Math.max(n17, n8);
                    int n18 = ns2.b;
                    n15 = Math.max(n18, n15);
                    ++n10;
                }
                n16 = f60.h(n8, l2);
                int n19 = f60.g(n15, l2);
                JP2$c jP2$c = new JP2$c(arrayList);
                object = cl1_0.a((dl1_1)object, n16, n19, jP2$c);
            }
        }
        return object;
    }
}

