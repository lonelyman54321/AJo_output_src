/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public final class CF2$a {
    public static void a(q73 q732, List list, EF2 eF2) {
        Collection collection = list;
        collection = list;
        int n3 = collection.isEmpty() ^ 1;
        if (n3 != 0) {
            n3 = list.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = (Ae)list.get(i3);
                int n4 = q732.c((Ae)object);
                int n7 = q732.p(n4);
                int[] nArray = q732.b;
                n7 = q732.I(nArray, n7);
                nArray = q732.b;
                ++n4;
                n4 = q732.p(n4);
                if (n7 < (n4 = q732.f(nArray, n4))) {
                    n4 = q732.g(n7);
                    Object[] objectArray = q732.c;
                    object = objectArray[n4];
                } else {
                    object = b30$a.a;
                }
                n7 = object instanceof CF2;
                if (n7 != 0) {
                    object = (CF2)object;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object == null) continue;
                ((CF2)object).b = eF2;
            }
        }
    }
}

