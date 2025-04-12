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

final class zzba
extends zzbb {
    public zzba(zzbc zzbc2, TaskCompletionSource taskCompletionSource) {
        super(zzbc2, taskCompletionSource);
    }

    public final void zzi(int n3, Bundle object) {
        super.zzi(n3, (Bundle)object);
        object = this.zza;
        Integer n4 = n3;
        ((TaskCompletionSource)object).trySetResult(n4);
    }
}

