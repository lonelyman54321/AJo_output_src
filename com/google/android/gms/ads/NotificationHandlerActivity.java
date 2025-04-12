/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbrb;

public final class NotificationHandlerActivity
extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        RemoteException remoteException2;
        block3: {
            zzbrb zzbrb2;
            super.onCreate((Bundle)object);
            try {
                object = zzay.zza();
                zzbrb2 = new zzbrb();
                object = ((zzaw)object).zzm((Context)this, zzbrb2);
                if (object == null) {
                    object = "OfflineUtils is null";
                    zzm.zzg((String)object);
                    return;
                }
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            zzbrb2 = this.getIntent();
            object.zze((Intent)zzbrb2);
            return;
        }
        String string2 = ((Object)((Object)remoteException2)).toString();
        zzm.zzg("RemoteException calling handleNotificationIntent: ".concat(string2));
    }

    public final void onResume() {
        super.onResume();
        this.finish();
    }
}

