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
import com.google.android.gms.vision.barcode.Barcode$DriverLicense;

public final class zzh
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        String string9 = null;
        String string10 = null;
        String string11 = null;
        String string12 = null;
        String string13 = null;
        String string14 = null;
        String string15 = null;
        block16: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            int n7 = SafeParcelReader.getFieldId(n4);
            switch (n7) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block16;
                }
                case 15: {
                    string15 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 14: {
                    string14 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 13: {
                    string13 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 12: {
                    string12 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 11: {
                    string11 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 10: {
                    string10 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 9: {
                    string9 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 8: {
                    string8 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 7: {
                    string7 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 6: {
                    string6 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 5: {
                    string5 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 4: {
                    string4 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 3: {
                    string3 = SafeParcelReader.createString(object, n4);
                    continue block16;
                }
                case 2: 
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new Barcode$DriverLicense(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Barcode$DriverLicense[n3];
    }
}

