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
import com.ril.ajio.services.query.QuerySingleData;
import kotlin.jvm.internal.Intrinsics;

public final class QuerySingleData$Creator
implements Parcelable.Creator {
    public final QuerySingleData createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        QuerySingleData querySingleData = new QuerySingleData((String)object);
        return querySingleData;
    }

    public final QuerySingleData[] newArray(int n3) {
        return new QuerySingleData[n3];
    }
}

