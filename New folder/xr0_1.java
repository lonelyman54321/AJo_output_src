/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from xr0
 */
public final class xr0_1
extends zV {
    public final Object b;
    public final tf_0 c;
    public final CleverTapInstanceConfig d;
    public final l80_0 e;
    public final b f;

    public xr0_1(ck_1 ck_12, l80_0 l80_02, CleverTapInstanceConfig object) {
        Object object2;
        this.b = object2 = new Object();
        this.d = object;
        this.f = object = ((CleverTapInstanceConfig)object).b();
        this.c = ck_12;
        this.e = l80_02;
    }

    public final void a(Context object, JSONObject jSONObject, String string2) {
        object = this.d;
        string2 = object.a;
        b b2 = this.f;
        String string3 = "Processing Display Unit items...";
        b2.b(string2, string3);
        boolean bl2 = object.h;
        if (bl2) {
            object = object.a;
            b2.b((String)object, "CleverTap instance is configured to analytics only, not processing Display Unit response");
            return;
        }
        if (jSONObject == null) {
            object = object.a;
            b2.b((String)object, "DisplayUnit : Can't parse Display Unit Response, JSON response object is null");
            return;
        }
        string2 = "adUnit_notifs";
        boolean bl3 = jSONObject.has(string2);
        if (!bl3) {
            object = object.a;
            b2.b((String)object, "DisplayUnit : JSON object doesn't contain the Display Units key");
            return;
        }
        object = object.a;
        string3 = "DisplayUnit : Processing Display Unit response";
        b2.b((String)object, string3);
        object = jSONObject.getJSONArray(string2);
        try {
            this.b((JSONArray)object);
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.m();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(JSONArray object) {
        int n3;
        if (object != null && (n3 = object.length()) != 0) {
            boolean bl2;
            Object object2 = this.b;
            // MONITORENTER : object2
            Object object3 = this.e;
            hh_1 hh_12 = ((l80_0)object3).c;
            if (hh_12 == null) {
                ((l80_0)object3).c = hh_12 = new hh_1();
            }
            object = this.e.c.b((JSONArray)object);
            object2 = ((ck_1)this.c).c;
            if (object != null && !(bl2 = ((ArrayList)object).isEmpty())) {
                object = ((CleverTapInstanceConfig)object2).b();
                object2 = ((CleverTapInstanceConfig)object2).a;
                object3 = "DisplayUnit : No registered listener, failed to notify";
                ((b)object).b((String)object2, (String)object3);
                return;
            }
            object = ((CleverTapInstanceConfig)object2).b();
            object2 = ((CleverTapInstanceConfig)object2).a;
            object3 = "DisplayUnit : No Display Units found";
            ((b)object).b((String)object2, (String)object3);
            return;
        }
        object = this.f;
        String string2 = this.d.a;
        ((b)object).b(string2, "DisplayUnit : Can't parse Display Units, jsonArray is either empty or null");
    }
}

