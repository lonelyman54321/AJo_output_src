/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarp;

final class zzarc
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzare zzc;

    public zzarc(zzare zzare2, String string2, long l2) {
        this.zza = string2;
        this.zzb = l2;
        this.zzc = zzare2;
    }

    public final void run() {
        Object object = zzare.zzi(this.zzc);
        Object object2 = this.zza;
        long l2 = this.zzb;
        ((zzarp)object).zza((String)object2, l2);
        object = this.zzc;
        object2 = zzare.zzi((zzare)object);
        object = ((zzare)object).toString();
        ((zzarp)object2).zzb((String)object);
    }
}

