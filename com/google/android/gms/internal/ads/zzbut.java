/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomFormatAdLoadedListener;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbuu;

public final class zzbut {
    private final NativeCustomFormatAd$OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd$OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbut(NativeCustomFormatAd$OnCustomFormatAdLoadedListener nativeCustomFormatAd$OnCustomFormatAdLoadedListener, NativeCustomFormatAd$OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener) {
        this.zza = nativeCustomFormatAd$OnCustomFormatAdLoadedListener;
        this.zzb = nativeCustomFormatAd$OnCustomClickListener;
    }

    public static /* bridge */ /* synthetic */ NativeCustomFormatAd$OnCustomClickListener zzc(zzbut zzbut2) {
        return zzbut2.zzb;
    }

    public static /* bridge */ /* synthetic */ NativeCustomFormatAd$OnCustomFormatAdLoadedListener zzd(zzbut zzbut2) {
        return zzbut2.zza;
    }

    public static /* bridge */ /* synthetic */ NativeCustomFormatAd zze(zzbut zzbut2, zzbip zzbip2) {
        return zzbut2.zzf(zzbip2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final NativeCustomFormatAd zzf(zzbip zzbip2) {
        synchronized (this) {
            NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
            if (nativeCustomFormatAd != null) {
                return nativeCustomFormatAd;
            }
            this.zzc = nativeCustomFormatAd = new zzbuu(zzbip2);
            return nativeCustomFormatAd;
        }
    }

    public final zzbiz zza() {
        Object object = this.zzb;
        if (object == null) {
            return null;
        }
        object = new zzbuq(this, null);
        return object;
    }

    public final zzbjc zzb() {
        zzbus zzbus2 = new zzbus(this, null);
        return zzbus2;
    }
}

