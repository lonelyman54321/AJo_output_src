/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.FragmentHooks;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.SessionInfoInterface;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.data.SessionInfo;
import org.json.JSONObject;

class JuspayServices$4
implements BridgeComponents {
    final /* synthetic */ JuspayServices this$0;

    public JuspayServices$4(JuspayServices juspayServices) {
        this.this$0 = juspayServices;
    }

    public Activity getActivity() {
        return JuspayServices.access$600(this.this$0);
    }

    public CallbackInvoker getCallbackInvoker() {
        return JuspayServices.access$700(this.this$0);
    }

    public String getClientId() {
        Object object = this.this$0;
        object = ((JuspayServices)object).getSessionInfo();
        try {
            object = ((SessionInfo)object).getClientId();
        }
        catch (Exception exception) {
            object = null;
        }
        return object;
    }

    public Context getContext() {
        return JuspayServices.access$500(this.this$0);
    }

    public FileProviderInterface getFileProviderInterface() {
        return JuspayServices.access$800(this.this$0);
    }

    public FragmentHooks getFragmentHooks() {
        return this.this$0;
    }

    public JsCallback getJsCallback() {
        return JuspayServices.access$900(this.this$0);
    }

    public JSONObject getSdkConfig() {
        return JuspayServices.access$1100(this.this$0).getSdkConfig();
    }

    public String getSdkName() {
        return JuspayServices.access$1000(this.this$0).getSdkName();
    }

    public SessionInfoInterface getSessionInfoInterface() {
        return JuspayServices.access$1200(this.this$0);
    }

    public TrackerInterface getTrackerInterface() {
        return JuspayServices.access$000(this.this$0);
    }
}

