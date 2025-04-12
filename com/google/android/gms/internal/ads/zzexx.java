/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzexz;

public final class zzexx
implements Runnable {
    public final /* synthetic */ zzexz zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzexw zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzexx(zzexz zzexz2, long l2, zzexw zzexw2, Bundle bundle) {
        this.zza = zzexz2;
        this.zzb = l2;
        this.zzc = zzexw2;
        this.zzd = bundle;
    }

    public final void run() {
        zzexz zzexz2 = this.zza;
        long l2 = this.zzb;
        zzexw zzexw2 = this.zzc;
        Bundle bundle = this.zzd;
        zzexz2.zzb(l2, zzexw2, bundle);
    }
}

