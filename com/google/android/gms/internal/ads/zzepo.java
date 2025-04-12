/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzepc;

public final class zzepo
implements zzczo {
    public final /* synthetic */ zzepc zza;
    public final /* synthetic */ zzboi zzb;

    public /* synthetic */ zzepo(zzepc zzepc2, zzboi zzboi2) {
        this.zza = zzepc2;
        this.zzb = zzboi2;
    }

    public final void zzdB(zze zze2) {
        this.zza.zzdB(zze2);
        zzboi zzboi2 = this.zzb;
        String string2 = "#007 Could not call remote method.";
        if (zzboi2 != null) {
            try {
                zzboi2.zzf(zze2);
            }
            catch (RemoteException remoteException) {
                zzm.zzl(string2, remoteException);
            }
        }
        if (zzboi2 != null) {
            int n3 = zze2.zza;
            try {
                zzboi2.zze(n3);
                return;
            }
            catch (RemoteException remoteException) {
                zzm.zzl(string2, remoteException);
            }
        }
    }
}

