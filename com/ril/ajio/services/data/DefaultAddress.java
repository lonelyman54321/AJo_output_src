/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import com.ril.ajio.services.data.Country;
import java.io.Serializable;

public class DefaultAddress
implements Serializable {
    private String addressPoc;
    private Country country;
    private boolean defaultAddress;
    private String district;
    private String firstName;
    private String id;
    private String landmark;
    private String lastName;
    private String line1;
    private String line2;
    private String phone;
    private String postalCode;
    private String selectedAddressType;
    private String state;

    public String getAddressPoc() {
        return this.addressPoc;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getId() {
        return this.id;
    }

    public String getLandmark() {
        return this.landmark;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLine1() {
        return this.line1;
    }

    public String getLine2() {
        return this.line2;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getSelectedAddressType() {
        return this.selectedAddressType;
    }

    public String getState() {
        return this.state;
    }

    public boolean isDefaultAddress() {
        return this.defaultAddress;
    }

    public void setAddressPoc(String string2) {
        this.addressPoc = string2;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setDefaultAddress(boolean bl2) {
        this.defaultAddress = bl2;
    }

    public void setDistrict(String string2) {
        this.district = string2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setLandmark(String string2) {
        this.landmark = string2;
    }

    public void setLastName(String string2) {
        this.lastName = string2;
    }

    public void setLine1(String string2) {
        this.line1 = string2;
    }

    public void setLine2(String string2) {
        this.line2 = string2;
    }

    public void setPhone(String string2) {
        this.phone = string2;
    }

    public void setPostalCode(String string2) {
        this.postalCode = string2;
    }

    public void setSelectedAddressType(String string2) {
        this.selectedAddressType = string2;
    }

    public void setState(String string2) {
        this.state = string2;
    }
}

