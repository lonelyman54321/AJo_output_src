/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzh;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.Callable;

final class zzpa
implements Callable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzou zzb;

    public zzpa(zzou zzou2, zzp zzp2) {
        this.zza = zzp2;
        this.zzb = zzou2;
    }

    public final /* synthetic */ Object call() {
        Object object = this.zzb;
        String string2 = (String)Preconditions.checkNotNull(this.zza.zza);
        object = ((zzou)object).zzb(string2);
        boolean bl2 = ((zzjj)object).zzh();
        string2 = null;
        if (bl2 && (bl2 = ((zzjj)(object = zzjj.zzb(this.zza.zzt))).zzh())) {
            object = this.zzb;
            zzp zzp2 = this.zza;
            if ((object = ((zzou)object).zza(zzp2)) == null) {
                this.zzb.zzj().zzr().zza("App info was null when attempting to get app instance id");
                return null;
            }
            return ((zzh)object).zzad();
        }
        this.zzb.zzj().zzq().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

