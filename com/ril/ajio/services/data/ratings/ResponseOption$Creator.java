/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.ResponseOption;
import kotlin.jvm.internal.Intrinsics;

public final class ResponseOption$Creator
implements Parcelable.Creator {
    public final ResponseOption createFromParcel(Parcel object) {
        Integer n3;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n4 = object.readInt();
        if (n4 == 0) {
            n4 = 0;
            n3 = null;
        } else {
            n4 = object.readInt();
            n3 = n4;
        }
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        ResponseOption responseOption = new ResponseOption(n3, string2, string3, (String)object);
        return responseOption;
    }

    public final ResponseOption[] newArray(int n3) {
        return new ResponseOption[n3];
    }
}

