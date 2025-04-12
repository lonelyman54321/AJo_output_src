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
import com.ril.ajio.services.data.Login.QueryResetPassword$1;

public class QueryResetPassword
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String newpassword;
    private String token;

    static {
        QueryResetPassword$1 queryResetPassword$1 = new QueryResetPassword$1();
        CREATOR = queryResetPassword$1;
    }

    public QueryResetPassword() {
    }

    private QueryResetPassword(Parcel object) {
        String string2;
        this.token = string2 = object.readString();
        object = object.readString();
        this.newpassword = object;
    }

    public /* synthetic */ QueryResetPassword(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getNewpassword() {
        return this.newpassword;
    }

    public String getToken() {
        return this.token;
    }

    public void setNewpassword(String string2) {
        this.newpassword = string2;
    }

    public void setToken(String string2) {
        this.token = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.token;
        parcel.writeString(string2);
        string2 = this.newpassword;
        parcel.writeString(string2);
    }
}

