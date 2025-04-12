/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.query;

import java.io.Serializable;

public class QueryDeliveryAddress
implements Serializable {
    private String adID;
    private String addressId;
    private String storeId;

    public String getAdID() {
        return this.adID;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setAdID(String string2) {
        this.adID = string2;
    }

    public void setAddressId(String string2) {
        this.addressId = string2;
    }

    public void setStoreId(String string2) {
        this.storeId = string2;
    }
}

