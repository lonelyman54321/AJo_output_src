/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzdyx;

final class zzdyu
extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdyx zzb;

    public zzdyu(zzdyx zzdyx2, String string2) {
        this.zza = string2;
        this.zzb = zzdyx2;
    }

    public final void onAdFailedToLoad(LoadAdError object) {
        zzdyx zzdyx2 = this.zzb;
        object = zzdyx.zzc(object);
        String string2 = this.zza;
        zzdyx.zzd(zzdyx2, (String)object, string2);
    }
}

