/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from GI
 */
public final class gi_1 {
    public static Object a(Object map2, Object map3) {
        if (map3 == null) {
            return map2;
        }
        boolean bl2 = map3 instanceof Number;
        if (!(bl2 || (bl2 = map3 instanceof Boolean) || (bl2 = map3 instanceof String) || (bl2 = map3 instanceof Character) || (bl2 = map2 instanceof Number) || (bl2 = map2 instanceof Boolean) || (bl2 = map2 instanceof String) || (bl2 = map2 instanceof Character))) {
            Object object;
            boolean bl3;
            Iterator<Object> iterator;
            Object object2;
            Object object3;
            bl2 = map3 instanceof Map;
            if (bl2) {
                object3 = map3;
                object3 = ((Map)map3).keySet();
            } else {
                object3 = map3;
                object3 = (Iterable)((Object)map3);
            }
            boolean bl4 = map2 instanceof Map;
            if (bl4) {
                object2 = map2;
                object2 = ((Map)map2).keySet();
            } else {
                object2 = map2;
                object2 = (Iterable)((Object)map2);
            }
            map3 = bl2 ? (Map)map3 : null;
            map2 = bl4 ? (Map)map2 : null;
            if (!bl4 && !bl2) {
                return null;
            }
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            if (object2 != null) {
                iterator = object2.iterator();
                while (bl3 = iterator.hasNext()) {
                    object2 = iterator.next();
                    if (map3 == null || map2 == null) continue;
                    object = map3.get(object2);
                    Object v4 = map2.get(object2);
                    if (object != null || v4 == null) continue;
                    hashMap.put(object2, v4);
                }
            }
            object3 = object3.iterator();
            while (bl4 = object3.hasNext()) {
                iterator = object3.next();
                if (map3 != null) {
                    object2 = map3.get(iterator);
                } else {
                    bl3 = false;
                    object2 = null;
                }
                object = map2 != null ? map2.get(iterator) : null;
                object2 = gi_1.a(object, object2);
                hashMap.put(iterator, object2);
            }
            return hashMap;
        }
        return map3;
    }
}

