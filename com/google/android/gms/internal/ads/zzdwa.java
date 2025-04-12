/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzczl;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdag;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdvo;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflu;
import java.util.Collections;
import java.util.List;

public final class zzdwa
implements AppEventListener,
zzdcg,
zza,
zzczl,
zzdaf,
zzdag,
zzdaz,
zzczo,
zzflu {
    private final List zza;
    private final zzdvo zzb;
    private long zzc;

    public zzdwa(zzdvo object, zzcjd zzcjd2) {
        this.zzb = object;
        this.zza = object = Collections.singletonList(zzcjd2);
    }

    private final void zzg(Class object, String string2, Object ... objectArray) {
        object = ((Class)object).getSimpleName();
        zzdvo zzdvo2 = this.zzb;
        List list = this.zza;
        object = "Event-".concat((String)object);
        zzdvo2.zza(list, (String)object, string2, objectArray);
    }

    public final void onAdClicked() {
        Object[] objectArray = new Object[]{};
        this.zzg(zza.class, "onAdClicked", objectArray);
    }

    public final void onAppEvent(String string2, String string3) {
        Object[] objectArray = new Object[]{string2, string3};
        this.zzg(AppEventListener.class, "onAppEvent", objectArray);
    }

    public final void zza() {
        Object[] objectArray = new Object[]{};
        this.zzg(zzczl.class, "onAdClosed", objectArray);
    }

    public final void zzb() {
        Object[] objectArray = new Object[]{};
        this.zzg(zzczl.class, "onAdLeftApplication", objectArray);
    }

    public final void zzc() {
        Object[] objectArray = new Object[]{};
        this.zzg(zzczl.class, "onAdOpened", objectArray);
    }

    public final void zzd(zzfln objectArray, String string2) {
        objectArray = new Object[]{string2};
        this.zzg(zzflm.class, "onTaskSucceeded", objectArray);
    }

    public final void zzdB(com.google.android.gms.ads.internal.client.zze object) {
        Integer n3 = ((com.google.android.gms.ads.internal.client.zze)object).zza;
        String string2 = ((com.google.android.gms.ads.internal.client.zze)object).zzb;
        object = ((com.google.android.gms.ads.internal.client.zze)object).zzc;
        Object[] objectArray = new Object[]{n3, string2, object};
        this.zzg(zzczo.class, "onAdFailedToLoad", objectArray);
    }

    public final void zzdC(zzfln objectArray, String string2) {
        objectArray = new Object[]{string2};
        this.zzg(zzflm.class, "onTaskCreated", objectArray);
    }

    public final void zzdD(zzfln object, String string2, Throwable objectArray) {
        object = objectArray.getClass().getSimpleName();
        objectArray = new Object[]{string2, object};
        this.zzg(zzflm.class, "onTaskFailed", objectArray);
    }

    public final void zzdE(zzfln objectArray, String string2) {
        objectArray = new Object[]{string2};
        this.zzg(zzflm.class, "onTaskStarted", objectArray);
    }

    public final void zzdj(Context context) {
        Object[] objectArray = new Object[]{context};
        this.zzg(zzdag.class, "onDestroy", objectArray);
    }

    public final void zzdl(Context context) {
        Object[] objectArray = new Object[]{context};
        this.zzg(zzdag.class, "onPause", objectArray);
    }

    public final void zzdm(Context context) {
        Object[] objectArray = new Object[]{context};
        this.zzg(zzdag.class, "onResume", objectArray);
    }

    public final void zzdn(zzbxu objectArray) {
        long l2;
        this.zzc = l2 = zzu.zzB().elapsedRealtime();
        objectArray = new Object[]{};
        this.zzg(zzdcg.class, "onAdRequest", objectArray);
    }

    public final void zzdo(zzfhf zzfhf2) {
    }

    public final void zzds(zzbyh zzbyh2, String string2, String string3) {
        Object[] objectArray = new Object[]{zzbyh2, string2, string3};
        this.zzg(zzczl.class, "onRewarded", objectArray);
    }

    public final void zze() {
        Object[] objectArray = new Object[]{};
        this.zzg(zzczl.class, "onRewardedVideoCompleted", objectArray);
    }

    public final void zzf() {
        Object[] objectArray = new Object[]{};
        this.zzg(zzczl.class, "onRewardedVideoStarted", objectArray);
    }

    public final void zzr() {
        Object[] objectArray = new Object[]{};
        this.zzg(zzdaf.class, "onAdImpression", objectArray);
    }

    public final void zzs() {
        long l2 = zzu.zzB().elapsedRealtime();
        long l3 = this.zzc;
        StringBuilder stringBuilder = new StringBuilder("Ad Request Latency : ");
        stringBuilder.append(l2 -= l3);
        zze.zza(stringBuilder.toString());
        Object[] objectArray = new Object[]{};
        this.zzg(zzdaz.class, "onAdLoaded", objectArray);
    }
}

