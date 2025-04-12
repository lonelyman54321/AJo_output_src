/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzv;

public final class zzvg
implements zzvm,
zzvl {
    public final zzvo zza;
    private final long zzb;
    private zzvq zzc;
    private zzvm zzd;
    private zzvl zze;
    private long zzf;
    private final zzzv zzg;

    public zzvg(zzvo zzvo2, zzzv zzzv2, long l2) {
        this.zza = zzvo2;
        this.zzg = zzzv2;
        this.zzb = l2;
        this.zzf = -9223372036854775807L;
    }

    private final long zzv(long l2) {
        long l3 = this.zzf;
        long l4 = -9223372036854775807L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            return l3;
        }
        return l2;
    }

    public final long zza(long l2, zzmr zzmr2) {
        zzvm zzvm2 = this.zzd;
        return zzvm2.zza(l2, zzmr2);
    }

    public final long zzb() {
        zzvm zzvm2 = this.zzd;
        return zzvm2.zzb();
    }

    public final long zzc() {
        zzvm zzvm2 = this.zzd;
        return zzvm2.zzc();
    }

    public final long zzd() {
        zzvm zzvm2 = this.zzd;
        return zzvm2.zzd();
    }

    public final long zze(long l2) {
        zzvm zzvm2 = this.zzd;
        return zzvm2.zze(l2);
    }

    public final long zzf(zzzg[] zzzgArray, boolean[] blArray, zzxf[] zzxfArray, boolean[] blArray2, long l2) {
        long l3;
        long l4;
        long l7;
        zzvg zzvg2 = this;
        long l8 = this.zzf;
        long l12 = -9223372036854775807L;
        long l14 = l8 - l12;
        Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        long l15 = object != false && (l7 = (l4 = l2 - (l3 = this.zzb)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false ? l8 : l2;
        zzvg2.zzf = l12;
        zzvm zzvm2 = zzvg2.zzd;
        return zzvm2.zzf(zzzgArray, blArray, zzxfArray, blArray2, l15);
    }

    public final zzxr zzh() {
        zzvm zzvm2 = this.zzd;
        return zzvm2.zzh();
    }

    public final void zzi(zzvm object) {
        object = this.zze;
        object.zzi(this);
    }

    public final void zzj(long l2, boolean bl2) {
        zzvm zzvm2 = this.zzd;
        zzvm2.zzj(l2, false);
    }

    public final void zzk() {
        Object object = this.zzd;
        if (object != null) {
            object.zzk();
            return;
        }
        object = this.zzc;
        if (object != null) {
            object.zzz();
        }
    }

    public final void zzl(zzvl object, long l2) {
        this.zze = object;
        object = this.zzd;
        if (object != null) {
            l2 = this.zzb;
            l2 = this.zzv(l2);
            object.zzl(this, l2);
        }
    }

    public final void zzm(long l2) {
        zzvm zzvm2 = this.zzd;
        zzvm2.zzm(l2);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(zzlo zzlo2) {
        boolean bl2;
        zzvm zzvm2 = this.zzd;
        return zzvm2 != null && (bl2 = zzvm2.zzo(zzlo2));
    }

    public final boolean zzp() {
        boolean bl2;
        zzvm zzvm2 = this.zzd;
        return zzvm2 != null && (bl2 = zzvm2.zzp());
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzvo object) {
        long l2 = this.zzb;
        l2 = this.zzv(l2);
        Object object2 = this.zzc;
        object2.getClass();
        zzzv zzzv2 = this.zzg;
        this.zzd = object = object2.zzI((zzvo)object, zzzv2, l2);
        object2 = this.zze;
        if (object2 != null) {
            object.zzl(this, l2);
        }
    }

    public final void zzs(long l2) {
        this.zzf = l2;
    }

    public final void zzt() {
        zzvm zzvm2 = this.zzd;
        if (zzvm2 != null) {
            zzvq zzvq2 = this.zzc;
            zzvq2.getClass();
            zzvq2.zzG(zzvm2);
        }
    }

    public final void zzu(zzvq zzvq2) {
        boolean bl2;
        zzvq zzvq3 = this.zzc;
        if (zzvq3 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzvq3 = null;
        }
        zzeq.zzf(bl2);
        this.zzc = zzvq2;
    }
}

