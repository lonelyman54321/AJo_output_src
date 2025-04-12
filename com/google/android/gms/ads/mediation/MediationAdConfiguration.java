/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 */
package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;

public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = 255;
    private final String zza;
    private final Bundle zzb;
    private final Bundle zzc;
    private final Context zzd;
    private final boolean zze;
    private final int zzf;
    private final int zzg;
    private final String zzh;
    private final String zzi;

    public MediationAdConfiguration(Context context, String string2, Bundle bundle, Bundle bundle2, boolean bl2, Location location, int n3, int n4, String string3, String string4) {
        this.zza = string2;
        this.zzb = bundle;
        this.zzc = bundle2;
        this.zzd = context;
        this.zze = bl2;
        this.zzf = n3;
        this.zzg = n4;
        this.zzh = string3;
        this.zzi = string4;
    }

    public String getBidResponse() {
        return this.zza;
    }

    public Context getContext() {
        return this.zzd;
    }

    public String getMaxAdContentRating() {
        return this.zzh;
    }

    public Bundle getMediationExtras() {
        return this.zzc;
    }

    public Bundle getServerParameters() {
        return this.zzb;
    }

    public String getWatermark() {
        return this.zzi;
    }

    public boolean isTestRequest() {
        return this.zze;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzg;
    }
}

