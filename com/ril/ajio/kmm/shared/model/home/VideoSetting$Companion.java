/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.VideoSetting$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

public final class VideoSetting$Companion {
    private VideoSetting$Companion() {
    }

    public /* synthetic */ VideoSetting$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final KSerializer serializer() {
        return VideoSetting$$serializer.INSTANCE;
    }
}

