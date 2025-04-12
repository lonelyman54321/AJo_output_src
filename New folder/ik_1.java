/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from iK
 */
public final class ik_1 {
    public static final HashMap a;

    static {
        Pair[] pairArray = new Object();
        Pair pair = new Pair(String.class, pairArray);
        pairArray = new Object();
        Pair pair2 = new Pair(String[].class, pairArray);
        pairArray = new Object();
        Pair pair3 = new Pair(JSONArray.class, pairArray);
        pairArray = new Pair[]{pair, pair2, pair3};
        a = fh1_2.h(pairArray);
    }

    public static final JSONObject a(CameraEffectArguments object) {
        boolean bl2;
        CharSequence charSequence = null;
        if (object == null) {
            return null;
        }
        Object object2 = new JSONObject();
        object = ((CameraEffectArguments)object).a;
        Object object3 = object != null ? object.keySet() : null;
        if (object3 == null) {
            object3 = vz0_2.a;
        }
        object3 = object3.iterator();
        while (bl2 = object3.hasNext()) {
            String string2 = (String)object3.next();
            Object object4 = object != null ? object.get(string2) : null;
            if (object4 == null) continue;
            Object object5 = a;
            Class<?> clazz = object4.getClass();
            if ((object5 = (iK$d)((HashMap)object5).get(clazz)) != null) {
                object5.a((JSONObject)object2, string2, object4);
                continue;
            }
            charSequence = new StringBuilder("Unsupported type: ");
            object2 = object4.getClass();
            charSequence.append(object2);
            charSequence = charSequence.toString();
            object = new IllegalArgumentException((String)charSequence);
            throw object;
        }
        return object2;
    }
}

