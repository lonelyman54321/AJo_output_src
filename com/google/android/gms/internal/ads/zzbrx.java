/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzbrx
implements MediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;
    private final String zzh;

    public zzbrx(Date date, int n3, Set set, Location location, boolean bl2, int n4, boolean bl3, int n7, String string2) {
        this.zza = date;
        this.zzb = n3;
        this.zzc = set;
        this.zze = location;
        this.zzd = bl2;
        this.zzf = n4;
        this.zzg = bl3;
        this.zzh = string2;
    }

    public final Date getBirthday() {
        return this.zza;
    }

    public final int getGender() {
        return this.zzb;
    }

    public final Set getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}

