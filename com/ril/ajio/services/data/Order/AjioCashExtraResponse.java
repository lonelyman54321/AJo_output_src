/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ACashExtraKey;
import com.ril.ajio.services.data.Order.ACashExtraValue;

public class AjioCashExtraResponse {
    private ACashExtraKey key;
    private ACashExtraValue value;

    public ACashExtraKey getKey() {
        return this.key;
    }

    public ACashExtraValue getValue() {
        return this.value;
    }

    public void setKey(ACashExtraKey aCashExtraKey) {
        this.key = aCashExtraKey;
    }

    public void setValue(ACashExtraValue aCashExtraValue) {
        this.value = aCashExtraValue;
    }
}

