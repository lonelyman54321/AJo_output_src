/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange.dropatstore;

import com.ril.ajio.services.data.returnexchange.dropatstore.StoreAddress;
import java.io.Serializable;

public class StoreNode
implements Serializable {
    private boolean isCodAvailable;
    private boolean isServiceAble;
    private String lowerEddDate;
    private boolean refundByCash;
    private StoreAddress storeAddress;
    private String storeName;
    private String storeNodeID;
    private String storeTime;
    private String upperEddDate;

    public String getLowerEddDate() {
        return this.lowerEddDate;
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

    public String getUpperEddDate() {
        return this.upperEddDate;
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

    public void setLowerEddDate(String string2) {
        this.lowerEddDate = string2;
    }

    public void setRefundByCash(boolean bl2) {
        this.refundByCash = bl2;
    }

    public void setServiceAble(boolean bl2) {
        this.isServiceAble = bl2;
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

    public void setUpperEddDate(String string2) {
        this.upperEddDate = string2;
    }
}

