/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fH1
 */
public class fh1_2
extends eh1_2 {
    public static nz0_2 f() {
        nz0_2 nz0_22 = nz0_2.a;
        Intrinsics.checkNotNull(nz0_22, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return nz0_22;
    }

    public static Object g(Object object, Map object2) {
        CharSequence charSequence = "<this>";
        Intrinsics.checkNotNullParameter(object2, charSequence);
        Intrinsics.checkNotNullParameter(object2, charSequence);
        boolean bl2 = object2 instanceof zg1_2;
        if (bl2) {
            object2 = (zg1_2)object2;
            object = object2.w();
        } else {
            boolean bl3;
            charSequence = object2.get(object);
            if (charSequence == null && !(bl3 = object2.containsKey(object))) {
                charSequence = new StringBuilder("Key ");
                ((StringBuilder)charSequence).append(object);
                ((StringBuilder)charSequence).append(" is missing in the map.");
                object = ((StringBuilder)charSequence).toString();
                object2 = new NoSuchElementException((String)object);
                throw object2;
            }
            object = charSequence;
        }
        return object;
    }

    public static HashMap h(Pair ... pairArray) {
        Intrinsics.checkNotNullParameter(pairArray, "pairs");
        int n3 = eh1_2.c(pairArray.length);
        HashMap hashMap = new HashMap(n3);
        fh1_2.m(hashMap, pairArray);
        return hashMap;
    }

    public static Map i(Pair ... pairArray) {
        LinkedHashMap linkedHashMap = "pairs";
        Intrinsics.checkNotNullParameter(pairArray, (String)((Object)linkedHashMap));
        int n3 = pairArray.length;
        if (n3 > 0) {
            int n4 = eh1_2.c(pairArray.length);
            linkedHashMap = new LinkedHashMap(n4);
            Intrinsics.checkNotNullParameter(pairArray, "<this>");
            String string2 = "destination";
            Intrinsics.checkNotNullParameter(linkedHashMap, string2);
            fh1_2.m(linkedHashMap, pairArray);
        } else {
            linkedHashMap = fh1_2.f();
        }
        return linkedHashMap;
    }

    public static LinkedHashMap j(Pair ... pairArray) {
        Intrinsics.checkNotNullParameter(pairArray, "pairs");
        int n3 = eh1_2.c(pairArray.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3);
        fh1_2.m(linkedHashMap, pairArray);
        return linkedHashMap;
    }

    public static LinkedHashMap k(Map map2, Map map3) {
        Intrinsics.checkNotNullParameter(map2, "<this>");
        Intrinsics.checkNotNullParameter(map3, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        ((AbstractMap)linkedHashMap).putAll(map3);
        return linkedHashMap;
    }

    public static Map l(Map linkedHashMap, Pair object) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = "pair";
        Intrinsics.checkNotNullParameter(object, (String)((Object)linkedHashMap2));
        boolean bl2 = linkedHashMap.isEmpty();
        if (bl2) {
            linkedHashMap = eh1_2.d((Pair)object);
        } else {
            linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            linkedHashMap = ((Pair)object).b;
            object = ((Pair)object).a;
            ((AbstractMap)linkedHashMap2).put(object, linkedHashMap);
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public static final void m(HashMap hashMap, Pair[] pairArray) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        String string2 = "pairs";
        Intrinsics.checkNotNullParameter(pairArray, string2);
        for (Pair pair : pairArray) {
            Object object = pair.a;
            Object object2 = pair.b;
            hashMap.put(object, object2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Map n(Iterable object) {
        void var4_11;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object instanceof Collection;
        int n4 = 1;
        if (n3 != 0) {
            void var4_7;
            object2 = object;
            object2 = (Collection)object;
            n3 = object2.size();
            if (n3 == 0) {
                nz0_2 nz0_22 = fh1_2.f();
                return var4_7;
            }
            if (n3 != n4) {
                int n7 = eh1_2.c(object2.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap(n7);
                fh1_2.p((Iterable)object, linkedHashMap);
                return var4_7;
            }
            boolean bl2 = object instanceof List;
            if (bl2) {
                object = (List)object;
                bl2 = false;
                object2 = null;
                object = object.get(0);
            } else {
                object = object.iterator().next();
            }
            object = (Pair)object;
            Map map2 = eh1_2.d((Pair)object);
            return var4_7;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fh1_2.p((Iterable)object, linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, (String)object2);
        int n8 = linkedHashMap.size();
        if (n8 == 0) {
            nz0_2 nz0_23 = fh1_2.f();
            return var4_11;
        }
        if (n8 != n4) {
            return var4_11;
        }
        Map map3 = eh1_2.e(linkedHashMap);
        return var4_11;
    }

    public static Map o(Map map2) {
        int n3;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(map2, string2);
        int n4 = map2.size();
        map2 = n4 != 0 ? (n4 != (n3 = 1) ? fh1_2.q(map2) : eh1_2.e(map2)) : fh1_2.f();
        return map2;
    }

    public static void p(Iterable object, HashMap hashMap) {
        boolean bl2;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = "destination";
        Intrinsics.checkNotNullParameter(hashMap, (String)object3);
        Intrinsics.checkNotNullParameter(hashMap, (String)object2);
        object2 = "pairs";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Pair)object.next();
            object3 = ((Pair)object2).a;
            object2 = ((Pair)object2).b;
            hashMap.put(object3, object2);
        }
    }

    public static LinkedHashMap q(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        return linkedHashMap;
    }
}

