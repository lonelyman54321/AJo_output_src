/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.vision.zza;
import com.google.android.gms.internal.vision.zzd;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.face.internal.client.zzh;

public abstract class zzg
extends zza
implements zzh {
    public zzg() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final boolean zza(int n3, Parcel object, Parcel parcel, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 4;
                    if (n3 != n7) {
                        return false;
                    }
                    IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(object.readStrongBinder());
                    IObjectWrapper iObjectWrapper2 = IObjectWrapper$Stub.asInterface(object.readStrongBinder());
                    IObjectWrapper iObjectWrapper3 = IObjectWrapper$Stub.asInterface(object.readStrongBinder());
                    int n8 = object.readInt();
                    int n10 = object.readInt();
                    int n14 = object.readInt();
                    int n15 = object.readInt();
                    int n16 = object.readInt();
                    int n17 = object.readInt();
                    Parcelable[] parcelableArray = zzs.CREATOR;
                    Object object2 = parcelableArray = zzd.zza(object, (Parcelable.Creator)parcelableArray);
                    object2 = (zzs)parcelableArray;
                    zzg zzg2 = this;
                    parcelableArray = this.zza(iObjectWrapper, iObjectWrapper2, iObjectWrapper3, n8, n10, n14, n15, n16, n17, (zzs)object2);
                    parcel.writeNoException();
                    parcel.writeTypedArray(parcelableArray, n4);
                } else {
                    this.zza();
                    parcel.writeNoException();
                }
            } else {
                n3 = object.readInt();
                n3 = (int)(this.zza(n3) ? 1 : 0);
                parcel.writeNoException();
                zzd.zza(parcel, n3 != 0);
            }
        } else {
            Parcelable[] parcelableArray = IObjectWrapper$Stub.asInterface(object.readStrongBinder());
            Parcelable.Creator creator = zzs.CREATOR;
            object = (zzs)zzd.zza(object, creator);
            parcelableArray = this.zza((IObjectWrapper)parcelableArray, (zzs)object);
            parcel.writeNoException();
            parcel.writeTypedArray(parcelableArray, n4);
        }
        return n4 != 0;
    }
}

