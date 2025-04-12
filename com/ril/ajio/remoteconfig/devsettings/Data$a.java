/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.remoteconfig.devsettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.remoteconfig.devsettings.Data;
import kotlin.jvm.internal.Intrinsics;

public final class Data$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        Data data = new Data(string2, string3, (String)object);
        return data;
    }

    public final Object[] newArray(int n3) {
        return new Data[n3];
    }
}

