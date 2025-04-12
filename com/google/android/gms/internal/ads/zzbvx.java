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
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbk;

public final class zzbvx {
    private static zzcbg zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final zzdx zzd;
    private final String zze;

    public zzbvx(Context context, AdFormat adFormat, zzdx zzdx2, String string2) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdx2;
        this.zze = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzcbg zza(Context object) {
        Class<zzbvx> clazz = zzbvx.class;
        synchronized (clazz) {
            try {
                Object object2 = zza;
                if (object2 != null) return zza;
                object2 = zzay.zza();
                zzbrb zzbrb2 = new zzbrb();
                object = ((zzaw)object2).zzr((Context)object, zzbrb2);
                zza = object;
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Object object;
        Object object2;
        zzcbg zzcbg2 = zzbvx.zza(this.zzb);
        if (zzcbg2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Object object3 = this.zzb;
        Object object4 = this.zzd;
        object3 = ObjectWrapper.wrap(object3);
        if (object4 == null) {
            object4 = new zzm();
            long l2 = System.currentTimeMillis();
            ((zzm)object4).zzg(l2);
            object4 = ((zzm)object4).zza();
        } else {
            object2 = this.zzb;
            object = zzp.zza;
            object4 = ((zzp)object).zza((Context)object2, (zzdx)object4);
        }
        object2 = this.zze;
        object = this.zzc;
        object = ((Enum)object).name();
        zzcbk zzcbk2 = new zzcbk((String)object2, (String)object, null, (zzl)object4);
        try {
            object4 = new zzbvw(this, queryInfoGenerationCallback);
        }
        catch (RemoteException remoteException) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
            return;
        }
        zzcbg2.zzf((IObjectWrapper)object3, zzcbk2, (zzcbd)object4);
    }
}

