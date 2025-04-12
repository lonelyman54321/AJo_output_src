/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import com.ril.ajio.services.data.Order.BankDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QueryIntitateRequestReturn
implements Serializable {
    private BankDetails bankDetails;
    private String consignmentCode;
    private String deliveryAddress;
    private String isDefaultAddress;
    private String orderCode;
    private ArrayList returnData;
    private String selectedRefundOption;
    private String selfShip;
    private Boolean skipRCS;
    private Boolean useNT;

    public QueryIntitateRequestReturn() {
        Boolean bl2;
        this.useNT = bl2 = Boolean.FALSE;
        this.skipRCS = bl2;
    }

    public QueryIntitateRequestReturn(Parcel parcel) {
        Object object = Boolean.FALSE;
        this.useNT = object;
        this.skipRCS = object;
        this.deliveryAddress = object = parcel.readString();
        this.isDefaultAddress = object = parcel.readString();
        this.consignmentCode = object = parcel.readString();
        this.orderCode = object = parcel.readString();
        this.selfShip = object = parcel.readString();
        object = this.returnData;
        ClassLoader classLoader = this.getClass().getClassLoader();
        parcel.readList((List)object, classLoader);
    }

    public BankDetails getBankDetails() {
        return this.bankDetails;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public ArrayList getReturnData() {
        return this.returnData;
    }

    public String getSelectedRefundOption() {
        return this.selectedRefundOption;
    }

    public Boolean getSkipRCS() {
        return this.skipRCS;
    }

    public Boolean getUseNT() {
        return this.useNT;
    }

    public String isConsignmentCode() {
        return this.consignmentCode;
    }

    public String isDefaultAddress() {
        return this.isDefaultAddress;
    }

    public String isSelfShip() {
        return this.selfShip;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public void setConsignmentCode(String string2) {
        this.consignmentCode = string2;
    }

    public void setDefaultAddress(String string2) {
        this.isDefaultAddress = string2;
    }

    public void setDeliveryAddress(String string2) {
        this.deliveryAddress = string2;
    }

    public void setOrderCode(String string2) {
        this.orderCode = string2;
    }

    public void setReturnData(ArrayList arrayList) {
        this.returnData = arrayList;
    }

    public void setSelectedRefundOption(String string2) {
        this.selectedRefundOption = string2;
    }

    public void setSelfShip(String string2) {
        this.selfShip = string2;
    }

    public void setSkipRCS(Boolean bl2) {
        this.skipRCS = bl2;
    }

    public void setUseNT(Boolean bl2) {
        this.useNT = bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("QueryIntitateRequestReturn{deliveryAddress='");
        Object object = this.deliveryAddress;
        stringBuilder.append((String)object);
        stringBuilder.append("', isDefaultAddress='");
        object = this.isDefaultAddress;
        stringBuilder.append((String)object);
        stringBuilder.append("', consignmentCode='");
        object = this.consignmentCode;
        stringBuilder.append((String)object);
        stringBuilder.append("', orderCode='");
        object = this.orderCode;
        stringBuilder.append((String)object);
        stringBuilder.append("', selfShip='");
        object = this.selfShip;
        stringBuilder.append((String)object);
        stringBuilder.append("', returnData=");
        object = this.returnData;
        stringBuilder.append(object);
        stringBuilder.append(", bankDetails=");
        object = this.bankDetails;
        stringBuilder.append(object);
        stringBuilder.append(", selectedRefundOption='");
        object = this.selectedRefundOption;
        return h30_0.a(stringBuilder, (String)object, "'}");
    }
}

