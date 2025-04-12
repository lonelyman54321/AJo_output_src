/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.measurement.internal.zzgp;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class zzgm {
    private static zzgm zza;
    private static final Duration zzb;
    private final zzic zzc;
    private final TelemetryLoggingClient zzd;
    private final AtomicLong zze;

    static {
        zzb = pk3_2.a();
    }

    private zzgm(Context object, zzic zzic2) {
        Object object2 = new AtomicLong(-1);
        this.zze = object2;
        object2 = TelemetryLoggingOptions.builder().setApi("measurement:api").build();
        object = TelemetryLogging.getClient(object, (TelemetryLoggingOptions)object2);
        this.zzd = object;
        this.zzc = zzic2;
    }

    public static zzgm zza(zzic zzic2) {
        zzgm zzgm2 = zza;
        if (zzgm2 == null) {
            Context context = zzic2.zza();
            zza = zzgm2 = new zzgm(context, zzic2);
        }
        return zza;
    }

    public static /* synthetic */ void zza(zzgm zzgm2, long l2, Exception exception) {
        zzgm2.zze.set(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(int n3, int n4, long l2, long l3, int n7) {
        zzgm zzgm2 = this;
        Task task2 = null;
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    MethodInvocation methodInvocation;
                    Object object;
                    Object object2 = this.zzc;
                    object2 = ((zzic)object2).zzb();
                    long l4 = object2.elapsedRealtime();
                    Object object3 = this.zze;
                    long l7 = ((AtomicLong)object3).get();
                    long l8 = -1;
                    Object object4 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                    if (object4 != false) {
                        object3 = this.zze;
                        l7 = ((AtomicLong)object3).get();
                        object = zzb;
                        l8 = qk3_2.a((Duration)object);
                        long l12 = (l7 = l4 - l7) - l8;
                        object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                        if (object4 <= 0) break block6;
                    }
                    object3 = zzgm2.zzd;
                    int n8 = 36301;
                    object = methodInvocation;
                    object4 = n4;
                    methodInvocation = new MethodInvocation(n8, n4, 0, l2, l3, null, null, 0, n7);
                    int n10 = 1;
                    object = new MethodInvocation[n10];
                    object[0] = methodInvocation;
                    object = Arrays.asList(object);
                    TelemetryData telemetryData = new TelemetryData(0, (List)object);
                    task2 = object3.log(telemetryData);
                    object3 = new zzgp(zzgm2, l4);
                    task2.addOnFailureListener((OnFailureListener)object3);
                    return;
                }
                catch (Throwable throwable2) {}
            }
            return;
            throw throwable2;
        }
    }
}

