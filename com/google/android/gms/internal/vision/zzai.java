/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzaj;

public final class zzai
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n3;
        int n4 = SafeParcelReader.validateObjectHeader(object);
        Parcelable.Creator creator = null;
        while ((n3 = object.dataPosition()) < n4) {
            int n7;
            n3 = SafeParcelReader.readHeader(object);
            int n8 = SafeParcelReader.getFieldId(n3);
            if (n8 != (n7 = 2)) {
                SafeParcelReader.skipUnknownField(object, n3);
                continue;
            }
            creator = Rect.CREATOR;
            creator = (Rect)SafeParcelReader.createParcelable(object, n3, creator);
        }
        SafeParcelReader.ensureAtEnd(object, n4);
        object = new zzaj((Rect)creator);
        return object;
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new zzaj[n3];
    }
}

