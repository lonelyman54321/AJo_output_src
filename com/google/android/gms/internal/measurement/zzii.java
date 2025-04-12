/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzil;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultimap;

public final class zzii {
    private final boolean zza;

    public zzii(zzil zzil2) {
        boolean bl2;
        Preconditions.checkNotNull(zzil2, "BuildInfo must be non-null");
        this.zza = bl2 = zzil2.zza() ^ true;
    }

    public final boolean zza(String string2) {
        String string3 = "flagName must not be null";
        Preconditions.checkNotNull(string2, string3);
        boolean bl2 = this.zza;
        if (!bl2) {
            return true;
        }
        return ((ImmutableMultimap)zzik.zza.get()).containsValue(string2);
    }
}

