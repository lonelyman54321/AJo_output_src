/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 */
package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzol;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpn;

public final class zzoi
extends zzot {
    private final AlarmManager zza;
    private zzbb zzb;
    private Integer zzc;

    public zzoi(zzou zzou2) {
        super(zzou2);
        zzou2 = (AlarmManager)this.zza().getSystemService("alarm");
        this.zza = zzou2;
    }

    private final int zzw() {
        Object object = this.zzc;
        if (object == null) {
            object = this.zza().getPackageName();
            String string2 = "measurement";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object);
            int n3 = stringBuilder.toString().hashCode();
            this.zzc = object = Integer.valueOf(n3);
        }
        return this.zzc;
    }

    private final PendingIntent zzx() {
        Context context = this.zza();
        Intent intent = new Intent();
        intent = intent.setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD");
        int n3 = zzcy.zza;
        return zzcy.zza(context, 0, intent, n3);
    }

    private final zzbb zzy() {
        zzbb zzbb2 = this.zzb;
        if (zzbb2 == null) {
            zzic zzic2 = this.zzg.zzk();
            this.zzb = zzbb2 = new zzol(this, zzic2);
        }
        return this.zzb;
    }

    private final void zzz() {
        Context context = this.zza();
        String string2 = "jobscheduler";
        if ((context = (JobScheduler)context.getSystemService(string2)) != null) {
            int n3 = this.zzw();
            context.cancel(n3);
        }
    }

    public final void zza(long l2) {
        int n3;
        String string2;
        Object object;
        this.zzam();
        Object object2 = this.zza();
        boolean bl2 = zzpn.zza((Context)object2);
        if (!bl2) {
            object = this.zzj().zzc();
            string2 = "Receiver not registered/enabled";
            ((zzgq)object).zza(string2);
        }
        bl2 = false;
        object = null;
        int n4 = zzpn.zza((Context)object2, false);
        if (n4 == 0) {
            object2 = this.zzj().zzc();
            object = "Service not registered/enabled";
            ((zzgq)object2).zza((String)object);
        }
        this.zzr();
        object2 = this.zzj().zzq();
        object = l2;
        string2 = "Scheduling upload, millis";
        ((zzgq)object2).zza(string2, object);
        long l3 = this.zzb().elapsedRealtime();
        long l4 = l3 + l2;
        object2 = zzbn.zzag;
        bl2 = false;
        object = null;
        object2 = (Long)((zzfx)object2).zza(null);
        long l7 = (Long)object2;
        long l8 = 0L;
        l7 = Math.max(l8, l7);
        n4 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (n4 < 0 && (n4 = (int)(((zzbb)(object2 = this.zzy())).zzc() ? 1 : 0)) == 0) {
            object2 = this.zzy();
            ((zzbb)object2).zza(l2);
        }
        if ((n4 = Build.VERSION.SDK_INT) >= (n3 = 24)) {
            object2 = this.zza();
            object = new ComponentName((Context)object2, "com.google.android.gms.measurement.AppMeasurementJobService");
            n3 = this.zzw();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo.Builder builder = new JobInfo.Builder(n3, (ComponentName)object);
            object = builder.setMinimumLatency(l2);
            JobInfo jobInfo = object.setOverrideDeadline(l2 <<= 1).setExtras(persistableBundle).build();
            zzcx.zza((Context)object2, jobInfo, "com.google.android.gms", "UploadAlarm");
            return;
        }
        string2 = this.zza;
        if (string2 != null) {
            object2 = (Long)zzbn.zzab.zza(null);
            l3 = (Long)object2;
            l8 = Math.max(l3, l2);
            PendingIntent pendingIntent = this.zzx();
            int n7 = 2;
            string2.setInexactRepeating(n7, l4, l8, pendingIntent);
        }
    }

    public final boolean zzc() {
        int n3;
        int n4;
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            PendingIntent pendingIntent = this.zzx();
            alarmManager.cancel(pendingIntent);
        }
        if ((n4 = Build.VERSION.SDK_INT) >= (n3 = 24)) {
            this.zzz();
        }
        return false;
    }

    public final void zzr() {
        this.zzam();
        Object object = this.zzj().zzq();
        String string2 = "Unscheduling upload";
        ((zzgq)object).zza(string2);
        object = this.zza;
        if (object != null) {
            string2 = this.zzx();
            object.cancel((PendingIntent)string2);
        }
        object = this.zzy();
        ((zzbb)object).zza();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            this.zzz();
        }
    }
}

