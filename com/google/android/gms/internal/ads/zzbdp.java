/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;

public final class zzbdp
implements Runnable {
    public final /* synthetic */ zzbdu zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbdp(zzbdu zzbdu2, Context context) {
        this.zza = zzbdu2;
        this.zzb = context;
    }

    public final void run() {
        Object object = zzbep.zzeT;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        zzbdu zzbdu2 = this.zza;
        Object object2 = this.zzb;
        if (bl2) {
            object = "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger";
            Object object3 = new zzbdq();
            object = zzq.zzb((Context)object2, (String)object, (zzo)object3);
            object = (zzbai)object;
            zzbdu2.zza = object;
            object = ObjectWrapper.wrap(object2);
            object2 = zzbdu2.zza;
            object3 = "GMA_SDK";
            object2.zze((IObjectWrapper)object, (String)object3);
            bl2 = true;
            try {
                zzbdu2.zzb = bl2;
                return;
            }
            catch (RemoteException | zzp | NullPointerException throwable) {
                object = "Cannot dynamite load clearcut";
                zzm.zze((String)object);
            }
        }
    }
}

