/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.StatusInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class StatusInfo$Companion {
    private StatusInfo$Companion() {
    }

    public /* synthetic */ StatusInfo$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return (KSerializer)StatusInfo.access$get$cachedSerializer$delegate$cp().getValue();
    }

    public final KSerializer serializer() {
        return this.get$cachedSerializer();
    }
}

