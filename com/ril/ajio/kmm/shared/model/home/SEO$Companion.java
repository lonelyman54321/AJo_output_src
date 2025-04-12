/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.SEO$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class SEO$Companion {
    private SEO$Companion() {
    }

    public /* synthetic */ SEO$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return SEO$$serializer.INSTANCE;
    }
}

