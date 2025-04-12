/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class iK$c
implements iK$d {
    public final void a(JSONObject object, String string2, Object object2) {
        Intrinsics.checkNotNullParameter(object, "json");
        Intrinsics.checkNotNullParameter(string2, "key");
        object = new IllegalArgumentException("JSONArray's are not supported in bundles.");
        throw object;
    }
}

