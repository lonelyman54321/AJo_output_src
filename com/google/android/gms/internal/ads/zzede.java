/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzeeg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzede
implements Callable {
    public final /* synthetic */ ListenableFuture zza;
    public final /* synthetic */ zzbxu zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzede(ListenableFuture listenableFuture, zzbxu zzbxu2, ListenableFuture listenableFuture2) {
        this.zza = listenableFuture;
        this.zzb = zzbxu2;
        this.zzc = listenableFuture2;
    }

    public final Object call() {
        zzbxx zzbxx2 = (zzbxx)this.zza.get();
        Object object = zzbep.zzcd;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            object2 = ((zzbxu)object).zzm;
            if (object2 != null) {
                String string2 = zzdul.zzj.zza();
                long l2 = zzbxx2.zzc();
                object2.putLong(string2, l2);
                object = ((zzbxu)object).zzm;
                object2 = zzdul.zzk.zza();
                long l3 = zzbxx2.zzb();
                object.putLong((String)object2, l3);
            }
        }
        object = this.zzc;
        object = (JSONObject)object.get();
        object2 = new zzeeg((JSONObject)object, zzbxx2);
        return object2;
    }
}

