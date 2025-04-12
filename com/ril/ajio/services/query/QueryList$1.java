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
import com.ril.ajio.services.query.QueryList;

class QueryList$1
implements Parcelable.Creator {
    public QueryList createFromParcel(Parcel parcel) {
        QueryList queryList = new QueryList(parcel);
        return queryList;
    }

    public QueryList[] newArray(int n3) {
        return new QueryList[n3];
    }
}

