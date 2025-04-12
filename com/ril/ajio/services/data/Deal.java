/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Deal$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Deal
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Long actualDealStartTime;
    private String dealCode;
    private Long dealEndTime;
    private Double dealPercentage;
    private Double dealPrice;
    private String dealType;
    private boolean isDealEnabled;
    private boolean isSoldOut;
    private Long premiumDealStartTime;

    static {
        Deal$Creator deal$Creator = new Deal$Creator();
        CREATOR = deal$Creator;
    }

    public final int describeContents() {
        return 0;
    }

    public final Long getActualDealStartTime() {
        return this.actualDealStartTime;
    }

    public final String getDealCode() {
        return this.dealCode;
    }

    public final Long getDealEndTime() {
        return this.dealEndTime;
    }

    public final Double getDealPercentage() {
        return this.dealPercentage;
    }

    public final Double getDealPrice() {
        return this.dealPrice;
    }

    public final String getDealType() {
        return this.dealType;
    }

    public final Long getPremiumDealStartTime() {
        return this.premiumDealStartTime;
    }

    public final boolean isDealEnabled() {
        return this.isDealEnabled;
    }

    public final boolean isSoldOut() {
        return this.isSoldOut;
    }

    public final void setActualDealStartTime(Long l2) {
        this.actualDealStartTime = l2;
    }

    public final void setDealCode(String string2) {
        this.dealCode = string2;
    }

    public final void setDealEnabled(boolean bl2) {
        this.isDealEnabled = bl2;
    }

    public final void setDealEndTime(Long l2) {
        this.dealEndTime = l2;
    }

    public final void setDealPercentage(Double d2) {
        this.dealPercentage = d2;
    }

    public final void setDealPrice(Double d2) {
        this.dealPrice = d2;
    }

    public final void setDealType(String string2) {
        this.dealType = string2;
    }

    public final void setPremiumDealStartTime(Long l2) {
        this.premiumDealStartTime = l2;
    }

    public final void setSoldOut(boolean bl2) {
        this.isSoldOut = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}

