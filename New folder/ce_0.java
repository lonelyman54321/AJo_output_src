/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.os.Bundle;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from CE
 */
public final class ce_0 {
    public static final HashMap a;

    static {
        HashMap<Class<JSONArray>, ce$a_0> hashMap;
        a = hashMap = new HashMap<Class<JSONArray>, ce$a_0>();
        CE$h cE$h = new Object();
        hashMap.put((Class<JSONArray>)Boolean.class, (ce$a_0)cE$h);
        cE$h = new Object();
        hashMap.put((Class<JSONArray>)Integer.class, (ce$a_0)cE$h);
        cE$h = new Object();
        hashMap.put((Class<JSONArray>)Long.class, (ce$a_0)cE$h);
        cE$h = new Object();
        hashMap.put((Class<JSONArray>)Double.class, (ce$a_0)cE$h);
        cE$h = new Object();
        hashMap.put((Class<JSONArray>)String.class, (ce$a_0)cE$h);
        cE$h = new Object();
        hashMap.put((Class<JSONArray>)String[].class, (ce$a_0)cE$h);
        cE$h = new Object();
        hashMap.put(JSONArray.class, (ce$a_0)cE$h);
    }

    public static final Bundle a(JSONObject object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "jsonObject");
        Object object2 = new Bundle();
        Object object3 = object.keys();
        while (bl2 = object3.hasNext()) {
            Object object4;
            String string2 = (String)object3.next();
            Object object5 = object.get(string2);
            if (object5 == (object4 = JSONObject.NULL)) continue;
            boolean bl3 = object5 instanceof JSONObject;
            if (bl3) {
                object5 = ce_0.a((JSONObject)object5);
                object2.putBundle(string2, (Bundle)object5);
                continue;
            }
            object4 = a;
            Class<?> clazz = object5.getClass();
            if ((object4 = (CE$h)((HashMap)object4).get(clazz)) != null) {
                Intrinsics.checkNotNullExpressionValue(string2, "key");
                clazz = "value";
                Intrinsics.checkNotNullExpressionValue(object5, (String)((Object)clazz));
                object4.a((Bundle)object2, string2, object5);
                continue;
            }
            object2 = new StringBuilder("Unsupported type: ");
            object3 = object5.getClass();
            ((StringBuilder)object2).append(object3);
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        return object2;
    }
}

