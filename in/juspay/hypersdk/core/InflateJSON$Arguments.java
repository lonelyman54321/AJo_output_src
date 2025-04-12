/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.InflateJSON;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

class InflateJSON$Arguments {
    private final Object[] args;
    private Class[] classTypes;
    final /* synthetic */ InflateJSON this$0;

    public InflateJSON$Arguments(InflateJSON inflateJSON, JSONArray jSONArray, Object object, LinkedList linkedList) {
        Object object2;
        this.this$0 = inflateJSON;
        int n3 = 0;
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            object2 = new Class[]{};
            this.classTypes = object2;
        }
        object2 = new Object[jSONArray.length()];
        this.args = object2;
        int n4 = jSONArray.length();
        object2 = new Class[n4];
        this.classTypes = object2;
        while (n3 < (n4 = jSONArray.length())) {
            Object object3;
            object2 = jSONArray.getJSONObject(n3);
            Object[] objectArray = this.args;
            objectArray[n3] = object3 = inflateJSON.getValue((JSONObject)object2, object, linkedList);
            objectArray = this.classTypes;
            object3 = this.args[n3];
            String string2 = "et";
            object2 = object2.optString(string2);
            object2 = (Class)InflateJSON.access$200(inflateJSON, object3, (String)object2);
            objectArray[n3] = object2;
            ++n3;
        }
    }

    public static /* synthetic */ Object[] access$000(InflateJSON$Arguments inflateJSON$Arguments) {
        return inflateJSON$Arguments.args;
    }

    public static /* synthetic */ Class[] access$100(InflateJSON$Arguments inflateJSON$Arguments) {
        return inflateJSON$Arguments.classTypes;
    }
}

