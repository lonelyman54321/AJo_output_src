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
import com.google.android.gms.measurement.internal.zzpm;

public final class zzpl
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        int n7 = 0;
        long l2 = 0L;
        String string2 = null;
        Long l3 = null;
        Float f5 = null;
        String string3 = null;
        String string4 = null;
        Double d2 = null;
        long l4 = l2;
        int n8 = 0;
        block10: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block10;
                }
                case 8: {
                    d2 = SafeParcelReader.readDoubleObject(object, n4);
                    continue block10;
                }
                case 7: {
                    string4 = SafeParcelReader.createString(object, n4);
                    continue block10;
                }
                case 6: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block10;
                }
                case 5: {
                    f5 = SafeParcelReader.readFloatObject(object, n4);
                    continue block10;
                }
                case 4: {
                    l3 = SafeParcelReader.readLongObject(object, n4);
                    continue block10;
                }
                case 3: {
                    l4 = SafeParcelReader.readLong(object, n4);
                    continue block10;
                }
                case 2: {
                    string2 = SafeParcelReader.createString(object, n4);
                    continue block10;
                }
                case 1: 
            }
            n8 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzpm(n8, string2, l4, l3, f5, string3, string4, d2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzpm[n3];
    }
}

