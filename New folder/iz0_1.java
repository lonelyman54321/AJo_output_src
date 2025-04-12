/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import org.json.JSONObject;

/*
 * Renamed from iZ0
 */
public final class iz0_1
extends zV {
    public final tf_0 b;
    public final CleverTapInstanceConfig c;
    public final b d;

    public iz0_1(CleverTapInstanceConfig object, ck_1 ck_12) {
        this.c = object;
        this.d = object = ((CleverTapInstanceConfig)object).b();
        this.b = ck_12;
    }

    public final void a(Context object, JSONObject jSONObject, String string2) {
        object = this.c;
        string2 = ((CleverTapInstanceConfig)object).a;
        b b2 = this.d;
        String string3 = "Processing GeoFences response...";
        b2.b(string2, string3);
        boolean bl2 = ((CleverTapInstanceConfig)object).h;
        if (bl2) {
            object = ((CleverTapInstanceConfig)object).a;
            b2.b((String)object, "CleverTap instance is configured to analytics only, not processing geofence response");
            return;
        }
        if (jSONObject == null) {
            object = ((CleverTapInstanceConfig)object).a;
            b2.b((String)object, "Geofences : Can't parse Geofences Response, JSON response object is null");
            return;
        }
        string2 = "geofences";
        boolean bl3 = jSONObject.has(string2);
        if (!bl3) {
            object = ((CleverTapInstanceConfig)object).a;
            b2.b((String)object, "Geofences : JSON object doesn't contain the Geofences key");
            return;
        }
        object = this.b;
        object.getClass();
        object = "Geofences : Geofence SDK has not been initialized to handle the response";
        try {
            com.clevertap.android.sdk.b.f((String)object);
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.m();
        }
    }
}

