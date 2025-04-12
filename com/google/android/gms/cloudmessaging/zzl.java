/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.cloudmessaging;

import com.google.android.gms.cloudmessaging.zzp;

public final class zzl
implements Runnable {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzl(zzp zzp2) {
        this.zza = zzp2;
    }

    public final void run() {
        this.zza.zza(2, "Service disconnected");
    }
}

