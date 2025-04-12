/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.Workspace;
import org.json.JSONException;
import org.json.JSONObject;

public class SdkConfigService {
    private static final String sdkConfigLocation = "sdk_config.json";
    private final JuspayServices juspayServices;
    private JSONObject sdkConfig;
    private final Workspace workspace;

    public SdkConfigService(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        Object object = juspayServices.getWorkspace();
        this.workspace = object;
        String string2 = sdkConfigLocation;
        String string3 = "{}";
        object = ((Workspace)object).getFromSharedPreference(string2, string3);
        Object object2 = new JSONObject((String)object);
        try {
            this.sdkConfig = object2;
        }
        catch (JSONException jSONException) {
            this.sdkConfig = object;
            object2 = juspayServices.getSdkTracker();
            String string4 = "sdk_meta";
            String string5 = "Exception while parsing sdk config";
            string2 = "lifecycle";
            string3 = "hypersdk";
            ((SdkTracker)object2).trackException(string2, string3, string4, string5, jSONException);
        }
    }

    public static JSONObject getCachedSdkConfig(Workspace object) {
        String string2 = sdkConfigLocation;
        String string3 = "{}";
        try {
            object = ((Workspace)object).getFromSharedPreference(string2, string3);
        }
        catch (JSONException jSONException) {
            SdkTracker.trackBootException("lifecycle", "hypersdk", "sdk_meta", "Exception while parsing cached sdk config", jSONException);
            return null;
        }
        JSONObject jSONObject = new JSONObject((String)object);
        return jSONObject;
    }

    public JSONObject getSdkConfig() {
        return this.sdkConfig;
    }

    public void renewConfig(Context object) {
        Object object2 = sdkConfigLocation;
        Object object3 = this.juspayServices;
        object3 = ((JuspayServices)object3).getFileProviderService();
        object = ((FileProviderService)object3).readFromFile((Context)object, (String)object2);
        object3 = new JSONObject((String)object);
        this.sdkConfig = object3;
        object3 = this.workspace;
        try {
            ((Workspace)object3).writeToSharedPreference((String)object2, (String)object);
        }
        catch (JSONException jSONException) {
            object = this.juspayServices;
            object2 = ((JuspayServices)object).getSdkTracker();
            String string2 = "sdk_meta";
            String string3 = "Exception while parsing renewed sdk config";
            object3 = "lifecycle";
            String string4 = "hypersdk";
            ((SdkTracker)object2).trackException((String)object3, string4, string2, string3, jSONException);
        }
    }
}

