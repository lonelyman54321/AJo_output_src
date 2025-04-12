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
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbjc;

public final class zzbja
extends zzbad
implements zzbjc {
    public zzbja(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzbip zzbip2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbip2);
        this.zzdc(1, parcel);
    }
}

