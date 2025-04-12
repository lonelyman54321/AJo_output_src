/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.analytics.zzs;
import com.google.android.gms.analytics.zzt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Iterator;

final class zzl
implements Runnable {
    final /* synthetic */ zzh zza;
    final /* synthetic */ zzr zzb;

    public zzl(zzr zzr2, zzh zzh2) {
        this.zza = zzh2;
        this.zzb = zzr2;
    }

    public final void run() {
        boolean bl2;
        Object object = this.zza;
        Iterator iterator = ((zzh)object).zzd();
        ((zzk)((Object)iterator)).zze((zzh)object);
        object = zzr.zzf(this.zzb).iterator();
        while (bl2 = object.hasNext()) {
            iterator = (zzs)object.next();
            iterator.zza();
        }
        object = this.zza;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        bl2 = ((zzh)object).zzm();
        HashSet<Uri> hashSet = "Measurement must be submitted";
        Preconditions.checkArgument(bl2, hashSet);
        iterator = ((zzh)object).zzf();
        boolean bl3 = iterator.isEmpty();
        if (!bl3) {
            boolean bl4;
            hashSet = new HashSet<Uri>();
            iterator = iterator.iterator();
            while (bl4 = iterator.hasNext()) {
                zzt zzt2 = (zzt)iterator.next();
                Uri uri = zzt2.zzb();
                boolean bl5 = hashSet.contains(uri);
                if (bl5) continue;
                hashSet.add(uri);
                zzt2.zze((zzh)object);
            }
        }
    }
}

