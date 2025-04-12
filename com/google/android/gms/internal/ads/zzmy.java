/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzvo;
import java.util.Arrays;

public final class zzmy {
    public final long zza;
    public final zzdc zzb;
    public final int zzc;
    public final zzvo zzd;
    public final long zze;
    public final zzdc zzf;
    public final int zzg;
    public final zzvo zzh;
    public final long zzi;
    public final long zzj;

    public zzmy(long l2, zzdc zzdc2, int n3, zzvo zzvo2, long l3, zzdc zzdc3, int n4, zzvo zzvo3, long l4, long l7) {
        this.zza = l2;
        this.zzb = zzdc2;
        this.zzc = n3;
        this.zzd = zzvo2;
        this.zze = l3;
        this.zzf = zzdc3;
        this.zzg = n4;
        this.zzh = zzvo3;
        this.zzi = l4;
        this.zzj = l7;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzmy.class) == (object2 = object.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            int n3;
            int n4;
            object = (zzmy)object;
            long l7 = this.zza;
            long l8 = ((zzmy)object).zza;
            long l12 = l7 - l8;
            Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object4 == false && (n4 = this.zzc) == (n3 = ((zzmy)object).zzc) && (object4 = (l4 = (l7 = this.zze) - (l8 = ((zzmy)object).zze)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (n4 = this.zzg) == (n3 = ((zzmy)object).zzg) && (object4 = (l3 = (l7 = this.zzi) - (l8 = ((zzmy)object).zzi)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false && (object4 = (l2 = (l7 = this.zzj) - (l8 = ((zzmy)object).zzj)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (n4 = (int)(zzfya.zza(object2 = this.zzb, object3 = ((zzmy)object).zzb) ? 1 : 0)) != 0 && (n4 = (int)(zzfya.zza(object2 = this.zzd, object3 = ((zzmy)object).zzd) ? 1 : 0)) != 0 && (n4 = (int)(zzfya.zza(object2 = this.zzf, object3 = ((zzmy)object).zzf) ? 1 : 0)) != 0 && (bl3 = zzfya.zza(object2 = this.zzh, object = ((zzmy)object).zzh))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = this.zza;
        zzdc zzdc2 = this.zzb;
        Integer n3 = this.zzc;
        zzvo zzvo2 = this.zzd;
        Long l3 = this.zze;
        zzdc zzdc3 = this.zzf;
        Integer n4 = this.zzg;
        zzvo zzvo3 = this.zzh;
        Long l4 = this.zzi;
        Long l7 = this.zzj;
        Object[] objectArray = new Object[]{l2, zzdc2, n3, zzvo2, l3, zzdc3, n4, zzvo3, l4, l7};
        return Arrays.hashCode(objectArray);
    }
}

