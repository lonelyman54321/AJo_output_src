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
import com.google.android.gms.internal.vision.zzk;

public final class zzj
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        int n7 = 0;
        boolean bl2 = false;
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
                bl2 = SafeParcelReader.readBoolean(object, n3);
                continue;
            }
            n7 = SafeParcelReader.readInt(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzk(n7, bl2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzk[n3];
    }
}

