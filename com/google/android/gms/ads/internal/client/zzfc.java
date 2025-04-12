/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzo;

public final class zzfc
extends zzbyz {
    private static void zzr(zzbzh zzbzh2) {
        zzm.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        Handler handler = zzf.zza;
        zzfb zzfb2 = new zzfb(zzbzh2);
        handler.post((Runnable)zzfb2);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final zzdn zzc() {
        return null;
    }

    public final zzbyx zzd() {
        return null;
    }

    public final String zze() {
        return "";
    }

    public final void zzf(zzl zzl2, zzbzh zzbzh2) {
        zzfc.zzr(zzbzh2);
    }

    public final void zzg(zzl zzl2, zzbzh zzbzh2) {
        zzfc.zzr(zzbzh2);
    }

    public final void zzh(boolean bl2) {
    }

    public final void zzi(zzdd zzdd2) {
    }

    public final void zzj(zzdg zzdg2) {
    }

    public final void zzk(zzbzd zzbzd2) {
    }

    public final void zzl(zzbzo zzbzo2) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean bl2) {
    }

    public final boolean zzo() {
        return false;
    }

    public final void zzp(zzbzi zzbzi2) {
    }
}

