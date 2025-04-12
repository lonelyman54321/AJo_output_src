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
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbwq;

public final class zzbhd {
    private final Context zza;

    public zzbhd(Context context) {
        this.zza = context;
    }

    public final void zza(zzbwq zzbwq2) {
        zzp zzp22;
        block9: {
            Object object = this.zza;
            String string2 = "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy";
            zzbhc zzbhc2 = new zzbhc();
            object = zzq.zzb((Context)object, string2, zzbhc2);
            object = (zzbhe)object;
            try {
                ((zzbhe)object).zze(zzbwq2);
                return;
            }
            catch (RemoteException remoteException) {
            }
            catch (zzp zzp22) {
                break block9;
            }
            String string3 = String.valueOf(remoteException.getMessage());
            zzm.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(string3));
            return;
        }
        String string4 = String.valueOf(zzp22.getMessage());
        zzm.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(string4));
    }
}

