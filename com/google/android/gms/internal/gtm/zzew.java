/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzfa;

public final class zzew
implements Runnable {
    public final /* synthetic */ zzfa zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzeo zzc;

    public /* synthetic */ zzew(zzfa zzfa2, int n3, zzeo zzeo2) {
        this.zza = zzfa2;
        this.zzb = n3;
        this.zzc = zzeo2;
    }

    public final void run() {
        zzfa zzfa2 = this.zza;
        int n3 = this.zzb;
        zzeo zzeo2 = this.zzc;
        zzfa2.zzc(n3, zzeo2);
    }
}

