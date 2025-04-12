/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzbu;
import com.google.android.gms.internal.vision.zzbv;
import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzeh;

public final class zzbs {
    private final boolean zza;

    public zzbs(zzbv zzbv2) {
        boolean bl2;
        zzde.zza(zzbv2, (Object)"BuildInfo must be non-null");
        this.zza = bl2 = zzbv2.zza() ^ true;
    }

    public final boolean zza(String string2) {
        String string3 = "flagName must not be null";
        zzde.zza(string2, (Object)string3);
        boolean bl2 = this.zza;
        if (!bl2) {
            return true;
        }
        return ((zzeh)zzbu.zza.zza()).zza(string2);
    }
}

