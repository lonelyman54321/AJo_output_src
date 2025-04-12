/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import com.ril.ajio.services.data.Currency;
import com.ril.ajio.services.data.DefaultAddress;
import com.ril.ajio.services.data.Language;
import java.io.Serializable;

public class UserDetails
implements Serializable {
    private Currency currency;
    private String customerUuid;
    private String dateOfBirth;
    private DefaultAddress defaultAddress;
    private Boolean displayEmail;
    private String displayUid;
    private String encryptedId;
    private String firstName;
    private String genderType;
    private String identity;
    private boolean isLinkedToAjio;
    private boolean isRegisteredToJioPrime;
    private boolean jioPrimeEnabled;
    private boolean kioskCustomer;
    private Language language;
    private String lastName;
    private String mobileNumber;
    private String name;
    private String pk;
    private String screenName;
    private String uid;
    private String userReferralCode;

    public UserDetails() {
        Boolean bl2;
        this.displayEmail = bl2 = Boolean.TRUE;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public String getCustomerUuid() {
        return this.customerUuid;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public DefaultAddress getDefaultAddress() {
        return this.defaultAddress;
    }

    public Boolean getDisplayEmail() {
        return this.displayEmail;
    }

    public String getDisplayUid() {
        return this.displayUid;
    }

    public String getEncryptedId() {
        return this.encryptedId;
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

    public Language getLanguage() {
        return this.language;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPk() {
        return this.pk;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUserReferralCode() {
        return this.userReferralCode;
    }

    public boolean isIsLinkedToAjio() {
        return this.isLinkedToAjio;
    }

    public boolean isIsRegisteredToJioPrime() {
        return this.isRegisteredToJioPrime;
    }

    public boolean isJioPrimeEnabled() {
        return this.jioPrimeEnabled;
    }

    public boolean isKioskCustomer() {
        return this.kioskCustomer;
    }

    public boolean isLinkedToAjio() {
        return this.isLinkedToAjio;
    }

    public boolean isRegisteredToJioPrime() {
        return this.isRegisteredToJioPrime;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setCustomerUuid(String string2) {
        this.customerUuid = string2;
    }

    public void setDateOfBirth(String string2) {
        this.dateOfBirth = string2;
    }

    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public void setDisplayEmail(Boolean bl2) {
        this.displayEmail = bl2;
    }

    public void setDisplayUid(String string2) {
        this.displayUid = string2;
    }

    public void setEncryptedId(String string2) {
        this.encryptedId = string2;
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

    public void setIsLinkedToAjio(boolean bl2) {
        this.isLinkedToAjio = bl2;
    }

    public void setIsRegisteredToJioPrime(boolean bl2) {
        this.isRegisteredToJioPrime = bl2;
    }

    public void setJioPrimeEnabled(boolean bl2) {
        this.jioPrimeEnabled = bl2;
    }

    public void setKioskCustomer(boolean bl2) {
        this.kioskCustomer = bl2;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setLinkedToAjio(boolean bl2) {
        this.isLinkedToAjio = bl2;
    }

    public void setMobileNumber(String string2) {
        this.mobileNumber = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setPk(String string2) {
        this.pk = string2;
    }

    public void setRegisteredToJioPrime(boolean bl2) {
        this.isRegisteredToJioPrime = bl2;
    }

    public void setScreenName(String string2) {
        this.screenName = string2;
    }

    public void setUid(String string2) {
        this.uid = string2;
    }

    public void setUserReferralCode(String string2) {
        this.userReferralCode = string2;
    }
}

