/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzeka
implements Callable {
    public final /* synthetic */ zzekf zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ zzfhf zzd;
    public final /* synthetic */ zzfgt zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzeka(zzekf zzekf2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfhf zzfhf2, zzfgt zzfgt2, JSONObject jSONObject) {
        this.zza = zzekf2;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = zzfhf2;
        this.zze = zzfgt2;
        this.zzf = jSONObject;
    }

    public final Object call() {
        zzekf zzekf2 = this.zza;
        ListenableFuture listenableFuture = this.zzb;
        ListenableFuture listenableFuture2 = this.zzc;
        zzfhf zzfhf2 = this.zzd;
        zzfgt zzfgt2 = this.zze;
        JSONObject jSONObject = this.zzf;
        return zzekf2.zzc(listenableFuture, listenableFuture2, zzfhf2, zzfgt2, jSONObject);
    }
}

