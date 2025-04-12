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

public final class zzp
extends zza
implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzB(6, parcel);
        int n3 = parcel2.readInt();
        parcel2.recycle();
        return n3;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String string2, boolean bl2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt((int)(bl2 ? 1 : 0));
        iObjectWrapper = this.zzB(3, parcel);
        int n3 = iObjectWrapper.readInt();
        iObjectWrapper.recycle();
        return n3;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String string2, boolean bl2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt((int)(bl2 ? 1 : 0));
        iObjectWrapper = this.zzB(5, parcel);
        int n3 = iObjectWrapper.readInt();
        iObjectWrapper.recycle();
        return n3;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String string2, int n3) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        return ak3_1.a(this.zzB(2, parcel));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String string2, int n3, IObjectWrapper iObjectWrapper2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        zzc.zze(parcel, iObjectWrapper2);
        return ak3_1.a(this.zzB(8, parcel));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String string2, int n3) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt(n3);
        return ak3_1.a(this.zzB(4, parcel));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String string2, boolean bl2, long l2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, iObjectWrapper);
        parcel.writeString(string2);
        parcel.writeInt((int)(bl2 ? 1 : 0));
        parcel.writeLong(l2);
        return ak3_1.a(this.zzB(7, parcel));
    }
}

