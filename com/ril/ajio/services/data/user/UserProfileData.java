/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

public class UserProfileData {
    private String customerUuid;
    private String dateOfBirth;
    private boolean displayEmail = true;
    private String displayUid;
    private String encryptedId;
    public String encryptionKey;
    private String firstName;
    private String genderType;
    private String identity;
    private boolean isEmailVerified = false;
    public String keyVersion;
    private boolean kioskCustomer;
    private String lastName;
    private String loginvia;
    private String mobileNumber;
    private String name;
    private String password;
    private String screenName;
    public String taxPayerId;
    private String type;
    private String uid;
    public String updateNumberRequestWindow;
    public boolean updateRequestPending;
    private String userReferralCode;

    public String getCustomerUuid() {
        return this.customerUuid;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public boolean getDisplayEmail() {
        return this.displayEmail;
    }

    public String getDisplayUid() {
        return this.displayUid;
    }

    public String getEmailAddress() {
        return this.uid;
    }

    public boolean getEmailVerified() {
        return this.isEmailVerified;
    }

    public String getEncryptedId() {
        return this.encryptedId;
    }

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGenderType() {
        return this.genderType;
    }

    public String getIdentity() {
        return this.identity;
    }

    public String getImageUrl() {
        return null;
    }

    public String getKeyVersion() {
        return this.keyVersion;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLoginvia() {
        return this.loginvia;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public String getTaxPayerId() {
        return this.taxPayerId;
    }

    public String getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUserReferralCode() {
        return this.userReferralCode;
    }

    public boolean isKioskCustomer() {
        return this.kioskCustomer;
    }

    public void setCustomerUuid(String string2) {
        this.customerUuid = string2;
    }

    public void setDateOfBirth(String string2) {
        this.dateOfBirth = string2;
    }

    public void setDisplayEmail(boolean bl2) {
        this.displayEmail = bl2;
    }

    public void setDisplayUid(String string2) {
        this.displayUid = string2;
    }

    public void setEmailVerified(boolean bl2) {
        this.isEmailVerified = bl2;
    }

    public void setEncryptedId(String string2) {
        this.encryptedId = string2;
    }

    public void setEncryptionKey(String string2) {
        this.encryptionKey = string2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setGenderType(String string2) {
        this.genderType = string2;
    }

    public void setIdentity(String string2) {
        this.identity = string2;
    }

    public void setKeyVersion(String string2) {
        this.keyVersion = string2;
    }

    public void setKioskCustomer(boolean bl2) {
        this.kioskCustomer = bl2;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setLoginvia(String string2) {
        this.loginvia = string2;
    }

    public void setMobileNumber(String string2) {
        this.mobileNumber = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setPassword(String string2) {
        this.password = string2;
    }

    public void setScreenName(String string2) {
        this.screenName = string2;
    }

    public void setTaxPayerId(String string2) {
        this.taxPayerId = string2;
    }

    public void setType(String string2) {
        this.type = string2;
    }

    public void setUid(String string2) {
        this.uid = string2;
    }

    public void setUserReferralCode(String string2) {
        this.userReferralCode = string2;
    }
}

