/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzsn;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzvo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzso {
    public final int zza;
    public final zzvo zzb;
    private final CopyOnWriteArrayList zzc;

    public zzso() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this(copyOnWriteArrayList, 0, null);
    }

    private zzso(CopyOnWriteArrayList copyOnWriteArrayList, int n3, zzvo zzvo2) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvo2;
    }

    public final zzso zza(int n3, zzvo zzvo2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        zzso zzso2 = new zzso(copyOnWriteArrayList, 0, zzvo2);
        return zzso2;
    }

    public final void zzb(Handler handler, zzsp zzsp2) {
        zzsn zzsn2 = new zzsn(handler, zzsp2);
        this.zzc.add(zzsn2);
    }

    public final void zzc(zzsp zzsp2) {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzsn zzsn2 = (zzsn)iterator.next();
            Object object = zzsn2.zzb;
            if (object != zzsp2) continue;
            object = this.zzc;
            ((CopyOnWriteArrayList)object).remove(zzsn2);
        }
    }
}

