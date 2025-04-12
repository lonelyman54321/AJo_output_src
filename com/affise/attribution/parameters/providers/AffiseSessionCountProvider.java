/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import com.affise.attribution.session.SessionManager;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseSessionCountProvider
extends LongPropertyProvider {
    private final ProviderType key;
    private final float order;
    private final SessionManager sessionManager;

    public AffiseSessionCountProvider(SessionManager object) {
        Intrinsics.checkNotNullParameter(object, "sessionManager");
        this.sessionManager = object;
        this.order = 56.0f;
        object = ProviderType.AFFISE_SESSION_COUNT;
        this.key = object;
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        long l2;
        SessionManager sessionManager2 = this.sessionManager;
        long l3 = sessionManager2.getSessionCount();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l3 = 1L;
        }
        return l3;
    }
}

