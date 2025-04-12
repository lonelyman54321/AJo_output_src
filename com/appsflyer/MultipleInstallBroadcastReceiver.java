/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 */
package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1rSDK;

public class MultipleInstallBroadcastReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Object object;
        String string2;
        String string3 = "error in BroadcastReceiver ";
        Object object2 = "referrer";
        if (intent == null) {
            return;
        }
        boolean bl2 = false;
        Object object3 = null;
        try {
            string2 = intent.getStringExtra((String)object2);
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog(string3, throwable);
            string2 = null;
        }
        if (string2 != null && (object2 = (object = AFb1rSDK.h_(context)).getString((String)object2, null)) != null) {
            AFb1rSDK.getRevenue().getCurrencyIso4217Code(context, string2);
            return;
        }
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFb1rSDK.getRevenue().g_(context, intent);
        object2 = context.getPackageManager();
        string2 = "com.android.vending.INSTALL_REFERRER";
        object3 = new Intent(string2);
        boolean bl3 = false;
        object = null;
        object2 = object2.queryBroadcastReceivers(object3, 0).iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (ResolveInfo)object2.next();
            object = intent.getAction();
            CharSequence charSequence = object3.activityInfo.packageName;
            String string4 = context.getPackageName();
            boolean bl4 = charSequence.equals(string4);
            if (!bl4 || !(bl3 = string2.equals(object)) || (bl3 = (object = ((Object)((Object)this)).getClass().getName()).equals(charSequence = object3.activityInfo.name))) continue;
            object = new StringBuilder("trigger onReceive: class: ");
            charSequence = object3.activityInfo.name;
            object.append((String)charSequence);
            object = object.toString();
            AFLogger.afInfoLog((String)object);
            object = object3.activityInfo;
            object = object.name;
            object = Class.forName((String)object);
            object = object.newInstance();
            object = (BroadcastReceiver)object;
            try {
                object.onReceive(context, intent);
            }
            catch (Throwable throwable) {
                charSequence = new StringBuilder(string3);
                object3 = object3.activityInfo.name;
                ((StringBuilder)charSequence).append((String)object3);
                object3 = charSequence.toString();
                AFLogger.afErrorLog((String)object3, throwable);
            }
        }
    }
}

