/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public class ReturnExchangeCtaMessageList
implements Serializable {
    private String exchangeMessage;
    private boolean isExchangeable;
    private Boolean isReturnWindowExpired;
    private boolean isReturnable;
    private String returnMessage;
    private String topHeader;
    private String topLinkCode;
    private String topLinkURL;

    public String getExchangeMessage() {
        return this.exchangeMessage;
    }

    public Boolean getIsReturnWindowExpired() {
        return this.isReturnWindowExpired;
    }

    public String getReturnMessage() {
        return this.returnMessage;
    }

    public String getTopHeader() {
        return this.topHeader;
    }

    public String getTopLinkCode() {
        return this.topLinkCode;
    }

    public String getTopLinkURL() {
        return this.topLinkURL;
    }

    public boolean isExchangeable() {
        return this.isExchangeable;
    }

    public boolean isReturnable() {
        return this.isReturnable;
    }

    public void setExchangeMessage(String string2) {
        this.exchangeMessage = string2;
    }

    public void setExchangeable(boolean bl2) {
        this.isExchangeable = bl2;
    }

    public void setIsReturnWindowExpired(Boolean bl2) {
        this.isReturnWindowExpired = bl2;
    }

    public void setReturnMessage(String string2) {
        this.returnMessage = string2;
    }

    public void setReturnable(boolean bl2) {
        this.isReturnable = bl2;
    }

    public void setTopHeader(String string2) {
        this.topHeader = string2;
    }

    public void setTopLinkCode(String string2) {
        this.topLinkCode = string2;
    }

    public void setTopLinkURL(String string2) {
        this.topLinkURL = string2;
    }
}

