/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class PointsBalance$Companion {
    private PointsBalance$Companion() {
    }

    public /* synthetic */ PointsBalance$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return PointsBalance$$serializer.INSTANCE;
    }
}

