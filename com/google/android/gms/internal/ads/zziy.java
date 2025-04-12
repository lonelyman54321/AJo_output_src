/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzeq;

public final class zziy {
    public final String zza;
    public final zzan zzb;
    public final zzan zzc;
    public final int zzd;
    public final int zze;

    public zziy(String string2, zzan zzan2, zzan zzan3, int n3, int n4) {
        boolean bl2 = true;
        if (n3 != 0) {
            if (n4 == 0) {
                n4 = 0;
            } else {
                bl2 = false;
            }
        }
        zzeq.zzd(bl2);
        zzeq.zzc(string2);
        this.zza = string2;
        this.zzb = zzan2;
        zzan3.getClass();
        this.zzc = zzan3;
        this.zzd = n3;
        this.zze = n4;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zziy.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zziy)object;
            int n3 = this.zzd;
            int n4 = ((zziy)object).zzd;
            if (n3 == n4 && (n3 = this.zze) == (n4 = ((zziy)object).zze) && (n3 = (int)(((String)(object2 = this.zza)).equals(object3 = ((zziy)object).zza) ? 1 : 0)) != 0 && (n3 = (int)(((zzan)(object2 = this.zzb)).equals(object3 = ((zziy)object).zzb) ? 1 : 0)) != 0 && (bl3 = ((zzan)(object2 = this.zzc)).equals(object = ((zziy)object).zzc))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzd + 527;
        Object object = this.zza;
        n3 *= 31;
        int n4 = this.zze;
        n3 = (n3 + n4) * 31;
        int n7 = ((String)object).hashCode() + n3;
        zzan zzan2 = this.zzb;
        n3 = zzan2.hashCode() + (n7 *= 31);
        object = this.zzc;
        return ((zzan)object).hashCode() + (n3 *= 31);
    }
}

