/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzfz;

public final class zzfy
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        long l2;
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        long l3 = l2 = 0L;
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        while ((n4 = object.dataPosition()) < n3) {
            int n15;
            n4 = SafeParcelReader.readHeader(object);
            int n16 = SafeParcelReader.getFieldId(n4);
            if (n16 != (n15 = 1)) {
                n15 = 2;
                if (n16 != n15) {
                    n15 = 3;
                    if (n16 != n15) {
                        n15 = 4;
                        if (n16 != n15) {
                            n15 = 5;
                            if (n16 != n15) {
                                SafeParcelReader.skipUnknownField(object, n4);
                                continue;
                            }
                            l3 = SafeParcelReader.readLong(object, n4);
                            continue;
                        }
                        n14 = SafeParcelReader.readInt(object, n4);
                        continue;
                    }
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue;
                }
                n8 = SafeParcelReader.readInt(object, n4);
                continue;
            }
            n7 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzfz(n7, n8, n10, n14, l3);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzfz[n3];
    }
}

