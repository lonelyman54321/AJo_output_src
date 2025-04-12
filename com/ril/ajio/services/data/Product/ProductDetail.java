/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;

public class ProductDetail {
    private boolean codEligible;
    private String cutOffTime;
    private Double deliveryFee;
    private String deliveryMethod;
    private String deliverySLA;
    private String deliverySLAName;
    private String eddLower;
    private String eddUpper;
    private String formattedDate;
    private boolean isGiftProduct;
    private ServicabilityInfo$PriorityDelivery priorityDelivery;
    private String productCode;
    private String promiseShippingDate;
    private String reasonForNotServiceability;
    private boolean servicability;

    public String getCutOffTime() {
        return this.cutOffTime;
    }

    public Double getDeliveryFee() {
        return this.deliveryFee;
    }

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public String getDeliverySLA() {
        return this.deliverySLA;
    }

    public String getDeliverySLAName() {
        return this.deliverySLAName;
    }

    public String getEddLower() {
        return this.eddLower;
    }

    public String getEddUpper() {
        return this.eddUpper;
    }

    public String getFormattedDate() {
        return this.formattedDate;
    }

    public ServicabilityInfo$PriorityDelivery getPriorityDelivery() {
        return this.priorityDelivery;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getPromiseShippingDate() {
        return this.promiseShippingDate;
    }

    public String getReasonForNotServiceability() {
        return this.reasonForNotServiceability;
    }

    public boolean isCodEligible() {
        return this.codEligible;
    }

    public boolean isGiftProduct() {
        return this.isGiftProduct;
    }

    public boolean isServicability() {
        return this.servicability;
    }

    public void setCodEligible(boolean bl2) {
        this.codEligible = bl2;
    }

    public void setCutOffTime(String string2) {
        this.cutOffTime = string2;
    }

    public void setDeliveryFee(Double d2) {
        this.deliveryFee = d2;
    }

    public void setDeliveryMethod(String string2) {
        this.deliveryMethod = string2;
    }

    public void setDeliverySLA(String string2) {
        this.deliverySLA = string2;
    }

    public void setDeliverySLAName(String string2) {
        this.deliverySLAName = string2;
    }

    public void setEddLower(String string2) {
        this.eddLower = string2;
    }

    public void setEddUpper(String string2) {
        this.eddUpper = string2;
    }

    public void setFormattedDate(String string2) {
        this.formattedDate = string2;
    }

    public void setGiftProduct(boolean bl2) {
        this.isGiftProduct = bl2;
    }

    public void setPriorityDelivery(ServicabilityInfo$PriorityDelivery servicabilityInfo$PriorityDelivery) {
        this.priorityDelivery = servicabilityInfo$PriorityDelivery;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setPromiseShippingDate(String string2) {
        this.promiseShippingDate = string2;
    }

    public void setReasonForNotServiceability(String string2) {
        this.reasonForNotServiceability = string2;
    }

    public void setServicability(boolean bl2) {
        this.servicability = bl2;
    }
}

