/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import java.io.Serializable;
import java.util.ArrayList;

public class ReturnExchangeResponse
implements Serializable {
    private String methodOfPayment;
    private ArrayList responseDetails = null;

    public String getMethodOfPayment() {
        return this.methodOfPayment;
    }

    public ArrayList getResponseDetails() {
        return this.responseDetails;
    }

    public void setMethodOfPayment(String string2) {
        this.methodOfPayment = string2;
    }

    public void setResponseDetails(ArrayList arrayList) {
        this.responseDetails = arrayList;
    }
}

