/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class CB0$b {
    public static CB0 a(JSONObject object) {
        Object object2;
        Object object3;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "mapping");
        String string2 = object.getString("event_name");
        Object object5 = object.getString("method");
        Intrinsics.checkNotNullExpressionValue(object5, "mapping.getString(\"method\")");
        Object object6 = Locale.ENGLISH;
        String string3 = "ENGLISH";
        Intrinsics.checkNotNullExpressionValue(object6, string3);
        object5 = object5.toUpperCase((Locale)object6);
        Object object7 = "this as java.lang.String).toUpperCase(locale)";
        Intrinsics.checkNotNullExpressionValue(object5, object7);
        object5 = CB0$c.valueOf(object5);
        String string4 = object.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string4, "mapping.getString(\"event_type\")");
        Intrinsics.checkNotNullExpressionValue(object6, string3);
        object6 = string4.toUpperCase((Locale)object6);
        Intrinsics.checkNotNullExpressionValue(object6, object7);
        object7 = CB0$a.valueOf((String)object6);
        string4 = object.getString("app_version");
        object6 = object.getJSONArray("path");
        ArrayList<kn2> arrayList = new ArrayList<kn2>();
        int n3 = object6.length();
        int n4 = 0;
        ArrayList<Object> arrayList2 = null;
        Object object8 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object4 = object6.getJSONObject(i3);
            object3 = "jsonPath";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
            object2 = new kn2((JSONObject)object4);
            arrayList.add((kn2)object2);
        }
        string3 = "absolute";
        object4 = object.optString("path_type", string3);
        object6 = object.optJSONArray("parameters");
        object8 = new ArrayList();
        if (object6 != null) {
            n3 = object6.length();
            while (n4 < n3) {
                object2 = object6.getJSONObject(n4);
                String string5 = "jsonParameter";
                Intrinsics.checkNotNullExpressionValue(object2, string5);
                object3 = new cm2_1((JSONObject)object2);
                ((ArrayList)object8).add(object3);
                ++n4;
            }
        }
        object2 = object.optString("component_id");
        object = object.optString("activity_name");
        Intrinsics.checkNotNullExpressionValue(string2, "eventName");
        Intrinsics.checkNotNullExpressionValue(string4, "appVersion");
        Intrinsics.checkNotNullExpressionValue(object2, "componentId");
        Intrinsics.checkNotNullExpressionValue(object4, "pathType");
        Intrinsics.checkNotNullExpressionValue(object, "activityName");
        object6 = object3;
        string3 = object5;
        arrayList2 = object8;
        object8 = object2;
        object2 = object;
        object3 = new CB0(string2, (CB0$c)((Object)object5), (CB0$a)((Object)object7), string4, arrayList, arrayList2, (String)object8, (String)object4, (String)object);
        return object3;
    }
}

