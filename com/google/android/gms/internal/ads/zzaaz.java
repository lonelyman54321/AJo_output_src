/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaba;
import com.google.android.gms.internal.ads.zzack;

public final class zzaaz
implements Runnable {
    public final /* synthetic */ zzaba zza;
    public final /* synthetic */ zzack zzb;

    public /* synthetic */ zzaaz(zzaba zzaba2, zzack zzack2) {
        this.zza = zzaba2;
        this.zzb = zzack2;
    }

    public final void run() {
        zzack zzack2 = this.zzb;
        zzaba zzaba2 = this.zza;
        zzack2.zza(zzaba2);
    }
}

