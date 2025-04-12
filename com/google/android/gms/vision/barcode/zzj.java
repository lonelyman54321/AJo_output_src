/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode$GeoPoint;

public final class zzj
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        double d2;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        double d5 = d2 = 0.0;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 2)) {
                n7 = 3;
                if (n8 != n7) {
                    SafeParcelReader.skipUnknownField(object, n3);
                    continue;
                }
                d5 = SafeParcelReader.readDouble(object, n3);
                continue;
            }
            d2 = SafeParcelReader.readDouble(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new Barcode$GeoPoint(d2, d5);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Barcode$GeoPoint[n3];
    }
}

