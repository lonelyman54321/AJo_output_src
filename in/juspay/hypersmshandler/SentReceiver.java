/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.SmsComponents;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class SentReceiver
extends BroadcastReceiver
implements JuspayDuiHook {
    public final SmsComponents a;

    public SentReceiver(SmsComponents smsComponents) {
        Intrinsics.checkNotNullParameter(smsComponents, "smsComponents");
        this.a = smsComponents;
    }

    public final void attach(Activity activity) {
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(activity, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        String string3 = "SMS_SENT";
        if (n3 >= n4) {
            string2 = new IntentFilter(string3);
            oo0_2.a(activity, this, (IntentFilter)string2);
        } else {
            string2 = new IntentFilter(string3);
            activity.registerReceiver((BroadcastReceiver)this, (IntentFilter)string2);
        }
    }

    public final void detach(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.unregisterReceiver((BroadcastReceiver)this);
    }

    public final String execute(Activity activity, String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return null;
    }

    public final void onReceive(Context object, Intent intent) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        object = this.a.getSmsEventInterface();
        int n3 = this.getResultCode();
        object.onSentReceiverEvent(n3);
    }
}

