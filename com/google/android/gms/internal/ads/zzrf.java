/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzsf;

public final class zzrf
implements Runnable {
    public final /* synthetic */ zzqs zza;
    public final /* synthetic */ zzqp zzb;

    public /* synthetic */ zzrf(zzqs zzqs2, zzqp zzqp2) {
        this.zza = zzqs2;
        this.zzb = zzqp2;
    }

    public final void run() {
        zzqn zzqn2 = zzsf.zzae(((zzse)this.zza).zza);
        zzqp zzqp2 = this.zzb;
        zzqn2.zzd(zzqp2);
    }
}

