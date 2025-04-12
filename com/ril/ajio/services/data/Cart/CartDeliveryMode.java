/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import com.ril.ajio.services.data.Price;
import java.io.Serializable;

public class CartDeliveryMode
implements Serializable {
    private String code;
    private Price deliveryCost;
    private String description;
    private String name;

    public CartDeliveryMode() {
    }

    public CartDeliveryMode(Parcel object) {
        String string2;
        this.code = string2 = object.readString();
        this.name = string2 = object.readString();
        this.description = string2 = object.readString();
        object = (Price)object.readSerializable();
        this.deliveryCost = object;
    }

    public String getCode() {
        return this.code;
    }

    public Price getDeliveryCost() {
        return this.deliveryCost;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setDeliveryCost(Price price) {
        this.deliveryCost = price;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }
}

