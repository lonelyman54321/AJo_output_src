/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.RefundAmountDetails;
import com.ril.ajio.services.data.Order.CancelledRefundDetails;
import java.io.Serializable;
import java.util.ArrayList;

public class OrderDetailLineItem
implements Serializable {
    private String amount;
    private CancelledRefundDetails canceledRefundDetails;
    private String cancellationType;
    private int consignmentCount;
    private boolean eddBreachedFlag;
    private String eddLower;
    private String eddUpper;
    private CartEntry entry;
    private long epochEddUpper;
    private long epochPSD;
    public boolean exchangeReturnCancelled;
    private ArrayList forwardOrderRevampOrderTrackerSection = null;
    private Boolean isPriorityDeliveryApplied;
    private Boolean isPriorityDeliveryBreached;
    public boolean isReturnCancelled;
    private int lineItemQty;
    private int listPosition;
    private String priorityDeliveryFeeStatus;
    private boolean psdBreachedFlag;
    private RefundAmountDetails refundAmountDetails;
    public boolean returnCancelled;
    private String returnEntryMessage;
    private String shipmentMessage;
    private int shipmentPosition;
    public String sourceStoreId;

    public String getAmount() {
        return this.amount;
    }

    public CancelledRefundDetails getCanceledRefundDetails() {
        return this.canceledRefundDetails;
    }

    public String getCancellationType() {
        return this.cancellationType;
    }

    public int getConsignmentCount() {
        return this.consignmentCount;
    }

    public String getEddLower() {
        return this.eddLower;
    }

    public String getEddUpper() {
        return this.eddUpper;
    }

    public CartEntry getEntry() {
        return this.entry;
    }

    public long getEpochEddUpper() {
        long l2 = this.epochEddUpper;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = System.currentTimeMillis();
            l3 = 10000L;
            l2 += l3;
        }
        return l2;
    }

    public long getEpochPSD() {
        long l2 = this.epochPSD;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = System.currentTimeMillis();
            l3 = 10000L;
            l2 += l3;
        }
        return l2;
    }

    public ArrayList getForwardOrderRevampOrderTrackerSection() {
        return this.forwardOrderRevampOrderTrackerSection;
    }

    public int getLineItemQty() {
        return this.lineItemQty;
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public String getMessage() {
        return this.returnEntryMessage;
    }

    public Boolean getPriorityDeliveryApplied() {
        return this.isPriorityDeliveryApplied;
    }

    public Boolean getPriorityDeliveryBreached() {
        return this.isPriorityDeliveryBreached;
    }

    public String getPriorityDeliveryFeeStatus() {
        return this.priorityDeliveryFeeStatus;
    }

    public RefundAmountDetails getRefundAmountDetails() {
        return this.refundAmountDetails;
    }

    public String getReturnEntryMessage() {
        return this.returnEntryMessage;
    }

    public String getShipmentMessage() {
        return this.shipmentMessage;
    }

    public int getShipmentPosition() {
        return this.shipmentPosition;
    }

    public String getSourceStoreId() {
        return this.sourceStoreId;
    }

    public ArrayList getTrackerList() {
        return this.forwardOrderRevampOrderTrackerSection;
    }

    public boolean isEddBreachedFlag() {
        return this.eddBreachedFlag;
    }

    public boolean isExchangeReturnCancelled() {
        return this.exchangeReturnCancelled;
    }

    public boolean isPsdBreachedFlag() {
        return this.psdBreachedFlag;
    }

    public boolean isReturnCancelled() {
        return this.returnCancelled;
    }

    public boolean isReturnCancelledStatus() {
        return this.isReturnCancelled;
    }

    public void setAmount(String string2) {
        this.amount = string2;
    }

    public void setCanceledRefundDetails(CancelledRefundDetails cancelledRefundDetails) {
        this.canceledRefundDetails = cancelledRefundDetails;
    }

    public void setCancellationType(String string2) {
        this.cancellationType = string2;
    }

    public void setConsignmentCount(int n3) {
        this.consignmentCount = n3;
    }

    public void setEddBreachedFlag(boolean bl2) {
        this.eddBreachedFlag = bl2;
    }

    public void setEddLower(String string2) {
        this.eddLower = string2;
    }

    public void setEddUpper(String string2) {
        this.eddUpper = string2;
    }

    public void setEntry(CartEntry cartEntry) {
        this.entry = cartEntry;
    }

    public void setEpochEddUpper(long l2) {
        this.epochEddUpper = l2;
    }

    public void setEpochPSD(long l2) {
        this.epochPSD = l2;
    }

    public void setExchangeReturnCancelled(boolean bl2) {
        this.exchangeReturnCancelled = bl2;
    }

    public void setForwardOrderRevampOrderTrackerSection(ArrayList arrayList) {
        this.forwardOrderRevampOrderTrackerSection = arrayList;
    }

    public void setLineItemQty(int n3) {
        this.lineItemQty = n3;
    }

    public void setListPosition(int n3) {
        this.listPosition = n3;
    }

    public void setOrderDetailData(int n3, int n4, int n7) {
        this.shipmentPosition = n3;
        this.listPosition = n4;
        this.consignmentCount = n7;
    }

    public void setPriorityDeliveryApplied(Boolean bl2) {
        this.isPriorityDeliveryApplied = bl2;
    }

    public void setPriorityDeliveryBreached(Boolean bl2) {
        this.isPriorityDeliveryBreached = bl2;
    }

    public void setPriorityDeliveryFeeStatus(String string2) {
        this.priorityDeliveryFeeStatus = string2;
    }

    public void setPsdBreachedFlag(boolean bl2) {
        this.psdBreachedFlag = bl2;
    }

    public void setRefundAmountDetails(RefundAmountDetails refundAmountDetails) {
        this.refundAmountDetails = refundAmountDetails;
    }

    public void setReturnCancelled(boolean bl2) {
        this.returnCancelled = bl2;
    }

    public void setReturnCancelledStatus(boolean bl2) {
        this.isReturnCancelled = bl2;
    }

    public void setReturnEntryMessage(String string2) {
        this.returnEntryMessage = string2;
    }

    public void setShipmentMessage(String string2) {
        this.shipmentMessage = string2;
    }

    public void setShipmentPosition(int n3) {
        this.shipmentPosition = n3;
    }

    public void setSourceStoreId(String string2) {
        this.sourceStoreId = string2;
    }
}

