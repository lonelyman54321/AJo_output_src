/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class u53
implements al1_1 {
    public static final u53 a;

    static {
        u53 u532;
        a = u532 = new Object();
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3;
        int n4;
        int n7 = list.size();
        ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n7);
        n7 = list.size();
        int n8 = 0;
        Integer n10 = 0;
        for (int i3 = 0; i3 < n7; ++i3) {
            Ns2 ns2 = ((xk1_0)list.get(i3)).Q(l2);
            arrayList.add(ns2);
        }
        int n14 = arrayList.size();
        Object object = n10;
        for (n4 = 0; n4 < n14; ++n4) {
            Ns2 ns2 = (Ns2)arrayList.get(n4);
            n3 = ((Number)object).intValue();
            n7 = ns2.a;
            n3 = Math.max(n3, n7);
            object = n3;
        }
        n14 = ((Number)object).intValue();
        n4 = arrayList.size();
        while (n8 < n4) {
            object = (Ns2)arrayList.get(n8);
            n7 = n10;
            n3 = ((Ns2)object).b;
            n3 = Math.max(n7, n3);
            n10 = n3;
            ++n8;
        }
        n4 = n10;
        object = new u53$a(arrayList);
        return cl1_0.a(dl1_12, n14, n4, (Function1)object);
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

