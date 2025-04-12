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
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 *  android.os.PersistableBundle
 */
package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.android.gms.internal.gtm.zzft;

public final class zzcx
extends zzbr {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc;
    private Integer zzd;

    public zzcx(zzbu zzbu2) {
        super(zzbu2);
        zzbu2 = (AlarmManager)this.zzo().getSystemService("alarm");
        this.zzc = zzbu2;
    }

    private final int zzf() {
        Object object = this.zzd;
        if (object == null) {
            object = String.valueOf(this.zzo().getPackageName());
            String string2 = "analytics";
            int n3 = string2.concat((String)object).hashCode();
            this.zzd = object = Integer.valueOf(n3);
        }
        return this.zzd;
    }

    private final PendingIntent zzg() {
        Context context = this.zzo();
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver");
        intent = intent.setComponent(componentName);
        int n3 = zzfs.zza;
        return PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n3);
    }

    public final void zza() {
        int n3 = 0;
        AlarmManager alarmManager = null;
        this.zzb = false;
        try {
            alarmManager = this.zzc;
        }
        catch (NullPointerException nullPointerException) {}
        Object object = this.zzg();
        alarmManager.cancel(object);
        n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            alarmManager = this.zzo();
            object = "jobscheduler";
            alarmManager = (JobScheduler)alarmManager.getSystemService((String)object);
            n4 = this.zzf();
            Integer n7 = n4;
            String string2 = "Cancelling job. JobID";
            this.zzO(string2, n7);
            alarmManager.cancel(n4);
        }
    }

    public final void zzb() {
        this.zzV();
        int n3 = this.zza;
        String string2 = "Receiver not registered";
        Preconditions.checkState(n3 != 0, string2);
        this.zzw();
        long l2 = zzcs.zzd();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            this.zza();
            l3 = this.zzC().elapsedRealtime();
            long l7 = l3 + l2;
            this.zzb = true;
            Object object = (Boolean)zzeh.zzF.zzb();
            object.getClass();
            n3 = Build.VERSION.SDK_INT;
            int n4 = 24;
            if (n3 >= n4) {
                this.zzN("Scheduling upload with JobScheduler");
                object = this.zzo();
                string2 = new ComponentName((Context)object, "com.google.android.gms.analytics.AnalyticsJobService");
                l4 = this.zzf();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo.Builder builder = new JobInfo.Builder((int)l4, (ComponentName)string2);
                string2 = builder.setMinimumLatency(l2);
                l2 += l2;
                string2 = string2.setOverrideDeadline(l2).setExtras(persistableBundle).build();
                Integer n7 = (int)l4;
                this.zzO("Scheduling job. JobID", n7);
                zzft.zza((Context)object, (JobInfo)string2, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            object = "Scheduling upload with AlarmManager";
            this.zzN((String)object);
            AlarmManager alarmManager = this.zzc;
            int n8 = 2;
            PendingIntent pendingIntent = this.zzg();
            alarmManager.setInexactRepeating(n8, l7, l2, pendingIntent);
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        try {
            this.zza();
            this.zzw();
            long l2 = zzcs.zzd();
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 <= 0) return;
            Context context = this.zzo();
            PackageManager packageManager = context.getPackageManager();
            String string2 = "com.google.android.gms.analytics.AnalyticsReceiver";
            ComponentName componentName = new ComponentName(context, string2);
            boolean bl2 = false;
            Object var6_5 = null;
            ActivityInfo activityInfo = packageManager.getReceiverInfo(componentName, 0);
            if (activityInfo == null) return;
            bl2 = activityInfo.enabled;
            if (!bl2) return;
            String string3 = "Receiver registered for local dispatch.";
            this.zzN(string3);
            this.zza = bl2 = true;
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}

