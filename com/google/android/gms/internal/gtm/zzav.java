/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import java.util.HashMap;

public final class zzav
extends zzj {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    public final String toString() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = this.zza;
        hashMap.put("name", string2);
        string2 = this.zzb;
        hashMap.put("source", string2);
        string2 = this.zzc;
        hashMap.put("medium", string2);
        string2 = this.zzd;
        hashMap.put("keyword", string2);
        string2 = this.zze;
        hashMap.put("content", string2);
        string2 = this.zzf;
        hashMap.put("id", string2);
        string2 = this.zzg;
        hashMap.put("adNetworkId", string2);
        string2 = this.zzh;
        hashMap.put("gclid", string2);
        string2 = this.zzi;
        hashMap.put("dclid", string2);
        string2 = this.zzj;
        hashMap.put("aclid", string2);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzi;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zza;
    }

    public final String zzm() {
        return this.zzb;
    }

    public final void zzn(String string2) {
        this.zzj = string2;
    }

    public final void zzo(String string2) {
        this.zzg = string2;
    }

    public final void zzp(String string2) {
        this.zze = string2;
    }

    public final void zzq(String string2) {
        this.zzi = string2;
    }

    public final void zzr(String string2) {
        this.zzh = string2;
    }

    public final void zzs(String string2) {
        this.zzf = string2;
    }

    public final void zzt(String string2) {
        this.zzd = string2;
    }

    public final void zzu(String string2) {
        this.zzc = string2;
    }

    public final void zzv(String string2) {
        this.zza = string2;
    }

    public final void zzw(String string2) {
        this.zzb = string2;
    }
}

