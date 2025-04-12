/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.InitiateReturnRequestResponse;
import com.ril.ajio.services.data.Order.InitiateReturnRequestResponse$ReturnsKeyValue;
import java.io.Serializable;

public class InitiateReturnRequestResponse$ReturnedRequestMap
implements Serializable {
    private InitiateReturnRequestResponse.ReturnsKeyValue key;
    final /* synthetic */ InitiateReturnRequestResponse this$0;
    private String value;

    public InitiateReturnRequestResponse$ReturnedRequestMap(InitiateReturnRequestResponse initiateReturnRequestResponse) {
        this.this$0 = initiateReturnRequestResponse;
    }

    public InitiateReturnRequestResponse.ReturnsKeyValue getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(InitiateReturnRequestResponse.ReturnsKeyValue returnsKeyValue) {
        this.key = returnsKeyValue;
    }

    public void setValue(String string2) {
        this.value = string2;
    }
}

