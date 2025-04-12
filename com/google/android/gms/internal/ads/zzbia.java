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
import com.google.android.gms.internal.ads.zzbic;

public final class zzbia
extends zzbad
implements zzbic {
    public zzbia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int n3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, iObjectWrapper2);
        zzbaf.zzf(parcel, iObjectWrapper3);
        parcel.writeInt(241806000);
        iObjectWrapper = this.zzdb(1, parcel);
        iObjectWrapper2 = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return iObjectWrapper2;
    }
}

