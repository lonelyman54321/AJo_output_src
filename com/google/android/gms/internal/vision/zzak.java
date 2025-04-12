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
import com.google.android.gms.internal.vision.zzal;

public final class zzak
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        while ((n3 = object.dataPosition()) < n4) {
            n3 = SafeParcelReader.readHeader(object);
            SafeParcelReader.getFieldId(n3);
            SafeParcelReader.skipUnknownField(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzal();
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzal[n3];
    }
}

