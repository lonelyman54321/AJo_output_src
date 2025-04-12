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
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbrf;

public final class zzbr
extends zzbad
implements IInterface {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String string2, zzbrf zzbrf2, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbrf2);
        parcel.writeInt(241806000);
        iObjectWrapper = this.zzdb(1, parcel);
        string2 = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return string2;
    }
}

