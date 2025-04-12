/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Address;

public final class PostalCheck {
    private String city;
    private String district;
    private boolean invalidpostalcode;
    private String state;
    private String zone;

    public PostalCheck(String string2, String string3, boolean bl2, String string4, String string5) {
        this.district = string2;
        this.city = string3;
        this.invalidpostalcode = bl2;
        this.state = string4;
        this.zone = string5;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final boolean getInvalidpostalcode() {
        return this.invalidpostalcode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZone() {
        return this.zone;
    }

    public final void setCity(String string2) {
        this.city = string2;
    }

    public final void setDistrict(String string2) {
        this.district = string2;
    }

    public final void setInvalidpostalcode(boolean bl2) {
        this.invalidpostalcode = bl2;
    }

    public final void setState(String string2) {
        this.state = string2;
    }

    public final void setZone(String string2) {
        this.zone = string2;
    }
}

