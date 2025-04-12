/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzedn;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzeed;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzedb
implements Callable {
    public final /* synthetic */ ListenableFuture zza;
    public final /* synthetic */ ListenableFuture zzb;

    public /* synthetic */ zzedb(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        this.zza = listenableFuture;
        this.zzb = listenableFuture2;
    }

    public final Object call() {
        Object object = this.zza;
        object = (zzeed)object.get();
        Object object2 = this.zzb;
        JSONObject jSONObject = ((zzedn)object2.get()).zzb;
        object2 = ((zzedn)object2.get()).zza;
        zzedp zzedp2 = new zzedp((zzeed)object, jSONObject, (zzbxx)object2);
        return zzedp2;
    }
}

