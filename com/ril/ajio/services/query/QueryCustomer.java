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
import com.ril.ajio.services.query.QueryCustomer$1;

public class QueryCustomer
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String adId;
    private String captchaInput;
    private String currency;
    private String email;
    private String firstName;
    private String gender;
    private boolean isEmailUpdateWithoutPassword;
    private boolean isMobileNumberEnterered;
    private boolean isRegistration;
    private String language;
    private String lastName;
    private String login;
    private String loginvia;
    private String mobileNumber;
    private String otp;
    private String password;
    private String profileId;
    private String referralCode;
    private boolean refreshCaptcha = false;
    private String requestMode;
    private String rilFnlRegisterReferralCode;
    private String temptoken;
    private String titleCode;
    private String token;

    static {
        QueryCustomer$1 queryCustomer$1 = new QueryCustomer$1();
        CREATOR = queryCustomer$1;
    }

    public QueryCustomer() {
    }

    private QueryCustomer(Parcel object) {
        String string2;
        this.firstName = string2 = object.readString();
        this.lastName = string2 = object.readString();
        this.titleCode = string2 = object.readString();
        this.login = string2 = object.readString();
        this.password = string2 = object.readString();
        this.language = string2 = object.readString();
        this.currency = string2 = object.readString();
        this.mobileNumber = string2 = object.readString();
        this.gender = string2 = object.readString();
        this.referralCode = string2 = object.readString();
        this.loginvia = string2 = object.readString();
        this.token = string2 = object.readString();
        this.requestMode = string2 = object.readString();
        object = object.readString();
        this.email = object;
    }

    public /* synthetic */ QueryCustomer(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getAdId() {
        return this.adId;
    }

    public String getCaptchaInput() {
        return this.captchaInput;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLogin() {
        return this.login;
    }

    public String getLoginvia() {
        return this.loginvia;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getOtp() {
        return this.otp;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public String getRequestMode() {
        return this.requestMode;
    }

    public String getRilFnlRegisterReferralCode() {
        return this.rilFnlRegisterReferralCode;
    }

    public String getTemptoken() {
        return this.temptoken;
    }

    public String getTitleCode() {
        return this.titleCode;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isEmailUpdateWithoutPassword() {
        return this.isEmailUpdateWithoutPassword;
    }

    public boolean isMobileNumberEnterered() {
        return this.isMobileNumberEnterered;
    }

    public boolean isRefreshCaptcha() {
        return this.refreshCaptcha;
    }

    public boolean isRegistration() {
        return this.isRegistration;
    }

    public void setAdId(String string2) {
        this.adId = string2;
    }

    public void setCaptchaInput(String string2) {
        this.captchaInput = string2;
    }

    public void setCurrency(String string2) {
        this.currency = string2;
    }

    public void setEmail(String string2) {
        this.email = string2;
    }

    public void setEmailUpdateWithoutPassword(boolean bl2) {
        this.isEmailUpdateWithoutPassword = bl2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setGender(String string2) {
        this.gender = string2;
    }

    public void setLanguage(String string2) {
        this.language = string2;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setLogin(String string2) {
        this.login = string2;
    }

    public void setLoginvia(String string2) {
        this.loginvia = string2;
    }

    public void setMobileNumber(String string2) {
        this.mobileNumber = string2;
    }

    public void setMobileNumberEnterered(boolean bl2) {
        this.isMobileNumberEnterered = bl2;
    }

    public void setOtp(String string2) {
        this.otp = string2;
    }

    public void setPassword(String string2) {
        this.password = string2;
    }

    public void setProfileId(String string2) {
        this.profileId = string2;
    }

    public void setReferralCode(String string2) {
        this.referralCode = string2;
    }

    public void setRefreshCaptcha(boolean bl2) {
        this.refreshCaptcha = bl2;
    }

    public void setRegistration(boolean bl2) {
        this.isRegistration = bl2;
    }

    public void setRequestMode(String string2) {
        this.requestMode = string2;
    }

    public void setRilFnlRegisterReferralCode(String string2) {
        this.rilFnlRegisterReferralCode = string2;
    }

    public void setTemptoken(String string2) {
        this.temptoken = string2;
    }

    public void setTitleCode(String string2) {
        this.titleCode = string2;
    }

    public void setToken(String string2) {
        this.token = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.firstName;
        parcel.writeString(string2);
        string2 = this.lastName;
        parcel.writeString(string2);
        string2 = this.titleCode;
        parcel.writeString(string2);
        string2 = this.login;
        parcel.writeString(string2);
        string2 = this.password;
        parcel.writeString(string2);
        string2 = this.language;
        parcel.writeString(string2);
        string2 = this.currency;
        parcel.writeString(string2);
        string2 = this.mobileNumber;
        parcel.writeString(string2);
        string2 = this.gender;
        parcel.writeString(string2);
        string2 = this.referralCode;
        parcel.writeString(string2);
        string2 = this.loginvia;
        parcel.writeString(string2);
        string2 = this.token;
        parcel.writeString(string2);
        string2 = this.requestMode;
        parcel.writeString(string2);
        string2 = this.email;
        parcel.writeString(string2);
    }
}

