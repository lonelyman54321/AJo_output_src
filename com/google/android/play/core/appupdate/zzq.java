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

final class zzq
extends zzo {
    final /* synthetic */ zzr zzd;
    private final String zze;

    public zzq(zzr zzr2, TaskCompletionSource taskCompletionSource, String string2) {
        this.zzd = zzr2;
        zzm zzm2 = new zzm("OnRequestInstallCallback");
        super(zzr2, zzm2, taskCompletionSource);
        this.zze = string2;
    }

    public final void zzc(Bundle object) {
        super.zzc((Bundle)object);
        int n3 = zzr.zza(object);
        if (n3 != 0) {
            TaskCompletionSource taskCompletionSource = this.zzb;
            int n4 = zzr.zza(object);
            InstallException installException = new InstallException(n4);
            taskCompletionSource.trySetException(installException);
            return;
        }
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzr zzr2 = this.zzd;
        String string2 = this.zze;
        object = zzr.zzf(zzr2, object, string2);
        taskCompletionSource.trySetResult(object);
    }
}

