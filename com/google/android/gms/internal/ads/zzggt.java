/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfj;
import com.google.android.gms.internal.ads.zzggc;
import com.google.android.gms.internal.ads.zzggr;
import com.google.android.gms.internal.ads.zzggs;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class zzggt
extends zzgfj
implements RunnableFuture {
    private volatile zzggc zza;

    public zzggt(zzgez zzgez2) {
        zzggr zzggr2 = new zzggr(this, zzgez2);
        this.zza = zzggr2;
    }

    public zzggt(Callable callable) {
        zzggs zzggs2 = new zzggs(this, callable);
        this.zza = zzggs2;
    }

    public static zzggt zze(Runnable object, Object object2) {
        object = Executors.callable((Runnable)object, object2);
        zzggt zzggt2 = new zzggt((Callable)object);
        return zzggt2;
    }

    public final void run() {
        zzggc zzggc2 = this.zza;
        if (zzggc2 != null) {
            zzggc2.run();
        }
        this.zza = null;
    }

    public final String zza() {
        Object object = this.zza;
        if (object != null) {
            object = ((zzggc)object).toString();
            return cP.a("task=[", (String)object, "]");
        }
        return super.zza();
    }

    public final void zzb() {
        zzggc zzggc2;
        boolean bl2 = this.zzt();
        if (bl2 && (zzggc2 = this.zza) != null) {
            zzggc2.zzh();
        }
        this.zza = null;
    }
}

