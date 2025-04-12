/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;

public final class zzbe {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(String string2, double d2, double d5, double d7, int n3) {
        this.zza = string2;
        this.zzc = d2;
        this.zzb = d5;
        this.zzd = d7;
        this.zze = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4;
        double d2;
        double d5;
        double d7;
        double d9;
        int n7 = object instanceof zzbe;
        if (n7 == 0) {
            return false;
        }
        object = (zzbe)object;
        String string2 = this.zza;
        String string3 = ((zzbe)object).zza;
        n7 = Objects.equal(string2, string3);
        return n7 != 0 && (n7 = (d9 = (d7 = this.zzb) - (d5 = ((zzbe)object).zzb)) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) == 0 && (n7 = (d2 = (d7 = this.zzc) - (d5 = ((zzbe)object).zzc)) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) == 0 && (n7 = this.zze) == (n4 = ((zzbe)object).zze) && (n3 = Double.compare(d7 = this.zzd, d5 = ((zzbe)object).zzd)) == 0;
    }

    public final int hashCode() {
        String string2 = this.zza;
        Double d2 = this.zzb;
        Double d5 = this.zzc;
        Double d7 = this.zzd;
        Integer n3 = this.zze;
        Object[] objectArray = new Object[]{string2, d2, d5, d7, n3};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        String string2 = this.zza;
        objects$ToStringHelper = objects$ToStringHelper.add("name", string2);
        Number number = this.zzc;
        objects$ToStringHelper = objects$ToStringHelper.add("minBound", number);
        number = this.zzb;
        objects$ToStringHelper = objects$ToStringHelper.add("maxBound", number);
        number = this.zzd;
        objects$ToStringHelper = objects$ToStringHelper.add("percent", number);
        number = this.zze;
        return objects$ToStringHelper.add("count", number).toString();
    }
}

