/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrf;

public final class zzbv
extends zzbad
implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzq2, String string2, zzbrf zzbrf2, int n3, int n4) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzq2);
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbrf2);
        parcel.writeInt(241806000);
        parcel.writeInt(n4);
        iObjectWrapper = this.zzdb(2, parcel);
        zzq2 = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return zzq2;
    }
}

