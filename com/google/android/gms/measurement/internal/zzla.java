/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzju;

final class zzla
implements Runnable {
    private final /* synthetic */ zzdq zza;
    private final /* synthetic */ zzju zzb;

    public zzla(zzju zzju2, zzdq zzdq2) {
        this.zza = zzdq2;
        this.zzb = zzju2;
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        var1_1 = this.zzb.zzr();
        var2_3 = var1_1.zzk().zzp();
        var3_4 = var2_3.zzh();
        var4_5 = null;
        if (!var3_4) {
            var1_1 = var1_1.zzj().zzw();
            var2_3 = "Analytics storage consent denied; will not get session id";
            var1_1.zza((String)var2_3);
            while (true) {
                var1_1 = null;
                break;
            }
        } else {
            if ((var3_4 = (var2_3 = var1_1.zzk()).zza(var6_6 = (var5_7 = var1_1.zzb()).currentTimeMillis())) || !(var3_4 = (cfr_temp_0 = (var6_6 = (var2_3 = var1_1.zzk().zzl).zza()) - (var8_8 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) ** continue;
            var10_9 = var1_1.zzk().zzl.zza();
            var1_1 = var10_9;
        }
        if (var1_1 != null) {
            var2_3 = this.zzb.zzu.zzv();
            var4_5 = this.zza;
            var6_6 = var1_1.longValue();
            var2_3.zza(var4_5, var6_6);
            return;
        }
        try {
            var1_1 = this.zza;
        }
        catch (RemoteException var1_2) {
            this.zzb.zzu.zzj().zzg().zza("getSessionId failed with exception", (Object)var1_2);
            return;
        }
        var1_1.zza(null);
    }
}

