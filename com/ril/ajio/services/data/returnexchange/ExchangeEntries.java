/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import com.ril.ajio.services.data.returnexchange.ReturnOrderEntry;
import java.io.Serializable;

public class ExchangeEntries
implements Serializable {
    private String productCode;
    private String reason;
    private ReturnOrderEntry returnOrderEntry;
    private int returnedQty;
    private String subReason;

    public String getProductCode() {
        return this.productCode;
    }

    public String getReason() {
        return this.reason;
    }

    public ReturnOrderEntry getReturnOrderEntry() {
        return this.returnOrderEntry;
    }

    public int getReturnedQty() {
        return this.returnedQty;
    }

    public String getSubReason() {
        return this.subReason;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setReason(String string2) {
        this.reason = string2;
    }

    public void setReturnOrderEntry(ReturnOrderEntry returnOrderEntry) {
        this.returnOrderEntry = returnOrderEntry;
    }

    public void setReturnedQty(int n3) {
        this.returnedQty = n3;
    }

    public void setSubReason(String string2) {
        this.subReason = string2;
    }
}

