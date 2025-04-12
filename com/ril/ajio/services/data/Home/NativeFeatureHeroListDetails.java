/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;
import java.util.ArrayList;

public class NativeFeatureHeroListDetails
implements Serializable {
    private ArrayList categoryTextLinkDetails;
    private ArrayList imageDetails;
    private boolean isEcommerceEventPushed;

    public ArrayList getCategoryTextLinkDetails() {
        return this.categoryTextLinkDetails;
    }

    public ArrayList getImageDetails() {
        return this.imageDetails;
    }

    public boolean isEcommerceEventPushed() {
        return this.isEcommerceEventPushed;
    }

    public void setCategoryTextLinkDetails(ArrayList arrayList) {
        this.categoryTextLinkDetails = arrayList;
    }

    public void setEcommerceEventPushed(boolean bl2) {
        this.isEcommerceEventPushed = bl2;
    }

    public void setImageDetails(ArrayList arrayList) {
        this.imageDetails = arrayList;
    }
}

