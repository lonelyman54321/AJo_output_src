/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzt;

public abstract class zzs
extends zzb
implements zzt {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static zzt zzb(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        boolean bl2 = iInterface instanceof zzt;
        if (bl2) {
            return (zzt)iInterface;
        }
        iInterface = new zzr(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Object object = DeviceOrientation.CREATOR;
            object = (DeviceOrientation)zzc.zza(parcel, object);
            zzc.zzd(parcel);
            this.zzd((DeviceOrientation)object);
            return n7;
        }
        return false;
    }
}

