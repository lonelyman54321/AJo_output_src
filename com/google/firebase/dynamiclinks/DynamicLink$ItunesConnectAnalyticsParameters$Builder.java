/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$ItunesConnectAnalyticsParameters;

public final class DynamicLink$ItunesConnectAnalyticsParameters$Builder {
    private final Bundle parameters;

    public DynamicLink$ItunesConnectAnalyticsParameters$Builder() {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
    }

    public DynamicLink$ItunesConnectAnalyticsParameters build() {
        Bundle bundle = this.parameters;
        DynamicLink$ItunesConnectAnalyticsParameters dynamicLink$ItunesConnectAnalyticsParameters = new DynamicLink$ItunesConnectAnalyticsParameters(bundle, null);
        return dynamicLink$ItunesConnectAnalyticsParameters;
    }

    public String getAffiliateToken() {
        return this.parameters.getString("at", "");
    }

    public String getCampaignToken() {
        return this.parameters.getString("ct", "");
    }

    public String getProviderToken() {
        return this.parameters.getString("pt", "");
    }

    public DynamicLink$ItunesConnectAnalyticsParameters$Builder setAffiliateToken(String string2) {
        this.parameters.putString("at", string2);
        return this;
    }

    public DynamicLink$ItunesConnectAnalyticsParameters$Builder setCampaignToken(String string2) {
        this.parameters.putString("ct", string2);
        return this;
    }

    public DynamicLink$ItunesConnectAnalyticsParameters$Builder setProviderToken(String string2) {
        this.parameters.putString("pt", string2);
        return this;
    }
}

