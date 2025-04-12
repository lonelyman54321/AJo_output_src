/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        long l2;
        int n3 = SafeParcelReader.validateObjectHeader(object);
        int n4 = 0;
        long l3 = l2 = 0L;
        long l4 = l2;
        boolean bl2 = false;
        while ((n4 = object.dataPosition()) < n3) {
            int n7;
            n4 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n4);
            if (n8 != (n7 = 1)) {
                n7 = 2;
                if (n8 != n7) {
                    n7 = 3;
                    if (n8 != n7) {
                        SafeParcelReader.skipUnknownField(object, n4);
                        continue;
                    }
                    l3 = SafeParcelReader.readLong(object, n4);
                    continue;
                }
                l4 = SafeParcelReader.readLong(object, n4);
                continue;
            }
            bl2 = SafeParcelReader.readBoolean(object, n4);
        }
        SafeParcelReader.ensureAtEnd(object, n3);
        object = new zzc(bl2, l3, l4);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzc[n3];
    }
}

