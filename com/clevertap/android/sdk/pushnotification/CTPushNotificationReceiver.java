/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.clevertap.android.sdk.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;

public class CTPushNotificationReceiver
extends BroadcastReceiver {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context context, Intent object) {
        String string2 = "close_system_dialogs";
        String string3 = "wzrk_dl";
        try {
            Intent intent;
            Bundle bundle = object.getExtras();
            if (bundle == null) {
                return;
            }
            boolean bl2 = bundle.containsKey(string3);
            if (bl2) {
                String string4 = "android.intent.action.VIEW";
                String string5 = object.getStringExtra(string3);
                Uri uri = Uri.parse((String)string5);
                intent = new Intent(string4, uri);
                yz3_0.k(context, intent);
            } else {
                PackageManager packageManager = context.getPackageManager();
                intent = packageManager.getLaunchIntentForPackage(string3 = context.getPackageName());
                if (intent == null) {
                    return;
                }
            }
            a.j(context, bundle);
            int n3 = 0x34000000;
            intent.setFlags(n3);
            intent.putExtras(bundle);
            String string6 = "wzrk_from";
            string3 = "CTPushNotificationReceiver";
            intent.putExtra(string6, string3);
            n3 = (int)(bundle.containsKey(string2) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(bundle.getBoolean(string2) ? 1 : 0)) != 0) {
                string2 = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
                Intent intent2 = new Intent(string2);
                context.sendBroadcast(intent2);
            }
            context.startActivity(intent);
            bundle.toString();
            b.c();
            return;
        }
        catch (Throwable throwable) {
            b.l();
        }
    }
}

