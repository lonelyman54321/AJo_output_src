/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.ImpsDetails;
import com.ril.ajio.services.data.Order.NextStepsSection;
import com.ril.ajio.services.data.Order.ReturnRefundAmount;
import com.ril.ajio.services.data.Order.ReturnRefundNewReturnCreation;
import com.ril.ajio.services.data.Order.ReturnRefundPickUpReason;
import com.ril.ajio.services.data.Order.ReturnRequestCancelledPopUp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class ReturnRequest
implements Serializable {
    private float amount;
    private String bankReferenceNumber;
    private String cancelledTrackerMessageBody;
    private int consignmentCount;
    private String created;
    private boolean droppedAtStore;
    private String exchangeCancelMessage;
    private String exchangeCanceledDate;
    private String exchangeOrderID;
    private String exchangeRTOMessage;
    private ArrayList forwardOrderRevampOrderTrackerSection;
    private float impsAmount = -1.0f;
    private ImpsDetails impsDetails;
    private boolean impsDetailsRequired;
    private boolean impsFailed;
    private boolean impsFlag;
    private Boolean isExchangeRTO;
    private Boolean isExchangeReturnRTO;
    private Boolean isPriorityDeliveryApplied;
    private Boolean isPriorityDeliveryBreached;
    private boolean isReturnCancelAvailable;
    private boolean isReturnFeeRefunded;
    private boolean isReturnonHold;
    private boolean isSelfShipOrder = false;
    private int listPosition;
    private NextStepsSection nextStepsSection;
    public ArrayList optedPaymentModeReturnList;
    private CartDeliveryAddress pickupAddress;
    private Double priorityDeliveryFee;
    private String priorityDeliveryFeeStatus;
    private String promisePickupDate;
    private ReturnRefundAmount refundAmountSection;
    private List refundAmounts;
    private Boolean refundCTAEnabled;
    private ReturnRefundNewReturnCreation refundCancelReturnSection;
    private String refundInfoMesage;
    private ReturnRefundPickUpReason refundPickupSection;
    private String returnCancelCtaMessage;
    private CartDeliveryAddress returnCancelPickupAddress;
    private List returnCancelledEntries = null;
    private List returnEntries = null;
    private String returnId;
    private String returnMessage;
    private ArrayList returnOrderTracker;
    private ReturnRequestCancelledPopUp returnRequestCancelledPopUp;
    private String returnRequestedOnMessage;
    private String returnRequests;
    private String returnRevampTopicName;
    private String returnStatus;
    private String rtoExchangeCanMsg;
    private String selfshipCreditAmt;
    private int shipmentPosition;
    private boolean showReasonPopup;
    private float totalAmount;
    private Double totalReturnFee;
    private String verificationDate;
    private CartDeliveryAddress warehouseAddress;

    public float getAmount() {
        return this.amount;
    }

    public String getBankReferenceNumber() {
        return this.bankReferenceNumber;
    }

    public String getCancelledTrackerMessageBody() {
        String string2 = this.cancelledTrackerMessageBody;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public int getConsignmentCount() {
        return this.consignmentCount;
    }

    public String getCreated() {
        return this.created;
    }

    public String getExchangeCancelMessage() {
        String string2 = this.exchangeCancelMessage;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public String getExchangeCanceledDate() {
        String string2 = this.exchangeCanceledDate;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public String getExchangeOrderID() {
        return this.exchangeOrderID;
    }

    public Boolean getExchangeRTO() {
        Boolean bl2 = this.isExchangeRTO;
        if (bl2 == null) {
            bl2 = Boolean.FALSE;
        }
        return bl2;
    }

    public String getExchangeRTOMessage() {
        String string2 = this.exchangeRTOMessage;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public Boolean getExchangeReturnRTO() {
        Boolean bl2 = this.isExchangeReturnRTO;
        if (bl2 == null) {
            bl2 = Boolean.FALSE;
        }
        return bl2;
    }

    public ArrayList getForwardOrderRevampOrderTrackerSection() {
        return this.forwardOrderRevampOrderTrackerSection;
    }

    public float getImpsAmount() {
        return this.impsAmount;
    }

    public ImpsDetails getImpsDetails() {
        return this.impsDetails;
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public NextStepsSection getNextStepsSection() {
        return this.nextStepsSection;
    }

    public ArrayList getOptedPaymentModeReturnList() {
        return this.optedPaymentModeReturnList;
    }

    public CartDeliveryAddress getPickupAddress() {
        return this.pickupAddress;
    }

    public Boolean getPriorityDeliveryApplied() {
        return this.isPriorityDeliveryApplied;
    }

    public Boolean getPriorityDeliveryBreached() {
        return this.isPriorityDeliveryBreached;
    }

    public Double getPriorityDeliveryFee() {
        return this.priorityDeliveryFee;
    }

    public String getPriorityDeliveryFeeStatus() {
        return this.priorityDeliveryFeeStatus;
    }

    public String getPromisePickupDate() {
        return this.promisePickupDate;
    }

    public ReturnRefundAmount getRefundAmountSection() {
        return this.refundAmountSection;
    }

    public List getRefundAmounts() {
        return this.refundAmounts;
    }

    public Boolean getRefundCTAEnabled() {
        return this.refundCTAEnabled;
    }

    public ReturnRefundNewReturnCreation getRefundCancelReturnSection() {
        return this.refundCancelReturnSection;
    }

    public String getRefundInfoMesage() {
        String string2 = this.refundInfoMesage;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public ReturnRefundPickUpReason getRefundPickupSection() {
        return this.refundPickupSection;
    }

    public String getReturnCancelCtaMessage() {
        return this.returnCancelCtaMessage;
    }

    public CartDeliveryAddress getReturnCancelPickupAddress() {
        return this.returnCancelPickupAddress;
    }

    public List getReturnCancelledEntries() {
        return this.returnCancelledEntries;
    }

    public List getReturnEntries() {
        return this.returnEntries;
    }

    public String getReturnId() {
        return this.returnId;
    }

    public String getReturnMessage() {
        return this.returnMessage;
    }

    public ArrayList getReturnOrderTracker() {
        return this.returnOrderTracker;
    }

    public ReturnRequestCancelledPopUp getReturnRequestCancelledPopUp() {
        return this.returnRequestCancelledPopUp;
    }

    public String getReturnRequestedOnMessage() {
        return this.returnRequestedOnMessage;
    }

    public String getReturnRequests() {
        String string2 = this.returnRequests;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public String getReturnRevampTopicName() {
        return this.returnRevampTopicName;
    }

    public String getReturnStatus() {
        return this.returnStatus;
    }

    public String getRtoExchangeCanMsg() {
        String string2 = this.rtoExchangeCanMsg;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    public String getSelfshipCreditAmt() {
        return this.selfshipCreditAmt;
    }

    public int getShipmentPosition() {
        return this.shipmentPosition;
    }

    public float getTotalAmount() {
        return this.totalAmount;
    }

    public String getVerificationDate() {
        return this.verificationDate;
    }

    public CartDeliveryAddress getWarehouseAddress() {
        return this.warehouseAddress;
    }

    public boolean isDroppedAtStore() {
        return this.droppedAtStore;
    }

    public boolean isImpsDetailsRequired() {
        return this.impsDetailsRequired;
    }

    public boolean isImpsFailed() {
        return this.impsFailed;
    }

    public boolean isImpsFlag() {
        return this.impsFlag;
    }

    public boolean isReturnCancelAvailable() {
        return this.isReturnCancelAvailable;
    }

    public boolean isReturnonHold() {
        return this.isReturnonHold;
    }

    public boolean isSelfShipOrder() {
        return this.isSelfShipOrder;
    }

    public boolean isShowReasonPopup() {
        return this.showReasonPopup;
    }

    public void setBankReferenceNumber(String string2) {
        this.bankReferenceNumber = string2;
    }

    public void setCreated(String string2) {
        this.created = string2;
    }

    public void setExchangeCancelMessage(String string2) {
        this.exchangeCancelMessage = string2;
    }

    public void setExchangeCanceledDate(String string2) {
        this.exchangeCanceledDate = string2;
    }

    public void setExchangeRTO(Boolean bl2) {
        this.isExchangeRTO = bl2;
    }

    public void setExchangeRTOMessage(String string2) {
        this.exchangeRTOMessage = string2;
    }

    public void setExchangeReturnRTO(Boolean bl2) {
        this.isExchangeReturnRTO = bl2;
    }

    public void setImpsDetails(ImpsDetails impsDetails) {
        this.impsDetails = impsDetails;
    }

    public void setImpsDetailsRequired(boolean bl2) {
        this.impsDetailsRequired = bl2;
    }

    public void setImpsFailed(boolean bl2) {
        this.impsFailed = bl2;
    }

    public void setOptedPaymentModeOrderList(ArrayList arrayList) {
        this.optedPaymentModeReturnList = arrayList;
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

    public void setPriorityDeliveryFee(Double d2) {
        this.priorityDeliveryFee = d2;
    }

    public void setPriorityDeliveryFeeStatus(String string2) {
        this.priorityDeliveryFeeStatus = string2;
    }

    public void setPromisePickupDate(String string2) {
        this.promisePickupDate = string2;
    }

    public void setRefundAmounts(List list) {
        this.refundAmounts = list;
    }

    public void setRefundCTAEnabled(Boolean bl2) {
        this.refundCTAEnabled = bl2;
    }

    public void setRefundInfoMesage(String string2) {
        this.refundInfoMesage = string2;
    }

    public void setReturnCancelAvailable(boolean bl2) {
        this.isReturnCancelAvailable = bl2;
    }

    public void setReturnCancelCtaMessage(String string2) {
        this.returnCancelCtaMessage = string2;
    }

    public void setReturnCancelledEntries(List list) {
        this.returnCancelledEntries = list;
    }

    public void setReturnRequests(String string2) {
        this.returnRequests = string2;
    }

    public void setReturnRevampTopicName(String string2) {
        this.returnRevampTopicName = string2;
    }

    public void setReturnonHold(boolean bl2) {
        this.isReturnonHold = bl2;
    }

    public void setRtoExchangeCanMsg(String string2) {
        this.rtoExchangeCanMsg = string2;
    }

    public void setSelfshipCreditAmt(String string2) {
        this.selfshipCreditAmt = string2;
    }

    public void setShowReasonPopup(boolean bl2) {
        this.showReasonPopup = bl2;
    }

    public void setTotalAmount(float f5) {
        this.totalAmount = f5;
    }

    public void setVerificationDate(String string2) {
        this.verificationDate = string2;
    }
}

