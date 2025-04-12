/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import java.io.Serializable;
import java.util.ArrayList;

public class ReturnExchange
implements Serializable {
    private CartDeliveryAddress deliveryAddress;
    private ArrayList exchangeEntries;
    private String exchangeRequestCode;
    private boolean isReturnonHold;
    private TotalPrice luxeTotalPrice;
    private ArrayList messages;
    private Float refundAmount;
    private ArrayList refundAtDoorstepMessages;
    private String refundInitiateDate;
    private String returnConsignmentCode;
    private ArrayList returnEntries;
    private String returnOrderCode;
    private String returnPickupDate;
    private String returnRefundType;
    private String returnRequestCode;
    private String returnVerificationDate;
    private boolean selfShipReturn;
    private TotalPrice totalPrice;
    private CartDeliveryAddress warehouseAddress;

    public CartDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public ArrayList getExchangeEntries() {
        return this.exchangeEntries;
    }

    public String getExchangeRequestCode() {
        return this.exchangeRequestCode;
    }

    public TotalPrice getLuxeTotalPrice() {
        return this.luxeTotalPrice;
    }

    public ArrayList getMessages() {
        return this.messages;
    }

    public Float getRefundAmount() {
        return this.refundAmount;
    }

    public ArrayList getRefundAtDoorstepMessages() {
        return this.refundAtDoorstepMessages;
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

    public String getReturnRefundType() {
        return this.returnRefundType;
    }

    public String getReturnRequestCode() {
        return this.returnRequestCode;
    }

    public String getReturnVerificationDate() {
        return this.returnVerificationDate;
    }

    public boolean getSelfShipReturn() {
        return this.selfShipReturn;
    }

    public TotalPrice getTotalPrice() {
        return this.totalPrice;
    }

    public CartDeliveryAddress getWarehouseAddress() {
        return this.warehouseAddress;
    }

    public boolean isReturnonHold() {
        return this.isReturnonHold;
    }

    public void setDeliveryAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.deliveryAddress = cartDeliveryAddress;
    }

    public void setExchangeEntries(ArrayList arrayList) {
        this.exchangeEntries = arrayList;
    }

    public void setExchangeRequestCode(String string2) {
        this.exchangeRequestCode = string2;
    }

    public void setLuxeTotalPrice(TotalPrice totalPrice) {
        this.luxeTotalPrice = totalPrice;
    }

    public void setRefundAmount(Float f5) {
        this.refundAmount = f5;
    }

    public void setRefundAtDoorstepMessages(ArrayList arrayList) {
        this.refundAtDoorstepMessages = arrayList;
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

    public void setReturnRefundType(String string2) {
        this.returnRefundType = string2;
    }

    public void setReturnRequestCode(String string2) {
        this.returnRequestCode = string2;
    }

    public void setReturnVerificationDate(String string2) {
        this.returnVerificationDate = string2;
    }

    public void setReturnonHold(boolean bl2) {
        this.isReturnonHold = bl2;
    }

    public void setSelfShipReturn(boolean bl2) {
        this.selfShipReturn = bl2;
    }

    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setWarehouseAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.warehouseAddress = cartDeliveryAddress;
    }
}

