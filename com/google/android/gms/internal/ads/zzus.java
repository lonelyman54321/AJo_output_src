/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzur;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;

public final class zzus
implements zzvm,
zzvl {
    public final zzvm zza;
    long zzb;
    private zzvl zzc;
    private zzur[] zzd;
    private long zze;

    public zzus(zzvm zzurArray, boolean bl2, long l2, long l3) {
        this.zza = zzurArray;
        zzurArray = new zzur[]{};
        this.zzd = zzurArray;
        this.zze = 0L;
        this.zzb = l3;
    }

    public final long zza(long l2, zzmr zzmr2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            long l7;
            long l8 = Math.min(zzmr2.zzf, l2);
            l8 = Math.max(l3, l8);
            long l12 = zzmr2.zzg;
            long l14 = this.zzb;
            long l15 = Long.MIN_VALUE;
            long l16 = l14 - l15;
            Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            l14 = object2 == false ? Long.MAX_VALUE : (l14 -= l2);
            l12 = Math.min(l12, l14);
            l3 = Math.max(l3, l12);
            l12 = zzmr2.zzf;
            long l17 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (l17 != false || (l17 = (l7 = l3 - (l12 = zzmr2.zzg)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
                zzmr2 = new zzmr(l8, l3);
            }
            return this.zza.zza(l2, zzmr2);
        }
        return l3;
    }

    public final long zzb() {
        long l2;
        long l3;
        long l4;
        long l7;
        zzvm zzvm2 = this.zza;
        long l8 = zzvm2.zzb();
        long l12 = l8 - (l7 = Long.MIN_VALUE);
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false && ((l4 = (l3 = (l2 = this.zzb) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false || (l4 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) < 0)) {
            return l8;
        }
        return l7;
    }

    public final long zzc() {
        long l2;
        long l3;
        long l4;
        long l7;
        zzvm zzvm2 = this.zza;
        long l8 = zzvm2.zzc();
        long l12 = l8 - (l7 = Long.MIN_VALUE);
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false && ((l4 = (l3 = (l2 = this.zzb) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false || (l4 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1)) < 0)) {
            return l8;
        }
        return l7;
    }

    public final long zzd() {
        Object object = this.zzq();
        long l2 = -9223372036854775807L;
        if (object) {
            long l3 = this.zze;
            this.zze = l2;
            long l4 = this.zzd();
            long l7 = l4 - l2;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object) {
                return l4;
            }
            return l3;
        }
        zzvm zzvm2 = this.zza;
        long l8 = zzvm2.zzd();
        long l12 = l8 - l2;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (!object) {
            return l2;
        }
        long l14 = 0L;
        boolean bl2 = false;
        Object object2 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1);
        if (object2 >= 0) {
            object = true;
        } else {
            object = false;
            zzvm2 = null;
        }
        zzeq.zzf(object);
        l14 = this.zzb;
        long l15 = Long.MIN_VALUE;
        long l16 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
        if (l16 == false || (object2 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1)) <= 0) {
            bl2 = true;
        }
        zzeq.zzf(bl2);
        return l8;
    }

    public final long zze(long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        int n3;
        long l12;
        this.zze = l12 = -9223372036854775807L;
        Object object = this.zzd;
        int n4 = ((zzur[])object).length;
        boolean bl2 = false;
        for (n3 = 0; n3 < n4; ++n3) {
            zzur zzur2 = object[n3];
            if (zzur2 == null) continue;
            zzur2.zzc();
        }
        object = this.zza;
        l12 = object.zze(l2);
        n3 = 1;
        Object object2 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1);
        if (object2 == false || (object2 = (l8 = l12 - (l2 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) >= 0 && ((l7 = (l4 = (l2 = this.zzb) - (l3 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false || (object2 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1)) <= 0)) {
            bl2 = true;
        }
        zzeq.zzf(bl2);
        return l12;
    }

    public final long zzf(zzzg[] zzzgArray, boolean[] blArray, zzxf[] zzxfArray, boolean[] blArray2, long l2) {
        long l3;
        long l4;
        long l7;
        Object object;
        Object[] objectArray;
        zzus zzus2 = this;
        zzxf[] zzxfArray2 = zzxfArray;
        int n3 = zzxfArray.length;
        zzur[] zzurArray = new zzur[n3];
        this.zzd = zzurArray;
        zzxf[] zzxfArray3 = new zzxf[n3];
        int n4 = 0;
        zzurArray = null;
        int n7 = 0;
        zzvm zzvm2 = null;
        while (true) {
            int n8 = zzxfArray2.length;
            zzxf zzxf2 = null;
            if (n7 >= n8) break;
            objectArray = zzus2.zzd;
            object = (zzur)zzxfArray2[n7];
            objectArray[n7] = object;
            if (object != null) {
                zzxf2 = object.zza;
            }
            zzxfArray3[n7] = zzxf2;
            ++n7;
        }
        zzvm2 = zzus2.zza;
        objectArray = zzzgArray;
        object = blArray;
        zzxf[] zzxfArray4 = zzxfArray3;
        Object object2 = blArray2;
        long l8 = l2;
        long l12 = zzvm2.zzf(zzzgArray, blArray, zzxfArray3, blArray2, l2);
        int n10 = this.zzq();
        long l14 = 0L;
        l8 = n10 != 0 && (n10 = l2 == l14 ? 0 : (l2 < l14 ? -1 : 1)) == 0 ? l14 : l2;
        zzus2.zze = l7 = -9223372036854775807L;
        n10 = 1;
        long l15 = l12 == l8 ? 0 : (l12 < l8 ? -1 : 1);
        if (l15 != false && ((l4 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1)) < 0 || (l15 = (l3 = (l14 = zzus2.zzb) - (l8 = Long.MIN_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false && (l4 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1)) > 0)) {
            n10 = 0;
            object = null;
        }
        zzeq.zzf(n10 != 0);
        while (n4 < (n10 = zzxfArray2.length)) {
            object = zzxfArray3[n4];
            if (object == null) {
                object = zzus2.zzd;
                object[n4] = null;
            } else {
                zzxfArray4 = zzus2.zzd;
                object2 = zzxfArray4[n4];
                if (object2 == null || (object2 = (Object)object2.zza) != object) {
                    object2 = new zzur;
                    object2(this, (zzxf)object);
                    zzxfArray4[n4] = object2;
                }
            }
            object = zzus2.zzd[n4];
            zzxfArray2[n4] = object;
            ++n4;
        }
        return l12;
    }

    public final zzxr zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzvm object) {
        object = this.zzc;
        object.getClass();
        object.zzi(this);
    }

    public final void zzj(long l2, boolean bl2) {
        this.zza.zzj(l2, false);
    }

    public final void zzk() {
        this.zza.zzk();
    }

    public final void zzl(zzvl zzvl2, long l2) {
        this.zzc = zzvl2;
        this.zza.zzl(this, l2);
    }

    public final void zzm(long l2) {
        this.zza.zzm(l2);
    }

    public final void zzn(long l2, long l3) {
        this.zzb = l3;
    }

    public final boolean zzo(zzlo zzlo2) {
        return this.zza.zzo(zzlo2);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        long l2 = this.zze;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }
}

