/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sV0
 */
public final class sv0_1 {
    public final ArrayList a;

    public sv0_1(rv0_0 ... object) {
        Object object2;
        Object object3 = new LinkedHashMap();
        int n3 = ((rv0_0[])object).length;
        int n4 = 0;
        String string2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            rv0_0 rv0_02 = object[i3];
            String string3 = rv0_02.c();
            Object object4 = ((LinkedHashMap)object3).get(string3);
            if (object4 == null) {
                object3.put(string3, object4);
            }
            object4 = (List)object4;
            object4.add((rv0_0)rv0_02);
        }
        super();
        object3 = ((LinkedHashMap)object3).entrySet().iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            int n7;
            object2 = (Map.Entry)object3.next();
            string2 = (String)object2.getKey();
            int n8 = (object2 = (List)object2.getValue()).size();
            if (n8 == (n7 = 1)) {
                object2 = (Iterable)object2;
                cx_2.r((Iterable)object2, (Collection)object);
                continue;
            }
            object = Gn.a("'", string2, "' must be unique. Actual [ [");
            object3 = CollectionsKt.R((Iterable)object2, null, null, null, null, 63);
            object = ui0_1.a((StringBuilder)object, (String)object3, ']');
            object = object.toString();
            object3 = new IllegalArgumentException((String)object);
            throw object3;
        }
        object3 = new ArrayList(object);
        this.a = object3;
        int n10 = ((ArrayList)object3).size();
        while (n4 < n10 && (n3 = (int)((object2 = (rv0_0)((ArrayList)object3).get(n4)).a() ? 1 : 0)) == 0) {
            ++n4;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof sv0_1;
        if (!bl3) {
            return false;
        }
        ArrayList arrayList = this.a;
        object = ((sv0_1)object).a;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }
}

