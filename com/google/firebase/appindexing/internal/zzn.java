/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appindexing.internal.zzk;
import com.google.firebase.appindexing.internal.zzm;
import com.google.firebase.appindexing.internal.zzo;
import com.google.firebase.appindexing.internal.zzz;
import java.util.concurrent.Executor;

final class zzn {
    final /* synthetic */ zzo zza;
    private final zzz zzb;
    private final TaskCompletionSource zzc;

    public zzn(zzo object, zzz zzz2) {
        this.zza = object;
        this.zzc = object = new TaskCompletionSource();
        this.zzb = zzz2;
    }

    public static /* synthetic */ TaskCompletionSource zzd(zzn zzn2) {
        return zzn2.zzc;
    }

    public static /* synthetic */ zzz zze(zzn zzn2) {
        return zzn2.zzb;
    }

    public final Task zza() {
        return this.zzc.getTask();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        Object object;
        Object object2 = zzo.zzb(this.zza);
        synchronized (object2) {
            object = this.zza;
            boolean bl2 = zzo.zzc((zzo)object);
            int n3 = 1;
            if (!bl2) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            Preconditions.checkState(bl2);
            object = this.zza;
            zzo.zzd((zzo)object, n3);
        }
        object2 = zzo.zze(this.zza);
        object = new zzm(this, null);
        object2 = ((GoogleApi)object2).doWrite((TaskApiCall)object);
        object = this.zza;
        zzk zzk2 = new zzk(this);
        ((Task)object2).addOnFailureListener((Executor)object, (OnFailureListener)zzk2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void zzc(Exception exception) {
        Object object;
        Object object2;
        block6: {
            block5: {
                object2 = zzo.zzb(this.zza);
                // MONITORENTER : object2
                object = this.zza;
                object = zzo.zzb((zzo)object);
                object = object.peek();
                if (object != this) break block5;
                object = this.zza;
                object = zzo.zzb((zzo)object);
                object.remove();
                object = this.zza;
                zzo.zzd((zzo)object, 0);
                object = this.zza;
                object = zzo.zzb((zzo)object);
                object = object.peek();
                object = (zzn)object;
                break block6;
            }
            object = null;
        }
        // MONITOREXIT : object2
        object2 = this.zzc;
        ((TaskCompletionSource)object2).trySetException(exception);
        if (object == null) return;
        ((zzn)object).zzb();
    }
}

