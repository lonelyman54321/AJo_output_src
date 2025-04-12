/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zzbb;
import com.google.android.play.core.splitinstall.zzbc;

final class zzay
extends zzbb {
    public zzay(zzbc zzbc2, TaskCompletionSource taskCompletionSource) {
        super(zzbc2, taskCompletionSource);
    }

    public final void zzg(int n3, Bundle object) {
        super.zzg(n3, (Bundle)object);
        TaskCompletionSource taskCompletionSource = this.zza;
        object = SplitInstallSessionState.zzd(object);
        taskCompletionSource.trySetResult(object);
    }
}

