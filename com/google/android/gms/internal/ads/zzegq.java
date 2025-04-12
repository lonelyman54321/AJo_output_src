/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfoj;

public final class zzegq
implements Runnable {
    public final /* synthetic */ zzfoj zza;
    public final /* synthetic */ View zzb;

    public /* synthetic */ zzegq(zzfoj zzfoj2, View view) {
        this.zza = zzfoj2;
        this.zzb = view;
    }

    public final void run() {
        Object object = zzbep.zzeZ;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = zzfoh.zzb())) {
            object = this.zzb;
            object2 = this.zza;
            ((zzfoj)object2).zzd((View)object);
        }
    }
}

