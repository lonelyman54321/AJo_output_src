/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class T73
implements al1_1 {
    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        Object object;
        Object object2 = dl1_12;
        Object object3 = list;
        int n3 = list.size();
        int n4 = 0;
        float f5 = 0.0f;
        T73$a t73$a = null;
        int n7 = 0;
        while (true) {
            Object object4;
            object = "Collection contains no element matching the predicate.";
            if (n7 >= n3) break;
            xk1_0 xk1_02 = (xk1_0)object3.get(n7);
            Object object5 = a.a(xk1_02);
            int n8 = Intrinsics.areEqual(object5, object4 = "action");
            if (n8 != 0) {
                Ns2 ns2 = xk1_02.Q(l2);
                n7 = c60.i(l2);
                int n10 = ns2.a;
                n7 -= n10;
                float f6 = g83.f;
                n10 = object2.e0(f6);
                int n14 = (n7 -= n10) < (n10 = c60.k(l2)) ? n10 : n7;
                n7 = list.size();
                f6 = 0.0f;
                xk1_02 = null;
                for (n10 = 0; n10 < n7; ++n10) {
                    int n15;
                    String string2;
                    object5 = (xk1_0)object3.get(n10);
                    object4 = a.a((xk1_0)object5);
                    boolean bl2 = Intrinsics.areEqual(object4, string2 = "text");
                    if (!bl2) continue;
                    int n16 = 0;
                    int n17 = 9;
                    float f7 = 1.3E-44f;
                    long l3 = c60.b(l2, 0, n14, 0, 0, n17);
                    object4 = object5.Q(l3);
                    object3 = Pc.a;
                    n7 = object4.U((Oc)object3);
                    object = Pc.b;
                    int n18 = object4.U((Oc)object);
                    n10 = 1;
                    f6 = Float.MIN_VALUE;
                    n8 = -1 << -1;
                    if (n7 != n8 && n18 != n8) {
                        n15 = 1;
                    } else {
                        n15 = 0;
                        string2 = null;
                    }
                    if (n7 != n18 && n15 != 0) {
                        n10 = 0;
                        f6 = 0.0f;
                        xk1_02 = null;
                    }
                    n18 = c60.i(l2);
                    n15 = ns2.a;
                    n14 = n18 - n15;
                    if (n10 != 0) {
                        float f8 = g83.h;
                        n18 = object2.e0(f8);
                        n10 = ns2.b;
                        n18 = Math.max(n18, n10);
                        n10 = ((Ns2)object4).b;
                        n10 = (n18 - n10) / 2;
                        n17 = ns2.U((Oc)object3);
                        if (n17 != n8) {
                            n4 = (n7 += n10) - n17;
                        }
                        n16 = n4;
                        n15 = n10;
                    } else {
                        f7 = g83.a;
                        n17 = object2.e0(f7) - n7;
                        f5 = g83.i;
                        n4 = object2.e0(f5);
                        n7 = ((Ns2)object4).b + n17;
                        n18 = Math.max(n4, n7);
                        n4 = ns2.b;
                        n4 = (n18 - n4) / 2;
                        n15 = n17;
                        n16 = n4;
                    }
                    n17 = c60.i(l2);
                    object5 = t73$a;
                    t73$a = new T73$a((Ns2)object4, n15, ns2, n14, n16);
                    return cl1_0.a((dl1_1)object2, n17, n18, t73$a);
                }
                object2 = new NoSuchElementException((String)object);
                throw object2;
            }
            ++n7;
        }
        object2 = new NoSuchElementException((String)object);
        throw object2;
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

