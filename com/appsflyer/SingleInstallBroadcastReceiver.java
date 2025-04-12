/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;

public class SingleInstallBroadcastReceiver
extends BroadcastReceiver {
    public void onReceive(Context object, Intent object2) {
        String string2;
        String string3;
        Object object3 = "referrer";
        if (object2 == null) {
            return;
        }
        String string4 = null;
        try {
            string3 = object2.getStringExtra((String)object3);
        }
        catch (Throwable throwable) {
            string2 = "error in BroadcastReceiver ";
            AFLogger.afErrorLog(string2, throwable);
            string3 = null;
        }
        if (string3 != null && (object3 = (string2 = AFb1rSDK.h_((Context)object)).getString((String)object3, null)) != null) {
            AFb1rSDK.getRevenue().getCurrencyIso4217Code((Context)object, string3);
            return;
        }
        object3 = AppsFlyerProperties.getInstance();
        string4 = "referrer_timestamp";
        object3 = ((AppsFlyerProperties)object3).getString(string4);
        long l2 = System.currentTimeMillis();
        if (object3 != null) {
            long l3 = Long.parseLong((String)object3);
            long l4 = (l2 -= l3) - (l3 = 2000L);
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 < 0) {
                return;
            }
        }
        AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
        AFb1rSDK.getRevenue().g_((Context)object, (Intent)object2);
        object = AppsFlyerProperties.getInstance();
        object2 = String.valueOf(System.currentTimeMillis());
        ((AppsFlyerProperties)object).set(string4, (String)object2);
    }
}

