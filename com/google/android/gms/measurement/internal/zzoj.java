/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzog;

public final class zzoj
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        String string2 = null;
        long l2 = 0L;
        int n7 = 0;
        while ((n3 = object.dataPosition()) < n4) {
            int n8;
            n3 = SafeParcelReader.readHeader(object);
            int n10 = SafeParcelReader.getFieldId(n3);
            if (n10 != (n8 = 1)) {
                n8 = 2;
                if (n10 != n8) {
                    n8 = 3;
                    if (n10 != n8) {
                        SafeParcelReader.skipUnknownField(object, n3);
                        continue;
                    }
                    n7 = SafeParcelReader.readInt(object, n3);
                    continue;
                }
                l2 = SafeParcelReader.readLong(object, n3);
                continue;
            }
            string2 = SafeParcelReader.createString(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzog(string2, l2, n7);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzog[n3];
    }
}

