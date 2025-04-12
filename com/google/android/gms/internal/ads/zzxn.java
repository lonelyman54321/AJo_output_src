/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzlm;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;

final class zzxn
implements zzvm,
zzvl {
    private final zzvm zza;
    private final long zzb;
    private zzvl zzc;

    public zzxn(zzvm zzvm2, long l2) {
        this.zza = zzvm2;
        this.zzb = l2;
    }

    public final long zza(long l2, zzmr zzmr2) {
        long l3 = this.zzb;
        zzvm zzvm2 = this.zza;
        return zzvm2.zza(l2 -= l3, zzmr2) + l3;
    }

    public final long zzb() {
        long l2;
        zzvm zzvm2 = this.zza;
        long l3 = zzvm2.zzb();
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return l2;
        }
        l2 = this.zzb;
        return l3 + l2;
    }

    public final long zzc() {
        long l2;
        zzvm zzvm2 = this.zza;
        long l3 = zzvm2.zzc();
        long l4 = l3 - (l2 = Long.MIN_VALUE);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return l2;
        }
        l2 = this.zzb;
        return l3 + l2;
    }

    public final long zzd() {
        long l2;
        zzvm zzvm2 = this.zza;
        long l3 = zzvm2.zzd();
        long l4 = l3 - (l2 = -9223372036854775807L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return l2;
        }
        l2 = this.zzb;
        return l3 + l2;
    }

    public final long zze(long l2) {
        long l3 = this.zzb;
        zzvm zzvm2 = this.zza;
        return zzvm2.zze(l2 -= l3) + l3;
    }

    public final long zzf(zzzg[] zzzgArray, boolean[] blArray, zzxf[] zzxfArray, boolean[] blArray2, long l2) {
        int n3;
        zzzg[] zzzgArray2;
        zzxn zzxn2 = this;
        zzxf[] zzxfArray2 = zzxfArray;
        int n4 = zzxfArray.length;
        zzxf[] zzxfArray3 = new zzxf[n4];
        int n7 = 0;
        int n8 = 0;
        zzvm zzvm2 = null;
        while (true) {
            int n10 = zzxfArray2.length;
            zzxf zzxf2 = null;
            if (n8 >= n10) break;
            zzzgArray2 = (zzzg[])zzxfArray2[n8];
            if (zzzgArray2 != null) {
                zzxf2 = zzzgArray2.zzc();
            }
            zzxfArray3[n8] = zzxf2;
            ++n8;
        }
        zzvm2 = zzxn2.zza;
        long l3 = zzxn2.zzb;
        long l4 = l2 - l3;
        zzzgArray2 = zzzgArray;
        Object object = blArray;
        Object object2 = zzxfArray3;
        long l7 = zzvm2.zzf(zzzgArray, blArray, zzxfArray3, blArray2, l4);
        while (n7 < (n3 = zzxfArray2.length)) {
            object = zzxfArray3[n7];
            if (object == null) {
                zzxfArray2[n7] = null;
            } else {
                object2 = zzxfArray2[n7];
                if (object2 == null || (object2 = ((zzxm)object2).zzc()) != object) {
                    long l8 = zzxn2.zzb;
                    zzxm zzxm2 = new zzxm((zzxf)object, l8);
                    zzxfArray2[n7] = zzxm2;
                }
            }
            ++n7;
        }
        long l12 = zzxn2.zzb;
        return l7 + l12;
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
        long l3 = this.zzb;
        zzvm zzvm2 = this.zza;
        zzvm2.zzj(l2 -= l3, false);
    }

    public final void zzk() {
        this.zza.zzk();
    }

    public final void zzl(zzvl zzvl2, long l2) {
        this.zzc = zzvl2;
        long l3 = this.zzb;
        this.zza.zzl(this, l2 -= l3);
    }

    public final void zzm(long l2) {
        long l3 = this.zzb;
        zzvm zzvm2 = this.zza;
        zzvm2.zzm(l2 -= l3);
    }

    public final zzvm zzn() {
        return this.zza;
    }

    public final boolean zzo(zzlo object) {
        long l2 = ((zzlo)object).zza;
        long l3 = this.zzb;
        object = ((zzlo)object).zza();
        ((zzlm)object).zze(l2 -= l3);
        object = ((zzlm)object).zzg();
        return this.zza.zzo((zzlo)object);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }
}

