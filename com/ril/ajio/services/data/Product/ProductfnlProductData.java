/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;

public final class ProductfnlProductData
implements Serializable {
    private Boolean codAllowed;
    private Boolean codDetailsHonoredWithFraud;
    private String planningCategory;
    private String productGroups;
    private Boolean returnDetailsHonoredWithFraud;
    private String trustMarkerTxt;

    public final Boolean getCodAllowed() {
        return this.codAllowed;
    }

    public final Boolean getCodDetailsHonoredWithFraud() {
        return this.codDetailsHonoredWithFraud;
    }

    public final String getPlanningCategory() {
        return this.planningCategory;
    }

    public final String getProductGroups() {
        return this.productGroups;
    }

    public final Boolean getReturnDetailsHonoredWithFraud() {
        return this.returnDetailsHonoredWithFraud;
    }

    public final String getTrustMarkerTxt() {
        return this.trustMarkerTxt;
    }

    public final void setCodAllowed(Boolean bl2) {
        this.codAllowed = bl2;
    }

    public final void setCodDetailsHonoredWithFraud(Boolean bl2) {
        this.codDetailsHonoredWithFraud = bl2;
    }

    public final void setPlanningCategory(String string2) {
        this.planningCategory = string2;
    }

    public final void setProductGroups(String string2) {
        this.productGroups = string2;
    }

    public final void setReturnDetailsHonoredWithFraud(Boolean bl2) {
        this.returnDetailsHonoredWithFraud = bl2;
    }

    public final void setTrustMarkerTxt(String string2) {
        this.trustMarkerTxt = string2;
    }
}

