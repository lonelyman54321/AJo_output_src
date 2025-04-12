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
import kotlin.jvm.internal.Intrinsics;

public final class FacetInternalQuery$Creator
implements Parcelable.Creator {
    public final FacetInternalQuery createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        FacetInternalQuery facetInternalQuery = new FacetInternalQuery((String)object);
        return facetInternalQuery;
    }

    public final FacetInternalQuery[] newArray(int n3) {
        return new FacetInternalQuery[n3];
    }
}

