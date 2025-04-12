/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class RemoteConfigKt$configUpdates$1$1
extends Lambda
implements Function0 {
    final /* synthetic */ ConfigUpdateListenerRegistration $registration;

    public RemoteConfigKt$configUpdates$1$1(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
        this.$registration = configUpdateListenerRegistration;
        super(0);
    }

    public final void invoke() {
        this.$registration.remove();
    }
}

