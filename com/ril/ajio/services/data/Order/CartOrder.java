/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartDeliveryMode;
import com.ril.ajio.services.data.Cart.CartPaymentInfo;
import com.ril.ajio.services.data.Order.AjioCashEarnedPoint;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import com.ril.ajio.services.data.user.AffiliateData;
import com.ril.ajio.services.data.user.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartOrder
implements Serializable,
CartAndOrder {
    public AffiliateData affiliateData;
    private AjioCashEarnedPoint ajioCashEarnedAmt;
    private ArrayList appliedOrderPromotions;
    private ArrayList appliedProductPromotions;
    private List appliedVouchers;
    private Price bagDiscount;
    private Price bagTotalAmount;
    private Price balanceAmount;
    private String balancedPaidModeVia;
    private Price bankOfferAmt;
    private Price bundleDiscountAmt;
    private Boolean calculated;
    private ArrayList cancelledEntries;
    private String cartOrderReturnFee;
    private String code;
    private ArrayList confirmedEntries;
    private ArrayList consignments;
    private ArrayList consignmentsData;
    private ConvenienceFeePriceSplitUp convenienceFee;
    private String created;
    private Price creditsUsedAmount;
    private CartDeliveryAddress deliveryAddress;
    private Price deliveryCost;
    private Integer deliveryItemsQuantity;
    private CartDeliveryMode deliveryMode;
    private String deliveryModeValue;
    private ArrayList deliveryOrderGroups;
    private ArrayList entries;
    private String estimatedDeliveryDate;
    private Price exclusiveGST;
    private Price giftWrapCharges;
    private Boolean guestCustomer;
    private String guid;
    private boolean isCancelable;
    private boolean isConvenienceFeeEnabled;
    private String isConvenienceFeeRefundable;
    private boolean isExchangeOrder;
    private float loyaltyBurnedPoints;
    private float loyaltyEarnedPoints;
    private TotalPrice luxeTotalPrice;
    private Boolean net;
    private String newOrderStatus;
    private String newStatus;
    private String newStatusDisplay;
    public ArrayList optedPaymentModeOrderList;
    private String orderCreatedDate;
    private Price orderDiscounts;
    private String orderStatus;
    private ArrayList orderTracking;
    private String originalOrderId;
    private String paymentCode;
    private CartPaymentInfo paymentInfo;
    private String paymentMode;
    private boolean paymentSuccessful;
    private Integer pickupItemsQuantity;
    private String placed;
    private ArrayList potentialProductPromotions;
    private Price productDiscounts;
    private Price promotionAmount;
    public ArrayList ratings;
    private String rcsPaymentStatus;
    private double redeemedMahaCachBack;
    private Price relianceOneAmount;
    private Price relianceOneEarnedAmount;
    private boolean retryPayment;
    private Double returnFee;
    private String returnInfoUrl;
    private String returnQuickInfoUrl;
    private boolean returnRevampNewFlowEnabled;
    private ArrayList returnTrackingMap;
    private String site;
    private String status;
    private String statusDisplay;
    private String store;
    private Price subTotal;
    private Price taaraBurnedAmount;
    private Price taaraEarnedAmount;
    private String thresholdDate;
    private float totalBag;
    private Price totalDiscounts;
    private Integer totalItems;
    private Price totalPrice;
    private Price totalPriceWithTax;
    private Price totalSaving;
    private float totalSavings;
    private Price totalTax;
    private int totalUnitCount;
    private String type;
    private ArrayList unconsignedEntries;
    private User user;
    private Price voucherAmount;

    public CartOrder() {
        ArrayList arrayList;
        this.deliveryOrderGroups = arrayList = new ArrayList();
        this.isExchangeOrder = false;
        this.isConvenienceFeeEnabled = false;
        this.retryPayment = false;
    }

    public AffiliateData getAffiliateData() {
        return this.affiliateData;
    }

    public AjioCashEarnedPoint getAjioCashEarnedAmt() {
        return this.ajioCashEarnedAmt;
    }

    public ArrayList getAppliedOrderPromotions() {
        return this.appliedOrderPromotions;
    }

    public ArrayList getAppliedProductPromotions() {
        return this.appliedProductPromotions;
    }

    public List getAppliedVouchers() {
        return this.appliedVouchers;
    }

    public Price getBagDiscount() {
        return this.bagDiscount;
    }

    public Price getBagTotalAmount() {
        return this.bagTotalAmount;
    }

    public Price getBalanceAmount() {
        return this.balanceAmount;
    }

    public String getBalancedPaidModeVia() {
        return this.balancedPaidModeVia;
    }

    public Price getBankOfferAmt() {
        return this.bankOfferAmt;
    }

    public Price getBundleDiscountAmt() {
        return this.bundleDiscountAmt;
    }

    public Boolean getCalculated() {
        return this.calculated;
    }

    public ArrayList getCancelledEntries() {
        return this.cancelledEntries;
    }

    public String getCartOrderReturnFee() {
        return this.cartOrderReturnFee;
    }

    public String getCode() {
        return this.code;
    }

    public ArrayList getConfirmedEntries() {
        return this.confirmedEntries;
    }

    public ArrayList getConsignments() {
        return this.consignments;
    }

    public ArrayList getConsignmentsData() {
        return this.consignmentsData;
    }

    public ConvenienceFeePriceSplitUp getConvenienceFee() {
        return this.convenienceFee;
    }

    public String getCreated() {
        return this.created;
    }

    public Price getCreditsUsedAmount() {
        return this.creditsUsedAmount;
    }

    public CartDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public Price getDeliveryCost() {
        return this.deliveryCost;
    }

    public Integer getDeliveryItemsQuantity() {
        return this.deliveryItemsQuantity;
    }

    public CartDeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    public String getDeliveryModeValue() {
        return this.deliveryModeValue;
    }

    public ArrayList getDeliveryOrderGroups() {
        return this.deliveryOrderGroups;
    }

    public ArrayList getEntries() {
        return this.entries;
    }

    public String getEstimatedDeliveryDate() {
        return this.estimatedDeliveryDate;
    }

    public Price getExclusiveGST() {
        return this.exclusiveGST;
    }

    public Price getGiftWrapCharges() {
        return this.giftWrapCharges;
    }

    public Boolean getGuestCustomer() {
        return this.guestCustomer;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getIsConvenienceFeeRefundable() {
        return this.isConvenienceFeeRefundable;
    }

    public float getLoyaltyBurnedPoints() {
        return this.loyaltyBurnedPoints;
    }

    public float getLoyaltyEarnedPoints() {
        return this.loyaltyEarnedPoints;
    }

    public TotalPrice getLuxeTotalPrice() {
        return this.luxeTotalPrice;
    }

    public Boolean getNet() {
        return this.net;
    }

    public String getNewOrderStatus() {
        return this.newOrderStatus;
    }

    public String getNewStatus() {
        return this.newStatus;
    }

    public String getNewStatusDisplay() {
        return this.newStatusDisplay;
    }

    public ArrayList getOptedPaymentModeOrderList() {
        return this.optedPaymentModeOrderList;
    }

    public String getOrderCreatedDate() {
        return this.orderCreatedDate;
    }

    public Price getOrderDiscounts() {
        return this.orderDiscounts;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ArrayList getOrderTracking() {
        return this.orderTracking;
    }

    public String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public String getPaymentCode() {
        return this.paymentCode;
    }

    public CartPaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public Integer getPickupItemsQuantity() {
        return this.pickupItemsQuantity;
    }

    public String getPlaced() {
        return this.placed;
    }

    public ArrayList getPotentialProductPromotions() {
        return this.potentialProductPromotions;
    }

    public Price getProductDiscounts() {
        return this.productDiscounts;
    }

    public Price getPromotionAmount() {
        return this.promotionAmount;
    }

    public ArrayList getRatings() {
        return this.ratings;
    }

    public String getRcsPaymentStatus() {
        return this.rcsPaymentStatus;
    }

    public double getRedeemedMahaCachBack() {
        return this.redeemedMahaCachBack;
    }

    public Price getRelianceOneAmount() {
        return this.relianceOneAmount;
    }

    public Price getRelianceOneEarnedAmount() {
        return this.relianceOneEarnedAmount;
    }

    public Double getReturnFee() {
        return this.returnFee;
    }

    public String getReturnInfoUrl() {
        return this.returnInfoUrl;
    }

    public String getReturnQuickInfoUrl() {
        return this.returnQuickInfoUrl;
    }

    public ArrayList getReturnTrackingMap() {
        return this.returnTrackingMap;
    }

    public String getSite() {
        return this.site;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusDisplay() {
        return this.statusDisplay;
    }

    public String getStore() {
        return this.store;
    }

    public Price getSubTotal() {
        return this.subTotal;
    }

    public Price getTaaraBurnedAmount() {
        return this.taaraBurnedAmount;
    }

    public Price getTaaraEarnedAmount() {
        return this.taaraEarnedAmount;
    }

    public String getThresholdDate() {
        return this.thresholdDate;
    }

    public float getTotalBag() {
        return this.totalBag;
    }

    public float getTotalBagSaving() {
        return this.totalSavings;
    }

    public Price getTotalDiscounts() {
        return this.totalDiscounts;
    }

    public Integer getTotalItems() {
        return this.totalItems;
    }

    public Price getTotalPrice() {
        return this.totalPrice;
    }

    public Price getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    public Price getTotalSaving() {
        return this.totalSaving;
    }

    public Price getTotalTax() {
        return this.totalTax;
    }

    public int getTotalUnitCount() {
        return this.totalUnitCount;
    }

    public String getType() {
        return this.type;
    }

    public ArrayList getUnconsignedEntries() {
        return this.unconsignedEntries;
    }

    public User getUser() {
        return this.user;
    }

    public Price getVoucherAmount() {
        return this.voucherAmount;
    }

    public boolean isCancelable() {
        return this.isCancelable;
    }

    public boolean isConvenienceFeeEnabled() {
        return this.isConvenienceFeeEnabled;
    }

    public boolean isExchangeOrder() {
        return this.isExchangeOrder;
    }

    public boolean isPaymentSuccessful() {
        return this.paymentSuccessful;
    }

    public boolean isRetryPayment() {
        return this.retryPayment;
    }

    public boolean isReturnRevampNewFlowEnabled() {
        return this.returnRevampNewFlowEnabled;
    }

    public void setAffiliateData(AffiliateData affiliateData) {
        this.affiliateData = affiliateData;
    }

    public void setAjioCashEarnedAmt(AjioCashEarnedPoint ajioCashEarnedPoint) {
        this.ajioCashEarnedAmt = ajioCashEarnedPoint;
    }

    public void setAppliedOrderPromotions(ArrayList arrayList) {
        this.appliedOrderPromotions = arrayList;
    }

    public void setAppliedProductPromotions(ArrayList arrayList) {
        this.appliedProductPromotions = arrayList;
    }

    public void setAppliedVouchers(ArrayList arrayList) {
        this.appliedVouchers = arrayList;
    }

    public void setBagDiscount(Price price) {
        this.bagDiscount = price;
    }

    public void setBagTotalAmount(Price price) {
        this.bagTotalAmount = price;
    }

    public void setBalanceAmount(Price price) {
        this.balanceAmount = price;
    }

    public void setBalancedPaidModeVia(String string2) {
        this.balancedPaidModeVia = string2;
    }

    public void setBankOfferAmt(Price price) {
        this.bankOfferAmt = price;
    }

    public void setBundleDiscountAmt(Price price) {
        this.bundleDiscountAmt = price;
    }

    public void setCalculated(Boolean bl2) {
        this.calculated = bl2;
    }

    public void setCancelable(boolean bl2) {
        this.isCancelable = bl2;
    }

    public void setCartOrderReturnFee(String string2) {
        this.cartOrderReturnFee = string2;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setConsignments(ArrayList arrayList) {
        this.consignments = arrayList;
    }

    public void setConvenienceFee(ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp) {
        this.convenienceFee = convenienceFeePriceSplitUp;
    }

    public void setConvenienceFeeEnabled(boolean bl2) {
        this.isConvenienceFeeEnabled = bl2;
    }

    public void setCreated(String string2) {
        this.created = string2;
    }

    public void setCreditsUsedAmount(Price price) {
        this.creditsUsedAmount = price;
    }

    public void setDeliveryAddress(CartDeliveryAddress cartDeliveryAddress) {
        this.deliveryAddress = cartDeliveryAddress;
    }

    public void setDeliveryCost(Price price) {
        this.deliveryCost = price;
    }

    public void setDeliveryItemsQuantity(Integer n3) {
        this.deliveryItemsQuantity = n3;
    }

    public void setDeliveryMode(CartDeliveryMode cartDeliveryMode) {
        this.deliveryMode = cartDeliveryMode;
    }

    public void setDeliveryModeValue(String string2) {
        this.deliveryModeValue = string2;
    }

    public void setDeliveryOrderGroups(ArrayList arrayList) {
        this.deliveryOrderGroups = arrayList;
    }

    public void setEntries(ArrayList arrayList) {
        this.entries = arrayList;
    }

    public void setEstimatedDeliveryDate(String string2) {
        this.estimatedDeliveryDate = string2;
    }

    public void setExclusiveGST(Price price) {
        this.exclusiveGST = price;
    }

    public void setGiftWrapCharges(Price price) {
        this.giftWrapCharges = price;
    }

    public void setGuestCustomer(Boolean bl2) {
        this.guestCustomer = bl2;
    }

    public void setGuid(String string2) {
        this.guid = string2;
    }

    public void setIsConvenienceFeeRefundable(String string2) {
        this.isConvenienceFeeRefundable = string2;
    }

    public void setLoyaltyBurnedPoints(float f5) {
        this.loyaltyBurnedPoints = f5;
    }

    public void setLoyaltyEarnedPoints(float f5) {
        this.loyaltyEarnedPoints = f5;
    }

    public void setLuxeTotalPrice(TotalPrice totalPrice) {
        this.luxeTotalPrice = totalPrice;
    }

    public void setNet(Boolean bl2) {
        this.net = bl2;
    }

    public void setNewOrderStatus(String string2) {
        this.newOrderStatus = string2;
    }

    public void setNewStatus(String string2) {
        this.newStatus = string2;
    }

    public void setNewStatusDisplay(String string2) {
        this.newStatusDisplay = string2;
    }

    public void setOptedPaymentModeOrderList(ArrayList arrayList) {
        this.optedPaymentModeOrderList = arrayList;
    }

    public void setOrderCreatedDate(String string2) {
        this.orderCreatedDate = string2;
    }

    public void setOrderDiscounts(Price price) {
        this.orderDiscounts = price;
    }

    public void setOrderStatus(String string2) {
        this.orderStatus = string2;
    }

    public void setOrderTracking(ArrayList arrayList) {
        this.orderTracking = arrayList;
    }

    public void setOriginalOrderId(String string2) {
        this.originalOrderId = string2;
    }

    public void setPaymentCode(String string2) {
        this.paymentCode = string2;
    }

    public void setPaymentInfo(CartPaymentInfo cartPaymentInfo) {
        this.paymentInfo = cartPaymentInfo;
    }

    public void setPaymentMode(String string2) {
        this.paymentMode = string2;
    }

    public void setPickupItemsQuantity(Integer n3) {
        this.pickupItemsQuantity = n3;
    }

    public void setPlaced(String string2) {
        this.placed = string2;
    }

    public void setPotentialProductPromotions(ArrayList arrayList) {
        this.potentialProductPromotions = arrayList;
    }

    public void setProductDiscounts(Price price) {
        this.productDiscounts = price;
    }

    public void setPromotionAmount(Price price) {
        this.promotionAmount = price;
    }

    public void setRatings(ArrayList arrayList) {
        this.ratings = arrayList;
    }

    public void setRcsPaymentStatus(String string2) {
        this.rcsPaymentStatus = string2;
    }

    public void setRedeemedMahaCachBack(double d2) {
        this.redeemedMahaCachBack = d2;
    }

    public void setRelianceOneAmount(Price price) {
        this.relianceOneAmount = price;
    }

    public void setRelianceOneEarnedAmount(Price price) {
        this.relianceOneEarnedAmount = price;
    }

    public void setReturnFee(Double d2) {
        this.returnFee = d2;
    }

    public void setReturnRevampNewFlowEnabled(boolean bl2) {
        this.returnRevampNewFlowEnabled = bl2;
    }

    public void setReturnTrackingMap(ArrayList arrayList) {
        this.returnTrackingMap = arrayList;
    }

    public void setSite(String string2) {
        this.site = string2;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }

    public void setStatusDisplay(String string2) {
        this.statusDisplay = string2;
    }

    public void setStore(String string2) {
        this.store = string2;
    }

    public void setSubTotal(Price price) {
        this.subTotal = price;
    }

    public void setTaaraBurnedAmount(Price price) {
        this.taaraBurnedAmount = price;
    }

    public void setTaaraEarnedAmount(Price price) {
        this.taaraEarnedAmount = price;
    }

    public void setThresholdDate(String string2) {
        this.thresholdDate = string2;
    }

    public void setTotalBag(float f5) {
        this.totalBag = f5;
    }

    public void setTotalBagSaving(float f5) {
        this.totalSavings = f5;
    }

    public void setTotalDiscounts(Price price) {
        this.totalDiscounts = price;
    }

    public void setTotalItems(Integer n3) {
        this.totalItems = n3;
    }

    public void setTotalPrice(Price price) {
        this.totalPrice = price;
    }

    public void setTotalPriceWithTax(Price price) {
        this.totalPriceWithTax = price;
    }

    public void setTotalSaving(Price price) {
        this.totalSaving = price;
    }

    public void setTotalTax(Price price) {
        this.totalTax = price;
    }

    public void setType(String string2) {
        this.type = string2;
    }

    public void setUnconsignedEntries(ArrayList arrayList) {
        this.unconsignedEntries = arrayList;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVoucherAmount(Price price) {
        this.voucherAmount = price;
    }
}

