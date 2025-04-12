/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbs;
import com.google.android.gms.internal.ads.zzn;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzxq;
import java.io.Serializable;
import java.util.AbstractCollection;

public final class zzxr {
    public static final zzxr zza;
    public static final zzn zzb;
    private static final String zzd;
    public final int zzc;
    private final zzgbc zze;
    private int zzf;

    static {
        zzde[] zzdeArray = new zzde[]{};
        Object object = new zzxr(zzdeArray);
        zza = object;
        zzd = Integer.toString(0, 36);
        zzb = object = new zzxp();
    }

    public zzxr(zzde ... zzdeArray) {
        int n3;
        int n4;
        zzgbc zzgbc2;
        this.zze = zzgbc2 = zzgbc.zzl(zzdeArray);
        this.zzc = n4 = zzdeArray.length;
        n4 = 0;
        zzdeArray = null;
        while (n4 < (n3 = (zzgbc2 = this.zze).size())) {
            Object object;
            int n7;
            for (int i3 = n3 = n4 + 1; i3 < (n7 = ((AbstractCollection)(object = this.zze)).size()); ++i3) {
                Object object2;
                object = (zzde)this.zze.get(n4);
                n7 = (int)(((zzde)object).equals(object2 = this.zze.get(i3)) ? 1 : 0);
                if (n7 == 0) continue;
                object = new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray.");
                object2 = "TrackGroupArray";
                String string2 = "";
                zzfk.zzd(object2, string2, (Throwable)object);
            }
            n4 = n3;
        }
    }

    public final boolean equals(Object object) {
        Serializable serializable;
        Class<zzxr> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = zzxr.class) == (serializable = object.getClass())) {
            boolean bl3;
            object = (zzxr)object;
            int n3 = this.zzc;
            int n4 = ((zzxr)object).zzc;
            if (n3 == n4 && (bl3 = ((zzgbc)(serializable = this.zze)).equals(object = ((zzxr)object).zze))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzf;
        if (n3 == 0) {
            zzgbc zzgbc2 = this.zze;
            this.zzf = n3 = zzgbc2.hashCode();
        }
        return n3;
    }

    public final int zza(zzde zzde2) {
        zzgbc zzgbc2 = this.zze;
        int n3 = zzgbc2.indexOf(zzde2);
        if (n3 >= 0) {
            return n3;
        }
        return -1;
    }

    public final zzde zzb(int n3) {
        return (zzde)this.zze.get(n3);
    }

    public final zzgbc zzc() {
        zzxq zzxq2 = new zzxq();
        return zzgbc.zzk(zzgbs.zzb(this.zze, zzxq2));
    }
}

