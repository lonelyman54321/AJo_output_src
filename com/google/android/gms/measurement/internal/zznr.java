/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zznq;
import com.google.android.gms.measurement.internal.zzns;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zznu;
import com.google.android.gms.measurement.internal.zznv;
import com.google.android.gms.measurement.internal.zzou;
import java.util.Objects;

public final class zznr {
    private final Context zza;

    public zznr(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    public static /* synthetic */ void zza(zznr object, int n3, zzgo object2, Intent intent) {
        Object object3 = (zznu)((zznr)object).zza;
        boolean bl2 = object3.zza(n3);
        if (bl2) {
            object2 = ((zzgo)object2).zzq();
            Object object4 = n3;
            object3 = "Local AppMeasurementService processed last upload request. StartId";
            ((zzgq)object2).zza((String)object3, object4);
            object4 = ((zznr)object).zzc().zzq();
            object2 = "Completed wakeful intent.";
            ((zzgq)object4).zza((String)object2);
            object = (zznu)((zznr)object).zza;
            object.zza(intent);
        }
    }

    public static /* synthetic */ void zza(zznr zznr2, JobParameters jobParameters) {
        ((zznu)zznr2.zza).zza(jobParameters, false);
    }

    public static /* synthetic */ void zza(zznr zznr2, zzgo zzgo2, JobParameters jobParameters) {
        zzgo2.zzq().zza("AppMeasurementJobService processed last upload request.");
        ((zznu)zznr2.zza).zza(jobParameters, false);
    }

    private final void zza(zzou zzou2, Runnable runnable2) {
        zzhv zzhv2 = zzou2.zzl();
        zznv zznv2 = new zznv(this, zzou2, runnable2);
        zzhv2.zzb(zznv2);
    }

    private final zzgo zzc() {
        return zzic.zza(this.zza, null, null).zzj();
    }

    public final int zza(Intent object, int n3, int n4) {
        zzgo zzgo2 = zzic.zza(this.zza, null, null).zzj();
        int n7 = 2;
        if (object == null) {
            zzgo2.zzr().zza("AppMeasurementService started with null intent");
            return n7;
        }
        Object object2 = object.getAction();
        Object object3 = zzgo2.zzq();
        Integer n8 = n4;
        String string2 = "Local AppMeasurementService called. startId, action";
        ((zzgq)object3).zza(string2, n8, object2);
        object3 = "com.google.android.gms.measurement.UPLOAD";
        boolean bl2 = ((String)object3).equals(object2);
        if (bl2) {
            object2 = new zznt(this, n4, zzgo2, (Intent)object);
            object = zzou.zza(this.zza);
            this.zza((zzou)object, (Runnable)object2);
        }
        return n7;
    }

    public final IBinder zza(Intent object) {
        zzou zzou2 = null;
        if (object == null) {
            this.zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String string2 = "com.google.android.gms.measurement.START";
        boolean bl2 = string2.equals(object = object.getAction());
        if (bl2) {
            zzou2 = zzou.zza(this.zza);
            object = new zzig(zzou2);
            return object;
        }
        this.zzc().zzr().zza("onBind received unknown action", object);
        return null;
    }

    public final void zza() {
        zzic.zza(this.zza, null, null).zzj().zzq().zza("Local AppMeasurementService is starting up");
    }

    public final boolean zza(JobParameters jobParameters) {
        zzou zzou2;
        Object object;
        Object object2 = jobParameters.getExtras().getString("action");
        boolean bl2 = Objects.equals(object2, object = "com.google.android.gms.measurement.UPLOAD");
        if (bl2) {
            object = (String)Preconditions.checkNotNull(object2);
            zzou2 = zzou.zza(this.zza);
            zzgo zzgo2 = zzou2.zzj();
            zzgq zzgq2 = zzgo2.zzq();
            String string2 = "Local AppMeasurementJobService called. action";
            zzgq2.zza(string2, object);
            object = new zzns(this, zzgo2, jobParameters);
            this.zza(zzou2, (Runnable)object);
        }
        if (bl2 = Objects.equals(object2, object = "com.google.android.gms.measurement.SCION_UPLOAD")) {
            object2 = (String)Preconditions.checkNotNull(object2);
            object2 = zzed.zza(this.zza);
            object = zzbn.zzcn;
            zzou2 = null;
            bl2 = (Boolean)(object = (Boolean)((zzfx)object).zza(null));
            if (bl2) {
                object = new zznq(this, jobParameters);
                ((zzed)object2).zza((Runnable)object);
            }
        }
        return true;
    }

    public final void zzb() {
        zzic.zza(this.zza, null, null).zzj().zzq().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzb(Intent object) {
        if (object == null) {
            this.zzc().zzg().zza("onRebind called with null intent");
            return;
        }
        object = object.getAction();
        this.zzc().zzq().zza("onRebind called. action", object);
    }

    public final boolean zzc(Intent object) {
        boolean bl2 = true;
        if (object == null) {
            this.zzc().zzg().zza("onUnbind called with null intent");
            return bl2;
        }
        object = object.getAction();
        this.zzc().zzq().zza("onUnbind called for intent. action", object);
        return bl2;
    }
}

