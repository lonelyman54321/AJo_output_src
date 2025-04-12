/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Cm2
 */
public final class cm2_1 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;

    public cm2_1(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "component");
        ArrayList<kn2> arrayList = jSONObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(arrayList, "component.getString(PARAMETER_NAME_KEY)");
        this.a = arrayList;
        arrayList = jSONObject.optString("value");
        Intrinsics.checkNotNullExpressionValue(arrayList, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = arrayList;
        arrayList = jSONObject.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(arrayList, "component.optString(Cons\u2026tants.PATH_TYPE_ABSOLUTE)");
        this.d = arrayList;
        arrayList = new ArrayList<kn2>();
        String string2 = "path";
        jSONObject = jSONObject.optJSONArray(string2);
        if (jSONObject != null) {
            int n3 = jSONObject.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(i3);
                String string3 = "jsonPathArray.getJSONObject(i)";
                Intrinsics.checkNotNullExpressionValue(jSONObject2, string3);
                kn2 kn22 = new kn2(jSONObject2);
                arrayList.add(kn22);
            }
        }
        this.c = arrayList;
    }
}

