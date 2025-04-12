/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

public final class zzb
implements ComponentFactory {
    public final Object create(ComponentContainer componentContainer) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(componentContainer);
    }
}

