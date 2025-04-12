/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class KB0 {
    public final E80 a;
    public final CleverTapInstanceConfig b;
    public final Context c;
    public final LocalDataStore d;
    public final lb2_0 e;

    public KB0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, E80 e80, LocalDataStore localDataStore, lb2_0 lb2_02) {
        this.c = context;
        this.b = cleverTapInstanceConfig;
        this.d = localDataStore;
        this.e = lb2_02;
        this.a = e80;
    }

    public static HashMap a(JSONObject object) {
        boolean bl2;
        String string2 = "evtName";
        boolean bl3 = object.has(string2);
        if (bl3 && (bl2 = object.has(string2 = "evtData"))) {
            object = object.getJSONObject(string2);
            try {
                return wm1_1.c(object);
            }
            catch (JSONException jSONException) {
                jSONException.getMessage();
                com.clevertap.android.sdk.b.j();
            }
        }
        object = new HashMap();
        return object;
    }
}

