/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.InitiateReturnRequestResponse;
import java.io.Serializable;

public class InitiateReturnRequestResponse$ReturnsKeyValue
implements Serializable {
    final /* synthetic */ InitiateReturnRequestResponse this$0;
    private String type;
    private String value;

    public InitiateReturnRequestResponse$ReturnsKeyValue(InitiateReturnRequestResponse initiateReturnRequestResponse) {
        this.this$0 = initiateReturnRequestResponse;
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

