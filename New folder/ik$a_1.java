/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from iK$a
 */
public final class ik$a_1
implements iK$d {
    public final void a(JSONObject jSONObject, String string2, Object object) {
        Intrinsics.checkNotNullParameter(jSONObject, "json");
        Intrinsics.checkNotNullParameter(string2, "key");
        jSONObject.put(string2, object);
    }
}

