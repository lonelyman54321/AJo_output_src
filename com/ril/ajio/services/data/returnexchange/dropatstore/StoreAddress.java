/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange.dropatstore;

import com.ril.ajio.services.data.returnexchange.dropatstore.Country;
import java.io.Serializable;

public class StoreAddress
implements Serializable {
    private boolean billingAddress;
    private Country country;
    private Boolean defaultAddress;
    private String district;
    private String firstName;
    private String formattedAddress;
    private String id;
    private Boolean isHomeAddress;
    private String landmark;
    private String lastName;
    private String line1;
    private String line2;
    private String phone;
    private String postalCode;
    private boolean shippingAddress;
    private String state;
    private String town;
    private boolean visibleInAddressBook;

    public boolean getBillingAddress() {
        return this.billingAddress;
    }

    public Country getCountry() {
        return this.country;
    }

    public boolean getDefaultAddress() {
        return this.defaultAddress;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFormattedAddress() {
        return this.formattedAddress;
    }

    public String getId() {
        return this.id;
    }

    public boolean getIsHomeAddress() {
        return this.isHomeAddress;
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

    public boolean getShippingAddress() {
        return this.shippingAddress;
    }

    public String getState() {
        return this.state;
    }

    public String getTown() {
        return this.town;
    }

    public boolean getVisibleInAddressBook() {
        return this.visibleInAddressBook;
    }

    public void setBillingAddress(boolean bl2) {
        this.billingAddress = bl2;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setDefaultAddress(boolean bl2) {
        Boolean bl3;
        this.defaultAddress = bl3 = Boolean.valueOf(bl2);
    }

    public void setDistrict(String string2) {
        this.district = string2;
    }

    public void setFirstName(String string2) {
        this.firstName = string2;
    }

    public void setFormattedAddress(String string2) {
        this.formattedAddress = string2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setIsHomeAddress(boolean bl2) {
        Boolean bl3;
        this.isHomeAddress = bl3 = Boolean.valueOf(bl2);
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

    public void setShippingAddress(boolean bl2) {
        this.shippingAddress = bl2;
    }

    public void setState(String string2) {
        this.state = string2;
    }

    public void setTown(String string2) {
        this.town = string2;
    }

    public void setVisibleInAddressBook(boolean bl2) {
        this.visibleInAddressBook = bl2;
    }
}

