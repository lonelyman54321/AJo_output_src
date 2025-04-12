/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;

public class ReturnOrderItemDetails$KeyValue
implements Serializable {
    final /* synthetic */ ReturnOrderItemDetails this$0;
    private String type;
    private String value;

    public ReturnOrderItemDetails$KeyValue(ReturnOrderItemDetails returnOrderItemDetails) {
        this.this$0 = returnOrderItemDetails;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(String string2) {
        this.type = string2;
    }

    public void setValue(String string2) {
        this.value = string2;
    }
}

