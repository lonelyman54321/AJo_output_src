/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzeed;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzedf
implements Callable {
    public final /* synthetic */ zzbxu zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ ListenableFuture zzd;

    public /* synthetic */ zzedf(zzbxu zzbxu2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) {
        this.zza = zzbxu2;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = listenableFuture3;
    }

    public final Object call() {
        Object object;
        Object object2 = zzbep.zzcd;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && (object2 = this.zza.zzm) != null) {
            object3 = zzdul.zzl.zza();
            object = zzu.zzB();
            long l2 = object.currentTimeMillis();
            object2.putLong((String)object3, l2);
        }
        object2 = this.zzd;
        object3 = this.zzc;
        object = this.zzb;
        object = (zzeed)object.get();
        object3 = (JSONObject)object3.get();
        object2 = (zzbxx)object2.get();
        zzedp zzedp2 = new zzedp((zzeed)object, (JSONObject)object3, (zzbxx)object2);
        return zzedp2;
    }
}

