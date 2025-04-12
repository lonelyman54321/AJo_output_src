/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.deeplink.DeeplinkClickRepository;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.BooleanPropertyProvider;
import kotlin.jvm.internal.Intrinsics;

public final class DeeplinkClickPropertyProvider
extends BooleanPropertyProvider {
    private final DeeplinkClickRepository deeplinkClickRepository;
    private final ProviderType key;
    private final float order;

    public DeeplinkClickPropertyProvider(DeeplinkClickRepository object) {
        Intrinsics.checkNotNullParameter(object, "deeplinkClickRepository");
        this.deeplinkClickRepository = object;
        this.order = 25.0f;
        object = ProviderType.DEEPLINK_CLICK;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Boolean provide() {
        return this.deeplinkClickRepository.isDeeplinkClick();
    }
}

