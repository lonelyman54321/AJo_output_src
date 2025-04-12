/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode$CalendarDateTime;

public final class zzd
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        int n7 = 0;
        String string2 = null;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        boolean bl2 = false;
        block10: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block10;
                }
                case 9: {
                    string2 = SafeParcelReader.createString(object, n4);
                    continue block10;
                }
                case 8: {
                    bl2 = SafeParcelReader.readBoolean(object, n4);
                    continue block10;
                }
                case 7: {
                    n17 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 6: {
                    n16 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 5: {
                    n15 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 4: {
                    n14 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 3: {
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue block10;
                }
                case 2: 
            }
            n8 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new Barcode$CalendarDateTime(n8, n10, n14, n15, n16, n17, bl2, string2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Barcode$CalendarDateTime[n3];
    }
}

