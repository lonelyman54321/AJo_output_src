/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Order.orderhistory;

import android.text.TextUtils;
import com.ril.ajio.services.entity.Component;
import java.io.Serializable;
import java.util.ArrayList;

public class OrderItemLine
implements Serializable {
    private Component bannerComponent;
    private String baseProductId;
    private String brandName;
    private String carrier;
    private String color;
    private String consignmentId;
    private String containerNumber;
    private String containerScm;
    private String deliveryMethod;
    private float discount;
    private String displayStatus;
    private String eddLowerRange;
    private String eddUpperRange;
    private long epochEddUpper;
    private long epochPSD;
    private String estimatedPickupDate;
    private float estimatedRefundAmount;
    private String estimatedRefundDate;
    private String exchangeOrderId;
    private Integer giftProducts;
    private String imageUrl;
    private ArrayList imageUrlList;
    private String impsFailureRefundText;
    private Boolean isImpsFailed;
    private Boolean isPriorityDeliveryApplied;
    private String itemId;
    private float listPrice;
    private String newDisplayStatus;
    private String newStatus;
    private String newStatusDescription;
    private String newStatusLongDescription;
    private String orderDate;
    private String orderId;
    private int orderItemLineId;
    private String orderLevelType;
    private String orderType;
    private int pagenumber;
    private String paymentMode;
    private String promisedDeliveryDate;
    private String promisedShippingDate;
    private int quantity;
    private Float rating;
    private float refundAmount;
    private float refundTotal;
    private float retailPrice;
    private String returnId;
    private float shippingCharge;
    private String status;
    private String statusDescription;
    private ArrayList statusHistory = null;
    private String statusLongDescription;
    private String title;
    private float totalAmount;
    private String trackingId;
    private float unitPrice;
    private int viewType;

    public Component getBannerComponent() {
        return this.bannerComponent;
    }

    public String getBaseProductId() {
        return this.baseProductId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getColor() {
        return this.color;
    }

    public String getConsignmentId() {
        return this.consignmentId;
    }

    public String getContainerNumber() {
        return this.containerNumber;
    }

    public String getContainerScm() {
        return this.containerScm;
    }

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public float getDiscount() {
        return this.discount;
    }

    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public String getEddLowerRange() {
        return this.eddLowerRange;
    }

    public String getEddUpperRange() {
        return this.eddUpperRange;
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

    public String getEstimatedPickupDate() {
        return this.estimatedPickupDate;
    }

    public float getEstimatedRefundAmount() {
        return this.estimatedRefundAmount;
    }

    public String getEstimatedRefundDate() {
        return this.estimatedRefundDate;
    }

    public String getExchangeOrderId() {
        return this.exchangeOrderId;
    }

    public Integer getGiftProducts() {
        return this.giftProducts;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public ArrayList getImageUrlList() {
        return this.imageUrlList;
    }

    public Boolean getImpsFailed() {
        return this.isImpsFailed;
    }

    public String getImpsFailureRefundText() {
        return this.impsFailureRefundText;
    }

    public String getItemId() {
        return this.itemId;
    }

    public float getListPrice() {
        return this.listPrice;
    }

    public String getNewDisplayStatus() {
        return this.newDisplayStatus;
    }

    public String getNewStatus() {
        return this.newStatus;
    }

    public String getNewStatusDescription() {
        String string2 = this.newStatusDescription;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            this.newStatusDescription = string2 = this.newStatusDescription.trim();
        }
        return this.newStatusDescription;
    }

    public String getNewStatusLongDescription() {
        return this.newStatusLongDescription;
    }

    public String getOrderDate() {
        return this.orderDate;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public int getOrderItemLineId() {
        return this.orderItemLineId;
    }

    public String getOrderLevelType() {
        return this.orderLevelType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public int getPagenumber() {
        return this.pagenumber;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public Boolean getPriorityDeliveryApplied() {
        return this.isPriorityDeliveryApplied;
    }

    public Float getProductRating() {
        return this.rating;
    }

    public String getPromisedDeliveryDate() {
        return this.promisedDeliveryDate;
    }

    public String getPromisedShippingDate() {
        return this.promisedShippingDate;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public float getRefundAmount() {
        return this.refundAmount;
    }

    public float getRefundTotal() {
        return this.refundTotal;
    }

    public float getRetailPrice() {
        return this.retailPrice;
    }

    public String getReturnId() {
        return this.returnId;
    }

    public float getShippingCharge() {
        return this.shippingCharge;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusDescription() {
        String string2 = this.statusDescription;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            this.statusDescription = string2 = this.statusDescription.trim();
        }
        return this.statusDescription;
    }

    public ArrayList getStatusHistory() {
        return this.statusHistory;
    }

    public String getStatusLongDescription() {
        return this.statusLongDescription;
    }

    public String getTitle() {
        return this.title;
    }

    public float getTotalAmount() {
        return this.totalAmount;
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public float getUnitPrice() {
        return this.unitPrice;
    }

    public int getViewType() {
        return this.viewType;
    }

    public void setBannerComponent(Component component) {
        this.bannerComponent = component;
    }

    public void setBaseProductId(String string2) {
        this.baseProductId = string2;
    }

    public void setBrandName(String string2) {
        this.brandName = string2;
    }

    public void setCarrier(String string2) {
        this.carrier = string2;
    }

    public void setColor(String string2) {
        this.color = string2;
    }

    public void setConsignmentId(String string2) {
        this.consignmentId = string2;
    }

    public void setContainerNumber(String string2) {
        this.containerNumber = string2;
    }

    public void setContainerScm(String string2) {
        this.containerScm = string2;
    }

    public void setDeliveryMethod(String string2) {
        this.deliveryMethod = string2;
    }

    public void setDiscount(float f5) {
        this.discount = f5;
    }

    public void setDisplayStatus(String string2) {
        this.displayStatus = string2;
    }

    public void setEddLowerRange(String string2) {
        this.eddLowerRange = string2;
    }

    public void setEddUpperRange(String string2) {
        this.eddUpperRange = string2;
    }

    public void setEpochEddUpper(long l2) {
        this.epochEddUpper = l2;
    }

    public void setEpochPSD(long l2) {
        this.epochPSD = l2;
    }

    public void setEstimatedPickupDate(String string2) {
        this.estimatedPickupDate = string2;
    }

    public void setEstimatedRefundAmount(float f5) {
        this.estimatedRefundAmount = f5;
    }

    public void setEstimatedRefundDate(String string2) {
        this.estimatedRefundDate = string2;
    }

    public void setGiftProducts(Integer n3) {
        this.giftProducts = n3;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setImageUrlList(ArrayList arrayList) {
        this.imageUrlList = arrayList;
    }

    public void setImpsFailed(Boolean bl2) {
        this.isImpsFailed = bl2;
    }

    public void setImpsFailureRefundText(String string2) {
        this.impsFailureRefundText = string2;
    }

    public void setItemId(String string2) {
        this.itemId = string2;
    }

    public void setListPrice(float f5) {
        this.listPrice = f5;
    }

    public void setNewDisplayStatus(String string2) {
        this.newDisplayStatus = string2;
    }

    public void setNewStatus(String string2) {
        this.newStatus = string2;
    }

    public void setNewStatusDescription(String string2) {
        this.newStatusDescription = string2;
    }

    public void setNewStatusLongDescription(String string2) {
        this.newStatusLongDescription = string2;
    }

    public void setOrderDate(String string2) {
        this.orderDate = string2;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setOrderItemLineId(int n3) {
        this.orderItemLineId = n3;
    }

    public void setOrderLevelType(String string2) {
        this.orderLevelType = string2;
    }

    public void setOrderType(String string2) {
        this.orderType = string2;
    }

    public void setPagenumber(int n3) {
        this.pagenumber = n3;
    }

    public void setPaymentMode(String string2) {
        this.paymentMode = string2;
    }

    public void setPriorityDeliveryApplied(Boolean bl2) {
        this.isPriorityDeliveryApplied = bl2;
    }

    public void setProductRating(Float f5) {
        this.rating = f5;
    }

    public void setPromisedDeliveryDate(String string2) {
        this.promisedDeliveryDate = string2;
    }

    public void setPromisedShippingDate(String string2) {
        this.promisedShippingDate = string2;
    }

    public void setQuantity(int n3) {
        this.quantity = n3;
    }

    public void setRefundAmount(float f5) {
        this.refundAmount = f5;
    }

    public void setRefundTotal(float f5) {
        this.refundTotal = f5;
    }

    public void setRetailPrice(float f5) {
        this.retailPrice = f5;
    }

    public void setReturnId(String string2) {
        this.returnId = string2;
    }

    public void setShippingCharge(float f5) {
        this.shippingCharge = f5;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }

    public void setStatusDescription(String string2) {
        this.statusDescription = string2;
    }

    public void setStatusHistory(ArrayList arrayList) {
        this.statusHistory = arrayList;
    }

    public void setStatusLongDescription(String string2) {
        this.statusLongDescription = string2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }

    public void setTotalAmount(float f5) {
        this.totalAmount = f5;
    }

    public void setTrackingId(String string2) {
        this.trackingId = string2;
    }

    public void setUnitPrice(float f5) {
        this.unitPrice = f5;
    }

    public void setViewType(int n3) {
        this.viewType = n3;
    }
}

