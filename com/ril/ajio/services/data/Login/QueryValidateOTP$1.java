/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Login;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Login.QueryValidateOTP;

class QueryValidateOTP$1
implements Parcelable.Creator {
    public QueryValidateOTP createFromParcel(Parcel parcel) {
        QueryValidateOTP queryValidateOTP = new QueryValidateOTP(parcel);
        return queryValidateOTP;
    }

    public QueryValidateOTP[] newArray(int n3) {
        return new QueryValidateOTP[n3];
    }
}

