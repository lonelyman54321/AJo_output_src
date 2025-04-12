/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public class OosAndPartlyStockedproduct
implements Serializable {
    private String key;
    private Integer value;

    public String getKey() {
        return this.key;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setKey(String string2) {
        this.key = string2;
    }

    public void setValue(Integer n3) {
        this.value = n3;
    }
}

