/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

final class zzbq
implements Continuation {
    private final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzbq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final /* synthetic */ Object then(Task object) {
        Object object2 = zzbi.zzb;
        object2 = this.zza;
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            object = (Location)((Task)object).getResult();
            ((TaskCompletionSource)object2).trySetResult(object);
        } else {
            object = ((Task)object).getException();
            Objects.requireNonNull(object);
            ((TaskCompletionSource)object2).trySetException((Exception)object);
        }
        return null;
    }
}

