/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

public final class e {
    public static final List a(List collection) {
        int n3 = collection.size();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                collection = collection;
                ArrayList<Object> arrayList = new ArrayList<Object>(collection);
                collection = Collections.unmodifiableList(arrayList);
            } else {
                collection = Collections.singletonList(CollectionsKt.L(collection));
            }
        } else {
            collection = mz0_2.a;
        }
        return collection;
    }

    public static final Map b(Map map2) {
        int n3 = map2.size();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                map2 = Collections.unmodifiableMap(linkedHashMap);
            } else {
                map2 = (Map.Entry)CollectionsKt.K(map2.entrySet());
                Object k2 = map2.getKey();
                map2 = map2.getValue();
                map2 = Collections.singletonMap(k2, map2);
            }
        } else {
            map2 = fh1_2.f();
        }
        return map2;
    }
}

