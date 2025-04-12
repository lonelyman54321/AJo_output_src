/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.c;

/*
 * Renamed from CX
 */
public class cx_2
extends bx_2 {
    public static void r(Iterable object, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof Collection;
        if (bl2) {
            object = (Collection)object;
            collection.addAll(object);
            return;
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            collection.add(string2);
        }
    }

    public static void s(ArrayList arrayList, yz2_0 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Object object2 = "elements";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = zz2_1.a(((yz2_0)object).a);
        while (bl2 = ((wz2_1)object).hasNext()) {
            object2 = ((wz2_1)object).next();
            arrayList.add(object2);
        }
    }

    public static void t(Collection collection, Object[] object) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(object, "elements");
        object = rp_1.e(object);
        collection.addAll(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Collection u(Iterable iterable) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(iterable, string2);
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return (Collection)iterable;
        }
        iterable = CollectionsKt.k0(iterable);
        return (Collection)iterable;
    }

    public static final boolean v(Iterable object, Function1 function1, boolean bl2) {
        boolean bl3;
        object = object.iterator();
        boolean bl4 = false;
        while (bl3 = object.hasNext()) {
            Object object2 = object.next();
            bl3 = (Boolean)(object2 = (Boolean)function1.invoke(object2));
            if (bl3 != bl2) continue;
            object.remove();
            bl4 = true;
        }
        return bl4;
    }

    public static void w(List iterable, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Object object = "predicate";
        Intrinsics.checkNotNullParameter(function1, (String)object);
        boolean bl2 = iterable instanceof RandomAccess;
        int n3 = 1;
        if (!bl2) {
            object = "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>";
            Intrinsics.checkNotNull(iterable, (String)object);
            iterable = TypeIntrinsics.asMutableIterable(iterable);
            cx_2.v(iterable, function1, n3 != 0);
        } else {
            int n4 = xx_2.h((List)iterable);
            int n7 = 0;
            object = new c(0, n4, n3);
            object = ((c)object).d();
            while ((n4 = (int)(((ui1_2)object).c ? 1 : 0)) != 0) {
                n4 = ((ui1_2)object).nextInt();
                Object e2 = iterable.get(n4);
                Boolean bl3 = (Boolean)function1.invoke(e2);
                int n8 = bl3.booleanValue();
                if (n8 == n3) continue;
                if (n7 != n4) {
                    iterable.set(n7, e2);
                }
                ++n7;
            }
            int n10 = iterable.size();
            if (n7 < n10 && n7 <= (n10 = xx_2.h(iterable))) {
                while (true) {
                    iterable.remove(n10);
                    if (n10 == n7) break;
                    n10 += -1;
                }
            }
        }
    }

    public static Object x(List object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            return object.remove(0);
        }
        object = new NoSuchElementException("List is empty.");
        throw object;
    }

    public static Object y(List object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.isEmpty();
        if (n3 == 0) {
            n3 = xx_2.h((List)object);
            return object.remove(n3);
        }
        object = new NoSuchElementException("List is empty.");
        throw object;
    }
}

