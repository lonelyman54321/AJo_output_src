/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order.orderhistory;

import java.io.Serializable;

public class StatusHistory
implements Serializable {
    private String description;
    private int quantity;
    private String status;
    private String updateDate;

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }

    public void setUpdateDate(String string2) {
        this.updateDate = string2;
    }
}

