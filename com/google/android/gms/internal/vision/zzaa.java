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
import com.google.android.gms.internal.vision.zzab;

public final class zzaa
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        float f5 = 0.0f;
        while ((n4 = object.dataPosition()) < n3) {
            int n16;
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            if (n7 != (n16 = 2)) {
                n16 = 3;
                if (n7 != n16) {
                    n16 = 4;
                    if (n7 != n16) {
                        n16 = 5;
                        if (n7 != n16) {
                            n16 = 6;
                            if (n7 != n16) {
                                SafeParcelReader.skipUnknownField(object, n4);
                                continue;
                            }
                            f5 = SafeParcelReader.readFloat(object, n4);
                            continue;
                        }
                        n15 = SafeParcelReader.readInt(object, n4);
                        continue;
                    }
                    n14 = SafeParcelReader.readInt(object, n4);
                    continue;
                }
                n10 = SafeParcelReader.readInt(object, n4);
                continue;
            }
            n8 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzab(n8, n10, n14, n15, f5);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzab[n3];
    }
}

