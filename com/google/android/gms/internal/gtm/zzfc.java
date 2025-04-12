/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.internal.gtm.zzcq;
import com.google.android.gms.internal.gtm.zzfe;

final class zzfc
extends zzbq
implements zzcq {
    private final zzfe zza;

    public zzfc(zzbu object) {
        super((zzbu)object);
        this.zza = object = new zzfe();
    }

    public final /* synthetic */ zzcp zza() {
        return this.zza;
    }

    public final void zzb(String string2, String string3) {
        this.zza.zzg.put(string2, string3);
    }

    public final void zzc(String string2, boolean bl2) {
        String string3 = "ga_autoActivityTracking";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            this.zza.zzd = (int)(bl2 ? 1 : 0);
            return;
        }
        string3 = "ga_anonymizeIp";
        bl3 = string3.equals(string2);
        if (bl3) {
            this.zza.zze = (int)(bl2 ? 1 : 0);
            return;
        }
        string3 = "ga_reportUncaughtExceptions";
        bl3 = string3.equals(string2);
        if (bl3) {
            this.zza.zzf = (int)(bl2 ? 1 : 0);
            return;
        }
        this.zzR("bool configuration name not recognized", string2);
    }

    public final void zzd(String string2, int n3) {
        String string3 = "ga_sessionTimeout";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            this.zza.zzc = n3;
            return;
        }
        this.zzR("int configuration name not recognized", string2);
    }

    public final void zze(String object, String string2) {
        String string3 = "ga_trackingId";
        boolean bl2 = string3.equals(object);
        if (bl2) {
            this.zza.zza = string2;
            return;
        }
        string3 = "ga_sampleFrequency";
        bl2 = string3.equals(object);
        if (bl2) {
            try {
                object = this.zza;
            }
            catch (NumberFormatException numberFormatException) {
                this.zzS("Error parsing ga_sampleFrequency value", string2, numberFormatException);
                return;
            }
            double d2 = Double.parseDouble(string2);
            ((zzfe)object).zzb = d2;
            return;
        }
        this.zzR("string configuration name not recognized", object);
    }
}

