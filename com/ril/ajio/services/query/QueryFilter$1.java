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
import com.ril.ajio.services.query.QueryFilter;

class QueryFilter$1
implements Parcelable.Creator {
    public QueryFilter createFromParcel(Parcel parcel) {
        QueryFilter queryFilter = new QueryFilter(parcel, 0);
        return queryFilter;
    }

    public QueryFilter[] newArray(int n3) {
        return new QueryFilter[n3];
    }
}

