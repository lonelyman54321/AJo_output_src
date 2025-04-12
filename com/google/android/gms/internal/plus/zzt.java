/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.plus.zzr$zza;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public final class zzt
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Serializable serializable = new HashSet();
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        while ((n3 = object.dataPosition()) < n4) {
            int n14;
            n3 = SafeParcelReader.readHeader(object);
            int n15 = SafeParcelReader.getFieldId(n3);
            if (n15 != (n14 = 1)) {
                n14 = 2;
                if (n15 != n14) {
                    n14 = 3;
                    if (n15 != n14) {
                        SafeParcelReader.skipUnknownField(object, n3);
                        continue;
                    }
                    n10 = SafeParcelReader.readInt(object, n3);
                } else {
                    n8 = SafeParcelReader.readInt(object, n3);
                }
            } else {
                n7 = SafeParcelReader.readInt(object, n3);
            }
            Integer n16 = n14;
            ((HashSet)serializable).add(n16);
        }
        n3 = object.dataPosition();
        if (n3 == n4) {
            return new zzr$zza((Set)((Object)serializable), n7, n8, n10);
        }
        String string2 = tk3_2.a(37, n4, "Overread allowed size end=");
        serializable = new SafeParcelReader$ParseException(string2, (Parcel)object);
        throw serializable;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr$zza[n3];
    }
}

