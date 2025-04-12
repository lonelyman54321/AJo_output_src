/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 */
package in.juspay.hypersdk.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;

class GodelServiceConnection
implements ServiceConnection {
    private static final String TAG = "GodelServiceConnection";
    boolean isBound = false;
    private final JuspayServices juspayServices;
    private Messenger messenger = null;
    private Message pendingMsg = null;

    public GodelServiceConnection(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
    }

    public void onServiceConnected(ComponentName object, IBinder iBinder) {
        String string2 = "Successfully connected to ";
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        String string3 = "system";
        String string4 = "info";
        String string5 = "godel_service_connection";
        String string6 = "gsc_on_service_connected";
        Object object2 = new StringBuilder(string2);
        string2 = object.getPackageName();
        ((StringBuilder)object2).append(string2);
        string2 = "/";
        ((StringBuilder)object2).append(string2);
        object = object.getClassName();
        ((StringBuilder)object2).append((String)object);
        String string7 = ((StringBuilder)object2).toString();
        object2 = sdkTracker;
        sdkTracker.trackAction(string3, string4, string5, string6, string7);
        object = new Messenger(iBinder);
        this.messenger = object;
        boolean bl2 = true;
        this.isBound = bl2;
        object = this.pendingMsg;
        try {
            this.request((Message)object);
        }
        catch (Exception exception) {
            string6 = "mpin_util";
            string7 = "Exception while trying to send message";
            string3 = TAG;
            string4 = "action";
            string5 = "system";
            object2 = sdkTracker;
            sdkTracker.trackAndLogException(string3, string4, string5, string6, string7, exception);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.messenger = null;
        this.isBound = false;
    }

    public void request(int n3, Bundle bundle, Handler handler) {
        this.juspayServices.getSdkTracker().trackAction("system", "info", "godel_service_connection", "gsc_request", "Sending request to MPIN SDK");
        Message message = Message.obtain(null, (int)n3);
        message.setData(bundle);
        bundle = new Messenger(handler);
        message.replyTo = bundle;
        this.request(message);
    }

    public void request(Message message) {
        boolean bl2 = this.isBound;
        if (bl2) {
            Messenger messenger = this.messenger;
            messenger.send(message);
        } else {
            this.pendingMsg = message;
        }
    }
}

