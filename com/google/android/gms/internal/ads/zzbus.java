/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomFormatAdLoadedListener;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbur;
import com.google.android.gms.internal.ads.zzbut;

final class zzbus
extends zzbjb {
    final /* synthetic */ zzbut zza;

    public /* synthetic */ zzbus(zzbut zzbut2, zzbur zzbur2) {
        this.zza = zzbut2;
    }

    public final void zze(zzbip object) {
        zzbut zzbut2 = this.zza;
        NativeCustomFormatAd$OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener = zzbut.zzd(zzbut2);
        object = zzbut.zze(zzbut2, (zzbip)object);
        nativeCustomFormatAd$OnCustomFormatAdLoadedListener.onCustomFormatAdLoaded((NativeCustomFormatAd)object);
    }
}

