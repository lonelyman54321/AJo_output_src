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
import com.google.android.gms.tagmanager.zzce;
import com.google.android.gms.tagmanager.zzch;
import com.google.android.gms.tagmanager.zzck;
import java.util.Map;

public final class zzci
extends zzar
implements zzck {
    public zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    public final Map zzb() {
        Object object = this.zza();
        Parcel parcel = this.zzk(11, (Parcel)object);
        object = zzat.zzb(parcel);
        parcel.recycle();
        return object;
    }

    public final void zzc(String string2, String string3, Bundle bundle, long l2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzat.zzd(parcel, (Parcelable)bundle);
        parcel.writeLong(l2);
        this.zzl(2, parcel);
    }

    public final void zzd(zzce zzce2) {
        Parcel parcel = this.zza();
        zzat.zze(parcel, zzce2);
        this.zzl(22, parcel);
    }

    public final void zze(zzch zzch2) {
        Parcel parcel = this.zza();
        zzat.zze(parcel, zzch2);
        this.zzl(21, parcel);
    }
}

