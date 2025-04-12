/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.common.util.concurrent.ListenableFuture;

final class zzaf
implements zzgfp {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcbk zzb;
    final /* synthetic */ zzcbd zzc;
    final /* synthetic */ zzfmc zzd;
    final /* synthetic */ zzaj zze;

    public zzaf(zzaj zzaj2, ListenableFuture listenableFuture, zzcbk zzcbk2, zzcbd zzcbd2, zzfmc zzfmc2) {
        this.zza = listenableFuture;
        this.zzb = zzcbk2;
        this.zzc = zzcbd2;
        this.zzd = zzfmc2;
        this.zze = zzaj2;
    }

    public final void zza(Throwable object) {
        String string2;
        block10: {
            boolean bl2;
            String string3 = "Internal error. ";
            string2 = ((Throwable)object).getMessage();
            Object object2 = zzbep.zzhP;
            object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
            boolean bl3 = (Boolean)object2;
            Object object3 = "SignalGeneratorImpl.generateSignals";
            if (bl3) {
                object2 = zzu.zzo();
                ((zzcby)object2).zzv((Throwable)object, (String)object3);
            } else {
                object2 = zzu.zzo();
                ((zzcby)object2).zzw((Throwable)object, (String)object3);
            }
            object2 = this.zza;
            object3 = this.zzb;
            object2 = zzaj.zzr((ListenableFuture)object2, (zzcbk)object3);
            object3 = (Boolean)zzbgd.zze.zze();
            boolean bl4 = (Boolean)object3;
            if (bl4 && object2 != null) {
                object3 = this.zzd;
                object3.zzi((Throwable)object);
                bl2 = false;
                object = null;
                object3.zzh(false);
                ((zzfmn)object2).zza((zzfmc)object3);
                ((zzfmn)object2).zzi();
            }
            object = "Unknown format is no longer supported.";
            try {
                bl2 = ((String)object).equals(string2);
                if (bl2) break block10;
            }
            catch (RemoteException remoteException) {
                zzm.zzh("", remoteException);
                return;
            }
            object = new StringBuilder(string3);
            ((StringBuilder)object).append(string2);
            string2 = ((StringBuilder)object).toString();
        }
        object = this.zzc;
        object.zzb(string2);
    }
}

