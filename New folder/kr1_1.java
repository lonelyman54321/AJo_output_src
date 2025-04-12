/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KR1
 */
public final class kr1_1
extends my2_0 {
    public final Map a;
    public final AtomicBoolean b;

    public kr1_1() {
        this(false, 3);
    }

    public kr1_1(Map object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "preferencesMap");
        this.a = object;
        this.b = object = new AtomicBoolean(bl2);
    }

    public /* synthetic */ kr1_1(boolean bl2, int n3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((n3 &= 2) != 0) {
            bl2 = true;
        }
        this(linkedHashMap, bl2);
    }

    public final Map a() {
        Map map2 = Collections.unmodifiableMap(this.a);
        Intrinsics.checkNotNullExpressionValue(map2, "unmodifiableMap(preferencesMap)");
        return map2;
    }

    public final Object b(my2$a my2$a) {
        Intrinsics.checkNotNullParameter(my2$a, "key");
        return this.a.get(my2$a);
    }

    public final void c() {
        Serializable serializable = this.b;
        boolean bl2 = serializable.get() ^ true;
        if (bl2) {
            return;
        }
        String string2 = "Do mutate preferences once returned to DataStore.".toString();
        serializable = new IllegalStateException(string2);
        throw serializable;
    }

    public final void d(my2$a my2$a, Object set) {
        String string2 = "key";
        Intrinsics.checkNotNullParameter(my2$a, string2);
        this.c();
        Map map2 = this.a;
        if (set == null) {
            Intrinsics.checkNotNullParameter(my2$a, string2);
            this.c();
            map2.remove(my2$a);
        } else {
            boolean bl2 = set instanceof Set;
            if (bl2) {
                set = Collections.unmodifiableSet(CollectionsKt.o0(set));
                string2 = "unmodifiableSet(value.toSet())";
                Intrinsics.checkNotNullExpressionValue(set, string2);
                map2.put(my2$a, set);
            } else {
                map2.put(my2$a, set);
            }
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof kr1_1;
        if (bl2) {
            object = ((kr1_1)object).a;
            return Intrinsics.areEqual(this.a, object);
        }
        return false;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final String toString() {
        Set set;
        Iterable iterable = set = this.a.entrySet();
        iterable = set;
        KR1$a kR1$a = KR1$a.c;
        return CollectionsKt.R(iterable, ",\n", "{\n", "\n}", kR1$a, 24);
    }
}

