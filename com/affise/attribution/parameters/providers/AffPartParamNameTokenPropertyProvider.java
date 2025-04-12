/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class AffPartParamNameTokenPropertyProvider
extends StringPropertyProvider {
    private final InitPropertiesStorage initProperties;
    private final ProviderType key;
    private final float order;

    public AffPartParamNameTokenPropertyProvider(InitPropertiesStorage object) {
        Intrinsics.checkNotNullParameter(object, "initProperties");
        this.initProperties = object;
        this.order = 60.0f;
        object = ProviderType.AFFISE_PART_PARAM_NAME_TOKEN;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        Object object = this.initProperties.getProperties();
        object = object != null ? ((AffiseInitProperties)object).getPartParamNameToken() : null;
        return object;
    }
}

