/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzq
extends zza
implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String string2, int n3, IObjectWrapper iObjectWrapper2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        zzc.zze(parcel, iObjectWrapper2);
        return ak3_1.a(this.zzB(2, parcel));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String string2, int n3, IObjectWrapper iObjectWrapper2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        zzc.zze(parcel, iObjectWrapper2);
        return ak3_1.a(this.zzB(3, parcel));
    }
}

