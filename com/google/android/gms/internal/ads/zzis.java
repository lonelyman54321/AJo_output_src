/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzit;
import com.google.android.gms.internal.ads.zziv;

public final class zzis
implements Runnable {
    public final /* synthetic */ zzit zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzis(zzit zzit2, int n3) {
        this.zza = zzit2;
        this.zzb = n3;
    }

    public final void run() {
        zziv zziv2 = this.zza.zza;
        int n3 = this.zzb;
        zziv.zzc(zziv2, n3);
    }
}

