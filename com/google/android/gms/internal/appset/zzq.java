/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.appset;

import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzq
implements Continuation {
    public final /* synthetic */ zzr zza;

    public /* synthetic */ zzq(zzr zzr2) {
        this.zza = zzr2;
    }

    public final Object then(Task task2) {
        return zzr.zza(this.zza, task2);
    }
}

