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
import com.google.android.gms.measurement.internal.zzon;
import com.google.android.gms.measurement.internal.zzor;
import java.util.List;

public final class zzoq
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Object object2 = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 1)) {
                SafeParcelReader.skipUnknownField(object, n3);
                continue;
            }
            object2 = zzon.CREATOR;
            object2 = SafeParcelReader.createTypedList(object, n3, object2);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzor((List)object2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzor[n3];
    }
}

