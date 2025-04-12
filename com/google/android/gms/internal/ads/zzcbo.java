/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzccn;
import java.io.IOException;

final class zzcbo
implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzccn zzb;

    public zzcbo(zzcbp zzcbp2, Context context, zzccn zzccn2) {
        this.zza = context;
        this.zzb = zzccn2;
    }

    /*
     * WARNING - void declaration
     */
    public final void run() {
        void var1_6;
        Object object = this.zza;
        object = AdvertisingIdClient.getAdvertisingIdInfo(object);
        zzccn zzccn2 = this.zzb;
        try {
            zzccn2.zzc(object);
            return;
        }
        catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException) {
        }
        catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
        }
        catch (IllegalStateException illegalStateException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.zzb.zzd((Throwable)var1_6);
        zzm.zzh("Exception while getting advertising Id info", (Throwable)var1_6);
    }
}

