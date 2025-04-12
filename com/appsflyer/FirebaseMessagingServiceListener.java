/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener
extends FirebaseMessagingService {
    public void onNewToken(String string2) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Context context = this.getApplicationContext();
        appsFlyerLib.updateServerUninstallToken(context, string2);
    }
}

