/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 */
package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgf$zzo$zza;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzpn;

public final class zzls
extends zzf {
    private JobScheduler zza;

    public zzls(zzic zzic2) {
        super(zzic2);
    }

    private final int zzad() {
        String string2 = this.zza().getPackageName();
        StringBuilder stringBuilder = new StringBuilder("measurement-client");
        stringBuilder.append(string2);
        return stringBuilder.toString().hashCode();
    }

    public final void zza(long l2) {
        Object object;
        int n3;
        this.zzw();
        this.zzv();
        Object object2 = this.zza;
        if (object2 != null && (object2 = wk3_2.a((JobScheduler)object2, n3 = this.zzad())) != null) {
            this.zzj().zzq().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        object2 = this.zzac();
        if (object2 != (object = zzgf$zzo$zza.zzb)) {
            zzgq zzgq2 = this.zzj().zzq();
            object2 = ((Enum)object2).name();
            zzgq2.zza("[sgtm] Not eligible for Scion upload", object2);
            return;
        }
        object2 = this.zzj().zzq();
        object = l2;
        ((zzgq)object2).zza("[sgtm] Scheduling Scion upload, millis", object);
        object2 = new PersistableBundle();
        String string2 = "com.google.android.gms.measurement.SCION_UPLOAD";
        object2.putString("action", string2);
        int n4 = this.zzad();
        Context context = this.zza();
        String string3 = "com.google.android.gms.measurement.AppMeasurementJobService";
        ComponentName componentName = new ComponentName(context, string3);
        object = new JobInfo.Builder(n4, componentName);
        n4 = 1;
        object = object.setRequiredNetworkType(n4).setMinimumLatency(l2);
        Object object3 = object.setOverrideDeadline(l2 <<= n4).setExtras((PersistableBundle)object2).build();
        int n7 = ((JobScheduler)Preconditions.checkNotNull(this.zza)).schedule(object3);
        zzgq zzgq3 = this.zzj().zzq();
        object3 = n7 == n4 ? "SUCCESS" : "FAILURE";
        zzgq3.zza("[sgtm] Scion upload job scheduled with result", object3);
    }

    public final boolean zzab() {
        return true;
    }

    public final zzgf$zzo$zza zzac() {
        this.zzw();
        this.zzv();
        zzjf zzjf2 = this.zze();
        Object object = zzbn.zzcl;
        boolean n3 = ((zzai)zzjf2).zza((zzfx)object);
        if (!n3) {
            return zzgf$zzo$zza.zzi;
        }
        zzjf2 = this.zza;
        if (zzjf2 == null) {
            return zzgf$zzo$zza.zzg;
        }
        zzjf2 = this.zze();
        boolean bl2 = ((zzai)zzjf2).zzab();
        if (!bl2) {
            return zzgf$zzo$zza.zzh;
        }
        zzjf2 = this.zze();
        boolean bl3 = ((zzai)zzjf2).zza((zzfx)(object = zzbn.zzcn));
        if (!bl3) {
            return zzgf$zzo$zza.zzf;
        }
        zzjf2 = this.zza();
        boolean bl4 = zzpn.zzb((Context)zzjf2, (String)(object = "com.google.android.gms.measurement.AppMeasurementJobService"));
        if (!bl4) {
            return zzgf$zzo$zza.zzc;
        }
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 24;
        if (n4 < n7) {
            return zzgf$zzo$zza.zzd;
        }
        zzjf2 = this.zzq();
        boolean bl5 = ((zzme)zzjf2).zzap();
        if (!bl5) {
            return zzgf$zzo$zza.zze;
        }
        return zzgf$zzo$zza.zzb;
    }

    public final void zzz() {
        JobScheduler jobScheduler;
        this.zza = jobScheduler = (JobScheduler)this.zza().getSystemService("jobscheduler");
    }
}

