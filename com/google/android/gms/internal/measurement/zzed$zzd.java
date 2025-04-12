/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.measurement.internal.zzjt;

final class zzed$zzd
extends zzdv {
    private final zzjt zza;

    public zzed$zzd(zzjt zzjt2) {
        this.zza = zzjt2;
    }

    public final int zza() {
        return System.identityHashCode(this.zza);
    }

    public final void zza(String string2, String string3, Bundle bundle, long l2) {
        this.zza.onEvent(string2, string3, bundle, l2);
    }
}

