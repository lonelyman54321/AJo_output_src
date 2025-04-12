/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;

public class zzk {
    protected final zzh zza;
    private final zzr zzb;
    private final List zzc;

    public zzk(zzr object, Clock clock) {
        Preconditions.checkNotNull(object);
        this.zzb = object;
        object = new ArrayList();
        this.zzc = object;
        object = new zzh(this, clock);
        ((zzh)object).zzh();
        this.zza = object;
    }

    public void zze(zzh zzh2) {
        throw null;
    }

    public final zzr zzm() {
        return this.zzb;
    }

    public final void zzn(zzh object) {
        boolean bl2;
        object = this.zzc.iterator();
        while (bl2 = object.hasNext()) {
            zzi zzi2 = (zzi)object.next();
            zzi2.zza();
        }
    }
}

