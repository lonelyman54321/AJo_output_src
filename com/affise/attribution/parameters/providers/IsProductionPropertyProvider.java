/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import com.affise.attribution.parameters.providers.IsProductionPropertyProvider$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class IsProductionPropertyProvider
extends StringPropertyProvider {
    public static final IsProductionPropertyProvider$Companion Companion;
    public static final String TYPE_PRODUCTION = "Production";
    public static final String TYPE_SANDBOX = "Sandbox";
    private final InitPropertiesStorage initProperties;
    private final ProviderType key;
    private final float order;

    static {
        IsProductionPropertyProvider$Companion isProductionPropertyProvider$Companion;
        Companion = isProductionPropertyProvider$Companion = new IsProductionPropertyProvider$Companion(null);
    }

    public IsProductionPropertyProvider(InitPropertiesStorage object) {
        Intrinsics.checkNotNullParameter(object, "initProperties");
        this.initProperties = object;
        this.order = 50.0f;
        object = ProviderType.AFFISE_SDK_POS;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        boolean bl2;
        boolean bl3;
        Object object = this.initProperties.getProperties();
        object = object != null && (bl3 = ((AffiseInitProperties)object).isProduction()) == (bl2 = true) ? TYPE_PRODUCTION : TYPE_SANDBOX;
        return object;
    }
}

