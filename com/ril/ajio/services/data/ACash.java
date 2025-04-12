/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ACash
implements Serializable {
    private float active_points = 0.0f;
    private String cashDesc;
    private float cash_non_transferable = 0.0f;
    private float cash_transferable;
    private float expiring_1 = 0.0f;
    private String expiring_1_date;
    private float expiring_2 = 0.0f;
    private String expiring_2_date;
    private String pendingPointInfo;
    private float pending_points = 0.0f;
    private String pointsDesc;
    private String tnc;
    private float totalWalletBalance;
    private float total_cash = 0.0f;

    public ACash() {
        String string2;
        this.expiring_1_date = string2 = "";
        this.expiring_2_date = string2;
        this.pendingPointInfo = string2;
        this.tnc = string2;
        this.cashDesc = string2;
        this.pointsDesc = string2;
    }

    public final float getActive_points() {
        return this.active_points;
    }

    public final String getCashDesc() {
        return this.cashDesc;
    }

    public final float getCash_non_transferable() {
        return this.cash_non_transferable;
    }

    public final float getCash_transferable() {
        return this.cash_transferable;
    }

    public final float getExpiring_1() {
        return this.expiring_1;
    }

    public final String getExpiring_1_date() {
        return this.expiring_1_date;
    }

    public final float getExpiring_2() {
        return this.expiring_2;
    }

    public final String getExpiring_2_date() {
        return this.expiring_2_date;
    }

    public final String getPendingPointInfo() {
        return this.pendingPointInfo;
    }

    public final float getPending_points() {
        return this.pending_points;
    }

    public final String getPointsDesc() {
        return this.pointsDesc;
    }

    public final String getTnc() {
        return this.tnc;
    }

    public final float getTotalWalletBalance() {
        return this.totalWalletBalance;
    }

    public final float getTotal_cash() {
        return this.total_cash;
    }

    public final void setActive_points(float f5) {
        this.active_points = f5;
    }

    public final void setCashDesc(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.cashDesc = string2;
    }

    public final void setCash_non_transferable(float f5) {
        this.cash_non_transferable = f5;
    }

    public final void setCash_transferable(float f5) {
        this.cash_transferable = f5;
    }

    public final void setExpiring_1(float f5) {
        this.expiring_1 = f5;
    }

    public final void setExpiring_1_date(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.expiring_1_date = string2;
    }

    public final void setExpiring_2(float f5) {
        this.expiring_2 = f5;
    }

    public final void setExpiring_2_date(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.expiring_2_date = string2;
    }

    public final void setPendingPointInfo(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.pendingPointInfo = string2;
    }

    public final void setPending_points(float f5) {
        this.pending_points = f5;
    }

    public final void setPointsDesc(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.pointsDesc = string2;
    }

    public final void setTnc(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.tnc = string2;
    }

    public final void setTotalWalletBalance(float f5) {
        this.totalWalletBalance = f5;
    }

    public final void setTotal_cash(float f5) {
        this.total_cash = f5;
    }
}

