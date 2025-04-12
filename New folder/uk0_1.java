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
 * Renamed from UK0
 */
public final class uk0_1
implements qx_1 {
    public final tf_0 a;

    public uk0_1(ck_1 ck_12) {
        Intrinsics.checkNotNullParameter(ck_12, "callbackManager");
        this.a = ck_12;
    }

    public final void a(JSONArray jSONArray, boolean n3) {
        String string2 = "batch";
        Intrinsics.checkNotNullParameter(jSONArray, string2);
        n3 = jSONArray.length();
        tf_0 tf_02 = this.a;
        if (!n3) {
            tf_02.getClass();
            return;
        }
        n3 = jSONArray.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            String string3;
            int n7;
            JSONObject jSONObject;
            Object object = jSONArray.optJSONObject(i3);
            if (object == null) {
                object = new JSONObject();
            }
            if ((jSONObject = object.optJSONObject("evtData")) == null) {
                jSONObject = new JSONObject();
            }
            if ((n7 = Intrinsics.areEqual(object = object.optString("evtName"), string3 = "wzrk_fetch")) == 0 || (n7 = jSONObject.optInt((String)(object = "t"))) != (n4 = 5)) continue;
            tf_02.getClass();
            return;
        }
    }
}

