/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;
    private final AdSize zzd;

    public RtbSignalData(Context context, List list, Bundle bundle, AdSize adSize) {
        this.zza = context;
        this.zzb = list;
        this.zzc = bundle;
        this.zzd = adSize;
    }

    public AdSize getAdSize() {
        return this.zzd;
    }

    public MediationConfiguration getConfiguration() {
        int n3;
        List list = this.zzb;
        if (list != null && (n3 = list.size()) > 0) {
            return (MediationConfiguration)this.zzb.get(0);
        }
        return null;
    }

    public List getConfigurations() {
        return this.zzb;
    }

    public Context getContext() {
        return this.zza;
    }

    public Bundle getNetworkExtras() {
        return this.zzc;
    }
}

