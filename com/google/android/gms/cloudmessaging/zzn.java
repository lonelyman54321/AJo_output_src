/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.cloudmessaging;

import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzs;

public final class zzn
implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzs zzb;

    public /* synthetic */ zzn(zzp zzp2, zzs zzs2) {
        this.zza = zzp2;
        this.zzb = zzs2;
    }

    public final void run() {
        zzp zzp2 = this.zza;
        int n3 = this.zzb.zza;
        zzp2.zze(n3);
    }
}

