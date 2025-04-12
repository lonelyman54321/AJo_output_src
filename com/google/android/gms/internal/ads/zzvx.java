/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvr;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzvt;
import com.google.android.gms.internal.ads.zzvu;
import com.google.android.gms.internal.ads.zzvv;
import com.google.android.gms.internal.ads.zzvw;
import com.google.android.gms.internal.ads.zzvy;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzvx {
    public final int zza;
    public final zzvo zzb;
    private final CopyOnWriteArrayList zzc;

    public zzvx() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this(copyOnWriteArrayList, 0, null);
    }

    private zzvx(CopyOnWriteArrayList copyOnWriteArrayList, int n3, zzvo zzvo2) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvo2;
    }

    public final zzvx zza(int n3, zzvo zzvo2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        zzvx zzvx2 = new zzvx(copyOnWriteArrayList, 0, zzvo2);
        return zzvx2;
    }

    public final void zzb(Handler handler, zzvy zzvy2) {
        zzvw zzvw2 = new zzvw(handler, zzvy2);
        this.zzc.add(zzvw2);
    }

    public final void zzc(zzvk zzvk2) {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzvw zzvw2 = (zzvw)iterator.next();
            zzvy zzvy2 = zzvw2.zzb;
            zzvw2 = zzvw2.zza;
            zzvr zzvr2 = new zzvr(this, zzvy2, zzvk2);
            zzgd.zzO((Handler)zzvw2, zzvr2);
        }
    }

    public final void zzd(zzvf zzvf2, zzvk zzvk2) {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzvw zzvw2 = (zzvw)iterator.next();
            zzvy zzvy2 = zzvw2.zzb;
            zzvw2 = zzvw2.zza;
            zzvv zzvv2 = new zzvv(this, zzvy2, zzvf2, zzvk2);
            zzgd.zzO((Handler)zzvw2, zzvv2);
        }
    }

    public final void zze(zzvf zzvf2, zzvk zzvk2) {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzvw zzvw2 = (zzvw)iterator.next();
            zzvy zzvy2 = zzvw2.zzb;
            zzvw2 = zzvw2.zza;
            zzvt zzvt2 = new zzvt(this, zzvy2, zzvf2, zzvk2);
            zzgd.zzO((Handler)zzvw2, zzvt2);
        }
    }

    public final void zzf(zzvf zzvf2, zzvk zzvk2, IOException iOException, boolean bl2) {
        boolean bl3;
        Iterator iterator = this.zzc.iterator();
        while (bl3 = iterator.hasNext()) {
            zzvw zzvw2 = (zzvw)iterator.next();
            zzvy zzvy2 = zzvw2.zzb;
            zzvw2 = zzvw2.zza;
            zzvu zzvu2 = new zzvu(this, zzvy2, zzvf2, zzvk2, iOException, bl2);
            zzgd.zzO((Handler)zzvw2, zzvu2);
        }
    }

    public final void zzg(zzvf zzvf2, zzvk zzvk2) {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzvw zzvw2 = (zzvw)iterator.next();
            zzvy zzvy2 = zzvw2.zzb;
            zzvw2 = zzvw2.zza;
            zzvs zzvs2 = new zzvs(this, zzvy2, zzvf2, zzvk2);
            zzgd.zzO((Handler)zzvw2, zzvs2);
        }
    }

    public final void zzh(zzvy zzvy2) {
        boolean bl2;
        Iterator iterator = this.zzc.iterator();
        while (bl2 = iterator.hasNext()) {
            zzvw zzvw2 = (zzvw)iterator.next();
            Object object = zzvw2.zzb;
            if (object != zzvy2) continue;
            object = this.zzc;
            ((CopyOnWriteArrayList)object).remove(zzvw2);
        }
    }
}

