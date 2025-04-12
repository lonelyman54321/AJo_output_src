/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CouponPromotion;

import java.io.Serializable;
import java.util.ArrayList;

public class CouponPromotion
implements Serializable {
    ArrayList availableCoupons;
    String balancePoints;
    String eossPoints;
    ArrayList myCoupons;
    String saleEndTime;
    String saleStartTime;
    String serverTime;

    public CouponPromotion() {
        ArrayList arrayList;
        this.availableCoupons = arrayList = new ArrayList();
        this.myCoupons = arrayList = new ArrayList();
    }

    public ArrayList getAvailableCoupons() {
        return this.availableCoupons;
    }

    public String getBalancePoints() {
        return this.balancePoints;
    }

    public String getEossPoints() {
        return this.eossPoints;
    }

    public ArrayList getMyCoupons() {
        return this.myCoupons;
    }

    public String getSaleEndTime() {
        return this.saleEndTime;
    }

    public String getSaleStartTime() {
        return this.saleStartTime;
    }

    public String getServerTime() {
        return this.serverTime;
    }

    public void setAvailableCoupons(ArrayList arrayList) {
        this.availableCoupons = arrayList;
    }

    public void setBalancePoints(String string2) {
        this.balancePoints = string2;
    }

    public void setEossPoints(String string2) {
        this.eossPoints = string2;
    }

    public void setMyCoupons(ArrayList arrayList) {
        this.myCoupons = arrayList;
    }

    public void setSaleEndTime(String string2) {
        this.saleEndTime = string2;
    }

    public void setSaleStartTime(String string2) {
        this.saleStartTime = string2;
    }

    public void setServerTime(String string2) {
        this.serverTime = string2;
    }
}

