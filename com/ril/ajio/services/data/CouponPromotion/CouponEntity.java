/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CouponPromotion;

import com.ril.ajio.services.data.CouponPromotion.CouponInfo;
import java.io.Serializable;

public class CouponEntity
implements Serializable {
    String code;
    String couponCode;
    boolean couponUsed;
    String description;
    String detailsURL;
    CouponInfo enterpriseInfo;
    int eossVoucherValue;
    String imageUrl;
    boolean isSelected;
    String name;

    public String getCode() {
        return this.code;
    }

    public String getCouponCode() {
        return this.couponCode;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDetailsURL() {
        return this.detailsURL;
    }

    public CouponInfo getEnterpriseInfo() {
        return this.enterpriseInfo;
    }

    public int getEossVoucherValue() {
        return this.eossVoucherValue;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public boolean isCouponUsed() {
        return this.couponUsed;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setCouponCode(String string2) {
        this.couponCode = string2;
    }

    public void setCouponUsed(boolean bl2) {
        this.couponUsed = bl2;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setDetailsURL(String string2) {
        this.detailsURL = string2;
    }

    public void setEnterpriseInfo(CouponInfo couponInfo) {
        this.enterpriseInfo = couponInfo;
    }

    public void setEossVoucherValue(int n3) {
        this.eossVoucherValue = n3;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setSelected(boolean bl2) {
        this.isSelected = bl2;
    }
}

