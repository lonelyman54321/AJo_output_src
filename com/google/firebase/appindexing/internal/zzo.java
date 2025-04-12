/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.firebase.appindexing.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzn;
import com.google.firebase.appindexing.internal.zzz;
import java.util.Queue;
import java.util.concurrent.Executor;

final class zzo
implements OnCompleteListener,
Executor {
    private final GoogleApi zza;
    private final Handler zzb;
    private final Queue zzc;
    private int zzd;

    public zzo(GoogleApi googleApi) {
        Object object;
        this.zzc = object = new Object();
        this.zzd = 0;
        this.zza = googleApi;
        googleApi = googleApi.getLooper();
        super((Looper)googleApi);
        this.zzb = object;
    }

    public static /* synthetic */ Queue zzb(zzo zzo2) {
        return zzo2.zzc;
    }

    public static /* synthetic */ int zzc(zzo zzo2) {
        return zzo2.zzd;
    }

    public static /* synthetic */ int zzd(zzo zzo2, int n3) {
        zzo2.zzd = n3;
        return n3;
    }

    public static /* synthetic */ GoogleApi zze(zzo zzo2) {
        return zzo2.zza;
    }

    public final void execute(Runnable runnable2) {
        this.zzb.post(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onComplete(Task object) {
        object = this.zzc;
        synchronized (object) {
            try {
                Object object2;
                boolean bl2 = this.zzd;
                boolean bl3 = 2 != 0;
                if (bl2 == bl3) {
                    object2 = this.zzc;
                    object2 = object2.peek();
                    bl3 = (object2 = (zzn)object2) != null;
                    Preconditions.checkState(bl3);
                } else {
                    bl2 = false;
                    object2 = null;
                }
                this.zzd = 0;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl15 : MonitorExitStatement: MONITOREXIT : var1_1
                if (object2 != null) {
                    ((zzn)object2).zzb();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Task zza(zzz object) {
        zzn zzn2 = new zzn(this, (zzz)object);
        object = zzn2.zza();
        ((Task)object).addOnCompleteListener(this, (OnCompleteListener)this);
        Queue queue = this.zzc;
        // MONITORENTER : queue
        Queue queue2 = this.zzc;
        boolean bl2 = queue2.isEmpty();
        Queue queue3 = this.zzc;
        queue3.add(zzn2);
        // MONITOREXIT : queue
        if (!bl2) return object;
        zzn2.zzb();
        return object;
    }
}

