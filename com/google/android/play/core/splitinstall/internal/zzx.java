/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import com.google.android.play.core.splitinstall.internal.zzaf;

public final class zzx
implements IBinder.DeathRecipient {
    public final /* synthetic */ zzaf zza;

    public /* synthetic */ zzx(zzaf zzaf2) {
        this.zza = zzaf2;
    }

    public final void binderDied() {
        zzaf.zzj(this.zza);
    }
}

