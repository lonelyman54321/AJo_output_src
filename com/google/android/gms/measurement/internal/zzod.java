/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zza;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpn;

final class zzod {
    protected long zza;
    final /* synthetic */ zznx zzb;
    private long zzc;
    private final zzbb zzd;

    public zzod(zznx zznx2) {
        long l2;
        this.zzb = zznx2;
        zzic zzic2 = zznx2.zzu;
        zzoc zzoc2 = new zzoc(this, zzic2);
        this.zzd = zzoc2;
        this.zzc = l2 = zznx2.zzb().elapsedRealtime();
        this.zza = l2;
    }

    public static /* synthetic */ void zza(zzod zzod2) {
        zzod2.zzb.zzv();
        long l2 = zzod2.zzb.zzb().elapsedRealtime();
        zzod2.zza(false, false, l2);
        zza zza2 = zzod2.zzb.zzc();
        long l3 = zzod2.zzb.zzb().elapsedRealtime();
        zza2.zza(l3);
    }

    public final long zza(long l2) {
        long l3 = this.zza;
        l3 = l2 - l3;
        this.zza = l2;
        return l3;
    }

    public final void zza() {
        long l2;
        this.zzd.zza();
        Object object = this.zzb.zze();
        zzfx zzfx2 = zzbn.zzcw;
        boolean bl2 = ((zzai)object).zza(zzfx2);
        if (bl2) {
            object = this.zzb.zzb();
            this.zzc = l2 = object.elapsedRealtime();
        } else {
            this.zzc = l2 = 0L;
        }
        this.zza = l2 = this.zzc;
    }

    public final boolean zza(boolean n3, boolean bl2, long l2) {
        long l3;
        long l4;
        this.zzb.zzv();
        this.zzb.zzw();
        Object object = this.zzb.zzu;
        boolean bl3 = ((zzic)object).zzae();
        if (bl3) {
            object = this.zzb.zzk().zzk;
            Clock clock = this.zzb.zzb();
            long l7 = clock.currentTimeMillis();
            ((zzhf)object).zza(l7);
        }
        long l8 = this.zzc;
        l8 = l2 - l8;
        if (n3 == 0 && (n3 = (l4 = l8 - (l3 = 1000L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
            zzgq zzgq2 = this.zzb.zzj().zzq();
            Long l12 = l8;
            zzgq2.zza("Screen exposed for less than 1000 ms. Event not sent. time", l12);
            return false;
        }
        if (!bl2) {
            l8 = this.zza(l2);
        }
        Object object2 = this.zzb.zzj().zzq();
        Object object3 = l8;
        String string2 = "Recording user engagement, ms";
        ((zzgq)object2).zza(string2, object3);
        object2 = new Bundle();
        object2.putLong("_et", l8);
        bl3 = this.zzb.zze().zzx();
        boolean bl4 = true;
        object3 = this.zzb.zzp();
        object = ((zzlz)object3).zza(bl3 ^= bl4);
        zzpn.zza((zzlw)object, (Bundle)object2, bl4);
        if (!bl2) {
            zzju zzju2 = this.zzb.zzm();
            object = "auto";
            object3 = "_e";
            zzju2.zzc((String)object, (String)object3, (Bundle)object2);
        }
        this.zzc = l2;
        this.zzd.zza();
        object2 = this.zzd;
        long l14 = (Long)zzbn.zzbk.zza(null);
        ((zzbb)object2).zza(l14);
        return bl4;
    }

    public final void zzb(long l2) {
        this.zzd.zza();
    }

    public final void zzc(long l2) {
        this.zzb.zzv();
        this.zzd.zza();
        this.zzc = l2;
        this.zza = l2;
    }
}

