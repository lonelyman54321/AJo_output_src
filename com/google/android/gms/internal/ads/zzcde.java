/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcdi;
import com.google.android.gms.internal.ads.zzcdj;

final class zzcde
implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcdi zzc;

    public zzcde(zzcdi zzcdi2, int n3, int n4) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = zzcdi2;
    }

    public final void run() {
        Object object = this.zzc;
        zzcdj zzcdj2 = zzcdi.zzi((zzcdi)object);
        if (zzcdj2 != null) {
            int n3 = this.zza;
            int n4 = this.zzb;
            object = zzcdi.zzi((zzcdi)object);
            object.zzj(n3, n4);
        }
    }
}

