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
import com.ril.ajio.services.query.CurrentQuery;
import com.ril.ajio.services.query.Query;
import kotlin.jvm.internal.Intrinsics;

public final class CurrentQuery$Creator
implements Parcelable.Creator {
    public final CurrentQuery createFromParcel(Parcel object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = Query.CREATOR.createFromParcel(object);
        }
        object2 = (Query)object2;
        object = object.readString();
        CurrentQuery currentQuery = new CurrentQuery((Query)object2, (String)object);
        return currentQuery;
    }

    public final CurrentQuery[] newArray(int n3) {
        return new CurrentQuery[n3];
    }
}

