/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.io.Serializable;
import java.util.ArrayList;

public class InitiateReturnRequestResponse
implements Serializable {
    private CartDeliveryAddress deliveryAddress;
    private String refundInitiateDate;
    private String returnConsignmentCode;
    private ArrayList returnEntries;
    private String returnOrderCode;
    private String returnPickupDate;
    private String returnRequestCode;
    private ArrayList returnRequestMap;
    private boolean selfShipReturn;
    private CartDeliveryAddress warehouseAddress;

    public CartDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public String getRefundInitiateDate() {
        return this.refundInitiateDate;
    }

    public String getReturnConsignmentCode() {
        return this.returnConsignmentCode;
    }

    public ArrayList getReturnEntries() {
        return this.returnEntries;
    }

    public String getReturnOrderCode() {
        return this.returnOrderCode;
    }

    public String getReturnPickupDate() {
        return this.returnPickupDate;
    }

    public String getReturnRequestCode() {
        return this.returnRequestCode;
    }

    public ArrayList getReturnRequestMap() {
        return this.returnRequestMap;
    }

    public CartDeliveryAddress getWarehouseAddress() {
        return this.warehouseAddress;
    }

    public boolean isSelfShipReturn() {
        return this.selfShipReturn;
    }

    public void setDeliveryAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.deliveryAddress = cartDeliveryAddress;
    }

    public void setRefundInitiateDate(String string2) {
        this.refundInitiateDate = string2;
    }

    public void setReturnConsignmentCode(String string2) {
        this.returnConsignmentCode = string2;
    }

    public void setReturnEntries(ArrayList arrayList) {
        this.returnEntries = arrayList;
    }

    public void setReturnOrderCode(String string2) {
        this.returnOrderCode = string2;
    }

    public void setReturnPickupDate(String string2) {
        this.returnPickupDate = string2;
    }

    public void setReturnRequestCode(String string2) {
        this.returnRequestCode = string2;
    }

    public void setReturnRequestMap(ArrayList arrayList) {
        this.returnRequestMap = arrayList;
    }

    public void setSelfShipReturn(boolean bl2) {
        this.selfShipReturn = bl2;
    }

    public void setWarehouseAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.warehouseAddress = cartDeliveryAddress;
    }
}

