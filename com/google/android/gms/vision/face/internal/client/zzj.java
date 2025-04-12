/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzd;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.zzh;

public final class zzj
extends zzb
implements zzh {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void zza() {
        Parcel parcel = this.a_();
        this.zzb(3, parcel);
    }

    public final boolean zza(int n3) {
        Parcel parcel = this.a_();
        parcel.writeInt(n3);
        Parcel parcel2 = this.zza(2, parcel);
        boolean bl2 = zzd.zza(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper, IObjectWrapper faceParcelArray, IObjectWrapper iObjectWrapper2, int n3, int n4, int n7, int n8, int n10, int n14, zzs zzs2) {
        Parcel parcel = this.a_();
        zzd.zza(parcel, iObjectWrapper);
        zzd.zza(parcel, (IInterface)faceParcelArray);
        zzd.zza(parcel, iObjectWrapper2);
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeInt(n7);
        parcel.writeInt(n8);
        parcel.writeInt(n10);
        parcel.writeInt(n14);
        zzd.zza(parcel, zzs2);
        iObjectWrapper = this.zza(4, parcel);
        faceParcelArray = FaceParcel.CREATOR;
        faceParcelArray = (FaceParcel[])iObjectWrapper.createTypedArray((Parcelable.Creator)faceParcelArray);
        iObjectWrapper.recycle();
        return faceParcelArray;
    }

    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper, zzs faceParcelArray) {
        Parcel parcel = this.a_();
        zzd.zza(parcel, iObjectWrapper);
        zzd.zza(parcel, (Parcelable)faceParcelArray);
        iObjectWrapper = this.zza(1, parcel);
        faceParcelArray = FaceParcel.CREATOR;
        faceParcelArray = (FaceParcel[])iObjectWrapper.createTypedArray((Parcelable.Creator)faceParcelArray);
        iObjectWrapper.recycle();
        return faceParcelArray;
    }
}

