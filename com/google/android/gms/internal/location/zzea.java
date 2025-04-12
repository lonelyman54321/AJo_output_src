/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

final class zzea
implements OnCompleteListener {
    private final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzea(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final /* synthetic */ void onComplete(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (!bl2) {
            TaskCompletionSource taskCompletionSource = this.zza;
            object = ((Task)object).getException();
            Objects.requireNonNull(object);
            taskCompletionSource.trySetException((Exception)object);
        }
    }
}

