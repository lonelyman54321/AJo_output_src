/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from lZ2
 */
public final class lz2_0 {
    public final JSONObject a;
    public final JSONArray b;

    public lz2_0(JSONArray jSONArray, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONArray, "queue");
        this.a = jSONObject;
        this.b = jSONArray;
    }

    public final String toString() {
        Object object = this.b;
        Object object2 = this.a;
        if (object2 == null) {
            object = object.toString();
            object2 = "{\n        queue.toString()\n    }";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        } else {
            String string2 = "[";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object2);
            stringBuilder.append(',');
            object = object.toString();
            Intrinsics.checkNotNullExpressionValue(object, "queue.toString()");
            int n3 = 1;
            object = ((String)object).substring(n3);
            object2 = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
        }
        return object;
    }
}

