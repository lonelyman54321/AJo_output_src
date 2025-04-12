/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Component$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class Component$Companion {
    private Component$Companion() {
    }

    public /* synthetic */ Component$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return Component$$serializer.INSTANCE;
    }
}

