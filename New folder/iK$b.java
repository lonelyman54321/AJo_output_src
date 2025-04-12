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

public final class iK$b
implements iK$d {
    public final void a(JSONObject jSONObject, String string2, Object stringArray) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(string2, "key");
        JSONArray jSONArray = new JSONArray();
        String string3 = "null cannot be cast to non-null type kotlin.Array<kotlin.String?>";
        Intrinsics.checkNotNull(stringArray, string3);
        for (String string4 : (String[])stringArray) {
            jSONArray.put((Object)string4);
        }
        jSONObject.put(string2, (Object)jSONArray);
    }
}

