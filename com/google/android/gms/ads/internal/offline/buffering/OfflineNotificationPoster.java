/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbuz;

public class OfflineNotificationPoster
extends Worker {
    private final zzbuz zza;

    public OfflineNotificationPoster(Context object, WorkerParameters object2) {
        super((Context)object, (WorkerParameters)object2);
        object2 = zzay.zza();
        zzbrb zzbrb2 = new zzbrb();
        object = ((zzaw)object2).zzm((Context)object, zzbrb2);
        this.zza = object;
    }

    public final c$a doWork() {
        Object object = this.getInputData().c("uri");
        String string2 = this.getInputData().c("gws_query_id");
        Object object2 = this.getInputData();
        Object object3 = "image_url";
        object2 = ((b)object2).c((String)object3);
        try {
            object3 = this.zza;
        }
        catch (RemoteException remoteException) {
            object = new c$a$a();
            return object;
        }
        Object object4 = this.getApplicationContext();
        object4 = ObjectWrapper.wrap(object4);
        zza zza2 = new zza((String)object, string2, (String)object2);
        object3.zzj((IObjectWrapper)object4, zza2);
        object = new c$a$c();
        return object;
    }
}

