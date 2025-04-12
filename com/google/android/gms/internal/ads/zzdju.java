/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbdv$zza$zza;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzdgn;

public final class zzdju
implements zzczl,
zzdgn {
    private final zzcaq zza;
    private final Context zzb;
    private final zzcau zzc;
    private final View zzd;
    private String zze;
    private final zzbdv$zza$zza zzf;

    public zzdju(zzcaq zzcaq2, Context context, zzcau zzcau2, View view, zzbdv$zza$zza zzbdv$zza$zza) {
        this.zza = zzcaq2;
        this.zzb = context;
        this.zzc = zzcau2;
        this.zzd = view;
        this.zzf = zzbdv$zza$zza;
    }

    public final void zza() {
        this.zza.zzb(false);
    }

    public final void zzb() {
    }

    public final void zzc() {
        Object object;
        View view = this.zzd;
        if (view != null && (object = this.zze) != null) {
            object = this.zzc;
            view = view.getContext();
            String string2 = this.zze;
            ((zzcau)object).zzo((Context)view, string2);
        }
        this.zza.zzb(true);
    }

    public final void zzds(zzbyh zzbyh2, String object, String string2) {
        object = this.zzc;
        string2 = this.zzb;
        boolean bl2 = ((zzcau)object).zzp((Context)string2);
        if (bl2) {
            zzcau zzcau2 = this.zzc;
            Context context = this.zzb;
            String string3 = zzcau2.zza(context);
            object = this.zza;
            String string4 = ((zzcaq)object).zza();
            String string5 = zzbyh2.zzc();
            int n3 = zzbyh2.zzb();
            try {
                zzcau2.zzl(context, string3, string4, string5, n3);
                return;
            }
            catch (RemoteException remoteException) {
                object = "Remote Exception to get reward item.";
                zzm.zzk((String)object, remoteException);
            }
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzk() {
    }

    public final void zzl() {
        Object object = this.zzf;
        Object object2 = zzbdv$zza$zza.zzk;
        if (object == object2) {
            return;
        }
        object = this.zzc;
        object2 = this.zzb;
        this.zze = object = ((zzcau)object).zzc((Context)object2);
        object2 = this.zzf;
        object = String.valueOf(object);
        zzbdv$zza$zza zzbdv$zza$zza = zzbdv$zza$zza.zzh;
        object2 = object2 == zzbdv$zza$zza ? "/Rewarded" : "/Interstitial";
        this.zze = object = ((String)object).concat((String)object2);
    }
}

