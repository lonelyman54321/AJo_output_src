/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import com.ril.ajio.services.data.returnexchange.BasePrice;
import com.ril.ajio.services.data.returnexchange.Product;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import java.io.Serializable;

public class ReturnOrderEntry
implements Serializable {
    private BasePrice basePrice;
    private int bundleDiscountAmount;
    private int entryNumber;
    private String entryStatus;
    private String entryStatusDisplay;
    private boolean isBundleOfferApplicable;
    private TotalPrice luxeTotalPrice;
    private Product product;
    private int quantity;
    private Double shippingChargePromoAmt;
    private String sourceStoreId;
    private TotalPrice totalPrice;
    private boolean updateable;

    public BasePrice getBasePrice() {
        return this.basePrice;
    }

    public int getBundleDiscountAmount() {
        return this.bundleDiscountAmount;
    }

    public int getEntryNumber() {
        return this.entryNumber;
    }

    public String getEntryStatus() {
        return this.entryStatus;
    }

    public String getEntryStatusDisplay() {
        return this.entryStatusDisplay;
    }

    public boolean getIsBundleOfferApplicable() {
        return this.isBundleOfferApplicable;
    }

    public TotalPrice getLuxeTotalPrice() {
        return this.luxeTotalPrice;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Double getShippingChargePromoAmt() {
        return this.shippingChargePromoAmt;
    }

    public String getSourceStoreId() {
        return this.sourceStoreId;
    }

    public TotalPrice getTotalPrice() {
        return this.totalPrice;
    }

    public boolean getUpdateable() {
        return this.updateable;
    }

    public void setBasePrice(BasePrice basePrice) {
        this.basePrice = basePrice;
    }

    public void setBundleDiscountAmount(int n3) {
        this.bundleDiscountAmount = n3;
    }

    public void setEntryNumber(int n3) {
        this.entryNumber = n3;
    }

    public void setEntryStatus(String string2) {
        this.entryStatus = string2;
    }

    public void setEntryStatusDisplay(String string2) {
        this.entryStatusDisplay = string2;
    }

    public void setIsBundleOfferApplicable(boolean bl2) {
        this.isBundleOfferApplicable = bl2;
    }

    public void setLuxeTotalPrice(TotalPrice totalPrice) {
        this.luxeTotalPrice = totalPrice;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }

    public void setShippingChargePromoAmt(Double d2) {
        this.shippingChargePromoAmt = d2;
    }

    public void setSourceStoreId(String string2) {
        this.sourceStoreId = string2;
    }

    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUpdateable(boolean bl2) {
        this.updateable = bl2;
    }
}

