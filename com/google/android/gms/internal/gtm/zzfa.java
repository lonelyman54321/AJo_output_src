/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Handler
 */
package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbp;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzew;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzey;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.stats.WakeLock;

public final class zzfa {
    private static Boolean zza;
    private final Handler zzb;
    private final Context zzc;

    public zzfa(Context object) {
        Preconditions.checkNotNull(object);
        this.zzc = object;
        this.zzb = object;
    }

    public static /* bridge */ /* synthetic */ Handler zzb(zzfa zzfa2) {
        return zzfa2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zzh(Context context) {
        Preconditions.checkNotNull(context);
        Object object = zza;
        if (object != null) {
            return (Boolean)object;
        }
        object = "com.google.android.gms.analytics.AnalyticsService";
        boolean bl2 = false;
        try {
            boolean bl3;
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, (String)object);
            context = packageManager.getServiceInfo(componentName, 0);
            if (context != null && (bl3 = context.enabled)) {
                bl2 = true;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        zza = bl2;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int zza(Intent object, int n3, int n4) {
        int n7;
        Object object2;
        Object object3;
        block9: {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        object3 = zzev.zza;
                        // MONITORENTER : object3
                    }
                    catch (SecurityException securityException) {}
                    try {
                        object2 = zzev.zzb;
                        if (object2 == null || (n7 = ((WakeLock)object2).isHeld()) == 0) break block7;
                        ((WakeLock)object2).release();
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                // MONITOREXIT : object3
                break block9;
            }
            // MONITOREXIT : object3
            throw throwable2;
        }
        object3 = zzbu.zzg(this.zzc);
        object2 = ((zzbu)object3).zzm();
        n7 = 2;
        if (object == null) {
            ((zzbq)object2).zzQ("AnalyticsService started with null intent");
            return n7;
        }
        object = object.getAction();
        ((zzbu)object3).zzj();
        object3 = n4;
        String string2 = "Local AnalyticsService called. startId, action";
        ((zzbq)object2).zzP(string2, object3, object);
        object3 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        boolean bl2 = ((String)object3).equals(object);
        if (!bl2) return n7;
        object = new zzew(this, n4, (zzeo)object2);
        this.zzg((Runnable)object);
        return n7;
    }

    public final /* synthetic */ void zzc(int n3, zzeo zzeo2) {
        zzez zzez2 = (zzez)this.zzc;
        if ((n3 = (int)(zzez2.callServiceStopSelfResult(n3) ? 1 : 0)) != 0) {
            String string2 = "Local AnalyticsService processed last dispatch request";
            zzeo2.zzN(string2);
        }
    }

    public final /* synthetic */ void zzd(zzeo zzeo2, JobParameters jobParameters) {
        zzeo2.zzN("AnalyticsJobService processed last dispatch request");
        ((zzez)this.zzc).zza(jobParameters, false);
    }

    public final void zze() {
        zzbu zzbu2 = zzbu.zzg(this.zzc);
        zzeo zzeo2 = zzbu2.zzm();
        zzbu2.zzj();
        zzeo2.zzN("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbu zzbu2 = zzbu.zzg(this.zzc);
        zzeo zzeo2 = zzbu2.zzm();
        zzbu2.zzj();
        zzeo2.zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable2) {
        zzbp zzbp2 = zzbu.zzg(this.zzc).zzf();
        zzey zzey2 = new zzey(this, runnable2);
        zzbp2.zze(zzey2);
    }

    public final boolean zzi(JobParameters jobParameters) {
        Object object = zzbu.zzg(this.zzc);
        zzeo zzeo2 = ((zzbu)object).zzm();
        Object object2 = jobParameters.getExtras();
        String string2 = "action";
        object2 = object2.getString(string2);
        ((zzbu)object).zzj();
        zzeo2.zzO("Local AnalyticsJobService called. action", object2);
        object = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
        boolean bl2 = ((String)object).equals(object2);
        if (bl2) {
            object = new zzex(this, zzeo2, jobParameters);
            this.zzg((Runnable)object);
        }
        return true;
    }
}

