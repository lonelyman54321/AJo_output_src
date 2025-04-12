/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhky;

public final class zzhkn
implements zzhkp {
    private zzhky zza;

    public static void zza(zzhky object, zzhky zzhky2) {
        object = (zzhkn)object;
        zzhky zzhky3 = ((zzhkn)object).zza;
        if (zzhky3 == null) {
            ((zzhkn)object).zza = zzhky2;
            return;
        }
        object = new IllegalStateException();
        throw object;
    }

    public final Object zzb() {
        Object object = this.zza;
        if (object != null) {
            return object.zzb();
        }
        object = new IllegalStateException();
        throw object;
    }
}

