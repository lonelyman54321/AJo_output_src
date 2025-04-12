/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.CMSProduct$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class CMSProduct$Companion {
    private CMSProduct$Companion() {
    }

    public /* synthetic */ CMSProduct$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return CMSProduct$$serializer.INSTANCE;
    }
}

