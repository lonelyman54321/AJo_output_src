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
import com.ril.ajio.services.query.QueryFeedback;

class QueryFeedback$1
implements Parcelable.Creator {
    public QueryFeedback createFromParcel(Parcel parcel) {
        QueryFeedback queryFeedback = new QueryFeedback(parcel, 0);
        return queryFeedback;
    }

    public QueryFeedback[] newArray(int n3) {
        return new QueryFeedback[n3];
    }
}

