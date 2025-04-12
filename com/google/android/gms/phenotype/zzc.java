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
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.zzi;

public final class zzc
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        int n7 = 0;
        zzi[] zziArray = null;
        String[] stringArray = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n8;
            n3 = SafeParcelReader.readHeader(object);
            int n10 = SafeParcelReader.getFieldId(n3);
            if (n10 != (n8 = 2)) {
                n8 = 3;
                if (n10 != n8) {
                    n8 = 4;
                    if (n10 != n8) {
                        SafeParcelReader.skipUnknownField(object, n3);
                        continue;
                    }
                    stringArray = SafeParcelReader.createStringArray(object, n3);
                    continue;
                }
                zziArray = zzi.CREATOR;
                zziArray = (zzi[])SafeParcelReader.createTypedArray(object, n3, (Parcelable.Creator)zziArray);
                continue;
            }
            n7 = SafeParcelReader.readInt(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new Configuration(n7, zziArray, stringArray);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new Configuration[n3];
    }
}

