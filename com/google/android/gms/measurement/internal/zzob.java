/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzny;
import com.google.android.gms.measurement.internal.zzoa;
import com.google.android.gms.measurement.internal.zzod;
import com.google.android.gms.measurement.internal.zzpn;

final class zzob
implements Runnable {
    private long zza;
    private long zzb;
    private final /* synthetic */ zzny zzc;

    public zzob(zzny zzny2, long l2, long l3) {
        this.zzc = zzny2;
        this.zza = l2;
        this.zzb = l3;
    }

    public static /* synthetic */ void zza(zzob object) {
        zzny zzny2 = ((zzob)object).zzc;
        long l2 = ((zzob)object).zza;
        long l3 = ((zzob)object).zzb;
        zzny2.zza.zzv();
        object = zzny2.zza.zzj().zzc();
        String string2 = "Application going to the background";
        ((zzgq)object).zza(string2);
        object = zzny2.zza.zzk().zzn;
        boolean bl2 = true;
        ((zzhd)object).zza(bl2);
        zzny2.zza.zza(bl2);
        object = zzny2.zza.zze();
        boolean bl3 = ((zzai)object).zzx();
        if (!bl3) {
            object = zzny2.zza;
            bl2 = false;
            string2 = null;
            ((zznx)object).zza(false, false, l3);
            object = zzny2.zza.zzb;
            ((zzod)object).zzb(l3);
        }
        object = zzny2.zza.zzj().zzp();
        Object object2 = l2;
        Object object3 = "Application backgrounded at: timestamp_millis";
        ((zzgq)object).zza((String)object3, object2);
        zzny2.zza.zzm().zzao();
        object = zzny2.zza.zze();
        object2 = zzbn.zzcm;
        bl3 = ((zzai)object).zza((zzfx)object2);
        if (bl3) {
            object = zzny2.zza.zzs();
            bl3 = ((zzpn)object).zzd((String)(object2 = zzny2.zza.zza().getPackageName()), (String)(object3 = zzny2.zza.zze().zzr()));
            if (bl3) {
                l2 = 1000L;
            } else {
                object = zzny2.zza.zze();
                object2 = zzny2.zza.zza().getPackageName();
                object3 = zzbn.zzz;
                l2 = ((zzai)object).zzc((String)object2, (zzfx)object3);
            }
            object = zzny2.zza.zzj().zzq();
            Long l4 = l2;
            String string3 = "[sgtm] Scheduling batch upload with minimum latency in millis";
            ((zzgq)object).zza(string3, l4);
            object = zzny2.zza.zzo();
            ((zzls)object).zza(l2);
        }
    }

    public final void run() {
        zzhv zzhv2 = this.zzc.zza.zzl();
        zzoa zzoa2 = new zzoa(this);
        zzhv2.zzb(zzoa2);
    }
}

