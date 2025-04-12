/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbg;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzpp;
import java.io.Serializable;
import java.util.Set;

final class zzpn {
    public static final zzpn zza;
    public final int zzb;
    public final int zzc;
    private final zzgbh zzd;

    static {
        zzpn zzpn2;
        int n3 = zzgd.zza;
        int n4 = 33;
        int n7 = 2;
        int n8 = 10;
        if (n3 >= n4) {
            Object object = new zzgbg();
            for (int i3 = 1; i3 <= n8; ++i3) {
                int n10 = zzgd.zzh(i3);
                Integer n14 = n10;
                ((zzgbg)object).zzf(n14);
            }
            object = ((zzgbg)object).zzi();
            zzpn2 = new zzpn(n7, (Set)object);
        } else {
            zzpn2 = new zzpn(n7, n8);
        }
        zza = zzpn2;
    }

    public zzpn(int n3, int n4) {
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = null;
    }

    public zzpn(int n3, Set set) {
        int n4;
        this.zzb = n3;
        Object object = zzgbh.zzl(set);
        this.zzd = object;
        object = ((zzgbh)object).zze();
        int n7 = 0;
        set = null;
        while ((n4 = object.hasNext()) != 0) {
            Integer n8 = (Integer)object.next();
            n4 = Integer.bitCount(n8);
            n7 = Math.max(n7, n4);
        }
        this.zzc = n7;
    }

    public final boolean equals(Object object) {
        zzgbh zzgbh2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n3 = object instanceof zzpn;
        if (n3 == 0) {
            return false;
        }
        object = (zzpn)object;
        n3 = this.zzb;
        int n4 = ((zzpn)object).zzb;
        if (n3 == n4 && (n3 = this.zzc) == (n4 = ((zzpn)object).zzc) && (bl2 = zzgd.zzG(zzgbh2 = this.zzd, object = ((zzpn)object).zzd))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        zzgbh zzgbh2 = this.zzd;
        if (zzgbh2 == null) {
            n3 = 0;
            zzgbh2 = null;
        } else {
            n3 = zzgbh2.hashCode();
        }
        int n4 = this.zzb;
        int n7 = this.zzc;
        return (n4 * 31 + n7) * 31 + n3;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzd);
        StringBuilder stringBuilder = new StringBuilder("AudioProfile[format=");
        int n3 = this.zzb;
        stringBuilder.append(n3);
        stringBuilder.append(", maxChannelCount=");
        n3 = this.zzc;
        stringBuilder.append(n3);
        stringBuilder.append(", channelMasks=");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int zza(int n3, zzk object) {
        Serializable serializable = this.zzd;
        if (serializable != null) {
            return this.zzc;
        }
        int n4 = zzgd.zza;
        int n7 = 29;
        if (n4 >= n7) {
            return zzpl.zza(this.zzb, n3, (zzk)object);
        }
        n3 = this.zzb;
        object = zzpp.zzb;
        Integer n8 = n3;
        serializable = Integer.valueOf(0);
        n8 = (Integer)((zzgbf)object).getOrDefault((Object)n8, serializable);
        n8.getClass();
        return n8;
    }

    public final boolean zzb(int n3) {
        zzgbh zzgbh2 = this.zzd;
        if (zzgbh2 == null) {
            int n4 = this.zzc;
            return n3 <= n4;
        }
        if ((n3 = zzgd.zzh(n3)) == 0) {
            return false;
        }
        zzgbh2 = this.zzd;
        Integer n7 = n3;
        return zzgbh2.contains(n7);
    }
}

