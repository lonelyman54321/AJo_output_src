/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.zzo;
import com.google.android.play.core.appupdate.zzr;
import com.google.android.play.core.install.InstallException;

final class zzp
extends zzo {
    public zzp(zzr zzr2, TaskCompletionSource taskCompletionSource) {
        zzm zzm2 = new zzm("OnCompleteUpdateCallback");
        super(zzr2, zzm2, taskCompletionSource);
    }

    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        int n3 = zzr.zza(bundle);
        if (n3 != 0) {
            TaskCompletionSource taskCompletionSource = this.zzb;
            int n4 = zzr.zza(bundle);
            InstallException installException = new InstallException(n4);
            taskCompletionSource.trySetException(installException);
            return;
        }
        this.zzb.trySetResult(null);
    }
}

