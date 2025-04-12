/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode$CalendarDateTime;
import com.google.android.gms.vision.barcode.Barcode$CalendarEvent;

public final class zzf
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        Object object2;
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        Parcelable parcelable = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        Parcelable parcelable2 = null;
        Parcelable parcelable3 = null;
        block9: while ((n4 = object.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(object);
            int n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block9;
                }
                case 8: {
                    object2 = Barcode$CalendarDateTime.CREATOR;
                    parcelable3 = parcelable = SafeParcelReader.createParcelable(object, n4, (Parcelable.Creator)object2);
                    parcelable3 = (Barcode$CalendarDateTime)parcelable;
                    continue block9;
                }
                case 7: {
                    object2 = Barcode$CalendarDateTime.CREATOR;
                    parcelable2 = parcelable = SafeParcelReader.createParcelable(object, n4, (Parcelable.Creator)object2);
                    parcelable2 = (Barcode$CalendarDateTime)parcelable;
                    continue block9;
                }
                case 6: {
                    string6 = SafeParcelReader.createString(object, n4);
                    continue block9;
                }
                case 5: {
                    string5 = SafeParcelReader.createString(object, n4);
                    continue block9;
                }
                case 4: {
                    string4 = SafeParcelReader.createString(object, n4);
                    continue block9;
                }
                case 3: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block9;
                }
                case 2: 
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object2 = object;
        object = new Barcode$CalendarEvent(string2, string3, string4, string5, string6, (Barcode$CalendarDateTime)parcelable2, (Barcode$CalendarDateTime)parcelable3);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Barcode$CalendarEvent[n3];
    }
}

