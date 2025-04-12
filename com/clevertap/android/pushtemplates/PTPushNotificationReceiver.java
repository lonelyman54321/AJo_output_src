/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.clevertap.android.pushtemplates;

import android.content.Context;
import android.content.Intent;
import com.clevertap.android.pushtemplates.PTPushNotificationReceiver$a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import com.clevertap.android.sdk.task.a;

public class PTPushNotificationReceiver
extends CTPushNotificationReceiver {
    public final void onReceive(Context context, Intent intent) {
        Object object = "wzrk_dl";
        String string2 = intent.getStringExtra((String)object);
        if (string2 == null) {
            intent.removeExtra((String)object);
        }
        super.onReceive(context, intent);
        object = intent.getExtras();
        if (object == null) {
            return;
        }
        string2 = "wzrk_acct_id";
        object = object.getString(string2);
        if ((object = com.clevertap.android.sdk.a.h(context, (String)object)) != null) {
            object = ((com.clevertap.android.sdk.a)object).b;
            object = ((H80)object).a;
            object = jh_1.a((CleverTapInstanceConfig)object);
            object = ((kh_1)object).b();
            string2 = "PTPushNotificationReceiver#cleanUpFiles";
            PTPushNotificationReceiver$a pTPushNotificationReceiver$a = new PTPushNotificationReceiver$a(context, intent);
            try {
                ((a)object).c(string2, pTPushNotificationReceiver$a);
            }
            catch (Exception exception) {
                exception.getLocalizedMessage();
                ak2_1.b();
            }
        } else {
            ak2_1.b();
        }
    }
}

