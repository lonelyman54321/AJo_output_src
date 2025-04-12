/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdq;

public final class zzdl
implements zzdn {
    private zzdq zza;

    public static void zzb(zzdq object, zzdq zzdq2) {
        object = (zzdl)object;
        zzdq zzdq3 = ((zzdl)object).zza;
        if (zzdq3 == null) {
            ((zzdl)object).zza = zzdq2;
            return;
        }
        object = new IllegalStateException();
        throw object;
    }

    public final Object zza() {
        Object object = this.zza;
        if (object != null) {
            return object.zza();
        }
        object = new IllegalStateException();
        throw object;
    }
}

