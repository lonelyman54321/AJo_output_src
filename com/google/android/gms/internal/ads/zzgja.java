/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgiy;
import com.google.android.gms.internal.ads.zzgiz;
import java.util.Objects;

public final class zzgja
extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgiy zze;
    private final zzgix zzf;

    public /* synthetic */ zzgja(int n3, int n4, int n7, int n8, zzgiy zzgiy2, zzgix zzgix2, zzgiz zzgiz2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = zzgiy2;
        this.zzf = zzgix2;
    }

    public static zzgiw zzf() {
        zzgiw zzgiw2 = new zzgiw(null);
        return zzgiw2;
    }

    public final boolean equals(Object object) {
        zzgiy zzgiy2;
        Object object2;
        int n3 = object instanceof zzgja;
        if (n3 == 0) {
            return false;
        }
        object = (zzgja)object;
        n3 = ((zzgja)object).zza;
        int n4 = this.zza;
        return n3 == n4 && (n3 = ((zzgja)object).zzb) == (n4 = this.zzb) && (n3 = ((zzgja)object).zzc) == (n4 = this.zzc) && (n3 = ((zzgja)object).zzd) == (n4 = this.zzd) && (object2 = ((zzgja)object).zze) == (zzgiy2 = this.zze) && (object = ((zzgja)object).zzf) == (object2 = this.zzf);
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        Integer n7 = this.zzc;
        Integer n8 = this.zzd;
        zzgiy zzgiy2 = this.zze;
        zzgix zzgix2 = this.zzf;
        Object[] objectArray = new Object[]{zzgja.class, n3, n4, n7, n8, zzgiy2, zzgix2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        Object object = this.zzf;
        String string2 = String.valueOf(this.zze);
        object = String.valueOf(object);
        object = og_1.a("AesCtrHmacAead Parameters (variant: ", string2, ", hashType: ", (String)object, ", ");
        int n3 = this.zzc;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("-byte IV, and ");
        n3 = this.zzd;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("-byte tags, and ");
        n3 = this.zza;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("-byte AES key, and ");
        return g30.a(this.zzb, "-byte HMAC key)", (StringBuilder)object);
    }

    public final boolean zza() {
        zzgiy zzgiy2 = this.zze;
        zzgiy zzgiy3 = zzgiy.zzc;
        return zzgiy2 != zzgiy3;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgix zzg() {
        return this.zzf;
    }

    public final zzgiy zzh() {
        return this.zze;
    }
}

