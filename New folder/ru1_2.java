/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from ru1
 */
public final class ru1_2 {
    public final su1_2 a;
    public final int b;
    public final int c;

    public ru1_2(JSONObject jSONObject) {
        int n3;
        int n4;
        su1_2 su1_222;
        block3: {
            Intrinsics.checkNotNullParameter(jSONObject, "limitJSON");
            su1_2[] su1_2Array = su1_2.Companion;
            String string2 = "type";
            String string3 = jSONObject.optString(string2);
            Intrinsics.checkNotNullExpressionValue(string3, "limitJSON.optString(Constants.KEY_TYPE)");
            su1_2Array.getClass();
            Intrinsics.checkNotNullParameter(string3, string2);
            for (su1_2 su1_222 : su1_2.values()) {
                String string4 = su1_222.getType();
                boolean bl2 = Intrinsics.areEqual(string4, string3);
                if (!bl2) {
                    continue;
                }
                break block3;
            }
            su1_222 = null;
        }
        if (su1_222 == null) {
            su1_222 = su1_2.Ever;
        }
        this.a = su1_222;
        this.b = n4 = jSONObject.optInt("limit");
        this.c = n3 = jSONObject.optInt("frequency");
    }
}

