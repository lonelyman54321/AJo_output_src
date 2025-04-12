/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.GodelServiceConnection;
import in.juspay.hypersdk.core.GodelServiceResponseHandler;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import java.util.HashMap;
import org.json.JSONObject;

public class MPINUtil {
    private static final String TAG = "MPINUtil";
    private static HashMap orchestrator;
    private final ComponentName component;
    private GodelServiceConnection connection;

    private MPINUtil(JuspayServices juspayServices, String string2, String string3) {
        GodelServiceConnection godelServiceConnection;
        this.connection = godelServiceConnection = new GodelServiceConnection(juspayServices);
        super(string2, string3);
        this.component = juspayServices;
    }

    private boolean bind(Context context) {
        Intent intent = new Intent();
        Object object = this.component;
        intent.setComponent(object);
        object = this.connection;
        return context.bindService(intent, (ServiceConnection)object, 1);
    }

    public static void closeAllConnections(Context context) {
        Object object = orchestrator;
        if (object != null) {
            boolean bl2;
            object = ((HashMap)object).keySet().iterator();
            while (bl2 = object.hasNext()) {
                String string2 = (String)object.next();
                MPINUtil.closeConnection(string2, context);
            }
        }
        orchestrator = null;
    }

    public static void closeConnection(String string2, Context object) {
        boolean bl2;
        Object object2 = orchestrator;
        if (object2 != null && (bl2 = ((HashMap)object2).containsKey(string2))) {
            object2 = (MPINUtil)orchestrator.get(string2);
            if (object2 != null) {
                super.unbind((Context)object);
            }
            object = orchestrator;
            ((HashMap)object).remove(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void communicate(String object, String object2, int n3, Bundle bundle, JuspayServices juspayServices, String string2) {
        Exception exception2;
        String string3;
        String string4;
        String string5;
        String string6;
        Object object3;
        block7: {
            boolean bl2;
            String string7;
            Object object4;
            Object object5;
            String string8;
            block6: {
                string8 = " is null. Reporting Bind Failure back to mApp";
                object5 = "Attempting to communicate to ";
                object3 = juspayServices.getSdkTracker();
                string6 = "system";
                string5 = "info";
                string4 = "mpin_util";
                string3 = "mpinutil_communicate";
                try {
                    object4 = new StringBuilder((String)object5);
                    ((StringBuilder)object4).append((String)object);
                    object5 = "/";
                    ((StringBuilder)object4).append((String)object5);
                    ((StringBuilder)object4).append((String)object2);
                    string7 = ((StringBuilder)object4).toString();
                    object4 = object3;
                    ((SdkTracker)object3).trackAction(string6, string5, string4, string3, string7);
                    object5 = orchestrator;
                    if (object5 != null) break block6;
                    object5 = new HashMap();
                    orchestrator = object5;
                }
                catch (Exception exception2) {
                    break block7;
                }
            }
            if (bl2 = ((HashMap)(object5 = orchestrator)).containsKey(object)) {
                string6 = "system";
                string5 = "info";
                string4 = "mpin_util";
                string3 = "mpinutil_communicate";
                string7 = "Fetching existing instance from orchestrator";
                object4 = object3;
                ((SdkTracker)object3).trackAction(string6, string5, string4, string3, string7);
                object2 = orchestrator;
                object = ((HashMap)object2).get(object);
                object = (MPINUtil)object;
            } else {
                object5 = new MPINUtil(juspayServices, (String)object, (String)object2);
                string6 = "system";
                string5 = "info";
                string4 = "mpin_util";
                string3 = "mpinutil_communicate";
                string7 = "Creating new MPINUtil instance in orchestrator";
                object4 = object3;
                ((SdkTracker)object3).trackAction(string6, string5, string4, string3, string7);
                object2 = juspayServices.getContext();
                boolean bl3 = super.bind((Context)object2);
                if (!bl3) {
                    string6 = "system";
                    string5 = "info";
                    string4 = "mpin_util";
                    string3 = "mpinutil_communicate";
                    string7 = "Failed to bind to MPIN SDK. Reporting Bind Failure back to mApp";
                    ((SdkTracker)object3).trackAction(string6, string5, string4, string3, string7);
                    MPINUtil.reportBindFailure(n3, juspayServices, string2);
                    return;
                }
                object2 = orchestrator;
                ((HashMap)object2).put(object, object5);
                object = object5;
            }
            if (object != null && (object2 = ((MPINUtil)object).connection) != null) {
                string6 = "system";
                string5 = "info";
                string4 = "mpin_util";
                string3 = "mpinutil_communicate";
                string7 = "Requesting a connection with MPIN SDK";
                object4 = object3;
                ((SdkTracker)object3).trackAction(string6, string5, string4, string3, string7);
                object = ((MPINUtil)object).connection;
                object2 = new GodelServiceResponseHandler(string2, juspayServices);
                ((GodelServiceConnection)object).request(n3, bundle, (Handler)object2);
                return;
            }
            object = object == null ? "mpinUtil" : "mpinUtil.connection";
            string6 = "system";
            string5 = "info";
            string4 = "mpin_util";
            string3 = "mpinutil_communicate";
            string7 = ((String)object).concat(string8);
            object4 = object3;
            ((SdkTracker)object3).trackAction(string6, string5, string4, string3, string7);
            MPINUtil.reportBindFailure(n3, juspayServices, string2);
            return;
        }
        SdkTracker sdkTracker = object3;
        ((SdkTracker)object3).trackAction("system", "info", "mpin_util", "mpinutil_communicate", "Failed to bind to MPIN SDK. Reporting Bind Failure back to mApp");
        string3 = "mpin_util";
        String string9 = "Exception while trying to connect";
        string6 = TAG;
        string5 = "action";
        string4 = "system";
        object3 = exception2;
        sdkTracker.trackAndLogException(string6, string5, string4, string3, string9, exception2);
        MPINUtil.reportBindFailure(n3, juspayServices, string2);
    }

    public static void reportBindFailure(int n3, JuspayServices object, String string2) {
        if (string2 != null) {
            SdkTracker sdkTracker = ((JuspayServices)object).getSdkTracker();
            JSONObject jSONObject = new JSONObject();
            String string3 = "code";
            jSONObject.put(string3, n3);
            Object object2 = "error";
            boolean bl2 = true;
            jSONObject.put((String)object2, bl2);
            object2 = "message";
            string3 = "BIND_FAILURE";
            try {
                jSONObject.put((String)object2, (Object)string3);
            }
            catch (Exception exception) {
                String string4 = "mpin_util";
                String string5 = "Exception while creating bind failure response";
                string3 = TAG;
                String string6 = "action";
                String string7 = "system";
                sdkTracker.trackAndLogException(string3, string6, string7, string4, string5, exception);
            }
            object2 = ((JuspayServices)object).getJBridge();
            object = jSONObject.toString();
            ((DuiInterface)object2).invokeCallbackInDUIWebview(string2, (String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void unbind(Context context) {
        boolean bl2;
        GodelServiceConnection godelServiceConnection = this.connection;
        if (godelServiceConnection != null && (bl2 = godelServiceConnection.isBound)) {
            try {
                context.unbindService((ServiceConnection)godelServiceConnection);
            }
            catch (Exception exception) {}
            context = null;
            this.connection = null;
        }
    }
}

