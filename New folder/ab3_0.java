/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ab3
 */
public final class ab3_0
implements zb3_0 {
    public final LinkedHashMap b;

    public ab3_0() {
        LinkedHashMap linkedHashMap;
        this.b = linkedHashMap = new LinkedHashMap();
    }

    public final xb3_0 a(gI3 gI32) {
        Intrinsics.checkNotNullParameter(gI32, "id");
        return (xb3_0)this.b.remove(gI32);
    }

    public final boolean b(gI3 gI32) {
        Intrinsics.checkNotNullParameter(gI32, "id");
        return this.b.containsKey(gI32);
    }

    public final xb3_0 c(gI3 gI32) {
        Intrinsics.checkNotNullParameter(gI32, "id");
        LinkedHashMap linkedHashMap = this.b;
        Object object = linkedHashMap.get(gI32);
        if (object == null) {
            object = new Object(gI32);
            linkedHashMap.put(gI32, object);
        }
        return (xb3_0)object;
    }

    public final List remove(String object) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "workSpecId");
        LinkedHashMap linkedHashMap = this.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Object object2 = linkedHashMap.entrySet().iterator();
        while (bl3 = object2.hasNext()) {
            Map.Entry entry = object2.next();
            String string2 = ((gI3)entry.getKey()).a;
            boolean bl4 = Intrinsics.areEqual(string2, object);
            if (!bl4) continue;
            string2 = entry.getKey();
            entry = entry.getValue();
            ((AbstractMap)linkedHashMap2).put(string2, entry);
        }
        object = ((Iterable)linkedHashMap2.keySet()).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (gI3)object.next();
            linkedHashMap.remove(object2);
        }
        return CollectionsKt.k0(linkedHashMap2.values());
    }
}

