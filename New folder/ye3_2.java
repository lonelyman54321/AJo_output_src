/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ye3
 */
public class ye3_2
implements ue3_2 {
    public final boolean c;
    public final Map d;

    public ye3_2(Map object) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "values");
        this.c = bl3 = true;
        up_1 up_12 = new up_1();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (List)object2.getValue();
            int n3 = object2.size();
            ArrayList<String> arrayList = new ArrayList<String>(n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3 = (String)object2.get(i3);
                arrayList.add(string3);
            }
            up_12.put(string2, arrayList);
        }
        this.d = up_12;
    }

    public final void a(Function2 function2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(function2, "body");
        Iterator iterator = this.d.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string2 = (String)object.getKey();
            object = (List)object.getValue();
            function2.invoke(string2, object);
        }
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        boolean bl2;
        String string2 = "Content-Encoding";
        Intrinsics.checkNotNullParameter(string2, "name");
        List list = (List)this.d.get(string2);
        if (list != null) {
            bl2 = true;
        } else {
            bl2 = false;
            list = null;
        }
        return bl2;
    }

    public final Set d() {
        Set set = this.d.keySet();
        Intrinsics.checkNotNullParameter(set, "<this>");
        set = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(...)");
        return set;
    }

    public final Set entries() {
        Set set = this.d.entrySet();
        Intrinsics.checkNotNullParameter(set, "<this>");
        set = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(set, "unmodifiableSet(...)");
        return set;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof ue3_2;
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.c;
        bl2 = (object = (ue3_2)object).b();
        if (bl3 != bl2) {
            return false;
        }
        Set set = this.entries();
        object = object.entries();
        return Intrinsics.areEqual(set, object);
    }

    public final String get(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        Map map2 = this.d;
        object = (List)map2.get(object);
        object = object != null ? (String)CollectionsKt.firstOrNull((List)object) : null;
        return object;
    }

    public final int hashCode() {
        Set set = this.entries();
        int n3 = this.c;
        n3 = n3 != 0 ? 1231 : 1237;
        return ((Object)set).hashCode() + (n3 *= 961);
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }
}

