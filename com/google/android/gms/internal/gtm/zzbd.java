/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import java.util.HashMap;

public final class zzbd
extends zzj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;

    public final String toString() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String string2 = this.zza;
        hashMap.put("hitType", string2);
        string2 = this.zzb;
        hashMap.put("clientId", string2);
        string2 = this.zzc;
        hashMap.put("userId", string2);
        string2 = this.zzd;
        hashMap.put("androidAdId", string2);
        Comparable<Boolean> comparable = this.zze;
        hashMap.put("AdTargetingEnabled", comparable);
        hashMap.put("sessionControl", null);
        comparable = this.zzf;
        hashMap.put("nonInteraction", comparable);
        comparable = 0.0;
        hashMap.put("sampleRate", comparable);
        return zzj.zza(hashMap);
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzc;
    }

    public final void zzh(boolean bl2) {
        this.zze = bl2;
    }

    public final void zzi(String string2) {
        this.zzd = string2;
    }

    public final void zzj(String string2) {
        this.zzb = string2;
    }

    public final void zzk(String string2) {
        this.zza = "data";
    }

    public final void zzl(boolean bl2) {
        this.zzf = true;
    }

    public final void zzm(String string2) {
        this.zzc = string2;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzf;
    }
}

