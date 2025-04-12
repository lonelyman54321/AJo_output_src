/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzdmt;

public final class zzdmq
implements Runnable {
    public final /* synthetic */ zzdmt zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdmq(zzdmt zzdmt2, ViewGroup viewGroup) {
        this.zza = zzdmt2;
        this.zzb = viewGroup;
    }

    public final void run() {
        zzdmt zzdmt2 = this.zza;
        ViewGroup viewGroup = this.zzb;
        zzdmt2.zza(viewGroup);
    }
}

