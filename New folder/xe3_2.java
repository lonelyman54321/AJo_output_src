/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xe3
 */
public class xe3_2
implements ve3_2 {
    public final boolean a;
    public final Map b;

    public xe3_2(int n3) {
        this.a = true;
        up_1 up_12 = new up_1();
        this.b = up_12;
    }

    public final void a(String object, Iterable iterable) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(iterable, "values");
        object = this.d((String)object);
        Iterator iterator = iterable.iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            this.h(string2);
        }
        object = (Collection)object;
        cx_2.r(iterable, (Collection)object);
    }

    public final void b(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.h(string3);
        this.d(string2).add(string3);
    }

    public final boolean c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return this.b.containsKey(string2);
    }

    public final void clear() {
        this.b.clear();
    }

    public final List d(String string2) {
        Map map2 = this.b;
        ArrayList arrayList = (ArrayList)map2.get(string2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g(string2);
            map2.put(string2, arrayList);
        }
        return arrayList;
    }

    public final String e(String object) {
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.f((String)object);
        object = object != null ? (String)CollectionsKt.firstOrNull((List)object) : null;
        return object;
    }

    public final Set entries() {
        Set set = this.b.entrySet();
        Intrinsics.checkNotNullParameter(set, "<this>");
        set = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(...)");
        return set;
    }

    public final List f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return (List)this.b.get(string2);
    }

    public void g(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
    }

    public void h(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }
}

