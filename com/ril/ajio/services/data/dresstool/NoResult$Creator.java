/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.dresstool;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.dresstool.NoResult;
import kotlin.jvm.internal.Intrinsics;

public final class NoResult$Creator
implements Parcelable.Creator {
    public final NoResult createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        NoResult noResult = new NoResult(string2, string3, (String)object);
        return noResult;
    }

    public final NoResult[] newArray(int n3) {
        return new NoResult[n3];
    }
}

