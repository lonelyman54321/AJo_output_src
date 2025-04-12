/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzeb;

public final class zzee
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        int n7 = 0;
        String string2 = null;
        Parcelable.Creator creator = null;
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
                    creator = Intent.CREATOR;
                    creator = (Intent)SafeParcelReader.createParcelable(object, n3, creator);
                    continue;
                }
                string2 = SafeParcelReader.createString(object, n3);
                continue;
            }
            n7 = SafeParcelReader.readInt(object, n3);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzeb(n7, string2, (Intent)creator);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzeb[n3];
    }
}

