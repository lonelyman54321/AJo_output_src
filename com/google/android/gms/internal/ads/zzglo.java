/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgll;
import com.google.android.gms.internal.ads.zzglm;
import com.google.android.gms.internal.ads.zzgln;
import java.util.Objects;

public final class zzglo
extends zzgii {
    private final zzglm zza;
    private final String zzb;
    private final zzgll zzc;
    private final zzgii zzd;

    public /* synthetic */ zzglo(zzglm zzglm2, String string2, zzgll zzgll2, zzgii zzgii2, zzgln zzgln2) {
        this.zza = zzglm2;
        this.zzb = string2;
        this.zzc = zzgll2;
        this.zzd = zzgii2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzglo;
        if (!bl3) {
            return false;
        }
        object = (zzglo)object;
        Object object2 = ((zzglo)object).zzc;
        Object object3 = this.zzc;
        bl3 = object2.equals(object3);
        return bl3 && (bl3 = (object2 = ((zzglo)object).zzd).equals(object3 = this.zzd)) && (bl3 = ((String)(object2 = ((zzglo)object).zzb)).equals(object3 = this.zzb)) && (bl2 = (object = ((zzglo)object).zza).equals(object2 = this.zza));
    }

    public final int hashCode() {
        String string2 = this.zzb;
        zzgll zzgll2 = this.zzc;
        zzgii zzgii2 = this.zzd;
        zzglm zzglm2 = this.zza;
        Object[] objectArray = new Object[]{zzglo.class, string2, zzgll2, zzgii2, zzglm2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        Object object = this.zza;
        Object object2 = this.zzd;
        String string2 = String.valueOf(this.zzc);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        String string3 = this.zzb;
        X50.a(stringBuilder, string3, ", dekParsingStrategy: ", string2, ", dekParametersForNewKeys: ");
        return ko_0.a(stringBuilder, (String)object2, ", variant: ", (String)object, ")");
    }

    public final boolean zza() {
        zzglm zzglm2 = this.zza;
        zzglm zzglm3 = zzglm.zzb;
        return zzglm2 != zzglm3;
    }

    public final zzgii zzb() {
        return this.zzd;
    }

    public final zzglm zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}

