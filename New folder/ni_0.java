/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Ni
 */
public final class ni_0
implements al1_1 {
    public static final ni_0 a;

    static {
        ni_0 ni_02;
        a = ni_02 = new Object();
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 object, List object2, long l2) {
        int n3 = object2.size();
        int n4 = 0;
        if (n3 != 0) {
            int n7 = 1;
            if (n3 != n7) {
                int n8;
                int n10;
                n7 = object2.size();
                ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n7);
                n7 = object2.size();
                for (n10 = 0; n10 < n7; ++n10) {
                    Ns2 ns2 = ((xk1_0)object2.get(n10)).Q(l2);
                    arrayList.add(ns2);
                }
                int n14 = xx_2.h(arrayList);
                if (n14 >= 0) {
                    int n15 = 0;
                    n8 = 0;
                    while (true) {
                        Ns2 ns2 = (Ns2)arrayList.get(n4);
                        n10 = ns2.a;
                        n15 = Math.max(n15, n10);
                        n7 = ns2.b;
                        n8 = Math.max(n8, n7);
                        if (n4 == n14) break;
                        ++n4;
                    }
                    n4 = n15;
                } else {
                    n8 = 0;
                }
                object2 = new Ni$c(arrayList);
                object = cl1_0.a((dl1_1)object, n4, n8, (Function1)object2);
            } else {
                object2 = ((xk1_0)object2.get(0)).Q(l2);
                int n16 = ((Ns2)object2).a;
                int n17 = ((Ns2)object2).b;
                Ni$b ni$b = new Ni$b((Ns2)object2);
                object = cl1_0.a((dl1_1)object, n16, n17, ni$b);
            }
        } else {
            object2 = ni$a_0.c;
            object = cl1_0.a((dl1_1)object, 0, 0, (Function1)object2);
        }
        return object;
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

