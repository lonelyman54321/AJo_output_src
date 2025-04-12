/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class Ul$a
implements al1_1 {
    public static final Ul$a a;

    static {
        Ul$a ul$a;
        a = ul$a = new Object();
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3 = list.size();
        ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n3);
        n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ns2 ns2 = ((xk1_0)list.get(i3)).Q(l2);
            arrayList.add(ns2);
        }
        int n4 = c60.i(l2);
        int n7 = c60.h(l2);
        Ul$a$a ul$a$a = new Ul$a$a(arrayList);
        return cl1_0.a(dl1_12, n4, n7, ul$a$a);
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

