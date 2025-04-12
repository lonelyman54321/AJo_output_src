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
import com.ril.ajio.services.query.QueryLangingCode;

class QueryLangingCode$1
implements Parcelable.Creator {
    public QueryLangingCode createFromParcel(Parcel parcel) {
        QueryLangingCode queryLangingCode = new QueryLangingCode(parcel, 0);
        return queryLangingCode;
    }

    public QueryLangingCode[] newArray(int n3) {
        return new QueryLangingCode[n3];
    }
}

