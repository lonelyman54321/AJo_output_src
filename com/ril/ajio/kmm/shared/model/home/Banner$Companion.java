/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Banner$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class Banner$Companion {
    private Banner$Companion() {
    }

    public /* synthetic */ Banner$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return Banner$$serializer.INSTANCE;
    }
}

