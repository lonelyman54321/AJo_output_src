/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.zzn;

public final class zzo
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        Parcelable parcelable = null;
        int n7 = 0;
        Parcelable.Creator creator = null;
        String string2 = null;
        String[] stringArray = null;
        String[] stringArray2 = null;
        String[] stringArray3 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        Parcelable parcelable2 = null;
        int n8 = 0;
        block11: while ((n4 = object.dataPosition()) < n3) {
            int n10;
            n4 = SafeParcelReader.readHeader(object);
            n7 = SafeParcelReader.getFieldId(n4);
            if (n7 != (n10 = 1000)) {
                switch (n7) {
                    default: {
                        SafeParcelReader.skipUnknownField(object, n4);
                        continue block11;
                    }
                    case 9: {
                        creator = PlusCommonExtras.CREATOR;
                        parcelable2 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                        parcelable2 = (PlusCommonExtras)parcelable;
                        continue block11;
                    }
                    case 8: {
                        string6 = SafeParcelReader.createString(object, n4);
                        continue block11;
                    }
                    case 7: {
                        string5 = SafeParcelReader.createString(object, n4);
                        continue block11;
                    }
                    case 6: {
                        string4 = SafeParcelReader.createString(object, n4);
                        continue block11;
                    }
                    case 5: {
                        string3 = SafeParcelReader.createString(object, n4);
                        continue block11;
                    }
                    case 4: {
                        stringArray3 = SafeParcelReader.createStringArray(object, n4);
                        continue block11;
                    }
                    case 3: {
                        stringArray2 = SafeParcelReader.createStringArray(object, n4);
                        continue block11;
                    }
                    case 2: {
                        stringArray = SafeParcelReader.createStringArray(object, n4);
                        continue block11;
                    }
                    case 1: 
                }
                string2 = SafeParcelReader.createString(object, n4);
                continue;
            }
            n8 = SafeParcelReader.readInt(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzn(n8, string2, stringArray, stringArray2, stringArray3, string3, string4, string5, string6, (PlusCommonExtras)parcelable2);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzn[n3];
    }
}

