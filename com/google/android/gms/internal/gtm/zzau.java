/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzj;
import java.util.HashMap;

public final class zzau
extends zzj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = this.zza;
        hashMap.put("appName", string2);
        string2 = this.zzb;
        hashMap.put("appVersion", string2);
        string2 = this.zzc;
        hashMap.put("appId", string2);
        string2 = this.zzd;
        hashMap.put("appInstallerId", string2);
        return zzj.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    public final void zzh(zzau zzau2) {
        String string2 = this.zza;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            zzau2.zza = string2 = this.zza;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.zzb)))) {
            zzau2.zzb = string2 = this.zzb;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.zzc)))) {
            zzau2.zzc = string2 = this.zzc;
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = this.zzd)))) {
            zzau2.zzd = string2 = this.zzd;
        }
    }

    public final void zzi(String string2) {
        this.zzc = string2;
    }

    public final void zzj(String string2) {
        this.zzd = string2;
    }

    public final void zzk(String string2) {
        this.zza = string2;
    }

    public final void zzl(String string2) {
        this.zzb = string2;
    }
}

