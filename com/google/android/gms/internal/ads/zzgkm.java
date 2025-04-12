/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgkj;
import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgkl;
import java.util.Objects;

public final class zzgkm
extends zzgii {
    private final int zza;
    private final zzgkk zzb;

    public /* synthetic */ zzgkm(int n3, zzgkk zzgkk2, zzgkl zzgkl2) {
        this.zza = n3;
        this.zzb = zzgkk2;
    }

    public static zzgkj zzc() {
        zzgkj zzgkj2 = new zzgkj(null);
        return zzgkj2;
    }

    public final boolean equals(Object object) {
        zzgkk zzgkk2;
        int n3 = object instanceof zzgkm;
        if (n3 == 0) {
            return false;
        }
        object = (zzgkm)object;
        n3 = ((zzgkm)object).zza;
        int n4 = this.zza;
        return n3 == n4 && (object = ((zzgkm)object).zzb) == (zzgkk2 = this.zzb);
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        zzgkk zzgkk2 = this.zzb;
        Object[] objectArray = new Object[]{zzgkm.class, n3, zzgkk2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        CharSequence charSequence = String.valueOf(this.zzb);
        charSequence = Gn.a("AesGcmSiv Parameters (variant: ", charSequence, ", ");
        return g30.a(this.zza, "-byte key)", (StringBuilder)charSequence);
    }

    public final boolean zza() {
        zzgkk zzgkk2 = this.zzb;
        zzgkk zzgkk3 = zzgkk.zzc;
        return zzgkk2 != zzgkk3;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgkk zzd() {
        return this.zzb;
    }
}

