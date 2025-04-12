/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgjj;
import com.google.android.gms.internal.ads.zzgjk;
import com.google.android.gms.internal.ads.zzgjl;
import java.util.Objects;

public final class zzgjm
extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzgjk zzd;

    public /* synthetic */ zzgjm(int n3, int n4, int n7, zzgjk zzgjk2, zzgjl zzgjl2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = 16;
        this.zzd = zzgjk2;
    }

    public static zzgjj zzd() {
        zzgjj zzgjj2 = new zzgjj(null);
        return zzgjj2;
    }

    public final boolean equals(Object object) {
        zzgjk zzgjk2;
        int n3 = object instanceof zzgjm;
        if (n3 == 0) {
            return false;
        }
        object = (zzgjm)object;
        n3 = ((zzgjm)object).zza;
        int n4 = this.zza;
        return n3 == n4 && (n3 = ((zzgjm)object).zzb) == (n4 = this.zzb) && (object = ((zzgjm)object).zzd) == (zzgjk2 = this.zzd);
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        Integer n7 = 16;
        zzgjk zzgjk2 = this.zzd;
        Object[] objectArray = new Object[]{zzgjm.class, n3, n4, n7, zzgjk2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        CharSequence charSequence = String.valueOf(this.zzd);
        charSequence = Gn.a("AesEax Parameters (variant: ", (String)charSequence, ", ");
        int n3 = this.zzb;
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append("-byte IV, 16-byte tag, and ");
        return g30.a(this.zza, "-byte key)", (StringBuilder)charSequence);
    }

    public final boolean zza() {
        zzgjk zzgjk2 = this.zzd;
        zzgjk zzgjk3 = zzgjk.zzc;
        return zzgjk2 != zzgjk3;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgjk zze() {
        return this.zzd;
    }
}

