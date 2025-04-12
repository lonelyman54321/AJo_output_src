/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzar;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzch;

public final class zzcf
extends zzar
implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    public final void zze(String string2, String string3, Bundle bundle, long l2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzat.zzd(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzl(2, parcel);
    }
}

