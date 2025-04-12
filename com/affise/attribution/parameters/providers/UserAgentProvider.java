/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;

public final class UserAgentProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public UserAgentProvider() {
        ProviderType providerType;
        this.order = 35.0f;
        this.key = providerType = ProviderType.USER_AGENT;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        return System.getProperty("http.agent");
    }
}

