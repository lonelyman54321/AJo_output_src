/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;

public final class zzdx {
    public static final zzdx zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    static {
        zzdx zzdx2;
        int n3 = -1;
        zza = zzdx2 = new zzdx(n3, n3, n3);
    }

    public zzdx(int n3, int n4, int n7) {
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        n3 = (int)(zzgd.zzK(n7) ? 1 : 0);
        n3 = n3 != 0 ? zzgd.zzm(n7, n4) : -1;
        this.zze = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof zzdx;
        if (n4 == 0) {
            return false;
        }
        object = (zzdx)object;
        n4 = this.zzb;
        int n7 = ((zzdx)object).zzb;
        if (n4 == n7 && (n4 = this.zzc) == (n7 = ((zzdx)object).zzc) && (n4 = this.zzd) == (n3 = ((zzdx)object).zzd)) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.zzb;
        Integer n4 = this.zzc;
        Integer n7 = this.zzd;
        Object[] objectArray = new Object[]{n3, n4, n7};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioFormat[sampleRate=");
        int n3 = this.zzb;
        stringBuilder.append(n3);
        stringBuilder.append(", channelCount=");
        n3 = this.zzc;
        stringBuilder.append(n3);
        stringBuilder.append(", encoding=");
        return g30.a(this.zzd, "]", stringBuilder);
    }
}

