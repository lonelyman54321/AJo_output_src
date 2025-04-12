/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzvo;

final class zzlr {
    public final zzvo zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzlr(zzvo zzvo2, long l2, long l3, long l4, long l7, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        boolean bl6 = true;
        boolean bl7 = !bl5 || bl3;
        zzeq.zzd(bl7);
        if (bl4 && !bl3) {
            bl6 = false;
        }
        zzeq.zzd(bl6);
        this.zza = zzvo2;
        this.zzb = l2;
        this.zzc = l3;
        this.zzd = l4;
        this.zze = l7;
        this.zzf = false;
        this.zzg = bl3;
        this.zzh = bl4;
        this.zzi = bl5;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<zzlr> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = zzlr.class) == (object2 = object.getClass())) {
            boolean bl3;
            boolean bl4;
            boolean bl5;
            long l2;
            long l3;
            long l4;
            object = (zzlr)object;
            long l7 = this.zzb;
            long l8 = ((zzlr)object).zzb;
            long l12 = l7 - l8;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 == false && (object3 = (l4 = (l7 = this.zzc) - (l8 = ((zzlr)object).zzc)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (object3 = (l3 = (l7 = this.zzd) - (l8 = ((zzlr)object).zzd)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false && (object3 = (l2 = (l7 = this.zze) - (l8 = ((zzlr)object).zze)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (bl5 = this.zzg) == (bl4 = ((zzlr)object).zzg) && (bl5 = this.zzh) == (bl4 = ((zzlr)object).zzh) && (bl5 = this.zzi) == (bl4 = ((zzlr)object).zzi) && (bl3 = zzgd.zzG(object2 = this.zza, object = ((zzlr)object).zza))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode() + 527;
        long l2 = this.zze;
        long l3 = this.zzd;
        long l4 = this.zzc;
        long l7 = this.zzb;
        n3 *= 31;
        int n4 = (int)l7;
        n3 = (n3 + n4) * 31;
        int n7 = (int)l4;
        n3 = (n3 + n7) * 31;
        int n8 = (int)l3;
        n3 = (n3 + n8) * 31;
        int n10 = (int)l2;
        n3 = (n3 + n10) * 961;
        int n14 = this.zzg;
        n3 = (n3 + n14) * 31;
        int n15 = this.zzh;
        n3 = (n3 + n15) * 31;
        int n16 = this.zzi;
        return n3 + n16;
    }

    public final zzlr zza(long l2) {
        long l3 = this.zzc;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return this;
        }
        zzvo zzvo2 = this.zza;
        long l7 = this.zzb;
        long l8 = this.zzd;
        long l12 = this.zze;
        boolean bl2 = this.zzg;
        boolean bl3 = this.zzh;
        boolean bl4 = this.zzi;
        zzlr zzlr2 = new zzlr(zzvo2, l7, l2, l8, l12, false, bl2, bl3, bl4);
        return zzlr2;
    }

    public final zzlr zzb(long l2) {
        long l3 = this.zzb;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return this;
        }
        zzvo zzvo2 = this.zza;
        long l7 = this.zzc;
        long l8 = this.zzd;
        long l12 = this.zze;
        boolean bl2 = this.zzg;
        boolean bl3 = this.zzh;
        boolean bl4 = this.zzi;
        zzlr zzlr2 = new zzlr(zzvo2, l2, l7, l8, l12, false, bl2, bl3, bl4);
        return zzlr2;
    }
}

