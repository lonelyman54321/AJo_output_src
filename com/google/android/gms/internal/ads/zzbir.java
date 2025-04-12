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
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbit;

public final class zzbir
extends zzbad
implements zzbit {
    public zzbir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzbik zzbik2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbik2);
        this.zzdc(1, parcel);
    }
}

