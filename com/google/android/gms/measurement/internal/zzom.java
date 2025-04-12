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
import com.google.android.gms.measurement.internal.zzon;

public final class zzom
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n3;
        long l2;
        Object object = parcel;
        int n4 = SafeParcelReader.validateObjectHeader(parcel);
        long l3 = l2 = 0L;
        long l4 = l2;
        byte[] byArray = null;
        String string2 = null;
        Bundle bundle = null;
        String string3 = null;
        int n7 = 0;
        block9: while ((n3 = parcel.dataPosition()) < n4) {
            n3 = SafeParcelReader.readHeader(parcel);
            int n8 = SafeParcelReader.getFieldId(n3);
            switch (n8) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n3);
                    continue block9;
                }
                case 7: {
                    string3 = SafeParcelReader.createString(object, n3);
                    continue block9;
                }
                case 6: {
                    l4 = SafeParcelReader.readLong(object, n3);
                    continue block9;
                }
                case 5: {
                    n7 = SafeParcelReader.readInt(object, n3);
                    continue block9;
                }
                case 4: {
                    bundle = SafeParcelReader.createBundle(object, n3);
                    continue block9;
                }
                case 3: {
                    string2 = SafeParcelReader.createString(object, n3);
                    continue block9;
                }
                case 2: {
                    byArray = SafeParcelReader.createByteArray(object, n3);
                    continue block9;
                }
                case 1: 
            }
            l3 = SafeParcelReader.readLong(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzon(l3, byArray, string2, bundle, n7, l4, string3);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzon[n3];
    }
}

