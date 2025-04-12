/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class OrderTracking
implements Serializable {
    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String string2) {
        this.key = string2;
    }

    public void setValue(String string2) {
        this.value = string2;
    }
}

