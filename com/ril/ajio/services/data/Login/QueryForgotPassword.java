/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Login;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Login.QueryForgotPassword$1;

public class QueryForgotPassword
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String userId;

    static {
        QueryForgotPassword$1 queryForgotPassword$1 = new QueryForgotPassword$1();
        CREATOR = queryForgotPassword$1;
    }

    public QueryForgotPassword() {
    }

    private QueryForgotPassword(Parcel object) {
        object = object.readString();
        this.userId = object;
    }

    public /* synthetic */ QueryForgotPassword(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String string2) {
        this.userId = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.userId;
        parcel.writeString(string2);
    }
}

