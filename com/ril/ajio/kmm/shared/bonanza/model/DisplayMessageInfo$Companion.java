/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class DisplayMessageInfo$Companion {
    private DisplayMessageInfo$Companion() {
    }

    public /* synthetic */ DisplayMessageInfo$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return DisplayMessageInfo$$serializer.INSTANCE;
    }
}

