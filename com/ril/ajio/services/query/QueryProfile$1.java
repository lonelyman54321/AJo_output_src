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
import com.ril.ajio.services.query.QueryProfile;

class QueryProfile$1
implements Parcelable.Creator {
    public QueryProfile createFromParcel(Parcel parcel) {
        QueryProfile queryProfile = new QueryProfile(parcel, 0);
        return queryProfile;
    }

    public QueryProfile[] newArray(int n3) {
        return new QueryProfile[n3];
    }
}

