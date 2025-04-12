/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails$KeyValue;
import java.io.Serializable;

public class ReturnOrderItemDetails$ReturnedQtyMap
implements Serializable {
    private ReturnOrderItemDetails$KeyValue key;
    final /* synthetic */ ReturnOrderItemDetails this$0;
    private ReturnOrderItemDetails$KeyValue value;

    public ReturnOrderItemDetails$ReturnedQtyMap(ReturnOrderItemDetails returnOrderItemDetails) {
        this.this$0 = returnOrderItemDetails;
    }

    public ReturnOrderItemDetails$KeyValue getKey() {
        return this.key;
    }

    public ReturnOrderItemDetails$KeyValue getValue() {
        return this.value;
    }

    public void setKey(ReturnOrderItemDetails$KeyValue returnOrderItemDetails$KeyValue) {
        this.key = returnOrderItemDetails$KeyValue;
    }

    public void setValue(ReturnOrderItemDetails$KeyValue returnOrderItemDetails$KeyValue) {
        this.value = returnOrderItemDetails$KeyValue;
    }
}

