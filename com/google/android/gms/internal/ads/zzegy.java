/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfoj;

public final class zzegy
implements Runnable {
    public final /* synthetic */ zzfoj zza;

    public /* synthetic */ zzegy(zzfoj zzfoj2) {
        this.zza = zzfoj2;
    }

    public final void run() {
        Object object = zzbep.zzeZ;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = zzfoh.zzb())) {
            object = this.zza;
            ((zzfoj)object).zzc();
        }
    }
}

