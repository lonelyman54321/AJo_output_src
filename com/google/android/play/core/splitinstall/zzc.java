/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.zzac;
import com.google.android.play.core.splitinstall.zzb;
import com.google.android.play.core.splitinstall.zze;
import com.google.android.play.core.splitinstall.zzp;

public final class zzc {
    private zzac zza;

    private zzc() {
    }

    public /* synthetic */ zzc(zzb zzb2) {
    }

    public final zzc zza(zzac zzac2) {
        this.zza = zzac2;
        return this;
    }

    public final zzp zzb() {
        Object object = this.zza;
        if (object != null) {
            zze zze2 = new zze((zzac)object, null);
            return zze2;
        }
        String string2 = String.valueOf(zzac.class.getCanonicalName()).concat(" must be set");
        object = new IllegalStateException(string2);
        throw object;
    }
}

