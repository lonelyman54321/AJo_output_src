/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzdz;

public final class zzec
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n3;
        long l2;
        Object object = parcel;
        int n4 = SafeParcelReader.validateObjectHeader(parcel);
        long l3 = l2 = 0L;
        long l4 = l2;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        Bundle bundle = null;
        String string5 = null;
        boolean bl2 = false;
        block10: while ((n3 = parcel.dataPosition()) < n4) {
            n3 = SafeParcelReader.readHeader(parcel);
            int n7 = SafeParcelReader.getFieldId(n3);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n3);
                    continue block10;
                }
                case 8: {
                    string5 = SafeParcelReader.createString(object, n3);
                    continue block10;
                }
                case 7: {
                    bundle = SafeParcelReader.createBundle(object, n3);
                    continue block10;
                }
                case 6: {
                    string4 = SafeParcelReader.createString(object, n3);
                    continue block10;
                }
                case 5: {
                    string3 = SafeParcelReader.createString(object, n3);
                    continue block10;
                }
                case 4: {
                    string2 = SafeParcelReader.createString(object, n3);
                    continue block10;
                }
                case 3: {
                    bl2 = SafeParcelReader.readBoolean(object, n3);
                    continue block10;
                }
                case 2: {
                    l4 = SafeParcelReader.readLong(object, n3);
                    continue block10;
                }
                case 1: 
            }
            l3 = SafeParcelReader.readLong(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzdz(l3, l4, bl2, string2, string3, string4, bundle, string5);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzdz[n3];
    }
}

