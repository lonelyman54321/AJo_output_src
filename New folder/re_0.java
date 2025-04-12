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
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from re
 */
public final class re_0
implements Callable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ we b;

    public re_0(we we2, Bundle bundle) {
        this.b = we2;
        this.a = bundle;
    }

    public final Object call() {
        we we2;
        String string2;
        String string3;
        Object object;
        block16: {
            block15: {
                object = this.a;
                string3 = "wzrk_inapp_type";
                string3 = object.getString(string3);
                string2 = "wzrk_inapp";
                object = object.getString(string2);
                string2 = new JSONObject((String)object);
                object = new JSONArray();
                String string4 = "image-interstitial";
                boolean bl2 = string4.equals(string3);
                we2 = this.b;
                if (bl2) break block15;
                string4 = "advanced-builder";
                boolean bl3 = string4.equals(string3);
                if (bl3) break block15;
                object.put((Object)string2);
                break block16;
            }
            string3 = we.T(we2, (JSONObject)string2);
            object.put((Object)string3);
        }
        string3 = new JSONObject();
        string2 = "inapp_notifs";
        string3.put(string2, object);
        object = we2.l;
        string2 = we2.f;
        try {
            ((qg1_1)object).a((Context)string2, (JSONObject)string3, null);
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.l();
        }
        return null;
    }
}

