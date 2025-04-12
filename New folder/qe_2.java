/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from qe
 */
public final class qe_2
implements Callable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ we b;

    public qe_2(we we2, Bundle bundle) {
        this.b = we2;
        this.a = bundle;
    }

    public final Object call() {
        we we2 = this.b;
        Object object = "wzrk_inbox";
        Object object2 = this.a;
        object2.getString((String)object);
        com.clevertap.android.sdk.b.j();
        JSONObject jSONObject = new JSONObject();
        Object object3 = new JSONArray();
        Object object4 = "inbox_notifs";
        jSONObject.put((String)object4, object3);
        object = object2.getString((String)object);
        object4 = new JSONObject((String)object);
        object = "_id";
        long l2 = System.currentTimeMillis();
        long l3 = 1000L;
        l2 /= l3;
        object2 = String.valueOf(l2);
        object4.put((String)object, object2);
        object3.put(object4);
        object2 = we2.e;
        object3 = we2.a;
        object4 = we2.d;
        l80_0 l80_02 = we2.g;
        object = new xg1_1((CleverTapInstanceConfig)object2, (ti_0)object3, (tf_0)object4, l80_02);
        we2 = we2.f;
        try {
            ((xg1_1)object).a((Context)we2, jSONObject, null);
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.l();
        }
        return null;
    }
}

