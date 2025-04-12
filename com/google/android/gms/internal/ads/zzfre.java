/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzfra;
import com.google.android.gms.internal.ads.zzfrb;
import com.google.android.gms.internal.ads.zzfrc;
import com.google.android.gms.internal.ads.zzfrd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzfre {
    public static final /* synthetic */ int zza;
    private static volatile zzatc zzb = zzatc.zza;
    private final Context zzc;
    private final Executor zzd;
    private final Task zze;
    private final boolean zzf;

    public zzfre(Context context, Executor executor, Task task2, boolean bl2) {
        this.zzc = context;
        this.zzd = executor;
        this.zze = task2;
        this.zzf = bl2;
    }

    public static zzfre zza(Context context, Executor executor, boolean bl2) {
        Object object;
        Object object2 = new TaskCompletionSource();
        if (bl2) {
            object = new zzfrc(context, (TaskCompletionSource)object2);
            executor.execute((Runnable)object);
        } else {
            object = new zzfrd((TaskCompletionSource)object2);
            executor.execute((Runnable)object);
        }
        object2 = ((TaskCompletionSource)object2).getTask();
        object = new zzfre(context, executor, (Task)object2, bl2);
        return object;
    }

    public static void zzg(zzatc zzatc2) {
        zzb = zzatc2;
    }

    private final Task zzh(int n3, long l2, Exception object, String string2, Map object2, String string3) {
        Object object3;
        boolean bl2 = this.zzf;
        if (!bl2) {
            Task task2 = this.zze;
            Executor executor = this.zzd;
            zzfra zzfra2 = new zzfra();
            return task2.continueWith(executor, zzfra2);
        }
        object2 = this.zzc;
        zzasx zzasx2 = zzatd.zza();
        object2 = object2.getPackageName();
        zzasx2.zza((String)object2);
        zzasx2.zzf(l2);
        Object object4 = zzb;
        zzasx2.zze((zzatc)object4);
        if (object != null) {
            object4 = new StringWriter();
            object3 = new PrintWriter((Writer)object4);
            ((Throwable)object).printStackTrace((PrintWriter)object3);
            object4 = ((StringWriter)object4).toString();
            zzasx2.zzg((String)object4);
            object4 = object.getClass().getName();
            zzasx2.zzd((String)object4);
        }
        if (string3 != null) {
            zzasx2.zzb(string3);
        }
        if (string2 != null) {
            zzasx2.zzc(string2);
        }
        object4 = this.zze;
        object3 = this.zzd;
        object = new zzfrb(zzasx2, n3);
        return ((Task)object4).continueWith((Executor)object3, (Continuation)object);
    }

    public final Task zzb(int n3, String string2) {
        return this.zzh(n3, 0L, null, null, null, string2);
    }

    public final Task zzc(int n3, long l2, Exception exception) {
        return this.zzh(n3, l2, exception, null, null, null);
    }

    public final Task zzd(int n3, long l2) {
        return this.zzh(n3, l2, null, null, null, null);
    }

    public final Task zze(int n3, long l2, String string2) {
        return this.zzh(n3, l2, null, null, null, string2);
    }

    public final Task zzf(int n3, long l2, String string2, Map map2) {
        return this.zzh(n3, l2, null, string2, null, null);
    }
}

