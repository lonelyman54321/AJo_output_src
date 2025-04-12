/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.Map;

final class zzgv {
    private final long zza;
    private final long zzb;
    private String zzc;
    private String zzd;
    private Map zze;
    private String zzf;

    public zzgv(long l2, long l3, long l4) {
        this.zza = l2;
        this.zzb = l4;
    }

    public final long zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzc;
    }

    public final Map zzf() {
        return this.zze;
    }

    public final void zzg(String string2) {
        this.zzf = string2;
    }

    public final void zzh(Map map2) {
        this.zze = map2;
    }

    public final void zzi(String string2) {
        this.zzd = string2;
    }

    public final void zzj(String string2) {
        String string3;
        boolean bl2;
        if (string2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)(string3 = string2.trim())))) {
            this.zzc = string2;
        }
    }
}

