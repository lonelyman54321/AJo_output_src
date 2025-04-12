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
 *  android.widget.Toast
 *  org.json.JSONObject
 */
package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.widget.Toast;
import in.juspay.hypersmshandler.JuspayDuiHook;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class DeliverReceiver
extends BroadcastReceiver
implements JuspayDuiHook {
    public final void attach(Activity activity) {
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(activity, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        String string3 = "SMS_DELIVERED";
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

    public final void onReceive(Context context, Intent object) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = "intent";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = this.getResultCode();
        int n4 = -1;
        if (n3 != n4) {
            if (n3 == 0) {
                object = "SMS NOT DELIVERED";
                context = Toast.makeText((Context)context, (CharSequence)object, (int)0);
                context.show();
            }
        } else {
            object = "SMS DELIVERED";
            context = Toast.makeText((Context)context, (CharSequence)object, (int)0);
            context.show();
        }
    }
}

