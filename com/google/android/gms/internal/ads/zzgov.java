/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghx;
import com.google.android.gms.internal.ads.zzgqm;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzhac;
import java.util.Objects;

public final class zzgov
extends zzghx {
    private final zzgqm zza;

    public zzgov(zzgqm zzgqm2) {
        this.zza = zzgqm2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        boolean bl3 = object instanceof zzgov;
        if (!bl3) {
            return false;
        }
        object = ((zzgov)object).zza;
        Object object3 = this.zza.zzc().zzg();
        bl3 = object3.equals(object2 = ((zzgqm)object).zzc().zzg());
        return bl3 && (bl3 = ((String)(object3 = this.zza.zzc().zzi())).equals(object2 = ((zzgqm)object).zzc().zzi())) && (bl2 = ((zzhac)(object3 = this.zza.zzc().zzh())).equals(object = ((zzgqm)object).zzc().zzh()));
    }

    public final int hashCode() {
        Object object = this.zza;
        zzgwm zzgwm2 = ((zzgqm)object).zzc();
        object = ((zzgqm)object).zzd();
        Object[] objectArray = new Object[]{zzgwm2, object};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        int n3;
        String string2 = this.zza.zzc().zzi();
        Object object = this.zza.zzc().zzg();
        int n4 = ((Enum)object).ordinal();
        object = n4 != (n3 = 1) ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (n4 != (n3 = 4) ? "UNKNOWN" : "CRUNCHY") : "RAW") : "LEGACY") : "TINK";
        return uc0_0.a("(typeUrl=", string2, ", outputPrefixType=", (String)object, ")");
    }

    public final boolean zza() {
        zzgxn zzgxn2;
        zzgxn zzgxn3 = this.zza.zzc().zzg();
        return zzgxn3 != (zzgxn2 = zzgxn.zzd);
    }

    public final zzgqm zzb() {
        return this.zza;
    }
}

