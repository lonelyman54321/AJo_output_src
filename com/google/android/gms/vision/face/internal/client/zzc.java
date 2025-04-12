/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.zza;

public final class zzc
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        PointF[] pointFArray = null;
        int n7 = 0;
        while ((n3 = object.dataPosition()) < n4) {
            int n8;
            n3 = SafeParcelReader.readHeader(object);
            int n10 = SafeParcelReader.getFieldId(n3);
            if (n10 != (n8 = 2)) {
                n8 = 3;
                if (n10 != n8) {
                    SafeParcelReader.skipUnknownField(object, n3);
                    continue;
                }
                n7 = SafeParcelReader.readInt(object, n3);
                continue;
            }
            pointFArray = PointF.CREATOR;
            pointFArray = (PointF[])SafeParcelReader.createTypedArray(object, n3, (Parcelable.Creator)pointFArray);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zza(pointFArray, n7);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zza[n3];
    }
}

