/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzdyx;

final class zzdyq
extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdyx zzd;

    public zzdyq(zzdyx zzdyx2, String string2, AdView adView, String string3) {
        this.zza = string2;
        this.zzb = adView;
        this.zzc = string3;
        this.zzd = zzdyx2;
    }

    public final void onAdFailedToLoad(LoadAdError object) {
        zzdyx zzdyx2 = this.zzd;
        object = zzdyx.zzc(object);
        String string2 = this.zzc;
        zzdyx.zzd(zzdyx2, (String)object, string2);
    }

    public final void onAdLoaded() {
        zzdyx zzdyx2 = this.zzd;
        String string2 = this.zza;
        AdView adView = this.zzb;
        String string3 = this.zzc;
        zzdyx2.zzg(string2, (Object)adView, string3);
    }
}

