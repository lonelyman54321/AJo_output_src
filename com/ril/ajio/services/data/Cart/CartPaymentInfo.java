/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.GenericNameCode;
import java.io.Serializable;

public class CartPaymentInfo
implements Serializable {
    private String accountHolderName;
    private CartDeliveryAddress billingAddress;
    private String cardNumber;
    private GenericNameCode cardType;
    private boolean defaultPaymentInfo;
    private String expiryMonth;
    private String expiryYear;
    private String id;
    private boolean saved;

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public CartDeliveryAddress getBillingAddress() {
        return this.billingAddress;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public GenericNameCode getCardType() {
        return this.cardType;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public String getId() {
        return this.id;
    }

    public boolean isDefaultPaymentInfo() {
        return this.defaultPaymentInfo;
    }

    public boolean isSaved() {
        return this.saved;
    }

    public void setAccountHolderName(String string2) {
        this.accountHolderName = string2;
    }

    public void setBillingAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.billingAddress = cartDeliveryAddress;
    }

    public void setCardNumber(String string2) {
        this.cardNumber = string2;
    }

    public void setCardType(GenericNameCode genericNameCode) {
        this.cardType = genericNameCode;
    }

    public void setDefaultPaymentInfo(boolean bl2) {
        this.defaultPaymentInfo = bl2;
    }

    public void setExpiryMonth(String string2) {
        this.expiryMonth = string2;
    }

    public void setExpiryYear(String string2) {
        this.expiryYear = string2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setSaved(boolean bl2) {
        this.saved = bl2;
    }
}

