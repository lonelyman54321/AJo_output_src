/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;

public class ReturnOrderItemDetails$ErrorMessage
implements Serializable {
    private String key;
    final /* synthetic */ ReturnOrderItemDetails this$0;
    private String value;

    public ReturnOrderItemDetails$ErrorMessage(ReturnOrderItemDetails returnOrderItemDetails) {
        this.this$0 = returnOrderItemDetails;
    }

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

