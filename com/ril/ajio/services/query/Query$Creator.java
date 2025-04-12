/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.Query;
import kotlin.jvm.internal.Intrinsics;

public final class Query$Creator
implements Parcelable.Creator {
    public final Query createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object.readInt();
        object = new Query();
        return object;
    }

    public final Query[] newArray(int n3) {
        return new Query[n3];
    }
}

