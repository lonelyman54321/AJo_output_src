/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzer;
import com.google.android.gms.ads.internal.client.zzes;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;

final class zzet
extends zzbm {
    final /* synthetic */ zzeu zza;

    public /* synthetic */ zzet(zzeu zzeu2, zzes zzes2) {
        this.zza = zzeu2;
    }

    public final String zze() {
        return null;
    }

    public final String zzf() {
        return null;
    }

    public final void zzg(zzl zzl2) {
        this.zzh(zzl2, 1);
    }

    public final void zzh(zzl zzl2, int n3) {
        zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzl2 = zzf.zza;
        zzer zzer2 = new zzer(this);
        zzl2.post(zzer2);
    }

    public final boolean zzi() {
        return false;
    }
}

