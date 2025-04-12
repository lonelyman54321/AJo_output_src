/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.tagmanager.zzc;
import com.google.android.gms.tagmanager.zzd;
import java.io.IOException;

final class zza
implements zzc {
    final /* synthetic */ zzd zza;

    public zza(zzd zzd2) {
        this.zza = zzd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AdvertisingIdClient$Info zza() {
        AdvertisingIdClient$Info advertisingIdClient$Info = null;
        try {
            zzd zzd2 = this.zza;
            zzd2 = zzd.zza(zzd2);
            return AdvertisingIdClient.getAdvertisingIdInfo((Context)zzd2);
        }
        catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
            zzd zzd2 = this.zza;
            zzd2.zze();
            return advertisingIdClient$Info;
        }
        catch (GooglePlayServicesRepairableException | IOException | Exception | IllegalStateException exception) {
            return advertisingIdClient$Info;
        }
    }
}

