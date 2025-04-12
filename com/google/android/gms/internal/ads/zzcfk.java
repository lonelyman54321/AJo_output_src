/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcfp;
import java.util.HashMap;

final class zzcfk
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcfp zzk;

    public zzcfk(zzcfp zzcfp2, String string2, String string3, long l2, long l3, long l4, long l7, long l8, boolean bl2, int n3, int n4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = l2;
        this.zzd = l3;
        this.zze = l4;
        this.zzf = l7;
        this.zzg = l8;
        this.zzh = bl2;
        this.zzi = n3;
        this.zzj = n4;
        this.zzk = zzcfp2;
    }

    public final void run() {
        boolean bl2;
        HashMap hashMap = p3.a("event", "precacheProgress");
        Object object = this.zza;
        hashMap.put("src", object);
        object = this.zzb;
        hashMap.put("cachedSrc", object);
        Object object2 = Long.toString(this.zzc);
        hashMap.put("bufferedDuration", object2);
        long l2 = this.zzd;
        String string2 = "totalDuration";
        object2 = Long.toString(l2);
        hashMap.put(string2, object2);
        object2 = zzbep.zzbR;
        object = zzba.zzc();
        object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3) {
            object2 = Long.toString(this.zze);
            hashMap.put("qoeLoadedBytes", object2);
            object2 = Long.toString(this.zzf);
            hashMap.put("qoeCachedBytes", object2);
            l2 = this.zzg;
            string2 = "totalBytes";
            object2 = Long.toString(l2);
            hashMap.put(string2, object2);
            l2 = zzu.zzB().currentTimeMillis();
            object2 = Long.toString(l2);
            object = "reportTime";
            hashMap.put(object, object2);
        }
        object2 = (bl3 = true) != (bl2 = this.zzh) ? "0" : "1";
        hashMap.put("cacheReady", object2);
        object2 = Integer.toString(this.zzi);
        hashMap.put("playerCount", object2);
        object2 = Integer.toString(this.zzj);
        hashMap.put("playerPreparedCount", object2);
        zzcfp.zze(this.zzk, "onPrecacheEvent", hashMap);
    }
}

