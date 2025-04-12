/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Address;

import java.io.Serializable;
import java.util.ArrayList;

public class CartDeliveryAddressInfo
implements Serializable {
    private ArrayList addresses;
    private String preferredStorePincode;
    private int showStorePickUpTabForUser;

    public ArrayList getAddresses() {
        return this.addresses;
    }

    public String getPreferredStorePincode() {
        return this.preferredStorePincode;
    }

    public int getShowStorePickUpTabForUser() {
        return this.showStorePickUpTabForUser;
    }

    public void setAddresses(ArrayList arrayList) {
        this.addresses = arrayList;
    }

    public void setPreferredStorePincode(String string2) {
        this.preferredStorePincode = string2;
    }

    public void setShowStorePickUpTabForUser(int n3) {
        this.showStorePickUpTabForUser = n3;
    }
}

