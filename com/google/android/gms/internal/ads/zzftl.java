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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzftn;

public final class zzftl
extends zzbad
implements zzftn {
    public zzftl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final void zze(IObjectWrapper iObjectWrapper, String string2, String string3) {
        string3 = this.zza();
        zzbaf.zzf((Parcel)string3, iObjectWrapper);
        string3.writeString(string2);
        string3.writeString(null);
        this.zzdc(8, (Parcel)string3);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(3, parcel);
    }

    public final void zzg(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(7, parcel);
    }

    public final void zzh(int[] object) {
        object = this.zza();
        object.writeIntArray(null);
        this.zzdc(4, (Parcel)object);
    }

    public final void zzi(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(6, parcel);
    }

    public final void zzj(byte[] byArray) {
        Parcel parcel = this.zza();
        parcel.writeByteArray(byArray);
        this.zzdc(5, parcel);
    }
}

