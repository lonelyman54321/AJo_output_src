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
import com.ril.ajio.services.query.FacetInternalQuery;
import com.ril.ajio.services.query.FacetQuery;
import kotlin.jvm.internal.Intrinsics;

public final class FacetQuery$Creator
implements Parcelable.Creator {
    public final FacetQuery createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            Parcelable.Creator creator = FacetInternalQuery.CREATOR;
            object = creator.createFromParcel(object);
        }
        object = (FacetInternalQuery)object;
        FacetQuery facetQuery = new FacetQuery((FacetInternalQuery)object);
        return facetQuery;
    }

    public final FacetQuery[] newArray(int n3) {
        return new FacetQuery[n3];
    }
}

