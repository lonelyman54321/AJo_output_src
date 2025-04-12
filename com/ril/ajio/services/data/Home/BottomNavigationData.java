/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationNode;
import com.ril.ajio.services.data.Home.Status;

public class BottomNavigationData {
    private String allowedCustomerState;
    private String allowedCustomerType;
    private String application;
    private NavigationDataClass data;
    private NavigationNode navigationNode;
    private Status status;
    private int timeOut;
    private String typeCode;
    private boolean visible;

    public String getAllowedCustomerState() {
        return this.allowedCustomerState;
    }

    public String getAllowedCustomerType() {
        return this.allowedCustomerType;
    }

    public String getApplication() {
        return this.application;
    }

    public NavigationDataClass getData() {
        return this.data;
    }

    public NavigationNode getNavigationNode() {
        return this.navigationNode;
    }

    public Status getStatus() {
        return this.status;
    }

    public int getTimeOut() {
        return this.timeOut;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setAllowedCustomerState(String string2) {
        this.allowedCustomerState = string2;
    }

    public void setAllowedCustomerType(String string2) {
        this.allowedCustomerType = string2;
    }

    public void setApplication(String string2) {
        this.application = string2;
    }

    public void setData(NavigationDataClass navigationDataClass) {
        this.data = navigationDataClass;
    }

    public void setNavigationNode(NavigationNode navigationNode) {
        this.navigationNode = navigationNode;
    }

    public void setTimeOut(int n3) {
        this.timeOut = n3;
    }

    public void setTypeCode(String string2) {
        this.typeCode = string2;
    }

    public void setVisible(boolean bl2) {
        this.visible = bl2;
    }
}

