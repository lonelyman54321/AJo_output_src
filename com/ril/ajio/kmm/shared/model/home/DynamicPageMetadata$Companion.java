/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class DynamicPageMetadata$Companion {
    private DynamicPageMetadata$Companion() {
    }

    public /* synthetic */ DynamicPageMetadata$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return DynamicPageMetadata$$serializer.INSTANCE;
    }
}

