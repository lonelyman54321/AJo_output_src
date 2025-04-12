/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart.pickfromstore;

import com.ril.ajio.services.data.Cart.pickfromstore.StoreAddress;
import java.io.Serializable;

public class StoreNode
implements Serializable {
    private long eddTimeDiff;
    private String estimateDeliveryDate;
    private boolean isCodAvailable;
    private boolean isServiceAble;
    private int nsCount;
    private int oosCount;
    private boolean refundByCash;
    private int serviceableCount = 0;
    private StoreAddress storeAddress;
    private String storeName;
    private String storeNodeID;
    private String storeTime;
    private int totalCount;

    public long getEddTimeDiff() {
        return this.eddTimeDiff;
    }

    public String getEstimateDeliveryDate() {
        return this.estimateDeliveryDate;
    }

    public int getNsCount() {
        return this.nsCount;
    }

    public int getOosCount() {
        return this.oosCount;
    }

    public int getServiceableCount() {
        return this.serviceableCount;
    }

    public StoreAddress getStoreAddress() {
        return this.storeAddress;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreNodeID() {
        return this.storeNodeID;
    }

    public String getStoreTime() {
        return this.storeTime;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean isCodAvailable() {
        return this.isCodAvailable;
    }

    public boolean isRefundByCash() {
        return this.refundByCash;
    }

    public boolean isServiceAble() {
        return this.isServiceAble;
    }

    public void setCodAvailable(boolean bl2) {
        this.isCodAvailable = bl2;
    }

    public void setEddTimeDiff(long l2) {
        this.eddTimeDiff = l2;
    }

    public void setEstimateDeliveryDate(String string2) {
        this.estimateDeliveryDate = string2;
    }

    public void setNsCount(int n3) {
        this.nsCount = n3;
    }

    public void setOosCount(int n3) {
        this.oosCount = n3;
    }

    public void setRefundByCash(boolean bl2) {
        this.refundByCash = bl2;
    }

    public void setServiceAble(boolean bl2) {
        this.isServiceAble = bl2;
    }

    public void setServiceableCount(int n3) {
        this.serviceableCount = n3;
    }

    public void setStoreAddress(StoreAddress storeAddress) {
        this.storeAddress = storeAddress;
    }

    public void setStoreName(String string2) {
        this.storeName = string2;
    }

    public void setStoreNodeID(String string2) {
        this.storeNodeID = string2;
    }

    public void setStoreTime(String string2) {
        this.storeTime = string2;
    }

    public void setTotalCount(int n3) {
        this.totalCount = n3;
    }
}

