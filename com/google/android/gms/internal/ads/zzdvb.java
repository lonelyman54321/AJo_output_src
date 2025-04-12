/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzduz;
import com.google.android.gms.internal.ads.zzdva;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class zzdvb {
    final /* synthetic */ zzdvc zza;
    private final Map zzb;

    public zzdvb(zzdvc concurrentHashMap) {
        this.zza = concurrentHashMap;
        this.zzb = concurrentHashMap = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ zzdvb zza(zzdvb zzdvb2) {
        Object object = zzdvb2.zza;
        Map map2 = zzdvb2.zzb;
        object = zzdvc.zzc((zzdvc)object);
        map2.putAll(object);
        return zzdvb2;
    }

    public final zzdvb zzb(String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
            Map map2 = this.zzb;
            map2.put(string2, string3);
        }
        return this;
    }

    public final zzdvb zzc(zzfgt object) {
        String string2 = ((zzfgt)object).zzx;
        this.zzb("aai", string2);
        String string3 = ((zzfgt)object).zzao;
        this.zzb("request_id", string3);
        object = zzfgt.zza(((zzfgt)object).zzb);
        this.zzb("ad_format", (String)object);
        return this;
    }

    public final zzdvb zzd(zzfgw object) {
        object = ((zzfgw)object).zzb;
        this.zzb("gqi", (String)object);
        return this;
    }

    public final String zze() {
        zzdvh zzdvh2 = zzdvc.zzb(this.zza);
        Map map2 = this.zzb;
        return zzdvh2.zzb(map2);
    }

    public final void zzf() {
        Executor executor = zzdvc.zzd(this.zza);
        zzduz zzduz2 = new zzduz(this);
        executor.execute(zzduz2);
    }

    public final void zzg() {
        Executor executor = zzdvc.zzd(this.zza);
        zzdva zzdva2 = new zzdva(this);
        executor.execute(zzdva2);
    }

    public final /* synthetic */ void zzh() {
        zzdvh zzdvh2 = zzdvc.zzb(this.zza);
        Map map2 = this.zzb;
        zzdvh2.zzf(map2);
    }

    public final /* synthetic */ void zzi() {
        zzdvh zzdvh2 = zzdvc.zzb(this.zza);
        Map map2 = this.zzb;
        zzdvh2.zze(map2);
    }
}

