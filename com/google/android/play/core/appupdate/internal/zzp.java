/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import com.google.android.play.core.appupdate.internal.zzx;

public final class zzp
implements IBinder.DeathRecipient {
    public final /* synthetic */ zzx zza;

    public /* synthetic */ zzp(zzx zzx2) {
        this.zza = zzx2;
    }

    public final void binderDied() {
        zzx.zzj(this.zza);
    }
}

