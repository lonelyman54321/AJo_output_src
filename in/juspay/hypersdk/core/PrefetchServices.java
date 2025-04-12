/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.R$bool;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.network.NetUtils;
import org.json.JSONObject;

public class PrefetchServices {
    private static final String LOG_TAG = "PrefetchServices";

    public static /* synthetic */ void a() {
        PrefetchServices.lambda$preFetch$0();
    }

    private static /* synthetic */ void lambda$preFetch$0() {
    }

    public static void preFetch(Context object, JSONObject jSONObject, String string2) {
        JuspayCoreLib.setApplicationContext(object.getApplicationContext());
        NetUtils.setApplicationHeaders(object);
        Object object2 = "pre_fetch";
        String string3 = "true";
        jSONObject.put((String)object2, (Object)string3);
        object2 = "use_local_assets";
        string3 = "useLocalAssets";
        Object object3 = object.getResources();
        int n3 = R$bool.use_local_assets;
        boolean bl2 = object3.getBoolean(n3);
        boolean bl3 = jSONObject.optBoolean(string3, bl2);
        jSONObject.put((String)object2, bl3);
        bl3 = false;
        string3 = null;
        bl2 = true;
        object2 = new JuspayServices((Context)object, null, string2, bl2);
        ((JuspayServices)object2).setBundleParameter(jSONObject);
        object = new Object();
        try {
            ((JuspayServices)object2).initiate((Runnable)object);
        }
        catch (Exception exception) {
            String string4 = "prefetch";
            String string5 = "Exception happened in PREFETCH";
            object2 = LOG_TAG;
            string3 = "lifecycle";
            object3 = "hypersdk";
            SdkTracker.trackAndLogBootException((String)object2, string3, (String)object3, string4, string5, exception);
        }
    }
}

