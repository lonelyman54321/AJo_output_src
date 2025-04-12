/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$GoogleAnalyticsParameters;

public final class DynamicLink$GoogleAnalyticsParameters$Builder {
    private final Bundle parameters;

    public DynamicLink$GoogleAnalyticsParameters$Builder() {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
    }

    public DynamicLink$GoogleAnalyticsParameters$Builder(String string2, String string3, String string4) {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
        bundle.putString("utm_source", string2);
        bundle.putString("utm_medium", string3);
        bundle.putString("utm_campaign", string4);
    }

    public DynamicLink$GoogleAnalyticsParameters build() {
        Bundle bundle = this.parameters;
        DynamicLink$GoogleAnalyticsParameters dynamicLink$GoogleAnalyticsParameters = new DynamicLink$GoogleAnalyticsParameters(bundle, null);
        return dynamicLink$GoogleAnalyticsParameters;
    }

    public String getCampaign() {
        return this.parameters.getString("utm_campaign", "");
    }

    public String getContent() {
        return this.parameters.getString("utm_content", "");
    }

    public String getMedium() {
        return this.parameters.getString("utm_medium", "");
    }

    public String getSource() {
        return this.parameters.getString("utm_source", "");
    }

    public String getTerm() {
        return this.parameters.getString("utm_term", "");
    }

    public DynamicLink$GoogleAnalyticsParameters$Builder setCampaign(String string2) {
        this.parameters.putString("utm_campaign", string2);
        return this;
    }

    public DynamicLink$GoogleAnalyticsParameters$Builder setContent(String string2) {
        this.parameters.putString("utm_content", string2);
        return this;
    }

    public DynamicLink$GoogleAnalyticsParameters$Builder setMedium(String string2) {
        this.parameters.putString("utm_medium", string2);
        return this;
    }

    public DynamicLink$GoogleAnalyticsParameters$Builder setSource(String string2) {
        this.parameters.putString("utm_source", string2);
        return this;
    }

    public DynamicLink$GoogleAnalyticsParameters$Builder setTerm(String string2) {
        this.parameters.putString("utm_term", string2);
        return this;
    }
}

