/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Q03
 */
public class q03_0
extends p03_0 {
    public static Set g(Set object, Set collection) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        LinkedHashSet linkedHashSet = "elements";
        Intrinsics.checkNotNullParameter(collection, (String)((Object)linkedHashSet));
        collection = cx_2.u(collection);
        boolean bl2 = collection.isEmpty();
        if (bl2) {
            return CollectionsKt.o0((Iterable)object);
        }
        bl2 = collection instanceof Set;
        if (bl2) {
            boolean bl3;
            object = (Iterable)object;
            linkedHashSet = new LinkedHashSet();
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                Object e2 = object.next();
                boolean bl4 = collection.contains(e2);
                if (bl4) continue;
                linkedHashSet.add(e2);
            }
            return linkedHashSet;
        }
        object = (Collection)object;
        linkedHashSet = new LinkedHashSet(object);
        ((AbstractCollection)linkedHashSet).removeAll(collection);
        return linkedHashSet;
    }

    public static LinkedHashSet h(Set collection, Iterable iterable) {
        int n3;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(collection, (String)object);
        LinkedHashSet linkedHashSet = "elements";
        Intrinsics.checkNotNullParameter(iterable, (String)((Object)linkedHashSet));
        Intrinsics.checkNotNullParameter(iterable, (String)object);
        int n4 = iterable instanceof Collection;
        if (n4 != 0) {
            object = iterable;
            n4 = ((Collection)iterable).size();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null) {
            n4 = ((Number)object).intValue();
            n3 = collection.size() + n4;
        } else {
            n4 = collection.size();
            n3 = n4 * 2;
        }
        n4 = eh1_2.c(n3);
        linkedHashSet = new LinkedHashSet(n4);
        collection = collection;
        linkedHashSet.addAll(collection);
        cx_2.r(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet i(Set collection, Object object) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int n3 = eh1_2.c(collection.size() + 1);
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>(n3);
        collection = collection;
        linkedHashSet.addAll(collection);
        ((AbstractCollection)linkedHashSet).add(object);
        return linkedHashSet;
    }
}

