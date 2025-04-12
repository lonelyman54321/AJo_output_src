/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.Utils;
import org.json.JSONException;
import org.json.JSONObject;

public class HyperJsInterface
extends JsInterface {
    private static final String LOG_TAG = "HyperJsInterface";

    public HyperJsInterface(JuspayServices juspayServices) {
        super(juspayServices);
    }

    public String checkPermission(String[] stringArray) {
        JSONObject jSONObject = new JSONObject();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        int n3 = stringArray.length;
        Object object = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object = stringArray[i3];
            Object object2 = this.juspayServices;
            boolean bl2 = Utils.checkIfGranted((JuspayServices)object2, (String)object);
            try {
                jSONObject.put((String)object, bl2);
                continue;
            }
            catch (JSONException jSONException) {
                String string2 = "jbridge";
                String string3 = "Caught this exception while setting in JSON: ";
                object2 = LOG_TAG;
                String string4 = "action";
                String string5 = "system";
                object = sdkTracker;
                sdkTracker.trackAndLogException((String)object2, string4, string5, string2, string3, jSONException);
            }
        }
        return jSONObject.toString();
    }

    public void downloadApps(String string2) {
        JuspayLogger.e(LOG_TAG, "Method downloadApps() has empty body");
    }

    public void exitApp(int n3, String string2) {
    }

    public void hideKeyboard() {
        JuspayLogger.e(LOG_TAG, "Method hideKeyboard() has empty body");
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        JuspayLogger.e(LOG_TAG, "Please override onRequestPermissionsResult");
    }

    public void requestPermission(String[] stringArray, String string2) {
        JuspayServices juspayServices = this.juspayServices;
        int n3 = Integer.parseInt(string2);
        juspayServices.requestPermission(stringArray, n3);
    }

    public void setClickFeedback(String string2) {
        JuspayLogger.e(LOG_TAG, "Method setClickFeedback(String) has empty body");
    }
}

