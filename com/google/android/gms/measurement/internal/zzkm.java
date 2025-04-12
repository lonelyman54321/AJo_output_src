/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzju;

final class zzkm
implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzju zzb;

    public zzkm(zzju zzju2, boolean bl2) {
        this.zza = bl2;
        this.zzb = zzju2;
    }

    public final void run() {
        String string2;
        Object object = this.zzb.zzu;
        boolean bl2 = ((zzic)object).zzae();
        Object object2 = this.zzb.zzu;
        boolean bl3 = ((zzic)object2).zzad();
        Object object3 = this.zzb.zzu;
        boolean bl4 = this.zza;
        ((zzic)object3).zza(bl4);
        boolean bl5 = this.zza;
        if (bl3 == bl5) {
            object2 = this.zzb.zzu.zzj().zzq();
            bl5 = this.zza;
            object3 = bl5;
            string2 = "Default data collection state already set to";
            ((zzgq)object2).zza(string2, object3);
        }
        if ((bl3 = ((zzic)(object2 = this.zzb.zzu)).zzae()) == bl2 || (bl3 = ((zzic)(object2 = this.zzb.zzu)).zzae()) != (bl5 = ((zzic)(object3 = this.zzb.zzu)).zzad())) {
            object2 = this.zzb.zzu.zzj().zzw();
            bl5 = this.zza;
            object3 = bl5;
            object = bl2;
            string2 = "Default data collection is different than actual status";
            ((zzgq)object2).zza(string2, object3, object);
        }
        zzju.zzc(this.zzb);
    }
}

