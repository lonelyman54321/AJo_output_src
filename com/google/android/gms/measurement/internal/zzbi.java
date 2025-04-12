/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzbg;

public final class zzbi
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Bundle bundle = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 2)) {
                SafeParcelReader.skipUnknownField(object, n3);
                continue;
            }
            bundle = SafeParcelReader.createBundle(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzbg(bundle);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzbg[n3];
    }
}

