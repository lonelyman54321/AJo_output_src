/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cw
extends h40 {
    public static final cw$a Companion;
    public static FirebaseRemoteConfig c;
    public final Context a;
    public final FirebaseRemoteConfig b;

    static {
        cw$a cw$a;
        Companion = cw$a = new Object();
    }

    public cw(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.a = object;
        Object object3 = this.b;
        if (object3 == null) {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = new FirebaseRemoteConfigSettings$Builder();
            object2 = ((FirebaseRemoteConfigSettings$Builder)object2).setMinimumFetchIntervalInSeconds(60);
            long l2 = 30;
            object2 = ((FirebaseRemoteConfigSettings$Builder)object2).setFetchTimeoutInSeconds(l2).build();
            Intrinsics.checkNotNullExpressionValue(object2, "build(...)");
            FirebaseApp.initializeApp((Context)object);
            object = FirebaseRemoteConfig.getInstance();
            Intrinsics.checkNotNullExpressionValue(object, "getInstance(...)");
            object3 = ((FirebaseRemoteConfig)object).getInfo();
            object3.getLastFetchStatus();
            ((FirebaseRemoteConfig)object).setConfigSettingsAsync((FirebaseRemoteConfigSettings)object2);
            object2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            this.b = object;
        }
    }

    public final FirebaseRemoteConfig c() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.b;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseRemoteConfig");
        return null;
    }

    public final JSONObject d(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        FirebaseRemoteConfig firebaseRemoteConfig = this.c();
        string2 = firebaseRemoteConfig.getString(string2);
        try {
            string3 = new JSONObject(string2);
        }
        catch (JSONException jSONException) {
            string3 = new JSONObject();
        }
        return string3;
    }

    public final JSONArray e(String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        FirebaseRemoteConfig firebaseRemoteConfig = this.c();
        string2 = firebaseRemoteConfig.getString(string2);
        try {
            string3 = new JSONArray(string2);
        }
        catch (JSONException jSONException) {
            string3 = new JSONArray();
        }
        return string3;
    }
}

