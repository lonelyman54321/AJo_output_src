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
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;

public final class zzr
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object = parcel;
        int n3 = SafeParcelReader.validateObjectHeader(parcel);
        int n4 = 0;
        long l2 = 0L;
        long l3 = 0x80000000L;
        String string2 = "";
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        String string9 = null;
        Boolean bl2 = null;
        ArrayList arrayList = null;
        String string10 = null;
        String string11 = null;
        String string12 = null;
        long l4 = l2;
        long l7 = l2;
        long l8 = l2;
        long l12 = l2;
        long l14 = l2;
        long l15 = l2;
        long l16 = l2;
        long l17 = l3;
        String string13 = string2;
        String string14 = string2;
        String string15 = string2;
        String string16 = string2;
        boolean bl3 = true;
        boolean bl4 = false;
        int n7 = 0;
        boolean bl5 = true;
        boolean bl6 = false;
        boolean bl7 = false;
        int n8 = 100;
        int n10 = 0;
        int n14 = 0;
        block35: while ((n4 = parcel.dataPosition()) < n3) {
            n4 = SafeParcelReader.readHeader(parcel);
            int n15 = SafeParcelReader.getFieldId(n4);
            switch (n15) {
                default: {
                    SafeParcelReader.skipUnknownField(object, n4);
                    continue block35;
                }
                case 38: {
                    n14 = SafeParcelReader.readInt(object, n4);
                    continue block35;
                }
                case 37: {
                    l16 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 36: {
                    string16 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 35: {
                    string12 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 34: {
                    l15 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 32: {
                    n10 = SafeParcelReader.readInt(object, n4);
                    continue block35;
                }
                case 31: {
                    string15 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 30: {
                    n8 = SafeParcelReader.readInt(object, n4);
                    continue block35;
                }
                case 29: {
                    l14 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 28: {
                    bl7 = SafeParcelReader.readBoolean(object, n4);
                    continue block35;
                }
                case 27: {
                    string11 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 26: {
                    string14 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 25: {
                    string13 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 24: {
                    string10 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 23: {
                    arrayList = SafeParcelReader.createStringList(object, n4);
                    continue block35;
                }
                case 22: {
                    l12 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 21: {
                    bl2 = SafeParcelReader.readBooleanObject(object, n4);
                    continue block35;
                }
                case 19: {
                    string9 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 18: {
                    bl6 = SafeParcelReader.readBoolean(object, n4);
                    continue block35;
                }
                case 16: {
                    bl5 = SafeParcelReader.readBoolean(object, n4);
                    continue block35;
                }
                case 15: {
                    n7 = SafeParcelReader.readInt(object, n4);
                    continue block35;
                }
                case 14: {
                    l8 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 12: {
                    string8 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 11: {
                    l17 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 10: {
                    bl4 = SafeParcelReader.readBoolean(object, n4);
                    continue block35;
                }
                case 9: {
                    bl3 = SafeParcelReader.readBoolean(object, n4);
                    continue block35;
                }
                case 8: {
                    string7 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 7: {
                    l7 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 6: {
                    l4 = SafeParcelReader.readLong(object, n4);
                    continue block35;
                }
                case 5: {
                    string6 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 4: {
                    string5 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 3: {
                    string4 = SafeParcelReader.createString(object, n4);
                    continue block35;
                }
                case 2: 
            }
            string3 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzp(string3, string4, string5, string6, l4, l7, string7, bl3, bl4, l17, string8, l8, n7, bl5, bl6, string9, bl2, l12, (List)arrayList, string10, string13, string14, string11, bl7, l14, n8, string15, n10, l15, string12, string16, l16, n14);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzp[n3];
    }
}

