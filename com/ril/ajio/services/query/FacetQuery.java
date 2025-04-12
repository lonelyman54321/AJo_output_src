/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.FacetInternalQuery;
import com.ril.ajio.services.query.FacetQuery$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FacetQuery
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private FacetInternalQuery query;

    static {
        FacetQuery$Creator facetQuery$Creator = new FacetQuery$Creator();
        CREATOR = facetQuery$Creator;
    }

    public FacetQuery() {
        this(null, 1, null);
    }

    public FacetQuery(FacetInternalQuery facetInternalQuery) {
        this.query = facetInternalQuery;
    }

    public /* synthetic */ FacetQuery(FacetInternalQuery facetInternalQuery, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            facetInternalQuery = null;
        }
        this(facetInternalQuery);
    }

    public FacetQuery(String string2) {
        Intrinsics.checkNotNullParameter(string2, "mInternalQueryValue");
        FacetInternalQuery facetInternalQuery = new FacetInternalQuery(string2);
        this(facetInternalQuery);
    }

    public final int describeContents() {
        return 0;
    }

    public final FacetInternalQuery getQuery() {
        return this.query;
    }

    public final void setQuery(FacetInternalQuery facetInternalQuery) {
        this.query = facetInternalQuery;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        FacetInternalQuery facetInternalQuery = this.query;
        if (facetInternalQuery == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            facetInternalQuery.writeToParcel(parcel, n3);
        }
    }
}

