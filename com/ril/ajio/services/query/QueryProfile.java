/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.QueryProfile$1;

public class QueryProfile
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String confirmPassword;
    private String currentPassword;
    private String dateOfBirth;
    private String emailId;
    private String firstName;
    private String gender;
    private String lastName;
    private String login;
    private String mobileNumber;
    private String newMobileNumber;
    private String newPassword;
    private String oldMobileNumber;
    private String otp;
    private String screenName;

    static {
        QueryProfile$1 queryProfile$1 = new QueryProfile$1();
        CREATOR = queryProfile$1;
    }

    public QueryProfile() {
    }

    private QueryProfile(Parcel object) {
        String string2;
        this.firstName = string2 = object.readString();
        this.lastName = string2 = object.readString();
        this.screenName = string2 = object.readString();
        this.newPassword = string2 = object.readString();
        this.confirmPassword = string2 = object.readString();
        this.gender = string2 = object.readString();
        this.dateOfBirth = string2 = object.readString();
        this.mobileNumber = string2 = object.readString();
        this.otp = string2 = object.readString();
        this.emailId = string2 = object.readString();
        object = object.readString();
        this.login = object;
    }

    public /* synthetic */ QueryProfile(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getConfirmPassword() {
        return this.confirmPassword;
    }

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLogin() {
        return this.login;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getNewMobileNumber() {
        return this.newMobileNumber;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public String getOldMobileNumber() {
        return this.oldMobileNumber;
    }

    public String getOtp() {
        return this.otp;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public void setConfirmPassword(String string2) {
        this.confirmPassword = string2;
    }

    public void setCurrentPassword(String string2) {
        this.currentPassword = string2;
    }

    public void setDateOfBirth(String string2) {
        this.dateOfBirth = string2;
    }

    public void setEmailId(String string2) {
        this.emailId = string2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setGender(String string2) {
        this.gender = string2;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setLogin(String string2) {
        this.login = string2;
    }

    public void setMobileNumber(String string2) {
        this.mobileNumber = string2;
    }

    public void setNewMobileNumber(String string2) {
        this.newMobileNumber = string2;
    }

    public void setNewPassword(String string2) {
        this.newPassword = string2;
    }

    public void setOldMobileNumber(String string2) {
        this.oldMobileNumber = string2;
    }

    public void setOtp(String string2) {
        this.otp = string2;
    }

    public void setScreenName(String string2) {
        this.screenName = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.firstName;
        parcel.writeString(string2);
        string2 = this.lastName;
        parcel.writeString(string2);
        string2 = this.screenName;
        parcel.writeString(string2);
        string2 = this.newPassword;
        parcel.writeString(string2);
        string2 = this.confirmPassword;
        parcel.writeString(string2);
        string2 = this.gender;
        parcel.writeString(string2);
        string2 = this.dateOfBirth;
        parcel.writeString(string2);
        string2 = this.mobileNumber;
        parcel.writeString(string2);
        string2 = this.otp;
        parcel.writeString(string2);
        string2 = this.emailId;
        parcel.writeString(string2);
        string2 = this.login;
        parcel.writeString(string2);
    }
}

