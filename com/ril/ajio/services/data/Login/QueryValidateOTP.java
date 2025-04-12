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
import com.ril.ajio.services.data.Login.QueryValidateOTP$1;

public class QueryValidateOTP
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String emailId;
    private String newPass;
    private String otpReceived;

    static {
        QueryValidateOTP$1 queryValidateOTP$1 = new QueryValidateOTP$1();
        CREATOR = queryValidateOTP$1;
    }

    public QueryValidateOTP() {
    }

    public QueryValidateOTP(Parcel object) {
        String string2;
        this.otpReceived = string2 = object.readString();
        this.emailId = string2 = object.readString();
        object = object.readString();
        this.newPass = object;
    }

    public static Parcelable.Creator getCREATOR() {
        return CREATOR;
    }

    public int describeContents() {
        return 0;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getNewPass() {
        return this.newPass;
    }

    public String getOtpReceived() {
        return this.otpReceived;
    }

    public void setEmailId(String string2) {
        this.emailId = string2;
    }

    public void setNewPass(String string2) {
        this.newPass = string2;
    }

    public void setOtpReceived(String string2) {
        this.otpReceived = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("QueryValidateOTP{otpReceived='");
        String string2 = this.otpReceived;
        stringBuilder.append(string2);
        stringBuilder.append("', emailId='");
        string2 = this.emailId;
        stringBuilder.append(string2);
        stringBuilder.append("', newPass='");
        string2 = this.newPass;
        return h30_0.a(stringBuilder, string2, "'}");
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.otpReceived;
        parcel.writeString(string2);
        string2 = this.emailId;
        parcel.writeString(string2);
        string2 = this.newPass;
        parcel.writeString(string2);
    }
}

