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
import com.google.android.gms.vision.barcode.Barcode$Address;

public final class zza
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        int n7 = 0;
        String[] stringArray = null;
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
                stringArray = SafeParcelReader.createStringArray(object, n3);
                continue;
            }
            n7 = SafeParcelReader.readInt(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new Barcode$Address(n7, stringArray);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Barcode$Address[n3];
    }
}

