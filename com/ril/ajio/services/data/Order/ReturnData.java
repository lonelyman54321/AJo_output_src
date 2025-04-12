/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import java.util.ArrayList;

public class ReturnData
implements Serializable {
    private String commentBox;
    private String ean;
    private String exchange;
    private ArrayList imageDetails = null;
    private String istagavailable;
    private String productCode;
    private boolean productTag;
    private String reason;
    private String returnQty;
    private String selectedArticleNumber;
    private String size;
    private String subReason;

    public String getCommentBox() {
        String string2 = this.commentBox;
        if (string2 == null) {
            this.commentBox = string2 = "";
        }
        return this.commentBox;
    }

    public String getEan() {
        return this.ean;
    }

    public String getExchange() {
        return this.exchange;
    }

    public ArrayList getImageDetails() {
        return this.imageDetails;
    }

    public String getIsTagAvailable() {
        return this.istagavailable;
    }

    public String getIstagavailable() {
        return this.istagavailable;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getReason() {
        return this.reason;
    }

    public String getReturnQty() {
        return this.returnQty;
    }

    public String getSelectedArticleNumber() {
        return this.selectedArticleNumber;
    }

    public String getSize() {
        return this.size;
    }

    public String getSubReason() {
        return this.subReason;
    }

    public boolean isProductTag() {
        return this.productTag;
    }

    public void setCommentBox(String string2) {
        this.commentBox = string2;
    }

    public void setEan(String string2) {
        this.ean = string2;
    }

    public void setExchange(String string2) {
        this.exchange = string2;
    }

    public void setImageDetails(ArrayList arrayList) {
        this.imageDetails = arrayList;
    }

    public void setIsTagAvailable(String string2) {
        this.istagavailable = string2;
    }

    public void setIstagavailable(String string2) {
        this.istagavailable = string2;
    }

    public void setProductCode(String string2) {
        this.productCode = string2;
    }

    public void setProductTag(boolean bl2) {
        this.productTag = bl2;
    }

    public void setReason(String string2) {
        this.reason = string2;
    }

    public void setReturnQty(String string2) {
        this.returnQty = string2;
    }

    public void setSelectedArticleNumber(String string2) {
        this.selectedArticleNumber = string2;
    }

    public void setSize(String string2) {
        this.size = string2;
    }

    public void setSubReason(String string2) {
        this.subReason = string2;
    }
}

