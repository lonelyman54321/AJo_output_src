/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.appset.zzh;
import com.google.android.gms.internal.appset.zzj;
import com.google.android.gms.internal.appset.zzk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzl
implements AppSetIdClient {
    private static AppSetIdClient zza;
    private final Context zzb;
    private boolean zzc = false;
    private final ScheduledExecutorService zzd;
    private final ExecutorService zze;

    public zzl(Context context) {
        ExecutorService executorService;
        ScheduledExecutorService scheduledExecutorService;
        this.zzd = scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        this.zze = executorService = Executors.newSingleThreadExecutor();
        this.zzb = context;
        boolean bl2 = this.zzc;
        if (!bl2) {
            context = null;
            zzj zzj2 = new zzj(this, null);
            long l2 = 86400L;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long l3 = 0L;
            scheduledExecutorService.scheduleAtFixedRate(zzj2, l3, l2, timeUnit);
            this.zzc = bl2 = true;
        }
    }

    public static /* bridge */ /* synthetic */ Context zzb(zzl zzl2) {
        return zzl2.zzb;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AppSetIdClient zzc(Context object) {
        Class<zzl> clazz = zzl.class;
        synchronized (clazz) {
            Object object2 = "Context must not be null";
            try {
                Preconditions.checkNotNull(object, object2);
                object2 = zza;
                if (object2 != null) return zza;
                object = object.getApplicationContext();
                zza = object2 = new zzl((Context)object);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final void zze(Context object) {
        int n3;
        Object object2 = zzl.zzf((Context)object).edit();
        String string2 = "app_set_id";
        int n4 = (object2 = object2.remove(string2)).commit();
        if (n4 == 0 && (n3 = ((String)(object2 = String.valueOf(object.getPackageName()))).length()) != 0) {
            string2 = "Failed to clear app set ID generated for App ";
            string2.concat((String)object2);
        }
        object2 = zzl.zzf((Context)object).edit();
        string2 = "app_set_id_last_used_time";
        n4 = (object2 = object2.remove(string2)).commit();
        if (n4 == 0 && (n4 = ((String)(object = String.valueOf(object.getPackageName()))).length()) != 0) {
            object2 = "Failed to clear app set ID last used time for App ";
            ((String)object2).concat((String)object);
        }
    }

    private static final SharedPreferences zzf(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void zzg(Context object) {
        Object object2 = zzl.zzf((Context)object);
        Clock clock = DefaultClock.getInstance();
        long l2 = clock.currentTimeMillis();
        object2 = object2.edit();
        String string2 = "app_set_id_last_used_time";
        int n3 = (object2 = object2.putLong(string2, l2)).commit();
        if (n3 == 0) {
            n3 = ((String)(object = String.valueOf(object.getPackageName()))).length();
            if (n3 != 0) {
                object2 = "Failed to store app set ID last used time for App ";
                ((String)object2).concat((String)object);
            }
            object = new zzk("Failed to store the app set ID last used time.");
            throw object;
        }
    }

    public final Task getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ExecutorService executorService = this.zze;
        zzh zzh2 = new zzh(this, taskCompletionSource);
        executorService.execute(zzh2);
        return taskCompletionSource.getTask();
    }

    public final long zza() {
        long l2;
        String string2;
        SharedPreferences sharedPreferences2 = zzl.zzf(this.zzb);
        long l3 = sharedPreferences2.getLong(string2 = "app_set_id_last_used_time", l2 = (long)-1);
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            return l3 + 33696000000L;
        }
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzd(TaskCompletionSource taskCompletionSource) {
        zzk zzk22;
        block9: {
            int n3;
            Object object;
            long l2;
            String string2;
            Object object2;
            Object object3;
            block7: {
                block8: {
                    long l3;
                    long l4;
                    object3 = zzl.zzf(this.zzb);
                    int n4 = 0;
                    object2 = null;
                    string2 = "app_set_id";
                    object3 = object3.getString(string2, null);
                    l2 = this.zza();
                    if (object3 != null && (n4 = (l4 = (l3 = (object2 = DefaultClock.getInstance()).currentTimeMillis()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
                        try {
                            object2 = this.zzb;
                            zzl.zzg((Context)object2);
                        }
                        catch (zzk zzk3) {
                            taskCompletionSource.setException(zzk3);
                            return;
                        }
                    }
                    object3 = UUID.randomUUID().toString();
                    try {
                        object2 = this.zzb;
                        object = zzl.zzf((Context)object2);
                        object = object.edit();
                        string2 = object.putString(string2, (String)object3);
                        n3 = string2.commit();
                        if (n3 != 0) break block7;
                        object3 = "Failed to store app set ID generated for App ";
                        object2 = object2.getPackageName();
                        n3 = ((String)(object2 = String.valueOf(object2))).length();
                        if (n3 == 0) break block8;
                        object3.concat((String)object2);
                    }
                    catch (zzk zzk22) {
                        break block9;
                    }
                }
                object2 = "Failed to store the app set ID.";
                object3 = new zzk((String)object2);
                throw object3;
            }
            zzl.zzg((Context)object2);
            object2 = this.zzb;
            string2 = zzl.zzf((Context)object2);
            object = DefaultClock.getInstance();
            l2 = object.currentTimeMillis();
            string2 = string2.edit();
            String string3 = "app_set_id_creation_time";
            string2 = string2.putLong(string3, l2);
            n3 = (int)(string2.commit() ? 1 : 0);
            if (n3 == 0) {
                object3 = "Failed to store app set ID creation time for App ";
                object2 = object2.getPackageName();
                n3 = ((String)(object2 = String.valueOf(object2))).length();
                if (n3 != 0) {
                    object3.concat((String)object2);
                }
                object2 = "Failed to store the app set ID creation time.";
                object3 = new zzk((String)object2);
                throw object3;
            }
            object2 = new AppSetIdInfo((String)object3, 1);
            taskCompletionSource.setResult(object2);
            return;
        }
        taskCompletionSource.setException(zzk22);
    }
}

