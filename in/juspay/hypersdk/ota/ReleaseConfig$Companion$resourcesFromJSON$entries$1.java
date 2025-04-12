/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.ReleaseConfig$Companion;
import in.juspay.hypersdk.ota.ReleaseConfig$Resource;
import java.net.URL;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

final class ReleaseConfig$Companion$resourcesFromJSON$entries$1
extends Lambda
implements Function1 {
    final /* synthetic */ JSONObject $json;

    public ReleaseConfig$Companion$resourcesFromJSON$entries$1(JSONObject jSONObject) {
        this.$json = jSONObject;
        super(1);
    }

    public final ReleaseConfig$Resource invoke(String string2) {
        Object object = this.$json.getJSONObject(string2);
        Intrinsics.checkNotNullExpressionValue(string2, "key");
        Object object2 = ReleaseConfig.Companion;
        Intrinsics.checkNotNullExpressionValue(object, "value");
        object2 = ReleaseConfig$Companion.access$getURL((ReleaseConfig$Companion)object2, object, "url");
        String string3 = object.getString("version");
        Intrinsics.checkNotNullExpressionValue(string3, "value.getString(\"version\")");
        object = object.getString("extension");
        Intrinsics.checkNotNullExpressionValue(object, "value.getString(\"extension\")");
        ReleaseConfig$Resource releaseConfig$Resource = new ReleaseConfig$Resource(string2, (URL)object2, string3, (String)object);
        return releaseConfig$Resource;
    }
}

