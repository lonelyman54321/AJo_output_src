/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.phenotype.zzi;

public final class zzk
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        long l2 = 0L;
        double d2 = 0.0;
        String string2 = null;
        String string3 = null;
        byte[] byArray = null;
        long l3 = l2;
        double d5 = d2;
        boolean bl2 = false;
        int n7 = 0;
        int n8 = 0;
        block10: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            int n10 = SafeParcelReader.getFieldId(n4);
            switch (n10) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block10;
                }
                case 9: {
                    n8 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 8: {
                    n7 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 7: {
                    byArray = SafeParcelReader.createByteArray(object, n4);
                    continue block10;
                }
                case 6: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block10;
                }
                case 5: {
                    d5 = SafeParcelReader.readDouble(object, n4);
                    continue block10;
                }
                case 4: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block10;
                }
                case 3: {
                    l3 = SafeParcelReader.readLong(object, n4);
                    continue block10;
                }
                case 2: 
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzi(string2, l3, bl2, d5, string3, byArray, n7, n8);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzi[n3];
    }
}

