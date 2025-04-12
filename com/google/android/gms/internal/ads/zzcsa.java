/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcf;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcrz;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzfcr;

public final class zzcsa
extends zzbcf {
    private final zzcrz zza;
    private final zzbu zzb;
    private final zzfcr zzc;
    private boolean zzd;
    private final zzdvc zze;

    public zzcsa(zzcrz zzcrz2, zzbu zzbu2, zzfcr zzfcr2, zzdvc zzdvc2) {
        boolean bl2;
        zzbeg zzbeg2 = zzbep.zzaH;
        this.zzd = bl2 = ((Boolean)zzba.zzc().zza(zzbeg2)).booleanValue();
        this.zza = zzcrz2;
        this.zzb = zzbu2;
        this.zzc = zzfcr2;
        this.zze = zzdvc2;
    }

    public final zzbu zze() {
        return this.zzb;
    }

    public final zzdn zzf() {
        Object object = zzbep.zzgW;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return null;
        }
        return this.zza.zzl();
    }

    public final void zzg(boolean bl2) {
        this.zzd = bl2;
    }

    public final void zzh(zzdg zzdg2) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        Object object = this.zzc;
        if (object != null) {
            block5: {
                boolean bl2 = zzdg2.zzf();
                if (bl2) break block5;
                object = this.zze;
                try {
                    ((zzdvc)object).zze();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Error in making CSI ping for reporting paid event callback";
                    zzm.zzf(string2, remoteException);
                }
            }
            object = this.zzc;
            ((zzfcr)object).zzn(zzdg2);
        }
    }

    public final void zzi(IObjectWrapper object, zzbcn zzbcn2) {
        Object object2;
        try {
            object2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        ((zzfcr)object2).zzp(zzbcn2);
        object2 = this.zza;
        object = ObjectWrapper.unwrap((IObjectWrapper)object);
        object = (Activity)object;
        boolean bl2 = this.zzd;
        ((zzcrz)object2).zzd((Activity)object, zzbcn2, bl2);
    }
}

