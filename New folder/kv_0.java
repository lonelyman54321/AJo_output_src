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
import java.util.concurrent.Callable;
import org.json.JSONObject;

/*
 * Renamed from kV
 */
public final class kv_0
implements Callable {
    public final /* synthetic */ CleverTapInstanceConfig a;
    public final /* synthetic */ Context b;

    public /* synthetic */ kv_0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.a = cleverTapInstanceConfig;
        this.b = context;
    }

    public final Object call() {
        Object object = this.a;
        object.getClass();
        Object object2 = new JSONObject();
        String string2 = "accountId";
        String string3 = ((CleverTapInstanceConfig)object).a;
        object2.put(string2, (Object)string3);
        string2 = "accountToken";
        string3 = ((CleverTapInstanceConfig)object).c;
        object2.put(string2, (Object)string3);
        string2 = "accountRegion";
        string3 = ((CleverTapInstanceConfig)object).b;
        object2.put(string2, (Object)string3);
        string2 = "proxyDomain";
        string3 = ((CleverTapInstanceConfig)object).d;
        object2.put(string2, (Object)string3);
        string2 = "spikyProxyDomain";
        string3 = ((CleverTapInstanceConfig)object).e;
        object2.put(string2, (Object)string3);
        string2 = "customHandshakeDomain";
        string3 = ((CleverTapInstanceConfig)object).f;
        object2.put(string2, (Object)string3);
        string2 = "fcmSenderId";
        string3 = ((CleverTapInstanceConfig)object).o;
        object2.put(string2, (Object)string3);
        string2 = "analyticsOnly";
        int n3 = ((CleverTapInstanceConfig)object).h;
        object2.put(string2, n3 != 0);
        string2 = "isDefaultInstance";
        n3 = ((CleverTapInstanceConfig)object).p;
        object2.put(string2, n3 != 0);
        string2 = "useGoogleAdId";
        n3 = ((CleverTapInstanceConfig)object).v;
        object2.put(string2, n3 != 0);
        string2 = "disableAppLaunchedEvent";
        n3 = ((CleverTapInstanceConfig)object).m;
        object2.put(string2, n3 != 0);
        string2 = "personalization";
        n3 = ((CleverTapInstanceConfig)object).s;
        object2.put(string2, n3 != 0);
        string2 = "debugLevel";
        n3 = ((CleverTapInstanceConfig)object).l;
        object2.put(string2, n3);
        string2 = "createdPostAppLaunch";
        n3 = (int)(((CleverTapInstanceConfig)object).k ? 1 : 0);
        object2.put(string2, n3 != 0);
        string2 = "sslPinning";
        n3 = ((CleverTapInstanceConfig)object).u;
        object2.put(string2, n3 != 0);
        string2 = "backgroundSync";
        n3 = ((CleverTapInstanceConfig)object).i;
        object2.put(string2, n3 != 0);
        string2 = "getEnableCustomCleverTapId";
        n3 = ((CleverTapInstanceConfig)object).n;
        object2.put(string2, n3 != 0);
        string2 = "packageName";
        string3 = ((CleverTapInstanceConfig)object).r;
        object2.put(string2, (Object)string3);
        string2 = "beta";
        n3 = ((CleverTapInstanceConfig)object).j;
        object2.put(string2, n3 != 0);
        string2 = "encryptionLevel";
        n3 = ((CleverTapInstanceConfig)object).w;
        try {
            object2.put(string2, n3);
            object2 = object2.toString();
        }
        catch (Throwable throwable) {
            throwable.getCause();
            com.clevertap.android.sdk.b.l();
            object2 = null;
        }
        if (object2 == null) {
            com.clevertap.android.sdk.b.j();
        } else {
            object = gc3_0.l((CleverTapInstanceConfig)object, "instance");
            string2 = this.b;
            gc3_0.k((Context)string2, (String)object, (String)object2);
        }
        return null;
    }
}

