/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.deeplink.DeeplinkClickRepository;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class DeeplinkProvider
extends StringPropertyProvider {
    private final DeeplinkClickRepository deeplinkClickRepository;
    private final ProviderType key;
    private final float order;

    public DeeplinkProvider(DeeplinkClickRepository object) {
        Intrinsics.checkNotNullParameter(object, "deeplinkClickRepository");
        this.deeplinkClickRepository = object;
        this.order = 58.0f;
        object = ProviderType.AFFISE_DEEPLINK;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        Object object = this.deeplinkClickRepository.getDeeplink();
        if (object == null) {
            object = this.getDefaultValue();
        }
        return object;
    }
}

