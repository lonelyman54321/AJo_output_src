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
 * Renamed from os3
 */
public final class os3_0 {
    public final String a;
    public final JSONArray b;
    public final JSONArray c;
    public final JSONArray d;
    public final String e;
    public final boolean f;

    public os3_0(JSONObject jSONObject) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(jSONObject, "triggerJSON");
        String string2 = jSONObject.optString("eventName", "");
        Intrinsics.checkNotNullExpressionValue(string2, "triggerJSON.optString(KEY_EVENT_NAME, \"\")");
        this.a = string2;
        string2 = jSONObject.optJSONArray("eventProperties");
        this.b = string2;
        string2 = jSONObject.optJSONArray("itemProperties");
        this.c = string2;
        string2 = jSONObject.optJSONArray("geoRadius");
        this.d = string2;
        this.e = string2 = jSONObject.optString("profileAttrName", null);
        this.f = bl2 = jSONObject.optBoolean("firstTimeOnly", false);
    }

    public static ps3 a(JSONObject object) {
        ss3_0 ss3_022;
        ts3_0 ts3_02;
        Object object2;
        block3: {
            Intrinsics.checkNotNullParameter(object, "property");
            object2 = object.opt("propertyValue");
            ts3_02 = new ts3_0(object2, 2);
            object2 = "operator";
            Intrinsics.checkNotNullParameter(object2, "key");
            int n3 = ss3_0.Equals.getOperatorValue();
            int n4 = object.optInt((String)object2, n3);
            ss3_0.Companion.getClass();
            for (ss3_0 ss3_022 : ss3_0.values()) {
                int n7 = ss3_022.getOperatorValue();
                if (n7 != n4) {
                    continue;
                }
                break block3;
            }
            ss3_022 = null;
        }
        if (ss3_022 == null) {
            ss3_022 = ss3_0.Equals;
        }
        object = object.optString("propertyName", "");
        Intrinsics.checkNotNullExpressionValue(object, "property.optString(INAPP_PROPERTYNAME, \"\")");
        object2 = new ps3((String)object, ss3_022, ts3_02);
        return object2;
    }
}

