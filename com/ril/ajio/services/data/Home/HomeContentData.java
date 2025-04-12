/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.util.ArrayList;

public class HomeContentData {
    private boolean fromNetwork;
    private ArrayList pageDetails;
    private boolean status;

    public ArrayList getPageDetails() {
        return this.pageDetails;
    }

    public boolean isFromNetwork() {
        return this.fromNetwork;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setFromNetwork(boolean bl2) {
        this.fromNetwork = bl2;
    }

    public void setPageDetails(ArrayList arrayList) {
        this.pageDetails = arrayList;
    }

    public void setStatus(boolean bl2) {
        this.status = bl2;
    }
}

