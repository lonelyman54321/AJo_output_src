/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzgto;
import java.util.Objects;

public final class zzgtp {
    private final zzghk zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgtp(zzghk zzghk2, int n3, String string2, String string3, zzgto zzgto2) {
        this.zza = zzghk2;
        this.zzb = n3;
        this.zzc = string2;
        this.zzd = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3;
        int n4 = object instanceof zzgtp;
        if (n4 == 0) {
            return false;
        }
        object = (zzgtp)object;
        Object object2 = this.zza;
        Object object3 = ((zzgtp)object).zza;
        return object2 == object3 && (n4 = this.zzb) == (n3 = ((zzgtp)object).zzb) && (n4 = (int)(((String)(object2 = this.zzc)).equals(object3 = ((zzgtp)object).zzc) ? 1 : 0)) != 0 && (bl2 = ((String)(object2 = this.zzd)).equals(object = ((zzgtp)object).zzd));
    }

    public final int hashCode() {
        zzghk zzghk2 = this.zza;
        Integer n3 = this.zzb;
        String string2 = this.zzc;
        String string3 = this.zzd;
        Object[] objectArray = new Object[]{zzghk2, n3, string2, string3};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        zzghk zzghk2 = this.zza;
        int n3 = this.zzb;
        String string2 = this.zzc;
        String string3 = this.zzd;
        StringBuilder stringBuilder = new StringBuilder("(status=");
        stringBuilder.append(zzghk2);
        stringBuilder.append(", keyId=");
        stringBuilder.append(n3);
        stringBuilder.append(", keyType='");
        return ko_0.a(stringBuilder, string2, "', keyPrefix='", string3, "')");
    }

    public final int zza() {
        return this.zzb;
    }
}

