/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order.orderhistory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderHistory
implements Serializable {
    private int currentPage;
    private String dataRangeResultKey = null;
    private boolean forwardOrderRevampFlowEnabled;
    private String operationalMessage;
    private List orderDateRange = null;
    private ArrayList orders = null;
    private int pageSize = -1;
    private boolean returnRevampNewFlowEnabled;
    private int totalOrders;
    private int totalPages;
    private int twoMonthsOrderCount;

    public int getCurrentPage() {
        return this.currentPage;
    }

    public String getDataRangeResultKey() {
        return this.dataRangeResultKey;
    }

    public boolean getForwardOrderRevampFlowEnabled() {
        return this.forwardOrderRevampFlowEnabled;
    }

    public String getOperationalMessage() {
        return this.operationalMessage;
    }

    public List getOrderDateRange() {
        return this.orderDateRange;
    }

    public ArrayList getOrders() {
        return this.orders;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public boolean getReturnRevampNewFlowEnabled() {
        return this.returnRevampNewFlowEnabled;
    }

    public int getTotalOrders() {
        return this.totalOrders;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getTwoMonthsOrderCount() {
        return this.twoMonthsOrderCount;
    }

    public void setCurrentPage(int n3) {
        this.currentPage = n3;
    }

    public void setDataRangeResultKey(String string2) {
        this.dataRangeResultKey = string2;
    }

    public void setOrderDateRange(List list) {
        this.orderDateRange = list;
    }

    public void setOrders(ArrayList arrayList) {
        this.orders = arrayList;
    }

    public void setPageSize(int n3) {
        this.pageSize = n3;
    }

    public void setReturnRevampNewFlowEnabled(boolean bl2) {
        this.returnRevampNewFlowEnabled = bl2;
    }

    public void setTotalOrders(int n3) {
        this.totalOrders = n3;
    }

    public void setTotalPages(int n3) {
        this.totalPages = n3;
    }

    public void setTwoMonthsOrderCount(int n3) {
        this.twoMonthsOrderCount = n3;
    }
}

