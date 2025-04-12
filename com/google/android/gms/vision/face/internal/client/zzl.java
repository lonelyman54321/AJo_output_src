/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.vision.zza;
import com.google.android.gms.internal.vision.zzd;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.gms.vision.face.internal.client.zzi;
import com.google.android.gms.vision.face.internal.client.zzk;

public abstract class zzl
extends zza
implements zzi {
    public zzl() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static zzi asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        boolean bl2 = iInterface instanceof zzi;
        if (bl2) {
            return (zzi)iInterface;
        }
        iInterface = new zzk(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel object, Parcel parcel, int n4) {
        n4 = 1;
        if (n3 == n4) {
            Object object2 = IObjectWrapper$Stub.asInterface(object.readStrongBinder());
            Parcelable.Creator creator = zzf.CREATOR;
            object = (zzf)zzd.zza(object, creator);
            object2 = this.newFaceDetector((IObjectWrapper)object2, (zzf)object);
            parcel.writeNoException();
            zzd.zza(parcel, object2);
            return n4 != 0;
        }
        return false;
    }
}

