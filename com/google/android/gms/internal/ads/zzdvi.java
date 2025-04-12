/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.zzdvk;

public final class zzdvi
implements Runnable {
    public final /* synthetic */ zzdvk zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdvi(zzdvk zzdvk2, String string2) {
        this.zza = zzdvk2;
        this.zzb = string2;
    }

    public final void run() {
        zzr zzr2 = this.zza.zze;
        String string2 = this.zzb;
        zzr2.zza(string2);
    }
}

