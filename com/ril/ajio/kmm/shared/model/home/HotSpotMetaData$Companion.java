/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class HotSpotMetaData$Companion {
    private HotSpotMetaData$Companion() {
    }

    public /* synthetic */ HotSpotMetaData$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return HotSpotMetaData$$serializer.INSTANCE;
    }
}

