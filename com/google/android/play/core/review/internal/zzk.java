/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
package com.google.android.play.core.review.internal;

import android.os.IBinder;
import com.google.android.play.core.review.internal.zzt;

public final class zzk
implements IBinder.DeathRecipient {
    public final /* synthetic */ zzt zza;

    public /* synthetic */ zzk(zzt zzt2) {
        this.zza = zzt2;
    }

    public final void binderDied() {
        zzt.zzj(this.zza);
    }
}

