/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.session.SessionManager;
import kotlin.jvm.internal.Intrinsics;

public final class LifetimeSessionCountProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final SessionManager sessionManager;

    public LifetimeSessionCountProvider(SessionManager object) {
        Intrinsics.checkNotNullParameter(object, "sessionManager");
        this.sessionManager = object;
        this.order = 57.0f;
        object = ProviderType.LIFETIME_SESSION_COUNT;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        return this.sessionManager.getLifetimeSessionTime();
    }
}

