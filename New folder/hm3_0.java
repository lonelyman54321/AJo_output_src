/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from hm3
 */
public final class hm3_0
implements al1_1 {
    public final Function0 a;
    public final Function0 b;

    public hm3_0(Function0 function0, Function0 function02) {
        this.a = function0;
        this.b = function02;
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3;
        Object object;
        Object object2;
        int n4;
        hm3_0 hm3_02 = this;
        Object object3 = list;
        int n7 = list.size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n7);
        n7 = list.size();
        int n8 = 0;
        hm3$a_0 hm3$a_0 = null;
        ArrayList arrayList2 = null;
        for (n4 = 0; n4 < n7; ++n4) {
            object2 = object3.get(n4);
            object = object2;
            object = ((xk1_0)object2).B();
            n3 = object instanceof pm3 ^ 1;
            if (n3 == 0) continue;
            arrayList.add(object2);
        }
        List list2 = (List)hm3_02.b.invoke();
        n4 = 0;
        arrayList2 = null;
        if (list2 != null) {
            n3 = list2.size();
            object2 = new ArrayList(n3);
            n3 = list2.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Pair pair;
                Object object4 = (aG2)list2.get(i3);
                if (object4 != null) {
                    Object object5 = (xk1_0)arrayList.get(i3);
                    double d2 = Math.floor(((aG2)object4).d());
                    int n10 = (int)d2;
                    double d5 = Math.floor(((aG2)object4).c());
                    float f5 = (float)d5;
                    int n14 = (int)f5;
                    int n15 = 5;
                    long l3 = f60.b(n10, n14, n15);
                    object5 = object5.Q(l3);
                    float f6 = ((aG2)object4).a;
                    n10 = Math.round(f6);
                    float f7 = ((aG2)object4).b;
                    int n16 = Math.round(f7);
                    l3 = Ti1.a(n10, n16);
                    object4 = new Si1(l3);
                    pair = new Pair(object5, object4);
                } else {
                    pair = null;
                }
                if (pair == null) continue;
                ((ArrayList)object2).add((Pair)pair);
            }
            arrayList2 = (ArrayList)object2;
        }
        n7 = list.size();
        arrayList = new ArrayList<Object>(n7);
        n7 = list.size();
        while (n8 < n7) {
            object2 = object3.get(n8);
            object = object2;
            object = ((xk1_0)object2).B();
            n3 = object instanceof pm3;
            if (n3 != 0) {
                arrayList.add(object2);
            }
            ++n8;
        }
        object3 = hm3_02.a;
        object3 = dx.d(arrayList, (Function0)object3);
        int n17 = c60.i(l2);
        n7 = c60.h(l2);
        hm3$a_0 = new hm3$a_0(arrayList2, (ArrayList)object3);
        object3 = dl1_12;
        return cl1_0.a(dl1_12, n17, n7, hm3$a_0);
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

