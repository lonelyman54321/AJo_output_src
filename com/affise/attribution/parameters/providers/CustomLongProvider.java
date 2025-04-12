/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CustomLongProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final Function0 provide;

    public CustomLongProvider(ProviderType providerType, float f5, Function0 function0) {
        Intrinsics.checkNotNullParameter((Object)providerType, "key");
        this.key = providerType;
        this.order = f5;
        this.provide = function0;
    }

    public /* synthetic */ CustomLongProvider(ProviderType providerType, float f5, Function0 function0, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 4) != 0) {
            function0 = null;
        }
        this(providerType, f5, function0);
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        Object object = this.provide;
        object = object != null ? (Long)object.invoke() : null;
        return object;
    }
}

