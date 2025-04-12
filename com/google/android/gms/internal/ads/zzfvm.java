/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzfvo;
import com.google.android.gms.internal.ads.zzfvq;

public final class zzfvm
extends zzbad
implements zzfvo {
    public zzfvm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(Bundle bundle, zzfvq zzfvq2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        zzbaf.zzf(parcel, zzfvq2);
        this.zzdd(2, parcel);
    }

    public final void zzf(String string2, Bundle bundle, zzfvq zzfvq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzbaf.zzd(parcel, (Parcelable)bundle);
        zzbaf.zzf(parcel, zzfvq2);
        this.zzdd(1, parcel);
    }

    public final void zzg(Bundle bundle, zzfvq zzfvq2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, (Parcelable)bundle);
        zzbaf.zzf(parcel, zzfvq2);
        this.zzdd(3, parcel);
    }
}

