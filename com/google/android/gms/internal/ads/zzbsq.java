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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbss;

public final class zzbsq
extends zzbad
implements zzbss {
    public zzbsq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void zze(String string2) {
        string2 = this.zza();
        string2.writeString("Adapter returned null.");
        this.zzdc(2, (Parcel)string2);
    }

    public final void zzf(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(3, parcel);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(1, parcel);
    }

    public final void zzh(zzbro zzbro2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbro2);
        this.zzdc(4, parcel);
    }
}

