/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DI3
 */
public final class di3_2
implements NX0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object apply(Object object) {
        Object object2 = object;
        object2 = (List)object;
        if (object2 == null) {
            return null;
        }
        object2 = (Iterable)object2;
        int n3 = yx_2.o((Iterable)object2, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        object2 = object2.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            void var19_24;
            long l2;
            Object object3 = (EI3$c)object2.next();
            Object object4 = ((EI3$c)object3).q;
            List list = object4;
            Collection collection = (Collection)object4;
            int n4 = collection.isEmpty();
            int n7 = 1;
            object4 = (n4 ^= n7) != 0 ? (b)object4.get(0) : b.b;
            Object object5 = object4;
            UUID uUID = UUID.fromString(((EI3$c)object3).a);
            Intrinsics.checkNotNullExpressionValue(uUID, "fromString(id)");
            Collection collection2 = ((EI3$c)object3).p;
            HashSet hashSet = new HashSet(collection2);
            long l3 = 0L;
            long l4 = ((EI3$c)object3).e;
            long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
            if (l7 != false) {
                hI3$a hI3$a;
                l3 = ((EI3$c)object3).f;
                hI3$a hI3$a2 = hI3$a = new hI3$a(l4, l3);
            } else {
                Object var19_26 = null;
            }
            hI3$b hI3$b = hI3$b.ENQUEUED;
            int n8 = ((EI3$c)object3).h;
            ArrayList<Object> arrayList2 = arrayList;
            long l8 = ((EI3$c)object3).d;
            hI3$b hI3$b2 = ((EI3$c)object3).b;
            if (hI3$b2 == hI3$b) {
                boolean bl2 = hI3$b2 == hI3$b && n8 > 0;
                boolean bl3 = l7 != false;
                Au au4 = ((EI3$c)object3).i;
                object = object5;
                long l12 = ((EI3$c)object3).j;
                long l14 = ((EI3$c)object3).k;
                n4 = ((EI3$c)object3).l;
                long l15 = ((EI3$c)object3).f;
                long l16 = ((EI3$c)object3).n;
                l2 = EI3$a.a(bl2, n8, au4, l12, l14, n4, bl3, l8, l15, l4, l16);
            } else {
                object = object5;
                l2 = Long.MAX_VALUE;
            }
            b b2 = ((EI3$c)object3).c;
            n4 = ((EI3$c)object3).o;
            hI3$b hI3$b3 = ((EI3$c)object3).b;
            int n10 = ((EI3$c)object3).m;
            object3 = ((EI3$c)object3).g;
            object5 = object;
            object4 = new hI3(uUID, hI3$b3, hashSet, b2, (b)object, n8, n10, (b60)object3, l8, (hI3$a)var19_24, l2, n4);
            ArrayList<Object> arrayList3 = arrayList2;
            arrayList2.add(object4);
            arrayList = arrayList2;
        }
        return arrayList;
    }
}

