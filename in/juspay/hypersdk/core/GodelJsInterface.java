/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import org.json.JSONException;
import org.json.JSONObject;

public class GodelJsInterface {
    private static final String LOG_TAG = "GodelJsInterface";
    private final JuspayServices juspayServices;

    public GodelJsInterface(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    public void sendMessage(String object) {
        HyperPaymentsCallback hyperPaymentsCallback = this.juspayServices.getHyperCallback();
        if (hyperPaymentsCallback == null) {
            return;
        }
        hyperPaymentsCallback = this.juspayServices.getHyperCallback();
        JSONObject jSONObject = new JSONObject();
        Object object2 = "event";
        String string2 = "godel_merchant_message";
        jSONObject.put((String)object2, (Object)string2);
        object2 = "payload";
        try {
            jSONObject.put((String)object2, object);
        }
        catch (JSONException jSONException) {
            object = this.juspayServices;
            object2 = ((JuspayServices)object).getSdkTracker();
            String string3 = "jbridge";
            String string4 = "exception on godelJsInterface";
            string2 = LOG_TAG;
            String string5 = "action";
            String string6 = "system";
            ((SdkTracker)object2).trackAndLogException(string2, string5, string6, string3, string4, jSONException);
        }
        hyperPaymentsCallback.onEvent(jSONObject, null);
    }
}

