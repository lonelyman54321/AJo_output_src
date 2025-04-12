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
import com.google.android.gms.internal.plus.zzr$zzf;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public final class zzaa
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Serializable serializable = new HashSet();
        int n7 = 0;
        String string2 = null;
        boolean bl2 = false;
        while ((n3 = object.dataPosition()) < n4) {
            int n8;
            n3 = SafeParcelReader.readHeader(object);
            int n10 = SafeParcelReader.getFieldId(n3);
            if (n10 != (n8 = 1)) {
                n8 = 2;
                if (n10 != n8) {
                    n8 = 3;
                    if (n10 != n8) {
                        SafeParcelReader.skipUnknownField(object, n3);
                        continue;
                    }
                    string2 = SafeParcelReader.createString(object, n3);
                } else {
                    bl2 = SafeParcelReader.readBoolean(object, n3);
                }
            } else {
                n7 = SafeParcelReader.readInt(object, n3);
            }
            Integer n14 = n8;
            ((HashSet)serializable).add(n14);
        }
        n3 = object.dataPosition();
        if (n3 == n4) {
            return new zzr$zzf((Set)((Object)serializable), n7, bl2, string2);
        }
        String string3 = tk3_2.a(37, n4, "Overread allowed size end=");
        serializable = new SafeParcelReader$ParseException(string3, (Parcel)object);
        throw serializable;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzr$zzf[n3];
    }
}

