/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzglb;
import java.util.Objects;

public final class zzglc
extends zzgii {
    private final String zza;
    private final zzglb zzb;

    private zzglc(String string2, zzglb zzglb2) {
        this.zza = string2;
        this.zzb = zzglb2;
    }

    public static zzglc zzc(String string2, zzglb zzglb2) {
        zzglc zzglc2 = new zzglc(string2, zzglb2);
        return zzglc2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzglc;
        if (!bl3) {
            return false;
        }
        object = (zzglc)object;
        Object object2 = ((zzglc)object).zza;
        String string2 = this.zza;
        bl3 = ((String)object2).equals(string2);
        return bl3 && (bl2 = (object = ((zzglc)object).zzb).equals(object2 = this.zzb));
    }

    public final int hashCode() {
        String string2 = this.zza;
        zzglb zzglb2 = this.zzb;
        Object[] objectArray = new Object[]{zzglc.class, string2, zzglb2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        String string2 = this.zzb.toString();
        StringBuilder stringBuilder = new StringBuilder("LegacyKmsAead Parameters (keyUri: ");
        String string3 = this.zza;
        return ko_0.a(stringBuilder, string3, ", variant: ", string2, ")");
    }

    public final boolean zza() {
        zzglb zzglb2 = this.zzb;
        zzglb zzglb3 = zzglb.zzb;
        return zzglb2 != zzglb3;
    }

    public final zzglb zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}

