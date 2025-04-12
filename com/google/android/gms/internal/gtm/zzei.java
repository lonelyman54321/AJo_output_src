/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.internal.gtm.zzcq;
import com.google.android.gms.internal.gtm.zzej;

final class zzei
implements zzcq {
    private final zzbu zza;
    private final zzej zzb;

    public zzei(zzbu object) {
        this.zza = object;
        this.zzb = object = new zzej();
    }

    public final /* synthetic */ zzcp zza() {
        return this.zzb;
    }

    public final void zzb(String string2, String string3) {
    }

    public final void zzc(String string2, boolean bl2) {
        String string3 = "ga_dryRun";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            this.zzb.zze = (int)(bl2 ? 1 : 0);
            return;
        }
        this.zza.zzm().zzR("Bool xml configuration name not recognized", string2);
    }

    public final void zzd(String string2, int n3) {
        String string3 = "ga_dispatchPeriod";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            this.zzb.zzd = n3;
            return;
        }
        this.zza.zzm().zzR("Int xml configuration name not recognized", string2);
    }

    public final void zze(String string2, String string3) {
        String string4 = "ga_appName";
        boolean bl2 = string4.equals(string2);
        if (bl2) {
            this.zzb.zza = string3;
            return;
        }
        string4 = "ga_appVersion";
        bl2 = string4.equals(string2);
        if (bl2) {
            this.zzb.zzb = string3;
            return;
        }
        string4 = "ga_logLevel";
        bl2 = string4.equals(string2);
        if (bl2) {
            this.zzb.zzc = string3;
            return;
        }
        this.zza.zzm().zzR("String xml configuration name not recognized", string2);
    }
}

