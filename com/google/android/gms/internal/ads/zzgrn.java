/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgrk;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgsj;
import java.util.Objects;

public final class zzgrn
extends zzgsj {
    private final int zza;
    private final int zzb;
    private final zzgrl zzc;

    public /* synthetic */ zzgrn(int n3, int n4, zzgrl zzgrl2, zzgrm zzgrm2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = zzgrl2;
    }

    public static zzgrk zze() {
        zzgrk zzgrk2 = new zzgrk(null);
        return zzgrk2;
    }

    public final boolean equals(Object object) {
        zzgrl zzgrl2;
        int n3 = object instanceof zzgrn;
        if (n3 == 0) {
            return false;
        }
        object = (zzgrn)object;
        n3 = ((zzgrn)object).zza;
        int n4 = this.zza;
        return n3 == n4 && (n3 = ((zzgrn)object).zzd()) == (n4 = this.zzd()) && (object = ((zzgrn)object).zzc) == (zzgrl2 = this.zzc);
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        zzgrl zzgrl2 = this.zzc;
        Object[] objectArray = new Object[]{zzgrn.class, n3, n4, zzgrl2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        CharSequence charSequence = String.valueOf(this.zzc);
        charSequence = Gn.a("AES-CMAC Parameters (variant: ", (String)charSequence, ", ");
        int n3 = this.zzb;
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append("-byte tags, and ");
        return g30.a(this.zza, "-byte key)", (StringBuilder)charSequence);
    }

    public final boolean zza() {
        zzgrl zzgrl2 = this.zzc;
        zzgrl zzgrl3 = zzgrl.zzd;
        return zzgrl2 != zzgrl3;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        Object object = this.zzc;
        zzgrl zzgrl2 = zzgrl.zzd;
        if (object == zzgrl2) {
            return this.zzb;
        }
        zzgrl2 = zzgrl.zza;
        if (object == zzgrl2 || object == (zzgrl2 = zzgrl.zzb) || object == (zzgrl2 = zzgrl.zzc)) {
            return this.zzb + 5;
        }
        object = new IllegalStateException("Unknown variant");
        throw object;
    }

    public final zzgrl zzf() {
        return this.zzc;
    }
}

