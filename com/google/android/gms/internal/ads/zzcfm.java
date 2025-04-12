/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcfp;
import java.util.HashMap;

final class zzcfm
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcfp zzd;

    public zzcfm(zzcfp zzcfp2, String string2, String string3, int n3) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = n3;
        this.zzd = zzcfp2;
    }

    public final void run() {
        HashMap hashMap = p3.a("event", "precacheComplete");
        String string2 = this.zza;
        hashMap.put("src", string2);
        string2 = this.zzb;
        hashMap.put("cachedSrc", string2);
        String string3 = Integer.toString(this.zzc);
        hashMap.put("totalBytes", string3);
        zzcfp.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}

