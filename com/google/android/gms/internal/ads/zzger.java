/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzges;

public final class zzger
implements Runnable {
    public final /* synthetic */ zzges zza;
    public final /* synthetic */ zzgax zzb;

    public /* synthetic */ zzger(zzges zzges2, zzgax zzgax2) {
        this.zza = zzges2;
        this.zzb = zzgax2;
    }

    public final void run() {
        zzges zzges2 = this.zza;
        zzgax zzgax2 = this.zzb;
        zzges2.zzx(zzgax2);
    }
}

