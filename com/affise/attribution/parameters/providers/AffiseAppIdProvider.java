/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseAppIdProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final InitPropertiesStorage storage;

    public AffiseAppIdProvider(InitPropertiesStorage object) {
        Intrinsics.checkNotNullParameter(object, "storage");
        this.storage = object;
        this.order = 1.0f;
        object = ProviderType.AFFISE_APP_ID;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        Object object = this.storage.getProperties();
        object = object != null ? ((AffiseInitProperties)object).getAffiseAppId() : null;
        return object;
    }
}

