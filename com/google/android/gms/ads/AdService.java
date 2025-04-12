/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.os.RemoteException
 */
package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbrb;

public class AdService
extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    public final void onHandleIntent(Intent object) {
        Object object2;
        try {
            object2 = zzay.zza();
        }
        catch (RemoteException remoteException) {
            object = ((Object)((Object)remoteException)).toString();
            zzm.zzg("RemoteException calling handleNotificationIntent: ".concat((String)object));
            return;
        }
        zzbrb zzbrb2 = new zzbrb();
        object2 = ((zzaw)object2).zzm((Context)this, zzbrb2);
        object2.zze((Intent)object);
    }
}

