/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart.pickfromstore;

import com.ril.ajio.services.data.Cart.pickfromstore.Country;
import java.io.Serializable;

public class StoreAddress
implements Serializable {
    private String alternateNumber;
    private boolean billingAddress;
    private Country country;
    private boolean defaultAddress;
    private String district;
    private String formattedAddress;
    private String id;
    private boolean isHomeAddress;
    private String landmark;
    private String line1;
    private String line2;
    private String phone;
    private String postalCode;
    private boolean shippingAddress;
    private String state;
    private String town;
    private boolean visibleInAddressBook;

    public String getAlternateNumber() {
        return this.alternateNumber;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getFormattedAddress() {
        return this.formattedAddress;
    }

    public String getId() {
        return this.id;
    }

    public String getLandmark() {
        return this.landmark;
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

    public String getState() {
        return this.state;
    }

    public String getTown() {
        return this.town;
    }

    public boolean isBillingAddress() {
        return this.billingAddress;
    }

    public boolean isDefaultAddress() {
        return this.defaultAddress;
    }

    public boolean isIsHomeAddress() {
        return this.isHomeAddress;
    }

    public boolean isShippingAddress() {
        return this.shippingAddress;
    }

    public boolean isVisibleInAddressBook() {
        return this.visibleInAddressBook;
    }

    public void setAlternateNumber(String string2) {
        this.alternateNumber = string2;
    }

    public void setBillingAddress(boolean bl2) {
        this.billingAddress = bl2;
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

    public void setFormattedAddress(String string2) {
        this.formattedAddress = string2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setIsHomeAddress(boolean bl2) {
        this.isHomeAddress = bl2;
    }

    public void setLandmark(String string2) {
        this.landmark = string2;
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

