/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzzq;
import com.google.android.gms.internal.ads.zzzr;
import com.google.android.gms.internal.ads.zzzt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzzs {
    private final CopyOnWriteArrayList zza;

    public zzzs() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.zza = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    public final void zza(Handler handler, zzzt zzzt2) {
        this.zzc(zzzt2);
        zzzr zzzr2 = new zzzr(handler, zzzt2);
        this.zza.add(zzzr2);
    }

    public final void zzb(int n3, long l2, long l3) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object;
            Object object2 = object = iterator.next();
            object2 = (zzzr)object;
            bl2 = zzzr.zzd(object2);
            if (bl2) continue;
            object = zzzr.zza(object2);
            zzzq zzzq2 = new zzzq((zzzr)object2, n3, l2, l3);
            object.post((Runnable)zzzq2);
        }
    }

    public final void zzc(zzzt zzzt2) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            zzzr zzzr2 = (zzzr)iterator.next();
            Object object = zzzr.zzb(zzzr2);
            if (object != zzzt2) continue;
            zzzr2.zzc();
            object = this.zza;
            ((CopyOnWriteArrayList)object).remove(zzzr2);
        }
    }
}

