/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.zzbb;
import com.google.android.play.core.splitinstall.zzbc;

final class zzat
extends zzbb {
    public zzat(zzbc zzbc2, TaskCompletionSource taskCompletionSource) {
        super(zzbc2, taskCompletionSource);
    }

    public final void zzb(int n3, Bundle bundle) {
        super.zzb(n3, bundle);
        this.zza.trySetResult(null);
    }
}

