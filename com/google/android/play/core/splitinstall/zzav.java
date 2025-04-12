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

final class zzav
extends zzbb {
    public zzav(zzbc zzbc2, TaskCompletionSource taskCompletionSource) {
        super(zzbc2, taskCompletionSource);
    }

    public final void zzd(Bundle bundle) {
        super.zzd(bundle);
        this.zza.trySetResult(null);
    }
}

