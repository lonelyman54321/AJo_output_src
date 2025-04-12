/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class e83
implements al1_1 {
    public static final e83 a;

    static {
        e83 e832;
        a = e832 = new Object();
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3 = list.size();
        ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n3);
        n3 = list.size();
        int n4 = -1 << -1;
        boolean bl2 = false;
        int n7 = -1 << -1;
        int n8 = -1 << -1;
        int n10 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Ns2 ns2 = ((xk1_0)list.get(i3)).Q(l2);
            arrayList.add(ns2);
            m91 m912 = Pc.a;
            int n14 = ns2.U(m912);
            if (n14 != n4 && (n7 == n4 || (n14 = ns2.U(m912)) < n7)) {
                n7 = ns2.U(m912);
            }
            if ((n14 = ns2.U(m912 = Pc.b)) != n4 && (n8 == n4 || (n14 = ns2.U(m912)) > n8)) {
                n8 = ns2.U(m912);
            }
            int n15 = ns2.b;
            n10 = Math.max(n10, n15);
        }
        if (n7 != n4 && n8 != n4) {
            bl2 = true;
        }
        float f5 = n7 != n8 && bl2 ? g83.i : g83.h;
        int n16 = Math.max(dl1_12.e0(f5), n10);
        int n17 = c60.i(l2);
        e83$a_0 e83$a_0 = new e83$a_0(n16, arrayList);
        return cl1_0.a(dl1_12, n17, n16, e83$a_0);
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

