/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Pagination;
import java.util.List;

public class CartOrders {
    private List orders;
    private Pagination pagination;

    public List getOrders() {
        return this.orders;
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public void setOrders(List list) {
        this.orders = list;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}

