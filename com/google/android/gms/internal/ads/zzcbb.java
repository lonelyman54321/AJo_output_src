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
import com.google.android.gms.internal.ads.zzcbd;

public final class zzcbb
extends zzbad
implements zzcbd {
    public zzcbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final void zzb(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(2, parcel);
    }

    public final void zzc(String string2, String string3, Bundle bundle) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, (Parcelable)bundle);
        this.zzdc(3, parcel);
    }
}

