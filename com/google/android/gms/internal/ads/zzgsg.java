/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgsc;
import com.google.android.gms.internal.ads.zzgsd;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgsf;
import com.google.android.gms.internal.ads.zzgsj;
import java.util.Objects;

public final class zzgsg
extends zzgsj {
    private final int zza;
    private final int zzb;
    private final zzgse zzc;
    private final zzgsd zzd;

    public /* synthetic */ zzgsg(int n3, int n4, zzgse zzgse2, zzgsd zzgsd2, zzgsf zzgsf2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = zzgse2;
        this.zzd = zzgsd2;
    }

    public static zzgsc zze() {
        zzgsc zzgsc2 = new zzgsc(null);
        return zzgsc2;
    }

    public final boolean equals(Object object) {
        zzgse zzgse2;
        Object object2;
        int n3 = object instanceof zzgsg;
        if (n3 == 0) {
            return false;
        }
        object = (zzgsg)object;
        n3 = ((zzgsg)object).zza;
        int n4 = this.zza;
        return n3 == n4 && (n3 = ((zzgsg)object).zzd()) == (n4 = this.zzd()) && (object2 = ((zzgsg)object).zzc) == (zzgse2 = this.zzc) && (object = ((zzgsg)object).zzd) == (object2 = this.zzd);
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        zzgse zzgse2 = this.zzc;
        zzgsd zzgsd2 = this.zzd;
        Object[] objectArray = new Object[]{zzgsg.class, n3, n4, zzgse2, zzgsd2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        Object object = this.zzd;
        String string2 = String.valueOf(this.zzc);
        object = String.valueOf(object);
        object = og_1.a("HMAC Parameters (variant: ", string2, ", hashType: ", (String)object, ", ");
        int n3 = this.zzb;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("-byte tags, and ");
        return g30.a(this.zza, "-byte key)", (StringBuilder)object);
    }

    public final boolean zza() {
        zzgse zzgse2 = this.zzc;
        zzgse zzgse3 = zzgse.zzd;
        return zzgse2 != zzgse3;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        Object object = this.zzc;
        zzgse zzgse2 = zzgse.zzd;
        if (object == zzgse2) {
            return this.zzb;
        }
        zzgse2 = zzgse.zza;
        if (object == zzgse2 || object == (zzgse2 = zzgse.zzb) || object == (zzgse2 = zzgse.zzc)) {
            return this.zzb + 5;
        }
        object = new IllegalStateException("Unknown variant");
        throw object;
    }

    public final zzgsd zzf() {
        return this.zzd;
    }

    public final zzgse zzg() {
        return this.zzc;
    }
}

