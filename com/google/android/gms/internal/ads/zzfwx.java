/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfxg;

public final class zzfwx
implements IBinder.DeathRecipient {
    public final /* synthetic */ zzfxg zza;

    public /* synthetic */ zzfwx(zzfxg zzfxg2) {
        this.zza = zzfxg2;
    }

    public final void binderDied() {
        zzfxg.zzj(this.zza);
    }
}

