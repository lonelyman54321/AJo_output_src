/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/*
 * Renamed from uP
 */
public final class up_1
implements Map,
KMutableMap {
    public final LinkedHashMap a;

    public up_1() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean containsKey(Object object) {
        boolean bl2 = object instanceof String;
        if (!bl2) {
            return false;
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        LinkedHashMap linkedHashMap = this.a;
        vp_2 vp_22 = new vp_2((String)object);
        return linkedHashMap.containsKey(vp_22);
    }

    public final boolean containsValue(Object object) {
        if (object == null) {
            return false;
        }
        return this.a.containsValue(object);
    }

    public final Set entrySet() {
        Set set = this.a.entrySet();
        qp_2 qp_22 = new Object();
        rp_2 rp_22 = new Object();
        lo0_2 lo0_22 = new lo0_2(set, qp_22, rp_22);
        return lo0_22;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object != null && (bl2 = object instanceof up_1)) {
            object = ((up_1)object).a;
            LinkedHashMap linkedHashMap = this.a;
            return Intrinsics.areEqual(object, linkedHashMap);
        }
        return false;
    }

    public final Object get(Object object) {
        boolean bl2 = object instanceof String;
        if (!bl2) {
            return null;
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        LinkedHashMap linkedHashMap = this.a;
        object = ol3_0.a((String)object);
        return linkedHashMap.get(object);
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Set keySet() {
        Set set = this.a.keySet();
        sp_2 sp_22 = new Object();
        tp_1 tp_12 = new tp_1(0);
        lo0_2 lo0_22 = new lo0_2(set, sp_22, tp_12);
        return lo0_22;
    }

    public final Object put(Object object, Object object2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "value");
        LinkedHashMap linkedHashMap = this.a;
        object = ol3_0.a((String)object);
        return linkedHashMap.put(object, object2);
    }

    public final void putAll(Map object) {
        boolean bl2;
        Object object2 = "from";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            Object object3 = (String)object2.getKey();
            object2 = object2.getValue();
            Intrinsics.checkNotNullParameter(object3, "key");
            Intrinsics.checkNotNullParameter(object2, "value");
            LinkedHashMap linkedHashMap = this.a;
            object3 = ol3_0.a((String)object3);
            linkedHashMap.put(object3, object2);
        }
    }

    public final Object remove(Object object) {
        boolean bl2 = object instanceof String;
        if (!bl2) {
            return null;
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        LinkedHashMap linkedHashMap = this.a;
        object = ol3_0.a((String)object);
        return linkedHashMap.remove(object);
    }

    public final int size() {
        return this.a.size();
    }

    public final Collection values() {
        return this.a.values();
    }
}

