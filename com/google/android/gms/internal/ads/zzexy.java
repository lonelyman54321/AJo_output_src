/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzexv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzexy
implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzexy(List list, Object object, Bundle bundle, Bundle bundle2) {
        this.zza = list;
        this.zzb = object;
        this.zzc = bundle;
        this.zzd = bundle2;
    }

    public final Object call() {
        Object object;
        Object object2;
        Object object3 = this.zza.iterator();
        while (true) {
            object2 = this.zzb;
            boolean bl2 = object3.hasNext();
            if (!bl2) break;
            object = (zzexv)((ListenableFuture)object3.next()).get();
            if (object == null) continue;
            object.zzj(object2);
        }
        object3 = zzbep.zzcd;
        object = zzba.zzc();
        object3 = (Boolean)((zzben)object).zza((zzbeg)object3);
        boolean bl3 = (Boolean)object3;
        if (bl3 && (object3 = this.zzc) != null) {
            object = this.zzd;
            Object object4 = zzu.zzB();
            long l2 = object4.currentTimeMillis();
            boolean bl4 = object2 instanceof Bundle;
            if (bl4) {
                String string2 = zzdul.zzd.zza();
                object3.putLong(string2, l2);
                object4 = "client_sig_latency_key";
                object3.putBundle((String)object4, (Bundle)object);
            } else {
                String string3 = zzdul.zzg.zza();
                object3.putLong(string3, l2);
                object4 = "gms_sig_latency_key";
                object3.putBundle((String)object4, (Bundle)object);
            }
        }
        return object2;
    }
}

