/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 */
package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzr;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.cloudmessaging.zzu;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class zzv {
    private static zzv zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private zzp zzd;
    private int zze;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        zzp zzp2;
        this.zzd = zzp2 = new zzp(this, null);
        this.zze = 1;
        this.zzc = scheduledExecutorService;
        this.zzb = context = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context zza(zzv zzv2) {
        return zzv2.zzb;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzv zzb(Context object) {
        Class<zzv> clazz = zzv.class;
        synchronized (clazz) {
            try {
                zzv zzv2 = zza;
                if (zzv2 != null) return zza;
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                String string2 = "MessengerIpcClient";
                Object object2 = new NamedThreadFactory(string2);
                int n3 = 1;
                object2 = Executors.newScheduledThreadPool(n3, (ThreadFactory)object2);
                object2 = Executors.unconfigurableScheduledExecutorService((ScheduledExecutorService)object2);
                zza = zzv2 = new zzv((Context)object, (ScheduledExecutorService)object2);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService zze(zzv zzv2) {
        return zzv2.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int zzf() {
        synchronized (this) {
            int n3;
            int n4 = this.zze;
            this.zze = n3 = n4 + 1;
            return n4;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Task zzg(zzs object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                String string2;
                boolean bl2;
                int n3;
                Object object2;
                block5: {
                    object2 = "MessengerIpcClient";
                    n3 = 3;
                    try {
                        bl2 = Log.isLoggable((String)object2, (int)n3);
                        if (!bl2) break block5;
                        object2 = ((zzs)object).toString();
                        string2 = "Queueing ";
                        string2.concat((String)object2);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (!(bl2 = ((zzp)(object2 = this.zzd)).zzg((zzs)object))) {
                    n3 = 0;
                    string2 = null;
                    this.zzd = object2 = new zzp(this, null);
                    ((zzp)object2).zzg((zzs)object);
                }
                object = ((zzs)object).zzb;
                return ((TaskCompletionSource)object).getTask();
            }
            throw throwable2;
        }
    }

    public final Task zzc(int n3, Bundle bundle) {
        int n4 = this.zzf();
        zzr zzr2 = new zzr(n4, n3, bundle);
        return this.zzg(zzr2);
    }

    public final Task zzd(int n3, Bundle bundle) {
        int n4 = this.zzf();
        zzu zzu2 = new zzu(n4, n3, bundle);
        return this.zzg(zzu2);
    }
}

