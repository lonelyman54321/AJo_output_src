/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgjw;
import com.google.android.gms.internal.ads.zzgjx;
import com.google.android.gms.internal.ads.zzgjy;
import java.util.Objects;

public final class zzgjz
extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzgjx zzd;

    public /* synthetic */ zzgjz(int n3, int n4, int n7, zzgjx zzgjx2, zzgjy zzgjy2) {
        this.zza = n3;
        this.zzb = 12;
        this.zzc = 16;
        this.zzd = zzgjx2;
    }

    public static zzgjw zzc() {
        zzgjw zzgjw2 = new zzgjw(null);
        return zzgjw2;
    }

    public final boolean equals(Object object) {
        zzgjx zzgjx2;
        int n3 = object instanceof zzgjz;
        if (n3 == 0) {
            return false;
        }
        object = (zzgjz)object;
        n3 = ((zzgjz)object).zza;
        int n4 = this.zza;
        return n3 == n4 && (object = ((zzgjz)object).zzd) == (zzgjx2 = this.zzd);
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = 12;
        Integer n7 = 16;
        zzgjx zzgjx2 = this.zzd;
        Object[] objectArray = new Object[]{zzgjz.class, n3, n4, n7, zzgjx2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        CharSequence charSequence = String.valueOf(this.zzd);
        charSequence = Gn.a("AesGcm Parameters (variant: ", charSequence, ", 12-byte IV, 16-byte tag, and ");
        return g30.a(this.zza, "-byte key)", (StringBuilder)charSequence);
    }

    public final boolean zza() {
        zzgjx zzgjx2 = this.zzd;
        zzgjx zzgjx3 = zzgjx.zzc;
        return zzgjx2 != zzgjx3;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgjx zzd() {
        return this.zzd;
    }
}

