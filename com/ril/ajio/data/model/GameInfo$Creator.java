/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.data.model.GameInfo;
import kotlin.jvm.internal.Intrinsics;

public final class GameInfo$Creator
implements Parcelable.Creator {
    public final GameInfo createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        GameInfo gameInfo = new GameInfo(string2, string3, (String)object);
        return gameInfo;
    }

    public final GameInfo[] newArray(int n3) {
        return new GameInfo[n3];
    }
}

