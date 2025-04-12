/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Price;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderGroup
implements Serializable {
    private List entries;
    private Price totalPriceWithTax;

    public DeliveryOrderGroup() {
        ArrayList arrayList;
        this.entries = arrayList = new ArrayList();
    }

    public List getEntries() {
        return this.entries;
    }

    public Price getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    public void setEntries(List list) {
        this.entries = list;
    }

    public void setTotalPriceWithTax(Price price) {
        this.totalPriceWithTax = price;
    }

    public DeliveryOrderGroup withEntries(List list) {
        this.entries = list;
        return this;
    }

    public DeliveryOrderGroup withTotalPriceWithTax(Price price) {
        this.totalPriceWithTax = price;
        return this;
    }
}

