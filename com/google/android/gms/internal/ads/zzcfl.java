/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcfp;
import java.util.HashMap;

final class zzcfl
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcfp zzj;

    public zzcfl(zzcfp zzcfp2, String string2, String string3, int n3, int n4, long l2, long l3, boolean bl2, int n7, int n8) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = n3;
        this.zzd = n4;
        this.zze = l2;
        this.zzf = l3;
        this.zzg = bl2;
        this.zzh = n7;
        this.zzi = n8;
        this.zzj = zzcfp2;
    }

    public final void run() {
        HashMap hashMap = p3.a("event", "precacheProgress");
        String string2 = this.zza;
        hashMap.put("src", string2);
        string2 = this.zzb;
        hashMap.put("cachedSrc", string2);
        String string3 = Integer.toString(this.zzc);
        hashMap.put("bytesLoaded", string3);
        int n3 = this.zzd;
        string2 = "totalBytes";
        string3 = Integer.toString(n3);
        hashMap.put(string2, string3);
        string3 = Long.toString(this.zze);
        hashMap.put("bufferedDuration", string3);
        long l2 = this.zzf;
        String string4 = "totalDuration";
        string3 = Long.toString(l2);
        hashMap.put(string4, string3);
        n3 = 1;
        int n4 = this.zzg;
        string3 = n3 != n4 ? "0" : "1";
        hashMap.put("cacheReady", string3);
        string3 = Integer.toString(this.zzh);
        hashMap.put("playerCount", string3);
        string3 = Integer.toString(this.zzi);
        hashMap.put("playerPreparedCount", string3);
        zzcfp.zze(this.zzj, "onPrecacheEvent", hashMap);
    }
}

