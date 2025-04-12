/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class ImpsDetails
implements Serializable {
    private String extnBankReferenceType;
    private String extnTranAmount;
    private boolean impsFlag;
    private String impsMessage;
    private String impsRRNnumber;
    private String impsStatus;

    public String getExtnBankReferenceType() {
        return this.extnBankReferenceType;
    }

    public String getExtnTranAmount() {
        return this.extnTranAmount;
    }

    public String getImpsMessage() {
        return this.impsMessage;
    }

    public String getImpsRRNnumber() {
        return this.impsRRNnumber;
    }

    public String getImpsStatus() {
        return this.impsStatus;
    }

    public boolean isImpsFlag() {
        return this.impsFlag;
    }

    public void setExtnBankReferenceType(String string2) {
        this.extnBankReferenceType = string2;
    }

    public void setExtnTranAmount(String string2) {
        this.extnTranAmount = string2;
    }

    public void setImpsFlag(boolean bl2) {
        this.impsFlag = bl2;
    }

    public void setImpsMessage(String string2) {
        this.impsMessage = string2;
    }

    public void setImpsRRNnumber(String string2) {
        this.impsRRNnumber = string2;
    }

    public void setImpsStatus(String string2) {
        this.impsStatus = string2;
    }
}

