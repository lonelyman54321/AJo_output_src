/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.Status;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AjioCash
implements Serializable {
    private List extraResponseParams;
    private List moneys;
    private Status status;
    private List topExpiringPoints;

    public AjioCash() {
        ArrayList arrayList;
        this.moneys = arrayList = new ArrayList();
        this.topExpiringPoints = arrayList = new ArrayList();
    }

    public List getExtraResponseParams() {
        return this.extraResponseParams;
    }

    public List getMoney() {
        return this.moneys;
    }

    public Status getStatus() {
        return this.status;
    }

    public List getTopExpiringPoints() {
        return this.topExpiringPoints;
    }

    public void setExtraResponseParams(List list) {
        this.extraResponseParams = list;
    }

    public void setMoney(List list) {
        this.moneys = list;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTopExpiringPoints(List list) {
        this.topExpiringPoints = list;
    }
}

