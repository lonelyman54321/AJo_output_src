/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

public final class zzm
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        int n7 = 0;
        int n8 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while ((n3 = object.dataPosition()) < n4) {
            int n10;
            n3 = SafeParcelReader.readHeader(object);
            int n14 = SafeParcelReader.getFieldId(n3);
            if (n14 != (n10 = 1)) {
                n10 = 2;
                if (n14 != n10) {
                    n10 = 3;
                    if (n14 != n10) {
                        n10 = 4;
                        if (n14 != n10) {
                            SafeParcelReader.skipUnknownField(object, n3);
                            continue;
                        }
                        n8 = SafeParcelReader.readInt(object, n3);
                        continue;
                    }
                    f6 = SafeParcelReader.readFloat(object, n3);
                    continue;
                }
                f5 = SafeParcelReader.readFloat(object, n3);
                continue;
            }
            n7 = SafeParcelReader.readInt(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new LandmarkParcel(n7, f5, f6, n8);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new LandmarkParcel[n3];
    }
}

