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
import com.ril.ajio.services.query.QueryCustomer;

class QueryCustomer$1
implements Parcelable.Creator {
    public QueryCustomer createFromParcel(Parcel parcel) {
        QueryCustomer queryCustomer = new QueryCustomer(parcel, 0);
        return queryCustomer;
    }

    public QueryCustomer[] newArray(int n3) {
        return new QueryCustomer[n3];
    }
}

