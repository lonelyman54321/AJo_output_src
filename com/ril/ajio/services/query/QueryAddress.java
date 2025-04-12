/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import java.io.Serializable;

public class QueryAddress
implements Serializable {
    private String addressId;
    private String addressLine1;
    private String addressLine2;
    private String addressPOC;
    private String city;
    private String countryISOCode;
    private String customAddressType;
    private String firstName;
    private boolean isDefaultAddress;
    private String landmark;
    private String lastName;
    private String phone;
    private String postCode;
    private String selectedAddressType;
    private String state;
    private String titleCode;
    private String town;

    public QueryAddress() {
    }

    public QueryAddress(Parcel object) {
        String string2;
        this.addressPOC = string2 = object.readString();
        this.titleCode = string2 = object.readString();
        this.addressLine1 = string2 = object.readString();
        this.addressLine2 = string2 = object.readString();
        this.town = string2 = object.readString();
        this.postCode = string2 = object.readString();
        this.countryISOCode = string2 = object.readString();
        this.addressId = string2 = object.readString();
        this.landmark = string2 = object.readString();
        this.city = string2 = object.readString();
        this.state = string2 = object.readString();
        object = object.readString();
        this.phone = object;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public String getAddressPOC() {
        return this.addressPOC;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryISOCode() {
        return this.countryISOCode;
    }

    public String getCustomAddressType() {
        return this.customAddressType;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLandmark() {
        return this.landmark;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getSelectedAddressType() {
        return this.selectedAddressType;
    }

    public String getState() {
        return this.state;
    }

    public String getTitleCode() {
        return this.titleCode;
    }

    public String getTown() {
        return this.town;
    }

    public boolean isDefaultAddress() {
        return this.isDefaultAddress;
    }

    public void setAddressId(String string2) {
        this.addressId = string2;
    }

    public void setAddressLine1(String string2) {
        this.addressLine1 = string2;
    }

    public void setAddressLine2(String string2) {
        this.addressLine2 = string2;
    }

    public void setAddressPOC(String string2) {
        this.addressPOC = string2;
    }

    public void setCity(String string2) {
        this.city = string2;
    }

    public void setCountryISOCode(String string2) {
        this.countryISOCode = string2;
    }

    public void setCustomAddressType(String string2) {
        this.customAddressType = string2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setIsDefaultAddress(boolean bl2) {
        this.isDefaultAddress = bl2;
    }

    public void setLandmark(String string2) {
        this.landmark = string2;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setPhone(String string2) {
        this.phone = string2;
    }

    public void setPostCode(String string2) {
        this.postCode = string2;
    }

    public void setSelectedAddressType(String string2) {
        this.selectedAddressType = string2;
    }

    public void setState(String string2) {
        this.state = string2;
    }

    public void setTitleCode(String string2) {
        this.titleCode = string2;
    }

    public void setTown(String string2) {
        this.town = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("QueryAddress{Name='");
        String string2 = this.addressPOC;
        stringBuilder.append(string2);
        stringBuilder.append("', titleCode='");
        string2 = this.titleCode;
        stringBuilder.append(string2);
        stringBuilder.append("', addressLine1='");
        string2 = this.addressLine1;
        stringBuilder.append(string2);
        stringBuilder.append("', addressLine2='");
        string2 = this.addressLine2;
        stringBuilder.append(string2);
        stringBuilder.append("', town='");
        string2 = this.town;
        stringBuilder.append(string2);
        stringBuilder.append("', postCode='");
        string2 = this.postCode;
        stringBuilder.append(string2);
        stringBuilder.append("', countryISOCode='");
        string2 = this.countryISOCode;
        stringBuilder.append(string2);
        stringBuilder.append("', addressId='");
        string2 = this.addressId;
        stringBuilder.append(string2);
        stringBuilder.append("', city='");
        string2 = this.city;
        stringBuilder.append(string2);
        stringBuilder.append("', state='");
        string2 = this.state;
        stringBuilder.append(string2);
        stringBuilder.append("', landmark='");
        string2 = this.landmark;
        stringBuilder.append(string2);
        stringBuilder.append("', phone='");
        string2 = this.phone;
        stringBuilder.append(string2);
        stringBuilder.append("', isDefaultAddress=");
        boolean bl2 = this.isDefaultAddress;
        return AR.a(stringBuilder, bl2, '}');
    }
}

