/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartPromotionDetail
implements Serializable {
    private String code;
    private List couldFireMessages;
    private String description;
    private String detailsURL;
    private String endDate;
    private List firedMessages;
    private String promotionType;
    private String termsLink;

    public CartPromotionDetail() {
        ArrayList arrayList;
        this.firedMessages = arrayList = new ArrayList();
        this.couldFireMessages = arrayList = new ArrayList();
    }

    public String getCode() {
        return this.code;
    }

    public List getCouldFireMessages() {
        return this.couldFireMessages;
    }

    public List getCouldFiredMessages() {
        return this.couldFireMessages;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDetailsURL() {
        return this.detailsURL;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public List getFiredMessages() {
        return this.firedMessages;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public String getTermsLink() {
        return this.termsLink;
    }

    public void setCode(String string2) {
        this.code = string2;
    }

    public void setCouldFireMessages(List list) {
        this.couldFireMessages = list;
    }

    public void setCouldFiredMessages(List list) {
        this.couldFireMessages = list;
    }

    public void setDescription(String string2) {
        this.description = string2;
    }

    public void setDetailsURL(String string2) {
        this.detailsURL = string2;
    }

    public void setEndDate(String string2) {
        this.endDate = string2;
    }

    public void setFiredMessages(List list) {
        this.firedMessages = list;
    }

    public void setPromotionType(String string2) {
        this.promotionType = string2;
    }

    public void setTermsLink(String string2) {
        this.termsLink = string2;
    }
}

