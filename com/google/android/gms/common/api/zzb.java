/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzb
implements Parcelable.Creator {
    public static final ApiMetadata zza(Parcel object) {
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
            object2 = ComplianceOptions.CREATOR;
            object2 = (ComplianceOptions)SafeParcelReader.createParcelable(object, n3, object2);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new ApiMetadata((ComplianceOptions)object2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new ApiMetadata[n3];
    }
}

