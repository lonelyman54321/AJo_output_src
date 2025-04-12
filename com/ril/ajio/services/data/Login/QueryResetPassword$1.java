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
import com.ril.ajio.services.data.Login.QueryResetPassword;

class QueryResetPassword$1
implements Parcelable.Creator {
    public QueryResetPassword createFromParcel(Parcel parcel) {
        QueryResetPassword queryResetPassword = new QueryResetPassword(parcel, 0);
        return queryResetPassword;
    }

    public QueryResetPassword[] newArray(int n3) {
        return new QueryResetPassword[n3];
    }
}

