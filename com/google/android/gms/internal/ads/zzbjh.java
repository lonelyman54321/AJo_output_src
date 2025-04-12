/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjs;

public final class zzbjh
extends zzbad
implements zzbjj {
    public zzbjh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbjs zzbjs2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbjs2);
        this.zzdc(1, parcel);
    }
}

