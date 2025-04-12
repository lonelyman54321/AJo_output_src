/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class sI0$a {
    public static si0_1 b() {
        int n3 = 3;
        int n4 = 1;
        int n7 = 4;
        int n8 = 2;
        Object object = Integer.valueOf(n8);
        Pair pair = new Pair(object, null);
        object = n7;
        Pair pair2 = new Pair(object, null);
        object = 9;
        Pair pair3 = new Pair(object, null);
        object = 17;
        Pair pair4 = new Pair(object, null);
        object = 341;
        Pair pair5 = new Pair(object, null);
        object = new Pair[5];
        object[0] = pair;
        object[n4] = pair2;
        object[n8] = pair3;
        object[n3] = pair4;
        object[n7] = pair5;
        HashMap hashMap = fh1_2.h(object);
        Integer n10 = 102;
        object = new Pair(n10, null);
        n10 = 190;
        pair = new Pair(n10, null);
        n10 = 412;
        pair2 = new Pair(n10, null);
        Object object2 = new Pair[n3];
        object2[0] = object;
        object2[n4] = pair;
        object2[n8] = pair2;
        HashMap hashMap2 = fh1_2.h(object2);
        object2 = new si0_1(null, hashMap, hashMap2, null, null, null);
        return object2;
    }

    public static HashMap c(JSONObject jSONObject) {
        int n3;
        if ((jSONObject = jSONObject.optJSONArray("items")) != null && (n3 = jSONObject.length()) != 0) {
            HashMap<JSONObject, HashSet<Integer>> hashMap = new HashMap<JSONObject, HashSet<Integer>>();
            int n4 = jSONObject.length();
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                String string2;
                int n8;
                Object object = jSONObject.optJSONObject(i3);
                if (object == null || (n8 = object.optInt(string2 = "code")) == 0) continue;
                Object object2 = "subcodes";
                if ((object = object.optJSONArray((String)object2)) != null && (n7 = object.length()) > 0) {
                    object2 = new Object();
                    int n10 = object.length();
                    for (int i8 = 0; i8 < n10; ++i8) {
                        int n14 = object.optInt(i8);
                        if (n14 == 0) continue;
                        Integer n15 = n14;
                        ((HashSet)object2).add(n15);
                    }
                } else {
                    n7 = 0;
                    object2 = null;
                }
                object = n8;
                hashMap.put((JSONObject)object, (HashSet<Integer>)object2);
            }
            return hashMap;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final si0_1 a() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                si0_1 si0_12;
                block3: {
                    try {
                        si0_12 = si0_1.e;
                        if (si0_12 != null) break block3;
                        si0_1.e = si0_12 = sI0$a.b();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                si0_12 = si0_1.e;
                String string2 = "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification";
                Intrinsics.checkNotNull(si0_12, string2);
                return si0_12;
            }
            throw throwable2;
        }
    }
}

