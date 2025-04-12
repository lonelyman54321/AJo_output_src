/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbut;

final class zzbuq
extends zzbiy {
    final /* synthetic */ zzbut zza;

    public /* synthetic */ zzbuq(zzbut zzbut2, zzbup zzbup2) {
        this.zza = zzbut2;
    }

    public final void zze(zzbip object, String string2) {
        zzbut zzbut2 = this.zza;
        NativeCustomFormatAd$OnCustomClickListener nativeCustomFormatAd$OnCustomClickListener = zzbut.zzc(zzbut2);
        if (nativeCustomFormatAd$OnCustomClickListener == null) {
            return;
        }
        nativeCustomFormatAd$OnCustomClickListener = zzbut.zzc(zzbut2);
        object = zzbut.zze(zzbut2, (zzbip)object);
        nativeCustomFormatAd$OnCustomClickListener.onCustomClick((NativeCustomFormatAd)object, string2);
    }
}

