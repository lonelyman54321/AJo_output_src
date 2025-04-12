/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class kn2 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public kn2(JSONObject jSONObject) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(jSONObject, "component");
        String string2 = jSONObject.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string2, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string2;
        this.b = n4 = jSONObject.optInt("index", -1);
        this.c = n4 = jSONObject.optInt("id");
        string2 = jSONObject.optString("text");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_TEXT_KEY)");
        this.d = string2;
        string2 = jSONObject.optString("tag");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_TAG_KEY)");
        this.e = string2;
        string2 = jSONObject.optString("description");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = string2;
        string2 = jSONObject.optString("hint");
        Intrinsics.checkNotNullExpressionValue(string2, "component.optString(PATH_HINT_KEY)");
        this.g = string2;
        this.h = n3 = jSONObject.optInt("match_bitmask");
    }
}

