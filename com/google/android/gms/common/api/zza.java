/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.os.Parcelable;
import com.google.android.gms.common.api.zzb;

final class zza
implements Parcelable.Creator {
    private static final zza zza;
    private final Parcelable.Creator zzb;

    static {
        zza zza2;
        zzb zzb2 = new zzb();
        zza = zza2 = new zza(zzb2);
    }

    private zza(Parcelable.Creator creator) {
        this.zzb = creator;
    }

    public static zza zza() {
        return zza;
    }
}

