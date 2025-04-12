/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package in.juspay.hypersdk.core;

import android.os.Handler;
import android.os.Message;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.Utils;

class GodelServiceResponseHandler
extends Handler {
    private static final String TAG = "GodelServiceResponseHandler";
    private String callBackFnName;
    private final JuspayServices juspayServices;

    public GodelServiceResponseHandler(String string2, JuspayServices juspayServices) {
        this.callBackFnName = string2;
        this.juspayServices = juspayServices;
    }

    public void handleMessage(Message object) {
        String string2 = "Got response from the MPIN SDK: ";
        Object object2 = this.callBackFnName;
        if (object2 != null) {
            object2 = this.juspayServices.getSdkTracker();
            Object object3 = object.getData();
            Exception exception = Utils.toJSON(object3);
            object3 = "code";
            int n3 = ((Message)object).what;
            exception.put((String)object3, n3);
            String string3 = "system";
            String string4 = "info";
            String string5 = "godel_service_response_handler";
            String string6 = "gsrh_handle_message";
            object = new StringBuilder(string2);
            int n4 = 2;
            string2 = exception.toString(n4);
            ((StringBuilder)object).append(string2);
            String string7 = ((StringBuilder)object).toString();
            object3 = object2;
            ((SdkTracker)object2).trackAction(string3, string4, string5, string6, string7);
            string3 = "system";
            string4 = "info";
            string5 = "godel_service_response_handler";
            string6 = "gsrh_handle_message";
            string7 = "Sending response back to micro-app";
            ((SdkTracker)object2).trackAction(string3, string4, string5, string6, string7);
            object = this.juspayServices;
            object = ((JuspayServices)object).getJBridge();
            string2 = this.callBackFnName;
            object3 = exception.toString();
            try {
                ((DuiInterface)object).invokeCallbackInDUIWebview(string2, (String)object3);
            }
            catch (Exception exception2) {
                exception = exception2;
                string6 = "mpin_util";
                string7 = "Exception while trying to handle message";
                string3 = TAG;
                string4 = "action";
                string5 = "system";
                object3 = object2;
                ((SdkTracker)object2).trackAndLogException(string3, string4, string5, string6, string7, exception2);
            }
        }
        this.callBackFnName = null;
    }
}

