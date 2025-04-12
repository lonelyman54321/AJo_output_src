/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzejc
implements Runnable {
    public final /* synthetic */ zzejf zza;
    public final /* synthetic */ zzfhf zzb;
    public final /* synthetic */ zzfgt zzc;

    public /* synthetic */ zzejc(zzejf zzejf2, zzfhf zzfhf2, zzfgt zzfgt2) {
        this.zza = zzejf2;
        this.zzb = zzfhf2;
        this.zzc = zzfgt2;
    }

    public final void run() {
        zzejf zzejf2 = this.zza;
        zzfhf zzfhf2 = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        zzejf2.zzf(zzfhf2, zzfgt2);
    }
}

