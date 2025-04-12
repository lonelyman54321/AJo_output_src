/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzfsn;
import com.google.android.gms.internal.ads.zzfsq;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzfsz;
import com.google.android.gms.internal.ads.zzftb;

public final class zzfsu
extends zzbad
implements IInterface {
    public zzfsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfss zze(zzfsq zzfsq2) {
        Object object = this.zza();
        zzbaf.zzd(object, zzfsq2);
        zzfsq2 = this.zzdb(1, (Parcel)object);
        object = zzfss.CREATOR;
        object = (zzfss)zzbaf.zza((Parcel)zzfsq2, (Parcelable.Creator)object);
        zzfsq2.recycle();
        return object;
    }

    public final zzftb zzf(zzfsz zzfsz2) {
        Object object = this.zza();
        zzbaf.zzd(object, zzfsz2);
        zzfsz2 = this.zzdb(3, (Parcel)object);
        object = zzftb.CREATOR;
        object = (zzftb)zzbaf.zza((Parcel)zzfsz2, (Parcelable.Creator)object);
        zzfsz2.recycle();
        return object;
    }

    public final void zzg(zzfsn zzfsn2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzfsn2);
        this.zzdc(2, parcel);
    }
}

