/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.Status$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class Status$Companion {
    private Status$Companion() {
    }

    public /* synthetic */ Status$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return Status$$serializer.INSTANCE;
    }
}

