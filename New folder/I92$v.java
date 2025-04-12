/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

public final class I92$v
extends I92 {
    public static final I92$v c;

    static {
        I92$v i92$v;
        c = i92$v = new I92(0, 3, 1);
    }

    public final void a(R92$a object, mp mp2, q73 object2, F30$a f30$a) {
        int n3 = 1;
        Object object3 = (k80)((R92$a)object).b(0);
        A30 a30 = (A30)((R92$a)object).b(n3);
        int n4 = 2;
        object = (vQ1)((R92$a)object).b(n4);
        l73 l732 = new l73();
        Object object4 = ((q73)object2).e;
        if (object4 != null) {
            l732.g();
        }
        if ((object4 = ((q73)object2).f) != null) {
            l732.j = object4 = new tr1_1();
        }
        object4 = l732.i();
        ((q73)object4).d();
        Object object5 = ((vQ1)object).a;
        b30$a$a b30$a$a = b30$a.a;
        int n7 = 126665345;
        ((q73)object4).M(object5, n7, b30$a$a, false);
        q73.u((q73)object4);
        object5 = ((vQ1)object).b;
        ((q73)object4).O(object5);
        object5 = ((vQ1)object).e;
        object2 = ((q73)object2).y((Ae)object5, (q73)object4);
        try {
            ((q73)object4).G();
            ((q73)object4).i();
            ((q73)object4).j();
            ((q73)object4).e(n3 != 0);
            object4 = new uq1_0(l732);
            object5 = object2;
        }
        catch (Throwable throwable) {
            ((q73)object4).e(false);
            throw throwable;
        }
        object5 = (Collection)object2;
        int n8 = object5.isEmpty() ^ n3;
        if (n8 != 0) {
            n8 = object2.size();
            for (n7 = 0; n7 < n8; n7 += n3) {
                Object object6 = (Object[])object2.get(n7);
                int n10 = l732.j((Ae)object6);
                if (n10 == 0) continue;
                int n14 = l732.d((Ae)object6);
                int[] nArray = l732.a;
                n10 = n73.m(nArray, n14);
                int n15 = l732.b;
                if ((n14 += n3) < n15) {
                    int[] nArray2 = l732.a;
                    n14 = n73.d(nArray2, n14);
                } else {
                    object6 = l732.c;
                    n14 = ((Object[])object6).length;
                }
                object6 = (n14 -= n10) > 0 ? l732.c[n10] : b30$a$a;
                n14 = object6 instanceof CF2;
                if (n14 == 0) continue;
                object5 = new N92((k80)object3, (vQ1)object);
                object3 = l732.i();
                try {
                    CF2$a.a((q73)object3, (List)object2, (EF2)object5);
                    object2 = Unit.a;
                    ((q73)object3).e(n3 != 0);
                    break;
                }
                catch (Throwable throwable) {
                    ((q73)object3).e(false);
                    throw throwable;
                }
            }
        }
        a30.k((vQ1)object, (uq1_0)object4);
        return;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "composition" : ((bl2 = I92$t.a(n3, 1)) ? "parentCompositionContext" : ((bl2 = I92$t.a(n3, 2)) ? "reference" : super.c(n3)));
        return string2;
    }
}

