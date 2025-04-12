/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.share;

import com.appsflyer.CreateOneLinkHttpTask$ResponseListener;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.LinkGenerator$ResponseListener;

final class LinkGenerator$2
implements LinkGenerator$ResponseListener {
    private /* synthetic */ CreateOneLinkHttpTask$ResponseListener AFAdRevenueData;
    private /* synthetic */ LinkGenerator getMediationNetwork;

    public LinkGenerator$2(LinkGenerator linkGenerator, CreateOneLinkHttpTask$ResponseListener createOneLinkHttpTask$ResponseListener) {
        this.getMediationNetwork = linkGenerator;
        this.AFAdRevenueData = createOneLinkHttpTask$ResponseListener;
    }

    public final void onResponse(String string2) {
        this.AFAdRevenueData.onResponse(string2);
    }

    public final void onResponseError(String string2) {
        this.AFAdRevenueData.onResponseError(string2);
    }
}

