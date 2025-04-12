/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzdwq;
import com.google.android.gms.internal.ads.zzdwr;
import com.google.android.gms.internal.ads.zzfgk;

public final class zzdws
implements zzdwc {
    private final long zza;
    private final zzdwh zzb;
    private final zzfgk zzc;

    public zzdws(long l2, Context context, zzdwh zzdwh2, zzcjd zzcjd2, String string2) {
        this.zza = l2;
        this.zzb = zzdwh2;
        Object object = zzcjd2.zzw();
        object.zzb(context);
        object.zza(string2);
        this.zzc = object = object.zzc().zza();
    }

    public static /* bridge */ /* synthetic */ long zzd(zzdws zzdws2) {
        return zzdws2.zza;
    }

    public static /* bridge */ /* synthetic */ zzdwh zze(zzdws zzdws2) {
        return zzdws2.zzb;
    }

    public final void zza() {
    }

    public final void zzb(zzl zzl2) {
        zzfgk zzfgk2;
        try {
            zzfgk2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        zzdwq zzdwq2 = new zzdwq(this);
        zzfgk2.zzf(zzl2, zzdwq2);
    }

    public final void zzc() {
        zzfgk zzfgk2;
        try {
            zzfgk2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        IInterface iInterface = new zzdwr(this);
        zzfgk2.zzk((zzbzd)iInterface);
        zzfgk2 = this.zzc;
        iInterface = null;
        iInterface = ObjectWrapper.wrap(null);
        zzfgk2.zzm((IObjectWrapper)iInterface);
    }
}

