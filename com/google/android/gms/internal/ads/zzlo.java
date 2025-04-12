/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzlm;
import com.google.android.gms.internal.ads.zzln;
import java.util.Arrays;

public final class zzlo {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzlo(zzlm zzlm2, zzln zzln2) {
        long l2;
        float f5;
        long l3;
        this.zza = l3 = zzlm.zzc(zzlm2);
        this.zzb = f5 = zzlm.zza(zzlm2);
        this.zzc = l2 = zzlm.zzb(zzlm2);
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        float f5;
        float f6;
        float f7;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof zzlo;
        if (!object2) {
            return false;
        }
        object = (zzlo)object;
        long l4 = this.zza;
        long l7 = ((zzlo)object).zza;
        long l8 = l4 - l7;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (!object2 && !(object2 = (f7 = (f6 = this.zzb) - (f5 = ((zzlo)object).zzb)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) && (l3 = (l2 = (l4 = this.zzc) - (l7 = ((zzlo)object).zzc)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = this.zza;
        Float f5 = Float.valueOf(this.zzb);
        Long l3 = this.zzc;
        Object[] objectArray = new Object[]{l2, f5, l3};
        return Arrays.hashCode(objectArray);
    }

    public final zzlm zza() {
        zzlm zzlm2 = new zzlm(this, null);
        return zzlm2;
    }
}

