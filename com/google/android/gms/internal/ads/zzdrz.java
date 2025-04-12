/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzciv;

public final class zzdrz
implements zzban {
    public final /* synthetic */ zzchd zza;

    public /* synthetic */ zzdrz(zzchd zzchd2) {
        this.zza = zzchd2;
    }

    public final void zzdp(zzbam zzbam2) {
        zzciv zzciv2 = this.zza.zzN();
        zzbam2 = zzbam2.zzd;
        int n3 = ((Rect)zzbam2).left;
        int n4 = ((Rect)zzbam2).top;
        zzciv2.zzq(n3, n4, false);
    }
}

