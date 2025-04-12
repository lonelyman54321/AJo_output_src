/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;

public final class zzbk
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        Parcelable parcelable = null;
        long l2 = 0L;
        String string2 = null;
        Parcelable parcelable2 = null;
        String string3 = null;
        long l3 = l2;
        while ((n4 = object.dataPosition()) < n3) {
            int n7;
            n4 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n4);
            if (n8 != (n7 = 2)) {
                n7 = 3;
                if (n8 != n7) {
                    n7 = 4;
                    if (n8 != n7) {
                        n7 = 5;
                        if (n8 != n7) {
                            SafeParcelReader.skipUnknownField(object, n4);
                            continue;
                        }
                        l3 = SafeParcelReader.readLong(object, n4);
                        continue;
                    }
                    string3 = SafeParcelReader.createString(object, n4);
                    continue;
                }
                Parcelable.Creator creator = zzbg.CREATOR;
                parcelable2 = parcelable = SafeParcelReader.createParcelable(object, n4, creator);
                parcelable2 = (zzbg)parcelable;
                continue;
            }
            string2 = SafeParcelReader.createString(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzbl(string2, (zzbg)parcelable2, string3, l3);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzbl[n3];
    }
}

