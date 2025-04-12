/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.services.data.Cart.CartAndOrder;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartDeliveryMode;
import com.ril.ajio.services.data.Cart.CartInventory;
import com.ril.ajio.services.data.Cart.CartLimitError;
import com.ril.ajio.services.data.Cart.CartPaymentInfo;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartServiceError;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import com.ril.ajio.services.data.Cart.CouponNudgeData;
import com.ril.ajio.services.data.Cart.NetPrice;
import com.ril.ajio.services.data.Cart.Pancard;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Cart.pickfromstore.Status;
import com.ril.ajio.services.data.Price;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart
extends DataError
implements Serializable,
CartAndOrder {
    private ProfileHealth PROFILE_HEALTH;
    private String age;
    private ArrayList appliedProductPromotions;
    private List appliedVouchers;
    private Price bagDiscount;
    private float bagTotal;
    private Price bagTotalAmount;
    private Price balanceAmount;
    private Price bundleDiscountAmt;
    private boolean calculated;
    private CartInventory cartInventory;
    private CartLimitError cartValueLimit;
    private CartLimitError cartValueLimitNew;
    private String code;
    private ConvenienceFee convenienceFee;
    private CouponNudgeData couponNudgeData;
    private Price creditsUsedAmount;
    private CartDeliveryAddress deliveryAddress;
    private Price deliveryCost;
    private int deliveryFeeThresholdAmount;
    private Integer deliveryItemsQuantity;
    private CartDeliveryMode deliveryMode;
    private List deliveryOrderGroups;
    private boolean displayGiftWrapOption;
    private ArrayList entries;
    private Price exclusiveGST;
    private String freeDeliveryBannerUrl;
    private boolean freeGiftApplicable;
    private String freeGiftTermsLink;
    private String freeGiftTermsName;
    private String giftRecepientName;
    private Price giftWrapCharges;
    private String guid;
    private ArrayList gwpGiftEntries;
    private ArrayList internalWalletAmountList;
    private ArrayList internalWallets;
    private ArrayList lowStockCartEntries;
    private float loyaltyBurnedPoints;
    private float loyaltyEarnedPoints;
    private String loyaltyPointsInfo;
    private ArrayList mergedCartEntries;
    private Float multipleWalletEnabledAmount;
    private String multipleWalletEnabledAmountMessage;
    private boolean net;
    private Float netPayable;
    private NetPrice netPrice;
    private ArrayList oosAndPartlyStockedproducts;
    private ArrayList oosCartEntries;
    private Price orderDiscounts;
    private boolean otpValidationRequired;
    private Pancard pancard;
    private CartPaymentInfo paymentInfo;
    private String paymentMode;
    private int pickupItemsQuantity;
    private String pinCode;
    private ArrayList potentialProductPromotions;
    private String priorityDeliveryAlertMessage;
    private Price productDiscounts;
    private Price promotionAmount;
    private int quantity;
    private String refreshChecksum;
    private ArrayList restoredProducts;
    private ProfileHealth rvpReturnFee;
    private CartServiceError serviceError;
    private String site;
    private Status stockStatus;
    private String store;
    private Price subTotal;
    private long subTotalId;
    private float totalBagSaving;
    private Price totalDiscounts;
    private int totalItems;
    private Price totalPrice;
    private long totalPriceId;
    private Price totalPriceWithTax;
    private Price totalSaving;
    private Price totalTax;
    private int totalUnitCount;
    private Price voucherAmount;
    private String voucherValidationMessage;

    public Cart() {
        ArrayList arrayList = new ArrayList();
        this.deliveryOrderGroups = arrayList;
        arrayList = new ArrayList();
        this.mergedCartEntries = arrayList;
        arrayList = new ArrayList();
        this.oosCartEntries = arrayList;
        arrayList = Float.valueOf(0.0f);
        this.multipleWalletEnabledAmount = arrayList;
        this.multipleWalletEnabledAmountMessage = null;
        this.internalWalletAmountList = null;
        this.lowStockCartEntries = arrayList = new ArrayList();
        this.entries = arrayList = new ArrayList();
    }

    public static String generatePromotionString(CartPromotion cartPromotion) {
        return cartPromotion.getDescription();
    }

    public String getAge() {
        return this.age;
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

    public float getBagTotal() {
        return this.bagTotal;
    }

    public Price getBagTotalAmount() {
        return this.bagTotalAmount;
    }

    public Price getBalanceAmount() {
        return this.balanceAmount;
    }

    public Price getBundleDiscountAmt() {
        return this.bundleDiscountAmt;
    }

    public CartInventory getCartInventory() {
        return this.cartInventory;
    }

    public CartLimitError getCartValueLimit() {
        return this.cartValueLimit;
    }

    public CartLimitError getCartValueLimitNew() {
        return this.cartValueLimitNew;
    }

    public String getCode() {
        return this.code;
    }

    public ConvenienceFee getConvenienceFee() {
        return this.convenienceFee;
    }

    public CouponNudgeData getCouponNudgeData() {
        return this.couponNudgeData;
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

    public int getDeliveryFeeThresholdAmount() {
        return this.deliveryFeeThresholdAmount;
    }

    public Integer getDeliveryItemsQuantity() {
        return this.deliveryItemsQuantity;
    }

    public CartDeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    public List getDeliveryOrderGroups() {
        return this.deliveryOrderGroups;
    }

    public ArrayList getEntries() {
        return this.entries;
    }

    public Price getExclusiveGST() {
        return this.exclusiveGST;
    }

    public String getFreeDeliveryBannerUrl() {
        return this.freeDeliveryBannerUrl;
    }

    public String getFreeGiftTermsLink() {
        return this.freeGiftTermsLink;
    }

    public String getFreeGiftTermsName() {
        return this.freeGiftTermsName;
    }

    public String getGiftRecepientName() {
        return this.giftRecepientName;
    }

    public Price getGiftWrapCharges() {
        return this.giftWrapCharges;
    }

    public String getGuid() {
        return this.guid;
    }

    public ArrayList getGwpGiftEntries() {
        return this.gwpGiftEntries;
    }

    public ArrayList getInternalWalletAmountList() {
        return this.internalWalletAmountList;
    }

    public ArrayList getInternalWallets() {
        return this.internalWallets;
    }

    public ArrayList getLowStockCartEntries() {
        return this.lowStockCartEntries;
    }

    public float getLoyaltyBurnedPoints() {
        return this.loyaltyBurnedPoints;
    }

    public float getLoyaltyEarnedPoints() {
        return this.loyaltyEarnedPoints;
    }

    public String getLoyaltyPointsInfo() {
        return this.loyaltyPointsInfo;
    }

    public ArrayList getMergedCartEntries() {
        return this.mergedCartEntries;
    }

    public Float getMultipleWalletEnabledAmount() {
        return this.multipleWalletEnabledAmount;
    }

    public String getMultipleWalletEnabledAmountMessage() {
        return this.multipleWalletEnabledAmountMessage;
    }

    public Float getNetPayable() {
        return this.netPayable;
    }

    public NetPrice getNetPrice() {
        return this.netPrice;
    }

    public ArrayList getOosAndPartlyStockedproducts() {
        return this.oosAndPartlyStockedproducts;
    }

    public ArrayList getOosCartEntries() {
        return this.oosCartEntries;
    }

    public Price getOrderDiscounts() {
        return this.orderDiscounts;
    }

    public ProfileHealth getPROFILE_HEALTH() {
        return this.PROFILE_HEALTH;
    }

    public Pancard getPancard() {
        return this.pancard;
    }

    public CartPaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public int getPickupItemsQuantity() {
        return this.pickupItemsQuantity;
    }

    public String getPinCode() {
        return this.pinCode;
    }

    public ArrayList getPotentialProductPromotions() {
        return this.potentialProductPromotions;
    }

    public String getPriorityDeliveryAlertMessage() {
        return this.priorityDeliveryAlertMessage;
    }

    public Price getProductDiscounts() {
        return this.productDiscounts;
    }

    public Price getPromotionAmount() {
        return this.promotionAmount;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getRefreshChecksum() {
        return this.refreshChecksum;
    }

    public ArrayList getRestoredProducts() {
        return this.restoredProducts;
    }

    public ProfileHealth getRvpReturnFee() {
        return this.rvpReturnFee;
    }

    public CartServiceError getServiceError() {
        return this.serviceError;
    }

    public String getSite() {
        return this.site;
    }

    public Status getStockStatus() {
        return this.stockStatus;
    }

    public String getStore() {
        return this.store;
    }

    public Price getSubTotal() {
        return this.subTotal;
    }

    public long getSubTotalId() {
        return this.subTotalId;
    }

    public float getTotalBagSaving() {
        return this.totalBagSaving;
    }

    public Price getTotalDiscounts() {
        return this.totalDiscounts;
    }

    public int getTotalItems() {
        return this.totalItems;
    }

    public Price getTotalPrice() {
        return this.totalPrice;
    }

    public long getTotalPriceId() {
        return this.totalPriceId;
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

    public Price getVoucherAmount() {
        return this.voucherAmount;
    }

    public String getVoucherValidationMessage() {
        return this.voucherValidationMessage;
    }

    public boolean isCalculated() {
        return this.calculated;
    }

    public boolean isDisplayGiftWrapOption() {
        return this.displayGiftWrapOption;
    }

    public boolean isFreeGiftApplicable() {
        return this.freeGiftApplicable;
    }

    public boolean isNet() {
        return this.net;
    }

    public boolean isOtpValidationRequired() {
        return this.otpValidationRequired;
    }

    public void resetEntries() {
        this.entries = null;
    }

    public void setAge(String string2) {
        this.age = string2;
    }

    public void setAppliedProductPromotions(ArrayList arrayList) {
        this.appliedProductPromotions = arrayList;
    }

    public void setAppliedVouchers(List list) {
        this.appliedVouchers = list;
    }

    public void setBagDiscount(Price price) {
        this.bagDiscount = price;
    }

    public void setBagTotal(float f5) {
        this.bagTotal = f5;
    }

    public void setBagTotalAmount(Price price) {
        this.bagTotalAmount = price;
    }

    public void setBalanceAmount(Price price) {
        this.balanceAmount = price;
    }

    public void setBundleDiscountAmt(Price price) {
        this.bundleDiscountAmt = price;
    }

    public void setCalculated(boolean bl2) {
        this.calculated = bl2;
    }

    public void setCartInventory(CartInventory cartInventory) {
        this.cartInventory = cartInventory;
    }

    public void setCartValueLimit(CartLimitError cartLimitError) {
        this.cartValueLimit = cartLimitError;
    }

    public void setCartValueLimitNew(CartLimitError cartLimitError) {
        this.cartValueLimitNew = cartLimitError;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setCouponNudgeData(CouponNudgeData couponNudgeData) {
        this.couponNudgeData = couponNudgeData;
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

    public void setDeliveryOrderGroups(List list) {
        this.deliveryOrderGroups = list;
    }

    public void setDisplayGiftWrapOption(boolean bl2) {
        this.displayGiftWrapOption = bl2;
    }

    public void setEntries(ArrayList arrayList) {
        this.entries = arrayList;
    }

    public void setExclusiveGST(Price price) {
        this.exclusiveGST = price;
    }

    public void setFreeDeliveryBannerUrl(String string2) {
        this.freeDeliveryBannerUrl = string2;
    }

    public void setFreeGiftApplicable(boolean bl2) {
        this.freeGiftApplicable = bl2;
    }

    public void setFreeGiftTermsLink(String string2) {
        this.freeGiftTermsLink = string2;
    }

    public void setFreeGiftTermsName(String string2) {
        this.freeGiftTermsName = string2;
    }

    public void setGiftRecepientName(String string2) {
        this.giftRecepientName = string2;
    }

    public void setGiftWrapCharges() {
        Price price;
        this.giftWrapCharges = price = this.giftWrapCharges;
    }

    public void setGiftWrapCharges(Price price) {
        this.giftWrapCharges = price;
    }

    public void setGuid(String string2) {
        this.guid = string2;
    }

    public void setGwpGiftEntries(ArrayList arrayList) {
        this.gwpGiftEntries = arrayList;
    }

    public void setInternalWalletAmountList(ArrayList arrayList) {
        this.internalWalletAmountList = arrayList;
    }

    public void setInternalWallets(ArrayList arrayList) {
        this.internalWallets = arrayList;
    }

    public void setLowStockCartEntries(ArrayList arrayList) {
        this.lowStockCartEntries = arrayList;
    }

    public void setLoyaltyBurnedPoints(float f5) {
        this.loyaltyBurnedPoints = f5;
    }

    public void setLoyaltyEarnedPoints(float f5) {
        this.loyaltyEarnedPoints = f5;
    }

    public void setLoyaltyPointsInfo(String string2) {
        this.loyaltyPointsInfo = string2;
    }

    public void setMergedCartEntries(ArrayList arrayList) {
        this.mergedCartEntries = arrayList;
    }

    public void setMultipleWalletEnabledAmount(Float f5) {
        this.multipleWalletEnabledAmount = f5;
    }

    public void setMultipleWalletEnabledAmountMessage(String string2) {
        this.multipleWalletEnabledAmountMessage = string2;
    }

    public void setNet(boolean bl2) {
        this.net = bl2;
    }

    public void setNetPayable(Float f5) {
        this.netPayable = f5;
    }

    public void setNetPrice(NetPrice netPrice) {
        this.netPrice = netPrice;
    }

    public void setOosAndPartlyStockedproducts(ArrayList arrayList) {
        this.oosAndPartlyStockedproducts = arrayList;
    }

    public void setOosCartEntries(ArrayList arrayList) {
        this.oosCartEntries = arrayList;
    }

    public void setOrderDiscounts(Price price) {
        this.orderDiscounts = price;
    }

    public void setOtpValidationRequired(boolean bl2) {
        this.otpValidationRequired = bl2;
    }

    public void setPROFILE_HEALTH(ProfileHealth profileHealth) {
        this.PROFILE_HEALTH = profileHealth;
    }

    public void setPancard(Pancard pancard) {
        this.pancard = pancard;
    }

    public void setPaymentInfo(CartPaymentInfo cartPaymentInfo) {
        this.paymentInfo = cartPaymentInfo;
    }

    public void setPaymentMode(String string2) {
        this.paymentMode = string2;
    }

    public void setPickupItemsQuantity(int n3) {
        this.pickupItemsQuantity = n3;
    }

    public void setPinCode(String string2) {
        this.pinCode = string2;
    }

    public void setPotentialProductPromotions(ArrayList arrayList) {
        this.potentialProductPromotions = arrayList;
    }

    public void setPriorityDeliveryAlertMessage(String string2) {
        this.priorityDeliveryAlertMessage = string2;
    }

    public void setProductDiscounts(Price price) {
        this.productDiscounts = price;
    }

    public void setPromotionAmount(Price price) {
        this.promotionAmount = price;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }

    public void setRefreshChecksum(String string2) {
        this.refreshChecksum = string2;
    }

    public void setRestoredProducts(ArrayList arrayList) {
        this.restoredProducts = arrayList;
    }

    public void setRvpReturnFee(ProfileHealth profileHealth) {
        this.rvpReturnFee = profileHealth;
    }

    public void setServiceError(CartServiceError cartServiceError) {
        this.serviceError = cartServiceError;
    }

    public void setSite(String string2) {
        this.site = string2;
    }

    public void setStockStatus(Status status) {
        this.stockStatus = status;
    }

    public void setStore(String string2) {
        this.store = string2;
    }

    public void setSubTotal(Price price) {
        this.subTotal = price;
    }

    public void setSubTotalId(long l2) {
        this.subTotalId = l2;
    }

    public void setTotalBag(float f5) {
        this.bagTotal = f5;
    }

    public void setTotalBagSaving(float f5) {
        this.totalBagSaving = f5;
    }

    public void setTotalDiscounts(Price price) {
        this.totalDiscounts = price;
    }

    public void setTotalItems(int n3) {
        this.totalItems = n3;
    }

    public void setTotalPrice(Price price) {
        this.totalPrice = price;
    }

    public void setTotalPriceId(long l2) {
        this.totalPriceId = l2;
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

    public void setTotalUnitCount(int n3) {
        this.totalUnitCount = n3;
    }

    public void setVoucherAmount(Price price) {
        this.voucherAmount = price;
    }

    public void setVoucherValidationMessage(String string2) {
        this.voucherValidationMessage = string2;
    }
}

