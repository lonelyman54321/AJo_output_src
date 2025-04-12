/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfou;

public final class zzegu
implements Runnable {
    public final /* synthetic */ zzfou zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzegu(zzfou zzfou2, View view) {
        this.zza = zzfou2;
        this.zzb = view;
    }

    public final void run() {
        zzfou zzfou2 = this.zza;
        zzfoq zzfoq2 = zzfoq.zzc;
        View view = this.zzb;
        zzfou2.zze(view, zzfoq2, "Ad overlay");
    }
}

