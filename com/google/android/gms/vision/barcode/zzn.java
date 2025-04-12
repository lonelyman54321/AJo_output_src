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
import com.google.android.gms.vision.barcode.Barcode$UrlBookmark;

public final class zzn
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        String string2 = null;
        String string3 = null;
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
                string3 = SafeParcelReader.createString(object, n3);
                continue;
            }
            string2 = SafeParcelReader.createString(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new Barcode$UrlBookmark(string2, string3);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Barcode$UrlBookmark[n3];
    }
}

