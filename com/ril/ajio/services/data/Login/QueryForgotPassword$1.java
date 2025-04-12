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
import com.ril.ajio.services.data.Login.QueryForgotPassword;

class QueryForgotPassword$1
implements Parcelable.Creator {
    public QueryForgotPassword createFromParcel(Parcel parcel) {
        QueryForgotPassword queryForgotPassword = new QueryForgotPassword(parcel, 0);
        return queryForgotPassword;
    }

    public QueryForgotPassword[] newArray(int n3) {
        return new QueryForgotPassword[n3];
    }
}

