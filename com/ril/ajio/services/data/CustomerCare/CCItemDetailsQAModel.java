/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.util.List;

public class CCItemDetailsQAModel {
    private boolean isLuxuryOrder;
    private List quickLinksList;

    public List getQuickLinksList() {
        return this.quickLinksList;
    }

    public boolean isLuxuryOrder() {
        return this.isLuxuryOrder;
    }

    public void setLuxuryOrder(boolean bl2) {
        this.isLuxuryOrder = bl2;
    }
}

