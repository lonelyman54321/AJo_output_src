/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcfp;
import java.util.HashMap;

final class zzcfj
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcfp zze;

    public zzcfj(zzcfp zzcfp2, String string2, String string3, int n3, int n4, boolean bl2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = n3;
        this.zzd = n4;
        this.zze = zzcfp2;
    }

    public final void run() {
        HashMap hashMap = p3.a("event", "precacheProgress");
        String string2 = this.zza;
        hashMap.put("src", string2);
        string2 = this.zzb;
        hashMap.put("cachedSrc", string2);
        String string3 = Integer.toString(this.zzc);
        hashMap.put("bytesLoaded", string3);
        string3 = Integer.toString(this.zzd);
        hashMap.put("totalBytes", string3);
        hashMap.put("cacheReady", "0");
        zzcfp.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}

