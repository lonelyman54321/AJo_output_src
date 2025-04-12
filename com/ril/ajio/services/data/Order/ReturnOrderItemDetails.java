/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.user.AffiliateData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ReturnOrderItemDetails
implements Serializable {
    private String accountName;
    private String accountNumber;
    private ActionContent actionContent;
    private AffiliateData affiliateData;
    private ArrayList cancelledQtyMap;
    private String confirmAccountNumber;
    private Consignment consignment;
    private String consignmentCode;
    private String defaultAddressId;
    private CartDeliveryAddress deliveryAddress;
    private CartDeliveryAddress differentAddress;
    private ArrayList exchangeReasons;
    private ArrayList exchangeSubReasons;
    private String ifscCode;
    private boolean isAccountNumberInvalid;
    private boolean isAjioStoreCreditsSelected;
    private boolean isConfirmAccountNumberInvalid;
    private boolean isDifferentAddressSelected;
    private boolean isDisclaimerSelected;
    private boolean isIFSCCodeInvalid;
    private boolean isRefundToBankSelected;
    private boolean isSameAddressSelected;
    private boolean isSelfShip;
    private boolean isStorePickUp;
    private boolean isWarehouseAddressSelected;
    private ArrayList messages;
    private String orderCode;
    private String originalOrderId;
    private boolean otpVerificationRequired;
    private ArrayList products;
    private Float refundAmount;
    private ArrayList refundOptions;
    private ArrayList returnOrderEntryQtyMap;
    private String returnQuickInfoUrl;
    private ArrayList returnReasons;
    private ArrayList returnSubReasons;
    private ArrayList returnedQtyMap;
    private ArrayList selectedControllerConfirmedList;
    private ArrayList selectedControllerList;
    private HashMap selectedList;
    private String selectedRefundOption;
    private boolean selfShipReturn;
    private String selfshipCreditAmt;
    private ArrayList validExchangableProducts;
    private ArrayList validReturnableProducts;
    private CartDeliveryAddress warehouseAddress;

    public ReturnOrderItemDetails() {
        Serializable serializable;
        this.refundAmount = serializable = Float.valueOf(0.0f);
        this.selectedControllerList = serializable;
        super();
        this.selectedControllerConfirmedList = serializable;
        super();
        this.selectedList = serializable;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public ActionContent getActionContent() {
        return this.actionContent;
    }

    public AffiliateData getAffiliateData() {
        return this.affiliateData;
    }

    public ArrayList getCancelledQtyMap() {
        return this.cancelledQtyMap;
    }

    public String getConfirmAccountNumber() {
        return this.confirmAccountNumber;
    }

    public Consignment getConsignment() {
        return this.consignment;
    }

    public String getConsignmentCode() {
        return this.consignmentCode;
    }

    public String getDefaultAddressId() {
        return this.defaultAddressId;
    }

    public CartDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CartDeliveryAddress getDifferentAddress() {
        return this.differentAddress;
    }

    public ArrayList getExchangeReasons() {
        return this.exchangeReasons;
    }

    public ArrayList getExchangeSubReasons() {
        return this.exchangeSubReasons;
    }

    public String getIfscCode() {
        return this.ifscCode;
    }

    public ArrayList getMessages() {
        return this.messages;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public ArrayList getProducts() {
        return this.products;
    }

    public Float getRefundAmount() {
        return this.refundAmount;
    }

    public ArrayList getRefundOptions() {
        return this.refundOptions;
    }

    public ArrayList getReturnOrderEntryQtyMap() {
        return this.returnOrderEntryQtyMap;
    }

    public String getReturnQuickInfoUrl() {
        return this.returnQuickInfoUrl;
    }

    public ArrayList getReturnReasons() {
        return this.returnReasons;
    }

    public ArrayList getReturnSubReasons() {
        return this.returnSubReasons;
    }

    public ArrayList getReturnedQtyMap() {
        return this.returnedQtyMap;
    }

    public ArrayList getSelectedControllerConfirmedList() {
        return this.selectedControllerConfirmedList;
    }

    public ArrayList getSelectedControllerList() {
        return this.selectedControllerList;
    }

    public HashMap getSelectedList() {
        return this.selectedList;
    }

    public String getSelectedRefundOption() {
        return this.selectedRefundOption;
    }

    public String getSelfshipCreditAmt() {
        return this.selfshipCreditAmt;
    }

    public ArrayList getValidExchangableProducts() {
        return this.validExchangableProducts;
    }

    public ArrayList getValidReturnableProducts() {
        return this.validReturnableProducts;
    }

    public CartDeliveryAddress getWarehouseAddress() {
        return this.warehouseAddress;
    }

    public boolean isAccountNumberInvalid() {
        return this.isAccountNumberInvalid;
    }

    public boolean isAjioStoreCreditsSelected() {
        return this.isAjioStoreCreditsSelected;
    }

    public boolean isConfirmAccountNumberInvalid() {
        return this.isConfirmAccountNumberInvalid;
    }

    public boolean isDifferentAddressSelected() {
        return this.isDifferentAddressSelected;
    }

    public boolean isDisclaimerSelected() {
        return this.isDisclaimerSelected;
    }

    public boolean isIFSCCodeInvalid() {
        return this.isIFSCCodeInvalid;
    }

    public boolean isOtpVerificationRequired() {
        return this.otpVerificationRequired;
    }

    public boolean isRefundToBankSelected() {
        return this.isRefundToBankSelected;
    }

    public boolean isSameAddressSelected() {
        return this.isSameAddressSelected;
    }

    public boolean isSelfShip() {
        return this.isSelfShip;
    }

    public boolean isSelfShipReturn() {
        return this.selfShipReturn;
    }

    public boolean isStorePickUp() {
        return this.isStorePickUp;
    }

    public boolean isWarehouseAddressSelected() {
        return this.isWarehouseAddressSelected;
    }

    public void setAccountName(String string2) {
        this.accountName = string2;
    }

    public void setAccountNumber(String string2) {
        this.accountNumber = string2;
    }

    public void setAccountNumberInvalid(boolean bl2) {
        this.isAccountNumberInvalid = bl2;
    }

    public void setActionContent(ActionContent actionContent) {
        this.actionContent = actionContent;
    }

    public void setAffiliateData(AffiliateData affiliateData) {
        this.affiliateData = affiliateData;
    }

    public void setAjioStoreCreditsSelected(boolean bl2) {
        this.isAjioStoreCreditsSelected = bl2;
    }

    public void setCancelledQtyMap(ArrayList arrayList) {
        this.cancelledQtyMap = arrayList;
    }

    public void setConfirmAccountNumber(String string2) {
        this.confirmAccountNumber = string2;
    }

    public void setConfirmAccountNumberInvalid(boolean bl2) {
        this.isConfirmAccountNumberInvalid = bl2;
    }

    public void setConsignment(Consignment consignment) {
        this.consignment = consignment;
    }

    public void setConsignmentCode(String string2) {
        this.consignmentCode = string2;
    }

    public void setDefaultAddressId(String string2) {
        this.defaultAddressId = string2;
    }

    public void setDeliveryAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.deliveryAddress = cartDeliveryAddress;
    }

    public void setDifferentAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.differentAddress = cartDeliveryAddress;
    }

    public void setDifferentAddressSelected(boolean bl2) {
        this.isDifferentAddressSelected = bl2;
    }

    public void setDisclaimerSelected(boolean bl2) {
        this.isDisclaimerSelected = bl2;
    }

    public void setExchangeReasons(ArrayList arrayList) {
        this.exchangeReasons = arrayList;
    }

    public void setExchangeSubReasons(ArrayList arrayList) {
        this.exchangeSubReasons = arrayList;
    }

    public void setIFSCCodeInvalid(boolean bl2) {
        this.isIFSCCodeInvalid = bl2;
    }

    public void setIfscCode(String string2) {
        this.ifscCode = string2;
    }

    public void setMessages(ArrayList arrayList) {
        this.messages = arrayList;
    }

    public void setOrderCode(String string2) {
        this.orderCode = string2;
    }

    public void setOriginalOrderId(String string2) {
        this.originalOrderId = string2;
    }

    public void setProducts(ArrayList arrayList) {
        this.products = arrayList;
    }

    public void setRefundAmount(Float f5) {
        this.refundAmount = f5;
    }

    public void setRefundOptions(ArrayList arrayList) {
        this.refundOptions = arrayList;
    }

    public void setRefundToBankSelected(boolean bl2) {
        this.isRefundToBankSelected = bl2;
    }

    public void setReturnOrderEntryQtyMap(ArrayList arrayList) {
        this.returnOrderEntryQtyMap = arrayList;
    }

    public void setReturnQuickInfoUrl(String string2) {
        this.returnQuickInfoUrl = string2;
    }

    public void setReturnReasons(ArrayList arrayList) {
        this.returnReasons = arrayList;
    }

    public void setReturnSubReasons(ArrayList arrayList) {
        this.returnSubReasons = arrayList;
    }

    public void setReturnedQtyMap(ArrayList arrayList) {
        this.returnedQtyMap = arrayList;
    }

    public void setSameAddressSelected(boolean bl2) {
        this.isSameAddressSelected = bl2;
    }

    public void setSelectedControllerConfirmedList(ArrayList arrayList) {
        this.selectedControllerConfirmedList = arrayList;
    }

    public void setSelectedControllerList(ArrayList arrayList) {
        this.selectedControllerList = arrayList;
    }

    public void setSelectedList(HashMap hashMap) {
        this.selectedList = hashMap;
    }

    public void setSelectedRefundOption(String string2) {
        this.selectedRefundOption = string2;
    }

    public void setSelfShip(boolean bl2) {
        this.isSelfShip = bl2;
    }

    public void setSelfShipReturn(boolean bl2) {
        this.selfShipReturn = bl2;
    }

    public void setSelfshipCreditAmt(String string2) {
        this.selfshipCreditAmt = string2;
    }

    public void setStorePickUp(boolean bl2) {
        this.isStorePickUp = bl2;
    }

    public void setValidExchangableProducts(ArrayList arrayList) {
        this.validExchangableProducts = arrayList;
    }

    public void setValidReturnableProducts(ArrayList arrayList) {
        this.validReturnableProducts = arrayList;
    }

    public void setWarehouseAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.warehouseAddress = cartDeliveryAddress;
    }

    public void setWarehouseAddressSelected(boolean bl2) {
        this.isWarehouseAddressSelected = bl2;
    }
}

