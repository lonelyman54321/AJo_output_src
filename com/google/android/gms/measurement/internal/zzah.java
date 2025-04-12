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
import com.google.android.gms.measurement.internal.zzae;

public final class zzah
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        long l2 = 0L;
        int n7 = 0;
        long l3 = l2;
        long l4 = l2;
        int n8 = 0;
        while ((n3 = object.dataPosition()) < n4) {
            n3 = SafeParcelReader.readHeader(object);
            int n10 = SafeParcelReader.getFieldId(n3);
            if (n10 != (n7 = 1)) {
                n7 = 2;
                if (n10 != n7) {
                    n7 = 3;
                    if (n10 != n7) {
                        SafeParcelReader.skipUnknownField(object, n3);
                        continue;
                    }
                    l4 = SafeParcelReader.readLong(object, n3);
                    continue;
                }
                n8 = SafeParcelReader.readInt(object, n3);
                continue;
            }
            l3 = SafeParcelReader.readLong(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzae(l3, n8, l4);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzae[n3];
    }
}

