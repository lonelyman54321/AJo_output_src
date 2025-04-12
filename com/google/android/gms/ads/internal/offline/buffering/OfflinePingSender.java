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
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbuz;

public class OfflinePingSender
extends Worker {
    private final zzbuz zza;

    public OfflinePingSender(Context object, WorkerParameters object2) {
        super((Context)object, (WorkerParameters)object2);
        object2 = zzay.zza();
        zzbrb zzbrb2 = new zzbrb();
        object = ((zzaw)object2).zzm((Context)object, zzbrb2);
        this.zza = object;
    }

    public final c$a doWork() {
        Object object;
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            object = new c$a$a();
            return object;
        }
        object.zzh();
        object = new c$a$c();
        return object;
    }
}

