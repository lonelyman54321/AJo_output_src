/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$KeyValue;
import java.io.Serializable;

public class ReturnOrderItemDetails$ExchangeSubReasons
implements Serializable {
    private ReturnOrderItemDetails$KeyValue key;
    final /* synthetic */ ReturnOrderItemDetails this$0;
    private String value;

    public ReturnOrderItemDetails$ExchangeSubReasons(ReturnOrderItemDetails returnOrderItemDetails) {
        this.this$0 = returnOrderItemDetails;
    }

    public ReturnOrderItemDetails$KeyValue getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(ReturnOrderItemDetails$KeyValue returnOrderItemDetails$KeyValue) {
        this.key = returnOrderItemDetails$KeyValue;
    }

    public void setValue(String string2) {
        this.value = string2;
    }
}

