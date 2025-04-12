/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.ReleaseConfig$Companion$resourcesFromJSON$entries$1;
import in.juspay.hypersdk.ota.ReleaseConfig$Config;
import in.juspay.hypersdk.ota.ReleaseConfig$PackageManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$ResourceManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$Split;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ReleaseConfig$Companion {
    private ReleaseConfig$Companion() {
    }

    public /* synthetic */ ReleaseConfig$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ URL access$getURL(ReleaseConfig$Companion releaseConfig$Companion, JSONObject jSONObject, String string2) {
        return releaseConfig$Companion.getURL(jSONObject, string2);
    }

    private final ReleaseConfig$Config configFromJSON(JSONObject jSONObject) {
        String string2 = jSONObject.getString("version");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"version\")");
        long l2 = jSONObject.getLong("release_config_timeout");
        long l3 = jSONObject.getLong("package_timeout");
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.getJSONObject(\"properties\")");
        ReleaseConfig$Config releaseConfig$Config = new ReleaseConfig$Config(string2, l2, l3, jSONObject2);
        return releaseConfig$Config;
    }

    private final URL getURL(JSONArray object, int n3) {
        try {
            object = object.getString(n3);
        }
        catch (MalformedURLException malformedURLException) {
            String string2 = Gj0.b(n3, "Value at index '", "' is not a valid URL.");
            object = new JSONException(string2);
            throw object;
        }
        URL uRL = new URL((String)object);
        return uRL;
    }

    private final URL getURL(JSONObject object, String string2) {
        try {
            object = object.getString(string2);
        }
        catch (MalformedURLException malformedURLException) {
            string2 = cP.a("Property '", string2, "' is not a valid URL.");
            object = new JSONException(string2);
            throw object;
        }
        URL uRL = new URL((String)object);
        return uRL;
    }

    private final ReleaseConfig$PackageManifest packageFromJSON(JSONObject object) {
        String string2 = object.getString("name");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"name\")");
        String string3 = object.getString("version");
        Intrinsics.checkNotNullExpressionValue(string3, "json.getString(\"version\")");
        JSONObject jSONObject = object.getJSONObject("properties");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "json.getJSONObject(\"properties\")");
        Object object2 = this.getURL((JSONObject)object, "index");
        ReleaseConfig$Split releaseConfig$Split = new ReleaseConfig$Split((URL)object2);
        object2 = "splits";
        object = object.getJSONArray((String)object2);
        int n3 = object.length();
        ArrayList<ReleaseConfig$Split> arrayList = new ArrayList<ReleaseConfig$Split>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = ReleaseConfig.Companion;
            String string4 = "it";
            Intrinsics.checkNotNullExpressionValue(object, string4);
            object3 = ((ReleaseConfig$Companion)object3).getURL((JSONArray)object, i3);
            ReleaseConfig$Split releaseConfig$Split2 = new ReleaseConfig$Split((URL)object3);
            arrayList.add(releaseConfig$Split2);
        }
        object = new ReleaseConfig$PackageManifest(string2, string3, jSONObject, releaseConfig$Split, arrayList);
        return object;
    }

    public final Object deSerialize-IoAF18A(String object) {
        Object object2 = "serialized";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = new JSONObject((String)object);
        Object object3 = "config";
        object3 = object2.getJSONObject((String)object3);
        Object object4 = "json.getJSONObject(\"config\")";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = this.configFromJSON((JSONObject)object3);
        object4 = "package";
        object4 = object2.getJSONObject((String)object4);
        String string2 = "json.getJSONObject(\"package\")";
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        object4 = this.packageFromJSON((JSONObject)object4);
        string2 = "resources";
        object2 = object2.getJSONObject(string2);
        string2 = "json.getJSONObject(\"resources\")";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = this.resourcesFromJSON((JSONObject)object2);
        try {
            object = new ReleaseConfig((ReleaseConfig$Config)object3, (ReleaseConfig$PackageManifest)object4, (ReleaseConfig$ResourceManifest)object2);
            object2 = tl2_2.b;
        }
        catch (JSONException jSONException) {
            object2 = tl2_2.b;
            object = vl2_2.a(jSONException);
        }
        return object;
    }

    public final Object deSerializeConfig-IoAF18A(String object) {
        Object object2 = "serialized";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = tl2_2.b;
        object2 = new JSONObject((String)object);
        try {
            object = this.configFromJSON((JSONObject)object2);
        }
        catch (JSONException jSONException) {
            object2 = tl2_2.b;
            object = vl2_2.a(jSONException);
        }
        return object;
    }

    public final Object deSerializePackage-IoAF18A(String object) {
        Object object2 = "serialized";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = tl2_2.b;
        object2 = new JSONObject((String)object);
        try {
            object = this.packageFromJSON((JSONObject)object2);
        }
        catch (JSONException jSONException) {
            object2 = tl2_2.b;
            object = vl2_2.a(jSONException);
        }
        return object;
    }

    public final Object deSerializeResources-IoAF18A(String object) {
        Object object2 = "serialized";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = tl2_2.b;
        object2 = new JSONObject((String)object);
        try {
            object = this.resourcesFromJSON((JSONObject)object2);
        }
        catch (JSONException jSONException) {
            object2 = tl2_2.b;
            object = vl2_2.a(jSONException);
        }
        return object;
    }

    public final ReleaseConfig$ResourceManifest resourcesFromJSON(JSONObject object) {
        Intrinsics.checkNotNullParameter(object, "json");
        Object object2 = object.keys();
        Intrinsics.checkNotNullExpressionValue(object2, "json.keys()");
        object2 = ez2_1.b((Iterator)object2);
        ReleaseConfig$Companion$resourcesFromJSON$entries$1 releaseConfig$Companion$resourcesFromJSON$entries$1 = new ReleaseConfig$Companion$resourcesFromJSON$entries$1((JSONObject)object);
        object = kz2_1.l(kz2_1.i((Sequence)object2, releaseConfig$Companion$resourcesFromJSON$entries$1));
        object2 = new ReleaseConfig$ResourceManifest((List)object);
        return object2;
    }
}

