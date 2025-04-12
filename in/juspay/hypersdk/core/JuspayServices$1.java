/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.mystique.Callback;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

class JuspayServices$1
implements Callback {
    final /* synthetic */ JuspayServices this$0;

    public JuspayServices$1(JuspayServices juspayServices) {
        this.this$0 = juspayServices;
    }

    public void onError(String string2, String string3) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append(string3);
        object = ((StringBuilder)object).toString();
        JuspayLogger.e("DynamicUI", (String)object);
        SdkTracker sdkTracker = JuspayServices.access$000(this.this$0);
        object = Locale.getDefault();
        String string4 = string2.toLowerCase((Locale)object);
        sdkTracker.trackAction("dynamic_ui", "error", "mystique", string4, string3);
    }

    public void onException(String string2, String string3, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        stringBuilder.append(string3);
        string2 = stringBuilder.toString();
        JuspayLogger.e("DynamicUI", string2);
        JuspayServices.access$000(this.this$0).trackException("action", "dynamic_ui", "mystique", string3, throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onRenderProcessGone(boolean bl2) {
        boolean bl3;
        Object object;
        Object object2 = JuspayServices.access$200(this.this$0);
        if (object2 == null) return;
        try {
            object2 = new JSONObject();
            String string2 = "action";
            String string3 = "OnRenderProcessGone";
            object2.put(string2, (Object)string3);
            string2 = "isRecreating";
            object2.put(string2, bl2);
            object = this.this$0;
            object = JuspayServices.access$200((JuspayServices)object);
            bl3 = false;
            string2 = null;
            object.onEvent((JSONObject)object2, null);
        }
        catch (Exception exception) {}
        object = JuspayServices.access$300(this.this$0);
        if (object == null) return;
        try {
            object = this.this$0;
            object = JuspayServices.access$300((JuspayServices)object);
            object2 = "isWebViewRecreated";
            bl3 = true;
            object.put((String)object2, bl3);
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    public void webViewLoaded(Exception object) {
        if (object != null) {
            object = this.this$0;
            Runnable runnable2 = ((JuspayServices)object).webViewCrashCallback;
            if (runnable2 != null) {
                runnable2 = null;
                JuspayServices.access$102((JuspayServices)object, false);
                object = this.this$0.webViewCrashCallback;
                object.run();
            }
        }
        this.this$0.webViewCrashCallback = null;
    }
}

