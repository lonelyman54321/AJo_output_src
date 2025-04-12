/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class zzfvi
implements OnCompleteListener {
    public final /* synthetic */ zzfvj zza;

    public /* synthetic */ zzfvi(zzfvj zzfvj2) {
        this.zza = zzfvj2;
    }

    public final void onComplete(Task object) {
        zzfvj zzfvj2 = this.zza;
        boolean bl2 = ((Task)object).isCanceled();
        if (bl2) {
            zzfvj2.cancel(false);
            return;
        }
        bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            object = ((Task)object).getResult();
            zzfvj2.zzc(object);
            return;
        }
        if ((object = ((Task)object).getException()) != null) {
            zzfvj2.zzd((Throwable)object);
            return;
        }
        object = new IllegalStateException();
        throw object;
    }
}

