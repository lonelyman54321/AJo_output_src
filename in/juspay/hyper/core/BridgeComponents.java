/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  org.json.JSONObject
 */
package in.juspay.hyper.core;

import android.app.Activity;
import android.content.Context;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.FragmentHooks;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.SessionInfoInterface;
import in.juspay.hyper.core.TrackerInterface;
import org.json.JSONObject;

public interface BridgeComponents {
    public Activity getActivity();

    public CallbackInvoker getCallbackInvoker();

    public String getClientId();

    public Context getContext();

    public FileProviderInterface getFileProviderInterface();

    public FragmentHooks getFragmentHooks();

    public JsCallback getJsCallback();

    public JSONObject getSdkConfig();

    public String getSdkName();

    public SessionInfoInterface getSessionInfoInterface();

    public TrackerInterface getTrackerInterface();
}

