/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

public final class ShipmentInvoice {
    private boolean hasError;
    private String invoicePdfContent;
    private String orderId;
    private String shipmentCode;

    public String getInvoicePdfContent() {
        return this.invoicePdfContent;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getShipmentCode() {
        return this.shipmentCode;
    }

    public boolean isHasError() {
        return this.hasError;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setShipmentCode(String string2) {
        this.shipmentCode = string2;
    }
}

