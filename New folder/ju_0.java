/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ju
 */
public final class ju_0
implements al1_1 {
    public static final ju_0 a;

    static {
        ju_0 ju_02;
        a = ju_02 = new Object();
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        Object object;
        Object object2 = dl1_12;
        Object object3 = list;
        int n3 = 1;
        int n4 = list.size();
        Ju$a ju$a = null;
        int n7 = 0;
        Pair[] pairArray = null;
        while (true) {
            Object object4;
            object = "Collection contains no element matching the predicate.";
            if (n7 >= n4) break;
            Object object5 = (xk1_0)object3.get(n7);
            Object object6 = androidx.compose.ui.layout.a.a((xk1_0)object5);
            int n8 = Intrinsics.areEqual(object6, object4 = "badge");
            if (n8 != 0) {
                Pair pair = null;
                int n10 = 11;
                long l3 = c60.b(l2, 0, 0, 0, 0, n10);
                Ns2 ns2 = object5.Q(l3);
                n7 = list.size();
                object5 = null;
                for (int i3 = 0; i3 < n7; i3 += n3) {
                    String string2;
                    object6 = (xk1_0)object3.get(i3);
                    object4 = androidx.compose.ui.layout.a.a((xk1_0)object6);
                    int n14 = Intrinsics.areEqual(object4, string2 = "anchor");
                    if (n14 == 0) continue;
                    object3 = object6.Q(l2);
                    pairArray = Pc.a;
                    int n15 = object3.U((Oc)pairArray);
                    object5 = Pc.b;
                    n8 = object3.U((Oc)object5);
                    n14 = ((Ns2)object3).a;
                    int n16 = ((Ns2)object3).b;
                    object = n15;
                    pair = new Pair(pairArray, object);
                    pairArray = n8;
                    object = new Pair(object5, pairArray);
                    pairArray = new Pair[2];
                    pairArray[0] = pair;
                    pairArray[n3] = object;
                    Map map2 = fh1_2.i(pairArray);
                    ju$a = new Ju$a((dl1_1)object2, ns2, (Ns2)object3);
                    return object2.V0(n14, n16, map2, ju$a);
                }
                object2 = new NoSuchElementException((String)object);
                throw object2;
            }
            n7 += n3;
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

